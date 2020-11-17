package Persona;
public final class Portero extends Jugador {
    private int numeroDeAtajadas;
    private boolean elastico;
    //-------------------------------
    public Portero() {
        super();
    }
    //-------------------------------
    public Portero(int numeroDeAtajadas, boolean elastico) {
        this.numeroDeAtajadas = numeroDeAtajadas;
        this.elastico = elastico;
    }
    //-------------------------------
    public int getNumeroDeAtajadas() {
        return numeroDeAtajadas;
    }
    public void setNumeroDeAtajadas(int numeroDeAtajadas) {
        this.numeroDeAtajadas = numeroDeAtajadas;
    }
    //-------------------------------
    public boolean isElastico() {
        return elastico;
    }
    public void setElastico(boolean elastico) {
        this.elastico = elastico;
    }
    //-------------------------------
    public String toString() {
        return super.toString() + "Portero{" + "numeroDeAtajadas=" + numeroDeAtajadas + ", elastico=" + elastico + '}';
    }
}