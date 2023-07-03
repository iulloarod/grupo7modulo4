
public class Calculadora {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Crear instancias de las operaciones
        Suma suma = new Suma();
        Resta resta = new Resta();
        Multiplicacion multiplicacion = new Multiplicacion();
        Division division = new Division();

        // Realizar las operaciones
        int resultadoSuma = suma.operar(num1, num2);
        int resultadoResta = resta.operar(num1, num2);
        int resultadoMultiplicacion = multiplicacion.operar(num1, num2);
        double resultadoDivision = division.operar(num1, num2);

        // Imprimir los resultados
        System.out.println("Suma: " + resultadoSuma);
        System.out.println("Resta: " + resultadoResta);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);
        System.out.println("División: " + resultadoDivision);
    }
}
