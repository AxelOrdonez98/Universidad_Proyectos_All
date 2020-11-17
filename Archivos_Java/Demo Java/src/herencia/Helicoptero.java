package herencia;
public final class Helicoptero extends Aereo {
    private int numeroDeHelices;
    private int alturaMaxima;
    //-------------------------------
    public Helicoptero() {
        super();
    }
    //-------------------------------
    public Helicoptero(String matricula) {
        super(matricula);
    }
    //-------------------------------
    public Helicoptero(int numeroDeHelices, int alturaMaxima, boolean helice, String tipoDeAvion, int capacidad, String matricula, String modelo) {
        super(helice, tipoDeAvion, capacidad, matricula, modelo);
        this.numeroDeHelices = numeroDeHelices;
        this.alturaMaxima = alturaMaxima;
    }
    //-------------------------------
    public int getNumeroDeHelices() {
        return numeroDeHelices;
    }

    public void setNumeroDeHelices(int numeroDeHelices) {
        this.numeroDeHelices = numeroDeHelices;
    }
    //-------------------------------
    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }
    //-------------------------------
    public String toString() {
        return super.toString() + "Helicoptero{" + "numeroDeHelices=" + numeroDeHelices + ", alturaMaxima=" + alturaMaxima + '}';
    }
    //-------------------------------
}
