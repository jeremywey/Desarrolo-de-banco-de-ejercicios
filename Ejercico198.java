import java.util.Scanner;

public class Ejercico198 {
    public static void main(String[] args) {
        int[][] tablero = new int[9][9];
        // Inicializar tablero aleatoriamente

        Scanner scanner = new Scanner(System.in);

        // Mostrar tablero
        mostrarTablero(tablero);

        while (!esSudokuResuelto(tablero)) {
            System.out.print("Ingrese fila (1-9): ");
            int fila = scanner.nextInt() - 1;
            System.out.print("Ingrese columna (1-9): ");
            int columna = scanner.nextInt() - 1;
            System.out.print("Ingrese número (1-9): ");
            int numero = scanner.nextInt();

            if (esMovimientoValido(tablero, fila, columna, numero)) {
                tablero[fila][columna] = numero;
                System.out.println("Movimiento válido.");
            } else {
                System.out.println("Movimiento inválido. Intente de nuevo.");
            }

            mostrarTablero(tablero);
        }

        System.out.println("¡Sudoku resuelto!");
    }

    public static void mostrarTablero(int[][] tablero) {
        // Implementar método para mostrar el tablero
    }

    public static boolean esSudokuResuelto(int[][] tablero) {
        // Implementar método para verificar si el Sudoku está resuelto
        return false;
    }

    public static boolean esMovimientoValido(int[][] tablero, int fila, int columna, int numero) {
        // Implementar método para verificar si el movimiento es válido
        return false;
    }
}
