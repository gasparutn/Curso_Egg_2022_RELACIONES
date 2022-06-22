package relac_Main;

import entidades.Juego;

public class Main {

    public static void main(String[] args) {
        Juego jugar = new Juego(3);

        while (!jugar.finjuego()) {
            jugar.rondaV2();

        }
        System.out.println("-----------------------------------");
        System.out.println("El juego ha terminado");

    }
}
