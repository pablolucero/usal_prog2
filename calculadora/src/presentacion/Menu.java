package presentacion;

public class Menu {

    public void mostrarMenuPrincipal() {
        IOManager io = new IOManager();
        io.print("1 - Calculadora");
        io.print("2 - Salir");
    }


    public void mostrarMenuDeOperaciones() {
        IOManager io = new IOManager();
        io.print("Elija el numero de la operacion a realizar");
        io.print("1 - Sumar");
        io.print("2 - Restar");
        io.print("3 - Multiplicar");
        io.print("4 - Dividir");
    }

    public int getItemSeleccionado() {
        IOManager io = new IOManager();
        io.print("Ingrese la opcion");

        int n = io.getEntero();

        while (n < 1 || n > 2) {
            io.print("Ingrese una opcion valida");
            n = io.getEntero();
        }
        return n;
    }

    public int getOperacionSeleccionada() {
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
