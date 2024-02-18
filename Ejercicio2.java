
import java.util.Scanner;
public class Ejercicio2 {
    public static void main( String agrs[]){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("------------------------------------");
         System.out.println("---Ingrese cualquier comentario---");
        System.out.println("------------------------------------");
        String coment = scanner.nextLine();
        System.out.println("");
        System.out.println(coment);
        scanner.close();
    }
    
}
