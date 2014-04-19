package ejercitaciones1;

import java.util.Scanner;

/**
 * Generar un programa en el cual se ingrese una nota numérica (0 a 100),
 * y el programa devuelva una nota cualitativa según lo siguiente:
 *
 * A >90,
 * B >80,
 * C >60,
 * D >=50,
 * F<50
 */
public class Puntaje {
    public static void main(String[] args) {

        System.out.println("Ingrese una nota numérica (de 0 a 100)");
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        while (!scanner.hasNextInt()) {
            System.out.println("Error. La nota ingresada no es valida");
            scanner.nextLine();
        }

        num = scanner.nextInt();

        char letra = '@';

        if (num > 90 && num <= 100) {
            letra = 'A';
        } else if (num > 80 && num <= 90) {
            letra = 'B';
        } else if (num > 60 && num <= 80) {
            letra = 'C';
        } else if (num >= 50 && num <= 60) {
            letra = 'D';
        } else if (num < 50 && num >= 0) {
            letra = 'F';
        } else {
            System.out.println("Error. La nota ingresada no es valida");
        }

        if (letra != '@') {
            System.out.println("La nota correspondiente es: " + letra);
        }
    }
}
