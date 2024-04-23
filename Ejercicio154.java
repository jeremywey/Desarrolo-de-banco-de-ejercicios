import java.util.Scanner;

public class Ejercicio154 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String mensaje = "Hola que tal";

        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        String mensajeCompleto = mensaje + " " + nombre;

        System.out.println("Mensaje completo: " + mensajeCompleto);
        
        scanner.close();
    }
}
