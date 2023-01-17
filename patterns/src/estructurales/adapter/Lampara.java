package estructurales.adapter;

public class Lampara implements Enchufable {
    boolean encendido;
    @Override
    public void encender() {
        this.encendido = true;
    }

    @Override
    public void apagar() {
        this.encendido = false;
    }

    @Override
    public boolean estaEncendido() {
        return encendido;
    }
}
