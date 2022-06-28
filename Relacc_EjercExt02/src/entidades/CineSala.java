/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de
asientos (8 filas por 6 columnas). De Cine nos interesa conocer la película que 
se está reproduciendo, la sala con los espectadores y el precio de la entrada.
 */
package entidades;

public class CineSala {
    
   private Espectador conjA[][] = new Espectador[8][6]; 
   private int precioEnt;

    public CineSala() {
    }

    public CineSala(int precioEnt) {
        this.precioEnt = precioEnt;
    }

    
   public Espectador[][] getConjA() {
        return conjA;
    }

    public void setConjA(Espectador[][] conjA) {
        this.conjA = conjA;
    }

    public int getPrecioEnt() {
        return precioEnt;
    }

    public void setPrecioEnt(int precioEnt) {
        this.precioEnt = precioEnt;
    }

}
