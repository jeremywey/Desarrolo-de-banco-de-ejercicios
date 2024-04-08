import java.util.Scanner;

public class Ejercicio67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un valor para devolverle su factorial");
    int num = scanner.nextInt();
    int factorial=1;

    for(int i = 1; i<=num; i++){
        factorial *= i;
    }
    System.out.println("El factorial del numero ingresado es: "+factorial);
scanner.close();   
}
}
