public class Main {
    public static void main(String[] args) {
        // Crear trabajadores
        Trabajador trabajador1 = new Trabajador("Juan", "Perez", "12.345.678-9", "123456789", 35);
        Trabajador trabajador2 = new Trabajador("Maria", "Gomez", "98.765.432-1", "987654321", 42);
        Trabajador trabajador3 = new Trabajador("Carlos", "Lopez", "11.223.344-5", "112233445", 28);

        // Agregar cargas familiares a los trabajadores
        CargaFamiliar cargaFamiliar1 = new CargaFamiliar("12.345.678-9", "Ana", "Perez", "9.876.543-2", 2, 10);
        CargaFamiliar cargaFamiliar2 = new CargaFamiliar("98.765.432-1", "Pedro", "Gomez", "7.654.321-8", 2, 8);
        CargaFamiliar cargaFamiliar3 = new CargaFamiliar("98.765.432-1", "Laura", "Gomez", "5.432.109-7", 3, 60);

        trabajador1.agregarCargaFamiliar(cargaFamiliar1);
        trabajador2.agregarCargaFamiliar(cargaFamiliar2);
        trabajador2.agregarCargaFamiliar(cargaFamiliar3);

        // Mostrar información de los trabajadores
        System.out.println("Información del Trabajador 1:");
        System.out.println(trabajador1);

        System.out.println("-------------------------------------");

        System.out.println("Información del Trabajador 2:");
        System.out.println(trabajador2);

        System.out.println("-------------------------------------");

        System.out.println("Información del Trabajador 3:");
        System.out.println(trabajador3);
    }
}
