import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercico197 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("estado_cuenta.txt"));
            String linea;
            System.out.println("Estado de cuenta:");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error al leer el estado de cuenta.");
            e.printStackTrace();
        }
    }
}
