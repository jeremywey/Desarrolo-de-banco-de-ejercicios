import java.util.Scanner;

public class Ejercicio9 {
public static void main(String[] args) {
    double pesos,monto, IVA = 0.16;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Programa que determina el monto del IVA sobre una cantidad dada");
    System.out.println("----------------------------------------------------------------");
    System.out.println("Ingrese una cantidad de pesos(COP) para determinar su IVA");
     pesos = scanner.nextDouble();

    monto = pesos * IVA;
   System.out.println("El monto extra que va a pagar por el IVA es de "+monto);
   System.out.println("precio final es de: "+(monto + pesos));
   scanner.close();
}
}
