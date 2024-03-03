import java.util.Scanner;

public class Ejercicio22 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Introduce un número real: ");
            double numreal = scanner.nextDouble();
    
            int parEnt = (int) numreal;
    
            double parDec = numreal - parEnt;
    
            System.out.println("Parte entera: " + parEnt);
            System.out.println("Parte decimal: " + parDec);
    
            scanner.close();
        }
    }
    

