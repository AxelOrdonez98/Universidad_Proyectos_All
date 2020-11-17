package demo;

import java.util.*;
import javax.swing.JOptionPane;

public class Demo {

    public static void main(String[] args) {
        int y;
        Scanner in = new Scanner(System.in);
        System.out.print("Puerba, escanea un numero eh imprime. numero: ");
        y = in.nextInt();
        System.out.println("numero: " + y);
        y = Integer.parseInt(JOptionPane.showInputDialog(null));
        JOptionPane.showConfirmDialog(null, y);
    }
    
}
