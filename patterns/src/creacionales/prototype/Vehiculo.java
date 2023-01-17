package creacionales.prototype;

public class Vehiculo {
    private String marca;
    private String tipo;
    private String motor;
    private int puertas;

    public Vehiculo clonar() {
        Vehiculo clon = new Vehiculo();
        clon.marca = this.marca;
        clon.tipo = this.tipo;
        clon.puertas = this.puertas;

        return clon;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
}
