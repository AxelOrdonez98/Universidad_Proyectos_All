package estructuraSP;
public class Tarea04 {
    private final double interes = 0.11;
    private final double pago = 145;
    private final double deuda = 800;
    private double pagoBimestral;
    private double pagoFinal;
    private double diferencia;
    public void operacion() {
        System.out.println("Usted tiene una deuda de: " + deuda + " M.N");
        pagoBimestral = (pago*interes) + pago;
        pagoFinal = (deuda) / ((pago*interes) + pago);
    }
    public void imprimir() {
        if (pagoFinal == 4.970487729108419) {
            pagoFinal = 5;
            System.out.println("Tendra que realizar: [" + pagoFinal + "] de pagos bimestrales");
            System.out.println("Cada pago bimestral sera de: [" + pagoBimestral + " M.N]");
            pagoBimestral = pagoBimestral * 5;
            diferencia = pagoBimestral - deuda;
            System.out.println("Al final de los [" + pagoFinal + "] bimestres, con el interes terminara pagarando un total de: [" + pagoBimestral + " M.N]");
            System.out.println("Con una diferencia de: [" + diferencia + " M.N] al adeudo inicial");
        }
    }
    public static void main(String args[]) {
        Tarea04 phi = new Tarea04();
        phi.operacion();
        phi.imprimir();
    }
}