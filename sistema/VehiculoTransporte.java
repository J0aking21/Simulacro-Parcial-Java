public class VehiculoTransporte extends Vehiculo implements Mantenimiento {
    private int cantDePasajeros;
    private final Categoria categoria;
    public VehiculoTransporte(Marca marca, String modelo, String patente, String kilometraje, int velocidad, int cantDePasajeros, Categoria categoria, TipoDeVehiculo tipoDeVehiculo) {
        super(marca, modelo, patente, kilometraje, velocidad, tipoDeVehiculo);
        this.cantDePasajeros = cantDePasajeros;
        this.categoria = categoria;
    }

    public int getCantDePasajeros() {
        return cantDePasajeros;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public void modificarVelocidad(int velocidad) {
        super.setVelocidad(velocidad);
    }
    @Override
    public void modificarKilometraje(String kilometraje) {
        super.setKilometraje(kilometraje);
    }
    @Override
    public void modificarCapacidad(int capacidad) {
        this.cantDePasajeros = capacidad;
    }

    public String datosTransporte() {
        return super.toString() +
               " Cantidad de Pasajeros: " + cantDePasajeros +
               " Categoria: " + getCategoria() +
               " Chofer: " + chofer.toString();
    }
}

