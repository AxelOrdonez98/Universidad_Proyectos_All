package Examen;

import java.util.Scanner;
/**
 *
 * @author Axel Ordoñez
 */
public class Main {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\t\tCotizacion de Mesa");
        System.out.println("EL PRECIO POR METRO CUADRADO ES DE 100$");
        System.out.print("Ingrese la base: ");
        float base = in.nextFloat();
        System.out.print("Ingrese la altura: ");
        float altura = in.nextFloat();
        Area xi = new Area(base, altura);
        xi.CalcularArea();
        System.out.println("Precio de la mesa: " + Costo.Costos());
    }
    
}