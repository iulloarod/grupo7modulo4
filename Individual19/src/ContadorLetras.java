import java.util.Scanner;

public class ContadorLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena;

        do {
            System.out.print("Ingrese una cadena de texto: ");
            cadena = scanner.nextLine();

            if (cadena.isEmpty()) {
                System.out.println("La cadena no puede estar vacía. Por favor, ingrese nuevamente.");
            }
        } while (cadena.isEmpty());

        LetrasContador letrasContador = new LetrasContador();
        letrasContador.contarLetras(cadena);
        letrasContador.mostrarResultados();

        scanner.close();
    }
}
