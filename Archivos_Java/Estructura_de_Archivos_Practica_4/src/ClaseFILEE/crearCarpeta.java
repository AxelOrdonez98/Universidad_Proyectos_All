package ClaseFILEE;

import java.io.File;
import javax.swing.JOptionPane;

public class crearCarpeta {

    public static void crear() {
        File carpeta = new File("C:\\Users\\Axel Ordoñez\\Desktop/Carpeta");
        File carpetas = new File("C:\\Users\\Axel Ordoñez\\Desktop/Carpetas/car1/car2/car3/car4/car5");
        if (carpeta.mkdir()) {
            JOptionPane.showMessageDialog(null, "Comando mkdir etzitoso, carpeta creada");
        } else {
            JOptionPane.showMessageDialog(null, "Comando mkdir fallido, carpeta no creada");
        }
        if (carpetas.mkdirs()) {
            JOptionPane.showMessageDialog(null, "Comando mkdirs etzitoso, carpetas creadas");
        } else {
            JOptionPane.showMessageDialog(null, "Comando mkdirs fallido, carpetas no creadas");
        }
    }

    public static void main(String args[]) {
        crear();
    }
}
