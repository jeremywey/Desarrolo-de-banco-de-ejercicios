import java.util.Scanner;

public class Ejercicio153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera cadena de caracteres: ");
        String cadena1 = scanner.nextLine();

        System.out.print("Ingrese la segunda cadena de caracteres: ");
        String cadena2 = scanner.nextLine();

        if (cadena1.equals(cadena2)) {
            System.out.println("Las dos cadenas son iguales.");
        } else {
            int comparacion = cadena1.compareTo(cadena2);
            if (comparacion < 0) {
                System.out.println("La cadena '" + cadena1 + "' es menor alfabéticamente que la cadena '" + cadena2 + "'.");
            } else {
                System.out.println("La cadena '" + cadena2 + "' es menor alfabéticamente que la cadena '" + cadena1 + "'.");
            }
        }

        scanner.close();
    }
}
