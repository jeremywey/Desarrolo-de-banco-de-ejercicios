import java.util.Scanner;

public class Ejercicio61 {
 
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un numero");
          int suma = scanner.nextInt(); 
          for (int i = 0; i <= 10; i++) { 
            suma =  i*i ;
          }
          System.out.println("La suma de los cuadrados es: " + suma); 
          scanner.close();
        }
      }
    

