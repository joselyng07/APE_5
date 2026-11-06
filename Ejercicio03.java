import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio03 {
    public static void main(String[] args) {
        BufferedWriter escritor = null;
        try {
            escritor = new BufferedWriter(new FileWriter("materias.txt", true));
            escritor.newLine();
            escritor.write("Estructura de Datos"); escritor.newLine();
            escritor.write("Sistemas Operativos");
            System.out.println("Se agregaron dos asignaturas al final.");
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