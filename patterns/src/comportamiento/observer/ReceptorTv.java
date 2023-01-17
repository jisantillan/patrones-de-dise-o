package comportamiento.observer;

public class ReceptorTv implements Receptor{

    @Override
    public void recibe() {
        System.out.println("recibe en tv");
    }
}
