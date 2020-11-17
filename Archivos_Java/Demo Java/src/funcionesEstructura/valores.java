
package funcionesEstructura;
import java.util.Scanner;
public class valores {
    private Scanner in;
    public void cargarValores() {
        in = new Scanner(System.in);
        System.out.println("Ingrese el 1er valor");
        int valor1 = in.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        int valor2 = in.nextInt();
        System.out.println("ingrese el valor 3: ");
        int valor3 = in.nextInt();
        int mayor, menor;
        mayor = calcularMayor(valor1, valor2, valor3);
        menor = calcularMenor(valor1, valor2, valor3);
        System.out.println("La mayor es: " + mayor);
        System.out.println("La menor es: " + menor);
    }
    public int calcularMayor(int v1, int v2, int v3) {
        int m;
        if (v1>v2 && v1 > v3) {
            m = v1;
        } else {
            if (v2>v3) {
                m = v2;
            } else {
                m = v3;
            }
        }
        return m;
    }
    public int calcularMenor (int v1,int v2,int v3) {
        return 0;
    }
    public static void main(String args[]) {
        valores maymen = new valores();
        maymen.cargarValores();
    }
}
