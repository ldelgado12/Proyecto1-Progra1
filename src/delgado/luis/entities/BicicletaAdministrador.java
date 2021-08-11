package delgado.luis.entities;

import delgado.luis.clases.Vehiculo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

import static delgado.luis.controlador.FileControlador.WriteToFile;

public class BicicletaAdministrador {


    static ArrayList<Vehiculo> bicicletas;
    private static BicicletaAdministrador BiciAdmin = new BicicletaAdministrador();
    private static Scanner scanner = new Scanner(System.in);
    private String id;

    public BicicletaAdministrador (){
        //this.id = id;
        this.bicicletas = new ArrayList<Vehiculo>();
    }

    public static void NuevaBicicleta(){
        System.out.println("Ingrese la cantidad de llantas de la bicicleta");
        int llantas = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el nombre del automovil");
        String nombreVehiculo = scanner.nextLine();
        System.out.println("digite el id del dueno");
        String id = scanner.nextLine();

        Vehiculo newVehiculo = Vehiculo.crearVehiculo(llantas, nombreVehiculo, id);

        if (BiciAdmin.crearBici(newVehiculo)){
            System.out.println("Automovil " + nombreVehiculo + " fue creado");
        }else {
            System.out.println("El automovil ya existe.");
        }
    }

    public boolean crearBici(Vehiculo vehiculo){
        if (encontrarBici(vehiculo.getNombreVehiculo())>=0){
            System.out.println("El automovil ya existe");
            return false;
        }
        bicicletas.add(vehiculo);
        WriteToFile(bicicletas);
        return true;
    }

    private int encontrarBici(String nombre){
        for (int i = 0; i<this.bicicletas.size(); i++){
            Vehiculo bicicleta = this.bicicletas.get(i);
            if (bicicleta.getNombreVehiculo().equals(nombre)){
                return i;
            }
        }
        return -1;
    }

    protected int encontrarDueno(String id){
        for (int i = 0; i<this.bicicletas.size(); i++){
            Vehiculo bicicleta = this.bicicletas.get(i);
            if (bicicleta.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

//    public String conducirBici(){
//        System.out.println("ingrese el id del dueno");
//        String id = scanner.nextLine();
//
//        if (encontrarDueno(id)>=0){
//            return "El usuario esta conduciendo la bicicleta";
//        }else {
//            return "La bicicleta no puede ser conducida";
//        }
//    }

//    public static void Conducir(){
//        System.out.println(Bicicleta.conducir());
//    }
}
