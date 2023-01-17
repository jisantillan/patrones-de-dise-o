package comportamiento.strategy;

import java.util.ArrayList;

public class UsuariosMemoria implements Usuario{
    private ArrayList<String> usuarios = new ArrayList<>();

    @Override
    public void  agregar (String nombre){
        usuarios.add(nombre);
    }

    @Override
    public ArrayList<String> listar() {
        return usuarios;
    }
}
