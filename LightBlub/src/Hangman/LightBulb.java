package Hangman;

public class LightBulb {
    private boolean status;
    private int hitCount;

    public LightBulb(){
        status = false;
        hitCount = 10;
    }

    public void ToggleSwitch(){
        if (hitCount > 0) {
            status = !status;
            hitCount--;
        }
    }

    public void charge(int batteryHour){
        if (batteryHour > 0){
            hitCount += (int)(batteryHour/2);
        }
    }

    public int getHitCount(){
        return hitCount;
    }

    public String getCurrentStatus(){
        return (status) ? "ON" : "OFF";
    }
}
