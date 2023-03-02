package dialogflow_proxy.example.Model;

import java.util.HashMap;
import java.util.Map;


public class Intentinfo {

    public String intent;
    public String context;
    public float intentConfidence;
    public String lastUserUtterance;
    public Map<String,Object> slots;
  
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


