package Persona;
public final class Entrenador extends Persona {
    private String conocimiento;
    private boolean motivacion;
    //-------------------------------
    public Entrenador() {
        super();
    }
    //-------------------------------
    public Entrenador(String conocimiento, boolean motivacion) {
        this.conocimiento = conocimiento;
        this.motivacion = motivacion;
    }
    //-------------------------------
    public String getConocimiento() {
        return conocimiento;
    }
    public void setConocimiento(String conocimiento) {
        this.conocimiento = conocimiento;
    }
    //-------------------------------
    public boolean isMotivacion() {
        return motivacion;
    }
    public void setMotivacion(boolean motivacion) {
        this.motivacion = motivacion;
    }
    //-------------------------------
    public String toString() {
        return super.toString() + "Entrenador{" + "conocimiento=" + conocimiento + ", motivacion=" + motivacion + '}';
    }
    //-------------------------------
}