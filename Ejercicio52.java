import java.util.Scanner;
public class Ejercicio52 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero para obtener su tabla de multiplicar: ");
        int numero = scanner.nextInt();
     
        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);

           
        }
    scanner.close();
}

}
