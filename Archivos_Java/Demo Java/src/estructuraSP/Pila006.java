package estructuraSP;
import java.util.*;
public class Pila006 {
    int arre [] = new int [11];
    int arreB[] = new int [11];
    Stack < String > pila = new Stack();
    public void datos() {
        pila.push(Integer.toString(8));
        pila.push(Integer.toString(10));
        pila.push(Integer.toString(5));
        pila.push(Integer.toString(2));
        pila.push(Integer.toString(1));
        pila.push(Integer.toString(6));
        pila.push(Integer.toString(0));
        pila.push(Integer.toString(4));
        pila.push(Integer.toString(9));
        pila.push(Integer.toString(7));
        pila.push(Integer.toString(3));
    }
    public void asendente(){
        int cont = 0;
        while(!pila.empty()) {
            arre[cont] = Integer.parseInt(pila.pop());
            cont +=1;
        }
        Arrays.sort(arre);
        for(int i = 0;i<arre.length;i++) {
            System.out.println("Ascendente: ["+arre[i]+"]");
        }
        System.out.println();
    }
    public void desendente() {
        int cont = 0;
        while(!pila.empty()) {
            arreB[cont] = Integer.parseInt(pila.pop());
            cont +=1;
        }
        
    }
    public static void main(String args[]) {
        Pila006 phi = new Pila006();
        phi.datos();
        phi.asendente();
        phi.desendente();
    }
}
