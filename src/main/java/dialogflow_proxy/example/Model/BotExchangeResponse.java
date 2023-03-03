package dialogflow_proxy.example.Model;
import java.util.*;

public class BotExchangeResponse {
    public enum BranchType{
        DoNotBegin, 
        PromptAndCollectNextResponse, 
        ReturnControlToScript, 
        EndContact, 
        AudioInputUntranscribeable, 
        Error, 
        DTMFBreakout, 
        UserInputTimeout, 
        UserInputNotUnderstood
    }
    private BranchType branchName;
    private PromptSequence nextPromptSequence;
    private Intentinfo intentInfo;
    private PromptBehaviors nextPromptBehaviors;
    private Map<String, Object> customPayload;
    private BotErrorDetails errorDetails;
    private BotSessionState botSessionState;

    public BranchType getBranchName() {
        return this.branchName;
    }

    public void setBranchName(BranchType branchName) {
        this.branchName = branchName;
    }


    public PromptSequence getnextPromptSequence() {
        return this.nextPromptSequence;
    }

   
    public void setnextPromptSequence(PromptSequence nextPromptSequence) {
        this.nextPromptSequence = nextPromptSequence;
    }
    

    public Intentinfo getIntentInfo() {
        return this.intentInfo;
    }

    public void setIntentInfo(Intentinfo intentinfo) {
        this.intentInfo = intentinfo;
    }

    public PromptBehaviors getNextPromptBehaviors() {
        return this.nextPromptBehaviors;
    }

    public void setNextPromptBehaviors(PromptBehaviors nextPromptBehaviors) {
        this.nextPromptBehaviors = nextPromptBehaviors;
    }

    public Map<String,Object> getCustomPayload() {
        return this.customPayload;
    }

    public void setCustomPayload(Map<String,Object> customPayload) {
        this.customPayload = customPayload;
    }

    public BotErrorDetails getErrorDetails() {
        return this.errorDetails;
    }

    public void setErrorDetails(BotErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }

    public Object getBotSessionState() {
        return this.botSessionState;
    }

    public void setBotSessionState(BotSessionState botSessionState) {
        this.botSessionState = botSessionState;
    }
    

    public BotExchangeResponse( ) {

        this.nextPromptSequence = new PromptSequence();
        this.intentInfo = new Intentinfo();
        this.nextPromptBehaviors = new PromptBehaviors();
        this.nextPromptBehaviors.getAudioCollectionRules().setCollectionType(AudioCollectionRules.UserInputCollectType.DO_NOT_COLLECT_USER_RESPONSE);
        this.nextPromptBehaviors.getAudioCollectionRules().setDtmfRules(CollectDtmfRules.SurveyResponseSettings());
        this.customPayload=new HashMap<String,Object>();
    }
   
}
