import java.util.Scanner;

public class Ejercicio179 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, ingresa las calificaciones del alumno:");
        System.out.print("Matemáticas: ");
        double matematicas = scanner.nextDouble();
        System.out.print("Inglés: ");
        double ingles = scanner.nextDouble();
        System.out.print("Español: ");
        double espanol = scanner.nextDouble();
        
        double promedio = (matematicas + ingles + espanol) / 3;
        System.out.println("El promedio del alumno es: " + promedio);
        
        int aprobadas = 0;
        int reprobadas = 0;
        if (matematicas >= 6) {
            aprobadas++;
        } else {
            reprobadas++;
        }
        if (ingles >= 6) {
            aprobadas++;
        } else {
            reprobadas++;
        }
        if (espanol >= 6) {
            aprobadas++;
        } else {
            reprobadas++;
        }
        System.out.println("Total de materias aprobadas: " + aprobadas);
        System.out.println("Total de materias reprobadas: " + reprobadas);
        
        String materiaMenorCalificacion = "Matemáticas";
        if (ingles < matematicas && ingles < espanol) {
            materiaMenorCalificacion = "Inglés";
        } else if (espanol < matematicas && espanol < ingles) {
            materiaMenorCalificacion = "Español";
        }
        System.out.println("La materia con menor calificación es: " + materiaMenorCalificacion);
        
        scanner.close();
    }
}
