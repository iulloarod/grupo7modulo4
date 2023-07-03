import java.util.Scanner;

public class VerificaContraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir la contraseña
        String contraseña = "chulito2023";

        // Pedir al usuario que ingrese la contraseña en no más de 3 intentos
        for (int intento = 1; intento <= 3; intento++) {
            System.out.print("Ingrese la contraseña: ");
            String input = scanner.nextLine();

            if (input.equals(contraseña)) {
                System.out.println("¡Contraseña correcta! Acceso permitido.");
                return; // Salir del programa si la contraseña es correcta
            } else {
                System.out.println("Contraseña incorrecta. Intento " + intento + " de 3");
            }
        }

        // Si el usuario no acierta después de 3 intentos
        System.out.println("Ha excedido el número máximo de intentos. Acceso denegado.");

        // Cerrar el Scanner
        scanner.close();
    }
}
