package pedidos;
public final class PedidoCompuesto extends Pedido {
    //--------------------------------------
    public PedidoCompuesto() {
        super();
    }
    //--------------------------------------
    public PedidoCompuesto(boolean estatus, int totalPedido, Cliente clientes, Producto[] productos, Cuenta[] cuentas, String fecha) {
        super(estatus, totalPedido, clientes, productos, cuentas, fecha);
    }
    //--------------------------------------
    public void obtenerTotalPedido() {
        
    }
    //--------------------------------------
    public void añadirPedido() {
        
    }
    //--------------------------------------
    public void eliminarPedido() {
        
    }
    //--------------------------------------
    public boolean cobrar() {
        return false;
    }
    //--------------------------------------

    @Override
    public String toString() {
        return  super.toString()+"PedidoCompuesto{" + '}';
    }
    
}
