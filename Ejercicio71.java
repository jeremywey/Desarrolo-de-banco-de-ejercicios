import java.util.Scanner;

public class Ejercicio71{
    public static void main( String[]args){
        int num1= 0, num2= 1, cuenta;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cuenta para realizar una serie fibonacci");
        cuenta = scanner.nextInt();
        
        System.out.println("Serie fibonacci: "+num1+ " " +num2);
        for (int i = 2; i < cuenta; ++i) {
            int suma = num1 + num2;
            System.out.print(" " + suma);
            num1 = num2;
            num2 = suma;
        }
        scanner.close();
    }
}

        