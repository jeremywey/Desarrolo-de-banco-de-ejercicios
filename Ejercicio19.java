import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String []tumae) {
        int sueld, total, ext, desc;
     Scanner scanner = new Scanner(System.in);
        System.out.println("Porfavor digite su sueldo");
        System.out.println(".............................");
        sueld = scanner.nextInt();
        System.out.println("Por cada hora extra trabajada se le sumara un 20% a su sueldo");
        System.out.println("");
        System.out.println("Digite las horas extras trabajadas");
        ext = scanner.nextInt();
        desc = 20% sueld * ext;
        total = desc + sueld;
        if (ext < 0){
            System.out.println("Dato invalido por favor repita toda la operacion");

        }else{
            System.out.println("El sueldo ingresado es de: "+sueld+"$ \n se le dara un descuento del 20% por las horas extras trabajadas ");
            System.out.println("-----------------------------------------------");
            System.out.println("Las horas extras trabajadas fueron de: "+ext+"\n por lo tanto se le dara un descuento de " +desc+ "$ a su sueldo");
            System.out.println("Monto total del sueldo: "+total+"$");
        }
   scanner.close();
 }
}
