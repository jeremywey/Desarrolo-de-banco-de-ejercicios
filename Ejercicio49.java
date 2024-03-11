import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIgite su nombre");
        String nombre = scanner.nextLine();

        System.out.println("La primera letra de su nombre es "+nombre.charAt(0));
    scanner.close();
    }
}
