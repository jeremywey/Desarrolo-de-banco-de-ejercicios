import java.util.Scanner;
public class Ejercicio37 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Introduce las horas de estacionamiento: ");
            double hr = scanner.nextDouble();
    
            System.out.print("Introduce los minutos de estacionamiento: ");
            double min = scanner.nextDouble();
    
            
            //int tiempoTotalEnMin = (horas * 60) + minutos;
    
           
            double costo;
    
            if (min <= 10) {
                costo = hr * 15.00;
            } else {
                costo = (hr + 1) * 15.00;
            }
    
            System.out.println("El cliente debe pagar: $" + costo);
    
            scanner.close();
        }
    }
    
