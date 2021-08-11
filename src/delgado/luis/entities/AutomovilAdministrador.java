package delgado.luis.entities;

import delgado.luis.clases.Persona;
import delgado.luis.clases.Vehiculo;

import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

import static delgado.luis.controlador.FileControlador.WriteToFile;

public class AutomovilAdministrador extends Vehiculo{

    static ArrayList<Vehiculo> automoviles;
    private static AutomovilAdministrador AutomovilAdmin = new AutomovilAdministrador();
    private static Scanner scanner = new Scanner(System.in);
    private String id;

    public AutomovilAdministrador (){
        //this.id = id;
        this.automoviles = new ArrayList<Vehiculo>();
    }

    public static void NuevoAutomovil(){
        System.out.println("Ingrese la cantidad de llantas del automovil");
        int llantas = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el nombre del automovil");
        String nombreVehiculo = scanner.nextLine();

        Vehiculo newVehiculo = Vehiculo.crearVehiculo(llantas, nombreVehiculo);

        if (AutomovilAdmin.crearAuto(newVehiculo)){
            System.out.println("Automovil " + nombreVehiculo + " fue creado");
        }else {
            System.out.println("El automovil ya existe.");
        }
    }

    public boolean crearAuto(Vehiculo vehiculo){
        if (encontrarAuto(vehiculo.getNombreVehiculo())>=0){
            System.out.println("El automovil ya existe");
            return false;
        }
        automoviles.add(vehiculo);
        WriteToFile(automoviles);
        return true;
    }

    private int encontrarAuto(String nombre){
        for (int i = 0; i<this.automoviles.size(); i++){
            Vehiculo automovil = this.automoviles.get(i);
            if (automovil.getNombreVehiculo().equals(nombre)){
                return i;
            }
        }
        return -1;
    }

    protected int encontrarDueno(String id){
        for (int i = 0; i<this.automoviles.size(); i++){
            Vehiculo automovil = this.automoviles.get(i);
            if (automovil.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

}
