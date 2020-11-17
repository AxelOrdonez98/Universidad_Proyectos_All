package productos;
public abstract class Productos {
    protected String fechaCaducidad;
    protected int lote;
    protected String paisOrigen;
    protected String fechaEnvasado;

    public Productos() {
    }

    public Productos(int lote) {
        this.lote = lote;
    }

    public Productos(String fechaCaducidad, int lote, String paisOrigen, String fechaEnvasado) {
        this.fechaCaducidad = fechaCaducidad;
        this.lote = lote;
        this.paisOrigen = paisOrigen;
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public int getLote() {
        return lote;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.lote;
        return hash;
    }

    @Override
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
        final Productos other = (Productos) obj;
        if (this.lote != other.lote) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Productos{" + "fechaCaducidad=" + fechaCaducidad + ", lote=" + lote + ", paisOrigen=" + paisOrigen + ", fechaEnvasado=" + fechaEnvasado + '}';
    }
    
}
