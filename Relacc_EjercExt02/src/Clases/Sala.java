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
public class Sala {

    private Espectador[][] Asientos; // Disposicion de los asientos
    private int filas;
    private int columnas;
    private int Asientos_Disponibles; // Cantidad de asientos que quedan disponibles en la sala

    public Sala() {
    }

    public Sala(int filas, int columnas) {
        this.Asientos = new Espectador[filas][columnas];
        this.Asientos_Disponibles = filas * columnas;
        this.filas = filas;
        this.columnas = columnas;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public Espectador[][] getAsientos() {
        return Asientos;
    }

    
    
    public Espectador getAsiento(int fila, int columna) {
        return Asientos[fila][columna];
    }

    public int getAsientos_Disponibles() {
        return Asientos_Disponibles;
    }

    public boolean setAsiento(Espectador e1, int fila, int columna) {
        if (getAsiento(fila, columna) == null) {
            this.Asientos[fila][columna] = e1;
            this.Asientos_Disponibles--;
            return true;
        } else {
            return false;
        }
        }

    }
