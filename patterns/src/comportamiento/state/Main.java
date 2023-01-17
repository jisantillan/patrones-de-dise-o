package comportamiento.state;

public class Main {
    public static void main(String[] args) {
        Telefono telefono = new Telefono();
        System.out.println(telefono.getEstado());
        System.out.println(telefono.estado.desbloquear());
        System.out.println(telefono.estado.abrirCamara());
        System.out.println(telefono.estado.abrirCamara());
        System.out.println(telefono.estado.hacerFoto());
        System.out.println(telefono.estado.hacerFoto()); // aca ya esta en estadoTomarFoto
        System.out.println(telefono.estado.desbloquear());
    }
}
