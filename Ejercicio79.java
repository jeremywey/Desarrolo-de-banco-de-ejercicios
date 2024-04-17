public class Ejercicio79 {
    public static void main(String[] args) {
        int numeroBombillos = 3; 
        int voltajeIndividual = 120; 

        
        int voltajeTotalVoltios = numeroBombillos * voltajeIndividual;

        
        double voltajeTotalKilovoltios = voltajeTotalVoltios / 1000.0;

        System.out.println("El voltaje total de los " + numeroBombillos +
      " bombillos es: " + voltajeTotalKilovoltios + " kV");
    }
}
