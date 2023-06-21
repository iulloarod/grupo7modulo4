public class TrabajadorContratado extends Trabajador {
    private String fechaIngreso;
    private double salarioMensual;

    public TrabajadorContratado(String nombres, String apellidos, String run, String telefono, int edad,
                                String fechaIngreso, double salarioMensual) {
        super(nombres, apellidos, run, telefono, edad);
        this.fechaIngreso = fechaIngreso;
        this.salarioMensual = salarioMensual;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Fecha de ingreso: " + fechaIngreso);
        System.out.println("Salario mensual: " + salarioMensual);
    }

    @Override
    public String toString() {
        return super.toString() + " TrabajadorContratado{" +
                "fechaIngreso='" + fechaIngreso + '\'' +
                ", salarioMensual=" + salarioMensual +
                '}';
    }
}
