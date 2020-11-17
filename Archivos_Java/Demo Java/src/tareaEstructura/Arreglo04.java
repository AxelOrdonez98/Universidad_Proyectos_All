package tareaEstructura;
import java.util.Scanner;
public class Arreglo04 {
    private Scanner in;
    private int [] arre;
    public void carga() {
        arre = new int [11];
        in = new Scanner(System.in);
        System.out.println("Ingrese 10 valores");
        for(int x = 1;x<arre.length;x++) {
            System.out.print("Valor "+x+": ");
            arre[x] = in.nextInt();
        }
    }
    public void verificacion() {
        for (int x=1;x<arre.length;x++) {
            if(x==10) {
                if(arre[1]>arre[2] || arre[2]>arre[3] || arre[3]>arre[4] || arre[4]>arre[5] || arre[5]>arre[6] || arre[6]>arre[7] || arre[7]>arre[8] || arre[8]>arre[9] || arre[9]>arre[10]) {
                System.out.println("Los numeros estan acomodados");
                } else {
                    System.out.println("Los numeros no estan acomodados");
                }
            }
        }
    }
    public static void main(String args[]) {
        Arreglo04 phi = new Arreglo04();
        phi.carga();
        phi.verificacion();
    }
}