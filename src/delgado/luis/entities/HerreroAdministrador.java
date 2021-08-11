package delgado.luis.entities;

import delgado.luis.clases.Persona;

import java.util.ArrayList;
import java.util.Scanner;

import static delgado.luis.controlador.FileControlador.WriteToFile;

public class HerreroAdministrador extends Persona {

    static ArrayList<Persona> herreros;
    private static HerreroAdministrador herreroAdmin = new HerreroAdministrador();
    private static Scanner scanner = new Scanner(System.in);

    public HerreroAdministrador (){
        //this.id = id;
        this.herreros = new ArrayList<Persona>();
    }

    public static void NuevoHerrero() {
        System.out.println("Ingrese el nombre del doctor ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del doctor ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese el id del doctor ");
        String id = scanner.nextLine();

        Persona newPersona = Persona.crearPersona(nombre, apellido, id);

        if(herreroAdmin.crearHerrero(newPersona)){
            System.out.println("Herrero " + nombre + " fue creado");
        }else {
            System.out.println("El Herrero ya existe.");
        }
    }

    public boolean crearHerrero(Persona persona){
        if(encontrarHerrero(persona.getId())>=0){
            System.out.println("El herrero ya estiste");
            return false;
        }
        herreros.add(persona);
        WriteToFile(herreros);
        return true;
    }

    private int encontrarHerrero(String id){
        for (int i=0; i<this.herreros.size(); i++){
            Persona herrero = this.herreros.get(i);
            if (herrero.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }


}
