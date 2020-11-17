package herencia;
public final class Submarino extends Acuatico {
    private double profundida;
    private boolean privado;
    //-------------------------------
    public Submarino() {
        super();
    }
    //-------------------------------
    public Submarino(String matricula) {
        super(matricula);
    }
    //-------------------------------
    public Submarino(double profundida, boolean privado, boolean sumergible, String tamaño, int capacidad, String matricula, String modelo) {
        super(sumergible, tamaño, capacidad, matricula, modelo);
        this.profundida = profundida;
        this.privado = privado;
    }
    //-------------------------------
    public double getProfundida() {
        return profundida;
    }

    public void setProfundida(double profundida) {
        this.profundida = profundida;
    }
    //-------------------------------
    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }
    //-------------------------------
    public String toString() {
        return super.toString() + "Submarino{" + "profundida=" + profundida + ", privado=" + privado + '}';
    }
    //-------------------------------
}
