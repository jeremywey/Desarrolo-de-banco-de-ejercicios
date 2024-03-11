import java.util.Scanner;

public class Ejercicio41 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la edad de la persona: ");
        int edad = scanner.nextInt();

        
        double largocabello = 0.5 *(12 * edad);

       
        double cabelloMetros = largocabello / 100;

        System.out.println("La cabellera mide aproximadamente " + cabelloMetros + " metros.");
        scanner.close();
    }
}


