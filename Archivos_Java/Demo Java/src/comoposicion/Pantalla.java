package comoposicion;
public class Pantalla {
    private String resolucion;
    private String panel;
    private boolean touch;
    //--------------------------------
    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
    public String getresolucion() {
        return resolucion;
    }
    //--------------------------------
    public void setPanel(String panel) {
        this.panel = panel;
    }
    public String getPanel() {
        return panel;
    }
    //--------------------------------
    public void setTouch(boolean touch) {
        this.touch = touch;
    }
    public boolean getTouch() {
        return touch;
    }
    //--------------------------------
    
}
