package dialogflow_proxy.example.Model;

import java.util.List;

public class AudioTranscriptionConfig {
    private String transcriptionProfileId;
    private List<String> hintPhrases;

    public String getTranscriptionProfileId() {
        return this.transcriptionProfileId;
    }

    public void setTranscriptionProfileId(String transcriptionProfileId) {
        this.transcriptionProfileId = transcriptionProfileId;
    }

    public List<String> getHintPhrases() {
        return this.hintPhrases;
    }

    public void setHintPhrases(List<String> hintPhrases) {
        this.hintPhrases = hintPhrases;
    }
}
