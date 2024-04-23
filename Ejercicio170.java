import java.util.Scanner;

public class Ejercicio170 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, ingresa las fracciones en el formato 'numerador/denominador':");
        
        System.out.print("Fracción 1: ");
        String[] fraccion1 = scanner.next().split("/");
        int num1 = Integer.parseInt(fraccion1[0]);
        int den1 = Integer.parseInt(fraccion1[1]);
        
        System.out.print("Fracción 2: ");
        String[] fraccion2 = scanner.next().split("/");
        int num2 = Integer.parseInt(fraccion2[0]);
        int den2 = Integer.parseInt(fraccion2[1]);
        
        int denComun = den1; // Ambas fracciones tienen el mismo denominador
        
        int sumaNum = num1 * den2 + num2 * den1;
        int restaNum = num1 * den2 - num2 * den1;
        
        System.out.println("Suma: " + sumaNum + "/" + denComun);
        System.out.println("Resta: " + restaNum + "/" + denComun);
        
        scanner.close();
    }
}
