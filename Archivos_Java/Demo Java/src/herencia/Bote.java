package herencia;
public final class Bote extends Acuatico {
    private boolean tieneVela;
    private String material;
    //-------------------------------
    public Bote() {
        super();
    }
    //-------------------------------
    public Bote(String matricula) {
        super(matricula);
    }
    //-------------------------------
    public Bote(boolean tieneVela, String material, boolean sumergible, String tamaño, int capacidad, String matricula, String modelo) {
        super(sumergible, tamaño, capacidad, matricula, modelo);
        this.tieneVela = tieneVela;
        this.material = material;
    }
    //-------------------------------
    public boolean isTieneVela() {
        return tieneVela;
    }

    public void setTieneVela(boolean tieneVela) {
        this.tieneVela = tieneVela;
    }
    //-------------------------------
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    //-------------------------------
    public String toString() {
        return super.toString() + "Bote{" + "tieneVela=" + tieneVela + ", material=" + material + '}';
    }
    //-------------------------------
}
