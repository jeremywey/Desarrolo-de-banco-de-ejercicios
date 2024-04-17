import java.util.Scanner;

public class Ejercicio80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingresa un dato entero: ");
        int datoEntero = scanner.nextInt();

        
        System.out.print("Ahora, ingresa un dato real: ");
        double datoReal = scanner.nextDouble();

        
        System.out.println("El dato entero ingresado es: " + datoEntero);
        System.out.println("El dato real ingresado es: " + datoReal);
   scanner.close();
    }
}
