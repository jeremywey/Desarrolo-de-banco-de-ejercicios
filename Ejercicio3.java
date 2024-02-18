import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        double base,altura,area ;
        System.out.println("Programa para optener area de un triangulo ");
        System.out.println("");
        System.out.println("Ingrese los datos de la base y la altura (primero la base)");
        base = scanner.nextInt();
        System.out.println("Ahora ingrese la altura..");
        altura = scanner.nextInt();
        area = (base * altura) / 2;
             System.out.println("Con los datos proporcionados se puede decir que el area del triangulo es de: " + area);
        
        
    }
}
