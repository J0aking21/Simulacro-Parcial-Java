import java.util.HashMap;
import java.util.Scanner;

public class Empresa {
    public void MenuPrincpal() {
        Scanner sc = new Scanner(System.in);

        int opcion;
        char seguir = 's';

        HashMap<Integer, Vehiculo> vehiculos = new HashMap<>();

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
                    MenuCarga(vehiculos);
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
    public void MenuCarga(HashMap<Integer, Vehiculo> vehiculos) {
        Scanner sc = new Scanner(System.in);

        int opcion, i = 0;
        char seguir1 = 's';

        while (seguir1 == 's' && i < vehiculos.size()) {
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
                    VehiculoCarga vc = cargarVehiculoCarga();
                    vehiculos.put(i,vc);
                    break;
                case 2:
                    VehiculoTransporte vp = cargarVehiculoPasajeros();
                    vehiculos.put(i,vp);
                    break;
                case 3:
                    VehiculoEmpresarial ve = cargarVehiculoEmpresarial();
                    vehiculos.put(i,ve);
                    break;
                case 4:
                    seguir1 = 'n';
            }
            i++;
            if(seguir1 == 'n'){
                System.out.println("Retornando al Menu Principal....");
            }
        }
    }
    public VehiculoCarga cargarVehiculoCarga() {
        Scanner sc = new Scanner(System.in);

        String modelo, patente, kilometraje, nombre, apellido, dni;
        int velocidad, capacidad, opcion, salario;
        MedidaCarga medidaCarga;
        Marca marca;

        System.out.println("Ingrese la Marca del Vehiculo: ");
        opcion = sc.nextInt();
        if (opcion == 1) {
            marca = Marca.CHEVROLET;
        } else if (opcion == 2) {
            marca = Marca.FORD;
        } else if (opcion == 3) {
            marca = Marca.DODGE;
        } else {
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
        if (opcion == 1) {
            medidaCarga = MedidaCarga.KGS;
        } else if (opcion == 2) {
            medidaCarga = MedidaCarga.LBS;
        } else {
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

        return new VehiculoCarga(marca, modelo, patente, kilometraje, velocidad, capacidad, medidaCarga, nombre, apellido, dni, salario, TipoDeVehiculo.CARGA);
    }
    public VehiculoTransporte cargarVehiculoPasajeros() {
        Scanner sc = new Scanner(System.in);

        String modelo, patente, kilometraje, nombre, apellido, dni;
        int velocidad, capacidad, opcion, salario;
        Categoria c;
        Marca marca;

        System.out.println("Ingrese la Marca del Vehiculo: ");
        opcion = sc.nextInt();
        if (opcion == 1) {
            marca = Marca.CHEVROLET;
        } else if (opcion == 2) {
            marca = Marca.FORD;
        } else if (opcion == 3) {
            marca = Marca.DODGE;
        } else {
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
        System.out.println("Ingrese la cantidad de pasajeros del Vehiculo: ");
        capacidad = sc.nextInt();
        System.out.println("Ingrese la categoria del Vehiculo: ");
        opcion = sc.nextInt();
        if (opcion == 1) {
            c = Categoria.STANDARD;
        } else if (opcion == 2) {
            c = Categoria.PREMIUM;
        }else {
            c = Categoria.DELUXE;
        }
        System.out.println("Ingrese el Nombre del Chofer: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el Apellido del Chofer: ");
        apellido = sc.nextLine();
        System.out.println("Ingrese el DNI del Chofer: ");
        dni = sc.nextLine();
        System.out.println("Ingrese el Salario del Chofer x Km: ");
        salario = sc.nextInt();

        return new VehiculoTransporte(marca, modelo, patente, kilometraje, velocidad,capacidad,c, nombre, apellido, dni, salario, TipoDeVehiculo.PASAJEROS);
    }
    public VehiculoEmpresarial cargarVehiculoEmpresarial() {
        Scanner sc = new Scanner(System.in);

        String modelo, patente, kilometraje, nombre, apellido, dni;
        int velocidad, cantDeButacas, anioDeAdquisicion, opcion, salario;
        Marca marca;

        System.out.println("Ingrese la Marca del Vehiculo: ");
        opcion = sc.nextInt();
        if (opcion == 1) {
            marca = Marca.CHEVROLET;
        } else if (opcion == 2) {
            marca = Marca.FORD;
        } else if (opcion == 3) {
            marca = Marca.DODGE;
        } else {
            marca = Marca.JEEP;
        }
        System.out.println("Ingrese el Modelo del Vehiculo: ");
        modelo = sc.nextLine();
        System.out.println("Ingrese la Patente del Vehiculo: ");
        patente = sc.nextLine();
        System.out.println("Ingrese la cantidad de butacas del vehiculo:");
        cantDeButacas = sc.nextInt();
        System.out.println("Ingrese el año de adquisicion del vehiculo:");
        anioDeAdquisicion = sc.nextInt();
        System.out.println("Ingrese el Kilometraje del Vehiculo: ");
        kilometraje = sc.nextLine();
        System.out.println("Ingrese la Velocidad del Vehiculo: ");
        velocidad = sc.nextInt();
        System.out.println("Ingrese el Nombre del Chofer: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el Apellido del Chofer: ");
        apellido = sc.nextLine();
        System.out.println("Ingrese el DNI del Chofer: ");
        dni = sc.nextLine();
        System.out.println("Ingrese el Salario del Chofer x Km: ");
        salario = sc.nextInt();

        return new VehiculoEmpresarial(marca,modelo,patente,kilometraje,velocidad,cantDeButacas,anioDeAdquisicion,nombre,apellido,dni,salario,TipoDeVehiculo.EMPRESARIAL);
    }
    public void listarVehiculos(HashMap<Integer, Vehiculo> vehiculos) {
        for (Vehiculo vehiculo : vehiculos.values()) {
            if( vehiculo instanceof VehiculoTransporte) {
                System.out.println(" Lista de Vehiculos de transporte ");
                System.out.println(((VehiculoTransporte) vehiculo).datosTransporte());
            }else if( vehiculo instanceof VehiculoEmpresarial) {
                System.out.println(" Lista de Vehiculos de empresarial");

            }else {
                System.out.println(" Lista de Vehiculos de carga ");
            }
        }
    }
}
