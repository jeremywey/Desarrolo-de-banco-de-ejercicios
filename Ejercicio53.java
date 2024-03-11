import java.util.Scanner;
public class Ejercicio53 {
   


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la longitud del lado del cuadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        System.out.println("El área del cuadrado es: " + area);
        scanner.close();
    }
}

