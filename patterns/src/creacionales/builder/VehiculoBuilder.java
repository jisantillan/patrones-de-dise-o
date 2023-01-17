package creacionales.builder;

public class VehiculoBuilder {

    Vehiculo vehiculo;
    public VehiculoBuilder(String marca){
        vehiculo = new Vehiculo();
        vehiculo.setMarca(marca);
    }

    public Vehiculo build(){
        return this.vehiculo;
    }

    // propiedades de fluidez

    public VehiculoBuilder setPuertas(int puertas){
        this.vehiculo.setPuertas(puertas);
        return this; // devuelve la clase VehiculoBuilder
    }


    public VehiculoBuilder setMotor(String motor){
        this.vehiculo.setMotor(motor);
        return this; // devuelve la clase VehiculoBuilder
    }
}
