import java.util.Scanner;

public class Ejercicio187 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa la posición actual de la reina (fila columna): ");
        int filaActual = scanner.nextInt();
        int columnaActual = scanner.nextInt();
        
        System.out.print("Ahora, ingresa la posición a la que quieres mover la reina (fila columna): ");
        int filaDestino = scanner.nextInt();
        int columnaDestino = scanner.nextInt();
        
        if (filaActual == filaDestino || columnaActual == columnaDestino ||
            Math.abs(filaActual - filaDestino) == Math.abs(columnaActual - columnaDestino)) {
            System.out.println("El movimiento de la reina es válido.");
        } else {
            System.out.println("El movimiento de la reina es inválido.");
        }
        
        scanner.close();
    }
}
