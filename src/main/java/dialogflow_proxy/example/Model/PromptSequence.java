package dialogflow_proxy.example.Model;

import java.util.*;

public class PromptSequence {
    private List<PromptDefinition> prompts;

    public List<PromptDefinition> getPrompts() {
        return this.prompts;
    }

    public void setPrompts(List<PromptDefinition> prompts) {
        this.prompts = prompts;
    }
    public PromptSequence() {
        prompts=new ArrayList<PromptDefinition>();
    }
    
}
