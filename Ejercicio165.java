import java.util.Scanner;

public class Ejercicio165 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa la cantidad de horas: ");
        int horas = scanner.nextInt();
        System.out.print("Ingresa la cantidad de minutos: ");
        int minutos = scanner.nextInt();
        System.out.print("Finalmente, ingresa la cantidad de segundos: ");
        int segundos = scanner.nextInt();
        
        int totalSegundos = horas * 3600 + minutos * 60 + segundos;
        
        System.out.println("El total de segundos es: " + totalSegundos);
        
        scanner.close();
    }
}
