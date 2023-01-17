package comportamiento.mediator;

public class ConcreteColleague2 extends  Colleague{
    @Override
    void recibe() {
        System.out.println("he recibido un mensaje soy Concrete Colleage 2");
    }

    @Override
    void envia() {
        System.out.println("Soy Concrete Colleage 2, envio un mensaje");
        mediator.reenvia(this);
    }
}

