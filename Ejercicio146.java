import java.util.Scanner;


public class Ejercicio146 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número límite para la serie Fibonacci: ");
        int limite = scanner.nextInt();

        System.out.println("Serie Fibonacci hasta " + limite + ":");
        fibonacciHasta(limite);

        scanner.close();
    }

    public static void fibonacciHasta(int limite) {
        int num1 = 0, num2 = 1;

        System.out.print(num1 + " ");

        while (num2 <= limite) {
            System.out.print(num2 + " ");
            int siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;
        }

        System.out.println(); 
    }
}
