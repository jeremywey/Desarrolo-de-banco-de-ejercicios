import java.util.Scanner;

public class Ejercicio177 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa un número entero: ");
        int numero = scanner.nextInt();
        
        System.out.print("Los divisores de " + numero + " son: ");
        for (int i = numero; i >= 1; i--) {
            if (numero % i == 0) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}
