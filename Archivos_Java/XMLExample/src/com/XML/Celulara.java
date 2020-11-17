package com.XML;

/**
 *
 * @author Axel
 */
public class Celulara {

    private int id;
    private String nombreCel;
    private String year;

    public Celulara() {
    }

    public Celulara(int id, String nombreCel, String year) {
        this.id = id;
        this.nombreCel = nombreCel;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombreCel;
    }

    public void setNombre(String nombreCel) {
        this.nombreCel = nombreCel;
    }

    public String getApellido() {
        return year;
    }

    public void setApellido(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Ddtech{" + "Stock = " + id + ", Marca = " + nombreCel + ", Year = " + year + '}';
    }

}
