package Servicios;

import entidades.RevolverAgua;
import java.util.Scanner;

public class servis {

    RevolverAgua revagua = new RevolverAgua();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static int llenaaleatorios(int minimo, int maximo) {

        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));

        return num;
    }

}
