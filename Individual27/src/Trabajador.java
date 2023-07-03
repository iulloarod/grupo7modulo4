import java.util.ArrayList;
import java.util.List;

public class Trabajador {
    private String nombres;
    private String apellidos;
    private String run;
    private String telefono;
    private int edad;
    private List<CargaFamiliar> cargasFamiliares;

    // Constructor vacío
    public Trabajador() {
        cargasFamiliares = new ArrayList<>();
    }

    // Constructor con todos los atributos
    public Trabajador(String nombres, String apellidos, String run, String telefono, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
        cargasFamiliares = new ArrayList<>();
    }

    // Método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombres: ").append(nombres).append("\n");
        sb.append("Apellidos: ").append(apellidos).append("\n");
        sb.append("RUN: ").append(run).append("\n");
        sb.append("Teléfono: ").append(telefono).append("\n");
        sb.append("Edad: ").append(edad).append("\n");
        sb.append("Cargas Familiares: \n");

        if (cargasFamiliares.isEmpty()) {
            sb.append("No hay cargas familiares registradas");
        } else {
            for (CargaFamiliar cargaFamiliar : cargasFamiliares) {
                sb.append(cargaFamiliar.toString()).append("\n");
            }
        }

        return sb.toString();
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

    // Métodos para administrar cargas familiares
    public void agregarCargaFamiliar(CargaFamiliar cargaFamiliar) {
        cargasFamiliares.add(cargaFamiliar);
    }

    public void eliminarCargaFamiliar(CargaFamiliar cargaFamiliar) {
        cargasFamiliares.remove(cargaFamiliar);
    }

    public List<CargaFamiliar> getCargasFamiliares() {
        return cargasFamiliares;
    }
}
