package comportamiento.state;

public class EstadoTomarFoto extends Estado{
    public EstadoTomarFoto(Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "ya esta desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "ya esta abierta la camara";
    }

    @Override
    public String hacerFoto() {
        return "se tomo la foto";
    }
}
