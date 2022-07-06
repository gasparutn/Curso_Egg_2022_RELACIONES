/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de
asientos (8 filas por 6 columnas). De Cine nos interesa conocer la película que 
se está reproduciendo, la sala con los espectadores y el precio de la entrada.
 */
package entidades;

public class CineSala {

    private int fila;
    private int columna;
    private String[][] sala;

    public CineSala(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.sala = new String[fila + 1][columna + 1];
    }

    public void llenarsala() {

        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[0].length; j++) {
                if (i == 0 && j == 0)sala[i][j] = " ";
             else if (i == 0)sala[i][j] = String.valueOf(j);
             else if (j == 0)sala[i][j] = String.valueOf(i); 
             else sala[i][j] = "D";
                
            }
        }
    }
       
    public void versala() {
      System.out.println("\nSala de cine: \n");
      for (String[] asientos : sala) {
      for (int j = 0; j < sala[0].length; j++) {
                System.out.print(asientos[j] + " ");

            }
            System.out.println("\n");
        }

    }
 
        
}


  
