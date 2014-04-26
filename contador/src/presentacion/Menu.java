package presentacion;

public class Menu {

    public void mostrar() {
        IOManager io = new IOManager();
        io.print("1 - Aumentar");
        io.print("2 - Decrementar");
        io.print("3 - Mostrar valor");
        io.print("4 - Salir");
    }

    public int getItemSeleccionado() {
        IOManager io = new IOManager();
        io.print("Ingrese la opcion");

        int n = io.getEntero();

        while (n < 1 || n > 4) {
            io.print("Ingrese una opcion valida");
            n = io.getEntero();
        }
        return n;
    }
}
