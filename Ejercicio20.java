import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String []si){
        double not1, not2, not3, not4,not5,promedio;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 5 notas para calcular el promedio\n(Las notas digitadas deben ser del 1 al 5)");
         not1 = scanner.nextDouble();
         not2 = scanner.nextDouble();
         not3 = scanner.nextDouble();
         not4 = scanner.nextDouble();
         not5 = scanner.nextDouble();
         if (not1 < 0  || not2 < 0 || not3 < 0 || not4 < 0 || not5 < 0){
            System.out.println("Numeros registrados son incorrectos");

         }else if (not1 > 5 || not2 > 5 || not3 > 5 || not4 > 5 || not5 > 5){
            System.out.println("Numeros registrados son incorrectos");
         }else{
            promedio = (not1 + not2 + not3 + not4 + not5)/5;
            System.out.println("Su promedio total con las notas registradas es de: "+promedio);

         }
scanner.close();         

        

    }
}
