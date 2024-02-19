import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        int num1, num2,num3,ult1,ult2,ult3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa para calcular mostrar los ultimo digito de los numeros que se digiten");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Digite 3 numeros con cualquier cantidad");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        ult1 = num1 %10;
        ult2 = num2 %10;
        ult3 = num3 %10;

        System.out.println( "El ultimo digito de cada cantidad que ingreso es de: " );
        System.out.println("--------------------------------------------------------- ");
        System.out.println("El ultimo digito de la cantidad ("+num1+") es: "+ ult1);
        System.out.println("El ultimo digito de la cantidad ("+num2+") es: "+ ult2);
        System.out.println("El ultimo digito de la cantidad ("+num3+") es: "+ ult3);
scanner.close();

    }
}
