/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author juani
 */
public class Cine {
    private Pelicula Pelicula1;
    private Sala Sala1;
    private double Precio_Entrada;

    public Cine() {
    }

    public Pelicula getPelicula1() {
        return Pelicula1;
    }

    public void setPelicula1(Pelicula Pelicula1) {
        this.Pelicula1 = Pelicula1;
    }

    public Sala getSala1() {
        return Sala1;
    }

    public void setSala1(Sala Sala1) {
        this.Sala1 = Sala1;
    }

    public double getPrecio_Entrada() {
        return Precio_Entrada;
    }

    public void setPrecio_Entrada(double Precio_Entrada) {
        this.Precio_Entrada = Precio_Entrada;
    }
    
    
}
