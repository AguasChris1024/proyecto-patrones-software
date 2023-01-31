package Menu;

import Builder.GestorDirector;
import Builder.MonosFreeman;
import Builder.MonosLocos;
import java.util.Scanner;

public class Menu {

    static void menugeneral(GestorDirector gestorE) {
        Scanner ingreso = new Scanner(System.in);
        int op;
        do {

            System.out.println(" Menu Garage Gas Monkey  ");
            System.out.println(" INGRESE UNA OPCION");
            System.out.println("1 Crear Moto V_Virgin");
            System.out.println("2 Crear Moto  V_Strom");
            System.out.println("3 Mostrar Motos Creadas");
            System.out.println("4 Salir");
            op = ingreso.nextInt();
            switch (op) {
                case 1:
                    menuMoto_Virgin(gestorE);
                    break;
                case 2:
                    MenuMotoV_Storm(gestorE);
                    break;
                case 3:
                    MenuNotificacion(gestorE);
                    break;
                case 4:
                    System.out.println("HASTA PRONTO");
            }
        } while (op != 4);
    }

    private static void menuMoto_Virgin(GestorDirector gestorE) {
        Scanner tecla = new Scanner(System.in);
        String op;
        do {
            System.out.println("Creando Una Moto En Gas Monkey\n");
            menuVirgin(gestorE);
            System.out.println("\nDesea Crear otra  moto (S/n)\n");
            op = tecla.nextLine();
        } while ("s".equals(op) || "S".equals(op));

    }

    private static void menuVirgin(GestorDirector gestorE) {
        if (!gestorE.agregarMoto(new MonosLocos())) {
            System.out.println("No Pudo Crear La Moto V_Virgin Por Algun Problema");
        }

    }

    private static void MenuMotoV_Storm(GestorDirector gestorE) {
        Scanner tecla = new Scanner(System.in);
        String op;
        do {
            System.out.println("Creando Una Moto En Gas Monkey\n");
            menuV_Storm(gestorE);
            System.out.println("\nDesea Crear otra  moto (S/n)\n");
            op = tecla.nextLine();
        } while ("s".equals(op) || "S".equals(op));

    }

    private static void menuV_Storm(GestorDirector gestorE) {
        if (!gestorE.agregarMoto(new MonosFreeman())) {
            System.out.println("No Pudo Crear La Moto V_Storm Por Algun Problema");
        }
    }

    private static void MenuNotificacion(GestorDirector gestorE) {
        gestorE.MostrarNotificaciones();

    }

}
