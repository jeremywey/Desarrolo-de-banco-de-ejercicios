import java.util.Scanner;
public class Ejercicio36 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Introduce las horas de estacionamiento: ");
            int hr = scanner.nextInt();
    
            System.out.print("Introduce los minutos de estacionamiento: ");
            int min = scanner.nextInt();
    
            
            int totalmin = (hr * 60) + min;
    
            
            double costo = totalmin * 15.00 / 60.0;
    
            System.out.println("El cliente debe pagar: $" + costo);
    
            scanner.close();
        }
    }
    
