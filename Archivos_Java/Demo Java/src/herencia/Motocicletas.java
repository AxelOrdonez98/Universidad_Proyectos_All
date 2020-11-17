package herencia;
public final class Motocicletas extends Terrestre {
    private String tipoDeTranmision;
    private String tipoDeMoto;
    //-------------------------------
    public Motocicletas() {
        super();
    }
    //-------------------------------
    public Motocicletas(String matricula) {
        super(matricula);
    }
    //-------------------------------
    public Motocicletas(String tipoDeTranmision, String tipoDeMoto, int cantLlantas, String rodado, int capacidad, String matricula, String modelo) {
        super(cantLlantas, rodado, capacidad, matricula, modelo);
        this.tipoDeTranmision = tipoDeTranmision;
        this.tipoDeMoto = tipoDeMoto;
    }
    //-------------------------------
    public String getTipoDeTranmision() {
        return tipoDeTranmision;
    }

    public void setTipoDeTranmision(String tipoDeTranmision) {
        this.tipoDeTranmision = tipoDeTranmision;
    }
    //-------------------------------
    public String getTipoDeMoto() {
        return tipoDeMoto;
    }

    public void setTipoDeMoto(String tipoDeMoto) {
        this.tipoDeMoto = tipoDeMoto;
    }
    //-------------------------------
    public String toString() {
        return super.toString() + "Motocicletas{" + "tipoDeTranmision=" + tipoDeTranmision + ", tipoDeMoto=" + tipoDeMoto + '}';
    }
    //-------------------------------
}
