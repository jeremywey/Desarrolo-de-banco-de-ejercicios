import java.util.Scanner;

public class ejercicio95 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tamano del vector");
        int n1 = scanner.nextInt();

        double[] vector = vectorGe(n1);
        
        for (int index = 0; index < vector.length; index++) {
            
            System.out.println(vector[index]);
        }
    }

    public static double[] vectorGe(int length){

        double[] vector = new double[length];
        double[] vectorCopia = new double[length];
        double guia=0;
        for(int i =0; i < vector.length;i++){

            vector[i] = Math.random() * 10;
        }

        for (int i = 0; i < vector.length; i++) {
            guia = vector[i];
            int index=0;
            for (int j = 0; j < vectorCopia.length; j++) {
                if(vector[j]>guia && !hallarValor(vectorCopia,vector[i])){
                    guia = vector[j];
                    index =j;
                }
            }
            vectorCopia[i] = guia;
            vector[index] = Double.NEGATIVE_INFINITY;
        }
        return vectorCopia;
    }

    public static boolean hallarValor(double[] vector,double valor){

        for (int i = 0; i < vector.length; i++) {
            if(valor == vector[i]){
                return true;
            }
        }

        return false;
    }
}
