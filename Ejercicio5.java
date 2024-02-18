import java.util.Scanner;
public class Ejercicio5 {
public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
double Diagonal,diagonal,area;
System.out.println("Programa para calcular area de un rombo");
System.out.println("");
System.out.println("Ingrese los datos para calcular el area del rombo");
System.out.println("---------------------------------------------------- ");
System.out.println("Intrese la diagonal mayor");
Diagonal = scanner.nextDouble();
System.out.println("Intrese la diagonal menor");
diagonal = scanner.nextDouble();
  area = (Diagonal * diagonal) / 2;
  System.out.println("El area del rombo es de: "+area+"cm²");
  scanner.close();
}
}
