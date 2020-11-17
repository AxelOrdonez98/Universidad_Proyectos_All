package Examen;
import java.util.*;
public class EjercicioA {
    /*
    -Oscar Axel Ortiz
    -3ro A
    -Turno matutino
    -A)por un 100;
    Una fabrica produce dos modelos de lavadoras, A y B, en tres terminaciones: N, L
    y S. Produce del modelo A: 400 unidades en la terminación N, 200 unidades en la
    terminación L y 50 unidades en la terminación S. Produce del modelo B: 300
    unidades en la terminación N, 100 unidades en la terminación L y 30 unidades en
    la terminación S. La terminación N lleva 25 horas de taller y 1 hora de
    administración . La terminación L lleva 30 horas de taller y 1.2 horas de
    administración . La terminación S lleva 33 horas de taller y 1.3 horas de
    administración .
    1. Representar la información en dos matrices.
    2. Hallar una matriz que exprese las horas de taller y de administración
    empleadas para cada uno de los modelos.
    */
    private double [][] matrizA;
    private double [][] matrizB;
    private double [][] matrizR;
    public void cargar() {
        matrizA = new double [3][4];
        matrizB = new double [4][3];
        matrizR = new double [3][3];
        //----------------------------
        matrizA [1][1] = 400;
        matrizA [1][2] = 200;
        matrizA [1][3] = 50;
        matrizA [2][1] = 300;
        matrizA [2][2] = 100;
        matrizA [2][3] = 30;
        //----------------------------
        matrizB [1][1] = 25;
        matrizB [2][1] = 30;
        matrizB [3][1] = 33;
        matrizB [1][2] = 1;
        matrizB [2][2] = 1.2;
        matrizB [3][2] = 1.3;
        //----------------------------
        matrizR [1][1] = (matrizA[1][1] * matrizB[1][1]) + (matrizA[1][2]*matrizB[2][1]) +(matrizA[1][3]*matrizB[3][1]);
        matrizR [1][2] = (matrizA[1][1] * matrizB[1][2]) + (matrizA[1][2]*matrizB[2][2]) +(matrizA[1][3]*matrizB[3][2]);
        matrizR [2][1] = (matrizA[2][1] * matrizB[1][1]) + (matrizA[2][2]*matrizB[2][1]) +(matrizA[2][3]*matrizB[3][1]);
        matrizR [2][2] = (matrizA[2][1] * matrizB[1][2]) + (matrizA[2][2]*matrizB[2][2]) +(matrizA[2][3]*matrizB[3][2]);
        for (int x = 1;x<matrizR.length;x++) {
            for (int y = 1;y<matrizR[x].length;y++) {
                System.out.print(matrizR[x][y]+"\t ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[]) {
        EjercicioA phi = new EjercicioA();
        phi.cargar();
    }
}
