package funcionesEstructura;
import java.util.Scanner;
public class edad {
    public static void main (String args[]) {
        edadFuncion fun = new edadFuncion();
        Scanner in = new Scanner (System.in);
        System.out.print("¿Cual es tu mombre completo?: ");
        fun.setnombre(in.nextLine());
        System.out.print("¿Cual es tu edad: ");
        fun.setedad(in.nextInt());
        if (fun.getedad() >= 18) {
        System.out.println(fun.getnombre()+"");
        System.out.println(fun.getedad()+" es mayor de edad");
        } else {
        System.out.println(fun.getnombre()+"");
        System.out.println(fun.getedad()+" es menor de edad");
        }
    }
}
