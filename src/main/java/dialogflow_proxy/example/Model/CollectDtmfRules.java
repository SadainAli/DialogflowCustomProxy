package dialogflow_proxy.example.Model;

public class CollectDtmfRules {
    private boolean detectDtmf;
    private boolean clearDigits;
    private String terminationCharacters;
    private boolean stripTerminator;
    private int interDigitTimeoutMilliseconds;
    private int maxDigits;

    public boolean isDetectDtmf() {
        return this.detectDtmf;
    }

    public boolean getDetectDtmf() {
        return this.detectDtmf;
    }

    public void setDetectDtmf(boolean detectDtmf) {
        this.detectDtmf = detectDtmf;
    }

    public boolean isClearDigits() {
        return this.clearDigits;
    }

    public boolean getClearDigits() {
        return this.clearDigits;
    }

    public void setClearDigits(boolean clearDigits) {
        this.clearDigits = clearDigits;
    }

    public String getTerminationCharacters() {
        return this.terminationCharacters;
    }

    public void setTerminationCharacters(String terminationCharacters) {
        this.terminationCharacters = terminationCharacters;
    }

    public boolean isStripTerminator() {
        return this.stripTerminator;
    }

    public boolean getStripTerminator() {
        return this.stripTerminator;
    }

    public void setStripTerminator(boolean stripTerminator) {
        this.stripTerminator = stripTerminator;
    }

    public int getInterDigitTimeoutMilliseconds() {
        return this.interDigitTimeoutMilliseconds;
    }

    public void setInterDigitTimeoutMilliseconds(int interDigitTimeoutMilliseconds) {
        this.interDigitTimeoutMilliseconds = interDigitTimeoutMilliseconds;
    }

    public int getMaxDigits() {
        return this.maxDigits;
    }

    public void setMaxDigits(int maxDigits) {
        this.maxDigits = maxDigits;
    }
    public static CollectDtmfRules SurveyResponseSettings()
    {
        return new CollectDtmfRules();
    }

    public CollectDtmfRules() {
        this.detectDtmf = true;
        this.clearDigits = true;
        this.terminationCharacters = "#";
        this.stripTerminator = true;
        this.interDigitTimeoutMilliseconds = 0;
        this.maxDigits = 0;
    }

}
