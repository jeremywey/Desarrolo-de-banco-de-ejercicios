import java.util.Scanner;

public class Ejercicio76 {
    public static void main(String[] args) {
        
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite cierta cantidad de cifra para determinar cuantas son");
        num = scanner.nextInt();
        int cifras = contarCifras(num);
        System.out.println("El número " + num + " tiene " + cifras + " cifras.");
        scanner.close();
    }

    public static int contarCifras(int num) {
        int contador = (num == 0) ? 1 : 0;
        while (num != 0) {
            contador++;
            num /= 10;
        }
        return contador;
   
    }
}
