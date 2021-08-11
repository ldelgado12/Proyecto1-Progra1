package delgado.luis;

import delgado.luis.controlador.Controlador;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Controlador controlador = new Controlador();
        controlador.start();

    }
}
