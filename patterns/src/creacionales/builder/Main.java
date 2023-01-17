package creacionales.builder;

public class Main {
    public static void main (String [] args){
        Vehiculo v = new VehiculoBuilder("Ford")
                .setPuertas(4)
                .setMotor("v8")
                .build();
        System.out.println(v.getMarca());
    }
}
