package pedidos;
public class Cuenta {
    //--------------------------------------
    private double saldo;
    private String datosTarjeta;
    //--------------------------------------
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //--------------------------------------
    public String getDatosTarjeta() {
        return datosTarjeta;
    }

    public void setDatosTarjeta(String datosTarjeta) {
        this.datosTarjeta = datosTarjeta;
    }
    //--------------------------------------
    public void hacerPago(int productosCant) {
        
    }
    //--------------------------------------
}
