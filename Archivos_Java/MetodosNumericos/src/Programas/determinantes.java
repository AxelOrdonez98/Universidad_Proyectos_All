package Programas;

/**
 *
 * @author solda
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class determinantes {

    public static void main(String[] args) {
        determinantes obj = new determinantes();
        obj.elegir();

    }

    public void elegir() {
        Scanner in = new Scanner(System.in);
        double x = 0, y = 0, z = 0;
        double deterX = 0, deterY = 0, deterZ = 0;
        int opc = 0;
        int decimales = 0;
        double error = 0, nuevoError1 = 0, nuevoError2 = 0, nuevoError3 = 0, promedioError = 0;
        double fila1 = 0, fila2 = 0, fila3 = 0;
        do {
            System.out.print("0) Salir\n1) Matrices 2x2\n2) Matrices 3x3\n-Opcion: ");
            opc = in.nextInt();
            switch (opc) {
                case 0:
                    break;
                case 1:
                    x = 0;
                    y = 0;
                    deterX = 0;
                    deterY = 0;
                    double matriz[][] = new double[2][2];
                    double constante[] = new double[2];
                    System.out.print("Ingrese el numero de decimales: ");
                    decimales = in.nextInt();
                    System.out.print("Ingrese el porcentaje de error: ");
                    error = in.nextDouble();
                    System.out.println("\tIngrese los valores de la matriz");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print("Fila " + i + ": ");
                            matriz[i][j] = in.nextDouble();
                        }
                    }
                    for (int i = 0; i < constante.length; i++) {
                        System.out.print("Ingrese la constante de la fila [" + i + "]: ");
                        constante[i] = in.nextDouble();
                    }
                    System.out.println("Matriz = ");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print("|" + matriz[i][j] + "|");
                        }
                        System.out.println();
                    }

                    double determinante = 0;
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            determinante = (matriz[0][0] * matriz[1][1]) - (matriz[1][0] * matriz[0][1]);
                            System.out.println("Determinante: " + determinante);
                            break;
                        }
                        break;
                    }

                    double determinanteX = 0;
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            determinanteX = (constante[0] * matriz[1][1]) - (constante[1] * matriz[0][1]);
                            System.out.println("Determinante X: " + determinanteX);
                            break;
                        }
                        break;
                    }
                    x = determinante / determinanteX;
                    System.out.println("X= " + x);

                    double determinanteY = 0;
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            determinanteY = (matriz[0][0] * constante[1]) - (matriz[1][0] * constante[0]);
                            System.out.println("Determinante Y: " + determinanteY);
                            break;
                        }
                        break;
                    }
                    y = determinante / determinanteY;
                    System.out.println("Y= " + y);
                    break;

                case 2:
                    double determinante1 = 0;
                    x = 0;
                    y = 0;
                    z = 0;
                    deterX = 0;
                    deterY = 0;
                    deterZ = 0;
                    double matriz1[][] = new double[3][3];
                    double constante1[] = new double[3];
                    System.out.print("Ingrese el numero de decimales: ");
                    decimales = in.nextInt();
                    System.out.print("Ingrese el porcentaje de error: ");
                    error = in.nextDouble();
                    System.out.println("\tIngrese los valores de la matriz");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("Fila " + i + ": ");
                            matriz1[i][j] = in.nextDouble();
                        }
                    }
                    for (int i = 0; i < constante1.length; i++) {
                        System.out.print("Ingrese la constante de la fila [" + i + "]: ");
                        constante1[i] = in.nextDouble();
                    }
                    System.out.println("=====================================");
                    System.out.println("Matriz = ");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("|" + matriz1[i][j] + "|");
                        }
                        System.out.println();
                    }
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            determinante1
                                    = (matriz1[0][0] * matriz1[1][1] * matriz1[2][2])
                                    + (matriz1[0][1] * matriz1[1][2] * matriz1[2][0])
                                    + (matriz1[0][2] * matriz1[1][0] * matriz1[2][1])
                                    - (matriz1[0][2] * matriz1[1][1] * matriz1[2][0])
                                    - (matriz1[0][1] * matriz1[1][0] * matriz1[2][2])
                                    - (matriz1[0][0] * matriz1[1][2] * matriz1[2][1]);
                            break;
                        }
                        break;
                    }

                    BigDecimal deter1bd = new BigDecimal(determinante1);
                    deter1bd = deter1bd.setScale(decimales, RoundingMode.HALF_UP);

                    System.out.println("Determinante: " + deter1bd.doubleValue());
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            deterX
                                    = (constante1[0] * matriz1[1][1] * matriz1[2][2])
                                    + (matriz1[0][1] * matriz1[1][2] * constante1[2])
                                    + (matriz1[0][2] * constante1[1] * matriz1[2][1])
                                    - (matriz1[0][2] * matriz1[1][1] * constante1[2])
                                    - (matriz1[0][1] * constante1[1] * matriz1[2][2])
                                    - (constante1[0] * matriz1[1][2] * matriz1[2][1]);
                            System.out.println("=====================================");
                            break;
                        }
                        break;
                    }
                    BigDecimal deterXbd = new BigDecimal(deterX);
                    deterXbd = deterXbd.setScale(decimales, RoundingMode.HALF_UP);

                    System.out.println("Determinante X: " + deterXbd.doubleValue());
                    x = deterX / determinante1;

                    BigDecimal xbd = new BigDecimal(x);
                    xbd = xbd.setScale(decimales, RoundingMode.HALF_UP);

                    System.out.println("X= " + xbd.doubleValue());
                    System.out.println("=====================================");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            deterY
                                    = (matriz1[0][0] * constante1[1] * matriz1[2][2])
                                    + (constante1[0] * matriz1[1][2] * matriz1[2][0])
                                    + (matriz1[0][2] * matriz1[1][0] * constante1[2])
                                    - (matriz1[0][2] * constante1[1] * matriz1[2][0])
                                    - (constante1[0] * matriz1[1][0] * matriz1[2][2])
                                    - (matriz1[0][0] * matriz1[1][2] * constante1[2]);
                            break;
                        }
                        break;
                    }
                    BigDecimal deterYbd = new BigDecimal(deterY);
                    deterYbd = deterYbd.setScale(decimales, RoundingMode.HALF_UP);

                    System.out.println("Determinante Y: " + deterYbd.doubleValue());
                    y = deterY / determinante1;

                    BigDecimal ybd = new BigDecimal(y);
                    ybd = ybd.setScale(decimales, RoundingMode.HALF_UP);

                    System.out.println("Y= " + ybd.doubleValue());
                    System.out.println("=====================================");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            deterZ
                                    = (matriz1[0][0] * matriz1[1][1] * constante1[2])
                                    + (matriz1[0][1] * constante1[1] * matriz1[2][0])
                                    + (constante1[0] * matriz1[1][0] * matriz1[2][1])
                                    - (constante1[0] * matriz1[1][1] * matriz1[2][0])
                                    - (matriz1[0][1] * matriz1[1][0] * constante1[2])
                                    - (matriz1[0][0] * constante1[1] * matriz1[2][1]);
                            break;
                        }
                        break;
                    }
                    BigDecimal deterZbd = new BigDecimal(deterZ);
                    deterZbd = deterZbd.setScale(decimales, RoundingMode.HALF_UP);

                    System.out.println("Determinante Z: " + deterZbd.doubleValue());
                    
                    z = deterZ / determinante1;

                    BigDecimal zbd = new BigDecimal(z);
                    zbd = zbd.setScale(decimales, RoundingMode.HALF_UP);

                    System.out.println("Z= " + zbd.doubleValue());
                    System.out.println("=====================================");
                    fila1 = (matriz1[0][0] * x) + (matriz1[0][1] * y) + (matriz1[0][2] * z);
                    fila2 = (matriz1[1][0] * x) + (matriz1[1][1] * y) + (matriz1[1][2] * z);
                    fila3 = (matriz1[2][0] * x) + (matriz1[2][1] * y) + (matriz1[2][2] * z);

                    BigDecimal fila1bd = new BigDecimal(fila1);
                    fila1bd = fila1bd.setScale(decimales, RoundingMode.HALF_UP);

                    BigDecimal fila2bd = new BigDecimal(fila2);
                    fila2bd = fila2bd.setScale(decimales, RoundingMode.HALF_UP);

                    BigDecimal fila3bd = new BigDecimal(fila3);
                    fila3bd = fila3bd.setScale(decimales, RoundingMode.HALF_UP);

                    System.out.println("Resultado fila 1 = " + fila1bd.doubleValue());
                    System.out.println("Resultado fila 2 = " + fila2bd.doubleValue());
                    System.out.println("Resultado fila 3 = " + fila3bd.doubleValue());
                    System.out.println("=====================================");
                    nuevoError1 = Math.abs((fila1 - constante1[0]) / fila1) * 100;
                    nuevoError2 = Math.abs((fila2 - constante1[1]) / fila2) * 100;
                    nuevoError3 = Math.abs((fila3 - constante1[2]) / fila3) * 100;
                    promedioError = (nuevoError1 + nuevoError2 + nuevoError3) / 3;

                    BigDecimal promediobd = new BigDecimal(promedioError);
                    promediobd = promediobd.setScale(decimales, RoundingMode.HALF_UP);

                    BigDecimal error1bd = new BigDecimal(nuevoError1);
                    error1bd = error1bd.setScale(decimales, RoundingMode.HALF_UP);

                    BigDecimal error2bd = new BigDecimal(nuevoError2);
                    error2bd = error2bd.setScale(decimales, RoundingMode.HALF_UP);

                    BigDecimal error3bd = new BigDecimal(nuevoError3);
                    error3bd = error3bd.setScale(decimales, RoundingMode.HALF_UP);

                    System.out.println("Error en fila 1 = " + error1bd.doubleValue() + "\n\tConstante de la fila = " + constante1[0]);
                    System.out.println("Error en fila 2 = " + error2bd.doubleValue() + "\n\tConstante de la fila = " + constante1[1]);
                    System.out.println("Error en fila 3 = " + error3bd.doubleValue() + "\n\tConstante de la fila = " + constante1[2]);
                    System.out.println("Promedio de error = " + promediobd.doubleValue());
                    if (promedioError == error) {
                        System.out.println("=====================================");
                        System.out.println("    El promedio de error de igual");
                    } else if (promedioError > error) {
                        System.out.println("=====================================");
                        System.out.println("    El promedio de error es mayor ");
                    } else if (promedioError < error) {
                        System.out.println("=====================================");
                        System.out.println("    El promedio de error es menor ");
                    }
                    System.out.println("=====================================");
                    break;
                default:
                    System.out.println("\n=========================================================");
                    System.out.println("La Opcion Ingresada no es valida, ingrese solo [0, 1, 2]");
                    System.out.println("=========================================================\n");
                    break;
            }
        } while (opc != 0);
        System.out.println("=====================================");
        System.out.println("\t       Adios");
        System.out.println("=====================================");
    }
}