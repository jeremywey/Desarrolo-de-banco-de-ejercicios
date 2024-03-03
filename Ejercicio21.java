import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String op1, op2;
System.out.println("Ingrese dos datos (estos pueden ser cualquiera)");
System.out.println("------------------------------------------------");
System.out.println("Primer dato");
op1 = scanner.nextLine();
System.out.println("Segundo dato");
op2 = scanner.nextLine();

System.out.println("Los datos ingresados son: (primer dato ) = "+op1+"( segundo dato ) = "+op2);
System.out.println("Ahora se van a intercambiar los datos");
System.out.println("----------------------------------------");
String aux = op1;
op1 = op2;
op2 = aux;
System.out.println("(Primer dato ) = "+op1+" (Segundo dato  ) = "+op2);
        scanner.close();
    }
}
