import negocio.Contador;
import presentacion.IOManager;
import presentacion.Menu;

public class ProgramaPpal {
    public static void main(String[] args) {

        IOManager io = new IOManager();
        Contador c = new Contador();
        Menu m = new Menu();
        boolean fin = false;
        int opcion = 0;

        while (!fin) {
            m.mostrar();
            opcion = m.getItemSeleccionado();
            switch (opcion) {
                case 1:
                    c.aumentar();
                    break;
                case 2:
                    c.decrementar();
                    break;
                case 3:
                    io.print("El valor del contador es: " + c.getValor() + "\n");
                    break;
                case 4:
                    fin = true;
                    io.print("Fin del programa");
                    break;
            }
        }
    }
}
