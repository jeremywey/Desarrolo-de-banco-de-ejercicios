import java.util.Scanner;

public class Ejercicio180 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalPersonas = 0;
        int totalHombres = 0;
        int totalMujeres = 0;
        int sumaEdadesHombres = 0;
        int sumaEdadesMujeres = 0;
        int edadMasJoven = Integer.MAX_VALUE;
        
        while (true) {
            System.out.print("Ingresa la edad (-1 para terminar): ");
            int edad = scanner.nextInt();
            if (edad == -1) {
                break;
            }
            if (edad >= 18) {
                totalPersonas++;
                System.out.print("Ingresa el sexo (H/M): ");
                char sexo = scanner.next().charAt(0);
                if (sexo == 'H') {
                    totalHombres++;
                    sumaEdadesHombres += edad;
                } else if (sexo == 'M') {
                    totalMujeres++;
                    sumaEdadesMujeres += edad;
                }
                if (edad < edadMasJoven) {
                    edadMasJoven = edad;
                }
            } else {
                System.out.println("Lo siento, no se permiten menores de edad a la fiesta.");
            }
        }
        
        double promedioEdadHombres = totalHombres > 0 ? (double) sumaEdadesHombres / totalHombres : 0;
        double promedioEdadMujeres = totalMujeres > 0 ? (double) sumaEdadesMujeres / totalMujeres : 0;
        
        System.out.println("Total de personas que asistieron a la fiesta: " + totalPersonas);
        System.out.println("Total de hombres: " + totalHombres);
        System.out.println("Total de mujeres: " + totalMujeres);
        System.out.println("Promedio de edad de los hombres: " + promedioEdadHombres);
        System.out.println("Promedio de edad de las mujeres: " + promedioEdadMujeres);
        System.out.println("Edad de la persona más joven que asistió: " + edadMasJoven);
        
        scanner.close();
    }
}
