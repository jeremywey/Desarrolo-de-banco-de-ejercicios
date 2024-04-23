import java.util.Arrays;

public class Ejercicio168 {
    public static void main(String[] args) {
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        Arrays.sort(vocales);
        
        System.out.println("Las vocales ordenadas son:");
        for (char vocal : vocales) {
            System.out.println(vocal);
        }
    }
}
