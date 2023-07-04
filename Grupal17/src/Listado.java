import java.util.ArrayList;
import java.util.List;

public class Listado {
    private List<Analizable> usuarios;

    public Listado() {
        usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        Analizable analizableUsuario = new Analizable() {
            @Override
            public void analizarUsuario() {
                usuario.analizarUsuario();
            }
        };
        usuarios.add(analizableUsuario);
    }

    public void llamarAnalizarUsuario() {
        for (Analizable usuario : usuarios) {
            usuario.analizarUsuario();
            System.out.println();
        }
    }
}

