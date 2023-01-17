package comportamiento.iterator;

public class Main {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        usuarios.crear(new Usuario("javier",25));
        usuarios.crear(new Usuario("juan",5));
        usuarios.crear(new Usuario("javier",30));
        usuarios.crear(new Usuario("jorge",19));
        usuarios.crear(new Usuario("javier",25));
        usuarios.crear(new Usuario("javier",25));

    // Da lo mismo el tipo de almacenamiento ya sea ArrayList LinkedList etc

        while (usuarios.hasMore()){
            System.out.println("nombre: "+usuarios.next().getNombre());
        }
    }
}
