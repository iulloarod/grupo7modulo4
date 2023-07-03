import java.util.ArrayList;

public class NumerosHelper {
    public void realizarCalculos(ArrayList<Integer> numeros) {
        // Calcular promedio, menor y mayor de los números
        if (numeros.size() >= 3) {
            double promedio = calcularPromedio(numeros);
            int menor = buscarMenor(numeros);
            int mayor = buscarMayor(numeros);

            System.out.println("Promedio: " + promedio);
            System.out.println("Menor valor: " + menor);
            System.out.println("Mayor valor: " + mayor);

            // Eliminar números pares
            eliminarNumerosPares(numeros);

            // Calcular promedio, menor y mayor de los valores restantes
            if (numeros.size() >= 3) {
                promedio = calcularPromedio(numeros);
                menor = buscarMenor(numeros);
                mayor = buscarMayor(numeros);

                System.out.println("Después de eliminar números pares:");
                System.out.println("Promedio: " + promedio);
                System.out.println("Menor valor: " + menor);
                System.out.println("Mayor valor: " + mayor);
            } else {
                System.out.println("No hay suficientes valores para calcular el promedio, menor y mayor.");
            }
        } else {
            System.out.println("Debe ingresar al menos tres números para realizar los cálculos.");
        }
    }

    private double calcularPromedio(ArrayList<Integer> numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return (double) suma / numeros.size();
    }

    private int buscarMenor(ArrayList<Integer> numeros) {
        int menor = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) < menor) {
                menor = numeros.get(i);
            }
        }
        return menor;
    }

    private int buscarMayor(ArrayList<Integer> numeros) {
        int mayor = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) > mayor) {
                mayor = numeros.get(i);
            }
        }
        return mayor;
    }

    private void eliminarNumerosPares(ArrayList<Integer> numeros) {
        numeros.removeIf(numero -> numero % 2 == 0);
    }
}
