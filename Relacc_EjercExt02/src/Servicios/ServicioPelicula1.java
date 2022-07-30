/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.Pelicula;
import java.util.Scanner;

/**
 *
 * @author juani
 */
public class ServicioPelicula1 {

    Pelicula sp = new Pelicula();

    public ServicioPelicula1() {
    }

    public Pelicula agregarPelicula() {
        String var;
        Scanner sc = new Scanner(System.in);
        do {
            sp = new Pelicula();
            System.out.println("-- Datos de la pelicula --");
            System.out.print("Titulo: ");
            sp.setTitulo(sc.nextLine());
            System.out.print("Duracion en horas: ");
            sp.setDuracion(sc.nextDouble());
            sc.nextLine();
            System.out.print("Edad minima para ver la pelicula: +");
            sp.setEdad_Minima(sc.nextInt());
            sc.nextLine();
            System.out.print("Director: ");
            sp.setDirector(sc.nextLine());

            System.out.println("\nUsted ha ingresado los siguientes datos: \n" + sp.toString());

            do {
                System.out.println("Son correctos?");
                var = sc.nextLine();
                if (!var.equalsIgnoreCase("si") && !var.equalsIgnoreCase("no")) {
                    System.out.println("ERROR. Ingrese SI / NO");
                }
            } while (!var.equalsIgnoreCase("si") && !var.equalsIgnoreCase("no"));

        } while (var.equalsIgnoreCase("no"));

        return sp;
    }
}
