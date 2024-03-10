import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float cm,m,base,altura,R;

        System.out.println("programa que calcula el area de un triangulo en milimetros" );
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Ingrese la base del triangulo primero");
        base = scanner.nextFloat();
        System.out.println(" Ahora ingrese la  altura del triangulo");
        altura = scanner.nextFloat();

        R = base *  altura / 2;
        cm = R / 10;
        m = cm / 100;
        System.out.println(" El area del treangulo es de: "+R+"mm²");
        System.out.println( "si este pasara a centimetros cuadrados: "+cm+"cm²");
        System.out.println(" si este pasara a metros cuadrados: "+m+"m²");

scanner.close();
    }
}
