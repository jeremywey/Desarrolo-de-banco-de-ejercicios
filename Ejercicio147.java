import java.util.Scanner;

public class Ejercicio147 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAlumnos = 5;
        int[] examen1 = new int[numAlumnos];
        int[] examen2 = new int[numAlumnos];
        int[] examen3 = new int[numAlumnos];

        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Ingrese las calificaciones del alumno " + (i + 1) + ":");
            System.out.print("Examen 1: ");
            examen1[i] = scanner.nextInt();
            System.out.print("Examen 2: ");
            examen2[i] = scanner.nextInt();
            System.out.print("Examen 3: ");
            examen3[i] = scanner.nextInt();
        }

        int aprobadosTodos = 0;
        int aprobadosAlMenosUno = 0;
        int aprobadosUltimo = 0;

        for (int i = 0; i < numAlumnos; i++) {
            if (examen1[i] >= 60 && examen2[i] >= 60 && examen3[i] >= 60) {
                aprobadosTodos++;
            }
            if (examen1[i] >= 60 || examen2[i] >= 60 || examen3[i] >= 60) {
                aprobadosAlMenosUno++;
            }
            if (examen3[i] >= 60 && examen1[i] < 60 && examen2[i] < 60) {
                aprobadosUltimo++;
            }
        }

        System.out.println("a) Alumnos que aprobaron todos los exámenes: " + aprobadosTodos);
        System.out.println("b) Alumnos que aprobaron al menos un examen: " + aprobadosAlMenosUno);
        System.out.println("c) Alumnos que aprobaron únicamente el último examen: " + aprobadosUltimo);

        scanner.close();
    }
}

