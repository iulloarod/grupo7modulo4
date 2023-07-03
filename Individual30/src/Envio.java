import java.util.ArrayList;
import java.util.List;

public class Envio {
    private String fechaEnvio;
    private Direccion direccionEnvio;
    private Vendedor vendedor;
    private Pago pago;
    private List<Articulo> articulos;

    public Envio(String fechaEnvio, Direccion direccionEnvio) {
        this.fechaEnvio = fechaEnvio;
        this.direccionEnvio = direccionEnvio;
        this.articulos = new ArrayList<>();
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Direccion getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(Direccion direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
    }
}
