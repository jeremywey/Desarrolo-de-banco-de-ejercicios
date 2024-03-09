import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float numero;
        System.out.println("Ingrese un numero del tipo real");
        numero = scanner.nextFloat();

        float cubo = calcularCubo(numero);

        System.out.println("El cubo de (" + numero + ") es igual a: " + cubo);
        scanner.close();
    }

    public static float calcularCubo(float numero) {
        return numero * numero * numero;
        
    }
}
