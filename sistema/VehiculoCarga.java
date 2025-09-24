public class VehiculoCarga extends Vehiculo implements Mantenimiento {
    private double capacidadDeCarga;
    private final MedidaCarga medidaCarga;

    public VehiculoCarga(Marca marca, String modelo, String patente, String kilometraje, int velocidad, double capacidadDeCarga, MedidaCarga medidaCarga, TipoDeVehiculo tipoDeVehiculo) {
        super(marca, modelo, patente, kilometraje, velocidad, tipoDeVehiculo);
        this.capacidadDeCarga = capacidadDeCarga;
        this.medidaCarga = medidaCarga;
    }

    public double getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public MedidaCarga getMedidaCarga() {
        return medidaCarga;
    }

    public String datosCarga() {
        return "[Carga]" +
                super.toString() +
               "Capacidad de carga: " + capacidadDeCarga +
               " Medida de carga: " + getMedidaCarga();
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
