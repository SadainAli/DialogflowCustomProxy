package dialogflow_proxy.example.Model;

import java.util.HashMap;
import java.util.Map;


public class Intentinfo {

    private String intent;
    private String context;
    private float intentConfidence;
    private String lastUserUtterance;
    private Map<String,Object> slots;
  
    public String getIntent() {
        return this.intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public String getContext() {
        return this.context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public double getIntentConfidence() {
        return this.intentConfidence;
    }

    public void setIntentConfidence(float intentConfidence) {
        this.intentConfidence = intentConfidence;
    }

    public String getLastUserUtterance() {
        return this.lastUserUtterance;
    }

    public void setLastUserUtterance(String lastUserUtterance) {
        this.lastUserUtterance = lastUserUtterance;
    }

 

    public Map<String,Object> getSlots() {
        return this.slots;
    }

    public void setSlots(Map<String,Object> slots) {
        this.slots = slots;
    }

    public Intentinfo() {
        slots = new HashMap<String,Object>();
    }
    
}


