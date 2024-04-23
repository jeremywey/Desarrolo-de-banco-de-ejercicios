import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio176 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa la fecha actual en formato AAAA-MM-DD: ");
        String fechaString = scanner.next();
        
        LocalDate fechaActual = LocalDate.parse(fechaString);
        LocalDate fechaSiguiente = fechaActual.plusDays(1);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("La fecha del día siguiente es: " + formatter.format(fechaSiguiente));
        
        scanner.close();
    }
}
