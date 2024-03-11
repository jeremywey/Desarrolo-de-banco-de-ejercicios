import java.util.Scanner;
public class Ejercicio40 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de kilogramos de oro: ");
        double kgOro = scanner.nextDouble();

        System.out.print("Ingresa el precio en pesos por onza de oro: ");
        double precio_onza = scanner.nextDouble();

        double grOro = kgOro * 1000;
       
        double valorEnPesos = (grOro / 28.3495) * precio_onza;

        System.out.println("El valor de " + kgOro + " kilogramos de oro es de aproximadamente " + valorEnPesos + " pesos.");
   scanner.close();
    }
}


    


