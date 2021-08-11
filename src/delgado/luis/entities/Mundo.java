package delgado.luis.entities;

public class Mundo {

    public String nombre;

    public Mundo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Mundo crearMundo (String nombre){
        return new Mundo(nombre);
    }
}
