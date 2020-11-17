package tareaEstructura;
import java.util.Scanner;
public class Arreglo02 {
    private int [] matrix;
    private int [] matrix2;
    private int [] resul;
    private Scanner in;
    public void cargar() {
        matrix = new int [5];
        matrix2 = new int [5];
        in = new Scanner(System.in);
        System.out.println("-Ingrese los 4 valores positivos");
        for (int i = 1;i<matrix.length;i++) {
            System.out.print("Valor "+i+": ");
            matrix[i] = in.nextInt();
        }
        System.out.println("\n-Ingrese otros 4 valores positivos");
        for (int i = 1;i<matrix2.length;i++) {
            System.out.print("Valor "+i+": ");
            matrix2[i] = in.nextInt();
        }
    }
    public void suma() {
        resul = new int [5];
        for (int i = 1;i<resul.length;i++) {
            resul[i] = matrix[i] + matrix2[i];
        }
    }
    public void imprimir() {
        System.out.println("\n\tEl resultado de la suma por posiciones es:\n");
        for (int i = 1;i<resul.length;i++) {
            System.out.print(" " + resul[i] + " ");
        }
        System.out.println("\n");
    }
    public static void main(String args[]) {
        Arreglo02 Suma = new Arreglo02();
        Suma.cargar();
        Suma.suma();
        Suma.imprimir();
    }
}
