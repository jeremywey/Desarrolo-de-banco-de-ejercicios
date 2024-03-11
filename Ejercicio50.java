import java.util.Scanner;
public class Ejercicio50{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingresa el tercer número: ");
        double num3 = scanner.nextDouble();

        double suma = num1 + num2 + num3;
        double multiplicacion = num1 * num2 * num3;

        System.out.println("La suma de los tres números es: " + suma);
        System.out.println("La multiplicación de los tres números es: " + multiplicacion);

        scanner.close();
    }
}
