package bikeApp;


public class Bike {

    private boolean isOn = false;
    public int speed = 0;

    public boolean getIsOn(){
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void accelerate() {
        speed ++;
    }
}