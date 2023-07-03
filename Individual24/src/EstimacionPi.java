public class EstimacionPi {
    public static void main(String[] args) {
        int n = 100000; // Número de términos de la suma

        double estimacionPi = CalculadoraPi.estimarPi(n);
        double diferencia = Math.abs(estimacionPi - Math.PI);

        System.out.println("Estimación de π con 100000 términos: " + estimacionPi);
        System.out.println("Diferencia con Math.PI: " + diferencia);
    }
}

