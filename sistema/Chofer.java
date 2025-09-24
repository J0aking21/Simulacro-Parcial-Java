public class Chofer {
    private final String nombre;
    private final String apellido;
    private final String dni;
    private double salario;

    public Chofer(String nombre, String apellido, String dni, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return " Nombre: " + nombre +
               " Apellido: " + apellido +
               " Dni: " + dni +
               " Salario: " + getSalario();
    }

}
