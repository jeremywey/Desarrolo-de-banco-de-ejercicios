import java.util.Scanner;

public class Ejercicio42 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de kilovoltios requeridos (x): ");
        double kvnesesitados = scanner.nextDouble();

       
        double naranjas = (kvnesesitados * 1000) / 0.05;

       
        double pesoTotal = (naranjas * 6) / 1_000_000;

        System.out.println("Se necesitan aproximadamente " + (int) naranjas + " naranjas.");
        System.out.println("Esto equivale a aproximadamente " + pesoTotal+ " toneladas de naranjas.");
        scanner.close();
    }
}


    
