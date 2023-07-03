public class Contador {
    private int vocales;
    private int consonantes;

    public Contador() {
        vocales = 0;
        consonantes = 0;
    }

    public void contarVocalesConsonantes(String cadena) {
        cadena = cadena.toLowerCase();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (Character.isLetter(caracter)) {
                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }
    }

    public int getVocales() {
        return vocales;
    }

    public int getConsonantes() {
        return consonantes;
    }
}
