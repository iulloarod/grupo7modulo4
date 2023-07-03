public class Trabajador {
    private String nombres;
    private String apellidos;
    private String run;
    private String telefono;
    private int edad;

    // Constructor vacío
    public Trabajador() {
    }

    // Constructor con todos los atributos
    public Trabajador(String nombres, String apellidos, String run, String telefono, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

    // Método toString
    @Override
    public String toString() {
        return "Nombres: " + nombres + "\n" +
                "Apellidos: " + apellidos + "\n" +
                "RUN: " + run + "\n" +
                "Teléfono: " + telefono + "\n" +
                "Edad: " + edad;
    }

    // Método nombreCompleto
    public String nombreCompleto() {
        return nombres + " " + apellidos;
    }

    // Método descomponerRun
    public int descomponerRun() {
        String[] partes = run.split("-");
        return Integer.parseInt(partes[0]);
    }
}
