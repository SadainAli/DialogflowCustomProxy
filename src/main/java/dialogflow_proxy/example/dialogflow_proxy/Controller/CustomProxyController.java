package dialogflow_proxy.example.dialogflow_proxy.Controller;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.api.gax.rpc.ApiException;

import dialogflow_proxy.example.Model.VirtualAgentRequest;
import dialogflow_proxy.example.dialogflow_proxy.Manager.EsManager;


@RestController
public class CustomProxyController {

    @PostMapping(path = "/proxy")
    public String test(@RequestBody VirtualAgentRequest request) throws ApiException, IOException, ParseException {
       EsManager esManager= new EsManager();
        String Response = esManager.performBotExchange(request);
        return Response;
    }

    
}
