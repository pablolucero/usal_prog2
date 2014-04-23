package ejercitaciones1;

import java.util.Scanner;

public class SumatoriaUserInput {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero: ");
        Scanner sc = new Scanner(System.in);

        int n1 = 0;
        while (!sc.hasNextInt()) {
            System.out.println("Error. Debe ingresar un numero");
            sc.nextLine();
        }

        n1 = sc.nextInt();

        System.out.println("Ingrese otro numero: ");
        sc.nextLine(); // limpias el buffer

        int n2 = 0;
        while (!sc.hasNextInt()) {
            System.out.println("Error. Debe ingresar un numero");
            sc.nextLine();
        }

        n2 = sc.nextInt();

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
    }
}
