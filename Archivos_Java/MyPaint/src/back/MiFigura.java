package back;
import fromt.paint;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Objects;
import javax.swing.JPanel;

public final class MiFigura extends JPanel {
    // 4
    private String figura;
    private int posX;
    private int posY;
    private int alto;
    private int ancho;
    private Color colorContorno;
    private Color colorRelleno;
    private double grosor;
    //---------------------------------------------------------------------
    public MiFigura(String figura, int posX, int posY, int alto, int ancho, Color colorContorno, Color colorRelleno, double grosor) {
        setBounds(posX, posY, ancho, alto);
        this.figura = figura;
        this.posX = posX;
        this.posY = posY;
        this.alto = alto;
        this.ancho = ancho;
        this.colorContorno = colorContorno;
        this.colorRelleno = colorRelleno;
        this.grosor = grosor;
    }
    //---------------------------------------------------------------------
    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }
    //---------------------------------------------------------------------
    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }
    //---------------------------------------------------------------------
    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    //---------------------------------------------------------------------
    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    //---------------------------------------------------------------------
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    //---------------------------------------------------------------------
    public Color getColorContorno() {
        return colorContorno;
    }

    public void setColorContorno(Color colorContorno) {
        this.colorContorno = colorContorno;
    }
    //---------------------------------------------------------------------
    public Color getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(Color colorRelleno) {
        this.colorRelleno = colorRelleno;
    }
    //---------------------------------------------------------------------
    public double getGrosor() {
        return grosor;
    }

    public void setGrosor(double grosor) {
        this.grosor = grosor;
    }
    //---------------------------------------------------------------------
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.figura);
        hash = 29 * hash + this.posX;
        hash = 29 * hash + this.posY;
        hash = 29 * hash + this.alto;
        hash = 29 * hash + this.ancho;
        return hash;
    }
    //---------------------------------------------------------------------
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MiFigura other = (MiFigura) obj;
        if (this.posX != other.posX) {
            return false;
        }
        if (this.posY != other.posY) {
            return false;
        }
        if (this.alto != other.alto) {
            return false;
        }
        if (this.ancho != other.ancho) {
            return false;
        }
        if (!Objects.equals(this.figura, other.figura)) {
            return false;
        }
        return true;
    }
    //---------------------------------------------------------------------
    public String toString() {
        return "MiFigura{" + "figura=" + figura + ", posX=" + posX + ", posY=" + posY + ", alto=" + alto + ", ancho=" + ancho + ", colorContorno=" + colorContorno + ", colorRelleno=" + colorRelleno + ", grosor=" + grosor + '}';
    }
    //---------------------------------------------------------------------
    public void dibujar() {
        int[] xs = new int[5];
        int[] ys = new int[5];
        //this.setBounds(xi, yi, paint.ancho, paint.alto);
        Graphics2D g2;
        g2 = (Graphics2D) this.getGraphics();
        
        switch (figura) {
            case "Circulo":
                g2.setColor(colorRelleno);
                g2.setStroke(new BasicStroke((float) grosor));
                g2.fillOval(0, 0, this.getWidth(), this.getHeight());
                g2.setColor(colorContorno);
                g2.drawOval(0, 0, this.getWidth() - 1, this.getHeight() - 1);
                break;
            case "Cuadrado":
                g2.setColor(colorRelleno);
                g2.setStroke(new BasicStroke((float) grosor));
                g2.fillRect(0, 0, this.getWidth(), this.getHeight());
                g2.setColor(colorContorno);
                g2.drawRect(0, 0, this.getWidth() - 1, this.getHeight() - 1);
                break;
            case "Triangulo":
                xs[0] = (int) (ancho * 0.5);
                ys[0] = (0);
                xs[1] = (ancho - 1);
                ys[1] = (alto - 1);
                xs[2] = (0);
                ys[2] = (alto - 1);
                g2.setColor(colorRelleno);
                g2.setStroke(new BasicStroke((float) grosor));
                g2.fillPolygon(xs, ys, 3);
                g2.setColor(colorContorno);
                g2.drawPolygon(xs, ys, 3);
                break;
            case "Pentagono":
                xs[0] = ((int) (ancho * 0.5));
                ys[0] = (0);
                xs[1] = (ancho - 1);
                ys[1] = (int) (alto / 3);
                xs[2] = ((ancho / 4) + ancho / 2);
                ys[2] = (alto - 1);
                xs[3] = (int) (ancho / 4);
                ys[3] = (alto - 1);
                xs[4] = (0);
                ys[4] = (int) (alto / 3);
                g2.setColor(colorRelleno);
                g2.setStroke(new BasicStroke((float) grosor));
                g2.fillPolygon(xs, ys, 5);
                g2.setColor(colorContorno);
                g2.drawPolygon(xs, ys, 5);
                break;
            case "Linea":
                g2.setColor(colorRelleno);
                g2.setStroke(new BasicStroke((float) grosor));
                break;
            default:
                break;
        }
    }
}