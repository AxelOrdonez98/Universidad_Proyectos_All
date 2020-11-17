package ClaseFILE;

import java.io.File;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Axel Ordoñez
 */
public class Recorrido {
    
     public static javax.swing.tree.DefaultMutableTreeNode treeNode2, treeNode3;
    /*public static void explorar(File f) {
        System.out.print(f);
        for (File file : f.listFiles()) {
            if (file.isDirectory()) {
                explorar(file);
            } else if (file.isFile()) {
                treeNode2 = new javax.swing.tree.DefaultMutableTreeNode(file.getName());
                Practica1.treeNode1.add(treeNode2);
                //System.out.println(file);
            }
        }
    }*/
    public static void explorar(DefaultMutableTreeNode nodoRaiz, String path) {
        File[] files = getListFiles(path);
        for(File file:files) {
            if(file.isDirectory()) {
                DefaultMutableTreeNode nodoCarpeta = new DefaultMutableTreeNode(file.getName());
                explorar(nodoCarpeta, file.getAbsolutePath());
                nodoRaiz.add(nodoCarpeta);
            } else {
                nodoRaiz.add(new DefaultMutableTreeNode(file.getName()));
            }
        }
    }
    private static File[] getListFiles(String Path) {
        File file = new File(Path);
        return file.listFiles();
    }
}
