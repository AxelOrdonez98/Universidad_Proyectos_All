package productos;
public abstract class Congelados extends Productos {
    private String temperaturaMantenimientoCongelados;

    public Congelados() {
        super();
    }

    public Congelados(int lote) {
        super(lote);
    }

    public Congelados(String temperaturaMantenimientoCongelados) {
        this.temperaturaMantenimientoCongelados = temperaturaMantenimientoCongelados;
    }

    public String getTemperaturaMantenimientoCongelados() {
        return temperaturaMantenimientoCongelados;
    }

    public void setTemperaturaMantenimientoCongelados(String temperaturaMantenimientoCongelados) {
        this.temperaturaMantenimientoCongelados = temperaturaMantenimientoCongelados;
    }

    @Override
    public String toString() {
        return super.toString() + "Congelados{" + "temperaturaMantenimientoCongelados=" + temperaturaMantenimientoCongelados + '}';
    }
    
    
}
