public abstract class Vehiculo {
    private final Marca marca;
    private final String modelo;
    private final String patente;
    private String kilometraje;
    private int velocidad;
    private final TipoDeVehiculo tipoDeVehiculo;

    public  Vehiculo(Marca marca, String modelo, String patente, String kilometraje, int velocidad, TipoDeVehiculo tipoDeVehiculo) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.kilometraje = kilometraje;
        this.velocidad = velocidad;
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    public Marca getMarca(){
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPatente() {
        return patente;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public TipoDeVehiculo getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    @Override
    public String toString() {
        return " Marca: " + getMarca() +
               " Modelo: " + getModelo() +
               " Patente: " + getPatente() +
               " Kilometraje: " + getKilometraje() +
               " Velocidad: " + getVelocidad();

    }
}
