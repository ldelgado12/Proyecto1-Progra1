package delgado.luis.clases;

import delgado.luis.entities.Doctor;

public class Persona {

    private String nombre;
    private String apellido;
    private String id;
    private String dato;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    public Persona(String nombre, String apellido, String id, String dato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.dato = dato;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getId() {
        return id;
    }

    public static Persona crearPersona(String nombre, String apellido, String id){
        return new Persona(nombre, apellido, id);
    }

    public static Persona crearPersona(String nombre, String apellido, String id, String dato){
        return new Persona(nombre, apellido, id, dato);
    }

    public String administrarDinero(){
        return "Calculo de administrar dinero";
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", dato='" + dato + '\'' +
                '}';
    }

}
