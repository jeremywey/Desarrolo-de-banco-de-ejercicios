import java.util.Scanner;

public class ejercicio101 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el numero a dividir");
        int numero = scanner.nextInt();

        System.out.println("Escriba el divisor");
        int divisor = scanner.nextInt();

        if(numero % divisor == 0){
            System.out.println("Es divisible");
        }else{
            System.out.println("No es divisible");
        }
    }
}