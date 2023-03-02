package dialogflow_proxy.example.Model;

public class AudioCollectionRules {
    public  enum UserInputCollectType{
        DO_NOT_COLLECT_USER_RESPONSE, 
        SEND_UTTERANCE_AUDIO, 
        SEND_DTMF_ONLY_AS_TEXT
    }
    public UserInputCollectType collectionType;
    public CollectDtmfRules dtmfRules;
    public PromptBargeConfiguration bargeConfiguration;
    public AudioTranscriptionConfig audioTranscriptionConfig;

    public UserInputCollectType getCollectionType() {
        return this.collectionType;
    }

    public void setCollectionType(UserInputCollectType collectionType) {
        this.collectionType = collectionType;
    }

    public CollectDtmfRules getDtmfRules() {
        return this.dtmfRules;
    }

    public void setDtmfRules(CollectDtmfRules dtmfRules) {
        this.dtmfRules = dtmfRules;
    }

    public PromptBargeConfiguration getBargeConfiguration() {
        return this.bargeConfiguration;
    }

    public void setBargeConfiguration(PromptBargeConfiguration bargeConfiguration) {
        this.bargeConfiguration = bargeConfiguration;
    }

    public AudioTranscriptionConfig getAudioTranscriptionConfig() {
        return this.audioTranscriptionConfig;
    }

    public void setAudioTranscriptionConfig(AudioTranscriptionConfig audioTranscriptionConfig) {
        this.audioTranscriptionConfig = audioTranscriptionConfig;
    }
}
