public class Administrativo extends Persona {

    private String funcion;
    private String nombreSuperior;

    public Administrativo(String nombrePersona, String fechaNacimiento, String rut, String funcion, String nombreSuperior) {
        super(nombrePersona, fechaNacimiento, rut);
        this.funcion = funcion;
        this.nombreSuperior = nombreSuperior;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getNombreSuperior() {
        return nombreSuperior;
    }

    public void setNombreSuperior(String nombreSuperior) {
        this.nombreSuperior = nombreSuperior;
    }

    @Override
    public String toString() {
        return toStringP() +
                "funcion='" + funcion + '\'' +
                ", nombreSuperior='" + nombreSuperior + '\'' +
                '}';
    }
}
