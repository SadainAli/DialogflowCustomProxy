package dialogflow_proxy.example.dialogflow_proxy;

import java.io.IOException;


import dialogflow_proxy.example.Model.VirtualAgentRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DialogflowProxyApplication {
	static DialogflowClient intentRequest = new DialogflowClient();
	VirtualAgentRequest request=new VirtualAgentRequest();

	
	public static void main(String[] args) throws IOException {

		
		SpringApplication.run(DialogflowProxyApplication.class, args);
		
	}
	
}