package dialogflow_proxy.example.Model;

import java.util.Map;

public class VirtualAgentRequest {
    public enum UserInputType
    {
        NO_INPUT,
        TEXT,
        BASE64_ENCODED_G711_ULAW_WAV_FILE,
        USER_INPUT_ARCHIVED_AS_SPECIFIED,
        USER_ENDED_SESSION,
        AUTOMATED_TEXT,
        DTMF_AS_TEXT
    }
    public String virtualAgentId;
    public Object botConfig;
    public String userInput;
    public UserInputType userInputType;
    public ActionexecutionInfo executionInfo;
    public String systemTelemetryData;
    public String base64wavFile;
    public BotSessionState botSessionState;
    public Map<String, Object> customPayload;
    public String mediaType;

    public String getVirtualAgentId() {
        return this.virtualAgentId;
    }

    public void setVirtualAgentId(String virtualAgentId) {
        this.virtualAgentId = virtualAgentId;
    }

    public Object getBotConfig() {
        return this.botConfig;
    }

    public void setBotConfig(Object botConfig) {
        this.botConfig = botConfig;
    }

    public String getUserInput() {
        return this.userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public UserInputType getUserInputType() {
        return this.userInputType;
    }

    public void setUserInputType(UserInputType userInputType) {
        this.userInputType = userInputType;
    }

    public ActionexecutionInfo getExecutionInfo() {
        return this.executionInfo;
    }

    public void setExecutionInfo(ActionexecutionInfo executionInfo) {
        this.executionInfo = executionInfo;
    }

    public String getSystemTelemetryData() {
        return this.systemTelemetryData;
    }

    public void setSystemTelemetryData(String systemTelemetryData) {
        this.systemTelemetryData = systemTelemetryData;
    }

    public String getBase64wavFile() {
        return this.base64wavFile;
    }

    public void setBase64wavFile(String base64wavFile) {
        this.base64wavFile = base64wavFile;
    }

    public BotSessionState getBotSessionState() {
        return this.botSessionState;
    }

    public void setBotSessionState(BotSessionState botSessionState) {
        this.botSessionState = botSessionState;
    }

    public Map<String,Object> getCustomPayload() {
        return this.customPayload;
    }

    public void setCustomPayload(Map<String,Object> customPayload) {
        this.customPayload = customPayload;
    }

    public String getMediaType() {
        return this.mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

}
