package funcionesEstructura;
import java.util.Scanner;
public class Matrizes {
    private float [][] matrix1;
    private float [][] matrix2;
    private float [][] matrixResultado;
    private int opc;
    private Scanner in;
    //-------------------------------------------------------------------
    public void scaner() {
        in = new Scanner(System.in);
        matrix1 = new float [3][3];
        matrix2 = new float [3][3];
        System.out.println("\n\tIngrese los valores de la primera matriz:\n");
        for ( int i = 0;i<matrix1.length;i++) {
            for (int f = 0;f<matrix1[i].length;f++) {
                System.out.print("Ingrese los valores de la matriz ["+i+" , "+f+"]: ");
                 matrix1[i][f] = in.nextInt();
            }
        }
        System.out.println("\n\tIngrese los valores de la segunda matriz:\n");
        for ( int i = 0;i<matrix2.length;i++) {
            for (int f = 0;f<matrix2[i].length;f++) {
                System.out.print("Ingrese los valores de la matriz ["+i+" , "+f+"]: ");
                matrix2[i][f] = in.nextInt();
            }
        }
    }
    //-------------------------------------------------------------------
    public void sumaMatriz() {
        matrixResultado = new float [3][3];
        for (int i = 0;i<3;i++) {
            for (int f = 0;f<3;f++) {
                matrixResultado[i][f] = matrix1[i][f] + matrix2[i][f];
            }
        }
        System.out.println("\nEL RESULTADO DE LA SUMA DE MATRIZES ES:\n");
        for ( int i = 0;i<3;i++) {
            for (int f = 0;f<3;f++) {
                System.out.print(" "+matrixResultado[i][f] + " ");
            }
            System.out.println();
        }
        System.out.println("");
    }
    //-------------------------------------------------------------------
    public void restaMatriz() {
        matrixResultado = new float [3][3];
        for (int i = 0;i<3;i++) {
            for (int f = 0;f<3;f++) {
                matrixResultado[i][f] = matrix1[i][f] - matrix2[i][f];
            }
        }
        System.out.println("\nEL RESULTADO DE LA RESTA DE MATRIZES ES:\n");
        for ( int i = 0;i<3;i++) {
            for (int f = 0;f<3;f++) {
                System.out.print(" "+matrixResultado[i][f] + " ");
            }
            System.out.println("");
        }
        System.out.println();
    }
    //-------------------------------------------------------------------
    public void matrizMulti() {
        float ope, acum;
        System.out.println("\nEL RESULTADO DE LA MULTIPLICACION DE MATRIZES ES:\n");
        for (int z = 0;z<3;z++) {
            for (int y = 0;y<3;y++) {
                acum = 0;
                for (int x = 0;x<3;x++) {
                    ope = 0;
                    ope = matrix1[z][x] * matrix2[x][y];
                    acum += ope;
                }
                System.out.print(" "+ acum + " ");
            }
            System.out.println();
        }
        System.out.println("");
    }
    //-------------------------------------------------------------------
    
    //-------------------------------------------------------------------
    public void opciones() {
        in = new Scanner(System.in);
        Matrizes phi = new Matrizes();
        do {
            System.out.println("\t\tCALCULADORA DE MATRICES");
            System.out.println("ELIJA UNA OPCION");
            System.out.println("0)Salir");
            System.out.println("1)Suma");
            System.out.println("2)Resta");
            System.out.println("3)Multiplicacion");
            System.out.print("Opcion: ");
            opc = in.nextInt();
            switch (opc) {
                case 1 :
                    phi.scaner();
                    phi.sumaMatriz();
                    break;
                case 2 :
                    phi.scaner();
                    phi.restaMatriz();
                    break;
                case 3 :
                    phi.scaner();
                    phi.matrizMulti();
                    break;
            }
        } while (opc != 0);
        System.out.println("Adios");
    }
    //-------------------------------------------------------------------
    public static void main(String args[]) {
        Matrizes pi = new Matrizes();
        pi.opciones();
    }
}