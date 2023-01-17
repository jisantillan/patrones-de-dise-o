package comportamiento.observer;

public class ReceptorRadio implements Receptor{
    @Override
    public void recibe() {
        System.out.println("recibido en radio");
    }
}