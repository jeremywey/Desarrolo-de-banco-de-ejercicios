import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        double nota;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que determina si ganaste o perdiste un examen");
        System.out.println("---------------------------------------------------------");
        System.out.println("Las notas se evaluaran del 0 al 5");
        System.out.println("Porfavor digite sus notas");
        nota = scanner.nextDouble();
        
        if (nota > 5 || nota < 0) {
            System.out.println("Dato invalido");
        }else if(nota < 3){
            System.out.println("Usted reprobo");
            
        }else{ 
            System.out.println("Usted aprobo Felicidades");

        }
scanner.close();
    }
}
