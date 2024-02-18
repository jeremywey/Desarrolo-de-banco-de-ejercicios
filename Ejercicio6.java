import java.util.Scanner;

public class Ejercicio6 {
public static void main(String[] args) {
    double num1, num2, num3, media, suma;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Programa para calcular la media aritmetica");
    System.out.println("///////////////////////////////////////////");
System.out.println("Ingrese tres(3) numeros para hacer la operacion");
num1 = scanner.nextDouble();
num2 = scanner.nextDouble();
num3 = scanner.nextDouble();
suma =  num1 + num2 + num3;
media = suma / 3;
System.out.println("la media de los numeros ingresados es de: "+media);




}
}
