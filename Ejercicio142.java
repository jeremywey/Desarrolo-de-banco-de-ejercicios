import java.util.Scanner;

public class Ejercicio142 {
    public static double calcularPotencia(double base, int exponente) {
        double resultado = 1.0;

        if (exponente == 0) {
            return 1;
        }

        for (int i = 0; i < Math.abs(exponente); i++) {
            resultado *= base;
        }

        if (exponente < 0) {
            resultado = 1.0 / resultado;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la base (N): ");
        double base = scanner.nextDouble();

        System.out.print("Ingresa el exponente (X): ");
        int exponente = scanner.nextInt();

        double resultado = calcularPotencia(base, exponente);

        System.out.println(base + " elevado a la potencia " + exponente + " es igual a: " + resultado);

        scanner.close();
    }
}

