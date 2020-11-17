package funcionesEstructura;
import java.util.Scanner;
public class trabajadores {
    private Scanner in;
    private float [] mañana;
    private float [] noche;
    private float sueldoman;
    private float sueldonoch;
    private float sueldototal;
    public void cargar() {
        in = new Scanner(System.in);
        mañana = new float[5];
        for(int i = 1;i<5;i++) {
            System.out.print("Ingrese el sueldo de los empleados de la mañana ["+i+"]: ");
            mañana[i]=in.nextFloat();
            sueldoman+=mañana[i];
        }
        noche = new float[5];
        for(int i = 1;i<5;i++) {
            System.out.print("Ingrese el sueldo de los empleados de la noche ["+i+"]: ");
            noche[i]=in.nextFloat();
            sueldonoch+=noche[i];
        }
    }
    public void suma() {
        sueldototal = sueldoman + sueldonoch;
        System.out.println("El sueldo total de los 8 trabajadores es: "+ sueldototal);
    }
    public static void main(String args[]) {
        trabajadores lol = new trabajadores();
        lol.cargar();
        lol.suma();
    }
}