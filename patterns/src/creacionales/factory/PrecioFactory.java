package creacionales.factory;

public class PrecioFactory {

    Precio precio;
    private PrecioFactory(){}

    public PrecioFactory(String pais){
        if (pais.equalsIgnoreCase("arg")){
            precio = new PrecioEUR();
        }
        else {
            precio = new PrecioUsd();
        }
    }
}
