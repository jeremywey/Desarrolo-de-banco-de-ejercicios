import java.util.Scanner;
public class Ejercicio34 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double descuento = 0,monto;
        System.out.print("Introduce el monto de la compra (cop): ");
         monto = scanner.nextDouble();

        

        if (monto > 1000) {
            descuento = 0.10; 
        } else if (monto > 500 && monto <= 1000) {
            descuento = 0.20;
        }

        double descuen_compra = monto - (monto * descuento);

        System.out.println("Total de la compra: $" + monto);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Total a pagar: $" +  descuen_compra);

        scanner.close();
    }
}


