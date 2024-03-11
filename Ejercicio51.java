import java.util.Scanner;
public class Ejercicio51 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la base del rectángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        
        double area = base * altura;

        
        double perimetro = 2 * (base + altura);

        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        scanner.close();
    }
}

    

