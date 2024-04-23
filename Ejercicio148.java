import java.util.Scanner;

public class Ejercicio148 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de datos: ");
        int cantidadDatos = scanner.nextInt();

        double[] datos = new double[cantidadDatos];

        System.out.println("Ingrese los datos uno por uno:");
        for (int i = 0; i < cantidadDatos; i++) {
            System.out.print("Dato " + (i + 1) + ": ");
            datos[i] = scanner.nextDouble();
        }

        double suma = 0;
        double maximo = datos[0]; 
        for (double dato : datos) {
            suma += dato;
            if (dato > maximo) {
                maximo = dato;
            }
        }
        double promedio = suma / cantidadDatos;

        System.out.println("Suma de los datos: " + suma);
        System.out.println("Promedio de los datos: " + promedio);
        System.out.println("Máximo de los datos: " + maximo);

        scanner.close();
    }
}
