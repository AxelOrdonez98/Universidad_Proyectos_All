package comoposicion;
import java.util.Objects;

public class Computadora {
    private String color;
    private String id;
    private Pantalla pantalla;
    private Teclado teclado;
    private Procesador procesador;
    //--------------------------------
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    //--------------------------------
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    //--------------------------------
    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }
    public Pantalla getPantalla() {
        return pantalla;
    }
    //--------------------------------
    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }
    public Teclado getTeclado() {
        return teclado;
    }
    //--------------------------------
    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }
    public Procesador getProcesador() {
        return procesador;
    }
    //--------------------------------
    public int hashCode() {
        int hash = 3;
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
        final Computadora other = (Computadora) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    //--------------------------------
}
