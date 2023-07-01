public class TrabajadorHonorario extends Trabajador {
    private String giro;
    private int anioIniciacion;

    public TrabajadorHonorario(String nombres, String apellidos, String run, String telefono, int edad,
                               String giro, int anioIniciacion) {
        super(nombres, apellidos, run, telefono, edad);
        this.giro = giro;
        this.anioIniciacion = anioIniciacion;
    }

    public String getGiro() {
        return giro;
    }

    public int getAnioIniciacion() {
        return anioIniciacion;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Giro: " + giro);
        System.out.println("Año de iniciación de actividades: " + anioIniciacion);
    }

    @Override
    public String toString() {
        return super.toString() + " TrabajadorHonorario{" +
                "giro='" + giro + '\'' +
                ", anioIniciacion=" + anioIniciacion +
                '}';
    }
}
