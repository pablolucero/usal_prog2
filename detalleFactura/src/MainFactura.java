import negocio.Factura;
import negocio.ItemFactura;
import presentacion.IOFactura;
import presentacion.Menu;

public class MainFactura {
    public static void main(String[] args) {

        boolean fin = false;

        IOFactura io = new IOFactura();
        Factura f = new Factura();

        int opcion = 0;

        while (!fin) {
            Menu m = new Menu();
            m.mostrarMenuPrincipal();
            opcion = m.getOperacionSeleccionada();

            switch (opcion) {
                case 1:
                    f.agregarItem(io.solicitarItem());
                    break;
                case 2:
                    io.mostrarResumen(f);
                    break;
                case 3:
                    fin = true;
                    break;
            }
        }



        ItemFactura item1 = new ItemFactura("Lapiz", 25, 2.5);
        ItemFactura item2 = new ItemFactura("Cuaderno", 2, 20.50);
        f.agregarItem(item1);
        f.agregarItem(item2);
        double total = f.calcularTotal();
        double desc = f.calcularDescuento();
//        io.print("Total: " + total + " - desc: " + desc);
        io.mostrarResumen(f);

    }
}
