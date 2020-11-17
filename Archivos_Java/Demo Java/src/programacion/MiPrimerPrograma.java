/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;
import java.util.Scanner;
/**
 *
 * @author solda
 */
public class MiPrimerPrograma {
    public static void main(String args[]) {
         //antes del igual es referencia, lo que esta despues del igual es objeto
        Scanner teclado = new Scanner(System.in);
        int n1,n2,resultado;
        //Entrada de datos
        System.out.println("Introduce un numero: ");
        n1 = teclado.nextInt();
        System.out.println("Introduce otro numero: ");
        n2 = teclado.nextInt();
        //Proceso
        resultado = n1 + n2;
        //Salida de datos
        System.out.println("Tu resultado es: " + resultado + " De sumar " + n1 + "+" + n2);
    } 
}
