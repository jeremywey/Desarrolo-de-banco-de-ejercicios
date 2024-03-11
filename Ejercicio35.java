import java.util.Scanner;
public class Ejercicio35 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Introduce las horas trabajadas: ");
            double hrTrab = scanner.nextDouble();
    
            System.out.print("Introduce la tarifa por hora: ");
            double tarifaHr = scanner.nextDouble();
    
            double salario;
    
            if (hrTrab <= 40) {
                salario = hrTrab * tarifaHr;
            } else {
                double horasExtras = hrTrab - 40;
                double tarifaHorasExtras = tarifaHr * 1.5;
                salario = (40 * tarifaHr) + (horasExtras * tarifaHorasExtras);
            }
    
            System.out.println("El salario del profesor es: $" + salario);
    
            scanner.close();
        }
    }
    
