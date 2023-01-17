package comportamiento.iterator;

public interface UsuarioIterator {
    Usuario next();  // hay mas usuarios ?
    void reset();   // reinicia el contador (el iterador)
    Boolean hasMore(); // obtiene el siguiente
}
