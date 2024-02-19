import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número de cualquier cifra: ");
        int numero = scanner.nextInt();

        int suma = 0;
        int tempNumero = Math.abs(numero); 

        while (tempNumero > 0) {
            int digito = tempNumero % 10;
            suma += digito;
            tempNumero /= 10;
        }

        System.out.println("La suma de los dígitos es: " + suma);

        scanner.close();
    }
}