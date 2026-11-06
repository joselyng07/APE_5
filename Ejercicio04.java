import java.io.File;
import java.io.IOException;

public class Ejercicio04 {
    public static void main(String[] args) {
        File carpeta = new File("datos");
        if (!carpeta.exists()) {
            carpeta.mkdirs();
        }

        File archivo = new File("datos/temporal.txt");
        try {
            if (!archivo.exists()) {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo temporal creado correctamente.");
                } else {
                    System.out.println("No se pudo crear el archivo.");
                    return;
                }
            } else {
                System.out.println("El archivo temporal ya existe.");
            }

            boolean confirmarBorrado = true;
            if (confirmarBorrado) {
                boolean eliminado = archivo.delete();
                System.out.println("¿Se eliminó el archivo? " + eliminado);
            } else {
                System.out.println("Borrado cancelado. El archivo se conserva.");
            }
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }
    }
}