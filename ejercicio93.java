import java.util.Scanner;

public class ejercicio93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Ingrese el tiempo en minutos: ");
        int min = scanner.nextInt();

        int hr = min / 60;
        int minRestantes = minutos % 60;
        int seg = minRestantes * 60;
        
        System.out.println("Tiempo: " + hr + " horas, " + minRestantes + " minutos, " + seg+ " segundos.");
    }
}