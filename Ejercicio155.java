import java.util.Scanner;

public class Ejercicio155 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa una palabra: ");
        String palabra = scanner.nextLine();

        // Verificar si es palíndromo
        boolean esPalindromo = true;
        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
        
        scanner.close();
    }
}
