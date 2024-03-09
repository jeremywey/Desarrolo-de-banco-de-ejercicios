import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       float km,m; 
      
       System.out.println("Digite Cualquier cantida de kilometros(km)\npara convertirla en metros(m) ");
       km = scanner.nextFloat();
        m = km * 1000;
        System.out.println("------------------------------------------------------");
        System.out.println("Cantidad de "+km+"km a metros es de "+m+"m");
   scanner.close();
    }
}
