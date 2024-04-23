import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio195 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[20];
        System.out.println("Ingrese 20 números ordenados:");

        for (int i = 0; i < 20; i++) {
            arreglo[i] = scanner.nextInt();
        }

        Arrays.sort(arreglo);

        System.out.print("Ingrese el elemento a buscar: ");
        int elementoBuscado = scanner.nextInt();

        int[] resultado = busquedaBinaria(arreglo, elementoBuscado);
        int indiceEncontrado = resultado[0];
        int comparaciones = resultado[1];

        if (indiceEncontrado != -1) {
            System.out.println("Elemento encontrado en la posición " + indiceEncontrado + ".");
        } else {
            System.out.println("Elemento no encontrado.");
        }
        System.out.println("Número de comparaciones realizadas: " + comparaciones);
    }

    public static int[] busquedaBinaria(int[] arreglo, int elemento) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        int comparaciones = 0;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            comparaciones++;

            if (arreglo[medio] == elemento) {
                return new int[]{medio, comparaciones};
            } else if (arreglo[medio] < elemento) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return new int[]{-1, comparaciones};
    }
}
