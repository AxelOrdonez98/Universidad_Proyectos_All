package estructuraSP;
import java.util.*;
public class Pila {
    Scanner in = new Scanner(System.in);
    int pila1[] = new int[4];
    int tope = -1;
    public int push() {
        if (tope>=pila1.length-1) {
            System.out.println("La pila esta llena");
        } else {
            tope+=1;
            System.out.println("Ingrese dato");
            pila1[tope] = in.nextInt();
        }
        return tope;
    }
    public int pop(){
        if(tope == -1) {
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("Se elimino un elemento de la pila");
            pila1[tope] = 0;
            tope= -1;
        }
        return tope;
    }
    public void ver() {
        for (int tope = 3;tope>=0;tope--) {
            System.out.println("Datos de la pila: "+pila1[tope]);
        }
    }
    public static void main(String args[]) {
        Pila objeto = new Pila();
        Scanner opcion = new Scanner(System.in);
        int seleccion;
        do {
            System.out.println("Menu de pila");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Mostrar completa");
            System.out.println("4. Salida");
            System.out.print("Teclee la opcion: ");
            seleccion = opcion.nextInt();
            switch (seleccion) {
                case 1 :
                    objeto.push();
                    break;
                case 2 :
                    objeto.pop();
                    break;
                case 3 :
                    objeto.ver();
                    break;
                default :
                    System.out.println("Error\nOpcion invalida");
                    break;
            }
        } while(seleccion != 4);
    }
}