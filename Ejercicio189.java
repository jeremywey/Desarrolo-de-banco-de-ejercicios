import java.util.Scanner;

public class Ejercicio189 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa la posición actual del caballo (fila columna): ");
        int filaActual = scanner.nextInt();
        int columnaActual = scanner.nextInt();
        
        System.out.print("Ahora, ingresa la posición a la que quieres mover el caballo (fila columna): ");
        int filaDestino = scanner.nextInt();
        int columnaDestino = scanner.nextInt();
        
        int distanciaFilas = Math.abs(filaActual - filaDestino);
        int distanciaColumnas = Math.abs(columnaActual - columnaDestino);
        
        if ((distanciaFilas == 1 && distanciaColumnas == 2) || (distanciaFilas == 2 && distanciaColumnas == 1)) {
            System.out.println("El movimiento del caballo es válido.");
        } else {
            System.out.println("El movimiento del caballo es inválido.");
        }
        
        scanner.close();
    }
}
