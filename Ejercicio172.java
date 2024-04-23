import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio172 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa el periodo en formato MM AAAA (por ejemplo, 10 2021): ");
        String entrada = scanner.nextLine();
        String[] partes = entrada.split(" ");
        int mes = Integer.parseInt(partes[0]);
        int año = Integer.parseInt(partes[1]);
        
        LocalDate fecha = LocalDate.of(año, mes, 1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-yyyy");
        
        System.out.println("Los 12 periodos anteriores son:");
        for (int i = 0; i < 12; i++) {
            fecha = fecha.minusMonths(1);
            System.out.println(formatter.format(fecha));
        }
        
        scanner.close();
    }
}
