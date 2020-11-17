package funcionesEstructura;
import java.util.Scanner;
public class triangulos {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        triangulosFunc eva = new triangulosFunc();
        System.out.print("Ingrese lado 1: ");
        eva.setlad1(in.nextFloat());
        System.out.print("Ingrese lado 2: ");
        eva.setlad2(in.nextFloat());
        System.out.print("Ingrese lado 3: ");
        eva.setlad3(in.nextFloat());
        if (eva.getlad1() == eva.getlad2() && eva.getlad1() == eva.getlad3()) {
            System.out.println("El triangulo es equilatero");
        } else if (eva.getlad1() == eva.getlad2() && eva.getlad1() == eva.getlad3() && eva.getlad2() != eva.getlad3()) {
            System.out.println("El triangulo es isoceles");
        } else {
            System.out.println("EL triangulo es escaleno");
        }
    }
}
