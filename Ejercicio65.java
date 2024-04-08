import java.util.Scanner;

public class Ejercicio65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cuent,suma = 0;
        System.out.println("Ingrese un valor para hacer una sumatoria del 1 al numero q digito");
        cuent = scanner.nextInt();
        for(int i = 1; i<= cuent ; i++){
             suma += i;

           
        }
        System.out.println("El valor de la sumatoria del 1 al "+cuent+" es:");
        System.out.println(suma);
        scanner.close();
    }
}
