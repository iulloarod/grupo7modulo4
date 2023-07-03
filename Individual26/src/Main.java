public class Main {
    public static void main(String[] args) {
        // Crear tres instancias de Trabajador
        Trabajador trabajador1 = new Trabajador("Juan", "Perez", "12.345.678-9", "123456789", 30);
        Trabajador trabajador2 = new Trabajador("María", "López", "98.765.432-1", "987654321", 35);
        Trabajador trabajador3 = new Trabajador("Pedro", "Gómez", "11.223.344-5", "112233445", 25);

        // Mostrar el contenido de cada objeto usando el método toString()
        System.out.println("Trabajador 1:");
        System.out.println(trabajador1.toString());

        System.out.println("\nTrabajador 2:");
        System.out.println(trabajador2.toString());

        System.out.println("\nTrabajador 3:");
        System.out.println(trabajador3.toString());
    }
}
