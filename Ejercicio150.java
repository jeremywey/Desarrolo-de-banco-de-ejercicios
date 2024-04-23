import java.util.Scanner;

public class Ejercicio150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero para calcular su descomposición en factores primos: ");
        int numero = scanner.nextInt();

        System.out.print("Descomposición en factores primos de " + numero + ": ");
        descomposicionFactoresPrimos(numero);

        scanner.close();
    }

    public static void descomposicionFactoresPrimos(int numero) {
        for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
            while (numero % divisor == 0) {
                System.out.print(divisor + " "); 
                numero /= divisor; 
            }
        }

        if (numero > 1) {
            System.out.print(numero);
        }
    }
}
