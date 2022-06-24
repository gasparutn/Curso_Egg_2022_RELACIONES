package relac_ejerc03;

import entidades.Baraja;
import entidades.Carta;

public class Main {

    public static void main(String[] args) {

        Baraja b = new Baraja();

        System.out.println(b.siguienteCarta());
        
        Carta[] c = b.darCartas(32);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        c = b.darCartas(4);
        System.out.println("Quedan : "+b.cartasDisponibles()+" cartas");
        b.siguienteCarta();
        b.barajar();
        b.mostrarBaraja();
    }

}
