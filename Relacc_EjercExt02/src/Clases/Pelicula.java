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
public class Pelicula {
    private String Titulo;
    private double Duracion;
    private int Edad_Minima;
    private String Director;

    public Pelicula() {
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public double getDuracion() {
        return Duracion;
    }

    public void setDuracion(double Duracion) {
        this.Duracion = Duracion;
    }

    public int getEdad_Minima() {
        return Edad_Minima;
    }

    public void setEdad_Minima(int Edad_Minima) {
        this.Edad_Minima = Edad_Minima;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    @Override
    public String toString() {
        return "Pelicula: " + Titulo + "\nDuracion: " + Duracion + "h\nEdad Minima: +" + Edad_Minima + "\nDirector: " + Director + "\n";
    }
    
    
    
    
}
