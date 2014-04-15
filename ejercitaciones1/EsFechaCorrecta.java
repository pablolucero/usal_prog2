package ejercitaciones1;

import java.util.Scanner;

/**
 * Generar un programa que en su inicio cuenta con 3 variables numéricas para día, mes y año
   Realizar un algoritmo que permita determinar si la fecha es consistente
   Por definición, Febrero tiene 28 días.
   Utilizar SWITCH e IF
 */
public class EsFechaCorrecta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el día en forma numerica");
        int dia = scanner.nextInt();

        System.out.println("Ingrese el mes en forma numerica");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el año en forma numerica");
        int anio = scanner.nextInt();

        switch (mes) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                if (dia > 31) {
                    System.out.println("fecha inconsistente");
                    break;
                }

            case 4: case 6:
            case 9: case 11:
                if (dia > 30) {
                    System.out.println("fecha inconsistente");
                    break;
                }

            case 2:
                if (dia > 28) {
                    System.out.println("fecha inconsistente");
                    break;
                }

            default:
                if (mes > 12) {
                    System.out.println("fecha inconsistente");
                    break;
                }

                if (anio < 1) {
                    System.out.println("fecha inconsistente");
                    break;
                }

                System.out.println("fecha consistente");
        }

    }
}
