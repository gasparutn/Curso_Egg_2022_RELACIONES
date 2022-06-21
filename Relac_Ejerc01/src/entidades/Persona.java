/*
 * Persona con atributos: nombre, apellido, edad, documento y Perro.
 */
package entidades;

import java.util.List;

public class Persona {

    String nombre;
    String apellido;
    int edad;
    long dni;

    private Perro perro1;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Perro getPerro1() {
        return perro1;
    }

    public void setPerro1(Perro perro1) {
        this.perro1 = perro1;
    }

    public Persona(String nombre, String apellido, int edad, long dni, Perro perro1, Perro perro2) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perro1 = perro1;

    }

    @Override
    public String toString() {
        return "Dueño-> " + "Nombre= " + nombre + " -> Apellido= " + apellido + " -> Edad= " + edad + " -> DNI= " + dni + "\nSu Perro= " + perro1 + '}';
    }

}
