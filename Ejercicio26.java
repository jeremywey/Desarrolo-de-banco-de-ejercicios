import java.util.Scanner;

public class Ejercicio26 {
    
    public static void main (String []args){
        double x,a,b;
Scanner scanner = new Scanner(System.in);
System.out.println("Ingrese el cuadrado de los dos catetos");
System.out.println("------------------------------------------");
System.out.println("primer cateto");
 a = scanner.nextDouble();
 System.out.println("segundo cateto");
 b = scanner.nextDouble();

 x = Math.sqrt( ( (Math.pow(a, 2)) + ( Math.pow(b, 2) ) ) );

System.out.println("El cuadrado de la hipotenusa es igual a "+x+"cm²");
scanner.close();
    }
}
