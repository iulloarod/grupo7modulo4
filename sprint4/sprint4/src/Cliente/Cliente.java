package Cliente;
import Usuario.Usuario;

import java.time.LocalDate;

public class Cliente extends Usuario {
    private String nombres;
    private String apellidos;
    private int telefono;
    private String AFP;
    private int prevision;
    private String direccion;
    private String comuna;
    private int edad; //Valor a calcular segun fecha de nacimiento menos la actual

    public Cliente() {
    }

    public Cliente(String nombre, LocalDate fechaNacimiento, int rut, String nombres, String apellidos, int telefono, String AFP, int prevision, String direccion, String comuna, int edad) {
        super(nombre, fechaNacimiento, rut);
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.AFP = AFP;
        this.prevision = prevision;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getAFP() {
        return AFP;
    }

    public void setAFP(String AFP) {
        this.AFP = AFP;
    }

    public int getPrevision() {
        return prevision;
    }

    public void setPrevision(int prevision) {
        this.prevision = prevision;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String obtenerNombre(){
        return "Nombres: " + getNombre() + "/nApellidos: " + getApellidos();
    }
    public void obtenerSistemaSalud(){
        System.out.println("Sistema de salud");
        if(getPrevision() == 1){
            System.out.println("Fonasa");
        } else if (getPrevision() == 2) {
            System.out.println("Isapre");
        }
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("\nDireccion: " + getDireccion() + "\nComuna: " + getComuna());
    }
}
