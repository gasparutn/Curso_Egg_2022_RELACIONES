package entidades;

import Servicios.servis;

public class Baraja {

    private Carta cartas[];
    private int posSiguienteCarta;

    public static final int NUM_CARTAS = 40;
    public static final int limite_carta_palo = 12;

    public Baraja() {
        this.cartas = new Carta[NUM_CARTAS];
        this.posSiguienteCarta = 0;
        crearBaraja();
        barajar();
    }

    public void crearBaraja() {
        String[] palos = Carta.PALOS;

        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < Carta.limite_carta_palo; j++) {
                if (!(j == 7 || j == 8)) {
                    if (j >= 9) {
                        cartas[((i * (Carta.limite_carta_palo - 2)) + (j - 2))] = new Carta(j + 1, palos[i]);
                    } else {
                        cartas[((i * (Carta.limite_carta_palo - 2)) + j)] = new Carta(j + 1, palos[i]);
                    }
                }
            }
        }

    }

    public void barajar() {

        int posAleatoria = 0;
        Carta c;

        for (int i = 0; i < cartas.length; i++) {

            posAleatoria = servis.llenaaleatorios(0, NUM_CARTAS - 1);
            c = cartas[i];
            cartas[i] = cartas[posAleatoria];
            cartas[posAleatoria] = c;
        }
        this.posSiguienteCarta = 0;
    }

    public Carta siguienteCarta() {
        Carta c = null;
        if (posSiguienteCarta == NUM_CARTAS) {
            System.out.println("NO hay mas cartas, barajaer de nuevo");

        } else {
            c = cartas[posSiguienteCarta++];
        }
        return c;

    }

    public Carta[] darCartas(int numCartas) {
        if (numCartas > NUM_CARTAS) {
            System.out.println("No se puede dar mas cartas de las que hay");
            return null;

        } else {
            if (cartasDisponibles() < numCartas) {
                System.out.println("No hay suficientes cartas que mostrar");

            } else {
                Carta[] cartasDar = new Carta[numCartas];

                for (int i = 0; i < cartasDar.length; i++) {
                    cartasDar[i] = siguienteCarta();

                }
                return cartasDar;
            }
        }
        return null;
    }

    public int cartasDisponibles() {

        return NUM_CARTAS - posSiguienteCarta;
    }

    public void cartasMonton() {
        if (cartasDisponibles() == NUM_CARTAS) {
            System.out.println("No se ha sacado ninguna carta");

        } else {
            for (int i = 0; i < posSiguienteCarta; i++) {
                System.out.println(cartas[i]);

            }
        }
    }

    public void mostrarBaraja() {

        if (cartasDisponibles() == 0) {
            System.out.println("No hay cartas que mostrar");

        } else {
            for (int i = posSiguienteCarta; i < cartas.length; i++) {
                System.out.println(cartas[i]);
            }
        }

    }

}
