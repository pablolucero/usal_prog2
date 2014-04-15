package ejercitaciones1;

import java.util.Scanner;

/**
 * Generar un programa que me informe si el número 4 es par.
 * El programa debe ser capaz de seguir respondiendo correctamente
 * si se cambia el número
 */
public class EsPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par");
        } else {
            System.out.println("El número " + num + " es impar");
        }
    }
}
