import java.util.HashMap;
import java.util.Scanner;

public class Empresa {
    public void menuPrincipal() {
        Scanner sc = new Scanner(System.in);

        int opcion;
        char seguir = 's';

        HashMap<String, Vehiculo> vehiculos = new HashMap<>();
        HashMap<String, Chofer>  chofers = new HashMap<>();
        System.out.println("Iniciando Programa....");

        while (seguir == 's') {
            System.out.println("+----------------------------+");
            System.out.println("|        Menu Principal      |");
            System.out.println("+----------------------------+");
            System.out.println("| 1. Cargar Vehiculos        |");
            System.out.println("+----------------------------+");
            System.out.println("| 2. Listar Vehiculos        |");
            System.out.println("+----------------------------+");
            System.out.println("| 3. Eliminar Vehiculo       |");
            System.out.println("+----------------------------+");
            System.out.println("| 4. Realizar Mantenimiento  |");
            System.out.println("+----------------------------+");
            System.out.println("| 5. Mostrar Por Patente     |");
            System.out.println("+----------------------------+");
            System.out.println("| 6. Cargar chofers          |");
            System.out.println("+----------------------------+");
            System.out.println("| 7. Eliminar chofer         |");
            System.out.println("+----------------------------+");
            System.out.println("| 8. Listar chofer           |");
            System.out.println("+----------------------------+");
            System.out.println("| 9. Salir                   |");
            System.out.println("+----------------------------+");
            System.out.println("| Ingrese una opcion: ");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    cargarVehiculos(vehiculos);
                    break;
                case 2:
                    listarVehiculos(vehiculos);
                    break;
                case 3:
                    eliminarVehiculo(vehiculos);
                    break;
                case 4:
                    mantenerVehiculos(vehiculos);
                    break;
                case 5:
                    mostrarPorPatente(vehiculos);
                    break;
                case 6:
                    cargarChofers(chofers);
                    break;
                case 7:
                    eliminarChofer(chofers);
                    break;
                case 8:
                    listarChofers(chofers);
                    break;
                case 9:
                    seguir = 'n';
                    break;
            }
        }
        System.out.println("Finalizando Programa....");
    }

    /// Funciones de carga de vehiculos
    public Marca cargarMarca() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese la Marca del Vehiculo: ");
        opcion = sc.nextInt();
        if (opcion == 1) {
            return Marca.CHEVROLET;
        } else if (opcion == 2) {
            return Marca.FORD;
        } else if (opcion == 3) {
            return Marca.DODGE;
        }else{
            return Marca.JEEP;
        }
    }
    public VehiculoCarga cargarVehiculoCarga() {
        Scanner sc = new Scanner(System.in);

        String modelo, patente, kilometraje;
        int velocidad, capacidad, opcion;
        MedidaCarga medidaCarga;
        Marca marca;

        marca = cargarMarca();

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
        return new VehiculoCarga(marca, modelo, patente, kilometraje, velocidad, capacidad, medidaCarga, TipoDeVehiculo.CARGA);
    }
    public VehiculoTransporte cargarVehiculoPasajeros() {
        Scanner sc = new Scanner(System.in);

        String modelo, patente, kilometraje;
        int velocidad, capacidad, opcion;
        Categoria c;

        Marca marca = cargarMarca();

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

        return new VehiculoTransporte(marca, modelo, patente, kilometraje, velocidad, capacidad, c, TipoDeVehiculo.PASAJEROS);
    }
    public VehiculoEmpresarial cargarVehiculoEmpresarial() {
        Scanner sc = new Scanner(System.in);

        String modelo, patente, kilometraje;
        int velocidad, cantDeButacas, anioDeAdquisicion;
        Marca marca;

        marca = cargarMarca();
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

        return new VehiculoEmpresarial(marca, modelo, patente, kilometraje, velocidad, cantDeButacas, anioDeAdquisicion, TipoDeVehiculo.EMPRESARIAL);
    }
    public void cargarVehiculos(HashMap<String, Vehiculo> vehiculos) {
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
                    vehiculos.put(vc.getPatente(),vc);
                    break;
                case 2:
                    VehiculoTransporte vp = cargarVehiculoPasajeros();
                    vehiculos.put(vp.getPatente(),vp);
                    break;
                case 3:
                    VehiculoEmpresarial ve = cargarVehiculoEmpresarial();
                    vehiculos.put(ve.getPatente(),ve);
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
    public void eliminarVehiculo(HashMap<String, Vehiculo> vehiculos) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la Patente del Vehiculo a eliminar: ");
        String patente = sc.nextLine();

        if (vehiculos.containsKey(patente)) {
            vehiculos.remove(patente);
            System.out.println("Vehiculo Eliminado...");
        } else {
            System.out.println("Vehiculo no encontrado...");
        }
    }
    public void listarVehiculos(HashMap<String, Vehiculo> vehiculos) {
        if (!vehiculos.isEmpty()) {
            for (Vehiculo vehiculo : vehiculos.values()) {
                if( vehiculo instanceof VehiculoTransporte) {
                    System.out.println("[Transporte] " + ((VehiculoTransporte) vehiculo).datosTransporte());
                }else if( vehiculo instanceof VehiculoEmpresarial) {
                    System.out.println("[Empresarial] " + ((VehiculoEmpresarial) vehiculo).datosEmpresarial());

                }else {
                    System.out.println("[Carga]" + ((VehiculoCarga) vehiculo).datosCarga());
                }
            }
        }else {
            System.out.println(" No hay registros para listar...");
        }
    }
    public int seleccionarMantenimiento(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("1. Modificar Capacidad");
        System.out.println("2. Modificar Kilometraje");
        System.out.println("3. Modificar Velocidad");
        System.out.println("Ingrese la opcion deseada: ");
        opcion = sc.nextInt();
        return opcion;
    }
    public void mantenerVehiculos(HashMap<String, Vehiculo> vehiculos) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la Patente del Vehiculo a mantener: ");
        String patente = sc.nextLine();
        int seleccion, capacidad, velocidad;
        String kilometraje;

        for (Vehiculo vehiculo : vehiculos.values()) {
            if ( vehiculo.getTipoDeVehiculo().equals(TipoDeVehiculo.PASAJEROS) && vehiculo.getPatente().equals(patente) ){
                seleccion = seleccionarMantenimiento();
                if ( seleccion == 1 ){
                    System.out.println("Ingrese la nueva capacidad: ");
                    capacidad = sc.nextInt();
                    ((VehiculoTransporte)vehiculo).modificarCapacidad(capacidad);
                }else if (seleccion == 2){
                    System.out.println("Ingrese el nuevo kilometraje: ");
                    kilometraje = sc.nextLine();
                    ((VehiculoTransporte)vehiculo).modificarKilometraje(kilometraje);
                }else {
                    System.out.println("Ingrese la nueva velocidad: ");
                    velocidad = sc.nextInt();
                    ((VehiculoTransporte)vehiculo).modificarVelocidad(velocidad);
                }
            }else if( vehiculo.getTipoDeVehiculo().equals(TipoDeVehiculo.CARGA) && vehiculo.getPatente().equals(patente) ){
                seleccion = seleccionarMantenimiento();
                if ( seleccion == 1 ){
                    System.out.println("Ingrese la nueva capacidad: ");
                    capacidad = sc.nextInt();
                    ((VehiculoCarga)vehiculo).modificarCapacidad(capacidad);
                }else if (seleccion == 2){
                    System.out.println("Ingrese el nuevo kilometraje: ");
                    kilometraje = sc.nextLine();
                    ((VehiculoCarga)vehiculo).modificarKilometraje(kilometraje);
                }else {
                    System.out.println("Ingrese la nueva velocidad: ");
                    velocidad = sc.nextInt();
                    ((VehiculoCarga)vehiculo).modificarVelocidad(velocidad);
                }
            }
        }
    }
    public void mostrarPorPatente(HashMap<String, Vehiculo> vehiculos) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la Patente del Vehiculo a buscar: ");
        String patente = sc.nextLine();

        for (Vehiculo vehiculo : vehiculos.values()) {
            if (vehiculo.getPatente().equals(patente)) {
                if (vehiculo instanceof VehiculoTransporte) {
                    System.out.println(((VehiculoTransporte) vehiculo).datosTransporte());
                }else if( vehiculo instanceof VehiculoEmpresarial) {
                    System.out.println(((VehiculoEmpresarial) vehiculo).datosEmpresarial());
                }else{
                    System.out.println(((VehiculoCarga) vehiculo).datosCarga());
                }
            }
        }
    }

    public Chofer cargachofer() {
        Scanner sc = new Scanner(System.in);
        String nombre, apellido, dni;
        int salario;

        System.out.println("Ingrese el Nombre del Chofer: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el Apellido del Chofer: ");
        apellido = sc.nextLine();
        System.out.println("Ingrese el DNI del Chofer: ");
        dni = sc.nextLine();
        System.out.println("Ingrese el Salario del Chofer x Km: ");
        salario = sc.nextInt();
        return new Chofer(nombre, apellido, dni, salario);
    }
    public void cargarChofers(HashMap<String, Chofer> chofers) {
        Scanner sc = new Scanner(System.in);
        char continuar = 's';
        int i = 0;
        Chofer chofer;

        while (continuar == 's' && i < chofers.size()) {
            chofer = cargachofer();
            chofers.put(chofer.getDni(),chofer);

            System.out.println("Desea ingresar otro chofer?");
            continuar = sc.next().charAt(0);
        }
    }
    public void eliminarChofer(HashMap<String, Chofer> chofers) {
        Scanner sc = new Scanner(System.in);
        String dni;

        System.out.println("Ingrese el DNI del Chofer: ");
        dni = sc.nextLine();

        if (chofers.containsKey(dni)) {
            chofers.remove(dni);
            System.out.println("Chofer eliminado");
        } else  {
            System.out.println("Chofer no encontrado");
        }
    }
    public void listarChofers(HashMap<String, Chofer> chofers) {
        if (!chofers.isEmpty()) {
            for (Chofer chofer : chofers.values()) {
                System.out.println(chofer.toString());
            }
        }else{
            System.out.println("No hay registros que listar");
        }
    }

}
