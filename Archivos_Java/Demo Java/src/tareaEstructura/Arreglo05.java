package tareaEstructura;
import java.util.Scanner;
public class Arreglo05 {
    private float [] arre;
    private Scanner in;
    private int num;
    public void nNumeros() {
        in = new Scanner(System.in);
        System.out.println("¿Cuantos numeros desea sumar?");
        System.out.print("Numeros a sumar: ");
        num = in.nextInt();
    }
    public void cargarSumaEImpresion() {
        arre = new float [num];
        int conta = 0;
        float acum = 0;
        System.out.println("Ingrese los valores de la suma");
        for (int i = 0;i<arre.length;i++) {
            conta++;
            System.out.print("valor "+conta+": ");
            arre[i] = in.nextFloat();
            acum+=arre[i];
        }
        System.out.println("La suma de los valores es: "+acum);
    }
    public static void main(String args[]) {
        Arreglo05 phi = new Arreglo05();
        phi.nNumeros();
        phi.cargarSumaEImpresion();
    }
}