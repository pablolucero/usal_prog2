package ejercitaciones1;

import java.util.Scanner;

/**
 * Generar un programa que dadas las variables de mes, día, y año, devuelva el texto:
 * “1 de Abril de 2010”
 */
public class NombreDelMes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el día en forma numerica");
        int day = scanner.nextInt();

        System.out.println("Ingrese el mes en forma numerica");
        int month = scanner.nextInt();

        System.out.println("Ingrese el año en forma numerica");
        int year = scanner.nextInt();

        if (EsFechaCorrectaBisiestos.isValid(day, month, year)) {

            final String monthName = nombreMes(month);
            if (monthName != null) {
                System.out.println(day + " de " + monthName + " de " + year);
            } else {
                System.out.println("Error. Mes invalido.");
            }
        } else {
            System.out.println("Error. Fecha invalida.");
        }
    }

    private static String nombreMes(int month) {
        switch (month) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
            default:
                return null;
        }
    }
}
