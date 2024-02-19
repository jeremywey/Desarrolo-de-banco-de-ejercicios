import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa para determinar si es mayor de edad");
        System.out.println("----------------------------------------------");
        System.out.println("Digite su edad");
        int edad = scanner.nextInt();
        if(edad < 0){

            System.out.println("dato digitado invalido");
        }else if (edad < 18){

            System.out.println("Usted es menor de edad");
        }else{
            System.out.println("Usted es menor de edad");
        }

scanner.close();
    }
}
