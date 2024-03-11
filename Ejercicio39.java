import java.util.Scanner;
public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona zzz");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa el año de nacimiento: ");
        int añonacido = scanner.nextInt();

        System.out.print("Ingresa el año actual: ");
        int añoactual = scanner.nextInt();
        
        int edad = añoactual - añonacido;

        double tiempodormido = 365 * 0.34; 
        double dias_zzz = tiempodormido * edad;

        System.out.println("La persona" +nombre+ "(zzz) ha dormido aproximadamente " + (int) dias_zzz + " días en su vida.");
    scanner.close();
}

}
