package Servicios;

import entidades.Perro;
import entidades.Persona;
import java.util.Scanner;

public class servis {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearpersona() {
        Persona P1 = new Persona();
        System.out.println("Ingrese el nombre: ");
        P1.setNombre(leer.next());
        System.out.println("Ingrese apellido: ");
        P1.setApellido(leer.next());
        System.out.println("Ingrese DNI: ");
        P1.setDni(leer.nextInt());

        return P1;
    }

    public Perro crearperro() {
        Perro D1 = new Perro();

        System.out.println("ingrese el nombre del Perro: ");
        D1.setNombre(leer.next());
        System.out.println("ingrese la raza: ");
        D1.setRaza(leer.next());
        System.out.println("ingrese edad del perro: ");
        D1.setEdad(leer.nextInt());
        System.out.println("Ingrese tamaño del perro: ");
        D1.setTamano(leer.next());
        return D1;
    }

}
