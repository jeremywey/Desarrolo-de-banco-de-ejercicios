import java.util.Scanner;

public class Ejercicio62{
    public static void main(String[] args) {

        tomaTempCada4hr(0);
        
    }


public static int tomaTempCada4hr(int temp){
   Scanner scanner = new Scanner(System.in);
    do {
        
        for(int i = 14400; i >= 0; i--){

            System.out.print(i);
        }
System.out.println("Tiempo finalizado por favor ingrese la temperatura");
temp = scanner.nextInt();


scanner.close();
    } while (true);



}

}