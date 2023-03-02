package dialogflow_proxy.example.Model;

public class SilenceRules {
    private boolean engageComfortSequence;
    private int botResponseDelayTolerance;
    private PromptSequence comfortPromptSequence;
    private int millisecondsToWaitForUserResponse;

    public boolean isEngageComfortSequence() {
        return this.engageComfortSequence;
    }

    public boolean getEngageComfortSequence() {
        return this.engageComfortSequence;
    }

    public void setEngageComfortSequence(boolean engageComfortSequence) {
        this.engageComfortSequence = engageComfortSequence;
    }

    public int getBotResponseDelayTolerance() {
        return this.botResponseDelayTolerance;
    }

    public void setBotResponseDelayTolerance(int botResponseDelayTolerance) {
        this.botResponseDelayTolerance = botResponseDelayTolerance;
    }

    public PromptSequence getComfortPromptSequence() {
        return this.comfortPromptSequence;
    }

    public void setComfortPromptSequence(PromptSequence comfortPromptSequence) {
        this.comfortPromptSequence = comfortPromptSequence;
    }

    public int getMillisecondsToWaitForUserResponse() {
        return this.millisecondsToWaitForUserResponse;
    }

    public void setMillisecondsToWaitForUserResponse(int millisecondsToWaitForUserResponse) {
        this.millisecondsToWaitForUserResponse = millisecondsToWaitForUserResponse;
    }
}
