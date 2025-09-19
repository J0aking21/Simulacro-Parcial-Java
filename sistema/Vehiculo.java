public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String patente;
    private String kilometraje;
    private int velocidad;
    public  Vehiculo(String marca, String modelo, String patente, String kilometraje, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.kilometraje = kilometraje;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
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
}
