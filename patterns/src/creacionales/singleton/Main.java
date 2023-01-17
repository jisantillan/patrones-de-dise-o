package creacionales.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setContador(15);
        System.out.println(singleton );
        Singleton singleton2 = Singleton.getInstance();
        singleton2.setContador(1);
        System.out.println(singleton2 );
        System.out.println(singleton.getContador() );

    }
}