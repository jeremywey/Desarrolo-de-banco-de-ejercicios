import java.util.Scanner;

public class Ejercicio11{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area,base,altura;
        System.out.println("Programa para calcular el area de un rectangulo");
        System.out.println("-------------------------------------------------");
        System.out.println("Ingrese la altura y la base del rectangulo (primero la altura) ");
        altura = scanner.nextDouble();
        base = scanner.nextDouble();
        area = base * altura;
System.out.println("El area del rectangulo es de: " +area+"cm²");
scanner.close();
    }
}