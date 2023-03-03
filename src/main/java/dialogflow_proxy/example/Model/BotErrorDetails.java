package dialogflow_proxy.example.Model;


public class BotErrorDetails {
    public enum BotLoopErrorBehavior{
        ReturnControlToScriptThroughErrorBranch, 
        EndContact
    }
    private BotLoopErrorBehavior errorBehavior;
    private PromptSequence errorPromptSequence;
    private String systemErrorMessage;

    public BotLoopErrorBehavior getErrorBehavior() {
        return this.errorBehavior;
    }

    public void setErrorBehavior(BotLoopErrorBehavior errorBehavior) {
        this.errorBehavior = errorBehavior;
    }

    public PromptSequence getErrorPromptSequence() {
        return this.errorPromptSequence;
    }

    public void setErrorPromptSequence(PromptSequence errorPromptSequence) {
        this.errorPromptSequence = errorPromptSequence;
    }

    public String getSystemErrorMessage() {
        return this.systemErrorMessage;
    }

    public void setSystemErrorMessage(String systemErrorMessage) {
        this.systemErrorMessage = systemErrorMessage;
    }
    
}
