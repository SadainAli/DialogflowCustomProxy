package dialogflow_proxy.example.dialogflow_proxy.Manager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.parser.ParseException;

import com.google.api.gax.rpc.ApiException;
import com.google.gson.Gson;
import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.cloud.dialogflow.v2.DetectIntentResponse;
import com.google.cloud.dialogflow.v2.QueryResult;
import com.google.cloud.dialogflow.v2.Intent.Message;

import dialogflow_proxy.example.Model.BotErrorDetails;
import dialogflow_proxy.example.Model.BotExchangeResponse;
import dialogflow_proxy.example.Model.BotSessionState;
import dialogflow_proxy.example.Model.Intentinfo;
import dialogflow_proxy.example.Model.PromptDefinition;
import dialogflow_proxy.example.Model.VirtualAgentRequest;
import dialogflow_proxy.example.Model.BotExchangeResponse.BranchType;
import dialogflow_proxy.example.dialogflow_proxy.DialogflowClient;

public class EsManager {

    DialogflowClient dialogflowClient = new DialogflowClient();
    BotErrorDetails botErrorDetails = new BotErrorDetails();
    String error="";

    public String performBotExchange(VirtualAgentRequest actionRequest)
            throws ApiException, IOException, ParseException {
        BotExchangeResponse botResponse = new BotExchangeResponse();
        if (dialogflowClient.sessionsClient == null) {
            try {
                dialogflowClient.createSession();
            } catch (Exception ex) {
                botResponse = setError(error, botResponse);
            }
        }

        // BotExchange
        try {
            botResponse = initiateBotExchange(actionRequest);
        } catch (Exception ex) {
            botResponse = setError(error, botResponse);
        }
        return toJsonString(botResponse);

    }

    public String toJsonString(BotExchangeResponse botResponse) {
        Gson json = new Gson();

        return json.toJson(botResponse);

    }

    public Object fromProto(Value structValue) {
        switch (structValue.getKindCase()) {
            case NULL_VALUE:
                return null;
            case BOOL_VALUE:
                return structValue.getBoolValue();
            case NUMBER_VALUE:
                return structValue.getNumberValue();
            case STRING_VALUE:
                return structValue.getStringValue();
            case STRUCT_VALUE:
                Struct struct = structValue.getStructValue();
                Map<String, Object> map = new HashMap<>();
                for (Map.Entry<String, Value> pair : struct.getFieldsMap().entrySet()) {
                    map.put(pair.getKey(), fromProto(pair.getValue()));
                }
                return map;
            case LIST_VALUE:
                List<Object> list = new ArrayList<>();
                for (Value val : structValue.getListValue().getValuesList()) {
                    list.add(fromProto(val));
                }
                return list;
            default:
                throw new ClassCastException("unset Value element: " + structValue);
        }
    }

    BotExchangeResponse initiateBotExchange(VirtualAgentRequest actioRequest)
            throws ApiException, IOException, ParseException {
        BotExchangeResponse botResponse = new BotExchangeResponse();
        BotSessionState sessionState = new BotSessionState();
        Intentinfo intentInfo = new Intentinfo();
        Map<String, Object> customPayload = new HashMap<String, Object>();
        ObjectMapper oMapper = new ObjectMapper();
        try {
            DetectIntentResponse responseResult = dialogflowClient.detectIntentTexts("complex-bot-h99l", actioRequest,
                    "2323", "en-US");

            QueryResult queryResult = responseResult.getQueryResult();
            List<Message> res = queryResult.getFulfillmentMessagesList();
            sessionState.setSessionID("183529");
            intentInfo.setLastUserUtterance(actioRequest.getUserInput());
            intentInfo.setIntentConfidence(queryResult.getIntentDetectionConfidence());
            intentInfo.setIntent(queryResult.getIntent().getDisplayName());

            for (int i = 0; i < res.size(); i++) {
                PromptDefinition responsePrompt = new PromptDefinition();
                if (res.get(i).hasPayload()) {

                    Value CustomPayloadValue = Value.newBuilder().setStructValue(res.get(i).getPayload()).build();
                    Object CustomPayloadObject = fromProto(CustomPayloadValue);

                    customPayload = oMapper.convertValue(CustomPayloadObject, Map.class);
                    if (customPayload.containsKey("scriptpayloads")) {
                        botResponse.setCustomPayload(customPayload);
                    } else {
                        responsePrompt.setMediaSpecificObject(CustomPayloadObject);
                        botResponse = setBotInfo(responsePrompt, intentInfo, botResponse);
                    }

                } else {
                    responsePrompt.setTranscript(res.get(i).getText().getText(0));
                    botResponse = setBotInfo(responsePrompt, intentInfo, botResponse);
                }
            }

            if (actioRequest.getUserInput().equalsIgnoreCase("silence")) {
                botResponse.setBranchName(BranchType.UserInputTimeout);
            } else if (queryResult.getIntent().getEndInteraction()) {
                botResponse.setBranchName(BranchType.ReturnControlToScript);
                sessionState = null;
            } else if (queryResult.getIntent().getIsFallback()) {
                botResponse.setBranchName(BranchType.UserInputNotUnderstood);
            }
            botResponse.setBotSessionState(sessionState);
        } catch (Exception ex) {
            return setError("Res", botResponse);
        }
        return botResponse;
    }

    BotExchangeResponse setBotInfo(PromptDefinition responsePrompt, Intentinfo intentInfo,
            BotExchangeResponse botResponse) {
        List<PromptDefinition> prompt = new ArrayList<PromptDefinition>();
        prompt.add(responsePrompt);
        botResponse.setIntentInfo(intentInfo);
        botResponse.setBranchName(BranchType.PromptAndCollectNextResponse);
        botResponse.getnextPromptSequence().setPrompts(prompt);
        return botResponse;
    }

    BotExchangeResponse setError(String error, BotExchangeResponse botResponse) {
        botErrorDetails.setSystemErrorMessage(error);
        botResponse.setBranchName(BranchType.Error);
        botResponse.setErrorDetails(botErrorDetails);
        return botResponse;
    }
}
