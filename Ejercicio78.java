import java.util.Scanner;

public class Ejercicio78 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese el monto ");
       double monto = scanner.nextDouble();
        double descuento;
        double montoFinal;

        if (monto > 10000) {
            descuento = monto * 0.20; 
        } else {
            descuento = monto * 0.10; 
        }

        montoFinal = monto - descuento;

        System.out.println("El descuento para un monto de " + monto + " es: " + descuento);
        System.out.println("El monto final después del descuento es: " + montoFinal);
   scanner.close();
    }
}
