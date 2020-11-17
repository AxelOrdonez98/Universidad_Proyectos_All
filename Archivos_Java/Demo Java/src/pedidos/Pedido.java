package pedidos;

import java.util.Objects;

public abstract class Pedido {
    //--------------------------------------
    protected boolean estatus;
    protected int totalPedido;
    protected Cliente clientes;
    protected Producto[] productos;
    protected Cuenta[] cuentas;
    protected String fecha;
    //--------------------------------------
    public Pedido() {
    }
    //--------------------------------------
    public Pedido(boolean estatus, int totalPedido, Cliente clientes, Producto[] productos, Cuenta[] cuentas, String fecha) {
        this.estatus = estatus;
        this.totalPedido = totalPedido;
        this.clientes = clientes;
        this.productos = productos;
        this.cuentas = cuentas;
        this.fecha = fecha;
    }
    //--------------------------------------
    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    //--------------------------------------
    public int getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(int totalPedido) {
        this.totalPedido = totalPedido;
    }

    //--------------------------------------
    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    //--------------------------------------
    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    //--------------------------------------
    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    //--------------------------------------
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    //--------------------------------------
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.clientes);
        return hash;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pedido other = (Pedido) obj;
        if (!Objects.equals(this.clientes, other.clientes)) {
            return false;
        }
        return true;
    }

    //--------------------------------------
    public String toString() {
        return "Pedido{" + "estatus=" + estatus + ", totalPedido=" + totalPedido + ", clientes=" + clientes + ", productos=" + productos + ", cuentas=" + cuentas + ", fecha=" + fecha + '}';
    }
    //--------------------------------------
    public boolean validacionCobrar() {
        return false;
    }
    //--------------------------------------
    public void validacionPedido() {
        
    }
    //--------------------------------------
    public void obtenerTotalPedido() {
        
    }
    //--------------------------------------
    public boolean añadir(int añadirProductos) {
        return false;
    }
    //--------------------------------------
    public void obtenerCuenta() {
        
    }
    //--------------------------------------
    public boolean saldoSuficiente() {
        return false;
    }
    //--------------------------------------
    public void numeroDePedidos() {
        
    }
    //--------------------------------------
    
}
