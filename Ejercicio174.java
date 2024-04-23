import java.util.Scanner;

public class Ejercicio174 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa tu nombre completo: ");
        String nombreCompleto = scanner.nextLine();
        System.out.print("Ahora, ingresa el área o departamento donde trabajas: ");
        String departamento = scanner.nextLine();
        
        String[] nombres = nombreCompleto.split(" ");
        String nombreUsuario = departamento.substring(0, 3).toLowerCase();
        for (String nombre : nombres) {
            nombreUsuario += nombre.substring(0, Math.min(nombre.length(), 2)).toLowerCase();
        }
        
        System.out.println("El nombre de usuario generado es: " + nombreUsuario);
        
        scanner.close();
    }
}
