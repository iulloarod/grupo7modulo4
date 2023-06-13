//Integrantes
//Luis Flores
//Ignacio Ulloa
// Robinson Campos

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Cliente> arrayCliente = new ArrayList<Cliente>();
    private static ArrayList<Profesional> arrayProfesional = new ArrayList<Profesional>();
    private static ArrayList<Administrativo> arrayAdministrativo = new ArrayList<Administrativo>();
    public static void imprimirTipo(){
        System.out.println("\nIngrese tipo");
        System.out.println("1) Cliente");
        System.out.println("2) Profesional");
        System.out.println("3) Administrativo");
    }
    public static void imprimirMenu(){
        System.out.println("\nMENU");
        System.out.println("1) Ingreso de usuarios");
        System.out.println("2) Mostrar cantidad de ingresos");
        System.out.println("3) Salir");
    }
    public static void funcion(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            imprimirMenu();
            sc = new Scanner(System.in);
            int op2 = sc.nextInt();
            switch (op2) {
                case 1:
                    System.out.print("Cantidad de ingresos : ");
                    int cant = sc.nextInt();

                    for (int i = 0; i < cant; i++) {
                        System.out.println("USUARIO " + (i+1));
                        System.out.print("Ingrese nombre: ");
                        sc = new Scanner(System.in);
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese fecha de nacimiento (AAAA-MM-DD): ");
                        sc = new Scanner(System.in);
                        String naci = sc.nextLine();
                        System.out.print("Ingrese RUN: ");
                        sc = new Scanner(System.in);
                        String rut = sc.nextLine();

                        imprimirTipo();
                        sc = new Scanner(System.in);
                        int op = sc.nextInt();
                        boolean flag2 = true;

                        while (flag2) {
                            switch (op) {
                                case 1:
                                    System.out.print("Ingrese direccion: ");
                                    sc = new Scanner(System.in);
                                    String direccion = sc.nextLine();
                                    System.out.print("Ingrese teléfono: ");
                                    sc = new Scanner(System.in);
                                    int telefono = sc.nextInt();
                                    System.out.print("Ingrese cantidad de empleados: ");
                                    sc = new Scanner(System.in);
                                    int cantEmp = sc.nextInt();
                                    Cliente cliente = new Cliente(nombre, naci, rut, direccion, telefono, cantEmp);
                                    arrayCliente.add(cliente);
                                    System.out.println("INGRESO EXITOSO");
                                    flag2 = false;
                                    break;

                                case 2:
                                    System.out.print("Años experiencia: ");
                                    sc = new Scanner(System.in);
                                    int anos = sc.nextInt();
                                    System.out.print("Departamento: ");
                                    sc = new Scanner(System.in);
                                    String departamento = sc.nextLine();
                                    Profesional profesional = new Profesional(nombre, naci, rut, anos, departamento);
                                    arrayProfesional.add(profesional);
                                    System.out.println("INGRESO EXITOSO");
                                    flag2 = false;
                                    break;

                                case 3:
                                    System.out.print("Funcion: ");
                                    sc = new Scanner(System.in);
                                    String funcion = sc.nextLine();
                                    System.out.print("Nombre superior: ");
                                    sc = new Scanner(System.in);
                                    String nombreSup = sc.nextLine();
                                    Administrativo administrativo = new Administrativo(nombre, naci, rut, funcion, nombreSup);
                                    arrayAdministrativo.add(administrativo);
                                    System.out.println("INGRESO EXITOSO");
                                    flag2 = false;
                                    break;

                                default:
                                    System.out.println("Seleccione una opcion correcta");
                                    imprimirTipo();
                                    sc = new Scanner(System.in);
                                    op = sc.nextInt();
                                    break;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("\nAdministrativo");
                    Iterator<Administrativo> it = arrayAdministrativo.iterator();
                    while(it.hasNext()){
                        Administrativo admin = it.next();
                        System.out.println(admin.toString());
                    }

                    System.out.println("\nProfesional");
                    Iterator<Profesional> it2 = arrayProfesional.iterator();
                    while(it2.hasNext()){
                        Profesional pro = it2.next();
                        System.out.println(pro.toString());
                    }

                    System.out.println("\nCliente");
                    Iterator<Cliente> it3 = arrayCliente.iterator();
                    while(it3.hasNext()){
                        Cliente cli = it3.next();
                        System.out.println(cli.toString());
                    }
                    break;
                case 3:
                    System.out.println("Gracias :)");
                    flag = false;
                    break;
                default:
                    System.out.println("Seleccione una opcion correcta");
                    break;
            }
        }
    }
    public static void ejecutar(){
        try{
            funcion();
        }catch (Exception e){
            System.out.println("Hubo un error jijij");
            ejecutar();
        }
    }
    public static void main(String[] args) {
        ejecutar();
    }
}