package comoposicion;
public class Teclado {
    private String tipoDeSwitch;
    private boolean extendido;
    private boolean nocturno;
    //--------------------------------
    public void setTipoDeSwitch(String tipoDeSwitch) {
        this.tipoDeSwitch = tipoDeSwitch;
    }
    public String getTipoDeSwitch() {
        return tipoDeSwitch;
    }
    //--------------------------------
    public void setExtendido(boolean extendido) {
        this.extendido = extendido;
    }
    public boolean getExtendido() {
        return extendido;
    }
    //--------------------------------
    public void setNocturno(boolean nocturno) {
        this.nocturno = nocturno;
    }
    public boolean getNocturno() {
        return nocturno;
    }
    //--------------------------------
}
