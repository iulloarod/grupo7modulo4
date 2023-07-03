public class CargaFamiliar {
    private String runCarga;
    private String nombres;
    private String apellidos;
    private String runFamiliar;
    private int parentesco;
    private int edad;

    // Constructor vacío
    public CargaFamiliar() {
    }

    // Constructor con todos los atributos
    public CargaFamiliar(String runCarga, String nombres, String apellidos, String runFamiliar, int parentesco, int edad) {
        this.runCarga = runCarga;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.runFamiliar = runFamiliar;
        this.parentesco = parentesco;
        this.edad = edad;
    }

    // Método toString
    @Override
    public String toString() {
        return "RUN carga: " + runCarga + "\n" +
                "Nombres: " + nombres + "\n" +
                "Apellidos: " + apellidos + "\n" +
                "RUN familiar: " + runFamiliar + "\n" +
                "Parentesco: " + obtenerParentesco(parentesco) + "\n" +
                "Edad: " + edad;
    }

    // Métodos de acceso (getters y setters)
    public String getRunCarga() {
        return runCarga;
    }

    public void setRunCarga(String runCarga) {
        this.runCarga = runCarga;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRunFamiliar() {
        return runFamiliar;
    }

    public void setRunFamiliar(String runFamiliar) {
        this.runFamiliar = runFamiliar;
    }

    public int getParentesco() {
        return parentesco;
    }

    public void setParentesco(int parentesco) {
        this.parentesco = parentesco;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método auxiliar para obtener el parentesco en texto
    private String obtenerParentesco(int parentesco) {
        switch (parentesco) {
            case 1:
                return "Cónyuge";
            case 2:
                return "Hijo/a";
            case 3:
                return "Otro";
            default:
                return "Desconocido";
        }
    }
}
