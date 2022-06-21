
package Servicios;

import entidades.RevolverAgua;
import java.util.ArrayList;
import java.util.Scanner;


public class servis {
    
    RevolverAgua revolagua = new RevolverAgua();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
  public void llenarRevolver(){
        int random = (int) (Math.random()*10+1);
      ArrayList num = new ArrayList();
        System.out.println("Ingrese el valor de la posicion actual del agua");
       for (int i = 0; i <= 50; i++) {
          num=Math.random(revolagua);
           System.out.println(revolagua);
          
      }
      
          
       
          
      }
     
      
  }
  
  
    

