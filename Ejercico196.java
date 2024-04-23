public class Ejercico196 {
    public static void main(String[] args) {
        double[][] ingresos = new double[18][10];

        // Inicializar ingresos (ejemplo)
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 10; j++) {
                ingresos[i][j] = Math.random() * 1000; // Ingresos aleatorios
            }
        }

        // Total de cada vendedor
        for (int i = 0; i < 18; i++) {
            double totalVendedor = 0;
            for (int j = 0; j < 10; j++) {
                totalVendedor += ingresos[i][j];
            }
            System.out.println("Total del vendedor " + (i+1) + ": $" + totalVendedor);
        }

        // Promedio por producto
        for (int j = 0; j < 10; j++) {
            double totalProducto = 0;
            for (int i = 0; i < 18; i++) {
                totalProducto += ingresos[i][j];
            }
            System.out.println("Promedio del producto " + (j+1) + ": $" + (totalProducto / 18));
        }

        // Promedio por vendedor
        for (int i = 0; i < 18; i++) {
            double totalVendedor = 0;
            for (int j = 0; j < 10; j++) {
                totalVendedor += ingresos[i][j];
            }
            System.out.println("Promedio del vendedor " + (i+1) + ": $" + (totalVendedor / 10));
        }

        // Ingresos totales
        double ingresosTotales = 0;
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 10; j++) {
                ingresosTotales += ingresos[i][j];
            }
        }
        System.out.println("Ingresos totales: $" + ingresosTotales);
    }
}
