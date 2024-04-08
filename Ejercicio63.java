import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       ArrayList<Integer> numeros = new ArrayList<Integer>();
       int numero,suma = 0;

        System.out.println("Ingrese numeros del 20 al 30 (introduzca '0' para terminar con la operacion )");
      while (true){

        numero = scanner.nextInt();
        if(numero == 0){
            break;
            
        }else if (numero < 20 || numero > 30){

                break;
        }
numeros.add(numero);
suma += numero;

System.out.println("Los numeros introducidos fueron" + numeros  );
System.out.println("y la suma de todo estos numero seria "+suma);
scanner.close();
      }
        


    }
}
