package presentacion;

public class Menu {

    public void mostrarMenuPrincipal() {
        IOManager io = new IOManager();
        io.print("1 - Agregar Item");
        io.print("2 - Mostrar Resumen");
        io.print("3 - Salir");
    }

    public int getOperacionSeleccionada() {
        IOManager io = new IOManager();
        io.print("Ingrese la opcion");

        int n = io.getEntero();

        while (n < 1 || n > 3) {
            io.print("Ingrese una opcion valida");
            n = io.getEntero();
        }
        return n;
    }
}
