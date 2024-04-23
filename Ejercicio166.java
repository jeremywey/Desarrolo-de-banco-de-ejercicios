import java.util.Scanner;

public class Ejercicio166 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa tu peso en kg: ");
        double peso = scanner.nextDouble();
        System.out.print("Ahora ingresa tu estatura en metros: ");
        double estatura = scanner.nextDouble();
        
        double imc = peso / (estatura * estatura);
        
        System.out.println("Tu IMC es: " + imc);
        
        scanner.close();
    }
}
