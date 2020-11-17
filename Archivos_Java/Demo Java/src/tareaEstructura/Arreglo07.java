package tareaEstructura;
import java.util.*;
public class Arreglo07 {
    private int [] arre;
    private int n;
    private Scanner in;
    public void cargar() {
        in = new Scanner(System.in);
        System.out.print("Ingrese un limite: ");
        n = in.nextInt();
    }
    public void valores() {
        arre = new int [n];
        int acomodo = 0;
        for (int i = 0;i<arre.length;i++) {
            acomodo++;
            System.out.print("Numero "+acomodo+": ");
            arre[i] = in.nextInt();
        }
    }
    public void acomodoEImpresion() {
        Arrays.sort(arre);
        System.out.println("\tEL ACOMODO DE MENOR A MAYOR");
        for(int i = 0;i<arre.length;i++) {
            System.out.println("Acomodo: "+arre[i]);
        }
    }
    public static void main(String args[]) {
        Arreglo07 phi = new Arreglo07();
        phi.cargar();
        phi.valores();
        phi.acomodoEImpresion();
    }
}