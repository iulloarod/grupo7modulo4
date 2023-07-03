public class Contratado extends Trabajador {
    private int horasSemanales;

    public Contratado(String nombre, int edad, int horasSemanales) {
        super(nombre, edad);
        this.horasSemanales = horasSemanales;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Horas semanales: " + horasSemanales);
    }
}
