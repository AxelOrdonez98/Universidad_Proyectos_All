package pedidos;
public class Producto {
    //--------------------------------------
    private int cantidadDeStock;
    private String nombreProducto;
    private int precioProducto;
    //--------------------------------------
    public int getCantidadDeStock() {
        return cantidadDeStock;
    }

    public void setCantidadDeStock(int cantidadDeStock) {
        this.cantidadDeStock = cantidadDeStock;
    }
    //--------------------------------------
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    //--------------------------------------
    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }
    //--------------------------------------
    public void nuevoStock(int totalStock) {
        
    }
}
