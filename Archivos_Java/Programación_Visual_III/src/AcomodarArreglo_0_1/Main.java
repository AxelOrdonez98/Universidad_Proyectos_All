package AcomodarArreglo_0_1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 *
 * @author solda
 */
public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Main f = new Main();
        int opc = 0;
        do {
            System.out.print("\n0)Salir\n1)Modo automatico\n2)Manual\nSeleccione una opcion: ");
            opc = in.nextInt();
            switch (opc) {
                case 1:
                    f.limpiar();
                    f.automatico();
                    break;
                case 2:
                    f.limpiar();
                    f.usuario();
            }
        } while (opc != 0);
        System.out.println("=====================================");
        System.out.println("\tAdios");
        System.out.println("=====================================");
    }

    public void automatico() {
        int ar[] = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
        System.out.println("=====================================");
        for (int i = 0; i < ar.length; i++) {
            System.out.println("\tArreglo sin acomo dar: " + ar[i]);
        }
        System.out.println("=====================================");
        String orden0 = "";
        String orden1 = "";
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 0) {
                orden0 += ar[i] + ",";
            } else {
                orden1 += ar[i] + ",";
            }
        }
        System.out.println("cadena ordenada: " + orden0 + orden1);
        System.out.println("=====================================");
    }

    public void usuario() {
        Scanner in = new Scanner(System.in);
        String numerosEn0 = "", numerosEn1 = "";
        int tamano = 0;
        System.out.print("Ingrese el tamaño de la cadena: ");
        tamano = in.nextInt();
        int ar[] = new int[tamano];
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Ingrese solo 1 o 0: ");
            ar[i] = in.nextInt();
            if (ar[i] != 0 && ar[i] != 1) {
                System.out.println("numero invalido, solo 1 y 0");
                System.out.print("Ingrese de nuevo: ");
                ar[i] = in.nextInt();
            }
        }
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 0) {
                numerosEn0 += ar[i] + ",";
            } else {
                numerosEn1 +=  "," +ar[i];
            }
        }
        System.out.println("=====================================");
        System.out.println("cadena ordenada: " + numerosEn0 + numerosEn1);
        System.out.println("=====================================");
    }

    public void limpiar() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
