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
        if (isOn == true) {
            if (speed <= 20) speed++;
            if (speed >= 21 && speed <= 30) speed = speed + 2;
            if (speed >= 31 && speed <= 40) speed = speed + 3;
            if (speed > 40) speed = speed + 4;
        }
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void decelerate() {
        if (speed <= 20) speed--;
        if (speed >= 21 && speed <= 30) speed = speed - 2;
        if (speed >= 31 && speed <= 40) speed = speed - 3;
        if (speed > 40) speed = speed - 4;
    }
}