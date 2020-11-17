package funciones;
import java.util.*;
public class TestMisFunciones {
    public static void main(String args[]) {
        int menu;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("\n-MENU");
            System.out.println("0)Salir");
            System.out.println("1)IMC");
            System.out.println("2)Dia Festivo");
            System.out.println("3)Numero par");
            System.out.println("4)Numero Medio de 3");
            System.out.println("5)Frase con vocales");
            System.out.println("6)Numero Primo");
            System.out.println("7)Numero de vocales");
            System.out.println("8)Numero hexamdecimal");
            System.out.println("9)Calcular mediana (10 numeros)");
            System.out.println("10)Validar multiplos (2 numeros)");
            System.out.print("-OPCION: ");
            menu = in.nextInt();
            switch (menu) {
                case 1 :
                    double peso, estatura,imc;
                    System.out.println("-IMC");
                    System.out.print("Ingrese el peso: ");
                    peso = in.nextDouble();
                    System.out.print("Ingrese la estatura: ");
                    estatura = in.nextDouble();
                    imc = MisFunciones.calcularIMC(peso, estatura);
                    System.out.println("EL IMC ES: " + imc + "\n");
                    break;

                case 2 :
                    int dia = 0, mes = 0;
                    String fecha = "";
                    System.out.println("-DIA FESTIVO");
                    System.out.print("Ingresa el Dia: ");
                    dia = in.nextInt();
                    System.out.print("Ingresa el Mes: ");
                    mes = in.nextInt();
                    fecha = MisFunciones.diaFestivo(dia, mes);
                    System.out.println("" + fecha + "\n");
                    break;

                case 3 :
                    int x = 0;
                    String numPar = "";
                    System.out.println("-NUMERO PAR");
                    System.out.print("Ingrese un numero: ");
                    x = in.nextInt();
                    numPar = MisFunciones.numeroPar(x);
                    System.out.print("" + numPar + "\n");
                    break;

                case 4 :
                    int num1 = 0, num2 = 0, num3 = 0;
                    String numeroMed = "";
                    System.out.println("-NUMERO MEDIO DE 3");
                    System.out.print("Ingrese 1er numero: ");
                    num1 = in.nextInt();
                    System.out.print("Ingrese 2do numero: ");
                    num2 = in.nextInt();
                    System.out.print("Ingrese 3er numero: ");
                    num3 = in.nextInt();
                    numeroMed = MisFunciones.numeroMedio(num1, num2, num3);
                    System.out.print("" + numeroMed + "\n");
                    break;

                case 5 :
                    String cadena = "";
                    System.out.println("-FRASE CON VOCALES");
                    System.out.print("Ingrese una palabra: ");
                    cadena = in.next();
                    System.out.print(""+MisFunciones.vocales(cadena)+"\n");
                    break;

                case 6 :
                    int numPrimo = 0;
                    System.out.println("-NUMERO PRIMO");
                    System.out.print("Ingrese un numero para evaluar: ");
                    numPrimo = in.nextInt();
                    System.out.println(""+MisFunciones.numPrimo(numPrimo));
                    break;
                    
                case 7 : 
                    System.out.println("-NUMERO DE VOCALES EN UNA FRASE");
                    System.out.print("Ingrese una palabra: ");
                    cadena = in.next();
                    System.out.print(""+MisFunciones.numVocales(cadena)+"\n");
                    break;
                    
                case 8 :
                    System.out.println("-NUMERO HEXADECIMALES");
                    System.out.print("Ingrese una cadena: ");
                    cadena = in.next();
                    System.out.print(""+MisFunciones.numHexa(cadena)+"\n");
                    break;
                 
                case 9 :
                    System.out.println("-MEDIANA DE 10 NUMEROS");
                    System.out.println("Ingrese los 10 numeros:");
                    float [] numeros = new float[10];
                    for (int i = 0; i < 10; i++) {
                        numeros[i] = in.nextFloat();
                    }
                    System.out.println(MisFunciones.calcularMediana(numeros));
                    break;
                case 10 :
                    System.out.println("-MULTIPLO DE OTRO NUMERO");
                    System.out.println("Ingrese los 2 numeros:");
                    int numero1 = in.nextInt();
                    int numero2 = in.nextInt();
                    System.out.println(MisFunciones.validarMultiplo(numero1, numero2));
                    break;
                default :
                    break;
                    
               }
        } while (menu != 0);         
        System.out.println("Adios");
    }
}
