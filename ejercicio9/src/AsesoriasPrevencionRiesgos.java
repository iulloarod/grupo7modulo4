import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Empresa {
    private String rut;
    private String nombre;
    private String direccion;
    private String comuna;
    private String telefono;

    public Empresa(String rut, String nombre, String direccion, String comuna, String telefono) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.comuna = comuna;
        this.telefono = telefono;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public String getTelefono() {
        return telefono;
    }
}

class Capacitacion {
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantidadAsistentes;
    private List<Asistente> asistentes;

    public Capacitacion(String dia, String hora, String lugar, String duracion, int cantidadAsistentes) {
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
        this.asistentes = new ArrayList<>();
    }

    public void agregarAsistente(Asistente asistente) {
        asistentes.add(asistente);
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public List<Asistente> getAsistentes() {
        return asistentes;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }

    public String getLugar() {
        return lugar;
    }

    public String getDuracion() {
        return duracion;
    }
}

class Asistente {
    private String nombre;
    private int edad;

    public Asistente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

public class AsesoriasPrevencionRiesgos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Registro de datos de la empresa
        System.out.println("Ingrese los datos de la empresa:");
        System.out.print("RUT: ");
        String rut = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombreEmpresa = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Comuna: ");
        String comuna = scanner.nextLine();
        System.out.print("Número de teléfono: ");
        String telefono = scanner.nextLine();

        Empresa empresa = new Empresa(rut, nombreEmpresa, direccion, comuna, telefono);

        // Registro de datos de la capacitación
        System.out.println("\nIngrese los datos de la capacitación:");
        System.out.print("Día: ");
        String dia = scanner.nextLine();
        System.out.print("Hora: ");
        String hora = scanner.nextLine();
        System.out.print("Lugar: ");
        String lugar = scanner.nextLine();
        System.out.print("Duración: ");
        String duracion = scanner.nextLine();

        int cantidadAsistentes;
        do {
            System.out.print("Cantidad de asistentes (mayor que cero): ");
            cantidadAsistentes = scanner.nextInt();
        } while (cantidadAsistentes <= 0);

        Capacitacion capacitacion = new Capacitacion(dia, hora, lugar, duracion, cantidadAsistentes);

        scanner.nextLine(); // Consumir el salto de línea

        // Registro de datos de los asistentes
        for (int i = 0; i < cantidadAsistentes; i++) {
            System.out.println("\nDatos del asistente " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombreAsistente = scanner.nextLine();
            System.out.print("Edad: ");
            int edadAsistente = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            Asistente asistente = new Asistente(nombreAsistente, edadAsistente);
            capacitacion.agregarAsistente(asistente);
        }

        // Mostrar los datos ingresados
        System.out.println("\nDatos de la empresa:");
        System.out.println("RUT: " + empresa.getRut());
        System.out.println("Nombre: " + empresa.getNombre());
        System.out.println("Dirección: " + empresa.getDireccion());
        System.out.println("Comuna: " + empresa.getComuna());
        System.out.println("Número de teléfono: " + empresa.getTelefono());

        System.out.println("\nDatos de la capacitación:");
        System.out.println("Día: " + capacitacion.getDia());
        System.out.println("Hora: " + capacitacion.getHora());
        System.out.println("Lugar: " + capacitacion.getLugar());
        System.out.println("Duración: " + capacitacion.getDuracion());

        // Contar las edades por rangos
        int contadorMenores25 = 0;
        int contador26a35 = 0;
        int contadorMayores35 = 0;

        List<Asistente> asistentes = capacitacion.getAsistentes();
        for (Asistente asistente : asistentes) {
            int edad = asistente.getEdad();
            if (edad < 25) {
                contadorMenores25++;
            } else if (edad >= 26 && edad <= 35) {
                contador26a35++;
            } else {
                contadorMayores35++;
            }
        }

        System.out.println("\nCantidad de asistentes:");
        System.out.println("Menores a 25 años: " + contadorMenores25);
        System.out.println("Entre 26 y 35 años: " + contador26a35);
        System.out.println("Mayores a 35 años: " + contadorMayores35);
    }
}
