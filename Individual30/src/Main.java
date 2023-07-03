public class Main {
    public static void main(String[] args) {
        // Crear objetos de las clases
        Direccion direccion = new Direccion("Calle Principal", "123", "Centro", "Ciudad");
        Comprador comprador = new Comprador("Juan", "Perez", direccion);

        Envio envio = new Envio("2023-07-03", direccion);

        Articulo articulo1 = new Articulo("Producto 1", 100);
        Articulo articulo2 = new Articulo("Producto 2", 200);
        envio.agregarArticulo(articulo1);
        envio.agregarArticulo(articulo2);

        Vendedor vendedor = new Vendedor("Pedro", "Gómez");
        envio.setVendedor(vendedor);

        Pago pago = new Pago("2023-07-03", 300, "Dirección de Facturación");
        envio.setPago(pago);

        // Acceder a los datos
        System.out.println("Comprador: " + comprador.getNombres() + " " + comprador.getApellidos());
        System.out.println("Dirección de envío: " + direccion.getCalle() + " " + direccion.getNumero());
        System.out.println("Artículos en el envío:");
        for (Articulo articulo : envio.getArticulos()) {
            System.out.println("- " + articulo.getNombre() + ", Precio: " + articulo.getPrecio());
        }
        System.out.println("Vendedor: " + vendedor.getNombres() + " " + vendedor.getApellidos());
        System.out.println("Pago: Fecha: " + pago.getFechaPago() + ", Importe: " + pago.getImporte());
    }
}
