package Accidente;

public class Accidente {

    private int idAccidente;
    private String rutCliente;
    private String diaSemana;
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencias;

    public Accidente() {
    }

    public Accidente(int idAccidente, String rutCliente, String diaSemana, String hora, String lugar, String origen, String consecuencias) {
        this.idAccidente = idAccidente;
        this.rutCliente = rutCliente;
        this.diaSemana = diaSemana;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }

    public int getIdAccidente() {
        return idAccidente;
    }

    public void setIdAccidente(int idAccidente) {
        this.idAccidente = idAccidente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
    }
}
