package Problema_examen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import Colas_2.Cola;

public class Problema02 extends JFrame implements ActionListener {

    private JButton boton1;
    private JLabel l1, l2, l3, l4, l5;

    public Problema02() {
        setLayout(null);
        boton1 = new JButton("Estacionamiento UNEDL");
        boton1.setBounds(10, 10, 180, 30);
        add(boton1);
        boton1.addActionListener(this);
        l1 = new JLabel("Maestros atendidos a las 6 horas:");
        l1.setBounds(10, 50, 400, 30);
        add(l1);
        l2 = new JLabel("Maestros que se marchan:");
        l2.setBounds(10, 90, 400, 30);
        add(l2);
        l4 = new JLabel("Espacios ocupados: ");
        l4.setBounds(10, 130, 400, 30);
        add(l4);
        l5 = new JLabel("Autos en la cola: ");
        l5.setBounds(10, 170, 400, 30);
        add(l5);
        l3 = new JLabel("Tiempo promedio en cola:");
        l3.setBounds(10, 210, 400, 30);
        add(l3);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            simulacion();
        }
    }

    public void simulacion() {
        int estado1 = 0;
        int marchan = 0;
        int espacios = 25;
        int estacionados = 0;
        int llegada = 3 + (int) (Math.random() * 3);
        int salida1 = -1;
        int cantAte1 = 0;
        int tiempoEnCola = 0;
        int cantidadEnCola = 0;
        Cola cola1 = new Cola();

        for (int minuto = 0; minuto < 1440; minuto++) {
            if (llegada == minuto) {
                if (estado1 == 0) {
                    estado1 = 1;
                    salida1 = minuto + 1 + (int) (Math.random() * 2);
                } else {
                    if (cola1.cantidad() >= 5) {
                        marchan++;
                    } else {
                        if (cola1.cantidad() < 5) {
                            cola1.insertar(minuto);
                        }
                    }
                }
            }

            llegada = minuto + 1 + (int) (Math.random() * 3);

            if (salida1 == minuto) {
                cantAte1++;
                estado1 = 0;
                if (!cola1.vacia()) {
                    estado1 = 1;
                    int m = cola1.extraer();
                    salida1 = minuto + 1 + (int) (Math.random() * 5);
                    tiempoEnCola = tiempoEnCola + (minuto - m);
                    cantidadEnCola++;
                }
            }
            if (cantidadEnCola <= 5) {
                estacionados++;

                if (cantAte1 <= espacios) {
                    int m = cola1.extraer();
                    estacionados = minuto + 1 + (int) (Math.random() * 21);

                    cantidadEnCola++;
                }
            }

        }

        l1.setText("Maestros atendidos a las 6 horas: " + cantAte1);
        l2.setText("Maestros que se marchan: " + marchan);

        l4.setText("Espacios ocupados: " + estacionados);

        l5.setText("Autos en la cola: " + cola1.cantidad());
        if (cantidadEnCola > 0) {
            int tiempoPromedio = tiempoEnCola / cantidadEnCola;
            l3.setText("Tiempo promedio en cola: " + tiempoPromedio);
        }

    }

    public static void main(String[] args) {
        Problema02 maestros = new Problema02();
        maestros.setBounds(0, 0, 440, 350);
        maestros.setVisible(true);
    }
}
