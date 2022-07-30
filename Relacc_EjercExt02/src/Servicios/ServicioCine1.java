/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.Cine;
import Clases.Espectador;
import java.util.Scanner;

/**
 *
 * @author juani
 */
public class ServicioCine1 {

    Cine scine = new Cine();

    ServicioPelicula1 sp = new ServicioPelicula1();
    ServicioSala1 ss = new ServicioSala1();
    Scanner sc = new Scanner(System.in);

    public ServicioCine1() {
    }

    public void carteleraCine(Cine c1) {

        System.out.println("\t--- MODIFICAR CARTELERA DE CINE ---");
        System.out.println("Pelicula que se va a reproducir:");
        c1.setPelicula1(sp.agregarPelicula());

        System.out.println("Cuantas filas desea en la sala?");
        int filas = sc.nextInt();
        sc.nextLine();
        System.out.println("Cuantas columnas desea en la sala?");
        int columnas = sc.nextInt();
        sc.nextLine();
        c1.setSala1(ss.creacionSala(filas, columnas));

        double var1;
        String var;
        do {
            System.out.print("Que valor tienen las entradas?\n$");
            var1 = sc.nextDouble();
            sc.nextLine();
            do {

                System.out.println(String.format("Es correcto que cada entrada vale $%.2f?", var1));
                var = sc.nextLine();
                if (!var.equalsIgnoreCase("si") && !var.equalsIgnoreCase("no")) {
                    System.out.println("ERROR. Ingrese SI / NO");
                }
            } while (!var.equalsIgnoreCase("si") && !var.equalsIgnoreCase("no"));
        } while (var.equalsIgnoreCase("no"));

        c1.setPrecio_Entrada(var1);
        System.out.println("\t\n--- CARTELERA DE CINE CREADA CON EXITO ---\n");
    }

    public boolean comprarEntrada(Cine c1, Espectador e1) {
        int fila, columna;
        char colu;
        boolean conseguido = false;
        System.out.println("\n---------------------------------------------------------------------------------");
        System.out.println("Hola " + e1.getNombre().toUpperCase() + " " + e1.getApellido().toUpperCase() + "!");
        System.out.print(String.format("Actualmente la entrada cuesta $%.2f. ", c1.getPrecio_Entrada()));
        System.out.print(String.format("La pelicula es +%d. ", c1.getPelicula1().getEdad_Minima()));
        System.out.println(String.format("Quedan %d asientos disponibles. ", c1.getSala1().getAsientos_Disponibles()));
        if (c1.getSala1().getAsientos_Disponibles() == 0) {
            System.out.println("Ya no quedan asientos disponibles.");

        } else if (c1.getPrecio_Entrada() > e1.getDinero()) {
            System.out.println("Vemos que usted no tiene suficiente saldo para comprar la entrada.");
            System.out.println(String.format("Usted tiene $%.2f. Cargue saldo e intentelo nuevamente! Adios!", e1.getDinero()));
            return false;

        } else if (c1.getPelicula1().getEdad_Minima() > e1.getEdad()) {
            System.out.println(String.format("Vemos que usted no posee la edad suficiente para ver esta pelicula."));
            System.out.println(String.format("Usted tiene %d anios. Crezca e intentelo nuevamente! Adios!", e1.getEdad()));
            return false;

        } else {
            System.out.println("Ocupacion de la sala actualmente:");
            ss.proyectarSala(c1.getSala1());
            while (true) {
                System.out.print("Indiquenos la fila que desea: ");
                //fila = sc.nextInt();
                //sc.nextLine();
                fila = (int) (Math.random() * c1.getSala1().getFilas() + 1); // simulo ingreso
                System.out.println(fila);
                fila--;

                System.out.print("Indiquenos la columna que desea: ");
                //colu = sc.nextLine().toUpperCase().charAt(0);
                colu = (char) (65 + (int) (Math.random() * c1.getSala1().getColumnas())); // simulo ingreso
                System.out.println(colu);

                columna = ((int) colu) - 65;

                if (c1.getSala1().getAsiento(fila, columna) == null) {
                    System.out.println("Perfecto! Usted ha comprado el asiento " + (fila + 1) + colu);
                    System.out.println("\n---------------------------------------------------------------------------------");
                    c1.getSala1().setAsiento(e1, fila, columna);
                    return true;
                } else {
                    System.out.println("El asiento esta ocupado. Intentelo con otro.");
                }

            }

        }
        return false;

    }

    public void proyectarSala(Cine c1) {
        ss.proyectarSala(c1.getSala1());
    }

    public void resumenSala(Cine c1) {
        ss.resumenSala(c1.getSala1());
    }
}
