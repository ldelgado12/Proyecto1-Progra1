package delgado.luis.entities;

import delgado.luis.clases.Persona;

import java.util.ArrayList;
import java.util.Scanner;

import static delgado.luis.controlador.FileControlador.WriteToFile;

public class CocineroAdministrador extends Persona{

    static ArrayList<Persona> cocineros;
    private static CocineroAdministrador cocineroAdmin = new CocineroAdministrador();
    private static Scanner scanner = new Scanner(System.in);

    public CocineroAdministrador(){
        this.cocineros = new ArrayList<Persona>();
    }

    public static void NuevoCocinero(){
        System.out.println("Ingrese el nombre del doctor ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del doctor ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese el id del doctor ");
        String id = scanner.nextLine();

        Persona newPersona = Persona.crearPersona(nombre, apellido, id);

        if (cocineroAdmin.crearCocinero(newPersona)){
            System.out.println("Cocinero " + nombre + " fue creado");
        }else {
            System.out.println("El cocinero ya existe");
        }
    }

    public boolean crearCocinero(Persona persona){
        if (encontrarCocinero(persona.getId())>=0){
            System.out.println("El cocinero ya existe");
            return false;
        }
        cocineros.add(persona);
        WriteToFile(cocineros);
        return true;
    }

    private int encontrarCocinero(String id){
        for (int i=0; i<this.cocineros.size(); i++){
            Persona cocinero = this.cocineros.get(i);
            if (cocinero.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }


}
