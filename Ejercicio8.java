import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int num1, num2, resto, R;
        System.out.println("Programa para calcular el resto de una division");
        System.out.println("------------------------------------------------");
        System.out.println("Digite 2 numero para hacer una division y haci mostrar el resto de esta");
        System.out.println("");
        System.out.println("primero digite el dividiendo");
        num1 = scanner.nextInt();
        System.out.println("Ahora el divisor");
        num2 = scanner.nextInt();

        R = num1 / num2;
        resto = num1 - (R * num2);

        System.out.println("El resultado de esta division: "+num1+" / "+num2+" = "+R);
        System.out.println("y su resto es de: "+resto);

        
    }

}
