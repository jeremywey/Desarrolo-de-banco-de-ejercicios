import java.util.Scanner;

public class Ejercicio183 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa tu nombre completo: ");
        String nombreCompleto = scanner.nextLine().toLowerCase();
        
        int totalVocales = 0;
        int[] frecuenciaVocales = new int[5]; // 0: a, 1: e, 2: i, 3: o, 4: u
        
        for (int i = 0; i < nombreCompleto.length(); i++) {
            char letra = nombreCompleto.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                totalVocales++;
                switch (letra) {
                    case 'a':
                        frecuenciaVocales[0]++;
                        break;
                    case 'e':
                        frecuenciaVocales[1]++;
                        break;
                    case 'i':
                        frecuenciaVocales[2]++;
                        break;
                    case 'o':
                        frecuenciaVocales[3]++;
                        break;
                    case 'u':
                        frecuenciaVocales[4]++;
                        break;
                }
            }
        }
        
        System.out.println("Total de vocales en el nombre: " + totalVocales);
        System.out.println("Frecuencia de vocales:");
        System.out.println("A: " + frecuenciaVocales[0]);
        System.out.println("E: " + frecuenciaVocales[1]);
        System.out.println("I: " + frecuenciaVocales[2]);
        System.out.println("O: " + frecuenciaVocales[3]);
        System.out.println("U: " + frecuenciaVocales[4]);
        
        scanner.close();
    }
}
