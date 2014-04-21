package ejercitaciones1;

import java.util.Scanner;

/**
 * Generar un programa que solicite: Dos números, y luego la operación a realizar.
 * Luego debe realizar la operación indicada y devolver el resultado.
 * Tener en cuenta las operaciones no permitidas (División por 0)
 */
public class Calculadora {
    public static void main(String[] args) {

        System.out.println("Ingrese el 1mer numero");
        double num1 = askForNumber();

        System.out.println("Ingrese el 2do numero");
        double num2 = askForNumber();

        printOperationMenu();

        int operacion = askForOption();

        double resultado = 0;

        while (operacion < 1 || operacion > 4) {
            System.out.println("Error. Operacion invalida");
            askForOption();
        }

        if (operacion == 4 && num2 == 0) {
            System.out.println("Error. No se puede dividir por cero");
        } else {
            switch (operacion) {
                case 1:
                    resultado = num1 + num2;
                    printResultado(resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    printResultado(resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    printResultado(resultado);
                    break;
                case 4:
                    resultado = num1 / num2;
                    printResultado(resultado);
                    break;
                default:
                    System.out.println("Error. Operacion invalida");
            }

        }
    }

    private static void printResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }

    private static void printOperationMenu() {
        System.out.println("Elija la operacion a realizar:");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicacion");
        System.out.println("4 - Division");
    }

    private static int askForOption() {

        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            System.out.println("Error. Operacion no valida\n");
            printOperationMenu();
            scanner.nextLine();
        }

        return scanner.nextInt();
    }

    private static double askForNumber() {

        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextDouble()) {
            System.out.println("Error. Numero no valido");
            scanner.nextLine();
        }

        return scanner.nextDouble();
    }
}
