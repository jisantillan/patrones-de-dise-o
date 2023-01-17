package comportamiento.mediator;

public class ConcreteColleague extends  Colleague{
    @Override
    void recibe() {
        System.out.println("he recibido un mensaje soy Concrete Colleage 1");
    }

    @Override
    void envia() {
        System.out.println("Soy Concrete Colleage 1, envio un mensaje");
        mediator.reenvia(this);
    }
}
