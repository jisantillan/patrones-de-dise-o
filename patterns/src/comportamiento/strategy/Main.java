package comportamiento.strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UsuariosMemoria usuariosMemoria = new UsuariosMemoria();
        UsuariosFichero usuariosFichero = new UsuariosFichero();

        agregar(usuariosMemoria,"juan");
        agregar(usuariosFichero,"omar");
        agregar(usuariosMemoria,"javier");

        listar(usuariosMemoria);

        for (String u: listar(usuariosFichero)) {
            System.out.println(u);
        }

        for (String u: listar(usuariosMemoria)) {
            System.out.println(u);
        }

    }

    public static void agregar(Usuario usuario, String nombre){
        usuario.agregar(nombre);
    }

    public static ArrayList<String> listar(Usuario usuario){
        return usuario.listar();
    }
}
