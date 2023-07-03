public class Eventual extends Trabajador {
    private int horasTrabajadas;

    public Eventual(String nombre, int edad, int horasTrabajadas) {
        super(nombre, edad);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Horas trabajadas: " + horasTrabajadas);
    }
}
