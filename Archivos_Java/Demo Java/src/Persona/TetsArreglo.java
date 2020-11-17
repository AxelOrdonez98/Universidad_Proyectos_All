package Persona;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class TetsArreglo {

    Defensa defensa = null;
    private Defensa arreglo[] = null;
    private int tamano = 0;
    private int cont = -1;

    public static void main(String args[]) {
        TetsArreglo phi = new TetsArreglo();
        phi.menu();
    }

    public void menu() {
        TetsArreglo xi = new TetsArreglo();
        int opc, cont = 0;
        do {
            cont++;
            opc = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "\nNumero de intentos: " + cont
                    + "\n0) Salir"
                    + "\n1) Crear arreglo"
                    + "\n2) Agregar objeto"
                    + "\n3) Insertar objeto"
                    + "\n4) Buscar y mostrar objeto (ID)"
                    + "\n5) Buscar y mostrar objeto (Posicion)"
                    + "\n6) Buscar, mostrar y modificar objeto (ID)"
                    + "\n7) Buscar, mostrar y modificar objeto (Posicion)"
                    + "\n8) Buscar, mostrar y remover objeto (ID)"
                    + "\n9) Buscar, mostrar y remover objeto (Posicion)"
                    + "\n10) Intercambiar objetos entre posiciones"
                    + "\n11) Vaciar arreglo"
                    + "\n12) Destruir arreglo"
                    + "\n13) Imprimir"));
            switch (opc) {
                case 0:
                    break;
                case 1:
                    xi.insertarTamañoDeArreglo();
                    break;
                case 2:
                    xi.insertarObjetoDeArreglo();
                    break;
                case 3:
                    xi.caso3();
                    break;
                case 4:
                    xi.buscarDefensaPorId();
                    break;
                case 5:
                    xi.buscarPorPosicion();
                    break;
                case 6:
                    xi.cambiarObjetoPorId();
                    break;
                case 7:
                    xi.buscarObjetoPorPocisionYModificar();
                    break;
                case 8:
                    xi.buscarMostrarYEliminarID();
                    break;
                case 9:
                    xi.buscarMostrarYEliminarPorPosicion();
                    break;
                case 10:
                    xi.intercambioDeObjetosEntrePosiciones();
                    break;
                case 11:
                    xi.vaciarObjeto();
                    break;
                case 12:
                    xi.destruirArreglo();
                    break;
                case 13:
                    xi.imprimir();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite una opcion valida");
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
