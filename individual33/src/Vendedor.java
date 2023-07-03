public class Vendedor extends Empleado implements Bonificable {
    private String fechaInicio;

    public Vendedor(String nombre, String apellido, int edad, double salario, String fechaInicio) {
        super(nombre, apellido, edad, salario);
        this.fechaInicio = fechaInicio;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    @Override
    public double calcularBono() {
        return 50000;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Fecha de inicio: " + fechaInicio;
    }
}
