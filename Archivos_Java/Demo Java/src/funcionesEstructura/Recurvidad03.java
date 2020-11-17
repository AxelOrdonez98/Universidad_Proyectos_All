package funcionesEstructura;
import java.util.Scanner;
public class Recurvidad03 {
    void imprimir(int x){
        if (x>0) {
           imprimir(x-1); 
        }
     }
    public static void main(String args[]) {
        Recurvidad03 re = new Recurvidad03();
        re.imprimir(5);
    }
}