public class VehiculoCarga extends Vehiculo implements Mantenimiento {
    private double capacidadDeCarga;
    private MedidaCarga medidaCarga;
    private Chofer chofer;

    public VehiculoCarga(Marca marca, String modelo, String patente, String kilometraje, int velocidad, double capacidadDeCarga, MedidaCarga medidaCarga, Chofer chofer, TipoDeVehiculo tipoDeVehiculo) {
        super(marca, modelo, patente, kilometraje, velocidad, tipoDeVehiculo);
        this.capacidadDeCarga = capacidadDeCarga;
        this.medidaCarga = medidaCarga;
        this.chofer = chofer;
    }

    public double getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public MedidaCarga getMedidaCarga() {
        return medidaCarga;
    }
    public String datosCarga() {
        return super.toString() +
               "Capacidad de carga: " + capacidadDeCarga +
               " Medida de carga: " + medidaCarga +
               " Chofer: " + chofer.toString();
    }

    public Chofer getChofer() {
        return chofer;
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
