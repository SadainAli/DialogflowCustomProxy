package dialogflow_proxy.example.Model;

public class BotSessionState {
    private String ConversationName;
    private String EndUserParticipantName;
    private String SessionID;
    private boolean useWelcomeMessage;

    public String getConversationName() {
        return this.ConversationName;
    }

    public void setConversationName(String ConversationName) {
        this.ConversationName = ConversationName;
    }

    public String getEndUserParticipantName() {
        return this.EndUserParticipantName;
    }

    public void setEndUserParticipantName(String EndUserParticipantName) {
        this.EndUserParticipantName = EndUserParticipantName;
    }

    public String getSessionID() {
        return this.SessionID;
    }

    public void setSessionID(String SessionID) {
        this.SessionID = SessionID;
    }

    public boolean isUseWelcomeMessage() {
        return this.useWelcomeMessage;
    }

    public boolean getUseWelcomeMessage() {
        return this.useWelcomeMessage;
    }

    public void setUseWelcomeMessage(boolean useWelcomeMessage) {
        this.useWelcomeMessage = useWelcomeMessage;
    }

    
}
