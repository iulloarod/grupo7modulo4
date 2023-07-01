public class TrabajadorEventual extends Trabajador {
    private boolean disponibilidad;
    private String correoElectronico;

    public TrabajadorEventual(String nombres, String apellidos, String run, String telefono, int edad,
                              boolean disponibilidad, String correoElectronico) {
        super(nombres, apellidos, run, telefono, edad);
        this.disponibilidad = disponibilidad;
        this.correoElectronico = correoElectronico;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Disponibilidad: " + disponibilidad);
        System.out.println("Correo electrónico: " + correoElectronico);
    }

    @Override
    public String toString() {
        return super.toString() + " TrabajadorEventual{" +
                "disponibilidad=" + disponibilidad +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}
