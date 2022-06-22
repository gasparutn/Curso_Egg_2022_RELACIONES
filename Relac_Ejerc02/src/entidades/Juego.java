package entidades;

public class Juego {

    private Jugador[] jugadores;
    private RevolverAgua revolver;

    public Juego(int numJugadores) {

        jugadores = new Jugador[comprobarJugadores(numJugadores)];

        crearJugadores();

        revolver = new RevolverAgua();
        System.out.println(revolver);
    }

    private int comprobarJugadores(int numJugadores) {
        if (!(numJugadores >= 1 && numJugadores <= 6)) {
            numJugadores = 6;
        }
        return numJugadores;
    }

    private void crearJugadores() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Jugador(i + 1);
        }
    }

    public boolean finjuego() {
        for (int i = 0; i < jugadores.length; i++) {

            if (!jugadores[i].isTurno()) {
                return true;
            }
        }
        return false;
    }

    public void ronda() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i].mojar(revolver);
            System.out.println(revolver);
        }

    }

    public void rondaV2() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i].mojar(revolver);
            System.out.println(revolver);
            if (!jugadores[i].isTurno()) {
                return;
            }
        }
    }
}
