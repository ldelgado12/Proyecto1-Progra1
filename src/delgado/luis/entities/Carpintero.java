package delgado.luis.entities;

import delgado.luis.clases.Persona;

public class Carpintero extends Persona {

    public String nombre;
    public String apellido;
    public String id;

    public Carpintero(String nombre, String apellido, String id) {
        super(nombre, apellido, id);
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static Carpintero crearCarpintero(String nombre, String apellido, String id){
        return new Carpintero(nombre, apellido, id);
    }

    @Override
    public String toString() {
        return "Carpintero{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
