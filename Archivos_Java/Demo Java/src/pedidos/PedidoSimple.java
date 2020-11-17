package pedidos;
public final class PedidoSimple extends Pedido {
    //--------------------------------------
    public void obtenerTotalPedido() {
        
    }
    //--------------------------------------
    public PedidoSimple() {
        super();
    }
    //--------------------------------------
    public PedidoSimple(boolean estatus, int totalPedido, Cliente clientes, Producto[] productos, Cuenta[] cuentas, String fecha) {
        super(estatus, totalPedido, clientes, productos, cuentas, fecha);
    }
    //--------------------------------------

    @Override
    public String toString() {
        return super.toString()+"PedidoSimple{" + '}';
    }
    
}