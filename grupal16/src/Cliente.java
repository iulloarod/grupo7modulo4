public class Cliente extends Usuario {
    private String datosCliente;

    public Cliente(String nombreUsuario, String datosCliente) {
        super(nombreUsuario);
        this.datosCliente = datosCliente;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Datos del cliente: " + datosCliente);
    }
}
