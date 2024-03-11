import java.util.Scanner;

public class Ejercicio43 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dos cantidades de numeros para determinar cual es menor");
        System.out.println("primera cantidad:");
        int num1 = scanner.nextInt();
        System.out.println("Segunda cantidad:");
        int num2 = scanner.nextInt();

        if (num1 < num2) {
        System.out.println("El numero "+num1+" es menor que el numero "+num2);
        
        }else{
            System.out.println("El numero "+num2+" es menor que el numero "+num1);
        }
scanner.close();
    }
}

