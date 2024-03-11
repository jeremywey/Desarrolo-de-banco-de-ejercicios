import java.util.Scanner;
public class Ejercicio59 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero del 1 al 10: ");
        int num = scanner.nextInt();

        if (num >= 1 && num <= 10) {
            System.out.println("Tabla de multiplicar del " + num + ":");
            for (int i = 1; i <= 10; i++) {
                int resultado = num * i;
                System.out.println(num + " x " + i + " = " + resultado);
            }
        } else {
            System.out.println("El número debe estar entre 1 y 10.");
     
        }
   scanner.close();
    }
}

