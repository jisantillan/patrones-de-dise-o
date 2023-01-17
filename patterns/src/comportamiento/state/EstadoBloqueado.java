package comportamiento.state;

public class EstadoBloqueado extends Estado{

    public EstadoBloqueado(Telefono telefono){
        super(telefono);
    }
    @Override
    public String desbloquear() {
        telefono.cambiarEstado(new EstadoDesbloqueado(telefono));
        return "movil desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara: la camara esta bloqueada. Desbloquea el movil antes";
    }

    @Override
    public String hacerFoto() {
        return "hacerFoto: la camara esta bloqueada. Desbloquea el movil antes";

    }
}
