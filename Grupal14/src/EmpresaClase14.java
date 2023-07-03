public class EmpresaClase14 {
    public static void main(String[] args) {
        // Crear instancias de las clases
        Cliente cliente1 = new Cliente(12345678, "Juan", "Pérez", "123456789", "AFP1", 1, "Calle 1", "Comuna 1", 30);
        Cliente cliente2 = new Cliente();
        cliente2.setRut(87654321);
        cliente2.setNombres("María");
        cliente2.setApellidos("González");
        cliente2.setTelefono("987654321");
        cliente2.setAfp("AFP2");
        cliente2.setSistemaSalud(2);
        cliente2.setDireccion("Calle 2");
        cliente2.setComuna("Comuna 2");
        cliente2.setEdad(25);

        Usuario usuario1 = new Usuario("Pedro", "01/01/1990", "11111111-1");
        Usuario usuario2 = new Usuario();
        usuario2.setNombre("Ana");
        usuario2.setFechaNacimiento("02/02/1995");
        usuario2.setRun("22222222-2");

        Capacitacion capacitacion1 = new Capacitacion(1, 12345678, "01/07/2023", "09:00", "Salón A", "120", 50);
        Capacitacion capacitacion2 = new Capacitacion();
        capacitacion2.setIdentificador(2);
        capacitacion2.setRutCliente(87654321);
        capacitacion2.setDia("02/07/2023");
        capacitacion2.setHora("14:00");
        capacitacion2.setLugar("Salón B");
        capacitacion2.setDuracion("90");
        capacitacion2.setCantidadAsistentes(30);

        // Desplegar datos de los objetos usando toString()
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(capacitacion1);
        System.out.println(capacitacion2);

        // Modificar un atributo de cada clase
        cliente1.setTelefono("999999999");
        usuario1.setNombre("Juan Pablo");
        capacitacion1.setLugar("Salón C");

        // Desplegar datos de cada objeto usando métodos accesores
        System.out.println("Datos de cliente1:");
        System.out.println("Nombre completo: " + cliente1.obtenerNombre());
        System.out.println("Sistema de salud: " + cliente1.obtenerSistemaSalud());
        System.out.println("Teléfono: " + cliente1.getTelefono());

        System.out.println("Datos de usuario1:");
        usuario1.mostrarEdad();

        System.out.println("Datos de capacitacion1:");
        capacitacion1.mostrarDetalle();
        System.out.println("Lugar: " + capacitacion1.getLugar());
    }
}
