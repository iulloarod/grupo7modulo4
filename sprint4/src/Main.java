import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Cliente.Cliente;
import Usuario.Usuario;
import Profesional.Profesional;
import Administrativo.Administrativo;
import Capacitaciones.Capacitaciones;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Contenedor cont = new Contenedor();
    public static void menu(){
        System.out.println("---------------- Este es el menú principal :) ----------------");
        System.out.println("1) Almacenar cliente");
        System.out.println("2) Almacenar profesional");
        System.out.println("3) Almacenar administrativo");
        System.out.println("4) Almacenar capacitacion");
        System.out.println("5) Eliminar usuario");
        System.out.println("6) Listar usuarios (independiente el tipo)");
        System.out.println("7) Listar usuarios (dependiendo el tipo)");
        System.out.println("8) Listar capacitaciones");
        System.out.println("9) Salir");
    }
    public static LocalDate stringToLocalDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        return localDate;
    }
    public static boolean validarLargo (String var, int min, int max){
        boolean flag = false;
        if(var.length() >= min && var.length() <= max){
            flag = true;
        }
        return flag;
    }
    public static String ingresoDeString(String texto, int min, int max){
        System.out.println(texto);
        sc = new Scanner(System.in);
        String retorno = sc.nextLine();
        boolean largoNombre = validarLargo(retorno,min,max);
        while (!largoNombre){
            System.out.println("Largo invalido");
            sc = new Scanner(System.in);
            System.out.println("Nombre: ");
            retorno = sc.nextLine();
            largoNombre = validarLargo(retorno,min,max);
        }
        return retorno;
    }
    public static int ingresoNumero(String texto, int minimo, int maximo){
        System.out.println(texto);
        sc = new Scanner(System.in);
        int retorno = sc.nextInt();
        while(retorno < minimo || retorno >= maximo){
            System.out.println("Supera limites");
            sc = new Scanner(System.in);
            System.out.println(texto);
            retorno = sc.nextInt();
        }
        return retorno;
    }
    public static int ingresoSistemaSalud(){
        int op = 0;
        sc = new Scanner(System.in);
        System.out.println("Salud \n1) Fonasa\n2) Isapre");
        op = sc.nextInt();
        while(op != 1 && op != 2){
            System.out.println("Opcion incorrecta");
            System.out.println("Salud \n1) Fonasa\n2) Isapre");
            sc = new Scanner(System.in);
            op = sc.nextInt();
        }
        return op;
    }
    public static LocalDate ingresoFecha(String texto){
        System.out.println(texto);
        sc = new Scanner(System.in);
        String fecha = sc.nextLine();
        LocalDate date = stringToLocalDate(fecha);
        return date;
    }

    public static int validarRut(){
        System.out.println("Ingrese rut del cliente: ");
        sc = new Scanner(System.in);
        int rut = ingresoNumero("Rut cliente (sin puntos, sin guión ni dígito verificador): ",0,99999999);
        boolean flag = cont.validarRut(rut);
        if(!flag){
            System.out.println("Rut no encontrado");
            validarRut();
        }
        return rut;
    }

    public static String validarDia(){
        String dia = "";
        System.out.println("Día de la semana: ");
        System.out.println("\n1) Lunes\n2) Martes\n3) Miercoles\n4) Jueves\n5) Viernes\n6) Sabado\n7) Domingo");
        sc = new Scanner(System.in);
        int op = sc.nextInt();
       switch (op){
           case 1:
               dia = "Lunes";
               break;
           case 2:
               dia = "Martes";
               break;
           case 3:
               dia = "Miercoles";
               break;
           case 4:
               dia = "Jueves";
               break;
           case 5:
               dia = "Viernes";
               break;
           case 6:
               dia = "Sabado";
               break;
           case 7:
               dia = "Domingo";
               break;
           default:
               System.out.println("Ingreso no valido");
               validarDia();
               break;
       }
        return dia;
    }
    public static Usuario ingresoUsuario(){
        sc = new Scanner(System.in);

        String nombre = ingresoDeString("Nombre: ",10,50);



        LocalDate date = ingresoFecha("Fecha de nacimiento (formato DD/MM/YYYY): ");
        //al ingresar usar el cambio del date


        int run = ingresoNumero("Run (sin puntos, sin guión ni dígito verificador): ",0,99999999);

        Usuario usu = new Usuario(nombre,date,run);
        return usu;
    }

    public static Cliente ingresoCliente(){
        Usuario usu = ingresoUsuario();

        String nombres = ingresoDeString("Nombres de cliente: ",5,30);

        String apellidos = ingresoDeString("Apellidos de cliente: ",5,30);

        String tel = ingresoDeString("Teléfono (sin +56): ",9,9);
        int telefono = Integer.parseInt(tel);

        String afp = ingresoDeString("AFP",4,30);

        int salud = ingresoSistemaSalud();

        String direccion = ingresoDeString("Direccion: ", 0,70);

        String comuna = ingresoDeString("Comuna",0,50);

        int edad = ingresoNumero("Edad: ", 0,150);

        Cliente cli = new Cliente(usu.getNombre(),usu.getFechaNacimiento(),usu.getRut(),nombres,apellidos,telefono,afp,salud,direccion,comuna,edad);

        return cli;

    }

    public static Profesional ingresoProfesional(){
        Usuario usu = ingresoUsuario();
        String titulo = ingresoDeString("Titulo: ",10,50);
        LocalDate fechaIngreso = ingresoFecha("Fecha de ingreso: ");
        Profesional profesional = new Profesional(usu.getNombre(),usu.getFechaNacimiento(),usu.getRut(),titulo,fechaIngreso);

        return profesional;
    }

    public static Administrativo ingresoAdiminstrativo(){
        Usuario usu = ingresoUsuario();
        String area = ingresoDeString("Área: ",5,20);
        String exp = ingresoDeString("Experencia previa: ",0,100);

        Administrativo admin = new Administrativo(usu.getNombre(),usu.getFechaNacimiento(),usu.getRut(),area,exp);
        return admin;
    }

    public static Capacitaciones ingresoCapacitaciones(){
        sc = new Scanner(System.in);
        System.out.println("Ingrese identificador: ");
        int idCapacitacion = sc.nextInt();

        int rutCliente = validarRut();

        String dia = validarDia();

        int hh = ingresoNumero("Hora de realizacion (0 - 23): ",0,24);
        int mm = ingresoNumero("Se realizará a las " + hh + "hrs con cuantos minutos?: ",0,30);
        String hora = hh + ":" + mm;

        String lugar = ingresoDeString("Ingreso del lugar a realizar: ",10,51);

        String duracion = ingresoDeString("Duracion: ",0,71);

        int cantidadAsistentes = ingresoNumero("Cantidad de asistentes: ",0,1000);

        Capacitaciones capacita = new Capacitaciones(idCapacitacion,rutCliente,dia,hora,lugar,duracion,cantidadAsistentes);

        return capacita;
    }

    public static int eliminarCliente(){
        int rut = 0;
        System.out.println("Eliminar cliente");
        rut = validarRut();
        return rut;

    }


    public static void ingreso1(){
        cont.almacenarCliente(ingresoCliente());
    }

    public static void ingreso2(){
        cont.almacenarProfesional(ingresoProfesional());
    }
    public static void ingreso3(){
        cont.almacenarAdministrativo(ingresoAdiminstrativo());
    }
    public static void ingreso5(){
        cont.eliminarUsuario(eliminarCliente());
    }
    public static void ingreso4(){
        cont.almacenarCapacitacion(ingresoCapacitaciones());
    }
    public static void ingreso6(){
        cont.listarUsuariosIT();
    }
    public static void ingreso7(){
        cont.listarUsuariosDP();
    }
    public static void ingreso8(){
        cont.listarCapacitaciones();
    }

    public static void main(String[] args) {

       boolean flag = true;
       while(flag) {
           menu();
           int op = sc.nextInt();

           switch (op) {
               case 1:
                   ingreso1();
                   break;
               case 2:
                   ingreso2();
                   break;
               case 3:
                   ingreso3();
                   break;
               case 4:
                   ingreso4();
                   break;
               case 5:
                   ingreso5();
                   break;
               case 6:
                   ingreso6();
                   break;
               case 7:
                   ingreso7();
                   break;
               case 8:
                   ingreso8();
                   break;
               case 9:
                   System.out.println("Saliendo......");
                   flag = false;
                   break;

               default:
                   System.out.println("Ingreso no valido");
                   break;
           }
       }
    }
}