package negocio;

public class Factura {

    private ItemFactura[] items;
    private double descuento;
    private int cantItems;

    public int getCantItems() {
        return cantItems;
    }

//    public void setCantItems(int cantItems) {
//        this.cantItems = cantItems;
//    }

    public Factura() {
        this.items = new ItemFactura[10];
        this.cantItems = 0;
        this.descuento = 10;
    }

    public ItemFactura[] getItems() {
        ItemFactura[] validItems = new ItemFactura[this.items.length];
        for (int i = 0; i < validItems.length; i++) {
            validItems[i] = this.items[i];
        }
        return validItems;
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.cantItems; i++) {
            total += this.items[i].calcularSubtotal();
        }
        return total;
    }

    public double calcularDescuento() {
        double total = this.calcularTotal();
        return total * (this.descuento / 100.0);
    }

    public boolean agregarItem(ItemFactura item) {
        this.items[this.cantItems] = item;
        this.cantItems++;
        return true;
    }
}
