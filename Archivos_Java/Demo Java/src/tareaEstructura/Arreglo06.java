package tareaEstructura;
import java.util.*;
public class Arreglo06 {
    private int [] arre;
    private int n;
    private Scanner in;
    public void nNumeros() {
        in = new Scanner(System.in);
        System.out.print("Cuantos numeros desea ingresar?: ");
        n = in.nextInt();
    }
    public void valores() {
        int conta = 0;
        arre = new int [n];
        for (int i = 0;i<arre.length;i++) {
            conta++;
            System.out.print("Valor "+conta+": ");
            arre[i] = in.nextInt();
        }
    }
    public void validarArregloImprimir() {
        Arrays.sort(arre);
        System.out.println("El numero menor es: "+arre[0]);
        for (int i = 0;i<arre.length;i++){
            if(arre[0] == arre[1]) {
                System.out.println("Los numeros se repiten");
                break;
            }
            System.out.println("No se repite");
            break;
        }
    }
    public static void main(String args[]) {
        Arreglo06 phi = new Arreglo06();
        phi.nNumeros();
        phi.valores();
        phi.validarArregloImprimir();
    }
}
