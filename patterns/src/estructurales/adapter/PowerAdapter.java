package estructurales.adapter;

public class PowerAdapter implements Enchufable{

    public LightBulb lightBulb = new LightBulb();
    @Override
    public void encender() {
        lightBulb.turnOn(220);

    }

    @Override
    public void apagar() {
        lightBulb.turnOff();
    }

    @Override
    public boolean estaEncendido() {
        return lightBulb.poweredOn;
    }
}
