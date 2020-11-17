package funcionesEstructura;
import java.util.Scanner;
public class Recursividad04 {
    void imprimir(int x){
        if (x>0) {
           imprimir(x-1);
           System.out.println(x);
        }
     }
    public static void main(String args[]) {
        Recursividad04 re = new Recursividad04();
        re.imprimir(5);
    }
}