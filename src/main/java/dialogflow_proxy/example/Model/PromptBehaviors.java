package dialogflow_proxy.example.Model;

public class PromptBehaviors {
    private SilenceRules silenceRules;
    private AudioCollectionRules audioCollectionRules;

    public SilenceRules getSilenceRules() {
        return this.silenceRules;
    }

    public void setSilenceRules(SilenceRules silenceRules) {
        this.silenceRules = silenceRules;
    }

    public AudioCollectionRules getAudioCollectionRules() {
        return this.audioCollectionRules;
    }

    public void setAudioCollectionRules(AudioCollectionRules audioCollectionRules) {
        this.audioCollectionRules = audioCollectionRules;
    }
    public PromptBehaviors()
    {
        silenceRules = new SilenceRules();
        audioCollectionRules = new AudioCollectionRules();
    }
}
