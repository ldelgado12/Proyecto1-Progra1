package delgado.luis.entities;

import delgado.luis.clases.Vehiculo;

import java.util.Scanner;

public class Bicicleta extends Vehiculo {

    public int llantas;
    public String nombreVehiculo;
    public String id;
    private static Scanner scanner = new Scanner(System.in);

    public Bicicleta() {
    }

    public Bicicleta(int llantas, String nombreVehiculo, String  id){
        super(llantas, nombreVehiculo);
        this.id = id;
    }

    @Override
    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    @Override
    public String getNombreVehiculo() {
        return nombreVehiculo;
    }

    public void setNombreVehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String conducir() {

        System.out.println("ingrese el id del dueno");
        String id = scanner.nextLine();
        BicicletaAdministrador biciAdm = new BicicletaAdministrador();
        if (biciAdm.encontrarDueno(id)>=0){
            return "El usuario esta conduciendo la bicicleta, debe mantener el balance y pedalear de manera continua";
        }else {
            return "La bicicleta no puede ser conducida";
        }
    }



    @Override
    public String toString() {
        return "Bicicleta{" +
                "llantas=" + llantas +
                ", nombreVehiculo='" + nombreVehiculo + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
