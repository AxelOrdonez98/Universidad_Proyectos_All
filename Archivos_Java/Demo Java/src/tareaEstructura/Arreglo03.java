package tareaEstructura;
import java.util.Scanner;
public class Arreglo03 {
    private float [][] grupoA;
    private float [][] grupoB;
    private float promedioGrupoA;
    private float promedioGrupoB;
    private Scanner in;
    public void cargar() {
        grupoA = new float [6][4];
        grupoB = new float [6][4];
        in = new Scanner (System.in);
        System.out.println("\tIngrese las calificaciones del grupo 'A'\n");
        for (int x=1;x<grupoA.length;x++) {
            System.out.println("Alumno: "+x);
            for(int y=1;y<grupoA[x].length;y++) {
                System.out.print("-Calificacion "+y+": ");
                grupoA[x][y] = in.nextFloat();
            }
            System.out.println();
        }
        System.out.println("\tIngrese las calificaciones del grupo 'B'\n");
        for (int x=1;x<grupoB.length;x++) {
            System.out.println("Alumno: "+x);
            for(int y=1;y<grupoB[x].length;y++) {
                System.out.print("-Calificacion "+y+": ");
                grupoB[x][y] = in.nextFloat();
            }
            System.out.println();
        }
    }
    public void promedioGrupoA() {
        int prome=0,prome2=0,prome3=0,prome4=0,prome5=0;
        for (int x=1;x<grupoA.length;x++) {
            for (int y=1;y<grupoA[x].length;y++) {
                if (x == 1) {
                    prome+=grupoA[x][y];
                }
                if (x == 2) {
                    prome2+=grupoA[x][y];
                }
                if (x == 3) {
                    prome3+=grupoA[x][y];
                }
                if (x == 4) {
                    prome4+=grupoA[x][y];
                }
                if (x == 5) {
                    prome5+=grupoA[x][y];
                }
            }
        }
        prome/=3;
        prome2/=3;
        prome3/=3;
        prome4/=3;
        prome5/=3;
        promedioGrupoA = (prome+prome2+prome3+prome4+prome5)/5;
        System.out.println("El promedio del grupo A es: "+promedioGrupoA);
    }
    public void promedioGrupoB() {
        int prome=0,prome2=0,prome3=0,prome4=0,prome5=0;
        for (int x=1;x<grupoB.length;x++) {
            for (int y=1;y<grupoB[x].length;y++) {
                if (x == 1) {
                    prome+=grupoB[x][y];
                }
                if (x == 2) {
                    prome2+=grupoB[x][y];
                }
                if (x == 3) {
                    prome3+=grupoB[x][y];
                }
                if (x == 4) {
                    prome4+=grupoB[x][y];
                }
                if (x == 5) {
                    prome5+=grupoB[x][y];
                }
            }
        }
        prome/=3;
        prome2/=3;
        prome3/=3;
        prome4/=3;
        prome5/=3;
        promedioGrupoB = (prome+prome2+prome3+prome4+prome5)/5;
        System.out.println("El promedio del grupo B es: "+promedioGrupoB);
    }
    public void comparacion() {
        if (promedioGrupoA>promedioGrupoB) {
            System.out.println("EL PROMEDIO DEL GRUPO 'A' ES MEAYOR");
        } else if (promedioGrupoA<promedioGrupoB) {
            System.out.println("EL PROMEDIO DEL GRUPO 'B' ES MEAYOR");
        } else {
            System.out.println("EL PROMEDIO DE LOS GRUPOS ES IGUALES");
        }
    }
    public static void main(String args[]) {
        Arreglo03 prome = new Arreglo03();
        prome.cargar();
        prome.promedioGrupoA();
        prome.promedioGrupoB();
        prome.comparacion();
    }
}