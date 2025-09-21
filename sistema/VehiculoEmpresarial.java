public class VehiculoEmpresarial extends Vehiculo {
    private int cantDeButacas;
    private int anioDeAdquisicion;
    private Chofer chofer;


    public VehiculoEmpresarial(Marca marca, String modelo, String patente, String kilometraje, int velocidad, int cantDeButacas, int anioDeAdquisicion, String nombre, String apellido, String dni, int salario, TipoDeVehiculo tipoDeVehiculo) {
        super(marca, modelo, patente, kilometraje, velocidad, tipoDeVehiculo);
        this.cantDeButacas = cantDeButacas;
        this.anioDeAdquisicion = anioDeAdquisicion;
        this.chofer = new Chofer(nombre, apellido, dni, salario);
    }
}
