import java.util.Scanner;

public class Ejercicio151 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena = scanner.nextLine();

        if (cadena.length() > 10) {
            System.out.println("La cadena ingresada es: " + cadena);
        } else {
            System.out.println("La longitud de la cadena es menor o igual a 10 caracteres.");
        }

        scanner.close();
    }
}
