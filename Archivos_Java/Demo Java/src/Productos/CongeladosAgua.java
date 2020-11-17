package productos;
public final class CongeladosAgua extends Congelados {
    private double salxAgua;

    public CongeladosAgua() {
        super();
    }

    public CongeladosAgua(double salxAgua) {
        this.salxAgua = salxAgua;
    }

    public CongeladosAgua(int lote) {
        super(lote);
    }

    public double getSalxAgua() {
        return salxAgua;
    }

    public void setSalxAgua(double salxAgua) {
        this.salxAgua = salxAgua;
    }

    @Override
    public String toString() {
        return super.toString() + "CongeladosAgua{" + "salxAgua=" + salxAgua + '}';
    }
    
    
}
