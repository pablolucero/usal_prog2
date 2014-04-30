package presentacion;

import java.util.Scanner;

public class IOManager {

    public void print(String mensaje) {
        System.out.println(mensaje);
    }

    public void print(int n) {
        System.out.println(n);
    }

    public String getString() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextLine()) {
            this.print("Debe ingresar una frase");
            sc.nextLine();
        }
        return sc.nextLine();
    }
}
