public class Honorario extends Trabajador {
    private double honorarioMensual;

    public Honorario(String nombre, int edad, double honorarioMensual) {
        super(nombre, edad);
        this.honorarioMensual = honorarioMensual;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Honorario mensual: " + honorarioMensual);
    }
}
