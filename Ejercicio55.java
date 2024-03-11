import java.util.Scanner;

public class Ejercicio55 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
System.out.println("Digite un numero para determinar si es primo");
           int numero = scanner.nextInt();

            if (esPrimo(numero)) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
            scanner.close();
        }
    
        public static boolean esPrimo(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }