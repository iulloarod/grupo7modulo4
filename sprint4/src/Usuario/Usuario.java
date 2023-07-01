package Usuario;

import Asesoria.Asesoria;

import java.time.LocalDate;
import java.time.Period;

public class Usuario implements Asesoria {
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected int rut;

    public Usuario() {
    }

    public Usuario(String nombre, LocalDate fechaNacimiento, int rut) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }


    //SACAR ESTOS METODOS

    //         LocalDate birth = LocalDate.parse(//date que es un string , DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.getDefault()));
    public void mostrarEdad() {
        LocalDate today = LocalDate.now();
        Period my_age = getFechaNacimiento().until(today);

        System.out.println("Edad: " + my_age.getYears());
    }

    @Override
    public void analizarUsuario() {

        System.out.println("Nombre: " + getNombre() + "\nRut: " + getRut());
    }
}
