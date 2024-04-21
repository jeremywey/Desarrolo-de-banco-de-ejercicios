import java.util.Scanner;

public class ejercicio135 {
    
    public static void main(String[] args) {
        int seguiM = Integer.MIN_VALUE;
        int seguirm = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el limite de numeros");
        int limite = scanner.nextInt();

        int[] array = new int[limite];

        for (int i = 0; i < limite; i++) {
            
            System.out.println("Escriba un numero");
            int numero = scanner.nextInt();

            if(numero>= seguiM){
                seguiM =numero;
            }

            if(numero <= seguirm){
                seguirm = numero;
            }

        }

        System.out.println("El numero mayor es " + seguiM);
        System.out.println("El numero menor es " + seguirm);


    }
}
