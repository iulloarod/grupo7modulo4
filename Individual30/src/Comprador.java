public class Comprador {
    private String nombres;
    private String apellidos;
    private Direccion direccion;

    public Comprador(String nombres, String apellidos, Direccion direccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
