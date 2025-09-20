public abstract class Vehiculo {
    private Marca marca;
    private String modelo;
    private String patente;
    private String kilometraje;
    private int velocidad;
    private TipoDeVehiculo tipoDeVehiculo;

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

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
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
}
