import java.util.Scanner;

public class Ejercico199 {
    public static void main(String[] args) {
        int puntosJugador1 = 0;
        int puntosJugador2 = 0;
        char[][] tablero = inicializarTablero();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarTablero(tablero);
            System.out.println("Jugador 1 (peones blancos):");
            if (realizarMovimiento(tablero, scanner, 'B')) {
                puntosJugador1++;
            }

            mostrarTablero(tablero);
            System.out.println("Jugador 2 (peones negros):");
            if (realizarMovimiento(tablero, scanner, 'N')) {
                puntosJugador2++;
            }

            System.out.println("Puntuación - Jugador 1: " + puntosJugador1 + ", Jugador 2: " + puntosJugador2);
        }
    }

    public static char[][] inicializarTablero() {
        char[][] tablero = new char[8][8];
        // Inicializar tablero con peones blancos y negros
        for (int i = 0; i < 8; i++) {
            tablero[1][i] = 'B';
            tablero[6][i] = 'N';
        }
        return tablero;
    }

    public static void mostrarTablero(char[][] tablero) {
        // Mostrar el tablero
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean realizarMovimiento(char[][] tablero, Scanner scanner, char jugador) {
        System.out.print("Ingrese la coordenada de su movimiento (fila columna): ");
        int filaInicio = scanner.nextInt();
        int columnaInicio = scanner.nextInt();
        System.out.print("Ingrese la coordenada destino de su movimiento (fila columna): ");
        int filaDestino = scanner.nextInt();
        int columnaDestino = scanner.nextInt();

        // Validar que las coordenadas estén dentro del tablero
        if (filaInicio < 0 || filaInicio >= 8 || columnaInicio < 0 || columnaInicio >= 8 ||
            filaDestino < 0 || filaDestino >= 8 || columnaDestino < 0 || columnaDestino >= 8) {
            System.out.println("Coordenadas fuera del tablero.");
            return false;
        }

        // Validar que la casilla de inicio contenga una pieza del jugador actual
        if (tablero[filaInicio][columnaInicio] != jugador) {
            System.out.println("No hay una pieza tuya en esa posición.");
            return false;
        }

        // Validar que el movimiento sea hacia adelante y en diagonal
        if (jugador == 'B' && filaDestino != filaInicio + 1) {
            System.out.println("Movimiento no permitido.");
            return false;
        } else if (jugador == 'N' && filaDestino != filaInicio - 1) {
            System.out.println("Movimiento no permitido.");
            return false;
        }
        if (Math.abs(columnaDestino - columnaInicio) != 1) {
            System.out.println("Movimiento no permitido.");
            return false;
        }

        // Mover la pieza
        tablero[filaInicio][columnaInicio] = '-';
        tablero[filaDestino][columnaDestino] = jugador;

        // Validar si se ha comido una pieza rival
        if (tablero[filaDestino][columnaDestino] == 'N') {
            System.out.println("¡Has comido una pieza rival!");
            return true;
        } else if (tablero[filaDestino][columnaDestino] == 'B') {
            System.out.println("¡Has comido una pieza rival!");
            return true;
        }

        return false;
    }
}
