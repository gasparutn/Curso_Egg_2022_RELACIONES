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

import Servicios.servis;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        servis ssP = new servis();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        List<Perro> mascotaadopt = new ArrayList();
        List<Persona> personass = new ArrayList();
        System.out.println("Ingresar dos personas porfavor:\n");
        for (int i = 0; i < 2; i++) {
            personass.add(ssP.crearpersona());
        }
        System.out.println("Ahota Ingrese dos perros porfavor:\n");
        for (int i = 0; i < 2; i++) {
            mascotaadopt.add(ssP.crearperro());
        }
        System.out.println("");

        for (Persona auxP : personass) {
            System.out.println("Persona: " + auxP.getNombre() + " " + auxP.getApellido() + "\nSeleccione un de las siguientes mascotas: ");
            for (Perro auxMasc : mascotaadopt) {
                System.out.println("Nombre: " + auxMasc.getNombre() + " Raza: " + auxMasc.getRaza());

            }
            String adoptable = leer.next();

            int ctrol = 0;
            for (int i = 0; i < mascotaadopt.size(); i++) {
                if (adoptable.equalsIgnoreCase(mascotaadopt.get(i).getNombre())) {
                    auxP.setPerro1(mascotaadopt.get(i));
                    ctrol++;
                    mascotaadopt.remove(i);
                }
            }
            if (ctrol == 0) {
                System.out.println("No se ha adoptado un perro válido\n");
            }
        }

        System.out.println("");
        System.out.println("Las siguientes personas han adoptado:\n ");
        for (Persona auxP : personass) {
            if (auxP.getPerro1() == null) {
                System.out.println(auxP.getNombre() + " " + auxP.getApellido() + " no ha adoptado a ningun perro");
            } else {
                System.out.println(auxP.getNombre() + " " + auxP.getApellido() + " a adoptado a " + auxP.getPerro1().getNombre() + " de raza " + auxP.getPerro1().getRaza());
            }

        }
    }
}

/*
        
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
 */
