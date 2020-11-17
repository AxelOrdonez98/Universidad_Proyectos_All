package Persona;
import javax.swing.*;
public class botonesPrueba {
    public static void main (String args[]) {
        botonesPrueba xi = new botonesPrueba();
        String[] carreras = {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7"
        };
        int seleccion = JOptionPane.showOptionDialog(null, "", "", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, carreras, carreras[0]);
    }
}
