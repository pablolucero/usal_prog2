package ejercitaciones1;

import java.util.Scanner;

/**
 * Generar una modificación al programa EsFechaCorrecta, de forma de que tenga en cuenta a los años bisiestos:
 * Un año es bisiesto si es divisible por 4, excepto el último de cada siglo (aquel divisible por 100),
 * salvo que este último sea divisible por 400.
 */
public class EsFechaCorrectaBisiestos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el día en forma numerica");
        int day = scanner.nextInt();

        System.out.println("Ingrese el mes en forma numerica");
        int month = scanner.nextInt();

        System.out.println("Ingrese el año en forma numerica");
        int year = scanner.nextInt();

        final String ERROR = "fecha inconsistente";
        final String SUCCESS = "fecha consistente";

        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                if (day > 31) {
                    System.out.println(ERROR);
                    break;
                }

            case 4: case 6:
            case 9: case 11:
                if (day > 30) {
                    System.out.println(ERROR);
                    break;
                }

            case 2:
                if (esBisiesto(year) && day <= 29) {
                    System.out.println(SUCCESS);
                    break;
                }
                if (day > 28) {
                    System.out.println(ERROR);
                    break;
                }

            default:
                if (month > 12) {
                    System.out.println(ERROR);
                    break;
                }

                if (year < 1) {
                    System.out.println(ERROR);
                    break;
                }

                System.out.println(SUCCESS);
        }
    }

    private static boolean esBisiesto(int year) {
        return ((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0);
    }
}
