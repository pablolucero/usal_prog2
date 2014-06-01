package presentacion;

import negocio.Factura;
import negocio.ItemFactura;

public class IOFactura extends IOManager {

    public ItemFactura solicitarItem() {

        print("Ingrese la descripcion: ");
        String descripcion = this.getString();
        print("Ingrese una cantidad: ");
        int cant = this.getEntero();
        print("Ingrese un precio: ");
        double precio = this.getDouble();

        return new ItemFactura(descripcion, cant, precio);
    }

    public void mostrarResumen(Factura factura) {
        print("Resumen de venta:");
        print("descripcion \t cantidad \t precio \t subtotal");
        ItemFactura[] items = factura.getItems();
        for (int i = 0; i < factura.getCantItems(); i++) {
            String descripcion = items[i].getDescripcion();
            int cantidad = items[i].getCantidad();
            double precio = items[i].getPrecio();
            double subtotal = items[i].calcularSubtotal();
            print(descripcion + "\t" + cantidad + "\t" + precio + "\t" + subtotal);
        }
    }
}
