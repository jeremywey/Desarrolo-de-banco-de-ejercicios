import java.util.Scanner;

public class ejercicio140 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        while (true) {
        
            System.out.println("Menú:");
            System.out.println("1) Salir");
            System.out.println("2) Sumatoria");
            System.out.println("3) Factorial");
            System.out.println("Ingrese su opción:");

        
            int opcion = scanner.nextInt();

            
            switch (opcion) {
                case 1:
                
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                case 2:
                
                    System.out.println("Ingrese un número para calcular la sumatoria:");
                    int numeroSumatoria = scanner.nextInt();
                    int sumatoria = calcularSumatoria(numeroSumatoria);
                    System.out.println("La sumatoria de " + numeroSumatoria + " es: " + sumatoria);
                    break;
                case 3:
        
                    System.out.println("Ingrese un número para calcular el factorial:");
                    int numeroFactorial = scanner.nextInt();
                    long factorial = calcularFactorial(numeroFactorial);
                    System.out.println("El factorial de " + numeroFactorial + " es: " + factorial);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida (1, 2 o 3).");
                    break;
            }
        }
    }

    
    public static int calcularSumatoria(int numero) {
        int sumatoria = 0;
        for (int i = 1; i <= numero; i++) {
            sumatoria += i;
        }
        return sumatoria;
    }


    public static long calcularFactorial(int numero) {
        if (numero < 0) {
            return -1; 
        }
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}