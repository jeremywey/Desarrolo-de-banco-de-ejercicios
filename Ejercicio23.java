
import java.util.*;
public class Ejercicio23 {
    public static void main(String[] args) {

    int aleatorio[] = generacionDeTresNumerosRandomsEntre0y9();
    int n1 = pedirIntento("Digite un numero"); 
    int n2 = pedirIntento("Digite otro numero"); 
    int n3 = pedirIntento("Digite un numero mas"); 
    String respuesta = validacionDeIntentos( aleatorio, n1, n2, n3 );
        System.out.println("Respuesta "+respuesta);
}

public static int[]generacionDeTresNumerosRandomsEntre0y9(){
    
var azar = new Random();
int n1,n2,n3;

do{
     n1 = azar.nextInt(10 - 0 );
     n2 = azar.nextInt(10 - 0 );
     n3 = azar.nextInt(10 - 0 );
if(n1 != n2 && n2 != n3 && n1 != n3){
    break;
}

    
}
while(true);
return new int[]{n1, n2, n3};
}
public static int pedirIntento(String mensaje){
    Scanner scanner = new Scanner(System.in);
    do{
    System.out.println(mensaje+": ");
    int n = scanner.nextInt();
    if(n < 0 || n > 9){
        System.out.println("El numero"+" ("+ n+")"+  " que usted digito no esta entre 0 y 9");
        continue;
    }

    return n;

    
}
while(true);

}

public static String validacionDeIntentos(int aleatorio[], int n1, int n2, int n3){

    String respuesta = " ";
    if (n1 == aleatorio[0]  ){
        respuesta += "V";
    
    }else if (n1 == aleatorio[1] ){
         respuesta += "A";


    }else if (n1 == aleatorio[2] ){
        respuesta += "A";

    }else{

        respuesta += "R";

}
if (n2 == aleatorio[0]  ){
    respuesta += "A";

}else if (n2 == aleatorio[1] ){
     respuesta += "V";


}else if (n2 == aleatorio[2] ){
    respuesta += "A";

}else{

    respuesta += "R";


}

if (n3 == aleatorio[0]  ){
    respuesta += "A";

}else if (n3 == aleatorio[1] ){
     respuesta += "A";


}else if (n3 == aleatorio[2] ){
    respuesta += "V";

}else{

    respuesta += "R";

}

return respuesta;
}

}