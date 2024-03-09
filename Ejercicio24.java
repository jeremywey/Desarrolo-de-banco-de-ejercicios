import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cm, pulg;
    System.out.println("Digite una cantidad de pulgadas(plg) para convertir a centimetros(cm)");
    pulg = scanner.nextDouble();
    
    cm = pulg * 2.54;

    System.out.println("Las pulgadas que digito a centimetros son: "+cm+"cm");

    }
}
