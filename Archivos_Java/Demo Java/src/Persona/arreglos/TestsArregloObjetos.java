package Persona.arreglos;
import Persona.Arbitro;
import javax.swing.JOptionPane;
import java.util.*;
public class TestsArregloObjetos {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Arbitro arbitros [];
        arbitros = new Arbitro[2];
        Arbitro arbitro = new Arbitro();
        arbitro.setYearsDeArbitro(Integer.parseInt(JOptionPane.showInputDialog("lol: ")));
        arbitros [1] = arbitro;
        JOptionPane.showMessageDialog(null, Arrays.toString(arbitros));
    }
}