import java.util.Scanner;

public class Ejercicio161 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa el valor de la primera variable: ");
        int a = scanner.nextInt();
        System.out.print("Ahora ingresa el valor de la segunda variable: ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Después del intercambio:");
        System.out.println("Primera variable: " + a);
        System.out.println("Segunda variable: " + b);
        
        scanner.close();
    }
}
