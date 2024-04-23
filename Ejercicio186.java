import java.util.Scanner;

public class Ejercicio186 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa una cadena de caracteres: ");
        String cadena = scanner.nextLine();
        
        String cadenaInversa = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInversa += cadena.charAt(i);
        }
        
        System.out.println("La cadena en orden inverso es: " + cadenaInversa);
        
        scanner.close();
    }
}
