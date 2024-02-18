import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("programa para determinar si un numero es negativo o positivo");
        System.out.println("_________________________________________________________________");
        Scanner scanner = new Scanner(System.in); 
System.out.println("Digite un numero para determinar si es negativo o positivo");
double num = scanner.nextDouble();

if (num < 0){
System.out.println("El numero dado es Negativo: ("+num+")");

}else {
    System.out.println("El numero dado es positivo: ("+num+")");
}

scanner.close();
    }
}
