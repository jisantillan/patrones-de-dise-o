package comportamiento.mediator;

import java.util.ArrayList;

public class ConcreteMediator extends Mediator {

    ArrayList<Colleague> colleagues = new ArrayList<>();
    @Override
    void registra(Colleague colleague) {
        if(!colleagues.contains(colleague)){
            colleagues.add(colleague);
            colleague.setMediator(this); // el this hace referencia al mediador concreto
        }
    }

    @Override
    void reenvia(Colleague colleague) {
        for (Colleague c: colleagues) {
            if(!c.equals(colleague)) {
                c.recibe();
            }
        }
    }
}
