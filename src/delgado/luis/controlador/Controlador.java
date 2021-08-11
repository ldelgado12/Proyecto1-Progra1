package delgado.luis.controlador;

import delgado.luis.clases.Vehiculo;
import delgado.luis.entities.Bicicleta;
import delgado.luis.entities.BicicletaAdministrador;

import java.io.IOException;
import java.util.Scanner;

import static delgado.luis.controlador.FileControlador.ContinuarMundo;
import static delgado.luis.controlador.FileControlador.ReadFile;
import static delgado.luis.entities.AlbanilAdministrador.NuevoAlbanil;
import static delgado.luis.entities.AutomovilAdministrador.NuevoAutomovil;
//import static delgado.luis.entities.BicicletaAdministrador.Conducir;
import static delgado.luis.entities.BicicletaAdministrador.NuevaBicicleta;
import static delgado.luis.entities.CarpinteroAdministrador.NuevoCarpintero;
import static delgado.luis.entities.CocineroAdministrador.NuevoCocinero;
import static delgado.luis.entities.DoctorAdministrador.NuevoDoctor;
import static delgado.luis.entities.HerreroAdministrador.NuevoHerrero;

public class Controlador {

    private static Scanner scanner = new Scanner(System.in);
    private static FileControlador fileContro = new FileControlador();
    String answer;

    public void start() throws IOException {
        String opcion;


        do {
            System.out.println("Que accion desea ejecutar?");
            answer = scanner.nextLine().toLowerCase();
            opcion = answer;
            procesarOpcion(opcion);
        } while (opcion != "salir");

    }

    public void procesarOpcion(String pOpcion) throws IOException{
        switch (pOpcion){
            case "ayuda":
                ShowMenu();
                break;
            case "salir":
                answer = "salir";
                System.out.println("Ejecutar la accion de guardar la info");
                break;
            case "comenzar nuevo mundo":
                fileContro.CrearNuevoMundo();
                System.out.println("nuevo mundo");
                break;
            case "comenzar mundo":
                ContinuarMundo();
                break;
            case "crear doctor":
                NuevoDoctor();
                break;
            case "crear cocinero":
                NuevoCocinero();
                System.out.println("funciones de crear cocinero");
                break;
            case "crear albanil":
                NuevoAlbanil();
                System.out.println("funciones de creando un albanil");
                break;
            case "crear herrero":
                NuevoHerrero();
                System.out.println("funciones de creando un herrero");
                break;
            case "crear carpintero":
                NuevoCarpintero();
                System.out.println("funciones de creando un carpintero");
                break;
            case "contruir casa":
                System.out.println("funciones de construyendo una casa");
                break;
            case "sembrar arbol":
                System.out.println("funciones de sembrando un arbol");
                break;
            case "construir bicicleta":
                NuevaBicicleta();
                System.out.println("funciones de construyendo bici");
                break;
            case "comprar bicicleta":
                System.out.println("funciones de comprando bici");
                break;
            case "conducir bicicleta":
                Bicicleta bici = new Bicicleta();
                //bici.conducir();
                System.out.println(bici.conducir());
                break;
            case "construir automovil":
                NuevoAutomovil();
                System.out.println("funciones de construyendo un auto");
                break;
            case "comprar automovil":
                System.out.println("funciones de comprando un carro");
                break;
            case "conducir automovil":
                System.out.println("funciones de conduciendo un carro");
                break;
            case "solicitar prestamo":
                System.out.println("funciones de solicitando prestamo");
                break;
            case "imprimir estadisticas":
                ReadFile();
                break;
        }
    }

    public void ShowMenu() throws IOException{
        System.out.println("Ayuda");
        System.out.println("Salir");
        System.out.println("Comenzar nuevo mundo");
        System.out.println("Comenzar mundo");
        System.out.println("Crear doctor");
        System.out.println("Crear cocinero");
        System.out.println("Crear albañil");
        System.out.println("Crear herrero");
        System.out.println("Crear carpintero");
        System.out.println("Construir casa");
        System.out.println("Sembrar árbol");
        System.out.println("Construir bicicleta");
        System.out.println("Comprar bicicleta");
        System.out.println("Conducir bicicleta");
        System.out.println("Construir automóvil");
        System.out.println("Comprar automóvil");
        System.out.println("Conducir automóvil");
        System.out.println("Solicitar préstamo");
        System.out.println("Imprimir estadísticas");

    }

}
