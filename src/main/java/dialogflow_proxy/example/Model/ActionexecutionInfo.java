package dialogflow_proxy.example.Model;

public class ActionexecutionInfo {
    private int contactId;
    private int busNo;
    private int requestId;
    private String actionType;
    private int actionId;
    private String scriptName;

    public int getContactId() {
        return this.contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public int getBusNo() {
        return this.busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public int getRequestId() {
        return this.requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public String getActionType() {
        return this.actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public int getActionId() {
        return this.actionId;
    }

    public void setActionId(int actionId) {
        this.actionId = actionId;
    }

    public String getScriptName() {
        return this.scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }
   
}
