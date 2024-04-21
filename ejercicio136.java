import java.time.LocalTime;

public class ejercicio136 {
    public static void main(String[] args) {
        
        while (true) {

            LocalTime horaActual = LocalTime.now();
            
            String horaFormateada = String.format("%02d:%02d:%02d", horaActual.getHour(), horaActual.getMinute(), horaActual.getSecond());
            
        
            System.out.print("\r" + horaFormateada);
            
            try {
            
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
