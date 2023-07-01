package Profesional;
import Usuario.Usuario;

import java.time.LocalDate;

public class Profesional extends Usuario {
    private String titulo;
    private LocalDate fechaIngreso;

    public Profesional() {
    }

    public Profesional(String nombre, LocalDate fechaNacimiento, int rut, String titulo, LocalDate fechaIngreso) {
        super(nombre, fechaNacimiento, rut);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("\nTitulo: " + getTitulo() + "\nFecha de ingreso: " + getFechaIngreso());
    }
}
