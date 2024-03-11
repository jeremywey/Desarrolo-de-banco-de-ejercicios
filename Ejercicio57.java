import java.util.Scanner;

public class Ejercicio57 {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.println("Introduce un número para sumar sus dígitos:");
                int numero = scanner.nextInt();
                
                int suma = 0;
                while (numero > 0) {
                    suma += numero % 10; 
                    numero /= 10; 
                }
                
                System.out.println("La suma de los dígitos es: " + suma);
                scanner.close();
            }
        }
        
    
        
