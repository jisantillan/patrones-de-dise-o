package comportamiento.state;

public class Telefono {
    public Estado estado;

    public Telefono() {
        estado = new EstadoBloqueado(this);
    }

    public void cambiarEstado(Estado estado) {
        this.estado = estado;
        System.out.println("se cambio el estado a "+ this.estado.getClass().getName());
    }

    public Estado getEstado() {
        return this.estado;
    }
}
