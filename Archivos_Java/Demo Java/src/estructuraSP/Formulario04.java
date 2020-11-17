package estructuraSP;
import javax.swing.*;
import java.awt.event.*;
public class Formulario04 extends JFrame implements ActionListener {
    JButton boton1;
    public Formulario04() {
        setLayout(null);
        boton1 = new JButton("Finalizar");
        boton1.setBounds(300, 250, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            System.exit(0);
        }
    }
    public static void main(String args[]) {
        Formulario04 formulario = new Formulario04();
        formulario.setBounds(0, 0, 450, 350);
        formulario.setVisible(true);
    }
}