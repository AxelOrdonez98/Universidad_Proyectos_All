package fromt;

import back.MiFigura;
import static fromt.paint.gruesorDeLinea;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Polygon;
import java.awt.Point;
import static java.nio.file.Files.size;
import java.util.ArrayList;
import javax.swing.JFrame;

public class lienzo extends javax.swing.JPanel {

    /**
     * Creates new form lienzo
     */
    public ArrayList<JPanel> figuras;
    public int xi = 0;
    public int yi = 0;
    public int xf = 0;
    public int yf = 0;
    private String figura;
    private int posX;
    private int posY;
    private int ancho;
    private int alto;
    private Color colorContorno;
    private Color colorRelleno;
    private double grosor;

    public lienzo() {
        initComponents();
        figuras = new ArrayList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        setLayout(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        /*
        JPanel panel = new JPanel();
        int[] xs = new int[5];
        int[] ys = new int[5];
        panel.setBounds((evt.getX() - (paint.alto / 2)), (evt.getY() - (paint.ancho / 2)), paint.alto, paint.ancho);
        this.add(panel);
        Graphics g2 = panel.getGraphics();
        switch (paint.colorContorno) {
            case 0:
                paint.contorno = Color.blue;
                break;
            case 1:
                paint.contorno = Color.red;
                break;
            case 2:
                paint.contorno = Color.YELLOW;
                break;
            case 3:
                paint.contorno = Color.green;
                break;
            case 4:
                paint.contorno = Color.black;
                break;
            case 5:
                paint.contorno = Color.GRAY;
                break;
            case 6:
                paint.contorno = Color.CYAN;
                break;
            case 7:
                paint.contorno = Color.WHITE;
                break;
            case 8:
                paint.contorno = Color.orange;
                break;
            case 9:
                paint.contorno = Color.PINK;
                break;
            case 10:
                paint.contorno = Color.MAGENTA;
                break;
        }
        switch (paint.color) {
            case 0:
                paint.relleno = Color.blue;
                break;
            case 1:
                paint.relleno = Color.red;
                break;
            case 2:
                paint.relleno = Color.YELLOW;
                break;
            case 3:
                paint.relleno = Color.green;
                break;
            case 4:
                paint.relleno = Color.black;
                break;
            case 5:
                paint.relleno = Color.GRAY;
                break;
            case 6:
                paint.relleno = Color.CYAN;
                break;
            case 7:
                paint.relleno = Color.WHITE;
                break;
            case 8:
                paint.relleno = Color.orange;
                break;
            case 9:
                paint.relleno = Color.PINK;
                break;
            case 10:
                paint.relleno = Color.MAGENTA;
                break;
        }

        switch (paint.figura) {
            case 0:
                g2.setColor(paint.relleno);
                g2.fillOval(0, 0, panel.getWidth(), panel.getHeight());
                g2.setColor(paint.contorno);
                g2.drawOval(0, 0, panel.getWidth() - 1, panel.getHeight() - 1);
                break;
            case 1:
                g2.setColor(paint.relleno);
                g2.fillRect(0, 0, panel.getWidth(), panel.getHeight());
                g2.setColor(paint.contorno);
                g2.drawRect(0, 0, panel.getWidth() - 1, panel.getHeight() - 1);
                break;
            case 2:
                xs[0] = (int) (paint.ancho * 0.5);
                ys[0] = (0);
                xs[1] = (paint.ancho - 1);
                ys[1] = (paint.alto - 1);
                xs[2] = (0);
                ys[2] = (paint.alto - 1);
                g2.setColor(paint.relleno);
                g2.fillPolygon(xs, ys, 3);
                g2.setColor(paint.contorno);
                g2.drawPolygon(xs, ys, 3);
                break;
            case 3:
                xs[0] = ((int) (paint.ancho * 0.5));
                ys[0] = (0);
                xs[1] = (paint.ancho - 1);
                ys[1] = (int) (paint.alto / 3);
                xs[2] = ((paint.ancho / 4) + paint.ancho / 2);
                ys[2] = (paint.alto - 1);
                xs[3] = (int) (paint.ancho / 4);
                ys[3] = (paint.alto - 1);
                xs[4] = (0);
                ys[4] = (int) (paint.alto / 3);
                g2.setColor(paint.relleno);
                g2.fillPolygon(xs, ys, 5);
                g2.setColor(paint.contorno);
                g2.drawPolygon(xs, ys, 5);
                break;
            default:
                break;
        }
        figuras.add(panel);
        System.out.print(figuras);
         */
    }//GEN-LAST:event_formMouseClicked

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
        xf = evt.getX();
        yf = evt.getY();
        System.out.println("xi: " + xi + ", yi: " + yi);
        System.out.println("xf: " + xf + ", yf: " + yf);
        ancho = xf - xi;
        alto = yf - yi;
        if (ancho < 0) {
            ancho *= -1;
            xi -= ancho;
            posX = xi;
        }
        if (alto < 0) {
            alto *= -1;
            yi -= alto;
            posY = yi;
        }
        dibujar();
    }//GEN-LAST:event_formMouseReleased

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        xi = evt.getX();
        yi = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        xf = evt.getX();
        yf = evt.getY();
    }//GEN-LAST:event_formMouseDragged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    private void dibujar() {
        int[] xs = new int[5];
        int[] ys = new int[5];
        //this.setBounds(xi, yi, paint.ancho, paint.alto);
        Graphics2D g2;
        g2 = (Graphics2D) this.getGraphics();
        switch (paint.colorContorno) {
            case 0:
                colorContorno = Color.blue;
                break;
            case 1:
                colorContorno = Color.red;
                break;
            case 2:
                colorContorno = Color.YELLOW;
                break;
            case 3:
                colorContorno = Color.green;
                break;
            case 4:
                colorContorno = Color.black;
                break;
            case 5:
                colorContorno = Color.GRAY;
                break;
            case 6:
                colorContorno = Color.CYAN;
                break;
            case 7:
                colorContorno = Color.WHITE;
                break;
            case 8:
                colorContorno = Color.orange;
                break;
            case 9:
                colorContorno = Color.PINK;
                break;
            case 10:
                colorContorno = Color.MAGENTA;
                break;
        }
        switch (paint.color) {
            case 0:
                colorRelleno = Color.blue;
                break;
            case 1:
                colorRelleno = Color.red;
                break;
            case 2:
                colorRelleno = Color.YELLOW;
                break;
            case 3:
                colorRelleno = Color.green;
                break;
            case 4:
                colorRelleno = Color.black;
                break;
            case 5:
                colorRelleno = Color.GRAY;
                break;
            case 6:
                colorRelleno = Color.CYAN;
                break;
            case 7:
                colorRelleno = Color.WHITE;
                break;
            case 8:
                colorRelleno = Color.orange;
                break;
            case 9:
                colorRelleno = Color.PINK;
                break;
            case 10:
                colorRelleno = Color.MAGENTA;
                break;
        }
//        switch (paint.figura) {
//            case "Circulo":
//                g2.setColor(paint.relleno);
//                g2.setStroke(new BasicStroke(paint.gruesorDeLinea));
//                g2.fillOval(0, 0, this.getWidth(), this.getHeight());
//                g2.setColor(paint.contorno);
//                g2.drawOval(0, 0, this.getWidth() - 1, this.getHeight() - 1);
//                break;
//            case "Cuadrado":
//                g2.setColor(paint.relleno);
//                g2.setStroke(new BasicStroke(paint.gruesorDeLinea));
//                g2.fillRect(0, 0, this.getWidth(), this.getHeight());
//                g2.setColor(paint.contorno);
//                g2.drawRect(0, 0, this.getWidth() - 1, this.getHeight() - 1);
//                break;
//            case "Triangulo":
//                xs[0] = (int) (paint.ancho * 0.5);
//                ys[0] = (0);
//                xs[1] = (paint.ancho - 1);
//                ys[1] = (paint.alto - 1);
//                xs[2] = (0);
//                ys[2] = (paint.alto - 1);
//                g2.setColor(paint.relleno);
//                g2.setStroke(new BasicStroke(paint.gruesorDeLinea));
//                g2.fillPolygon(xs, ys, 3);
//                g2.setColor(paint.contorno);
//                g2.drawPolygon(xs, ys, 3);
//                break;
//            case "Pentagono":
//                xs[0] = ((int) (paint.ancho * 0.5));
//                ys[0] = (0);
//                xs[1] = (paint.ancho - 1);
//                ys[1] = (int) (paint.alto / 3);
//                xs[2] = ((paint.ancho / 4) + paint.ancho / 2);
//                ys[2] = (paint.alto - 1);
//                xs[3] = (int) (paint.ancho / 4);
//                ys[3] = (paint.alto - 1);
//                xs[4] = (0);
//                ys[4] = (int) (paint.alto / 3);
//                g2.setColor(paint.relleno);
//                g2.setStroke(new BasicStroke(paint.gruesorDeLinea));
//                g2.fillPolygon(xs, ys, 5);
//                g2.setColor(paint.contorno);
//                g2.drawPolygon(xs, ys, 5);
//                break;
//            case "Linea":
//                g2.setColor(paint.relleno);
//                g2.setStroke(new BasicStroke(paint.gruesorDeLinea));
//                if (xi < yi) {
//                    g2.drawLine(xi, 0, xf, 0);
//                } else if (yi < xi) {
//                    g2.drawLine(0, yi, 0, yf);
//                }
//
//                break;
//            default:
//                break;
//        }
        MiFigura panel = new MiFigura(paint.figura, posX, posY, alto, ancho, colorContorno, colorRelleno, gruesorDeLinea);
        this.add(panel);
        panel.dibujar();
        System.out.print(panel);
    }
}
