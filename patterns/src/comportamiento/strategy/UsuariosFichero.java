package comportamiento.strategy;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosFichero implements Usuario{

    public String ficheroUsuarios = "usuario.txt";
    private PrintStream fichero;
    public UsuariosFichero(){
        try {
            fichero = new PrintStream(ficheroUsuarios);
        }
        catch (Exception e){
            System.out.println("No se ha podido leer el archivo: "+ e.getMessage());
        }
    }

    @Override
    public void agregar(String nombre){
        fichero.println(nombre); // lo guarda en el fichero
    }


    @Override
    public ArrayList<String> listar(){
        ArrayList<String> usuarios = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(new File(ficheroUsuarios));
            while (scanner.hasNext()){
                usuarios.add(scanner.next());
            }
            return usuarios;
        }
        catch (Exception e){
            System.out.println("No se ha podido leer el archivo: "+ e.getMessage());
        }
        return usuarios;
    }
}
