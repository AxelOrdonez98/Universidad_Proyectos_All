package funcionesEstructura;
import java.util.Scanner;
public class operacion {
    private double suma;
    private double resta;
    private double multiplicacion;
    private double division;
    private double valor1;
    private double valor2;
    private Scanner in;
    public void operaciones() {
        in = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        valor1 = in.nextInt();
        System.out.print("Ingrese otro valor: ");
        valor2 = in.nextInt();
        System.out.println("La suma es: " + sigma(valor1, valor2));
        System.out.println("La resta es: " + less(valor1, valor2));
        System.out.println("La multiplicacion es: " +phi(valor1, valor2));
        System.out.println("La division es: "+ alpha(valor1, valor2));
    }
    public double sigma(double valor1, double valor2) {
        suma = valor1 + valor2;
        return suma;
    }
    public double less(double valor1, double valor2) {
        resta = valor1 - valor2;
        return resta;
    }
    public double phi(double v1, double v2) {
        multiplicacion = valor1 * valor2;
        return multiplicacion;
    }
    public double alpha(double v1, double v2) {
        division = valor1 / valor2;
        return division;
    }
    public static void main(String args[]) {
        operacion res = new operacion();
        res.operaciones();
    }
}