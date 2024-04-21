import java.util.Scanner;

public class ejercicio96 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int c =0;
        System.out.println("Escriba la frase");
        String frase = scanner.nextLine();
        String palabra = "";
        for (int i = 0; i < frase.length(); i++) {
            
            char chart = frase.charAt(i);
            if(chart == ' '){
                System.out.println(palabra+ " " + c + " "+ "Cantidad de letras");
                palabra = "";
                c=0;
            }else{
                palabra += chart;
                c++;
            }
            
        }
        System.out.println(palabra+ " " + c + " "+ "Cantidad de letras");
    }
}
