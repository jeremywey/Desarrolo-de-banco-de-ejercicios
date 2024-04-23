import java.util.Scanner;

public class Ejercicio163 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa el primer número: ");
        double a = scanner.nextDouble();
        System.out.print("Ahora ingresa el segundo número: ");
        double b = scanner.nextDouble();

        double suma = a + b;
        double resta = a - b;
        double multiplicacion = a * b;
        double division = a / b;
        double residuo = a % b;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Residuo: " + residuo);
        
        scanner.close();
    }
}
