package VisitaTerreno;

public class VisitaTerreno {
    private int idVisitaTerreno;
    private String rutCliente;
    private String diaSemana;
    private String hora;
    private String lugar;
    private String comentarios;

    public VisitaTerreno() {
    }

    public VisitaTerreno(int idVisitaTerreno, String rutCliente, String diaSemana, String hora, String lugar, String comentarios) {
        this.idVisitaTerreno = idVisitaTerreno;
        this.rutCliente = rutCliente;
        this.diaSemana = diaSemana;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    public int getIdVisitaTerreno() {
        return idVisitaTerreno;
    }

    public void setIdVisitaTerreno(int idVisitaTerreno) {
        this.idVisitaTerreno = idVisitaTerreno;
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

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
