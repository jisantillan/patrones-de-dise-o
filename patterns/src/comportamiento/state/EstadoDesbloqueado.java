package comportamiento.state;

public class EstadoDesbloqueado extends Estado {
    public EstadoDesbloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "no se puede desboquear ya esta desbloqueado";
    }

    @Override
    public String abrirCamara() {
        telefono.cambiarEstado(new EstadoAbrirCamara(telefono));
        return "cambio a estado abrirCamara ";
    }

    @Override
    public String hacerFoto() {
        return "estadoDesbloqueado: debe abrirse antes la camara";
    }
}
