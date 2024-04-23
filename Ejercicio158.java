import java.util.Scanner;

public class Ejercicio158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario dos cadenas de números
        System.out.print("Por favor, ingresa un número entero: ");
        String numeroEnteroStr = scanner.nextLine();
        System.out.print("Ahora ingresa un número real: ");
        String numeroRealStr = scanner.nextLine();

        // Convertir las cadenas a sus respectivos valores numéricos
        int numeroEntero = Integer.parseInt(numeroEnteroStr);
        double numeroReal = Double.parseDouble(numeroRealStr);

        // Sumar los números
        double suma = numeroEntero + numeroReal;

        // Mostrar el resultado
        System.out.println("La suma de los números es: " + suma);
        
        scanner.close();
    }
}
