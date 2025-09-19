public class VehiculoCarga extends Vehiculo implements Mantenimiento {
    private double capacidadDeCarga;
    private MedidaCarga medidaCarga;
    private Chofer chofer;

    public VehiculoCarga(String marca, String modelo, String patente, String kilometraje, int velocidad, double capacidadDeCarga, MedidaCarga medidaCarga,String nombre, String apellido, String dni, int salario) {
        super(marca, modelo, patente, kilometraje, velocidad);
        this.capacidadDeCarga = capacidadDeCarga;
        this.medidaCarga = medidaCarga;
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
        this.capacidadDeCarga = capacidad;
    }
}
