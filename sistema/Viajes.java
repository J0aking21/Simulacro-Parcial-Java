import java.util.UUID;

public class Viajes {
    private  String destino;
    private double distancia;
    private double tarifa;
    private UUID id;

    public Viajes(String destino, double distancia, double tarifa, int id) {
        this.destino = destino;
        this.distancia = distancia;
        this.tarifa = tarifa;
        this.id = UUID.randomUUID();
    }
    public String retornarDatosViaje(Chofer chofer, Vehiculo vehiculo){
        if( vehiculo.getTipoDeVehiculo().equals(TipoDeVehiculo.CARGA) && vehiculo instanceof VehiculoCarga){
            return  " Datos del Viaje " +
                    " Dni Chofer: " + chofer.getDni() +
                    " Patente Vehiculo: " + vehiculo.getPatente() +
                    " Capacidad de carga: " + ((VehiculoCarga) vehiculo).getCapacidadDeCarga() +
                    " Destino:" + destino +
                    " Distancia: " + distancia +
                    " Tarifa: " + tarifa +
                    " Numero Id: " + id;
        } else if (vehiculo.getTipoDeVehiculo().equals(TipoDeVehiculo.PASAJEROS) && vehiculo instanceof VehiculoTransporte){
            return  " Datos del Viaje " +
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
