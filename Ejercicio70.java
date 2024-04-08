public class Ejercicio70 {
 
  public static void main(String[] args) {
        int i=0,A=1,B=2;
        boolean pass=true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantas veces desea hacer la suma y resta " );
        int num = scanner.nextInt();

            for(int e = 1;e <num;e++){

                if(pass){
                    A= A - B;
                    pass=false;
                }else{
                    A= A + B;
                    pass=true;
                }
                B++;
            }

            System.out.println("El resultado es " + (A));
    }
} 