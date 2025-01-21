public class Main {
    private boolean isOn = false;
    private int acTemperature;


    public boolean getAcStatus() {
        return isOn;
    }

    public boolean turnOnAc(){
        isOn = true;
        return isOn;
    }
    public void setTemperature(int acTemperature){
        Main main = new Main();
        if (main.turnOnAc() == true) {
            this.acTemperature = acTemperature;
        }
    }
    public int getAcTemperature(){
        return acTemperature;
    }

    public boolean turnOffAc() {
        isOn = false;
        return isOn;
    }

    public int returnACTemp() {
        return acTemperature;
    }

    public int increaseTemp() {
        if(isOn == true && acTemperature < 30){
            acTemperature += 1;
        }
        return acTemperature;
    }

    public int reduceTemperature() {
        if(acTemperature > 16 && isOn == true) {
            acTemperature -= 1;
        }
        return acTemperature;
    }
}