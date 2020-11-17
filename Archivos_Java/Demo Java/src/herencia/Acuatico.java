package herencia;
public abstract class Acuatico extends Vehiculo {
    protected boolean sumergible;
    protected String tamaño;
    //-------------------------------
    public Acuatico() {
        super();
    }
    //-------------------------------
    public Acuatico(String matricula) {
        super(matricula);
    }
    //-------------------------------
    public Acuatico(boolean sumergible, String tamaño, int capacidad, String matricula, String modelo) {
        super(capacidad, matricula, modelo);
        this.sumergible = sumergible;
        this.tamaño = tamaño;
    }
    //-------------------------------
    public boolean isSumergible() {
        return sumergible;
    }

    public void setSumergible(boolean sumergible) {
        this.sumergible = sumergible;
    }
    //-------------------------------
    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    //-------------------------------
    public String toString() {
        return super.toString() + "Acuatico{" + "sumergible=" + sumergible + ", tama\u00f1o=" + tamaño + '}';
    }
    //-------------------------------
}
