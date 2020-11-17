package comoposicion;
import java.util.Scanner;
public class testComposicion {
    public static void main(String args[]) {
        int opc = 0;
        Computadora buscar = new Computadora();
        Scanner in = new Scanner(System.in);
        Computadora computadora = null;
        Teclado teclado = new Teclado();
        Pantalla pantalla = new Pantalla();
        Procesador procesador = new Procesador();
        do {
            System.out.print("\n0)Salir\n1)Crear computadora\n2)Buscar computadore\n3)Buscar computadora y modificar\n4)Buscar computadora y eliminar\nOpcion: ");
            opc = in.nextInt();
            switch (opc) {
                case 1 :
                    //-------------------computadora-------Computadora 
                    computadora = new Computadora();
                    System.out.print("Color de la computadora: ");
                    computadora.setColor(in.next());
                    System.out.print("Ingrese la ID de la computadora: ");
                    computadora.setId(in.next());
                    //----------------procesador
                    System.out.print("Velocidad del procesador: ");
                    procesador.setVelocidad(in.nextFloat());
                    System.out.print("Ingrese los nucleos: ");
                    procesador.setNucleos(in.nextInt());
                    System.out.print("Ingrese la marca: ");
                    procesador.setMarca(in.next());
                    computadora.setProcesador(procesador);
                    //------------------pantalla
                    System.out.print("Ingrese la Resolucion de la pantalla: ");
                    pantalla.setResolucion(in.next());
                    System.out.print("Ingrese el panel: ");
                    pantalla.setPanel(in.next());
                    System.out.print("La pantalla es touch? (true o false): ");
                    pantalla.setTouch(in.nextBoolean());
                    computadora.setPantalla(pantalla);
                    //------------------teclado
                    System.out.print("Ingrese el tipo de Switch: ");
                    teclado.setTipoDeSwitch(in.next());
                    System.out.print("El teclado es extendido? (true o false): ");
                    teclado.setExtendido(in.nextBoolean());
                    System.out.print("es nocturno? (true o false): ");
                    teclado.setNocturno(in.nextBoolean());        
                    computadora.setTeclado(teclado);
                    //-----------------------------------------------------
                    System.out.println("\n------------------------------------");
                    System.out.println("El color de la computadora es: "+computadora.getColor());
                    System.out.println("El ID de la computadora es: "+computadora.getId());
                    System.out.println("El procesador de la compuadora es: "+computadora.getProcesador().getVelocidad());
                    System.out.println("La cumputadora tiene "+computadora.getProcesador().getNucleos()+" nucleos");
                    System.out.println("La marca de la computadora es: "+computadora.getProcesador().getMarca());
                    System.out.println("La resolucion de la pantalla es: "+computadora.getPantalla().getresolucion());
                    System.out.println("El panel de la pantalla es: "+computadora.getPantalla().getPanel());
                    System.out.println("La panta es touch: "+computadora.getPantalla().getTouch());
                    System.out.println("EL tipo de switch del teclado es: "+computadora.getTeclado().getTipoDeSwitch());
                    System.out.println("Teclado extendido: "+computadora.getTeclado().getExtendido());
                    System.out.println("El teclado es nocturno: "+computadora.getTeclado().getNocturno());
                    System.out.println("\n------------------------------------");
                    break;
                case 2 :
                    if (computadora == null) {
                        System.out.println("\tNo hay computadoras en el sistema");
                    } else {
                        System.out.print("Ingres el ID de la computadora a buscar: ");
                        buscar.setId(in.next());
                        if(computadora.equals(buscar)) {
                            System.out.println("\n------------------------------------");
                            System.out.println("El color de la computadora es: "+computadora.getColor());
                            System.out.println("El ID de la computadora es: "+computadora.getId());
                            System.out.println("El procesador de la compuadora es: "+computadora.getProcesador().getVelocidad());
                            System.out.println("La cumputadora tiene "+computadora.getProcesador().getNucleos()+" nucleos");
                            System.out.println("La marca de la computadora es: "+computadora.getProcesador().getMarca());
                            System.out.println("La resolucion de la pantalla es: "+computadora.getPantalla().getresolucion());
                            System.out.println("El panel de la pantalla es: "+computadora.getPantalla().getPanel());
                            System.out.println("La panta es touch: "+computadora.getPantalla().getTouch());
                            System.out.println("EL tipo de switch del teclado es: "+computadora.getTeclado().getTipoDeSwitch());
                            System.out.println("Teclado extendido: "+computadora.getTeclado().getExtendido());
                            System.out.println("El teclado es nocturno: "+computadora.getTeclado().getNocturno());
                            System.out.println("\n------------------------------------");
                        }
                    }
                    break;
                case 3 :
                    if (computadora == null) {
                        System.out.println("\tNo hay computadoras en el sistema");
                    } else {
                        System.out.print("Ingres el ID de la computadora a buscar: ");
                        buscar.setId(in.next());
                        if (computadora.equals(buscar)) {
                            System.out.println("1)Modificar Teclado\n2)Modificar Pantalla\n3)Modificar Procesador\n4)Modificar ID y Color\n5)Todos");
                            System.out.print("Que desea modificar: ");
                            opc = in.nextInt();
                            switch (opc) {
                                case 1 :
                                    System.out.println("\t\tModificar Teclado");
                                    System.out.print("1)Tipo de Switch\n2)Teclado Extendido\n3)Teclado Nocturno\n4)Todos");
                                    System.out.print("Que desea modificar: ");
                                    opc = in.nextInt();
                                    switch (opc) {
                                        case 1:
                                            System.out.println("\t\tModificar Tipo de Switch");
                                            System.out.print("Ingrese el tipo de Switch: ");
                                            teclado.setTipoDeSwitch(in.next());
                                            computadora.setTeclado(teclado);
                                            System.out.print("\t\tTeclado Modificado");
                                            break;
                                        case 2 :
                                            System.out.println("\t\tTeclado Extendido");
                                            System.out.print("El teclado es extendido? (true o false): ");
                                            teclado.setExtendido(in.nextBoolean());
                                            computadora.setTeclado(teclado);
                                            System.out.print("\t\tTeclado Modificado");
                                            break;
                                        case 3 :
                                            System.out.println("\t\tTeclado Nocturno");
                                            System.out.print("es nocturno? (true o false): ");
                                            teclado.setNocturno(in.nextBoolean());  
                                            computadora.setTeclado(teclado);
                                            System.out.print("\t\tTeclado Modificado");
                                            break;
                                        case 4 :
                                            System.out.println("\t\tTodas las Opciones");
                                            System.out.print("Ingrese el tipo de Switch: ");
                                            teclado.setTipoDeSwitch(in.next());
                                            System.out.print("El teclado es extendido? (true o false): ");
                                            teclado.setExtendido(in.nextBoolean());
                                            System.out.print("es nocturno? (true o false): ");
                                            teclado.setNocturno(in.nextBoolean());
                                            computadora.setTeclado(teclado);
                                            System.out.print("\t\tTeclado Modificado");
                                            break;
                                        default :
                                            System.out.println("LA OPCION NO ESTA EN LOS PARAMETROS");
                                            break;
                                    }
                                    break;
                                case 2 :
                                    System.out.print("\t\tModificar Pantalla");
                                    System.out.print("1)Resolucion de la pantalla\n2)Tipo de panel\n3)Pantalla Touch\n4)Todos");
                                    System.out.print("Que desea modificar: ");
                                    opc = in.nextInt();
                                    switch (opc) {
                                        case 1 :
                                            System.out.println("\t\tResolucion de la pantalla");
                                            System.out.print("Ingrese la Resolucion de la pantalla: ");
                                            pantalla.setResolucion(in.next());
                                            computadora.setPantalla(pantalla);
                                            break;
                                        case 2 :
                                            System.out.println("\t\tTipo de panel");
                                            System.out.print("Ingrese el panel: ");
                                            pantalla.setPanel(in.next());
                                            computadora.setPantalla(pantalla);
                                            System.out.print("\t\tPantalla Modificada");
                                            break;
                                        case 3 :
                                            System.out.println("\t\tPantalla touch");
                                            System.out.print("La pantalla es touch? (true o false): ");
                                            pantalla.setTouch(in.nextBoolean());
                                            computadora.setPantalla(pantalla);
                                            System.out.print("\t\tPantalla Modificada");
                                            break;
                                        case 4 :
                                            System.out.println("\t\tModificar Todas las Opciones de la Pantalla");
                                            System.out.print("Ingrese la Resolucion de la pantalla: ");
                                            pantalla.setResolucion(in.next());
                                            System.out.print("\t\tPantalla Modificada");
                                            System.out.print("Ingrese la Resolucion de la pantalla: ");
                                            pantalla.setResolucion(in.next());
                                            System.out.print("Ingrese el panel: ");
                                            pantalla.setPanel(in.next());
                                            System.out.print("La pantalla es touch? (true o false): ");
                                            pantalla.setTouch(in.nextBoolean());
                                            computadora.setPantalla(pantalla);
                                            System.out.print("\t\tPantalla Modificada");
                                            break;
                                        default :
                                            System.out.println("LA OPCION NO ESTA EN LOS PARAMETROS");
                                            break;
                                    }
                                    break;
                                case 3 :
                                    System.out.println("\t\tModificar Procesador");
                                    System.out.print("1)Nucleos\n2)Velocidad\n3)Marca\n4)Todos");
                                    System.out.print("Que desea modificar: ");
                                    opc = in.nextInt();
                                    switch (opc) {
                                        case 1:
                                            System.out.println("\t\tNucleos");
                                            System.out.print("Ingrese los nucleos: ");
                                            procesador.setNucleos(in.nextInt());
                                            computadora.setProcesador(procesador);
                                            System.out.print("\t\tProcesador Modificado");
                                            break;
                                        case 2 :
                                            System.out.println("\t\tVelocidad del Procesador");
                                            System.out.print("Velocidad del procesador: ");
                                            procesador.setVelocidad(in.nextFloat());
                                            computadora.setProcesador(procesador);
                                            System.out.print("\t\tProcesador Modificado");
                                            break;
                                        case 3 :
                                            System.out.println("\t\tMarca del Procesador");
                                            System.out.print("Ingrese la marca: ");
                                            procesador.setMarca(in.next());
                                            computadora.setProcesador(procesador);
                                            System.out.print("\t\tProcesador Modificado");
                                            break;
                                        case 4 :
                                            System.out.println("\t\tModificar Todo");
                                            System.out.print("Velocidad del procesador: ");
                                            procesador.setVelocidad(in.nextFloat());
                                            System.out.print("Ingrese los nucleos: ");
                                            procesador.setNucleos(in.nextInt());
                                            System.out.print("Ingrese la marca: ");
                                            procesador.setMarca(in.next());
                                            computadora.setProcesador(procesador);
                                            System.out.print("\t\tProcesador Modificado");
                                            break;
                                        default :
                                            System.out.println("LA OPCION NO ESTA EN LOS PARAMETROS");
                                            break;
                                    }
                                    break;
                                case 4 :
                                    System.out.println("\t\tModificar ID Y Color");
                                    System.out.print("1)Color\n2)ID\n3)Todos");
                                    System.out.print("Que desea modificar: ");
                                    opc = in.nextInt();
                                    switch (opc) {
                                        case 1 :
                                            System.out.println("\t\tModificar Color");
                                            System.out.print("Color de la computadora: ");
                                            computadora.setColor(in.next());
                                            System.out.print("\t\tColor Modificado");
                                            break;
                                        case 2 :
                                            System.out.println("\t\tModificar ID");
                                            System.out.print("Ingrese la ID de la computadora: ");
                                            computadora.setId(in.next());
                                            System.out.print("\t\tID Modificado");
                                            break;
                                        case 3 :
                                            System.out.println("\t\tModificar Todo");
                                            System.out.print("Color de la computadora: ");
                                            computadora.setColor(in.next());
                                            System.out.print("Ingrese la ID de la computadora: ");
                                            computadora.setId(in.next());
                                            System.out.print("\t\tColor Y ID Modificado");
                                            break;
                                        default :
                                            System.out.println("LA OPCION NO ESTA EN LOS PARAMETROS");
                                            break;
                                    }
                                    break;
                                case 5 :
                                    System.out.print("Color de la computadora: ");
                                    computadora.setColor(in.next());
                                    System.out.print("Ingrese la ID de la computadora: ");
                                    computadora.setId(in.next());
                                    System.out.print("Velocidad del procesador: ");
                                    procesador.setVelocidad(in.nextFloat());
                                    System.out.print("Ingrese los nucleos: ");
                                    procesador.setNucleos(in.nextInt());
                                    System.out.print("Ingrese la marca: ");
                                    procesador.setMarca(in.next());
                                    computadora.setProcesador(procesador);
                                    System.out.print("Ingrese la Resolucion de la pantalla: ");
                                    pantalla.setResolucion(in.next());
                                    System.out.print("Ingrese el panel: ");
                                    pantalla.setPanel(in.next());
                                    System.out.print("La pantalla es touch? (true o false): ");
                                    pantalla.setTouch(in.nextBoolean());
                                    computadora.setPantalla(pantalla);
                                    System.out.print("Ingrese el tipo de Switch: ");
                                    teclado.setTipoDeSwitch(in.next());
                                    System.out.print("El teclado es extendido? (true o false): ");
                                    teclado.setExtendido(in.nextBoolean());
                                    System.out.print("es nocturno? (true o false): ");
                                    teclado.setNocturno(in.nextBoolean());        
                                    computadora.setTeclado(teclado);
                                    break;
                                default :
                                    System.out.println("LA OPCION NO ESTA EN LOS PARAMETROS");
                                    break;
                            }
                        } else {
                            System.out.println("\nLa computadora no se encontro");
                        }
                    }
                    break;
                case 4 :
                    if (computadora == null) {
                        System.out.println("\tNo hay computadoras en el sistema");
                    } else {
                        System.out.print("Ingres el ID de la computadora a buscar: ");
                        buscar.setId(in.next());
                        if(computadora.equals(buscar)) {
                            computadora = null;
                            System.out.println("\t\tLa Computadora fue eliminada");
                        }
                    }
                    break;
            }
        } while (opc !=0);
    }
    public testComposicion() {
    }
}