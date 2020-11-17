package Persona;

import javax.swing.JOptionPane;

public class TetsArreglo02 {

    Defensa defensa = null;
    private Defensa arreglo[] = null;
    private int tamano = 0;
    private int cont = -1;

    public static void main(String args[]) {
        TetsArreglo02 phi = new TetsArreglo02();
        phi.menu();
    }

    public void menu() {
        TetsArreglo02 xi = new TetsArreglo02();
        int opc, cont = 0;
        do {
            String[] opciones = {
                "0",
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",};
            cont++;
            opc = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion"
                    + "\nNumero de intentos: " + cont
                    + "\n0) Salir"
                    + "\n1) Crear arreglo"
                    + "\n2) Agregar, eliminar y mostrar (Objetos)"
                    + "\n3) Buscar y mostrar objetos (ID o Posicion)"
                    + "\n4) Buscar, mostrar y modificar objeto (ID o Posicion)"
                    + "\n5) Buscar, mostrar y remover objeto (ID o Posicion)"
                    + "\n6) Intercambiar objetos entre posiciones", "SISTEMA DE JUGADORES (Defensas)", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            switch (opc) {
                case 0:
                    break;
                case 1:
                    xi.insertarTamañoDeArreglo();
                    break;
                case 2:
                    int opc2 = 1;
                    do {
                        String[] seleccion = {
                            "0",
                            "1",
                            "2",
                            "3",
                            "4"
                        };
                        opc2 = JOptionPane.showOptionDialog(null, "0)Salir"
                                + "\n1)Agregar objeto"
                                + "\n2)Insertar objeto"
                                + "\n3)Eliminar objeto"
                                + "\n4)Imprimir objetos", "Seleccione una opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, seleccion, seleccion[0]);
                        switch (opc2) {
                            case 0:
                                break;
                            case 1:
                                xi.insertarObjetoDeArreglo();
                                break;
                            case 3:
                                int opc3 = 0;
                                String[] seleccion2 = {
                                    "0",
                                    "1",
                                    "2",};
                                do {
                                    opc3 = JOptionPane.showOptionDialog(null, "0)Salir"
                                            + "\n1)Vaciar objeto"
                                            + "\n2)Destruir objeto", "Seleccione una opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, seleccion2, seleccion2[0]);
                                    switch (opc3) {
                                        case 0:
                                            break;
                                        case 1:
                                            xi.vaciarObjeto();
                                            break;
                                        case 2:
                                            xi.destruirArreglo();
                                            break;
                                        default:
                                            System.exit(0);
                                            break;
                                    }
                                } while (opc3 != 0);
                                break;
                            case 4:
                                xi.imprimir();
                                break;
                            case 2:
                                xi.caso3();
                                break;
                            default:
                                System.exit(0);
                                break;
                        }
                    } while (opc2 != 0);
                    break;
                case 3:
                    int opc1 = 0;
                    do {
                        String[] opco = {
                            "0",
                            "1",
                            "2"
                        };
                        opc1 = JOptionPane.showOptionDialog(null, "0)Salir"
                                + "\n1)Buscar y mostra (ID)"
                                + "\n2)Buscar y mostrar (Posicion)", "Seleccione una opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opco, opco[0]);
                        switch (opc1) {
                            case 0:
                                break;
                            case 1:
                                xi.buscarDefensaPorId();
                                break;
                            case 2:
                                xi.buscarMostrarYEliminarPorPosicion();
                                break;
                            default:
                                break;
                        }
                    } while (opc1 != 0);
                    break;
                case 4:
                    String[] lol = {
                        "0",
                        "1",
                        "2"
                    };
                    int aux1 = 0;
                    do {
                        aux1 = JOptionPane.showOptionDialog(null, "0)Salir"
                                + "\n1)Buscar, mostra y modificar (ID)"
                                + "\n2)Buscar mostrar u modificar (Posicion)", "Seleccione una opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, lol, lol[0]);
                        switch (aux1) {
                            case 0:
                                break;
                            case 1:
                                xi.cambiarObjetoPorId();
                                break;
                            case 2:
                                xi.buscarObjetoPorPocisionYModificar();
                                break;
                            default:
                                System.exit(0);
                                break;
                        }
                    } while (aux1 != 0);
                    break;
                case 5:
                    String[] in = {
                        "0",
                        "1",
                        "2"
                    };
                    int aux = 0;
                    do {
                        aux = JOptionPane.showOptionDialog(null, "0)Salir"
                                + "\n1)Buscar, mostra y remover (ID)"
                                + "\n2)Buscar, mostrar y remover (Posicion)", "Seleccione una opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, in, in[0]);
                        switch (aux) {
                            case 0:
                                break;
                            case 1:
                                xi.buscarMostrarYEliminarID();
                                break;
                            case 2:
                                xi.buscarMostrarYEliminarPorPosicion();
                                break;
                            default:
                                System.exit(0);
                                break;
                        }
                    } while (aux != 0);
                    break;
                case 6:
                    xi.intercambioDeObjetosEntrePosiciones();
                    break;
                default:
                    System.exit(0);
            }
        } while (opc != 0);
        JOptionPane.showMessageDialog(null, "Adios");
    }

    public void insertarTamañoDeArreglo() {
        if (tamano == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese el tamaño del arreglo [3 - 5]");
            tamano = Integer.parseInt(JOptionPane.showInputDialog("Tañano: "));
            if ((tamano >= 3) && (tamano <= 5)) {
                arreglo = new Defensa[tamano];
                JOptionPane.showMessageDialog(null, "El arreglo a sido creado");
            } else {
                JOptionPane.showMessageDialog(null, "!El tamaño que se inserto no esta dentro de los parametros¡");
                tamano = 0;
            }
        } else {
            JOptionPane.showMessageDialog(null, "El tamaño del arreglo ya fue definido");
        }
    }

    public void insertarObjetoDeArreglo() {
        if (arreglo != null) {
            for (int i = 0; i < tamano; i++) {
                if (arreglo[i] == null) {
                    if (cont <= tamano) {
                        cont++;
                        JOptionPane.showMessageDialog(null, cont);
                        defensa = new Defensa();
                        defensa.setId(JOptionPane.showInputDialog("Ingrese el ID de la persona"));
                        defensa.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del defensa"));
                        defensa.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del defensa")));
                        defensa.setNombreDelEquipo(JOptionPane.showInputDialog("Ingrese el nombre del equipo"));
                        defensa.setNumeroDeJugador(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de jugador")));
                        arreglo[cont] = defensa;
                        break;
                    }
                } else if (i == (tamano - 1) && arreglo[i] != null) {
                    JOptionPane.showMessageDialog(null, "El arreglo esta lleno");
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay arreglos creados");
        }
    }

    public void imprimir() {
        if (arreglo != null) {
            for (int i = 0; i < arreglo.length; i++) {
                JOptionPane.showMessageDialog(null, arreglo);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay arreglos creados");
        }
    }

    public void buscarDefensaPorId() {
        String aux = "";
        if (arreglo != null) {
            aux = JOptionPane.showInputDialog("Ingrese el ID para buscar");
            for (int i = 0; i < arreglo.length; i++) {
                if (aux.equals(arreglo[i].getId())) {
                    JOptionPane.showConfirmDialog(null, arreglo[i]);
                } else {
                    JOptionPane.showConfirmDialog(null, "No se encontro el ID");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay arreglos creados");
        }
    }

    public void caso3() {
        if (arreglo != null) {
            JOptionPane.showMessageDialog(null, "Ingrese la posicion que desea llenar" + "\nEl tamaño del arrglo es: " + tamano);
            int aux;
            aux = Integer.parseInt(JOptionPane.showInputDialog("Pocision: "));
            if (arreglo[aux] == null) {
                JOptionPane.showMessageDialog(null, aux);
                defensa = new Defensa();
                defensa.setId(JOptionPane.showInputDialog("Ingrese el ID de la persona"));
                defensa.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del defensa"));
                defensa.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del defensa")));
                defensa.setNombreDelEquipo(JOptionPane.showInputDialog("Ingrese el nombre del equipo"));
                defensa.setNumeroDeJugador(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de jugador")));
                arreglo[aux] = defensa;
            } else {
                for (int i = 0; i < tamano; i++) {
                    if (arreglo[i] == null) {
                        JOptionPane.showMessageDialog(null, "El espacio disponible es: " + arreglo[i] + i);
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "El arreglo esta lleno");
                        break;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay arreglos creados");
        }
    }

    public void buscarPorPosicion() {
        if (arreglo != null) {
            int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a buscar"));
            for (int i = 0; i < tamano; i++) {
                if (arreglo[pos] != null) {
                    JOptionPane.showMessageDialog(null, arreglo[pos]);
                } else {
                    JOptionPane.showMessageDialog(null, "La posicion esta vacia o no existe");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay arreglos creados");
        }
    }

    public void cambiarObjetoPorId() {
        if (arreglo != null) {
            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i] == null || arreglo[i] != null) {
                    String aux = "";
                    aux = JOptionPane.showInputDialog("ingrese el ID a modificar");
                    for (int ii = 0; ii < arreglo.length; ii++) {
                        if (aux.equals(arreglo[i].getId())) {
                            cont--;
                            cont++;
                            JOptionPane.showMessageDialog(null, cont);
                            defensa.setId(JOptionPane.showInputDialog("Ingrese el ID de la persona"));
                            defensa.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del defensa"));
                            defensa.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del defensa")));
                            defensa.setNombreDelEquipo(JOptionPane.showInputDialog("Ingrese el nombre del equipo"));
                            defensa.setNumeroDeJugador(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de jugador")));
                            JOptionPane.showMessageDialog(null, "El ID: " + aux + "\nA sido modificado");
                            arreglo[ii] = defensa;
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay ID en el sistema");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se han ingresado datos en el areglo");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay arreglos creados");
        }
    }

    public void vaciarObjeto() {
        if (arreglo != null) {
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = null;
            }
            cont = -1;
            JOptionPane.showMessageDialog(null, "EL arreglo fue vaciado");
        } else {
            JOptionPane.showMessageDialog(null, "No hay arreglos creados");
        }
    }

    public void destruirArreglo() {
        if (arreglo != null) {
            arreglo = null;
            tamano = 0;
            cont = -1;
            JOptionPane.showMessageDialog(null, "El arreglo fue destruido");
        } else {
            JOptionPane.showMessageDialog(null, "No hay arreglos creados");
        }
    }

    public void buscarObjetoPorPocisionYModificar() {
        int aux = 0;
        if (arreglo != null) {
            aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la pocicion: "));
            if (aux <= tamano || aux >= tamano) {
                if (arreglo[aux] != null) {
                    JOptionPane.showConfirmDialog(null, arreglo[aux]);
                    defensa.setId(JOptionPane.showInputDialog("Ingrese el ID de la persona"));
                    defensa.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del defensa"));
                    defensa.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del defensa")));
                    defensa.setNombreDelEquipo(JOptionPane.showInputDialog("Ingrese el nombre del equipo"));
                    defensa.setNumeroDeJugador(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de jugador")));
                    JOptionPane.showMessageDialog(null, "El ID: " + aux + "\nA sido modificado");
                    arreglo[aux] = defensa;
                } else {
                    JOptionPane.showConfirmDialog(null, "Esta vacio el arreglo en esa posicion");
                }
            } else {
                JOptionPane.showConfirmDialog(null, "La pocision no existe");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay arreglos creados");
        }
    }

    public void buscarMostrarYEliminarID() {
        String aux = "";
        if (arreglo != null) {
            aux = JOptionPane.showInputDialog("Ingrese el ID a buscar para ser eliminado");
            for (int i = 0; i < arreglo.length; i++) {
                if (aux.equals(arreglo[i].id)) {
                    JOptionPane.showConfirmDialog(null, arreglo[i]);
                    arreglo[i] = null;
                    JOptionPane.showConfirmDialog(null, "EL ID: " + aux + " A sido eliminado");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay arreglos creados");
        }
    }

    public void buscarMostrarYEliminarPorPosicion() {
        int aux = 0;
        if (arreglo != null) {
            aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la poscion a buscar y eliminar"));
            if (aux <= tamano || aux >= tamano) {
                JOptionPane.showConfirmDialog(null, arreglo[aux]);
                arreglo[aux] = null;
                JOptionPane.showConfirmDialog(null, "El arreglo en la posicion: " + aux + " Fue eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "La posicion no esta en el rango");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay arreglos creados");
        }
    }

    public void intercambioDeObjetosEntrePosiciones() {
        Defensa auxDefensa;
        if (arreglo != null) {
            int aux = 0, aux2 = 0;
            aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la primera posicion a intercambiar: "));
            if (aux != -1) {
                aux2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la siguiente poscion a intercambiar: "));
                if (aux2 != -1) {
                    auxDefensa = arreglo[aux];
                    arreglo[aux] = arreglo[aux2];
                    arreglo[aux2] = auxDefensa;
                    JOptionPane.showConfirmDialog(null, "Se intercambiaron correctamente las posiciones");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay arreglos creados");
        }
    }
}
