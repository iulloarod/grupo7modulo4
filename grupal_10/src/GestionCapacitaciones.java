import java.util.Scanner;

class GestionCapacitaciones {
    
    //definicion de scanner fuera de los metodos para que toda la clase lo vea presente
    private static Scanner scanner = new Scanner(System.in);

    //Funcion que contiene todo el metodo principal
    public static void funcion(){
        System.out.println("Ingrese los datos de la capacitación:");
        System.out.print("Día: ");
        String dia = scanner.nextLine();
        System.out.print("Hora: ");
        String hora = scanner.nextLine();
        System.out.print("Lugar: ");
        String lugar = scanner.nextLine();
        System.out.print("Duración: ");
        String duracion = scanner.nextLine();
        System.out.print("Cantidad de asistentes: ");
        int cantidadAsistentes = scanner.nextInt();

        scanner.nextLine(); // Consumir el salto de línea pendiente

        //Creación de arreglos para los asistentes y calificaciones
        String[] nombresAsistentes = new String[cantidadAsistentes];
        int[] calificaciones = new int[cantidadAsistentes];

        //Ciclo for para insertar la cantidad indicada de asistentes y calificaciones a los arreglos
        for (int i = 0; i < cantidadAsistentes; i++) {
            System.out.print("Nombre del asistente " + (i + 1) + ": ");
            nombresAsistentes[i] = scanner.nextLine();

            System.out.print("Calificación del asistente " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();

            scanner.nextLine(); // Consumir el salto de línea pendiente
        }

        //sout para mostrar la información de la capacitacion
        System.out.println("\nDatos de la capacitación:");
        System.out.println("Día: " + dia);
        System.out.println("Hora: " + hora);
        System.out.println("Lugar: " + lugar);
        System.out.println("Duración: " + duracion);

        double promedio = calcularPromedio(calificaciones);
        System.out.println("Promedio de notas: " + promedio);

        int calificacionMaxima = obtenerCalificacionMaxima(calificaciones);
        System.out.println("Calificación mayor: " + calificacionMaxima);

        int calificacionMinima = obtenerCalificacionMinima(calificaciones);
        System.out.println("Calificación menor: " + calificacionMinima);
    }

    //funcion que calcula el promedio del arreglo calificaciones
    public static double calcularPromedio(int[] calificaciones) {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / calificaciones.length;
    }

    //Metodo que obtiene la maxima calificacion del arreglo (maximo valor)
    public static int obtenerCalificacionMaxima(int[] calificaciones) {
        int maxima = calificaciones[0];
        for (int i = 1; i < calificaciones.length; i++) {
            if (calificaciones[i] > maxima) {
                maxima = calificaciones[i];
            }
        }
        return maxima;
    }

    //Metodo que obtiene el valor minimo de la calificacion del arreglo (maximo valor)
    public static int obtenerCalificacionMinima(int[] calificaciones) {
        int minima = calificaciones[0];
        for (int i = 1; i < calificaciones.length; i++) {
            if (calificaciones[i] < minima) {
                minima = calificaciones[i];
            }
        }
        return minima;
    }

    //Funcion dedicada a llamar al metodo funcion. Este metodo contiene un try catch para poder capturar errores y en caso de catch llama recursivamente a si mismo
    public static void ejecutar(){
        try {
            funcion();
        } catch (Exception e) {
            System.out.println("ERROR DE FUNCIONAMIENTO");
            ejecutar();
        }
    }
    public static void main(String[] args) {
        ejecutar();
    }
}
