public class Trabajador {
    private String nombres;
    private String apellidos;
    private String run;
    private String telefono;
    private int edad;

    public Trabajador(String nombres, String apellidos, String run, String telefono, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getRun() {
        return run;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarDatos() {
        System.out.println("Teléfono: " + telefono);
        System.out.println("Edad: " + edad);
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", run='" + run + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                '}';
    }
}
