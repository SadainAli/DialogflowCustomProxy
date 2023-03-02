package dialogflow_proxy.example.dialogflow_proxy;

import com.google.api.gax.core.FixedCredentialsProvider;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.google.api.gax.rpc.ApiException;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.protobuf.*;

import dialogflow_proxy.example.Model.VirtualAgentRequest;

import io.github.cdimascio.dotenv.Dotenv;
import com.google.cloud.dialogflow.v2.DetectIntentRequest;
import com.google.cloud.dialogflow.v2.DetectIntentResponse;
import com.google.cloud.dialogflow.v2.QueryInput;
import com.google.cloud.dialogflow.v2.QueryParameters;
import com.google.cloud.dialogflow.v2.SessionName;
import com.google.cloud.dialogflow.v2.SessionsClient;
import com.google.cloud.dialogflow.v2.SessionsSettings;
import com.google.cloud.dialogflow.v2.TextInput;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.json.simple.parser.ParseException;

public class DialogflowClient {

        public static SessionsClient sessionsClient;
        

        public void createSession() throws IOException {
                Dotenv env= Dotenv.configure().ignoreIfMalformed().load();
                String credential=env.get("CREDENTIAL");
                InputStream targetStream = new ByteArrayInputStream(credential.getBytes());

                // FileInputStream stream = new FileInputStream(
                //                 new File("C:/Users/sadai/Downloads/sa-project-375113-8cfea5f49259.json"));
                GoogleCredentials credentials = GoogleCredentials.fromStream(targetStream);

                SessionsSettings.Builder settingsBuilder = SessionsSettings.newBuilder();
                SessionsSettings sessionsSettings = settingsBuilder
                                .setCredentialsProvider(FixedCredentialsProvider.create(credentials)).build();
                sessionsClient = SessionsClient.create(sessionsSettings);
        }

       
        // DialogFlow API Detect Intent sample with text inputs.
        public DetectIntentResponse detectIntentTexts(
                        String projectId, VirtualAgentRequest actioRequest, String sessionId, String languageCode)
                        throws IOException, ApiException, ParseException {
               
                // What does sessionName do?
                SessionName session = SessionName.of(projectId, sessionId);

                // Set the text (hello) and language code (en-US) for the query
                TextInput.Builder textInput = TextInput.newBuilder().setText(actioRequest.getUserInput())
                                .setLanguageCode(languageCode);
                // Build the query with the TextInput
                
                QueryInput queryInput = QueryInput.newBuilder().setText(textInput).build();
                
                ObjectMapper mapper = new ObjectMapper();
                DetectIntentRequest request;
                if ( !(actioRequest.getCustomPayload() == null) ) {
                        
                        String CustompayloadString = mapper.writeValueAsString(actioRequest.getCustomPayload());
                        Value custompayload = Value.newBuilder().setStringValue(CustompayloadString.toString()).build();
                        Struct newstruct = Struct.newBuilder().putFields("jstring", custompayload).build();
                        QueryParameters queryparam = QueryParameters.newBuilder().setPayload(newstruct).build();
                       

                        request = DetectIntentRequest.newBuilder()
                                        .setSession(session.toString())
                                        .setQueryInput(queryInput)
                                        .setQueryParams(queryparam)
                                        .build();
                } 
                else {
                        request = DetectIntentRequest.newBuilder()
                                        .setSession(session.toString())
                                        .setQueryInput(queryInput)
                                        .build();
                }
                // Performs the detect intent request
                DetectIntentResponse response = sessionsClient.detectIntent(request);
               
                
                return response;

        }
}