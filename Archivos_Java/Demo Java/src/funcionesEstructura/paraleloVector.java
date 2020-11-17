package funcionesEstructura;
import java.util.Scanner;
public class paraleloVector {
    private Scanner in;
    private String [] nombre;
    private int [] edad;
    private int cant;
    private float promedio;
    private int cont1;
    private int cont2;
    public void cargar() {
        in = new Scanner(System.in);
        System.out.print("Cuantos datos desea ingresar: ");
        cant = in.nextInt();
        nombre = new String[cant];
        edad = new int[cant];
        for (int i = 0;i<nombre.length;i++) {
            System.out.print("Ingrese un nombre: ");
            nombre[i] = in.next();
            System.out.print("Ingrese una edad: ");
            edad[i] = in.nextInt();
        }
    }
    public void mayores(){
        System.out.println("Personas mayores de edad: ");
        for (int i = 0;i<nombre.length;i++) {
            if (edad[i]>=18) {
                System.out.println(nombre[i]);
            }
        }
    }
    public void media(){
        for (int i = 0;i<edad.length;i++) {
            promedio+=edad[i];
        }
        promedio/=cant;
        System.out.print("La edad promedio es: "+ promedio);
    }
    public void nombreMedia() {
        for (int i = 0;i<nombre.length;i++) {
            if (edad[i]<18) {
                System.out.println("Persona mayores de edad: "+nombre[i]);
            } else {
                System.out.println("Persona menores de edad: "+nombre[i]);
            }
        }
    }
    public static void main(String args[]) {
        paraleloVector phi = new paraleloVector();
        phi.cargar();
        phi.mayores();
        phi.media();
        phi.nombreMedia();
    }
}