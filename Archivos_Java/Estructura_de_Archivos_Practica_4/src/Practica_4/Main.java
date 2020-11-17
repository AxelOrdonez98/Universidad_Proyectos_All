package Practica_4;

import java.util.Scanner;

public class Main {

    public float valor1 = 0;
    public float valor2 = 0;
    public float resultado = 0;

    public static void main(String args[]) {
        Calculadora xi = new Calculadora();
        Scanner in = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.print("Seleccione una opcion \n0)Salir\n1)Suma\n2)Resta\n3)Multiplicacion\n4)Division\nOpcion: ");
            opc = in.nextInt();
            switch (opc) {
                case 1:
                    xi.Suma();
                    break;
                case 2:
                    xi.Resta();
                    break;
                case 3:
                    xi.Multiplicacion();
                    break;
                case 4:
                    xi.Division();
                    break;
                default:
                    break;
            }
        } while (opc != 0);
        System.out.println("Adios");
    }
}
