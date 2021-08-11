package delgado.luis.entities;

import delgado.luis.clases.Persona;

public class Herrero extends Persona {

    public String nombre;
    public String apellido;
    public String id;

    public Herrero(String nombre, String apellido, String id) {
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

    public static Herrero crearHerrero(String nombre, String apellido, String id){
        return new Herrero(nombre, apellido, id);
    }

    @Override
    public String toString() {
        return "Herrero{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
