import java.util.Scanner;

public class Ejercicio46 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la distancia en millas marinas: ");
        double miMarinas = scanner.nextDouble();

       
        double m = miMarinas * 1852;

        System.out.println(miMarinas + " millas marinas equivalen a " + m + " metros.");
   scanner.close();
    }
}


