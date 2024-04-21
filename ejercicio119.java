import java.util.Scanner;

public class ejercicio119 {
    
    public static void main(String[] args) {
        int c =0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cree una contrasena");
        String contrasena = scanner.nextLine();

        Contrasena contrasenaO = new Contrasena(contrasena);

        while(true){

            System.out.println("Escriba su contrasena");
            String contrasenaa = scanner.next();
            
            if(contrasenaa.equals(contrasenaO.contrasena)){

                System.out.println("Contrasena exitosa");
                break;
            }else{
                System.out.println("INTENTO FALLIDO");

                c++;
            }


            if(c==3){
                System.out.println("Demasiados intentos realizados");
                break;
            }

        }
    }


    static class  Contrasena{
        String contrasena;

        public Contrasena(String contrasena){

            this.contrasena = contrasena;
        }
    }
}
