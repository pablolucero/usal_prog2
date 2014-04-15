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

        if (isValid(day, month, year)) {
            System.out.println("fecha consistente");
        } else {
            System.out.println("fecha inconsistente");
        }
    }

    private static boolean esBisiesto(int year) {
        return ((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0);
    }

    public static boolean isValid(int day, int month, int year) {

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day > 31) {
                    return false;
                }

            case 4:
            case 6:
            case 9:
            case 11:
                if (day > 30) {
                    return false;
                }

            case 2:
                if (esBisiesto(year) && day <= 29) {
                    return true;
                }
                if (day > 28) {
                    return false;
                }

            default:
                if (month > 12) {
                    return false;
                }

                if (year < 1) {
                    return false;
                }

                return true;
        }
    }
}
