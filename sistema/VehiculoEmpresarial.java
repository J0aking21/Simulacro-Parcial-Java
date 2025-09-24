public class VehiculoEmpresarial extends Vehiculo {
    private int cantDeButacas;
    private int anioDeAdquisicion;


    public VehiculoEmpresarial(Marca marca, String modelo, String patente, String kilometraje, int velocidad, int cantDeButacas, int anioDeAdquisicion, TipoDeVehiculo tipoDeVehiculo) {
        super(marca, modelo, patente, kilometraje, velocidad, tipoDeVehiculo);
        this.cantDeButacas = cantDeButacas;
        this.anioDeAdquisicion = anioDeAdquisicion;
    }

    public int getCantDeButacas() {
        return cantDeButacas;
    }

    public void setCantDeButacas(int cantDeButacas) {
        this.cantDeButacas = cantDeButacas;
    }

    public int getAnioDeAdquisicion() {
        return anioDeAdquisicion;
    }

    public void setAnioDeAdquisicion(int anioDeAdquisicion) {
        this.anioDeAdquisicion = anioDeAdquisicion;
    }

    public String datosEmpresarial() {
        return super.toString() +
               " Cantidad de butacas: " + getCantDeButacas() +
               " Año de adquisicion: " + getAnioDeAdquisicion();
    }
}
