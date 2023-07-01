package Capacitaciones;

public class Capacitaciones {
    private int idCapacitacion;
    private int rutCliente;
    private String diaSemana;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantAsistentes;

    public Capacitaciones(int idCapacitacion, int rutCliente, String diaSemana, String hora, String lugar, String duracion, int cantAsistentes) {
        this.idCapacitacion = idCapacitacion;
        this.rutCliente = rutCliente;
        this.diaSemana = diaSemana;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantAsistentes = cantAsistentes;
    }

    public Capacitaciones() {
    }

    public int getIdCapacitacion() {
        return idCapacitacion;
    }

    public void setIdCapacitacion(int idCapacitacion) {
        this.idCapacitacion = idCapacitacion;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
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

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getCantAsistentes() {
        return cantAsistentes;
    }

    public void setCantAsistentes(int cantAsistentes) {
        this.cantAsistentes = cantAsistentes;
    }
    public void mostrarDetalle(){
        System.out.println("La capacitación será en " + getLugar() + " a las " + getHora() + " del día " + getDiaSemana() + ", y durará " + getDuracion() + " minutos");
    }
}
