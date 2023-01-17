package comportamiento.state;

public class EstadoAbrirCamara extends  Estado{

    public EstadoAbrirCamara(Telefono telefono){
        super(telefono);
    }
    @Override
    public String desbloquear() {
        return "ya esta desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "la camara ya estaba abierta";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiarEstado(new EstadoTomarFoto(telefono));
        return "se cambio a estado foto";
    }
}
