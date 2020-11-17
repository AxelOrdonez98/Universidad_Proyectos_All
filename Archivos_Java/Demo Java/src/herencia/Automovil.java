package herencia;
public final class Automovil extends Terrestre {
    private String motor;
    private boolean descapotable;
    //-------------------------------
    public Automovil() {
        super();
    }
    //-------------------------------
    public Automovil(String matricula) {
        super(matricula);
    }
    //-------------------------------
    public Automovil(String motor, boolean descapotable, int cantLlantas, String rodado, int capacidad, String matricula, String modelo) {
        super(cantLlantas, rodado, capacidad, matricula, modelo);
        this.motor = motor;
        this.descapotable = descapotable;
    }
    //-------------------------------
    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    //-------------------------------
    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }
    //-------------------------------
    public String toString() {
        return super.toString() + "Automovil{" + "motor=" + motor + ", descapotable=" + descapotable + '}';
    }
    //-------------------------------

}
