package productos;
public final class Refrigerados extends Productos {
    protected String codigoSupervicionAlimentaria;
    protected String temperaturaMantenimientoRefrigerados;

    public Refrigerados() {
        super();
    }

    public Refrigerados(String codigoSupervicionAlimentaria, String temperaturaMantenimientoRefrigerados) {
        this.codigoSupervicionAlimentaria = codigoSupervicionAlimentaria;
        this.temperaturaMantenimientoRefrigerados = temperaturaMantenimientoRefrigerados;
    }

    public Refrigerados(int lote) {
        super(lote);
    }

    public String getCodigoSupervicionAlimentaria() {
        return codigoSupervicionAlimentaria;
    }

    public String getTemperaturaMantenimientoRefrigerados() {
        return temperaturaMantenimientoRefrigerados;
    }

    public void setCodigoSupervicionAlimentaria(String codigoSupervicionAlimentaria) {
        this.codigoSupervicionAlimentaria = codigoSupervicionAlimentaria;
    }

    public void setTemperaturaMantenimientoRefrigerados(String temperaturaMantenimientoRefrigerados) {
        this.temperaturaMantenimientoRefrigerados = temperaturaMantenimientoRefrigerados;
    }

    @Override
    public String toString() {
        return super.toString() + "Refrigerados{" + "codigoSupervicionAlimentaria=" + codigoSupervicionAlimentaria + ", temperaturaMantenimientoRefrigerados=" + temperaturaMantenimientoRefrigerados + '}';
    }
}
