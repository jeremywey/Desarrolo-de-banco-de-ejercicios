import java.util.Scanner;

public class Ejercicio73 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sueldoBruto,descuento,sueldoNeto; 
        System.out.println("Digite el sueldo del trabajador");
        sueldoBruto = scanner.nextDouble();
        if (sueldoBruto <= 1000) {
            descuento = sueldoBruto * 0.10;
        } else if (sueldoBruto <= 2000) {
            descuento = 1000 * 0.10 + (sueldoBruto - 1000) * 0.05;
        } else {
            descuento = 1000 * 0.10 + 1000 * 0.05 + (sueldoBruto - 2000) * 0.03;
        }

        sueldoNeto = sueldoBruto - descuento;

        System.out.println("El descuento aplicado es: " + descuento);
        System.out.println("El sueldo neto del trabajador es: " + sueldoNeto);
        scanner.close();
    }
}


