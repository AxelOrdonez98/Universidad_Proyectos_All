package productos;
public final class Frescos extends Productos {
    private String tipoProducto;
    
    public Frescos() {
        super();
    }

    public Frescos(int lote) {
        super(lote);
    }

    public Frescos(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    @Override
    public String toString() {
        return super.toString() + "Frescos{" + "tipoProducto=" + tipoProducto + '}';
    }
    
    
}
