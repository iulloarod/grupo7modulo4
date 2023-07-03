
public class Division {
    public double operar(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error: División entre cero");
            return Double.NaN; // Not-a-Number
        }
    }
}
