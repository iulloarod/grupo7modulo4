import java.util.ArrayList;
import java.util.List;

public class Listado {
    private List<Corredora> trabajadores;

    public Listado() {
        trabajadores = new ArrayList<>();
    }

    public void agregarTrabajador(Corredora trabajador) {
        trabajadores.add(trabajador);
    }

    public void llamarMostrarDatos() {
        for (Corredora trabajador : trabajadores) {
            trabajador.mostrarDatos();
            System.out.println();
        }
    }
}
