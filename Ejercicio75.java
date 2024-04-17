import java.util.Scanner;

public class Ejercicio75 {
    public static void main(String[] args) {
        int añobicistao;
       Scanner scanner = new Scanner(System.in);
     System.out.println("Ingrese un año para determinar si es biciesto");
    añobicistao = scanner.nextInt();
         
        boolean esBisiesto = (añobicistao % 4 == 0 && añobicistao % 100 != 0) || (añobicistao % 400 == 0);

        if (esBisiesto) {
            System.out.println(añobicistao + " es un año bisiesto.");
        } else {
            System.out.println(añobicistao + " no es un año bisiesto.");
        }
   scanner.close();
 }
}
