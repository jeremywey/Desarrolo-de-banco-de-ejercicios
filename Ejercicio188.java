import java.util.Scanner;

public class Ejercicio188 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa una dirección de correo electrónico: ");
        String correo = scanner.nextLine();
        
        if (correo.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            System.out.println("La dirección de correo electrónico es válida.");
        } else {
            System.out.println("La dirección de correo electrónico es inválida.");
        }
        
        scanner.close();
    }
}
