public class LetrasContador {
    private int[] contadorLetras;

    public void contarLetras(String cadena) {
        int longitud = cadena.length();
        char[] letras = new char[longitud];

        for (int i = 0; i < longitud; i++) {
            char letra = cadena.charAt(i);
            letras[i] = letra;
        }

        contadorLetras = new int[27]; // Array para contar las letras del abecedario incluyendo la "ñ"
        for (char letra : letras) {
            if (Character.isLetter(letra)) {
                letra = Character.toLowerCase(letra);
                if (letra == 'ñ') {
                    contadorLetras[26]++;
                } else {
                    contadorLetras[letra - 'a']++;
                }
            }
        }
    }

    public void mostrarResultados() {
        int contador = 0;
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (char letra : letras) {
            int indice = letra - 'a';
            if (letra == 'ñ') {
                indice = 26;
            }
            System.out.print(letra + "=" + contadorLetras[indice] + " - ");
            contador++;
            if (contador == 10) {
                System.out.println();
                contador = 0;
            }
        }
    }
}
