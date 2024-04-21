import java.util.Scanner;

public class ejercicio85 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite un numero");
        int num = scanner.nextInt();
        if(num% 2 == 0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
}
