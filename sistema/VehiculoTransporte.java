public class VehiculoTransporte extends Vehiculo implements Mantenimiento {
    private int cantDePasajeros;
    private final Categoria categoria;
    private final Chofer chofer;

    public VehiculoTransporte(Marca marca, String modelo, String patente, String kilometraje, int velocidad, int cantDePasajeros, Categoria categoria,String nombre, String apellido, String dni, int salario, TipoDeVehiculo tipoDeVehiculo) {
        super(marca, modelo, patente, kilometraje, velocidad, tipoDeVehiculo);
        this.cantDePasajeros = cantDePasajeros;
        this.categoria = categoria;
        this.chofer = new Chofer(nombre, apellido, dni, salario);
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

