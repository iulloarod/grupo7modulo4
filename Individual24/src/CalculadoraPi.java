public class CalculadoraPi {
    public static double estimarPi(int n) {
        double suma = 0.0;
        int denominador = 1;
        boolean sumar = true;

        for (int i = 0; i < n; i++) {
            if (sumar) {
                suma += 1.0 / denominador;
            } else {
                suma -= 1.0 / denominador;
            }

            denominador += 2;
            sumar = !sumar;
        }

        return 4 * suma;
    }
}
