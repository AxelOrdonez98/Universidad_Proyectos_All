package poo;
import java.util.*;
public class DiaDelAño {
    public int diaa;
    public int semana;
    public int diaSema;
    public void calcularMesDelAñoYSignoYEstacionYDiaFestivo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un dia del año: ");
        diaa = in.nextInt();
        if (diaa>=1 && diaa<=365) {
            if (diaa>=20 && diaa<=49) {
                System.out.println("Tu signo zoodiacal es: Acuario");
            } else if (diaa>=50 && diaa>=79) {
                System.out.println("Tu signo zoodiacal es: Piscis");
            } else if (diaa>=80 && diaa>=109) {
                System.out.println("Tu signo zoodiacal es: Aries");
            } else if (diaa>=110 && diaa<=140) {
                System.out.println("Tu signo zoodiacal es: Tauro");
            } else if (diaa>=141 && diaa<=171){
                System.out.println("Tu signo zoodiacal es: Genesis");
            } else if (diaa>=172 && diaa<=203) {
                System.out.println("Tu signo zoodiacal es: Cancer");
            } else if (diaa>=204 && diaa<=234) {
                System.out.println("Tu signo zoodiacal es: Leo");
            } else if (diaa>=235 && diaa<=265) {
                System.out.println("Tu signo zoodiacal es: Virgo");
            } else if (diaa>=266 && diaa<=295) {
                System.out.println("Tu signo zoodiacal es: Libra");
            } else if (diaa>=296 && diaa<=325) {
                System.out.println("Tu signo zoodiacal es: Escorpio");
            } else if (diaa>=326 && diaa<=355) {
                System.out.println("Tu signo zoodiacal es: Sagitario");
            } else if ((diaa>=356 || diaa<=365) || (diaa>=1 && diaa<=19)) {
                System.out.println("Tu signo zoodiacal es: Capricornio");
            } 
            if ((diaa>=355 && diaa<=365) || (diaa>=1 && diaa<=78)) {
                System.out.println("La estacion del año es: Invierno");
            } else if (diaa>=79 && diaa<=171) {
                System.out.println("La estacion del año es: Primavera");
            } else if (diaa>=172 && diaa<=264) {
                System.out.println("La estacion del año es: Verano");
            } else if (diaa>=265 && diaa<=354) {
                System.out.println("La estacion del año es: Otoño");
            }
            if (diaa>=1 && diaa<=31) {
                System.out.println("El mes del año es: Enero");
            } else if (diaa>=32 && diaa<=59) {
                System.out.println("El mes del año es: Febrero");
            } else if (diaa>=60 && diaa<=90) {
                System.out.println("El mes del año es: Marzo");
            } else if (diaa>=91 && diaa<=120) {
                System.out.println("El mes del año es: Abril");
            } else if (diaa>=121 && diaa<=151) {
                System.out.println("El mes del año es: Mayo");
            } else if (diaa>=152 && diaa<=181) {
                System.out.println("El mes del año es: Junio");
            } else if (diaa>=182 && diaa<=212) {
                System.out.println("El mes del año es: Julio");
            } else if (diaa>=213 && diaa<=243) {
                System.out.println("El mes del año es: Agosto");
            } else if (diaa>=244 && diaa<=273) {
                System.out.println("El mes del año es: Septiembre");
            } else if (diaa>=274 && diaa<=304) {
                System.out.println("El mes del año es: Octubre");
            } else if (diaa>=305 && diaa<=334) {
                System.out.println("El mes del año es: Noviembre");
            } else if (diaa>=335 && diaa<=365) {
                System.out.println("El mes del año es: Diciembre");
            }
            if (diaa == 16) {
                System.out.println("Dia festivo: Mi cumpleaños y el de Carlos");
            } else if (diaa==130) {
                System.out.println("Dia festivo: Dia de la madre");
            } else if (diaa==120) {
                System.out.println("Dia festivo: Dia del niño");
            } else if (diaa==306) {
                System.out.println("Dia festivo: Dia de muertos");
            } else if (diaa==131) {
                System.out.println("Dia festivo: Cumpleaños de chay");
            } else {
                System.out.println("Dia festivo: No");
            }
        }
    }
    public void calcularSemana () {
        if (diaa>=1 && diaa<=365) {
            if (diaa % 7 == 1){
                semana=diaa/7;
            } else {
                semana=(diaa/7)+1;
            } System.out.println("La sema es: " + semana);
        }
    } 
    public void calcularDiaDeLaSemana () {
        if (diaa>=1 && diaa<=365) {
            for (int i = 1;i<=diaa;i++){
                if ( diaSema == 7 ) {
                    diaSema=1;
                } else {
                    diaSema++;
                }
            }
            switch (diaSema){
                case 1 : 
                    System.out.println("El dia de la semana: Lunes");
                    break;
                case 2 :
                    System.out.println("El dia de la semana: Martes");
                    break;
                case 3 :
                    System.out.println("El dia de la semana: Miercoles");
                    break;
                case 4 :
                    System.out.println("El dia de la semana: Jueves");
                    break;
                case 5 :
                    System.out.println("El dia de la semana: Viernes");
                    break;
                case 6 :
                    System.out.println("El dia de la semana: Sabado");
                    break;
                case 7 :
                    System.out.println("El dia de la semana: Domingo");
                    break;
                default :
                    System.out.print("Sin parametros");
                    break;
            }
            System.out.println("El dia de la semana (numero): "+diaSema);
        } else {
            System.out.println(" Dia fuera de parametros");
        }
    }
}