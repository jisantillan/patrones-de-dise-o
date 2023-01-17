package estructurales.adapter;

public class Main {
    public static void main(String[] args) {
        Horno horno = new Horno();
        Lampara lampara = new Lampara();
        PowerAdapter lighBulb = new PowerAdapter();

        horno.encender();
        lampara.encender();
        lighBulb.encender();

        imprimirEstado(horno);
        imprimirEstado(lampara);
        imprimirEstado(lighBulb);
    }

    public static void imprimirEstado(Enchufable enchufable){
        System.out.println(enchufable.estaEncendido());
    }
}
