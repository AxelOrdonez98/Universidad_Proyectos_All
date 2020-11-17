package tareaEstructura;
import java.util.Scanner;
public class Arreglo01 {
    private int [] datos;
    private Scanner in;
    private int conta = 0;
    private int conta2 = 0;
    private int sobras = 0;
    private int sum = 0;
    public void cargar() {
        datos = new int [8];
        in = new Scanner(System.in);
        System.out.println("Ingrese 8 valores en un rango de [menos infinito , infinito]");
        for (int x = 0;x<datos.length;x++) {
            System.out.print("Datos num "+x+": ");
            datos [x] = in.nextInt();
        }
    }
    public void comparar() {
        for (int x = 0;x<datos.length;x++) {
            if (datos[x]<=36) {
                sum += datos[x];
                conta++;
                } else if (datos[x]>=50){
                    conta2++;
            } else if (datos[x]>=37 && datos[x]<=49) {
                    sobras++;
                }
        }
    }
    public void imprimir() {
        System.out.println("Los valores ingresados de [menos infinito , 36] son: "+ conta);
        System.out.println("Los valores ingresados de [menos infinito, 36] acumulados son: "+ sum);
        System.out.println("Los datos ingresados de [37, 49] son: "+ sobras);
        System.out.println("Los valores ingresados de [50, infinito]: "+ conta2);
    }
    public static void main(String args[]) {
        Arreglo01 recorer = new Arreglo01();
        recorer.cargar();
        recorer.comparar();
        recorer.imprimir();
    }
}
