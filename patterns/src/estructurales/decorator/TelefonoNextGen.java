package estructurales.decorator;

public class TelefonoNextGen  extends TelefonoDecorator{
    public TelefonoNextGen(Telefono telefono){
        super(telefono);
    }

    @Override
    public void crear(){
        super.crear();
        System.out.println("    -> tengo 5G");
    }
}
