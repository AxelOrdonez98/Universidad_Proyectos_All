package Persona;
public final class Arbitro extends Persona {
    private int yearsDeArbitro;
    private String nacionalidad;
    //-------------------------------
    public Arbitro() {
        super();
    }
    //-------------------------------
    public Arbitro(int yearsDeArbitro, String nacionalidad) {
        this.yearsDeArbitro = yearsDeArbitro;
        this.nacionalidad = nacionalidad;
    }
    //-------------------------------
    public int getYearsDeArbitro() {
        return yearsDeArbitro;
    }
    public void setYearsDeArbitro(int yearsDeArbitro) {
        this.yearsDeArbitro = yearsDeArbitro;
    }
    //-------------------------------
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    //-------------------------------
    public String toString() {
        return super.toString() + "Arbitro{" + "yearsDeArbitro=" + yearsDeArbitro + ", nacionalidad=" + nacionalidad + '}';
    }
    //-------------------------------
}