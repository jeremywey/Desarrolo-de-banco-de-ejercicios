import java.util.Scanner;

public class Ejercicio66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cuenta, suma= 0;

        System.out.println("Digite un valor para hacer una sumaria del 1 al numero que digito ");
        System.out.println("Se le restara -1");
        cuenta = scanner.nextInt();
        for(int i = 1; i <= cuenta ; i++){
             suma += i;

        }
     
        System.out.println("El numero digitado sumado y restado es igual a :"+ (suma - 1));
    scanner.close();
    }

}
