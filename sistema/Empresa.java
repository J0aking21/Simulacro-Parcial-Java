import java.util.Scanner;

public class Empresa {
    public void MenuPrincpal() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        char seguir = 's';
        while (seguir == 's') {
            System.out.println("+----------------------+");
            System.out.println("|    Menu Principal    |");
            System.out.println("+----------------------+");
            System.out.println("| 1. Cargar Vehiculos  |");
            System.out.println("+----------------------+");
            System.out.println("| 2. Listar Vehiculos  |");
            System.out.println("+----------------------+");
            System.out.println("| 3. Salir del Menu    |");
            System.out.println("+----------------------+");
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    MenuCarga();
                    break;
                case 2:
                    System.out.println("Listando Vehiculos....");
                    break;
                case 3:
                    seguir = 'n';
            }
        }
        System.out.println("Finalizando Programa....");
    }
    public void MenuCarga() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        char seguir1 = 's';
        while (seguir1 == 's') {
            System.out.println("+-----------------------------------+");
            System.out.println("|          Menu De Carga            |");
            System.out.println("+-----------------------------------+");
            System.out.println("| 1. Carga de Vehiculo De Carga     |");
            System.out.println("+-----------------------------------+");
            System.out.println("| 2. Carga de Vehiculo De Pasajeros |");
            System.out.println("+-----------------------------------+");
            System.out.println("| 3. Carga de Vehiculo Empresarial  |");
            System.out.println("+-----------------------------------+");
            System.out.println("| 4. Volver al Menu Principal       |");
            System.out.println("+-----------------------------------+");
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Cargando Vehiculo De Carga....");
                    break;
                case 2:
                    System.out.println("Cargando Vehiculo De Pasajeros....");
                    break;
                case 3:
                    System.out.println("Cargando Vehiculo Empresarial....");
                    break;
                case 4:
                    seguir1 = 'n';
            }
            if(seguir1 == 'n'){
                System.out.println("Retornando al Menu Principal....");
            }
        }
    }
    public VehiculoCarga cargarVehiculoCarga(){
        Scanner sc = new Scanner(System.in);

        String modelo, patente, kilometraje, nombre, apellido, dni;
        int velocidad, capacidad, opcion, salario;
        MedidaCarga medidaCarga;
        Marca marca;
        double tarifa;

        System.out.println("Ingrese la Marca del Vehiculo: ");
        opcion = sc.nextInt();
        if (opcion == 1){
            marca = Marca.CHEVROLET;
        }else if ( opcion == 2 ){
            marca = Marca.FORD;
        }else if ( opcion == 3 ){
            marca = Marca.DODGE;
        }else {
            marca = Marca.JEEP;
        }
        System.out.println("Ingrese el Modelo del Vehiculo: ");
        modelo = sc.nextLine();
        System.out.println("Ingrese la Patente del Vehiculo: ");
        patente = sc.nextLine();
        System.out.println("Ingrese el Kilometraje del Vehiculo: ");
        kilometraje = sc.nextLine();
        System.out.println("Ingrese la Velocidad del Vehiculo: ");
        velocidad = sc.nextInt();
        System.out.println("Ingrese la Capacidad de Carga del Vehiculo: ");
        capacidad = sc.nextInt();
        System.out.println("Ingrese la Medida de Carga del Vehiculo: ");
        opcion = sc.nextInt();
        if (opcion == 1){
            medidaCarga = MedidaCarga.KGS;
        } else if ( opcion == 2 ){
            medidaCarga= MedidaCarga.LBS;
        }else{
            medidaCarga = MedidaCarga.LTS;
        }
        System.out.println("Ingrese el Nombre del Chofer: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el Apellido del Chofer: ");
        apellido = sc.nextLine();
        System.out.println("Ingrese el DNI del Chofer: ");
        dni = sc.nextLine();
        System.out.println("Ingrese el Salario del Chofer x Km: ");
        salario = sc.nextInt();

        return new VehiculoCarga(marca,modelo,patente,kilometraje,velocidad,capacidad,medidaCarga,nombre,apellido,dni,salario,TipoDeVehiculo.CARGA);
    }
/*    public VehiculoTransporte cargarVehiculoTransporte(){
    }
    public VehiculoEmpresarial cargarVehiculoEmpresarial(){
    }*/
}
