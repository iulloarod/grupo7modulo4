public class Persona {
    private String nombrePersona;
    private String fechaNacimiento;
    private String rut;

    public Persona(String nombrePersona, String fechaNacimiento, String rut) {
        this.nombrePersona = nombrePersona;
        this.fechaNacimiento = fechaNacimiento;
        this.rut = rut;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }


    public String toStringP() {
        return "Persona{" +
                "nombrePersona='" + nombrePersona + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", rut='" + rut + '\'' +
                '}';
    }
}
