package Persona;
import java.util.*;
public class TestJugadorHerencia {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Arbitro arbitro = null;
        Entrenador entrenador = null;
        Delantero delantero = null;
        Portero portero = null;
        Defensa defensa = null;
        int opc = 0, opc2 = 0, opc3 = 0, opc4 = 0,opc5 = 0, opc6 = 0;
        do {
            System.out.println("\tSelecione una opcion");
            System.out.println("0)Salir");
            System.out.println("1)Arbitro");
            System.out.println("2)Entrenador");
            System.out.println("3)Jugadores");
            System.out.print("-Opcion: ");
            opc = in.nextInt();
            switch (opc) {
                case 1 :
                    do {
                        System.out.println("\tARBITRO");
                        System.out.println("0)Salir");
                        System.out.println("1)Crear Arbitro");
                        System.out.println("2)Ver Arbitro");
                        System.out.print("Opcion: ");
                        opc2 = in.nextInt();
                        switch (opc2) {
                            case 1 :
                                arbitro = new Arbitro();
                                System.out.print("-Ingrese el nombre del arbitro: ");
                                arbitro.setNombre(in.next());
                                System.out.print("-Ingrese la edad del arbitro: ");
                                arbitro.setEdad(in.nextInt());
                                System.out.print("-Ingrese la nacionalidad del arbitro: ");
                                arbitro.setNacionalidad(in.next());
                                System.out.print("-Ingrese los años de experiencia del arbitro : ");
                                arbitro.setYearsDeArbitro(in.nextInt());
                                System.out.print("\tEL ARBITRO SE A CREADO");
                                break;
                            case 2 :
                                if (arbitro == null) {
                                    System.out.println("NO HAY ARBITROS EN EL SISTEMA");
                                } else {
                                    System.out.println(arbitro);
                                }
                                break;
                        }
                    } while (opc2 != 0);
                    break;
                case 2 : 
                    do {
                        System.out.println("\tENTRENADOR");
                        System.out.println("0)Salir");
                        System.out.println("1)Crear Entrenador");
                        System.out.println("2)Ver Entranador");
                        System.out.print("Opcion: ");
                        opc3 = in.nextInt();
                        switch (opc3) {
                            case 1 :
                                entrenador = new Entrenador();
                                System.out.print("-Ingrese el nombre del entrenador: ");
                                entrenador.setNombre(in.next());
                                System.out.print("-Ingrese la edad del entrenador: ");
                                entrenador.setEdad(in.nextInt());
                                System.out.print("-Ingrese el conocimiento del entrenador (reconocimientos): ");
                                entrenador.setConocimiento(in.next());
                                System.out.print("-Ingrese si el entrenador es motivacional ( TRUE / FALSE): ");
                                entrenador.setMotivacion(in.nextBoolean());
                                System.out.println("\tEL ENTREADOR SE A CREADO");
                                break;
                            case 2 :
                                if (entrenador == null) {
                                    System.out.println("NO HAY ENTRENADORES EN EL SISTEMA");
                                } else {
                                    System.out.println(entrenador);
                                }
                                break;
                        }
                    } while (opc3 != 0);
                    break;
                case 3 :
                    do {
                        System.out.println("\tJUGADORES");
                        System.out.println("0)Salir");
                        System.out.println("1)Crear Jugadores");
                        System.out.println("2)Ver Jugadores");
                        System.out.print("Opcion: ");
                        opc4 = in.nextInt();
                        switch (opc4) {
                            case 1 :
                                do {
                                    System.out.println("\tJUGADORES");
                                    System.out.println("0)Salir");
                                    System.out.println("1)Crear Delantero");
                                    System.out.println("2)Crear Defensa");
                                    System.out.println("3)Crear Portero");
                                    System.out.print("Opcion: ");
                                    opc5 = in.nextInt();
                                    switch (opc5) {
                                        case 1 :
                                            delantero = new Delantero();
                                            System.out.print("-Ingrese el nombre del delantero: ");
                                            delantero.setNombre(in.next());
                                            System.out.print("-Ingrese la edad del delantero : ");
                                            delantero.setEdad(in.nextInt());
                                            System.out.print("-Ingrese los goles del delantero: ");
                                            delantero.setNumeroDeGoles(in.nextInt());
                                            System.out.print("-Ingrese si el delantero hace fintas ( TRUE / FALSE): ");
                                            delantero.setFintas(in.nextBoolean());
                                            System.out.println("\tEL DELANTERO SE A CREADO");
                                            break;
                                        case 2 :
                                            defensa = new Defensa();
                                            System.out.print("-Ingrese el nombre del defensa: ");
                                            defensa.setNombre(in.next());
                                            System.out.print("-Ingrese la edad del defensa: ");
                                            defensa.setEdad(in.nextInt());
                                            System.out.print("-Ingrese si es titular el defensa ( TRUE / FALSE): ");
                                            defensa.setTitular(in.nextBoolean());
                                            System.out.print("-Ingrese si el defensa tiene alta resistencia a golpes ( TRUE / FALSE): ");
                                            defensa.setResistenciaAGolpes(in.nextBoolean());
                                            System.out.println("\tEL DEFENSA SE A CREADO");
                                            break;
                                        case 3 :
                                            portero = new Portero();
                                            System.out.print("-Ingrese el nombre del portero: ");
                                            portero.setNombre(in.next());
                                            System.out.print("-Ingrese la edad del portero: ");
                                            portero.setEdad(in.nextInt());
                                            System.out.print("-Ingrese las atajadas promedio del portero: ");
                                            portero.setNumeroDeAtajadas(in.nextInt());
                                            System.out.print("-Ingrese si el portero es elastico ( TRUE / FALSE): ");
                                            portero.setElastico(in.nextBoolean());
                                            System.out.println("\tEL PORTERO SE A CREADO");
                                            break;
                                    }
                                } while(opc5 != 0);
                                break;
                            case 2 :
                                do {
                                    System.out.println("\tJUGADORES");
                                    System.out.println("0)Salir");
                                    System.out.println("1)Ver Delantero");
                                    System.out.println("2)Ver Defensa");
                                    System.out.println("3)Ver Portero");
                                    System.out.print("Opcion: ");
                                    opc6 = in.nextInt();
                                    switch (opc6) {
                                        case 1 :
                                            if (delantero == null) {
                                                System.out.println("NO HAY DELANTEROS EN EL SISTEMA");
                                            } else {
                                              System.out.print(delantero);  
                                            }
                                            break;
                                        case 2 :
                                            if (defensa == null) {
                                                System.out.println("NO HAY DEFENSAS EN EL SISTEMA");
                                            } else {
                                                System.out.print(defensa);
                                            }
                                            break;
                                        case 3 :
                                            if (portero == null) {
                                                System.out.println("NO HAY PORTEROS EN EL SISTEMA");
                                            } else {
                                                System.out.print(portero);
                                            }
                                            break;
                                    }
                                } while(opc6 != 0);
                                break;
                        }
                    } while (opc4 != 0);
                    break;
            }
        } while (opc != 0);
        System.out.println("\tAdios");
    }
}