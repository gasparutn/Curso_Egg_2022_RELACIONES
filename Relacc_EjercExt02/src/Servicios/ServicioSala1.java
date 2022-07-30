/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.Sala;

/**
 *
 * @author juani
 */
public class ServicioSala1 {

    Sala ss = new Sala();

    public Sala creacionSala(int i, int j) {
        ss = new Sala(i, j);
        return ss;
    }

    public void proyectarSala(Sala s1) {
        int filas = s1.getFilas();
        int columnas = s1.getColumnas();

        for (int i = filas - 1; i >= 0; i--) {
            for (int j = 0; j < columnas; j++) {
                
                System.out.print(String.format("%2d%c", i+1, (char) (j + 65)));
                if (s1.getAsiento(i, j) == null) {
                    System.out.print("   ");
                } else {
                    System.out.print(" X ");
                }
                if (j != columnas - 1) {
                    System.out.print("| ");

                } else {
                    System.out.println("");
                }
            }
        }
        System.out.println("------------------------------------------");
        System.out.println("              P A N T A L L A             ");
        System.out.println("------------------------------------------");

    }

    public void resumenSala(Sala s1) {
        int filas = s1.getFilas();
        int columnas = s1.getColumnas();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(String.format("%2d%c: ", (i + 1), (char) (j + 65)));
                if (s1.getAsiento(i, j) != null) {
                    System.out.print(s1.getAsiento(i, j).getNombre());
                    System.out.print(" ");
                    System.out.println(s1.getAsiento(i, j).getApellido());
                } else {
                    System.out.println("");
                }
            }
        }

    }

}
