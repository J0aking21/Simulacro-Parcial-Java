public class Viajes {
    private  String destino;
    private double distancia;
    private double tarifa;
    private int id;
    private Chofer chofer;
    private Vehiculo vehiculo;

    public Viajes(Chofer chofer, Vehiculo vehiculo, String destino, double distancia, double tarifa) {
        this.chofer = chofer;
        this.vehiculo = vehiculo;
        this.destino = destino;
        this.distancia = distancia;
        this.tarifa = tarifa;
        this.id = id++;
    }

    public int getId() {
        return id;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public Chofer getChofer() {
        return chofer;
    }

    public double getTarifa() {
        return tarifa;
    }

    public double getDistancia() {
        return distancia;
    }

    public String retornarDatosViaje(){
        if( vehiculo.getTipoDeVehiculo().equals(TipoDeVehiculo.CARGA) && vehiculo instanceof VehiculoCarga){
            return  " [Datos del Viaje] " +
                    " Dni Chofer: " + chofer.getDni() +
                    " Patente Vehiculo: " + vehiculo.getPatente() +
                    " Capacidad de carga: " + ((VehiculoCarga) vehiculo).getCapacidadDeCarga() +
                    " Destino:" + destino +
                    " Distancia: " + distancia +
                    " Tarifa: " + tarifa +
                    " Numero Id: " + id;
        } else if (vehiculo.getTipoDeVehiculo().equals(TipoDeVehiculo.PASAJEROS) && vehiculo instanceof VehiculoTransporte){
            return  " [Datos del Viaje] " +
                    " Dni Chofer: " + chofer.getDni() +
                    " Patente Vehiculo: " + vehiculo.getPatente() +
                    " Pasajeros: " + ((VehiculoTransporte) vehiculo).getCantDePasajeros() +
                    " Destino:" + destino +
                    " Distancia: " + distancia +
                    " Tarifa: " + tarifa +
                    " Numero Id: " + id;
        }else{
            return "No se realizaron viajes";
        }
    }
}
