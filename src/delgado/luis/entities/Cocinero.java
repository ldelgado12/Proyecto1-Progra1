package delgado.luis.entities;

import delgado.luis.clases.Persona;

public class Cocinero extends Persona {

    public String nombre;
    public String apellido;
    public String id;
    public String recetas;

    public Cocinero(String nombre, String apellido, String id, String recetas) {
        super(nombre, apellido, id);
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.id = id;
        this.recetas = recetas;
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

    public String getRecetas() {
        return recetas;
    }

    public void setRecetas(String recetas) {
        this.recetas = recetas;
    }

    public static Cocinero crearCocinero(String nombre, String apellido, String id, String recetas){
        return new Cocinero(nombre, apellido, id, recetas);
    }

    @Override
    public String toString() {
        return "Cocinero{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", recetas='" + recetas + '\'' +
                '}';
    }
}
