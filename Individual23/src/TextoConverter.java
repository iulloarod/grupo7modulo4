public class TextoConverter {
    public String convertirTexto(String texto) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            if (Character.isLowerCase(caracter)) {
                resultado.append(Character.toUpperCase(caracter));
            } else if (Character.isUpperCase(caracter)) {
                resultado.append(Character.toLowerCase(caracter));
            } else if (Character.isWhitespace(caracter)) {
                continue;
            } else {
                resultado.append(caracter);
            }
        }

        return resultado.toString();
    }
}
