import negocio.Calculadora;
import negocio.CalculadoraValidador;
import presentacion.IOManager;
import presentacion.Menu;

public class MainCalculadora {
    public static void main(String[] args) {

        IOManager io = new IOManager();
        Menu menu = new Menu();
        boolean fin = false;
        int opcionElegida = 0;

        while (!fin) {
            
            menu.mostrarMenuPrincipal();
            opcionElegida = menu.getItemSeleccionado();

            switch (opcionElegida) {
                case 1:
                    io.print("Ingrese un numero");
                    int num1 = io.getEntero();
                    io.print("Ingrese otro numero");
                    int num2 = io.getEntero();
                    menu.mostrarMenuDeOperaciones();
                    int operacion = menu.getOperacionSeleccionada();
                    double respuesta = 0.0;

                    Calculadora calculadora = new Calculadora();
                    boolean esValida = CalculadoraValidador.esValida(num1, num2, operacion);

                    if (!esValida) {
                        io.print("Error. Operacion no valida");
                    } else {
                        respuesta = calculadora.calcular(num1, num2, operacion);
                        io.print("Resultado: " + respuesta);
                    }
                    break;
                case 2:
                    fin = true;
                    break;
            }
        }
    }
}
