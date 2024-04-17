import java.util.Scanner;

public class Ejercicio74 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
double num1,num2,num3;
System.out.println("Se nesesita que digite 3 numeros para digitarlos de mayor a menor");
System.out.println("Por cada cantidad digitada precione enter para seguir con la siguiente cantidad");
num1 = scanner.nextDouble();
num2 = scanner.nextDouble();
num3 = scanner.nextDouble();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1);
            if (num2 >= num3) {
                System.out.println(num2);
                System.out.println(num3);
            } else {
                System.out.println(num3);
                System.out.println(num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2);
            if (num1 >= num3) {
                System.out.println(num1);
                System.out.println(num3);
            } else {
                System.out.println(num3);
                System.out.println(num1);
            }
        } else {
            System.out.println(num3);
            if (num1 >= num2) {
                System.out.println(num1);
                System.out.println(num2);
            } else {
                System.out.println(num2);
                System.out.println(num1);
            }
        }
    
    scanner.close();
}
}
