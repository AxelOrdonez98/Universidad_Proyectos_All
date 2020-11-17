package estructuraSP;
import javax.swing.*;
public class Formulario03 extends JFrame {
    private JLabel label1, label2;
    public Formulario03() {
        setLayout(null);
        label1 = new JLabel("Sistema de facturacion.");
        label1.setBounds(10, 20, 300, 30);
        add(label1);
        label2 = new JLabel("Version 1.0");
        label2.setBounds(10, 100, 100, 30);
        add(label2);
    }
    public static void main(String args[]) {
        Formulario03 formulario = new Formulario03();
        formulario.setBounds(0, 0, 300, 200);
        formulario.setResizable(false);
        formulario.setVisible(true);
    }
}
