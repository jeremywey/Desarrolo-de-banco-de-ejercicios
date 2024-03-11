import java.util.Scanner;
public class Ejercicio47 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el precio original de la compra: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingresa el precio pagado: ");
        double pago = scanner.nextDouble();

       
        double descuento = ((precio - pago) / precio) * 100;

        System.out.println("El porcentaje de descuento aplicado es: " + descuento + "%");
   scanner.close();
    }
}


