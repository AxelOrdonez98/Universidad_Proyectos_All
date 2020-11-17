package estructuraSP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class pila007 extends JFrame implements ActionListener {

    private JTextField tf1;
    private JButton boton1;

    public pila007() {

        setLayout(null);
        tf1 = new JTextField("{2*(4-5)-{3*4}-[4-5]}");
        tf1.setBounds(10, 10, 230, 30);
        add(tf1);
        boton1 = new JButton("Verificar formula.");
        boton1.setBounds(10, 70, 180, 30);
        add(boton1);
        boton1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == boton1) {

            if (balanceada()) {

                setTitle("Esto correctamente balanceada.");

            } else {

                setTitle("No esta correctamente balanceada.");

            }

        }

    }

    public boolean balanceada() {
        Pila pila1 = new Pila();

        String cadena = tf1.getText();

        for (int f = 0; f < cadena.length(); f++) {
            if (cadena.charAt(f) == '(' || cadena.charAt(f) == '[' || cadena.charAt(f) == '{') {
                pila1.insertar(cadena.charAt(f));
            } else {
                if (cadena.charAt(f) == ')') {
                    if (pila1.extraer() != '(') {
                        return false;
                    }
                } else {
                    if (cadena.charAt(f) == ']') {
                        if (pila1.extraer() != '[') {
                            return false;
                        }
                    } else {
                        if (cadena.charAt(f) == '}') {
                            if (pila1.extraer() != '{') {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        if (pila1.vacia()) {
            return true;
        } else {
            return false;
        }
    }

    public class Pila {

        class Nodo {

            char simbolo;
            Nodo sig;
        }

        private Nodo raiz;

        public Pila() {
            raiz = null;
        }

        public void insertar(char x) {
            Nodo nuevo;
            nuevo = new Nodo();
            nuevo.simbolo = x;
            if (raiz == null) {
                nuevo.sig = null;
                raiz = nuevo;
            } else {
                nuevo.sig = raiz;
                raiz = nuevo;
            }
        }

        public char extraer() {
            if (raiz != null) {
                char informacion = raiz.simbolo;
                raiz = raiz.sig;
                return informacion;
            } else {
                return Character.MAX_VALUE;
            }
        }

        public boolean vacia() {
            if (raiz == null) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] ar) {
        pila007 formula1 = new pila007();
        formula1.setBounds(0, 0, 350, 140);
        formula1.setVisible(true);
    }
}

