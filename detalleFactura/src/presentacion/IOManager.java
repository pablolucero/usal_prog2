package presentacion;

import java.util.Scanner;

public class IOManager {

    public void print(String mensaje) {
        System.out.println(mensaje);
    }

    public void print(int n) {
        System.out.println(n);
    }

    public int getEntero() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            this.print("Debe ingresar un numero");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    public double getDouble() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextDouble()) {
            this.print("Debe ingresar un numero");
            sc.nextLine();
        }
        return sc.nextDouble();
    }

    public String getString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
