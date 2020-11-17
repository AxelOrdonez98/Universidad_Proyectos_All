package herencia;
public final class Avion extends Aereo {
    private int cantPasajeros;
    private boolean deViaje;
    //------------------------------
    public Avion() {
        super();
    }
    //-------------------------------
    public Avion(String matricula) {
        super(matricula);
    }
    //-------------------------------
    public Avion(int cantPasajeros, boolean deViaje, boolean helice, String tipoDeAvion, int capacidad, String matricula, String modelo) {
        super(helice, tipoDeAvion, capacidad, matricula, modelo);
        this.cantPasajeros = cantPasajeros;
        this.deViaje = deViaje;
    }
    //-------------------------------
    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }
    //-------------------------------
    public boolean isDeViaje() {
        return deViaje;
    }

    public void setDeViaje(boolean deViaje) {
        this.deViaje = deViaje;
    }
    //-------------------------------
    public String toString() {
        return super.toString() + "Avion{" + "cantPasajeros=" + cantPasajeros + ", deViaje=" + deViaje + '}';
    }
    //-------------------------------
}
