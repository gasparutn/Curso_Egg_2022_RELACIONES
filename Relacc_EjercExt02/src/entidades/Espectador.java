/*
Por último, del espectador, nos interesa saber su nombre, edad y el dinero 
que tiene disponible.
 */
package entidades;


public class Espectador {
    
  private String nombre;
  private int edad;
  private int dinedisp;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, int dinedisp) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinedisp = dinedisp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinedisp() {
        return dinedisp;
    }

    public void setDinedisp(int dinedisp) {
        this.dinedisp = dinedisp;
    }
  

  
}
