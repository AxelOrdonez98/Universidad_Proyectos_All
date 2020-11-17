package funcionesEstructura;
import java.util.Scanner;
public class Recursividad02 {
    void imprimir(int x){
        imprimir(x-1);
    }
    public static void main(String args[]) {
        Recursividad02 re = new Recursividad02();
        re.imprimir(5);
    }
}
