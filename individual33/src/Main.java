public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Vendedor("Juan", "Perez", 45, 500000, "01/01/2010");
        Vendedor vendedor = new Vendedor("Maria", "Lopez", 35, 600000, "01/01/2010");
        Repartidor repartidor = new Repartidor("Pedro", "Gonzalez", 25, 400000, "Tarde");

        imprimirEmpleado(empleado);
        imprimirBonificacion(empleado);

        imprimirEmpleado(vendedor);
        imprimirBonificacion(vendedor);

        imprimirEmpleado(repartidor);
        imprimirBonificacion(repartidor);
    }

    public static void imprimirEmpleado(Empleado empleado) {
        System.out.println("Datos del empleado:");
        System.out.println(empleado);
        System.out.println("Salario Total: $" + empleado.getSalario());
        System.out.println();
    }

    public static void imprimirBonificacion(Bonificable bonificable) {
        double bono = bonificable.calcularBono();
        System.out.println("Bono: $" + bono);
        System.out.println();
    }
}
