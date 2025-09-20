public class Chofer {
    private String nombre;
    private String apellido;
    private String dni;
    private int salario;

    public Chofer(String nombre, String apellido, String dni, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }
}
