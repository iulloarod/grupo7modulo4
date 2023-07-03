public class Pago {
    private String fechaPago;
    private int importe;
    private String direccionFacturacion;

    public Pago(String fechaPago, int importe, String direccionFacturacion) {
        this.fechaPago = fechaPago;
        this.importe = importe;
        this.direccionFacturacion = direccionFacturacion;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public String getDireccionFacturacion() {
        return direccionFacturacion;
    }

    public void setDireccionFacturacion(String direccionFacturacion) {
        this.direccionFacturacion = direccionFacturacion;
    }
}
