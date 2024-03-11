import java.util.Scanner;

public class Ejercicio54 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la medida en centímetros: ");
        double cm = scanner.nextDouble();

       
        double pulgadas = cm / 2.54;

        System.out.println(cm + " centímetros equivalen a " + pulgadas + " pulgadas.");
        scanner.close();
    }
}


