package view;

import dto.ProductoDTO;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import dao.ProductoFDAO;

/**
 *
 * @author 7053
 */
public class ProductoView extends javax.swing.JFrame {

    private ProductoDTO dto;
    private ProductoFDAO dao;

    /**
     * Creates new form ProductoView
     */
    public ProductoView() {
        try {
            initComponents();
            this.setLocationRelativeTo(null);
            dao = new ProductoFDAO();
        } catch (IOException ex) {
            Logger.getLogger(ProductoView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, " NO SE ENCUENTRA EL ARCHIVO " + ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSO = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaListado = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtNombreCel = new javax.swing.JTextField();
        txtROM = new javax.swing.JTextField();
        txtRAM = new javax.swing.JTextField();
        txtBateria = new javax.swing.JTextField();
        txtBotones = new javax.swing.JTextField();
        txtCamaras = new javax.swing.JTextField();
        txtAcabado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jTextField3.setText("jTextField3");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 420, 800));
        setMinimumSize(new java.awt.Dimension(420, 440));
        setPreferredSize(new java.awt.Dimension(762, 464));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("false"), this, org.jdesktop.beansbinding.BeanProperty.create("resizable"));
        bindingGroup.addBinding(binding);

        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 40, 90, 20);

        txtSO.setColumns(3);
        txtSO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSOKeyTyped(evt);
            }
        });
        getContentPane().add(txtSO);
        txtSO.setBounds(180, 80, 110, 25);

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertar);
        btnInsertar.setBounds(310, 210, 80, 23);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(410, 210, 80, 23);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(510, 210, 80, 23);

        btnEliminar.setText("Borrar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(600, 210, 80, 23);

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar);
        btnListar.setBounds(210, 250, 80, 23);

        txaListado.setColumns(20);
        txaListado.setRows(5);
        jScrollPane1.setViewportView(txaListado);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 290, 720, 130);

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 250, 80, 23);

        txtId.setColumns(3);
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        getContentPane().add(txtId);
        txtId.setBounds(180, 40, 110, 25);

        txtNombreCel.setColumns(3);
        txtNombreCel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCelKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombreCel);
        txtNombreCel.setBounds(570, 45, 110, 30);

        txtROM.setColumns(3);
        txtROM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtROMKeyTyped(evt);
            }
        });
        getContentPane().add(txtROM);
        txtROM.setBounds(180, 120, 110, 25);

        txtRAM.setColumns(3);
        txtRAM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRAMKeyTyped(evt);
            }
        });
        getContentPane().add(txtRAM);
        txtRAM.setBounds(570, 90, 110, 25);

        txtBateria.setColumns(3);
        txtBateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBateriaKeyTyped(evt);
            }
        });
        getContentPane().add(txtBateria);
        txtBateria.setBounds(570, 170, 110, 25);

        txtBotones.setColumns(3);
        txtBotones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBotonesKeyTyped(evt);
            }
        });
        getContentPane().add(txtBotones);
        txtBotones.setBounds(180, 200, 110, 25);

        txtCamaras.setColumns(3);
        txtCamaras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCamarasKeyTyped(evt);
            }
        });
        getContentPane().add(txtCamaras);
        txtCamaras.setBounds(570, 130, 110, 25);

        txtAcabado.setColumns(3);
        txtAcabado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAcabadoKeyTyped(evt);
            }
        });
        getContentPane().add(txtAcabado);
        txtAcabado.setBounds(180, 160, 110, 25);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Numero de botones");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 200, 160, 20);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre del celular");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(410, 50, 110, 20);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sistema Operativo");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 80, 130, 20);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tamaño RAM");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(410, 90, 90, 20);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ROM");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 120, 70, 20);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Numero de camaras");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(410, 130, 130, 20);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Acabado final");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 160, 90, 20);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tamaño bateria (mAH)");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(410, 170, 170, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\solda\\Documents\\NetBeansProjects\\RegistrosLongitudFija\\rick.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 760, 460);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if (!txtId.getText().isEmpty() && !txtNombreCel.getText().isEmpty() && !txtSO.getText().isEmpty() && !txtRAM.getText().isEmpty() && !txtROM.getText().isEmpty() && !txtCamaras.getText().isEmpty() && !txtAcabado.getText().isEmpty() && !txtBateria.getText().isEmpty() && !txtBotones.getText().isEmpty()) {
            dto = new ProductoDTO();
            dto.setId(Long.parseLong(txtId.getText()));
            dto.setCpu(new StringBuffer(txtNombreCel.getText()));
            dto.setMotherboard(new StringBuffer(txtSO.getText()));
            dto.setRam(Integer.parseInt(txtRAM.getText()));
            dto.setGpu(new StringBuffer(txtROM.getText()));
            dto.setPsu(Integer.parseInt(txtCamaras.getText()));
            dto.setGabinete(new StringBuffer(txtAcabado.getText()));
            dto.setMonitores(Integer.parseInt(txtBateria.getText()));
            dto.setPrecio(Integer.parseInt(txtBotones.getText()));

            try {
                if (dao.agregar(dto)) {
                    JOptionPane.showMessageDialog(this, " INSERTADO ");
                } else {
                    JOptionPane.showMessageDialog(this, " NO SE PUDO INSERTAR ");
                }
            } catch (IOException ex) {
                Logger.getLogger(ProductoView.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Llena todos los campos");
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String Id = JOptionPane.showInputDialog(" Id a buscar ");
        if ((Id != null) && (Id.length() > 0)) {
            dto = new ProductoDTO();
            dto.setId(Long.parseLong(Id));
            try {
                dto = dao.obtenerPorId(dto);
                if (dto == null) {
                    JOptionPane.showMessageDialog(this, " NO SE ENCONTRO ");
                } else {
                    txtId.setText(String.valueOf(dto.getId()));
                    //txtSO.setText(String.valueOf(dto.getId()));
                    txtNombreCel.setText(dto.getCpu().toString());
                    txtSO.setText(dto.getMotherboard().toString());
                    txtRAM.setText(String.valueOf(dto.getRam()));
                    txtROM.setText(dto.getGpu().toString());
                    txtCamaras.setText(String.valueOf(dto.getPsu()));
                    txtAcabado.setText(dto.getGabinete().toString());
                    txtBateria.setText(String.valueOf(dto.getMonitores()));
                    txtBotones.setText(String.valueOf(dto.getPrecio()));
                }
            } catch (IOException ex) {
                Logger.getLogger(ProductoView.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ProductoView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       dto=new ProductoDTO();
        if (!txtId.getText().isEmpty() && !txtNombreCel.getText().isEmpty() && !txtSO.getText().isEmpty() && !txtRAM.getText().isEmpty() && !txtROM.getText().isEmpty() && !txtCamaras.getText().isEmpty() && !txtAcabado.getText().isEmpty() && !txtBateria.getText().isEmpty() && !txtBotones.getText().isEmpty()) {
            dto.setId(Long.parseLong(txtId.getText()));
            dto.setCpu(new StringBuffer(txtNombreCel.getText()));
            dto.setMotherboard(new StringBuffer(txtSO.getText()));
            dto.setRam(Integer.parseInt(txtRAM.getText()));
            dto.setGpu(new StringBuffer(txtROM.getText()));
            dto.setPsu(Integer.parseInt(txtCamaras.getText()));
            dto.setGabinete(new StringBuffer(txtAcabado.getText()));
            dto.setMonitores(Integer.parseInt(txtBateria.getText()));
            dto.setPrecio(Integer.parseInt(txtBotones.getText()));
            try {
                if (dao.actualizar(dto)) {
                    JOptionPane.showMessageDialog(this, " EDITADO ");
                } else {
                    JOptionPane.showMessageDialog(this, " NO SE PUDO EDITAR ");
                }
            } catch (IOException ex) {
                Logger.getLogger(ProductoView.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Llena todos los datos");
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (!txtId.getText().isEmpty() && !txtNombreCel.getText().isEmpty() && !txtSO.getText().isEmpty() && !txtRAM.getText().isEmpty() && !txtROM.getText().isEmpty() && !txtCamaras.getText().isEmpty() && !txtAcabado.getText().isEmpty() && !txtBateria.getText().isEmpty() && !txtBotones.getText().isEmpty()) {

            dto = new ProductoDTO();
            try {
                if (dao.eliminar(dto)) {
                    JOptionPane.showMessageDialog(this, " BORRADO ");
                } else {
                    JOptionPane.showMessageDialog(this, " NO SE PUDO BORRAR ");
                }
            } catch (IOException ex) {
                Logger.getLogger(ProductoView.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Llena todos los datos");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        try {
            List<ProductoDTO> lista = dao.obtenerTodos();
            if (lista == null || lista.isEmpty()) {
                JOptionPane.showMessageDialog(this, " NO SE ENCONTRO ");
            } else {
                //txaListado.setText(lista.toString());
                txaListado.append(lista.toString() + "\n");
//                txtId.setText(String.valueOf(dto.getId()));
//                txtNombre.setText(dto.getNombre());
//                txtPrecio.setText(String.valueOf(dto.getPrecio()));
//                txtExistencia.setText(String.valueOf(dto.getExistencia()));
            }
        } catch (IOException ex) {
            Logger.getLogger(ProductoView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtId.setText("");
        txtNombreCel.setText("");
        txtSO.setText("");
        txtRAM.setText("");
        txtROM.setText("");
        txtCamaras.setText("");
        txtAcabado.setText("");
        txtBateria.setText("");
        txtBotones.setText("");
        txaListado.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        if (txtId.getText().length() >= 3) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtNombreCelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCelKeyTyped
        if (txtNombreCel.getText().length() >= 15) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreCelKeyTyped

    private void txtSOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSOKeyTyped
        if (txtSO.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSOKeyTyped

    private void txtRAMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRAMKeyTyped
        if (txtRAM.getText().length() >= 3) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRAMKeyTyped

    private void txtROMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtROMKeyTyped
        if (txtROM.getText().length() >= 2) {
            evt.consume();
        }
    }//GEN-LAST:event_txtROMKeyTyped

    private void txtCamarasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCamarasKeyTyped
        if (txtCamaras.getText().length() >= 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCamarasKeyTyped

    private void txtAcabadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAcabadoKeyTyped
        if (txtAcabado.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAcabadoKeyTyped

    private void txtBateriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBateriaKeyTyped
        if (txtBateria.getText().length() >= 4) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBateriaKeyTyped

    private void txtBotonesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBotonesKeyTyped
        if (txtBotones.getText().length() >= 1) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBotonesKeyTyped

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
            java.util.logging.Logger.getLogger(ProductoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextArea txaListado;
    private javax.swing.JTextField txtAcabado;
    private javax.swing.JTextField txtBateria;
    private javax.swing.JTextField txtBotones;
    private javax.swing.JTextField txtCamaras;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombreCel;
    private javax.swing.JTextField txtRAM;
    private javax.swing.JTextField txtROM;
    private javax.swing.JTextField txtSO;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
