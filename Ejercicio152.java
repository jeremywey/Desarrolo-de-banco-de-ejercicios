import java.util.Scanner;

public class Ejercicio152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena = scanner.nextLine();

        char[] arregloOriginal = cadena.toCharArray();

        char[] arregloCopia = new char[arregloOriginal.length];

        for (int i = 0; i < arregloOriginal.length; i++) {
            arregloCopia[i] = arregloOriginal[i];
        }

        System.out.println("La cadena copiada es:");
        for (char caracter : arregloCopia) {
            System.out.print(caracter);
        }
        System.out.println(); 

        scanner.close();
    }
}
