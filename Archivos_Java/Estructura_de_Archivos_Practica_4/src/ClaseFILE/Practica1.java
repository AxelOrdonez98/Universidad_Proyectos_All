package ClaseFILE;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import static java.nio.file.Files.write;
import static java.nio.file.Files.write;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.layout.TilePane;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import jdk.jfr.events.FileReadEvent;

/**
 *
 * @author Axel Ordoñez
 */
public class Practica1 extends javax.swing.JFrame {

    private Editor e;
    int cont = 0;
    private JFileChooser selector;
    private File archivo;
    public static javax.swing.tree.DefaultMutableTreeNode treeNode1;
    public String rutaSeleccionada;
    public int clickCount;

    /**
     * Creates new form Practica1
     */
    public Practica1() {
        initComponents();
        archivo = new File("C:\\Users\\Axel Ordoñez\\Documents\\1\\");
        actualizarArbol();
        selector = new JFileChooser(new File("C:\\Users\\Axel Ordoñez\\Documents\\1\\"));

        //javax.swing.tree.DefaultMutableTreeNode treeNode5 = new javax.swing.tree.DefaultMutableTreeNode(new File("C:\\Users\\Axel Ordoñez\\Desktop/x.txt"));
        //System.out.println(JArbol.getModel().get);
        //System.out.println(JArbol.getModel().getRoot().toString());
        // ((DefaultMutableTreeNode)JArbol.getModel().getChild(e, WIDTH).add(treeNode5);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPopMenu = new javax.swing.JPopupMenu();
        ItemActualizar = new javax.swing.JCheckBoxMenuItem();
        ItemAgregar = new javax.swing.JCheckBoxMenuItem();
        ItemEliminar = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        BotonNuevo = new javax.swing.JButton();
        BotonAbiri = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        BotonGuardarComo = new javax.swing.JButton();
        BotonGuardarTodo = new javax.swing.JButton();
        BotonCerrar = new javax.swing.JButton();
        BotonCerrarTodo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JArbol = new javax.swing.JTree();
        TBPContedors = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        ItemActualizar.setSelected(true);
        ItemActualizar.setText("Actualizar");
        ItemActualizar.setToolTipText("");
        ItemActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemActualizarActionPerformed(evt);
            }
        });
        JPopMenu.add(ItemActualizar);

        ItemAgregar.setSelected(true);
        ItemAgregar.setText("Agregar");
        ItemAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemAgregarActionPerformed(evt);
            }
        });
        JPopMenu.add(ItemAgregar);

        ItemEliminar.setSelected(true);
        ItemEliminar.setText("Eliminar");
        ItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemEliminarActionPerformed(evt);
            }
        });
        JPopMenu.add(ItemEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);

        BotonNuevo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Axel Ordoñez\\Documents\\NetBeansProjects\\Estructura_de_Archivos_Practica_4\\Iconos\\nuevo.png")); // NOI18N
        BotonNuevo.setToolTipText("Nuevo");
        BotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoActionPerformed(evt);
            }
        });
        jPanel3.add(BotonNuevo);

        BotonAbiri.setIcon(new javax.swing.ImageIcon("C:\\Users\\Axel Ordoñez\\Documents\\NetBeansProjects\\Estructura_de_Archivos_Practica_4\\Iconos\\abrir.png")); // NOI18N
        BotonAbiri.setToolTipText("Abrir");
        BotonAbiri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAbiriActionPerformed(evt);
            }
        });
        jPanel3.add(BotonAbiri);

        BotonGuardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Axel Ordoñez\\Documents\\NetBeansProjects\\Estructura_de_Archivos_Practica_4\\Iconos\\guardar.png")); // NOI18N
        BotonGuardar.setToolTipText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(BotonGuardar);

        BotonGuardarComo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Axel Ordoñez\\Documents\\NetBeansProjects\\Estructura_de_Archivos_Practica_4\\Iconos\\guardar como.png")); // NOI18N
        BotonGuardarComo.setToolTipText("Guardar como");
        BotonGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarComoActionPerformed(evt);
            }
        });
        jPanel3.add(BotonGuardarComo);

        BotonGuardarTodo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Axel Ordoñez\\Documents\\NetBeansProjects\\Estructura_de_Archivos_Practica_4\\Iconos\\guardar todo.png")); // NOI18N
        BotonGuardarTodo.setToolTipText("Guardar todo");
        BotonGuardarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarTodoActionPerformed(evt);
            }
        });
        jPanel3.add(BotonGuardarTodo);

        BotonCerrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Axel Ordoñez\\Documents\\NetBeansProjects\\Estructura_de_Archivos_Practica_4\\Iconos\\cerrar.png")); // NOI18N
        BotonCerrar.setToolTipText("Cerrar");
        BotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarActionPerformed(evt);
            }
        });
        jPanel3.add(BotonCerrar);

        BotonCerrarTodo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Axel Ordoñez\\Documents\\NetBeansProjects\\Estructura_de_Archivos_Practica_4\\Iconos\\cerrar todo.png")); // NOI18N
        BotonCerrarTodo.setToolTipText("Cerrar todos");
        BotonCerrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarTodoActionPerformed(evt);
            }
        });
        jPanel3.add(BotonCerrarTodo);

        jTabbedPane1.addTab("tap1", jPanel3);

        jButton1.setText("jButton1");
        jPanel2.add(jButton1);

        jButton2.setText("jButton2");
        jPanel2.add(jButton2);

        jTabbedPane1.addTab("tap2", jPanel2);

        jToolBar1.add(jTabbedPane1);

        jPanel1.add(jToolBar1, java.awt.BorderLayout.NORTH);

        JArbol.setToolTipText("Archivos");
        JArbol.setComponentPopupMenu(JPopMenu);
        JArbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JArbolMouseClicked(evt);
            }
        });
        JArbol.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                JArbolValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(JArbol);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.LINE_START);
        jPanel1.add(TBPContedors, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void BotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoActionPerformed
        // ejemplo de internacionalizacion en java
        String nombre = JOptionPane.showInputDialog(this, "Introduce el nombre del archivo");
        nombre = nombre.concat(".txt");
        e = new Editor(nombre);
        TBPContedors.add(nombre, e);
        cont++;
    }//GEN-LAST:event_BotonNuevoActionPerformed

    private void BotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarActionPerformed
        if (TBPContedors.getSelectedComponent() == null) {
            JOptionPane.showMessageDialog(null, "No hay nada que cerrar");
        } else {
            e = (Editor) TBPContedors.getSelectedComponent();
            System.out.println(e.getArchivo().getName());
            if (e.isEditado() == false) {
                cont--;
                TBPContedors.remove(TBPContedors.getSelectedIndex());
            } else {
                cont--;
                int seleccion = TBPContedors.getSelectedIndex();
                int cerrar = JOptionPane.showConfirmDialog(TBPContedors, "Desea salir sin guardar?", "Advertencia", JOptionPane.YES_NO_OPTION);
                if (cerrar == JOptionPane.NO_OPTION) {
                    String escritura = e.getjEditorPane1().getText();
                    try (FileWriter entrada = new FileWriter(e.getArchivo().getName());
                            BufferedWriter bw = new BufferedWriter(entrada)) {
                        bw.write(escritura);
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    JOptionPane.showMessageDialog(null, "Se guardo correctamente");
                }
                TBPContedors.remove(seleccion);
            }
        }
    }//GEN-LAST:event_BotonCerrarActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        // TODO add your handling code here:
        if (TBPContedors.getSelectedComponent() == null) {
            JOptionPane.showMessageDialog(null, "No hay nada que guardar");
        } else {
            e = (Editor) TBPContedors.getSelectedComponent();
            String escritura = e.getjEditorPane1().getText();
            try (FileWriter entrada = new FileWriter(e.getArchivo().getName());
                    BufferedWriter bw = new BufferedWriter(entrada)) {
                bw.write(escritura);
            } catch (IOException ee) {
                System.out.println(ee);
            }
            JOptionPane.showMessageDialog(null, "Se guardo correctamente");
        }

    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonGuardarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarTodoActionPerformed
        // TODO add your handling code here:
        if (TBPContedors.getSelectedComponent() == null) {
            JOptionPane.showMessageDialog(null, "No hay nada que guardar");
        } else {
            String[] guardar = new String[cont];
            e = (Editor) TBPContedors.getSelectedComponent();
            for (int i = 0; i < guardar.length; i++) {
                String escritura = e.getjEditorPane1().getText();
                try (FileWriter entrada = new FileWriter(e.getArchivo().getName());
                        BufferedWriter bw = new BufferedWriter(entrada)) {
                    bw.write(escritura);
                } catch (IOException ee) {
                    System.out.println(ee);
                }
            }
            JOptionPane.showMessageDialog(null, "Todo se guardo correctamente");
        }

    }//GEN-LAST:event_BotonGuardarTodoActionPerformed

    private void BotonGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarComoActionPerformed
        if (TBPContedors.getSelectedComponent() == null) {
            JOptionPane.showMessageDialog(null, "No hay nada que cerrar");
        } else {
            e = (Editor) TBPContedors.getSelectedComponent();
            String escritura = e.getjEditorPane1().getText();
            String ruta = JOptionPane.showInputDialog("Ingrese la ruta: ");
            String nombreNew = JOptionPane.showInputDialog("Ingrese un nuevo nombre sin extencion: ");
            nombreNew = nombreNew.concat(".txt");
            try (FileWriter archivoNuevo = new FileWriter(ruta + nombreNew);
                    BufferedWriter bw = new BufferedWriter(archivoNuevo)) {
                bw.write(escritura);
                TBPContedors.setTitleAt(TBPContedors.getSelectedIndex(), nombreNew);
                JOptionPane.showMessageDialog(null, "El archivo se guardo con el nombre: " + nombreNew + "\nEn la ruta: " + ruta);
            } catch (IOException ex) {
                Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
            }
            actualizarArbol();
        }
    }//GEN-LAST:event_BotonGuardarComoActionPerformed

    private void BotonAbiriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAbiriActionPerformed
        try {
            FileFilter filt = new FileNameExtensionFilter("Archivo txt", "txt");
    selector.addChoosableFileFilter(filt);
            selector.setFileFilter(filt);
            int value = selector.showOpenDialog(this);
            
             if(value == JFileChooser.APPROVE_OPTION){

            archivo = selector.getSelectedFile();
            Scanner in;
            in = new Scanner(new FileReader(archivo));
            StringBuilder sb = new StringBuilder();
            while(in.hasNext()) {
                sb.append(" " + in.next());
            }
            in.close();
            String text = sb.toString();
            e = new Editor(archivo, text);
            e.setEditado(false);
            System.out.println(archivo);
            TBPContedors.add(archivo.getName(), e);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonAbiriActionPerformed

    private void BotonCerrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarTodoActionPerformed
        if (TBPContedors.getSelectedComponent() == null) {
            JOptionPane.showMessageDialog(null, "No hay nada que cerrar");
        } else {
            e = (Editor) TBPContedors.getSelectedComponent();
            System.out.println(e.getArchivo().getName());
            if (e.isEditado() == false) {
                do {
                    TBPContedors.remove(TBPContedors.getSelectedIndex());
                    cont--;
                } while (cont != 0);
            } else {
                int seleccion = TBPContedors.getSelectedIndex();
                int cerrar = JOptionPane.showConfirmDialog(TBPContedors, "Desea salir sin guardar?", "Advertencia", JOptionPane.YES_NO_OPTION);
                if (cerrar == JOptionPane.NO_OPTION) {
                    do {
                        String escritura = e.getjEditorPane1().getText();
                        try (FileWriter entrada = new FileWriter(e.getArchivo().getName());
                                BufferedWriter bw = new BufferedWriter(entrada)) {
                            bw.write(escritura);
                        } catch (IOException e) {
                            System.out.println(e);
                        }
                        TBPContedors.remove(seleccion);
                        cont--;
                    } while (cont != 0);
                    JOptionPane.showMessageDialog(null, "Se guardo correctamente");
                }
            }
        }
    }//GEN-LAST:event_BotonCerrarTodoActionPerformed

    private void ItemActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemActualizarActionPerformed
        actualizarArbol();
    }//GEN-LAST:event_ItemActualizarActionPerformed

    private void ItemAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemAgregarActionPerformed
        try {
            File file = new File(rutaSeleccionada);
            if (file.isFile()) {
                JOptionPane.showMessageDialog(null, "No puedes agregar un archivo a otro archivo");
            } else {
                String nombre = JOptionPane.showInputDialog("Ingresa nombre del archivo");
                System.out.println(nombre);
                rutaSeleccionada += "\\" + nombre;
                System.out.println(rutaSeleccionada);
                File f = new File(rutaSeleccionada);
                if (nombre.contains(".")) {
                    try {
                        f.createNewFile();
                    } catch (IOException ex) {
                        Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    f.mkdir();
                    File filea = new File(rutaSeleccionada + "\1.txt" );
                    try {
                        filea.createNewFile();
                    } catch (IOException ex) {
                        Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                actualizarArbol();
            }
        } catch (NullPointerException ee) {
            JOptionPane.showMessageDialog(null, "Selecciona una carpeta o archivo");
        }
    }//GEN-LAST:event_ItemAgregarActionPerformed

    private void ItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemEliminarActionPerformed
        try {
            File file = new File(rutaSeleccionada);
            if (file.isFile()) {
                file.delete();
                System.out.println("Borrando: " + file.getName());
            } else {
                File[] listFiles = file.listFiles();
                for (File file2 : listFiles) {
                    System.out.println("Borrando: " + file2.getName());
                    file2.delete();
                }
                file.delete();
            }
            actualizarArbol();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Selecciona una carpeta o archivo");
        }
    }//GEN-LAST:event_ItemEliminarActionPerformed

    private void JArbolValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_JArbolValueChanged
        TreePath tp = evt.getPath();
        System.out.println("Archivo: " + tp.getLastPathComponent());
        System.out.println("Ruta: " + tp);
        Object archivos[] = tp.getPath();
        rutaSeleccionada = "C:\\Users\\Axel Ordoñez\\Documents\\1";
        for (int i = 0; i < archivos.length; i++) {
            rutaSeleccionada += "\\" + archivos[i];
        }
        System.out.println(rutaSeleccionada);
    }//GEN-LAST:event_JArbolValueChanged

    private void JArbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JArbolMouseClicked
        // TODO add your handling code here:
        clickCount = evt.getClickCount();
        if (clickCount == 2) {
            File file =new File(rutaSeleccionada);
            
             if (file.isFile()) {
                 try {
            Scanner in = new Scanner(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            while(in.hasNext()) {
                sb.append(" " + in.next());
            }
            in.close();
            String text = sb.toString();
            e = new Editor(file, text);
            e.setEditado(false);
            System.out.println(file);
            TBPContedors.add(file.getName(), e);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
        }
             }
        }
    }//GEN-LAST:event_JArbolMouseClicked
    //

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Practica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica1().setVisible(true);
            }
        });
    }

    public void actualizarArbol() {
        DefaultMutableTreeNode nodoRaiz = new DefaultMutableTreeNode("");
        Recorrido.explorar(nodoRaiz, "C:\\Users\\Axel Ordoñez\\Documents\\1");
        JArbol.setModel(new javax.swing.tree.DefaultTreeModel(nodoRaiz));
    }

//hentaicrush
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAbiri;
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JButton BotonCerrarTodo;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonGuardarComo;
    private javax.swing.JButton BotonGuardarTodo;
    private javax.swing.JButton BotonNuevo;
    private javax.swing.JCheckBoxMenuItem ItemActualizar;
    private javax.swing.JCheckBoxMenuItem ItemAgregar;
    private javax.swing.JCheckBoxMenuItem ItemEliminar;
    private javax.swing.JTree JArbol;
    private javax.swing.JPopupMenu JPopMenu;
    private javax.swing.JTabbedPane TBPContedors;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}