public class Usuario {

    private String nombre;
    private String fechaNacimiento;
    private String run;

    public Usuario(String nombre, String fechaNacimiento, String run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    public Usuario() {
        this.nombre =  "";
        this.fechaNacimiento =  "";
        this.run =  "";
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run='" + run + '\'' +
                '}';
    }
}
