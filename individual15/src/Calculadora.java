import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar los operandos y el signo aritmético
        System.out.print("Ingrese el primer operando: ");
        int operando1 = scanner.nextInt();

        System.out.print("Ingrese el segundo operando: ");
        int operando2 = scanner.nextInt();

        System.out.print("Ingrese el signo aritmético (+, -, x, :, /): ");
        String signo = scanner.next();

        // Realizar la operación correspondiente
        int resultado = 0;

        switch (signo) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "x":
                resultado = operando1 * operando2;
                break;
            case ":":
                resultado = operando1 / operando2;
                break;
            case "/":
                resultado = operando1 % operando2;
                break;
            default:
                System.out.println("Signo aritmético inválido");
                return; // Salir del programa si el signo es inválido
        }

        // Mostrar el resultado
        System.out.println("El resultado es: " + resultado);

        // Cerrar el Scanner
        scanner.close();
    }
}
