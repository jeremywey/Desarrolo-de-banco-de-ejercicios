import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salario_A,salario_a, mujeres, hombres, promedio,totalgen,total;
        System.out.println("Digite cuantas mujeres y hombres trabajan en su empresa");
        System.out.println("Mujeres:");
        mujeres = scanner.nextInt();
        System.out.println("Hombres");
        hombres = scanner.nextInt();

        totalgen = hombres + mujeres;



do{
    System.out.println("El total de personas trabajando es de: "+ totalgen);
    System.out.println("");
    System.out.println("De acuerdo con esto datos ingrese la cantidad de personas que ganan mas de 700");
salario_A = scanner.nextInt();
System.out.println("Ahora las que ganan menos de 700");
salario_a = scanner.nextInt();
System.out.println("");

total = salario_A + salario_a;
if (totalgen == salario_A + salario_a){
    promedio = (salario_A + salario_a) / 2;
    System.out.println("El promedio de los salarios es de: "+ promedio);
    System.out.println("Con un total de "+hombres+" hombres y "+mujeres+ " mujeres trabajando");
    
}else{
    System.out.println("Los salarios totales de personas ingresada no concuerdan con el total ");
    System.out.println("con el total de hombres y mujeres trabajando en la empresa");
System.out.println("Repita la operacion");
System.out.println("-----------------------------------------------------------------------------");
System.out.println("");
}

}while(totalgen != total);




        scanner.close();
    }
}
