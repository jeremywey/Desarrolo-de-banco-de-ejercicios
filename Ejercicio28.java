import java.util.Scanner;
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite cualquier numero, para hacer una cuenta regresiva");
        System.out.println("-------------------------------------------------------------");
        int numero = scanner.nextInt();
        System.out.println("Numero seleccionado ("+numero+") uniciando cuenta regresiva:");

        for (int i = numero; i >= 0; i--) {
 System.out.print( i +",");

    }
    System.out.println(" Fin de la cuenta");
   scanner.close();
}
}