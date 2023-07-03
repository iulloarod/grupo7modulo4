public class Direccion {
    private String calle;
    private String numero;
    private String sector;
    private String comuna;

    public Direccion(String calle, String numero, String sector, String comuna) {
        this.calle = calle;
        this.numero = numero;
        this.sector = sector;
        this.comuna = comuna;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
}
