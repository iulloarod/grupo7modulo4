public class Main {
    public static void main(String[] args) {
        // Crear objetos de las clases hijas
        TrabajadorHonorario honorario = new TrabajadorHonorario("Juan", "Pérez", "12.345.678-9", "987654321", 30,
                "Arquitecto", 2015);
        TrabajadorContratado contratado = new TrabajadorContratado("María", "López", "98.765.432-1", "123456789", 35,
                "01/01/2020", 2500.0);
        TrabajadorEventual eventual = new TrabajadorEventual("Pedro", "González", "11.223.344-5", "543216789", 28,
                true, "pedro@example.com");

        // Mostrar datos de los trabajadores
        System.out.println("Datos del Trabajador Honorario:");
        honorario.mostrarDatos();
        System.out.println();

        System.out.println("Datos del Trabajador Contratado:");
        contratado.mostrarDatos();
        System.out.println();

        System.out.println("Datos del Trabajador Eventual:");
        eventual.mostrarDatos();
        System.out.println();

        // Ejemplo de uso del método toString()
        System.out.println("Representación en cadena de texto:");
        System.out.println(honorario.toString());
        System.out.println(contratado.toString());
        System.out.println(eventual.toString());
    }
}
