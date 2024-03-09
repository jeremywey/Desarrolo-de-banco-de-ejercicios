import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("________Usuario_______");
        System.out.println("Digite su genero y nombre  ");
        System.out.println("Nombre:");
        String name = scanner.nextLine();
        System.out.println("Seleccione ahora una opcion para su genero: \n(1) Hombre \n(2) Mujer \n(3) otro ");
        int sexo = scanner.nextInt();
if (sexo == 1){
    System.out.println("Bienvenido: "+name);
}else if (sexo == 2){
    System.out.println("Bienvenida: "+name);

}else{

    System.out.println("Bienvenide: "+name);
}
       
scanner.close();
    }
}
