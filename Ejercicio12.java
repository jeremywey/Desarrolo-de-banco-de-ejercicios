import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite el primer numero");
        double n1 = lectura.nextDouble();
        System.out.println("Digite el segundo numero");
        double n2 = lectura.nextDouble();
        System.out.println("Digite el tercero numero");
        double n3 = lectura.nextDouble();

        double sumat = n1+n2+n3;
        double promedio = sumat/3;

        double n1D = n1+n1;
        double n2D = n2+n2+n2;
        double n3D = n3*n3;

        System.out.println("La suma total de los numeros es de " + sumat  +" y la media aritmetica es de " + promedio);
        System.out.println("Primer numero " + n1D + "---segundo numero " + n2D + "---Tercer numero " + n3D);
    }
}
