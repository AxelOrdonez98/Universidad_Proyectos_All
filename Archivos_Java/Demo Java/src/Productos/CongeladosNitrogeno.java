package productos;
public final class CongeladosNitrogeno extends Congelados {
    private String metodoCongelacion;
    private double tiempoExposicion;

    public CongeladosNitrogeno() {
        super();
    }

    public CongeladosNitrogeno(String metodoCongelacion, double tiempoExposicion) {
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    public CongeladosNitrogeno(int lote) {
        super(lote);
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public double getTiempoExposicion() {
        return tiempoExposicion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public void setTiempoExposicion(double tiempoExposicion) {
        this.tiempoExposicion = tiempoExposicion;
    }

    @Override
    public String toString() {
        return super.toString() + "CongeladosNitrogeno{" + "metodoCongelacion=" + metodoCongelacion + ", tiempoExposicion=" + tiempoExposicion + '}';
    }
    
    
}
