/*
 * Perro, que tendrá como atributos: nombre, raza, edad y tamaño;
 */
package entidades;


public class Perro {
    
    private String nombre;
    private String raza;
    private int edad;
    private String tamamo;

    
    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String tamamo, Persona persona) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamamo = tamamo;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamamo() {
        return tamamo;
    }

    public void setTamamo(String tamamo) {
        this.tamamo = tamamo;
    }


    @Override
    public String toString() {
        return "Nombre= " + nombre + " -> Raza= " + raza + " -> Edad= " + edad + " -> Tamaño= " + tamamo + '}';
    }

    
    
            
}
