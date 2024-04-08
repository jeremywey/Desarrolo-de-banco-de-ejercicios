import java.util.Scanner;

public class Ejercicio64 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
System.out.println("Introduzca un 2 numeros donde 'x' va a hacer elevado por 'y' ");
int numx,numy,sa;
System.out.println("Introduzca el primer numero 'x' ");
numx = scanner.nextInt();
System.out.println("Ahota el segundo 'y' ");
numy = scanner.nextInt();
sa = numx;
for(int i = 1; i < numy; i++){

numx = sa * numx;
 
         
}
System.out.println("El numero "+sa+" potenciado a "+ numy+" es igual a " +numx);
scanner.close();
    }
}
