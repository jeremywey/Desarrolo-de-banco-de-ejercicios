import java.util.Scanner;
public class Ejercicio38 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la edad de la persona: ");
        int edad = scanner.nextInt();

        int consumototalgramos = edad * 8000; 

        
        int manzanasconsumidas = consumototalgramos / 4; 

        System.out.println("La persona ha consumido un total de " + consumototalgramos + " gramos de fruta.");
        System.out.println("Esto equivale a aproximadamente " + manzanasconsumidas + " manzanas.");

       scanner.close();
    }
}


