import java.util.Scanner;

public class Ejercicio157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir el nombre al usuario en mayúsculas
        System.out.print("Por favor, ingresa tu nombre en mayúsculas: ");
        String nombre = scanner.nextLine();

        // Verificar si el nombre empieza con "A"
        if (nombre.startsWith("A")) {
            // Convertir el nombre a minúsculas
            nombre = nombre.toLowerCase();
            System.out.println("Tu nombre convertido a minúsculas: " + nombre);
        } else {
            System.out.println("Tu nombre no empieza con 'A', no se ha convertido a minúsculas.");
        }
        
        scanner.close();
    }
}
