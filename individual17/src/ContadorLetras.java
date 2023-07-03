import java.util.Scanner;

public class ContadorLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cadena = "";
        while (cadena.isEmpty()) {
            System.out.print("Ingrese una cadena de texto: ");
            cadena = scanner.nextLine();
        }

        Contador contador = new Contador();
        contador.contarVocalesConsonantes(cadena);

        System.out.println("La cadena ingresada contiene " + contador.getVocales() + " vocales y " + contador.getConsonantes() + " consonantes.");

        scanner.close();
    }
}
