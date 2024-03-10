import java.util.Scanner;

public class Ejercicio32 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float cm,mm,base,altura,R;

        System.out.println("programa que calcula el area de un triangulo en metros" );
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Ingrese la base del triangulo primero");
        base = scanner.nextFloat();
        System.out.println(" Ahora ingrese la  altura del triangulo");
        altura = scanner.nextFloat();

        R = base *  altura / 2;
        cm = R * 100;
        mm = cm * 10;
        System.out.println(" El area del treangulo es de: "+R+"m²");
        System.out.println( "si este pasara a centimetros cuadrados: "+cm+"cm²");
        System.out.println(" si este pasara a metros cuadrados: "+mm+"mm²");

scanner.close();
    }
}
