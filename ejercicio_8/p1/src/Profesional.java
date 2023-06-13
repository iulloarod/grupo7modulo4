public class Profesional extends Persona {
    private int anosExp;
    private String departamento;

    public Profesional(String nombrePersona, String fechaNacimiento, String rut, int anosExp, String departamento) {
        super(nombrePersona, fechaNacimiento, rut);
        this.anosExp = anosExp;
        this.departamento = departamento;
    }

    public int getAnosExp() {
        return anosExp;
    }

    public void setAnosExp(int anosExp) {
        this.anosExp = anosExp;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return toStringP() +
                "anosExp=" + anosExp +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
