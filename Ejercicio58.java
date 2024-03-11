import java.util.Scanner;
public class Ejercicio58 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa las horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();

        System.out.print("Ingresa el pago por hora: ");
        double pagoHr = scanner.nextDouble();

        double salario;

        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * pagoHr;
        } else {
            double hrExtras = horasTrabajadas - 40;
            salario = (40 * pagoHr) + (hrExtras * (pagoHr / 2));
        }

   
        System.out.println("El salario es de: $" + salario);
        scanner.close();
    }
}

