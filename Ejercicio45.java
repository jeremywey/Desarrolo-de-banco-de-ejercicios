import java.util.Scanner;

public class Ejercicio45 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite un numero real");
            double numReal = scanner.nextDouble(); 
    
            int resultado = signo(numReal);
    
            System.out.println("El signo del número " + numReal + " es: " + resultado);
            scanner.close();
        }
    
  
        public static int signo(double numero) {
            if (numero < 0) {
                return -1;
            } else if (numero > 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    

