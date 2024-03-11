import java.util.Scanner;
public class Ejercicio60 {
    
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); 
    int num, conteo = 0; 
    do {
      System.out.print("Digite un numero: "); 
      num = entrada.nextInt(); 
      if (num > 0) { 
        conteo++; 
      }
    } while (num != 0); 
    System.out.println("\nEl total de numeros mayores que 0 es: " + conteo); 
    entrada.close(); 
  }


}
