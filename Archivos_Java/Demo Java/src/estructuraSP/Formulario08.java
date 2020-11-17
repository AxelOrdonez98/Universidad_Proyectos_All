package estructuraSP;
import javax.swing.*;
public class Formulario08 extends JFrame {
    private JTextField textfield1;
    private JTextField textarea1;
    public Formulario08() {
        setLayout(null);
        textfield1 = new JTextField();
        textfield1.setBounds(10, 10, 200, 30);
        add(textfield1);
        textarea1 = new JTextField();
        textarea1.setBounds(10, 50, 400, 300);
        add(textarea1);
    }
    public static void main(String args[]) {
        Formulario08 formulario = new Formulario08();
        formulario.setBounds(0, 0, 540, 400);
        formulario.setVisible(true);
    }
}
