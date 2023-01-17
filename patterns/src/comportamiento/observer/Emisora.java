package comportamiento.observer;

import java.util.ArrayList;

public class Emisora {
    private ArrayList<Receptor> receptors = new ArrayList<>();

    public void addReceptor(Receptor receptor) {
        this.receptors.add(receptor);
    }

    public void emite(){
        for (Receptor r: receptors) {
            r.recibe();

        }
    }
}
