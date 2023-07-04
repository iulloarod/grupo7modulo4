import Administrativo.Administrativo;
import Asesoria.Asesoria;
import Cliente.Cliente;
import Profesional.Profesional;
import Usuario.Usuario;
import Capacitaciones.Capacitaciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Contenedor {
    private List <Asesoria> asesorias;
    private List <Capacitaciones> capacitaciones;

    public Contenedor(){
        this.asesorias = new ArrayList<Asesoria>();
        this.capacitaciones = new ArrayList<Capacitaciones>();
    }

    public void almacenarCliente(Asesoria a){
        asesorias.add(a);
    }
    public void almacenarProfesional(Asesoria a){
        asesorias.add(a);
    }
    public void almacenarAdministrativo(Asesoria a){
        asesorias.add(a);
    }
    public void almacenarCapacitacion(Capacitaciones c){
        capacitaciones.add(c);
    }
    public void eliminarUsuario(int rut) {
        Iterator<Asesoria> iterator = asesorias.iterator();
        while (iterator.hasNext()) {
            Asesoria as = iterator.next();
            if (as instanceof Cliente) {
                if (((Cliente) as).getRut() == rut) {
                    iterator.remove();
                }
            }
        }
    }
    public void listarUsuariosIT(){
        for(Asesoria as:asesorias){
            if(as instanceof Profesional){
                System.out.println(((Profesional) as).getNombre() + "\n" + ((Profesional) as).getRut());
            }
            if(as instanceof Cliente){
                System.out.println(((Cliente) as).getNombre() + "\n" + ((Cliente) as).getRut());
            }
            if(as instanceof Administrativo){
                System.out.println(((Administrativo) as).getNombre() + "\n" + ((Administrativo) as).getRut());
            }
        }
    }

    public void listarUsuariosDP(){
        for(Asesoria as:asesorias){
            as.analizarUsuario();
        }
    }

    public void listarUsuariosDTP(){
        for(Asesoria as:asesorias){
            if(as instanceof Profesional){
                as.analizarUsuario();
            }
        }
    }

    public void listarUsuariosDTC(){
        for(Asesoria as:asesorias){
            if(as instanceof Cliente){
                as.analizarUsuario();
            }
        }
    }

    public void listarUsuariosDTA(){
        for(Asesoria as:asesorias){
            if(as instanceof Administrativo){
                as.analizarUsuario();
            }
        }
    }

    public boolean validarRut(int rut){
        boolean flag = false;
        for(Asesoria as:asesorias){
            if(as instanceof Cliente){
                if(((Cliente) as).getRut() == rut){
                    flag = true;
                }
            }
        }
        return flag;
    }
    public void listarCapacitaciones(){
        for(Capacitaciones cap:capacitaciones){
            cap.mostrarDetalle();
        }
    }

    public void listarUsuariosDT() {
        System.out.println("Usuarios (dependiendo el tipo):");
        System.out.println("Clientes:");
        for (Asesoria asesoria : asesorias) {
            if (asesoria instanceof Cliente) {
                System.out.println(((Cliente) asesoria).getNombre() + "\n" + ((Cliente) asesoria).getRut());
            }
        }
        System.out.println("Profesionales:");
        for (Asesoria asesoria : asesorias) {
            if (asesoria instanceof Profesional) {
                System.out.println(((Profesional) asesoria).getNombre() + "\n" + ((Profesional) asesoria).getRut());
            }
        }
        System.out.println("Administrativos:");
        for (Asesoria asesoria : asesorias) {
            if (asesoria instanceof Administrativo) {
                System.out.println(((Administrativo) asesoria).getNombre() + "\n" + ((Administrativo) asesoria).getRut());
            }
        }
    }
}
