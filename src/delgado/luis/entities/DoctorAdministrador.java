package delgado.luis.entities;

import delgado.luis.clases.Persona;

import java.util.ArrayList;
import java.util.Scanner;

import static delgado.luis.controlador.FileControlador.WriteToFile;

public class DoctorAdministrador extends Persona{

    static ArrayList<Persona> doctores;
    private static DoctorAdministrador doctorAdmin = new DoctorAdministrador();
    private static Scanner scanner = new Scanner(System.in);
    private String id;

    public DoctorAdministrador (){
        //this.id = id;
        this.doctores = new ArrayList<>();
    }

    public static void NuevoDoctor(){
        System.out.println("Ingrese el nombre del doctor ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del doctor ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese el id del doctor ");
        String id = scanner.nextLine();
        System.out.println("Ingrese la especializacion del doctor ");
        String especializacion = scanner.nextLine();

        Persona newPersona = Persona.crearPersona(nombre, apellido, id, especializacion);
        //Doctor newDoctor = Doctor.crearDoctor(nombre, apellido, id, especializacion);

        if(doctorAdmin.crearDoctor(newPersona)){
            System.out.println("Doctor " + nombre + " fue creado");
        }else {
            System.out.println("El doctor ya existe.");
        }
    }

    public boolean crearDoctor(Persona persona){
        if(encontrarDoctor(persona.getId())>=0){
            System.out.println("El doctor ya estiste");
            return false;
        }
        doctores.add(persona);
        WriteToFile(doctores);
        return true;
    }

    private int encontrarDoctor(String id){
        for (int i=0; i<this.doctores.size(); i++){
            Persona doctor = this.doctores.get(i);
            if (doctor.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }


}
