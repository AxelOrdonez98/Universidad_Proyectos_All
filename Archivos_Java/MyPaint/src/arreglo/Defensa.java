package Persona;
public final class Defensa extends Jugador {
    private boolean titular;
    private boolean resistenciaAGolpes;
    //-------------------------------
    public Defensa() {
        super();
    }
    //-------------------------------
    public Defensa(boolean titular, boolean resistenciaAGolpes) {
        this.titular = titular;
        this.resistenciaAGolpes = resistenciaAGolpes;
    }
    //-------------------------------
    public boolean isTitular() {
        return titular;
    }
    public void setTitular(boolean titular) {
        this.titular = titular;
    }
    //-------------------------------
    public boolean isResistenciaAGolpes() {
        return resistenciaAGolpes;
    }
    public void setResistenciaAGolpes(boolean resistenciaAGolpes) {
        this.resistenciaAGolpes = resistenciaAGolpes;
    }
    //-------------------------------
    public String toString() {
        return super.toString() + "Defensa{" + "titular=" + titular + ", resistenciaAGolpes=" + resistenciaAGolpes + '}';
    }
}