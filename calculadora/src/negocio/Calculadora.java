package negocio;

public class Calculadora {

    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        return num1 / num2;
    }

    /**
     * Sarasa
     *
     * @param num1
     * @param num2
     * @param operacion: 1 (Suma), 2 (Resta), 3 (Multiplicacion), 4 (Division)
     * @return
     */
    public double calcular(double num1, double num2, int operacion) {
        double respuesta = 0.0;

        switch (operacion) {
            case 1:
                respuesta = sumar((int) num1, (int) num2);
                break;
            case 2:
                respuesta = restar((int) num1, (int) num2);
                break;
            case 3:
                respuesta = multiplicar((int) num1, (int) num2);
                break;
            case 4:
                respuesta = dividir(num1, num2);
                break;
        }

        return respuesta;
    }
}
