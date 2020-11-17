package ClaseFILEE;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class crearCarpetaYArchivo {

    public String carpeta = "C:\\Users\\Axel Ordoñez\\Desktop/Carpeta creada";
    public String archivo = "\\Archivo creado .txt"; // las diagonales invertidas hacen que el archivo txt se cree dentro de la carpeta
    public String archivoSolo = "Archivo creado solo.txt"; //este archivo solo creara un txt

    public void crear() {
        File crear_carpeta = new File(carpeta); // Archivo file, crea la carpeta tomando la ruta de la variable string "carpeta"
        File crear_archivo = new File(carpeta + archivo); // crea el archvio txt tambien tomando el nombre de la variable "archivo" y lo crea dentro del directorio que se concateno
        File crear_archivo_solo = new File(carpeta + " - "+ archivoSolo); // crea un archivo txt solo, fuera de la carpeta en la misma ruta que se concateno
        if (crear_archivo.exists() && crear_carpeta.exists() && crear_archivo_solo.exists()) { //verifica si los archivos etzisten
            JOptionPane.showMessageDialog(null, "Ya se crearon los archivos krnal");
        } else {
            crear_carpeta.mkdirs(); // crea una carpeta con los directorios
            try { // hace que no se rompa xd
                crear_archivo_solo.createNewFile(); // crea el archivo fuera de la nueva carpeta que va a crear
                crear_archivo.createNewFile(); // crea el archivo dentro de la carpeta que acaba de crear
            } catch (IOException ex) { // hace que no se rompa xd
                Logger.getLogger(crearCarpetaYArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Se acaba  de crear una carpeta y un archivo krnal");
        }
    }

    public static void main(String args[]) {
        crearCarpetaYArchivo xi = new crearCarpetaYArchivo();
        xi.crear();
    }
}
