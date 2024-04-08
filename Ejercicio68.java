import java.util.Scanner;

public class Ejercicio68 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
    int factorial= 1,suma=0;
    

System.out.println("Ingrese un numero para calcular la suma de su factoriales");
int num = scanner.nextInt();



System.out.println();
    for(int i = 1;i <= num; i++){
factorial *= i;
suma += factorial;
System.out.print(factorial+"/");


    }
   
System.out.println("");
System.out.println("La suma de los factoriales anteriores es de:");
System.out.println(+suma);
    scanner.close();
    }
}
