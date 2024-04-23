public class Ejercicio200 {
    public static void main(String[] args) {
        double capitalInicial = 1000; // Capital inicial
        double tasaInteresMensual = 0.015; // Tasa de interés mensual

        // Calcular el capital después de 2 meses
        double capitalFinal = capitalInicial * Math.pow(1 + tasaInteresMensual, 2);

        double ganancia = capitalFinal - capitalInicial;
        System.out.println("Después de 2 meses, ganará $" + ganancia + " de interés.");
    }
}
