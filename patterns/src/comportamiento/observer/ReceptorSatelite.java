package comportamiento.observer;

public class ReceptorSatelite implements Receptor{
    @Override
    public void recibe() {
        System.out.println("recibido en satelite");
    }
}
