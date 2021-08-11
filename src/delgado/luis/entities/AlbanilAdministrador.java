package delgado.luis.entities;

import delgado.luis.clases.Persona;

import java.util.ArrayList;
import java.util.Scanner;

import static delgado.luis.controlador.FileControlador.WriteToFile;

public class AlbanilAdministrador extends Persona{

    static ArrayList<Persona> albaniles;
    private static AlbanilAdministrador albanilAdmin = new AlbanilAdministrador();
    private static Scanner scanner = new Scanner(System.in);
    private String id;

    public AlbanilAdministrador (){
        //this.id = id;
        this.albaniles = new ArrayList<Persona>();
    }

    public static void NuevoAlbanil(){
        System.out.println("Ingrese el nombre del Albanil ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del Albanil ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese el id del Albanil ");
        String id = scanner.nextLine();

        Persona newPersona = Persona.crearPersona(nombre, apellido, id);
        //Albanil newAlbanil = Albanil.crearAlbanil(nombre, apellido, id);

        if (albanilAdmin.crearAlbanil(newPersona)){
            System.out.println("Albanil " + nombre + " fue creado");
        }else {
            System.out.println("El albanil ya existe.");
        }
    }

    public boolean crearAlbanil(Persona persona){
        if (encontrarAlbanil(persona.getId())>=0){
            System.out.println("El albanil ya existe");
            return false;
        }
        albaniles.add(persona);
        WriteToFile(albaniles);
        return true;
    }

    private int encontrarAlbanil(String id){
        for (int i=0; i<this.albaniles.size(); i++){
            Persona albanil = this.albaniles.get(i);
            if (albanil.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

}
