public abstract class Usuario implements Analizable {
    private String nombreUsuario;

    public Usuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    @Override
    public void analizarUsuario() {
        System.out.println("Nombre de usuario: " + nombreUsuario);
    }
}
