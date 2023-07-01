package Administrativo;
import Usuario.Usuario;

import java.time.LocalDate;

public class Administrativo extends Usuario{
    private String area;
    private String experenciaPrevia;

    public Administrativo() {
    }

    public Administrativo(String nombre, LocalDate fechaNacimiento, int rut, String area, String experenciaPrevia) {
        super(nombre, fechaNacimiento, rut);
        this.area = area;
        this.experenciaPrevia = experenciaPrevia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperenciaPrevia() {
        return experenciaPrevia;
    }

    public void setExperenciaPrevia(String experenciaPrevia) {
        this.experenciaPrevia = experenciaPrevia;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("\nArea: " + getArea() + "\nExperiencia previa: " + getExperenciaPrevia());
    }
}
