import java.util.Scanner;

public class Ejercicio167 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double suma = 0;
        int cantidadNumeros = 0;
        
        System.out.println("Por favor, ingresa una lista de números positivos (ingresa 0 para terminar):");
        while (true) {
            double numero = scanner.nextDouble();
            if (numero == 0) {
                break;
            }
            if (numero > 0) {
                suma += numero;
                cantidadNumeros++;
            }
        }
        
        if (cantidadNumeros > 0) {
            double promedio = suma / cantidadNumeros;
            System.out.println("El promedio de los números positivos ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }
        
        scanner.close();
    }
}
