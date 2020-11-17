package funcionesEstructura;
import java.util.Scanner;
public class Sueldos {
    private Scanner in;
    private int [] sueldo;
    public void cargar() {
        in = new Scanner(System.in);
        sueldo = new int[5];
        for(int i = 0;i<5;i++) {
            System.out.print("Ingrese un valor: ");
            sueldo[i]=in.nextInt();
        }
    }
    public void imprimir() {
        for (int i = 0;i<5;i++) {
            System.out.println(sueldo[i]);
        }
    }
    public static void main(String args[]) {
        Sueldos pv = new Sueldos();
        pv.cargar();
        pv.imprimir();
    }
    
}
