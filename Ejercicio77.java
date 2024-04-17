import java.util.Scanner;

public class Ejercicio77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el capital del préstamo: ");
        double C = scanner.nextDouble();

        System.out.print("Introduce el interés anual: ");
        double i = scanner.nextDouble();

        System.out.print("Introduce el número de años: ");
        int años = scanner.nextInt();
        double R = (i / 100) / 12;
        int N = años * 12;
        double x = (R * C) / (1 - Math.pow(1 + R, -N));

        System.out.printf("La cuota mensual será de: %.2f%n", x);
        scanner.close();
    }
}
