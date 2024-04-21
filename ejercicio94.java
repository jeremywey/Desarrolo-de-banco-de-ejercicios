import java.util.Scanner;
public class ejercicio94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese un número entero: ");
        int num = scanner.nextInt();

        int valorAbsoluto = Math.abs(num);

        System.out.println("El valor absoluto de " + num + " es: " + valorAbsoluto);
    }
}

