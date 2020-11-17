package estructuraSP;
import javax.swing.*;
import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
public class Formulario15 extends JFrame implements ActionListener {
    private JCheckBox check1,check2,check3;
    public Formulario15 () {
        setLayout(null);
        check1 = new JCheckBox("Ingles");
        check1.setBounds(10,10,150,30);
        check1.addActionListener(this);
        add(check1);
        check2 = new JCheckBox("Frances");
        check2.setBounds(10,50,150,30);
        check2.addActionListener(this);
        add(check2);
        check3 = new JCheckBox("Aleman");
        check3.setBounds(10,90,150,30);
        check3.addActionListener(this);
        add(check3);
    }
    public void actionPerformed(ActionEvent e) {
        String cad="";
        if (check1.isSelected() == true) {
            cad = cad+"Ingles-";
        }
        if (check2.isSelected() == true) {
            cad = cad+"Frances-";
        }
        if (check3.isSelected() == true) {
            cad = cad+"Aleman-";
        }
        setTitle(cad);
    }
    public static void main (String[] ar) {
        Formulario15 formulario1 = new Formulario15();
        formulario1.setBounds(0,0,540,400);
        formulario1.setVisible(true);
    }
}