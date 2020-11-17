package Practica_4;

import java.util.Scanner;

public class Calculadora {

    Main phi = new Main();
    Scanner in = new Scanner(System.in);

    public void Suma() {

        System.out.print("Ingrese el primer valor: ");
        phi.valor1 = in.nextFloat();
        System.out.print("Ingrese el segundo valor: ");
        phi.valor2 = in.nextFloat();
        phi.resultado = phi.valor1 + phi.valor2;
        System.out.println("\nEl resultado de la suma es: " + phi.resultado);
    }

    public void Resta() {
        System.out.print("Ingrese el primer valor: ");
        phi.valor1 = in.nextFloat();
        System.out.print("Ingrese el segundo valor: ");
        phi.valor2 = in.nextFloat();
        phi.resultado = phi.valor1 - phi.valor2;
        System.out.println("\nEl resultado de la resta es: " + phi.resultado);
    }

    public void Multiplicacion() {
        System.out.print("Ingrese el primer valor: ");
        phi.valor1 = in.nextFloat();
        System.out.print("Ingrese el segundo valor: ");
        phi.valor2 = in.nextFloat();
        phi.resultado = phi.valor1 * phi.valor2;
        System.out.println("\nEl resultado de la multiplicacion es: " + phi.resultado);
    }

    public void Division() {
        System.out.print("Ingrese el primer valor: ");
        phi.valor1 = in.nextFloat();
        System.out.print("Ingrese el segundo valor: ");
        phi.valor2 = in.nextFloat();
        phi.resultado = phi.valor1 / phi.valor2;
        System.out.println("\nEl resultado de la division es: " + phi.resultado);
    }
}
