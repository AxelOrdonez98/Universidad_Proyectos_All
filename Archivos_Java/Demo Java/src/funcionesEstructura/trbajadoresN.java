package funcionesEstructura;
import java.util.Scanner;
public class trbajadoresN {
    private Scanner in;
    private int [] sueldos;
    public void cargar () {
        in = new Scanner(System.in);
        System.out.print("Cuantos sueldo desea ingresar: ");
        int cant;
        cant = in.nextInt();
        sueldos = new int[cant];
        for (int i = 0;i<sueldos.length;i++) {
            System.out.print("Ingrese el sueldo: ");
            sueldos[i] = in.nextInt();
        }
    }
    public void imprimir() {
        for(int i = 0;i<sueldos.length;i++) {
            System.out.println(sueldos[i]);
        }
    }
    public static void main(String args[]) {
        trbajadoresN zigma = new trbajadoresN();
        zigma.cargar();
        zigma.imprimir();
    }
}
