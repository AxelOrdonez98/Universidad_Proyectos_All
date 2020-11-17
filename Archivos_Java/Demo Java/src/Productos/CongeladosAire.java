package productos;
public final class CongeladosAire extends Congelados {
    private double nitrogeno;
    private double oxigeno;
    private double dioxidoCarbono;
    private double vaporAgua;

    public CongeladosAire() {
        super();
    }

    public CongeladosAire(double nitrogeno, double oxigeno, double dioxidoCarbono, double vaporAgua) {
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxidoCarbono = dioxidoCarbono;
        this.vaporAgua = vaporAgua;
    }

    public CongeladosAire(int lote) {
        super(lote);
    }

    public double getNitrogeno() {
        return nitrogeno;
    }

    public double getOxigeno() {
        return oxigeno;
    }

    public double getDioxidoCarbono() {
        return dioxidoCarbono;
    }

    public double getVaporAgua() {
        return vaporAgua;
    }

    public void setNitrogeno(double nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public void setOxigeno(double oxigeno) {
        this.oxigeno = oxigeno;
    }

    public void setDioxidoCarbono(double dioxidoCarbono) {
        this.dioxidoCarbono = dioxidoCarbono;
    }

    public void setVaporAgua(double vaporAgua) {
        this.vaporAgua = vaporAgua;
    }

    @Override
    public String toString() {
        return super.toString() + "CongeladosAire{" + "nitrogeno=" + nitrogeno + ", oxigeno=" + oxigeno + ", dioxidoCarbono=" + dioxidoCarbono + ", vaporAgua=" + vaporAgua + '}';
    }
    
    
}
