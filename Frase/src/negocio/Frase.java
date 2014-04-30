package negocio;

public class Frase {

    public String convertirAMayusculas(String frase) {
        return frase.toUpperCase();
    }

    public String convertirAMinusculas(String frase) {
        return frase.toLowerCase();
    }

    public int contarPalabras(String frase) {
        final String[] palabras = frase.split("\\s+");
        return palabras.length;
    }

    public String convertirATipoTitulo(String frase) {
        String output = "";
        final String[] palabras = frase.split("\\s+");
        for (String palabra : palabras) {
            output = output.concat(primeraLetraEnMayuscula(palabra) + " ");
        }

        return output;
    }

    public String convertirATipoOracion(String frase) {
        String output = "";
        final String[] oraciones = frase.split("\\.");
        for (String oracion : oraciones) {
            output = output.concat(primeraLetraEnMayuscula(oracion));
        }
        return output;
    }

    private String primeraLetraEnMayuscula(String palabra) {
        if (palabra.length() > 1) {
            return palabra.substring(0,1).toUpperCase() + palabra.substring(1);
        } else {
            return palabra.toUpperCase();
        }
    }
}
