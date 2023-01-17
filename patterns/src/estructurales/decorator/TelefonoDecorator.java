package estructurales.decorator;

public class TelefonoDecorator implements Telefono{
    Telefono telefono;

    public TelefonoDecorator(Telefono telefono){ //el argumento debe implementar la interfaz telefono
        this.telefono = telefono;
    }
    @Override
    public void crear() {
        this.telefono.crear();
    }
}
