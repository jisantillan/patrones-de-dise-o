package comportamiento.iterator;

import java.util.ArrayList;

public class Usuarios implements UsuarioIterator{

    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private int pos = 0;
    public void crear(Usuario usuario){
        usuarios.add(usuario);
    }
    @Override
    public Usuario next() {
        Usuario usuario = this.usuarios.get(pos);
        pos++;
        return usuario;
    }

    @Override
    public void reset() {
        pos = 0;
    }

    @Override
    public Boolean hasMore() {
        return this.usuarios.size() > pos;
    }
}
