import java.util.Scanner;

public class Ejercicio72 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese las horas trabajadas del trabajador: ");
            int horasTrabajadas = scanner.nextInt(); 
            System.out.println("Ahora ingresee la tarifa por hora");
            double tarifaPorHora = scanner.nextDouble();
    
            
            double salario = calcularSalario(horasTrabajadas, tarifaPorHora);
            System.out.println("El salario del trabajador es: " + salario + " pesos");
            scanner.close();
        }
    
        public static double calcularSalario(int horas, double tarifa) {
            int horasExtras = horas - 40;
            double tarifaExtra = tarifa * 1.5; 
            double salario;
    
            if (horas <= 40) {
                salario = horas * tarifa;
            } else {
                salario = 40 * tarifa + horasExtras * tarifaExtra;
            }
    
            return salario;
        }
    }
    

