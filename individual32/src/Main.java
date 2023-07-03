public class Main {
    public static void main(String[] args) {
        Listado listado = new Listado();

        Trabajador trabajador1 = new Trabajador("Juan", 30);
        Honorario honorario1 = new Honorario("María", 35, 5000.0);
        Eventual eventual1 = new Eventual("Pedro", 25, 40);
        Contratado contratado1 = new Contratado("Ana", 28, 35);
        Trabajador trabajador2 = new Trabajador("Luis", 40);

        listado.agregarTrabajador(trabajador1);
        listado.agregarTrabajador(honorario1);
        listado.agregarTrabajador(eventual1);
        listado.agregarTrabajador(contratado1);
        listado.agregarTrabajador(trabajador2);

        listado.llamarMostrarDatos();
    }
}
