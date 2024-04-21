import java.util.Scanner;

public class ejercicio138 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calcular el área de un círculo");
            System.out.println("2. Calcular el área de un rectángulo");
            System.out.println("3. Calcular el área de un triángulo");
            System.out.println("0. Salir");

        
            int opcion = scanner.nextInt();

        
            switch (opcion) {
                case 1:
        
                    System.out.println("Ingrese el radio del círculo:");
                    double radio = scanner.nextDouble();
                    double areaCirculo = Math.PI * Math.pow(radio, 2);
                    System.out.println("El área del círculo es: " + areaCirculo);
                    break;
                case 2:
                
                    System.out.println("Ingrese la base del rectángulo:");
                    double baseRectangulo = scanner.nextDouble();
                    System.out.println("Ingrese la altura del rectángulo:");
                    double alturaRectangulo = scanner.nextDouble();
                    double areaRectangulo = baseRectangulo * alturaRectangulo;
                    System.out.println("El área del rectángulo es: " + areaRectangulo);
                    break;
                case 3:
                
                    System.out.println("Ingrese la base del triángulo:");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.println("Ingrese la altura del triángulo:");
                    double alturaTriangulo = scanner.nextDouble();
                    double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                    System.out.println("El área del triángulo es: " + areaTriangulo);
                    break;
                case 0:
                
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}