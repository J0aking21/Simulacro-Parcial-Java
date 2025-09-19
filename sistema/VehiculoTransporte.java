public class VehiculoTransporte extends Vehiculo implements Mantenimiento {
    private int cantDePasajeros;
    private Categoria categoria;
    private Chofer chofer;

    public VehiculoTransporte(String marca, String modelo, String patente, String kilometraje, int velocidad, int cantDePasajeros, Categoria categoria,String nombre, String apellido, String dni, int salario) {
        super(marca, modelo, patente, kilometraje, velocidad);
        this.cantDePasajeros = cantDePasajeros;
        this.categoria = categoria;
        this.chofer = new Chofer(nombre, apellido, dni, salario);
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
}
