import java.util.Scanner;

public class Ejercicio193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entre 1 y 255: ");
        int numero = scanner.nextInt();
        if (numero >= 1 && numero <= 255) {
            String binario = Integer.toBinaryString(numero);
            System.out.println("El número " + numero + " en binario es: " + binario);
        } else {
            System.out.println("El número debe estar entre 1 y 255.");
        }
    }
}
