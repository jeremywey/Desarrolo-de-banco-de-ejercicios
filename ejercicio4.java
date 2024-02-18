import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radio,area;
        System.out.println("Programa para obtener area de un circulo");
        System.out.println("");
        System.out.println("Ingrese el dato radio para calcular el area del circulo ");
        radio = scanner.nextInt();
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es de: "+area+" cm²");
        

      
    }
}
