package entidades;

public class Carta {

    private int numero;
    private String palo;

    public static final String[] PALOS = {"Espada", "Oros", "Copas", "Bastos"};
    public static final int limite_carta_palo=12;

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    }

}
