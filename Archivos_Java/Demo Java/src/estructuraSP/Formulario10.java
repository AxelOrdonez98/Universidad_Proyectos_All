package estructuraSP;
import javax.swing.*;
import java.awt.event.*;
public class Formulario10 extends JFrame implements ActionListener {
    private JScrollPane scrollepane1;
    private JTextArea textarea1;
    private JButton boton1;
    public Formulario10() {
        setLayout(null);
        textarea1 = new JTextArea();
        scrollepane1 = new JScrollPane(textarea1);
        scrollepane1.setBounds(10, 10, 300, 200);
        add(scrollepane1);
        boton1 = new JButton("Verificar");
        boton1.setBounds(10, 260, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            String texto = textarea1.getText();
            if (texto.indexOf("Argentina") != -1) {
                setTitle("Si contiene el texto argentina");
            } else {
                setTitle("no contiene el texto argentina");
            }
        }
    }
    public static void main(String args[]) {
        Formulario10 formulario = new Formulario10();
        formulario.setBounds(0, 0, 400, 300);
        formulario.setVisible(true);
    }
}