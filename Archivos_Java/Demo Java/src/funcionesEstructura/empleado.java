package funcionesEstructura;
import java.util.Scanner;
public class empleado {
    private String nombre;
    private int sueldo;
    private Scanner in;
    public void empleo() {
        in = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado : ");
        this.nombre = in.nextLine();
        System.out.print("ingrese el sueldo de " + nombre + " : ");
        sueldo = in.nextInt();
        System.out.print(nombre + calcularSueldo(sueldo));
    }
    public String calcularSueldo(double x) {
        String iva = "Se le desglosa el 16 % al superar los 3000 de sueldo"
                + "\nTotal a pagar: ";
        String noIva = "Su sueldo al no pagar impuestos: ";
        if (sueldo >=3000) {
            x = sueldo * 0.16;
            return iva + x;
        } else {
            return noIva + sueldo;
        }
    }
    public static void main(String args[]) {
        empleado em = new empleado();
        em.empleo();
    }   
}