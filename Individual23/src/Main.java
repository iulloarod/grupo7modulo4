import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto;
        do {
            System.out.println("Ingrese una cadena de texto:");
            texto = scanner.nextLine().trim();
        } while (texto.isEmpty());

        TextoConverter textoConverter = new TextoConverter();
        String resultado = textoConverter.convertirTexto(texto);

        System.out.println("Resultado: " + resultado);
    }
}
