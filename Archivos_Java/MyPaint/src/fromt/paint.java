package fromt;

import back.MiFigura;
import java.awt.Color;

public class paint extends javax.swing.JFrame {
    public paint() {
        initComponents();
    }
    public static String figura = "";
    public static int color = 0;
    
    public static int colorContorno = 0;
    public static int gruesorDeLinea = 1;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JTabbedPane();
        jToolBar2 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        comboFig = new javax.swing.JComboBox<>();
        comboColores = new javax.swing.JComboBox<>();
        comboColorContorno = new javax.swing.JComboBox<>();
        slinderAlto = new javax.swing.JSlider();
        slinderAncho = new javax.swing.JSlider();
        ComboGruesor = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        lienzo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 700));
        getContentPane().add(contenedor, java.awt.BorderLayout.CENTER);

        jToolBar2.setRollover(true);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Librerias\\Descargas\\figuras.jpg")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jLabel1.setMinimumSize(new java.awt.Dimension(77, 41));
        jToolBar2.add(jLabel1);

        comboFig.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Circulo", "Cuadrado", "Triangulo", "Pentagono", "Linea" }));
        comboFig.setBorder(javax.swing.BorderFactory.createTitledBorder("Figura"));
        comboFig.setLightWeightPopupEnabled(false);
        comboFig.setMinimumSize(new java.awt.Dimension(77, 41));
        comboFig.setPreferredSize(new java.awt.Dimension(77, 41));
        comboFig.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFigItemStateChanged(evt);
            }
        });
        jToolBar2.add(comboFig);

        comboColores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul", "Rojo", "Amarillo", "Verde", "Negro", "Gris", "Cyan", "Blanco", "Naranja", "Rosa", "Magenta" }));
        comboColores.setBorder(javax.swing.BorderFactory.createTitledBorder("Color de releno"));
        comboColores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboColoresItemStateChanged(evt);
            }
        });
        comboColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboColoresActionPerformed(evt);
            }
        });
        jToolBar2.add(comboColores);

        comboColorContorno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul", "Rojo", "Amarillo", "Verde", "Negro", "Gris", "Cyan", "Blanco", "Naranja", "Rosa", "Magenta" }));
        comboColorContorno.setBorder(javax.swing.BorderFactory.createTitledBorder("Color de contorno"));
        comboColorContorno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboColorContornoItemStateChanged(evt);
            }
        });
        jToolBar2.add(comboColorContorno);

        slinderAlto.setMajorTickSpacing(100);
        slinderAlto.setMaximum(500);
        slinderAlto.setMinorTickSpacing(1);
        slinderAlto.setPaintLabels(true);
        slinderAlto.setPaintTicks(true);
        slinderAlto.setBorder(javax.swing.BorderFactory.createTitledBorder("Anchura"));
        slinderAlto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slinderAltoStateChanged(evt);
            }
        });
        jToolBar2.add(slinderAlto);

        slinderAncho.setMajorTickSpacing(100);
        slinderAncho.setMaximum(500);
        slinderAncho.setMinorTickSpacing(1);
        slinderAncho.setPaintLabels(true);
        slinderAncho.setPaintTicks(true);
        slinderAncho.setBorder(javax.swing.BorderFactory.createTitledBorder("Altura"));
        slinderAncho.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slinderAnchoStateChanged(evt);
            }
        });
        jToolBar2.add(slinderAncho);

        ComboGruesor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        ComboGruesor.setBorder(javax.swing.BorderFactory.createTitledBorder("Gruesor de linea"));
        ComboGruesor.setMinimumSize(new java.awt.Dimension(77, 41));
        ComboGruesor.setPreferredSize(new java.awt.Dimension(77, 41));
        ComboGruesor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboGruesorItemStateChanged(evt);
            }
        });
        jToolBar2.add(ComboGruesor);

        getContentPane().add(jToolBar2, java.awt.BorderLayout.PAGE_START);

        jMenu1.setText("File");

        lienzo.setText("Nuevo Linezo");
        lienzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lienzoActionPerformed(evt);
            }
        });
        jMenu1.add(lienzo);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lienzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lienzoActionPerformed
        lienzo l1 = new lienzo();
        contenedor.add(l1);
    }//GEN-LAST:event_lienzoActionPerformed

    private void comboFigItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFigItemStateChanged
        // TODO add your handling code here:
        figura = (String) comboFig.getSelectedItem();
    }//GEN-LAST:event_comboFigItemStateChanged

    private void comboColoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboColoresItemStateChanged
        // TODO add your handling code here:
        color = (Integer) comboColores.getSelectedIndex();
    }//GEN-LAST:event_comboColoresItemStateChanged

    private void comboColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboColoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboColoresActionPerformed

    private void slinderAltoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slinderAltoStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_slinderAltoStateChanged

    private void slinderAnchoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slinderAnchoStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_slinderAnchoStateChanged

    private void ComboGruesorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboGruesorItemStateChanged
        // TODO add your handling code here:
        gruesorDeLinea = ComboGruesor.getSelectedIndex();
    }//GEN-LAST:event_ComboGruesorItemStateChanged

    private void comboColorContornoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboColorContornoItemStateChanged
        // TODO add your handling code here:
        colorContorno = comboColorContorno.getSelectedIndex();
    }//GEN-LAST:event_comboColorContornoItemStateChanged

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
            java.util.logging.Logger.getLogger(paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboGruesor;
    private javax.swing.JComboBox<String> comboColorContorno;
    private javax.swing.JComboBox<String> comboColores;
    private javax.swing.JComboBox<String> comboFig;
    private javax.swing.JTabbedPane contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JMenuItem lienzo;
    private javax.swing.JSlider slinderAlto;
    private javax.swing.JSlider slinderAncho;
    // End of variables declaration//GEN-END:variables

}
