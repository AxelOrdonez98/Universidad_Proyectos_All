package herencia;
public abstract class Aereo extends Vehiculo {
    protected boolean helice;
    protected String tipoDeAvion;
    //-------------------------------
    public Aereo() {
        super();
    }
    //-------------------------------
    public Aereo(String matricula) {
        super(matricula);
    }
    //-------------------------------
    public Aereo(boolean helice, String tipoDeAvion, int capacidad, String matricula, String modelo) {
        super(capacidad, matricula, modelo);
        this.helice = helice;
        this.tipoDeAvion = tipoDeAvion;
    }
    //-------------------------------
    public boolean isHelice() {
        return helice;
    }

    public void setHelice(boolean helice) {
        this.helice = helice;
    }
    //-------------------------------
    public String getTipoDeAvion() {
        return tipoDeAvion;
    }

    public void setTipoDeAvion(String tipoDeAvion) {
        this.tipoDeAvion = tipoDeAvion;
    }
    //-------------------------------
    public String toString() {
        return super.toString() + "Aereo{" + "helice=" + helice + ", tipoDeAvion=" + tipoDeAvion + '}';
    }
    //-------------------------------
}
