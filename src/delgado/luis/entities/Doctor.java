package delgado.luis.entities;

import delgado.luis.clases.Persona;

import javax.print.Doc;

public class Doctor extends Persona{

    public String nombre;
    public String apellido;
    public String id;
    public String especializacion;

    public Doctor(String nombre, String apellido, String id, String especializacion) {
        super(nombre, apellido, id);
        //this.nombre = nombre;
        //this.apellido = apellido;
        //this.id = id;
        this.especializacion = especializacion;
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

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static Persona crearPersona(String nombre, String apellido, String id, String especializacion){
        return new Doctor(nombre, apellido, id, especializacion);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", especializacion='" + especializacion + '\'' +
                '}';
    }
}
