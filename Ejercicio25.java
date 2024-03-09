import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float celcius, fahrenheit;
        System.out.println("Digite cualquier temperatura en grados centígrados");
        celcius = scanner.nextFloat();
        fahrenheit = celcius * 9 / 5 + 32;
        System.out.println("Los grados centígrados que usted digito ("+celcius+"C°)" );
        System.out.println("son equivalentes a ("+fahrenheit+") grados fahrenheit");
        scanner.close();
    }
   
}
