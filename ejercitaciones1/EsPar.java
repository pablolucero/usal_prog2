package ejercitaciones1;

/**
 * Generar un programa que me informe si el número 4 es par.
 * El programa debe ser capaz de seguir respondiendo correctamente
 * si se cambia el número
 */
public class EsPar {
    public static void main(String[] args) {
        int num = 4;

        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es par");
        } else {
            System.out.println("El numero " + num + " es impar");
        }
    }
}
