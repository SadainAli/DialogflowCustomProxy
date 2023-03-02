package dialogflow_proxy.example.Model;

public class PromptDefinition {
    private String transcript;
    private String base64EncodedG711ulawWithWavHeader;
    private String audioFilePath;
    private String textToSpeech;
    private Object mediaSpecificObject;

    public String getTranscript() {
        return this.transcript;
    }

    public void setTranscript(String transcript) {
        this.transcript = transcript;
    }

    public String getBase64EncodedG711ulawWithWavHeader() {
        return this.base64EncodedG711ulawWithWavHeader;
    }

    public void setBase64EncodedG711ulawWithWavHeader(String base64EncodedG711ulawWithWavHeader) {
        this.base64EncodedG711ulawWithWavHeader = base64EncodedG711ulawWithWavHeader;
    }

    public String getAudioFilePath() {
        return this.audioFilePath;
    }

    public void setAudioFilePath(String audioFilePath) {
        this.audioFilePath = audioFilePath;
    }

    public String getTextToSpeech() {
        return this.textToSpeech;
    }

    public void setTextToSpeech(String textToSpeech) {
        this.textToSpeech = textToSpeech;
    }

    public Object getMediaSpecificObject() {
        return this.mediaSpecificObject;
    }

    public void setMediaSpecificObject(Object mediaSpecificObject) {
        this.mediaSpecificObject = mediaSpecificObject;
    }
}
