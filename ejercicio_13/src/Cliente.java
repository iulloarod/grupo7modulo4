public class Cliente {
    private String rut;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String afp;
    private int sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;

    public Cliente(String rut, String nombre, String apellidos, String telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    public Cliente() {
        this.rut =  "";
        this.nombre =  "";
        this.apellidos =  "";
        this.telefono =  "";
        this.afp =  "";
        this.sistemaSalud = 0;
        this.direccion =  "";
        this.comuna =  "";
        this.edad = 0;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono=" + telefono +
                ", afp='" + afp + '\'' +
                ", sistemaSalud=" + sistemaSalud +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                '}';
    }
}
