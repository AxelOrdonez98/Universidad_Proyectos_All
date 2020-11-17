package estructuraSP;
import javax.swing.*;
import java.awt.event.*;
public class Formulario11 extends JFrame implements ItemListener{
    private JComboBox combo1;
    public Formulario11() {
        setLayout(null);
        combo1 = new JComboBox();
        combo1.setBounds(10, 10, 80, 20);
        add(combo1);
        combo1.addItem("rojo");
        combo1.addItem("verde");
        combo1.addItem("azul");
        combo1.addItem("amarillo");
        combo1.addItem("negro");
        combo1.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == combo1) {
            String selecionado = (String)combo1.getSelectedItem();
            SetTitle(selecionado);
        }
    }
    public static void main(String args[]) {
        Formulario11 formulario = new Formulario11();
        formulario.setBounds(0, 0, 200, 150);
        formulario.setVisible(true);
    }

    private void SetTitle(String selecionado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
