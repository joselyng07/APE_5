import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio02 {
    public static void main(String[] args) {
        BufferedWriter escritor = null;
        try {
            escritor = new BufferedWriter(new FileWriter("materias.txt"));
            escritor.write("Programacion"); escritor.newLine();
            escritor.write("Matematica"); escritor.newLine();
            escritor.write("Fisica"); escritor.newLine();
            escritor.write("Ingles"); escritor.newLine();
            escritor.write("Base de Datos"); escritor.newLine();
            System.out.println("Cinco asignaturas guardadas en materias.txt.");
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        } finally {
            if (escritor != null) {
                try {
                    escritor.close();
                    System.out.println("Archivo cerrado correctamente.");
                } catch (IOException e) {
                    System.out.println("Error al cerrar: " + e.getMessage());
                }
            }
        }
    }
}