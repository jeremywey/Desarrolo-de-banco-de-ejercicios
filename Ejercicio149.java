import java.util.Scanner;
import java.util.Random;

public class Ejercicio149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int intentos = 0;
        int numeroUsuario;

        System.out.println("¡Adivina el número entre 1 y 100!");

        do {
            System.out.print("Ingresa tu intento: ");
            numeroUsuario = scanner.nextInt();
            intentos++;

            if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número que ingresaste es menor.");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("El número que ingresaste es mayor.");
            } else {
                System.out.println("¡Felicidades! ¡Adivinaste el número " + numeroAleatorio + " en " + intentos + " intentos!");
            }
        } while (numeroUsuario != numeroAleatorio);

        scanner.close();
    }
}
