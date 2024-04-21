import java.util.Scanner;
public class ejercicio89 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la distancia en metros ");
        double metros = scanner.nextDouble();

        double km = metros/1000;

        System.out.println("La distancia en km es de " + km);
    }
}
