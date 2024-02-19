import java.util.Scanner;

public class Ejercicio12{
   public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
            int suma, promedio, mn1,mn2,mn3;
            System.out.println("Ingrese 3 numeron enteros!");
            System.out.print("Ingrese el primer numero: ");
            int n1 = scanner.nextInt();
            
            System.out.print("Ingrese el segundo numero: ");
            int n2 = scanner.nextInt();
            
            System.out.print("Ingrese el tercer numero: ");
            int n3 = scanner.nextInt();
             promedio = (n1+n2+n3)/3;
            suma = n1+n2+n3;
            mn1 = n1*2;
            mn2 = n2*3;
            mn3 = n3*n3;
            System.out.println("EL promedio es de: "+ promedio+"\n  La suma es:"+suma);
            System.out.println("El doble del primer numero es: "+mn1);
            System.out.println("El triple del segundo numero es: "+mn2);
            System.out.println("El doble del primer numero es: "+mn3);
            scanner.close();
        }
    
    
    }