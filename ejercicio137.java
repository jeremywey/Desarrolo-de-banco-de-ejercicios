import java.util.Scanner;

public class ejercicio137 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese el coeficiente a:");
        double a = scanner.nextDouble();

        System.out.println("Ingrese el coeficiente b:");
        double b = scanner.nextDouble();

        System.out.println("Ingrese el coeficiente c:");
        double c = scanner.nextDouble();

    
        double discriminante = b * b - 4 * a * c;


        if (discriminante > 0) {
            
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
        
            double x = -b / (2 * a);
            System.out.println("La solución doble es:");
            System.out.println("x = " + x);
        } else {
        
            System.out.println("La ecuación no tiene soluciones reales.");
        }

        scanner.close();
    }
}