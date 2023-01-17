package estructurales.adapter;

public class LightBulb {

    boolean poweredOn;

    int voltage = 0;

    public void turnOn(int voltage){
        poweredOn = true;
        this.voltage = voltage;
    }

    public void turnOff(){
        poweredOn = false;
        this.voltage = 0;
    }

    public boolean getPoweredOn(){
        return poweredOn;
    }
}
