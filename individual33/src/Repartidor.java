public class Repartidor extends Empleado implements Bonificable {
    private String disponibilidadHoraria;

    public Repartidor(String nombre, String apellido, int edad, double salario, String disponibilidadHoraria) {
        super(nombre, apellido, edad, salario);
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

    public String getDisponibilidadHoraria() {
        return disponibilidadHoraria;
    }

    @Override
    public double calcularBono() {
        return (getEdad() < 30) ? 15000 : 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Disponibilidad horaria: " + disponibilidadHoraria;
    }
}
