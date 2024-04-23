import java.util.Scanner;

public class Ejercicio185 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa tu nombre completo: ");
        String nombreCompleto = scanner.nextLine().toUpperCase();
        System.out.print("Ahora, ingresa tu fecha de nacimiento en formato AAAA-MM-DD: ");
        String fechaNacimiento = scanner.next();
        System.out.print("Ingresa tu sexo (F/M): ");
        char sexo = scanner.next().toUpperCase().charAt(0);
        System.out.print("Ingresa la entidad de nacimiento (dos letras o NE para Nacido Extranjero): ");
        String entidadNacimiento = scanner.next().toUpperCase();
        
        String[] nombres = nombreCompleto.split(" ");
        String primerApellido = nombres[nombres.length - 2];
        String segundoApellido = nombres[nombres.length - 1];
        String primerNombre = nombres[0];
        
        String curp = segundoApellido.substring(0, 1) +
                      primerNombre.substring(0, 1) +
                      fechaNacimiento.substring(2, 4) +
                      fechaNacimiento.substring(5, 7) +
                      fechaNacimiento.substring(8) +
                      sexo +
                      entidadNacimiento +
                      primeraConsonanteInterna(primerApellido) +
                      primeraConsonanteInterna(segundoApellido) +
                      primeraConsonanteInterna(primerNombre) +
                      calcularDigitoVerificador(fechaNacimiento) +
                      "XX"; // Homoclave
        
        System.out.println("Tu CURP (Clave Única de Registro de Población) es: " + curp);
        
        scanner.close();
    }
    
    public static char primeraConsonanteInterna(String palabra) {
        for (int i = 1; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (!esVocal(letra)) {
                return letra;
            }
        }
        return 'X'; // Si no se encuentra, se devuelve una 'X' como valor por defecto
    }
    
    public static boolean esVocal(char letra) {
        return letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U';
    }
    
    public static char calcularDigitoVerificador(String fechaNacimiento) {
        int año = Integer.parseInt(fechaNacimiento.substring(2, 4));
        char letra;
        if (año >= 0 && año <= 99) {
            letra = (char) ('A' + año);
        } else {
            letra = '0'; // Si el año no es válido, se devuelve '0' como valor por defecto
        }
        return letra;
    }
}
