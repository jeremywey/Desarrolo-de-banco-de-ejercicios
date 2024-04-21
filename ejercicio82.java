import java.util.Scanner;

public class ejercicio82 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un numero");
        int num = scanner.nextInt();

        if(num>0){
            System.out.println("El numero es positivo");
        }else if(num == 0){
            System.out.println("El numero es 0");
        }else{
            System.out.println("El numero es negativo");
        }
    }
}
