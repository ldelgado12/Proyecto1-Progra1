package delgado.luis.controlador;

import javax.swing.*;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FileControlador {

    private static Scanner scanner = new Scanner(System.in);

    public static String mundoSeleccionado = "Primer mundo";

    /**
     * The output will be:  File created: filename.txt
     *
     *     To create a file in a specific directory (requires permission), specify the path
     *     of the file and use double backslashes to escape the "\" character (for Windows).
     *     example
     *     File myObj = new File("C:\\Users\\MyName\\filename.txt");
     */

    public static void CrearNuevoMundo() {
        try {
            System.out.println("Agregue el nombre del nuevo mundo");
            String NuevoMundo = scanner.nextLine();
            File myObj = new File(NuevoMundo+".txt");
            mundoSeleccionado = NuevoMundo+".txt";
            if (myObj.createNewFile()) {
                System.out.println("Nuevo mundo : " + myObj.getName() + " creado");
            } else {
                System.out.println("El nombre del mundo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("a ocurrido un error.");
            e.printStackTrace();
        }
    }

    public static void ContinuarMundo(){
        System.out.println("Por favor escriba nombre del mundo que desea jugar");
        mundoSeleccionado = scanner.nextLine();
    }

    /**
     * In the following example, we use the FileWriter class together with its write() method
     * to write some text to the file we created in the example above. Note that when you are
     * done writing to the file, you should close it with the close() method:
     */


    public static void WriteToFile (ArrayList nuevoDato) {
        try {
            if (mundoSeleccionado == " "){
                System.out.println("Ingrese el nombre del mundo");
                mundoSeleccionado = scanner.nextLine();

            }else {
                FileWriter  myWriter = new FileWriter (mundoSeleccionado+ ".txt", true);
                //Writer output = new BufferedWriter(myWriter);

                int tamano = nuevoDato.size();
                for (int i = 0; i <tamano ; i++){
                    myWriter.write(nuevoDato.get(i).toString() + "\n");
                    myWriter.write(String.valueOf(nuevoDato));
                }
                myWriter.close();
                System.out.println("La informacion fue agregada a su mundo.");

            }

        } catch (IOException e) {
            System.out.println("A ocurrido un error.");
        }
    }


    /**
     * Read a File
     */

    public static void ReadFile () {
        try {
            File myObj = new File(mundoSeleccionado+ ".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = (myReader.nextLine()+ "/n");
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /**
     * Get File Information
     */

    public static void GetFileInfo() {
        File myObj = new File("filename.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }

    /**
     * Delete a File
     */

    public static void DeleteFile () {
        File myObj = new File("filename.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
