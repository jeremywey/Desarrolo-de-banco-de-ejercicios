import java.util.Scanner;

public class Ejercicio141 {
    public static int trunc(double num) {
        return (int) num; 
    }

    public static double calcularRaizCuadrada(int numero) {
        double raiz = numero / 2.0; 
        while (Math.abs(raiz * raiz - numero) > 0.0001) {
            raiz = (raiz + numero / raiz) / 2.0;
        }

        return raiz;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número para calcular su raíz cuadrada: ");
        double numero = scanner.nextDouble();

        int numeroTruncado = trunc(numero);

        double raizCuadrada = calcularRaizCuadrada(numeroTruncado);

        System.out.println("La raíz cuadrada de " + numeroTruncado + " es: " + raizCuadrada);

        scanner.close();
    }
}
