package Examen;

import java.util.Scanner;

/**
 *
 * @author Axel Ordoñez
 */
public class Area {
    
    public static float base = 0;
    public static float altura = 0;
    public static float area = 0;

    public Area() {
    }

    public Area(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
    
    public void CalcularArea() {
        area = base * altura;
    }
}
