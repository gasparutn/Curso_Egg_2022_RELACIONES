/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import Clases.Cine;
import Clases.Espectador;
import Entidades.Apellidos;
import Entidades.Nombres;
import Servicios.ServicioCine1;
import java.util.ArrayList;

/**
 *
 * @author juani
 */
public class EjercicioEx2_Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioCine1 sc = new ServicioCine1();
        Cine c1 = new Cine();
        ArrayList<Espectador> clientes = new ArrayList();
        ArrayList<Espectador> sinEntradas = new ArrayList();
        int random;

        sc.carteleraCine(c1);

        for (int i = 0; i < 100; i++) {
            int j = 0;
            Espectador e1 = new Espectador();

            // Nombres Random
            random = (int) (Math.random() * 45);
            for (Nombres nom : Nombres.values()) {
                if (random == j) {
                    e1.setNombre(nom.toString());
                    break;
                }
                j++;
            }
            random = (int) (Math.random() * 20);
            j = 0;

            // Apellido Random
            for (Apellidos ape : Apellidos.values()) {
                if (random == j) {
                    e1.setApellido(ape.toString());
                    break;
                }
                j++;
            }

            // Edad random
            random = (int) (Math.random() * 90);

            e1.setEdad(random);

            // Dinero random
            random = (int) (Math.random() * 2000);

            e1.setDinero(random);

            clientes.add(e1);
        }

        // Compro entradas
        for (Espectador e1 : clientes) {
            if (!sc.comprarEntrada(c1, e1)) {
                sinEntradas.add(e1);
            }
        }

        System.out.println("\n-------------------------------------------------------------------------------------------");
        System.out.println("Resumen:");
        System.out.println(c1.getPelicula1().getTitulo() + " - " + c1.getPelicula1().getDuracion() + "h");
        sc.proyectarSala(c1);
        sc.resumenSala(c1);

        System.out.println("\nPersonas sin Entradas: ");
        for (Espectador e1 : sinEntradas) {
            System.out.print(String.format("* %-2d anios. $%4.2f. ", e1.getEdad(), e1.getDinero()) + e1.getNombre() + " " + e1.getApellido() + ". ");
            if (e1.getEdad() < c1.getPelicula1().getEdad_Minima()) {
                System.out.println("(ES MENOR DE EDAD)");
            } else if (e1.getDinero() < c1.getPrecio_Entrada()) {
                System.out.println("(NO TIENE DINERO)");
            } else {
                System.out.println("(No habia mas lugar en la sala)");
            }
        }

    }

}
