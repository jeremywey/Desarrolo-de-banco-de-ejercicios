import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio192 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el texto (máximo 255 caracteres): ");
            String texto = scanner.nextLine();
            FileWriter writer = new FileWriter("archivo.txt");
            writer.write(texto.substring(0, Math.min(texto.length(), 255)));
            writer.close();
            System.out.println("El texto ha sido escrito en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
            e.printStackTrace();
        }
    }
}
