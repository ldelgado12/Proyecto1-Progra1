package delgado.luis.clases;

public class Vehiculo {

    private int llantas;
    private String nombreVehiculo;
    private String id;

    public Vehiculo() {
    }

    public Vehiculo(int llantas, String nombreVehiculo) {

        this.llantas = llantas;
        this.nombreVehiculo = nombreVehiculo;
    }

    public Vehiculo(int llantas, String nombreVehiculo, String id) {

        this.llantas = llantas;
        this.nombreVehiculo = nombreVehiculo;
        this.id = id;
    }

    public int getLlantas() {
        return llantas;
    }

    public String getNombreVehiculo() {
        return nombreVehiculo;
    }

    public  String conducir(){
        return "Calculo de conducir";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static Vehiculo crearVehiculo(int llantas, String nombreVehiculo){
        return new Vehiculo(llantas, nombreVehiculo);
    }

    public static Vehiculo crearVehiculo(int llantas, String nombreVehiculo, String dato){
        return new Vehiculo(llantas, nombreVehiculo, dato);
    }



    @Override
    public String toString() {
        return "Vehiculo{" +
                "llantas=" + llantas +
                ", nombreVehiculo='" + nombreVehiculo + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
