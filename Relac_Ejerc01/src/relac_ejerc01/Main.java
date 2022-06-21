/*
Realizar un programa para que una Persona pueda adoptar un Perro. 
Vamos a contar de dos clases. Perro, que tendrá como atributos: nombre,
raza, edad y tamaño; y la clase Persona con atributos: nombre, apellido,
edad, documento y Perro. Ahora deberemos en el main crear dos Personas y 
dos Perros. Después, vamos a tener que pensar la lógica necesaria para 
asignarle a cada Persona un Perro y por ultimo, mostrar desde la clase
Persona, la información del Perro y de la Persona.
 */
package relac_ejerc01;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        List<Perro> mascota = new ArrayList();
        Perro dog1 = new Perro();
        dog1.setNombre("Lucky");
        dog1.setRaza("Dogo");
        dog1.setEdad(4);
        dog1.setTamamo("Chiquito");
        mascota.add(dog1);

        Perro dog2 = new Perro();
        dog2.setNombre("Pepito");
        dog2.setRaza("Beagle");
        dog2.setEdad(8);
        dog2.setTamamo("Grandote");

        mascota.add(dog2);

        Persona p1 = new Persona();

        p1.setNombre("Ramon");
        p1.setApellido("Lopez");
        p1.setDni(30368968);
        p1.setEdad(38);
        p1.setPerro1(dog1);

        System.out.println(p1.toString());

        Persona p2 = new Persona();
        p2.setNombre("Gaspar");
        p2.setApellido("Laborde");
        p2.setDni(28897582);
        p2.setEdad(50);
        p2.setPerro1(dog2);

        System.out.println(p2.toString());
    }

}
