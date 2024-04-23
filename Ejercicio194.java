import java.util.Scanner;

public class Ejercicio194 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        ordenarBurbuja(numeros);

        System.out.println("Números ordenados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }

    public static void ordenarBurbuja(int[] numeros) {
        int n = numeros.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (numeros[j] > numeros[j+1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                }
            }
        }
    }
}
