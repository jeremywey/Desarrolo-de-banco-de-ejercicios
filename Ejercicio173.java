import java.util.Scanner;

public class Ejercicio173 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double total = 0;
        int cantidadTotal = 0;
        
        while (true) {
            System.out.print("Introduce la cantidad vendida (0 para salir): ");
            int cantidad = scanner.nextInt();
            if (cantidad == 0) {
                break;
            }
            System.out.print("Introduce el precio: ");
            double precio = scanner.nextDouble();
            
            total += cantidad * precio;
            cantidadTotal += cantidad;
        }
        
        System.out.println("Total a pagar: $" + total);
        System.out.println("Cantidad total de productos: " + cantidadTotal);
        
        scanner.close();
    }
}
