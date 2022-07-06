package relacc_ejercext02;


import Servicios.cartelera;
import entidades.CineSala;
import java.util.Scanner;

public class Main {

   

    public static void main(String[] args) {
Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String menu = 
                  "\n 1) Ver asientos\n"
                + " 2) Ver Cartelera\n"
                + " 3) Comprar\n"
                + " 4) Salir";

        CineSala C = new CineSala(8, 6);
        C.llenarsala();
        int opcion;
        do {

            System.out.println(menu);
            opcion= leer.nextInt();
            switch (opcion) {
                case 1:
                    C.versala();
                case 2:
                    cartelera.valueOf(menu);
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("opcion incorrecta");
                    break;

            }
        } while (opcion != 4);
    }
}
