package Persona;
public abstract class Jugador extends Persona{
    protected String nombreDelEquipo;
    protected int numeroDeJugador;
    //-------------------------------
    public Jugador() {
        super();
    }
    //-------------------------------
    public Jugador(String nombreDelEquipo, int numeroDeJugador) {
        this.nombreDelEquipo = nombreDelEquipo;
        this.numeroDeJugador = numeroDeJugador;
    }
    //-------------------------------
    public String getNombreDelEquipo() {
        return nombreDelEquipo;
    }

    public void setNombreDelEquipo(String nombreDelEquipo) {
        this.nombreDelEquipo = nombreDelEquipo;
    }
    //-------------------------------
    public int getNumeroDeJugador() {
        return numeroDeJugador;
    }

    public void setNumeroDeJugador(int numeroDeJugador) {
        this.numeroDeJugador = numeroDeJugador;
    }
    //-------------------------------
    public String toString() {
        return super.toString() + "Jugador{" + "nombreDelEquipo=" + nombreDelEquipo + ", numeroDeJugador=" + numeroDeJugador + '}';
    }
}