package funcionesEstructura;
import java.util.Scanner;
public class metodo {
    private Scanner in;
    public void cargarValor() {
        in = new Scanner(System.in);
        int valor;
        do {
            System.out.print("Ingrese valor: ");
            valor = in.nextInt();
            if (valor != -1) {
                calcular(valor);
            }
        } while (valor != 1);
    } 
    public void calcular(int v) {
        for (int f=v;f<=v*10;f=f+v) {
            System.out.println(f+" -");
        }
    }
    public static void main(String args[]) {
        metodo tabla;
        tabla = new metodo();
        tabla.cargarValor();
    }
}
