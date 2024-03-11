import java.util.Scanner;
public class EJercicio56 {
    
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de segundos: ");
        int segundos = scanner.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;

        System.out.println("Tiempo equivalente:");
        System.out.println(horas + " horas, " + minutos + " minutos y " + segundosRestantes + " segundos.");
        scanner.close();
    }
}


