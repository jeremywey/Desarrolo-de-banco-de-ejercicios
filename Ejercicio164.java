import java.util.Scanner;

public class Ejercicio164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalBoletos = 0;
        int ventaBruta = 0;
        int ventaAdulto = 0;
        int ventaNiño = 0;
        int ventaPromocion = 0;
        
        System.out.println("Por favor, ingresa la cantidad de boletos vendidos de cada tipo:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Boletos de Adulto: ");
            int boletosAdulto = scanner.nextInt();
            System.out.print("Boletos de Niño: ");
            int boletosNiño = scanner.nextInt();
            System.out.print("Boletos de Promoción: ");
            int boletosPromocion = scanner.nextInt();
            
            totalBoletos += boletosAdulto + boletosNiño + boletosPromocion;
            ventaBruta += boletosAdulto * 60 + boletosNiño * 30 + boletosPromocion * 20;
            ventaAdulto += boletosAdulto;
            ventaNiño += boletosNiño;
            ventaPromocion += boletosPromocion;
        }
        
        System.out.println("\nResumen de ventas:");
        System.out.println("Total de boletos vendidos: " + totalBoletos);
        System.out.println("Venta bruta: $" + ventaBruta);
        System.out.println("Venta de boletos de Adulto: " + ventaAdulto);
        System.out.println("Venta de boletos de Niño: " + ventaNiño);
        System.out.println("Venta de boletos de Promoción: " + ventaPromocion);
        
        scanner.close();
    }
}
