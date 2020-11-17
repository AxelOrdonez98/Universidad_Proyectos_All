package Persona;
public final class Delantero extends Jugador {
    private int numeroDeGoles;
    private boolean fintas;
    //-------------------------------
    public Delantero() {
        super();
    }
    //-------------------------------
    public Delantero(int numeroDeGoles, boolean fintas) {
        this.numeroDeGoles = numeroDeGoles;
        this.fintas = fintas;
    }
    //-------------------------------
    public int getNumeroDeGoles() {
        return numeroDeGoles;
    }
    public void setNumeroDeGoles(int numeroDeGoles) {
        this.numeroDeGoles = numeroDeGoles;
    }
    //-------------------------------
    public boolean isFintas() {
        return fintas;
    }
    public void setFintas(boolean fintas) {
        this.fintas = fintas;
    }
    //-------------------------------
    public String toString() {
        return super.toString() + "Delantero{" + "numeroDeGoles=" + numeroDeGoles + ", fintas=" + fintas + '}';
    }
}