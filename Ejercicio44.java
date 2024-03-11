public class Ejercicio44 {
     public static void main(String[] args) {
            double pi = 3.14;
    
          for (int i = 2; i <= 10;i++) {
                double potencia = Math.pow(pi, i);
                double raizCuadrada = Math.sqrt(potencia);
    
                System.out.println("π^" + i + " = " + potencia);
                System.out.println("Raíz cuadrada de π^" + i + " = " + raizCuadrada);
                System.out.println();
            }
        }
    }
    

