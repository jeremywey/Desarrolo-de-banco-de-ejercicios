import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio190 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] denominaciones = {100, 200, 300, 500, 1000};

        System.out.print("Ingrese el total de la compra: ");
        double totalCompra = scanner.nextDouble();

        System.out.print("Ingrese el pago del cliente: ");
        double pagoUsuario = scanner.nextDouble();

        Map<Double, Integer> cambio = calcularCambio(totalCompra, pagoUsuario, denominaciones);
        System.out.println("Cambio a devolver:");
        for (Map.Entry<Double, Integer> entry : cambio.entrySet()) {
            System.out.println("$" + entry.getKey() + ": " + entry.getValue() + " billete(s)");
        }
    }

    public static Map<Double, Integer> calcularCambio(double totalCompra, double pagoUsuario, double[] denominaciones) {
        Map<Double, Integer> resultado = new HashMap<>();
        double cambio = pagoUsuario - totalCompra;

        for (double denominacion : denominaciones) {
            int cantidadDenominacion = (int) (cambio / denominacion);
            if (cantidadDenominacion > 0) {
                resultado.put(denominacion, cantidadDenominacion);
                cambio %= denominacion;
            }
        }

        return resultado;
    }
}
