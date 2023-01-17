package comportamiento.observer;

public class Main {
    public static void main(String[] args) {
        Emisora emisora = new Emisora();
        ReceptorTv receptorTv = new ReceptorTv();
        ReceptorSatelite receptorSatelite = new ReceptorSatelite();
        ReceptorRadio receptorRadio = new ReceptorRadio();


        //suscribe
        emisora.addReceptor(receptorRadio);
        emisora.addReceptor(receptorSatelite);
        emisora.addReceptor(receptorTv);
        //

        emisora.emite();
    }
}
