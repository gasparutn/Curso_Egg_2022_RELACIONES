package entidades;

import Servicios.servis;

public class RevolverAgua {

    private int posicactual;
    private int positambor;

    public RevolverAgua() {
        posicactual = servis.llenaaleatorios(1, 6);
        positambor = servis.llenaaleatorios(1, 6);
    }

    public boolean mojar() {
        boolean blanco = false;
        if (posicactual == positambor) {

            blanco = true;
        }
        siguientechorro();

        return blanco;
    }

    public void siguientechorro() {
        if (posicactual == 6) {
            posicactual = 1;

        } else {
            posicactual++;
        }

    }

    @Override
    public String toString() {
        return "RevolverAgua{" + "posicactual= " + posicactual + ", positambor= " + positambor + '}';
    }

}
