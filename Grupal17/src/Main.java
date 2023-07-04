public class Main {
    public static void main(String[] args) {
        Listado listado = new Listado();

        Cliente cliente = new Cliente("Cliente1", "Datos del cliente 1");
        Cliente cliente3 = new Cliente("Cliente3", "Datos del cliente 3");
        Profesional profesional = new Profesional("Profesional1", "Ingeniero", "2022-01-01");
        Administrativo administrativo = new Administrativo("Administrativo1", "Recursos Humanos", "3 años de experiencia");
        Cliente cliente2 = new Cliente("Cliente2", "Datos del cliente 2");
        Profesional profesional2 = new Profesional("Profesional2", "Arquitecto", "2021-05-10");

        listado.agregarUsuario(cliente);
        listado.agregarUsuario(profesional);
        listado.agregarUsuario(administrativo);
        listado.agregarUsuario(cliente2);
        listado.agregarUsuario(cliente3);
        listado.agregarUsuario(profesional2);

        listado.llamarAnalizarUsuario();
    }
}
