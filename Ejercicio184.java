import java.util.Scanner;

public class Ejercicio184 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa tu nombre completo: ");
        String nombreCompleto = scanner.nextLine().toUpperCase();
        System.out.print("Ahora, ingresa tu fecha de nacimiento en formato AAAA-MM-DD: ");
        String fechaNacimiento = scanner.next();
        
        String[] nombres = nombreCompleto.split(" ");
        String iniciales = "";
        for (String nombre : nombres) {
            iniciales += nombre.charAt(0);
        }
        
        String[] partesFecha = fechaNacimiento.split("-");
        String rfc = iniciales + partesFecha[0].substring(2) + partesFecha[1] + partesFecha[2];
        
        System.out.println("Tu RFC (Registro Federal Contribuyente) es: " + rfc);
        
        scanner.close();
    }
}
