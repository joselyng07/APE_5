import java.io.File;
import java.io.IOException;

public class Ejercicio01 {
    public static void main(String[] args) {
        File carpeta = new File("datos");
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }

        File archivo = new File("datos/prueba.txt");
        try {
            if (archivo.exists()) {
                System.out.println("El archivo ya existe.");
            } else if (archivo.createNewFile()) {
                System.out.println("Archivo creado correctamente.");
            } else {
                System.out.println("No se pudo crear el archivo.");
            }
            System.out.println("Nombre del archivo: " + archivo.getName());
            System.out.println("Ruta del archivo: " + archivo.getPath());
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }
    }
}