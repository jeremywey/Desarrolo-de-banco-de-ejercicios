import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio175 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa la fecha actual en formato AAAA-MM-DD: ");
        String fechaString = scanner.next();
        
        LocalDate fechaActual = LocalDate.parse(fechaString);
        LocalDate fechaAnterior = fechaActual.minusDays(1);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("La fecha del día anterior es: " + formatter.format(fechaAnterior));
        
        scanner.close();
    }
}
