import java.util.Scanner;

public class Ejercicio17{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Programa que determina cual numero es mayor");
    System.out.println("--------------------------------------------------");
    System.out.println("Digite 2 numeros ");
    double num1 = scanner.nextDouble();
    double num2 = scanner.nextDouble();

    if (num1 < num2){
        System.out.println("El numero "+num2+" es mayo que el numero "+num1);

    }else{
        System.out.println("El numero "+num1+" es mayo que el numero "+num2);
    }
}
}