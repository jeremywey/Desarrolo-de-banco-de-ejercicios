import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        double base,altura,area;
        Scanner scanner = new Scanner(System.in);
System.out.println("Programa para calcular el area de un triangulo");
System.out.println("");
System.out.println("Ingrese los datos de la base y la altura (primero la base)");
base = scanner.nextInt();
System.out.println("Ahora ingrese la altura..");
altura = scanner.nextInt();
area = (base * altura) / 2;
     System.out.println("Con los datos proporcionados se puede decir que el area del triangulo es de: " + area);
scanner.close();
    }
}
