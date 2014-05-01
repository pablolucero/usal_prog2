package negocio;

public class CalculadoraValidador {

    public static boolean esValida(int num1, int num2, int operacion) {
        if (operacion == 4 && num2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
