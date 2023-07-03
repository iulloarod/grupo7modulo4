import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalcularPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Alumno> alumnos = new ArrayList<>();

        String nombreAlumno;
        double calificacion;

        do {
            System.out.print("Ingrese el nombre del alumno (o 'SALIR' para terminar): ");
            nombreAlumno = scanner.nextLine();

            if (nombreAlumno.equalsIgnoreCase("SALIR")) {
                break;
            }

            if (nombreAlumno.isEmpty()) {
                System.out.println("Error: El nombre no puede estar vacío. Por favor, ingrese nuevamente.");
                continue;
            }

            System.out.print("Ingrese la calificación del alumno: ");
            calificacion = scanner.nextDouble();
            scanner.nextLine();

            Alumno alumno = new Alumno(nombreAlumno, calificacion);
            alumnos.add(alumno);

        } while (true);

        int cantidadAlumnos = alumnos.size();
        if (cantidadAlumnos < 2) {
            System.out.println("Debe ingresar al menos dos alumnos.");
        } else {
            double sumaCalificaciones = 0;
            double maxCalificacion = Double.MIN_VALUE;
            double minCalificacion = Double.MAX_VALUE;
            String alumnoMaxCalificacion = "";
            String alumnoMinCalificacion = "";

            for (Alumno alumno : alumnos) {
                double calificacionActual = alumno.getCalificacion();
                sumaCalificaciones += calificacionActual;

                if (calificacionActual > maxCalificacion) {
                    maxCalificacion = calificacionActual;
                    alumnoMaxCalificacion = alumno.getNombre();
                }

                if (calificacionActual < minCalificacion) {
                    minCalificacion = calificacionActual;
                    alumnoMinCalificacion = alumno.getNombre();
                }
            }

            double promedio = sumaCalificaciones / cantidadAlumnos;

            System.out.println("Promedio del curso: " + promedio);
            System.out.println("Alumno con la mayor calificación: " + alumnoMaxCalificacion);
            System.out.println("Alumno con la menor calificación: " + alumnoMinCalificacion);
        }

        scanner.close();
    }
}
