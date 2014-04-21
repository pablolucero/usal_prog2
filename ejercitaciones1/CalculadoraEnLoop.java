package ejercitaciones1;

import java.util.Scanner;

/**
 * Repetir el mismo programa anterior, pero esta vez al entregar el resultado,
 * preguntará si se desea realizar una nueva operación.
 * Existirá entonces una opción para salir del programa y otra para repetir la operación.
 */
public class CalculadoraEnLoop {
    public static void main(String[] args) {

        System.out.println("Ingrese el 1mer numero");
        double num1 = askForNumber();

        System.out.println("Ingrese el 2do numero");
        double num2 = askForNumber();

        int operacion = 0;

        do {

            operacion = askForOption();

            double resultado;

            if (operacion == 4 && num2 == 0) {
                System.out.println("Error. No se puede dividir por cero");

            } else {

                switch (operacion) {
                    case 1:
                        resultado = num1 + num2;
                        printResultado(resultado);
                        operacion = askForOption();
                        break;
                    case 2:
                        resultado = num1 - num2;
                        printResultado(resultado);
                        operacion = askForOption();
                        break;
                    case 3:
                        resultado = num1 * num2;
                        printResultado(resultado);
                        operacion = askForOption();
                        break;
                    case 4:
                        resultado = num1 / num2;
                        printResultado(resultado);
                        operacion = askForOption();
                        break;
                }

            }

        } while (operacion != -1);

    }

    private static void printResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }

    private static void printOperationMenu() {
        System.out.println("\nElija la operacion a realizar:");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicacion");
        System.out.println("4 - Division");
        System.out.println("-1 - Salir\n");
    }

    private static int askForOption() {

        printOperationMenu();

        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            System.out.println("Error. Operacion no valida\n");
            printOperationMenu();
            scanner.nextLine();
        }

        int operacion = scanner.nextInt();

        if (operacion < -1 || operacion > 4) {
            System.out.println("Error. Operacion invalida");
            askForOption();
        }

        return operacion;
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
