package entidades;

public class Jugador {

    private int id;
    private String nombre;
    private boolean turno;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "nombre: " + id;
        this.turno = true;
    }

    public void mojar(RevolverAgua r) {
        System.out.println("Turno de " + nombre + "-> DISPARA!!");
        if (r.mojar()) {
            this.turno = false;
            System.out.println("El " + nombre + " ha fallado");
        } else {
            System.out.println("El " + nombre + " <MUERTO!> ");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

}
