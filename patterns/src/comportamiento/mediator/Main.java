package comportamiento.mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague colleague = new ConcreteColleague();
        Colleague colleague2 = new ConcreteColleague2();

//        no recibe nadie, no puede recibir el mismo. Solamente envia
//        mediator.registra(colleague);
//        colleague.envia();

        // recibe colleague 2
        mediator.registra(colleague);
        mediator.registra(colleague2);
        colleague.envia();
    }
}
