package Persona;
import java.util.Objects;
public abstract class Persona {
    protected String nombre;
    protected String id;
    protected int edad;
    //-------------------------------
    public Persona() {
        super();
    }
    //-------------------------------
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    //-------------------------------
    public Persona(String nombre, int edad, String id) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }
    //-------------------------------
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //-------------------------------
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    //-------------------------------
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    //-------------------------------
    public int hashCode() {
        int hash = 3;
        return hash;
    }
    //-------------------------------
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
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    //-------------------------------
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", id=" + id + '}';
    }
}