package ejercitaciones1;

/**
 * Generar un programa que permita indicar en un array, precios de productos
 * En otro array, descripciones de los productos respectivos
 * En otra variable, el porcentaje de descuento
 * El programa debe calcular el total menos el descuento, y presentar la siguiente salida:
 * Resumen de venta:
 * Producto 1    $23
 * Producto 2    $25
 *
 * Total:           $48
 * Descuento:       10%
 * Total final:     $39,2
 */
public class DetalleDeFactura {
    public static void main(String[] args) {

        int numDeProductos = 3;

        double[] precios;
        String[] descripciones;
        double porcentajeDescuento = 10;
        double total = 0;

        // TODO: leer data por teclado
        precios = new double[]{10, 20, 30};
        descripciones = new String[]{"Producto 1", "Producto 2", "Producto 3"};

        System.out.println("Resumen de venta:");
        for (int i = 0; i < numDeProductos; i++) {
            System.out.println(descripciones[i] + "\t\t\t $" + precios[i]);
            total = total + precios[i];
        }

        System.out.println("Total:\t\t\t\t $" + total);
        System.out.println("Descuento:\t\t\t " + porcentajeDescuento + "%");
        double totalFinal = aplicarDescuento(total, porcentajeDescuento);
        System.out.println("Total final:\t\t $" + totalFinal);

    }

    public static double aplicarDescuento(double monto, double porcentaje) {
        return (monto * (1 - (porcentaje / 100)));
    }
}
