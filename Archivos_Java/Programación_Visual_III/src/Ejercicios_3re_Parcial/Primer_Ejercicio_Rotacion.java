package Ejercicios_3re_Parcial;

import java.util.Scanner;

/**
 *
 * @author Axel Ordoñez
 */
public class Primer_Ejercicio_Rotacion {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int tamaño, rot;
        System.out.print("ingrese el tamaño del arreglo: ");
        tamaño = in.nextInt();
        int ar[] = new int[tamaño];
        int espatula[] = new int[tamaño];
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Ingrese un numero en la posicion " + i + ": ");
            ar[i] = in.nextInt();
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println("\tEl arreglo quedo acomodado: " + ar[i]);
        }
        System.out.print("ingrese las veces que dea rotar: ");
        rot = in.nextInt();
        for (int i = rot; i < ar.length - 1; i--) {
            System.err.print(ar[i]);
            espatula[i] = ar[i];
            if (i >= 0) {
                break;
            }
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println("\tEl arreglo quedo acomodado: " + espatula[i]);
        }
    }
}
