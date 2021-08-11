package delgado.luis.entities;

import delgado.luis.clases.Persona;

import java.util.ArrayList;
import java.util.Scanner;

import static delgado.luis.controlador.FileControlador.WriteToFile;

public class CarpinteroAdministrador extends Persona {

    static ArrayList<Persona> carpinteros;
    private static CarpinteroAdministrador carpinteroAdmin = new CarpinteroAdministrador();
    private static Scanner scanner = new Scanner(System.in);
    private String id;

    public CarpinteroAdministrador (){
       // this.id = id;
        this.carpinteros = new ArrayList<Persona>();
    }

    public static void NuevoCarpintero(){
        System.out.println("Ingrese el nombre del Carpintero ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del Carpintero ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese el id del Carpintero ");
        String id = scanner.nextLine();

        Persona newPersona = Persona.crearPersona(nombre, apellido, id);

        if (carpinteroAdmin.crearCarpintero(newPersona)){
            System.out.println("Carpintero "+nombre+ " fue creado");
        }else {
            System.out.println("El carpintero ya existe");
        }
    }

    public boolean crearCarpintero(Persona persona){
        if (encontrarCarpintero(persona.getId())>=0){
            System.out.println("El carpintero ya existe");
            return false;
        }
        carpinteros.add(persona);
        WriteToFile(carpinteros);
        return true;
    }

    private int encontrarCarpintero(String id){
        for (int i=0; i<this.carpinteros.size(); i++){
            Persona carpintero = this.carpinteros.get(i);
            if (carpintero.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

}
