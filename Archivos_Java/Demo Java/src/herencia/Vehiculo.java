package herencia;
import java.util.Objects;
public abstract class Vehiculo {
    protected int capacidad;
    protected String matricula;
    protected String modelo;
    //-------------------------------
    public Vehiculo() {
    }
    //-------------------------------
    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }
    //-------------------------------
    public Vehiculo(int capacidad, String matricula, String modelo) {
        this.capacidad = capacidad;
        this.matricula = matricula;
        this.modelo = modelo;
    }
    //-------------------------------

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    //-------------------------------
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    //-------------------------------
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    //-------------------------------
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.matricula);
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
        final Vehiculo other = (Vehiculo) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }
    //-------------------------------
    public String toString() {
        return "Vehiculo{" + "capacidad=" + capacidad + ", matricula=" + matricula + ", modelo=" + modelo + '}';
    }
    //-------------------------------
}
