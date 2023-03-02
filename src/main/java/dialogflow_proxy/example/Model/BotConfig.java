package dialogflow_proxy.example.Model;


public class BotConfig {
    private String webhookUrl;
    private boolean authorizationHeader;
    private String customHeaders;
    private String endpointParameters;
    private String schemaVersion;
    private int timeout;
    private boolean oAuthRequired;
    private String oauthUrl;
    private String oauthRequest;
    private String oauthHeaders;
    private boolean customHeaderAuth;
    private String authorizationHeaderName;
    private String authorizationHeaderValuePrefix;
    private int authExpiryTime;
    private String integrationVersion;


    public String getWebhookUrl() {
        return this.webhookUrl;
    }

    public void setWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
    }

    public boolean isAuthorizationHeader() {
        return this.authorizationHeader;
    }

    public boolean getAuthorizationHeader() {
        return this.authorizationHeader;
    }

    public void setAuthorizationHeader(boolean authorizationHeader) {
        this.authorizationHeader = authorizationHeader;
    }

    public String getCustomHeaders() {
        return this.customHeaders;
    }

    public void setCustomHeaders(String customHeaders) {
        this.customHeaders = customHeaders;
    }

    public String getEndpointParameters() {
        return this.endpointParameters;
    }

    public void setEndpointParameters(String endpointParameters) {
        this.endpointParameters = endpointParameters;
    }

    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public boolean isOAuthRequired() {
        return this.oAuthRequired;
    }

    public boolean getOAuthRequired() {
        return this.oAuthRequired;
    }

    public void setOAuthRequired(boolean oAuthRequired) {
        this.oAuthRequired = oAuthRequired;
    }

    public String getOauthUrl() {
        return this.oauthUrl;
    }

    public void setOauthUrl(String oauthUrl) {
        this.oauthUrl = oauthUrl;
    }

    public String getOauthRequest() {
        return this.oauthRequest;
    }

    public void setOauthRequest(String oauthRequest) {
        this.oauthRequest = oauthRequest;
    }

    public String getOauthHeaders() {
        return this.oauthHeaders;
    }

    public void setOauthHeaders(String oauthHeaders) {
        this.oauthHeaders = oauthHeaders;
    }

    public boolean isCustomHeaderAuth() {
        return this.customHeaderAuth;
    }

    public boolean getCustomHeaderAuth() {
        return this.customHeaderAuth;
    }

    public void setCustomHeaderAuth(boolean customHeaderAuth) {
        this.customHeaderAuth = customHeaderAuth;
    }

    public String getAuthorizationHeaderName() {
        return this.authorizationHeaderName;
    }

    public void setAuthorizationHeaderName(String authorizationHeaderName) {
        this.authorizationHeaderName = authorizationHeaderName;
    }

    public String getAuthorizationHeaderValuePrefix() {
        return this.authorizationHeaderValuePrefix;
    }

    public void setAuthorizationHeaderValuePrefix(String authorizationHeaderValuePrefix) {
        this.authorizationHeaderValuePrefix = authorizationHeaderValuePrefix;
    }

    public int getAuthExpiryTime() {
        return this.authExpiryTime;
    }

    public void setAuthExpiryTime(int authExpiryTime) {
        this.authExpiryTime = authExpiryTime;
    }

    public String getIntegrationVersion() {
        return this.integrationVersion;
    }

    public void setIntegrationVersion(String integrationVersion) {
        this.integrationVersion = integrationVersion;
    }

}
