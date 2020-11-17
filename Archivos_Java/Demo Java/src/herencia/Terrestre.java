package herencia;
public abstract class Terrestre extends Vehiculo{
    protected int cantLlantas;
    protected String rodado;
    //-------------------------------
    public Terrestre() {
        super();
    }
    //-------------------------------
    public Terrestre(String matricula) {
        super(matricula);
    }
    //-------------------------------
    public Terrestre(int cantLlantas, String rodado, int capacidad, String matricula, String modelo) {
        super(capacidad, matricula, modelo);
        this.cantLlantas = cantLlantas;
        this.rodado = rodado;
    }
    //-------------------------------
    public int getCantLlantas() {
        return cantLlantas;
    }

    public void setCantLlantas(int cantLlantas) {
        this.cantLlantas = cantLlantas;
    }
    //-------------------------------
    public String getRodado() {
        return rodado;
    }

    public void setRodado(String rodado) {
        this.rodado = rodado;
    }
    //-------------------------------
    public String toString() {
        return super.toString() + "Terrestre{" + "cantLlantas=" + cantLlantas + ", rodado=" + rodado + '}';
    }
    //-------------------------------
    
}
