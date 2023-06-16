public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("12211522-4","José","Perez","56945541211","Plan vital",1,"Calle falsa 123","El quisco",20);
        Cliente cliente2 = new Cliente();

        Usuario usuario1 = new Usuario("Jose 2","11/11/1990","19451236-0");
        Usuario usuario2 = new Usuario();

        Capacitacion capacitacion1 = new Capacitacion(1,"15412555-8","Lunes 15 de Enero","15:00","Casa","4 horas",15);
        Capacitacion capacitacion2 = new Capacitacion();

        System.out.println(cliente1.toString() + "\n\n" + cliente2.toString() + "\n\n" +
                           usuario1.toString() + "\n\n" + usuario2.toString() + "\n\n" +
                           capacitacion1.toString() + "\n\n" + capacitacion2.toString());
    }
}
