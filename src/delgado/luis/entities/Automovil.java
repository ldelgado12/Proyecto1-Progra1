package delgado.luis.entities;

import delgado.luis.clases.Vehiculo;

import java.util.Scanner;

public class Automovil extends Vehiculo {

    public int llantas;
    public String nombreVehiculo;
    private static Scanner scanner = new Scanner(System.in);

    public Automovil(int llantas, String nombreVehiculo){
        super(llantas, nombreVehiculo);
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

    @Override
    public String conducir() {
        System.out.println("ingrese el id del dueno");
        String id = scanner.nextLine();
        AutomovilAdministrador autoAdm = new AutomovilAdministrador();
        if (autoAdm.encontrarDueno(id)>=0){

            /**
             * Agregar el calculo de los impuestos
             */

            return "El usuario esta conduciendo el automovil";
        }else {
            return "El automovil no puede ser conducido";
        }

    }

    @Override
    public String toString() {
        return "Automovil{" +
                "llantas=" + llantas +
                ", nombreVehiculo='" + nombreVehiculo + '\'' +
                '}';
    }
}
