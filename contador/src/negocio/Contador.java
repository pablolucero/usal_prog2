package negocio;

public class Contador {

    private int valor;

    public Contador() {
        this.valor = 0;
    }

    public void aumentar() {
        this.valor++;
    }

    public void aumentar(int a) {
        this.valor = a;
    }

    public void decrementar() {
        this.valor--;
    }

    public void decrementar(int a) {
        this.valor = a;
    }

    public int getValor() {
        return valor;
    }

}
