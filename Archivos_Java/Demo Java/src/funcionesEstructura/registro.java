package funcionesEstructura;
import java.util.Scanner;
public class registro {
    private Scanner in;
    private int bajo;
    private int alto;
    private float promedio;
    private float [] altura;
    public void cargar() {
        in = new Scanner(System.in);
        altura = new float[5];
        for(int i = 0;i<5;i++) {
            System.out.print("Ingrese la altura de una persona: ");
            altura[i]=in.nextFloat();
            if (altura[i] < 1.69) {
                bajo++;
            } else {
                alto++;
            }
        }
    }
    public void imprimir() {
        for (int i = 0;i<5;i++) {
            promedio += altura[i];
            System.out.println("Estatura: " + altura[i]);
        }
        promedio /=5;
        System.out.println("El promedio de estatura es: " +promedio);
        System.out.println("Numero de personas altas: " + alto);
        System.out.println("Numero de personas bajas: " + bajo);
        
    }
    public static void main(String args[]) {
        registro pv = new registro();
        pv.cargar();
        pv.imprimir();
    }
}