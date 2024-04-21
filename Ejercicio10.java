import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite la base");
        double base = lectura.nextDouble();
        System.out.println("Digite la altura");
        double altura = lectura.nextDouble();

        double resultado = (base*altura)/2;

        System.out.println("El resultado del area es " + resultado);
    }
}

