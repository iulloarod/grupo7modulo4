import java.util.ArrayList;
import java.util.List;

public class Listado {
    private List<Asesoria> usuarios;

    public Listado() {
        usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Asesoria usuario) {
        usuarios.add(usuario);
    }

    public void llamarAnalizarUsuario() {
        for (Asesoria usuario : usuarios) {
            usuario.analizarUsuario();
            System.out.println();
        }
    }
}
