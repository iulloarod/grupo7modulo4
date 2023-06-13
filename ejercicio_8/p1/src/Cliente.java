public class Cliente extends Persona{
    private String direccion;
    private int numeroTelefono;
    private int cantidadEmpleados;

    public Cliente(String nombrePersona, String fechaNacimiento, String rut, String direccion, int numeroTelefono, int cantidadEmpleados) {
        super(nombrePersona, fechaNacimiento, rut);
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

    @Override
    public String toString() {
        return toStringP() +
        "Cliente{" +
                "direccion='" + direccion + '\'' +
                ", numeroTelefono=" + numeroTelefono +
                ", cantidadEmpleados=" + cantidadEmpleados +
                '}';
    }
}
