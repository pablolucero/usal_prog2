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
}
