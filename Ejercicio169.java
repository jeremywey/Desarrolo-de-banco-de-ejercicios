import java.util.Scanner;

public class Ejercicio169 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa tu año de nacimiento: ");
        int añoNacimiento = scanner.nextInt();
        
        int edad = 2024 - añoNacimiento;
        
        if (edad >= 1 && edad <= 12) {
            System.out.println("Estás en la etapa de niñez.");
        } else if (edad >= 13 && edad <= 18) {
            System.out.println("Estás en la etapa de adolescencia.");
        } else if (edad >= 19 && edad <= 30) {
            System.out.println("Estás en la etapa de juventud.");
        } else if (edad >= 31 && edad <= 60) {
            System.out.println("Estás en la etapa de adultez.");
        } else if (edad > 60 && edad <= 100) {
            System.out.println("Estás en la etapa de vejez.");
        } else {
            System.out.println("Edad fuera del rango válido (1-100).");
        }
        
        scanner.close();
    }
}
