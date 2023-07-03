import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        NumerosHelper helper = new NumerosHelper();

        // Solicitar números hasta que se ingrese 0
        System.out.println("Ingrese los números (0 para finalizar):");
        int numero = scanner.nextInt();
        while (numero != 0) {
            numeros.add(numero);
            numero = scanner.nextInt();
        }

        helper.realizarCalculos(numeros);
    }
}
