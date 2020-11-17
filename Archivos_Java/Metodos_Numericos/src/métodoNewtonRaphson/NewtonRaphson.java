package métodoNewtonRaphson;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NewtonRaphson extends javax.swing.JFrame {

    DefaultTableModel modelo;
    private int iteracion = 0;
    private double errorRelativoIteracion = 1.0;
    private double raiz = 0;
    private double roundedError = 0;
    private double roundedXi = 0;
    private String texto = "";

    public NewtonRaphson() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        txtX6 = new javax.swing.JTextField();
        txtX5 = new javax.swing.JTextField();
        txtX4 = new javax.swing.JTextField();
        txtX3 = new javax.swing.JTextField();
        txtX2 = new javax.swing.JTextField();
        txtX = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPorcentajeError = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        spinnerNumeroDecimales = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        txtValorInicio = new javax.swing.JTextField();
        btComenzar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaR = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        rbtnC = new javax.swing.JRadioButton();
        rbtnX = new javax.swing.JRadioButton();
        rbtnX2 = new javax.swing.JRadioButton();
        rbtnX3 = new javax.swing.JRadioButton();
        rbtnX4 = new javax.swing.JRadioButton();
        rbtnX5 = new javax.swing.JRadioButton();
        rbtnX6 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(1000, 666));
        setPreferredSize(new java.awt.Dimension(495, 626));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("false"), this, org.jdesktop.beansbinding.BeanProperty.create("resizable"));
        bindingGroup.addBinding(binding);

        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(153, 0, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("  Metodo de Newton Raphson");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 490, 90);

        txtX6.setText("0");
        txtX6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtX6ActionPerformed(evt);
            }
        });
        txtX6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX6KeyTyped(evt);
            }
        });
        getContentPane().add(txtX6);
        txtX6.setBounds(30, 110, 50, 30);

        txtX5.setText("0");
        txtX5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX5KeyTyped(evt);
            }
        });
        getContentPane().add(txtX5);
        txtX5.setBounds(90, 110, 50, 30);

        txtX4.setText("0");
        txtX4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX4KeyTyped(evt);
            }
        });
        getContentPane().add(txtX4);
        txtX4.setBounds(150, 110, 50, 30);

        txtX3.setText("0");
        txtX3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX3KeyTyped(evt);
            }
        });
        getContentPane().add(txtX3);
        txtX3.setBounds(210, 110, 50, 30);

        txtX2.setText("0");
        txtX2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX2KeyTyped(evt);
            }
        });
        getContentPane().add(txtX2);
        txtX2.setBounds(270, 110, 50, 30);

        txtX.setText("0");
        txtX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtXKeyTyped(evt);
            }
        });
        getContentPane().add(txtX);
        txtX.setBounds(330, 110, 50, 30);

        txtC.setText("0");
        txtC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCKeyTyped(evt);
            }
        });
        getContentPane().add(txtC);
        txtC.setBounds(390, 110, 50, 30);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Error %");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 230, 150, 30);

        txtPorcentajeError.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPorcentajeErrorKeyTyped(evt);
            }
        });
        getContentPane().add(txtPorcentajeError);
        txtPorcentajeError.setBounds(220, 230, 110, 30);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Número Decimales");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 270, 170, 30);

        spinnerNumeroDecimales.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        getContentPane().add(spinnerNumeroDecimales);
        spinnerNumeroDecimales.setBounds(220, 270, 110, 30);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Valor de inicio (Xi):");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 190, 160, 30);

        txtValorInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorInicioKeyTyped(evt);
            }
        });
        getContentPane().add(txtValorInicio);
        txtValorInicio.setBounds(220, 190, 110, 30);

        btComenzar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btComenzar.setText("Calcular");
        btComenzar.setBorder(null);
        btComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComenzarActionPerformed(evt);
            }
        });
        getContentPane().add(btComenzar);
        btComenzar.setBounds(170, 310, 150, 30);

        txtAreaR.setColumns(20);
        txtAreaR.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtAreaR.setRows(5);
        jScrollPane2.setViewportView(txtAreaR);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 350, 460, 230);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setText("x");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(40, 80, 40, 30);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setText("6");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(50, 70, 40, 30);

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setText("5");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(110, 70, 40, 30);

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel19.setText("x");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(100, 80, 40, 30);

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel20.setText("4");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(170, 70, 40, 30);

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel21.setText("x");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(160, 80, 40, 30);

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel22.setText("3");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(230, 70, 40, 30);

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel23.setText("x");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(220, 80, 40, 30);

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel24.setText("2");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(290, 70, 40, 30);

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel25.setText("x");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(280, 80, 40, 30);

        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel27.setText("x");
        getContentPane().add(jLabel27);
        jLabel27.setBounds(340, 80, 40, 30);

        jLabel29.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel29.setText("c");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(400, 80, 40, 30);

        rbtnC.setForeground(new java.awt.Color(204, 204, 204));
        rbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnC);
        rbtnC.setBounds(400, 150, 21, 21);

        rbtnX.setForeground(new java.awt.Color(204, 204, 204));
        rbtnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnXActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnX);
        rbtnX.setBounds(340, 150, 21, 21);

        rbtnX2.setForeground(new java.awt.Color(204, 204, 204));
        rbtnX2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnX2ActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnX2);
        rbtnX2.setBounds(280, 150, 21, 21);

        rbtnX3.setForeground(new java.awt.Color(204, 204, 204));
        rbtnX3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnX3ActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnX3);
        rbtnX3.setBounds(220, 150, 21, 21);

        rbtnX4.setForeground(new java.awt.Color(204, 204, 204));
        rbtnX4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnX4ActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnX4);
        rbtnX4.setBounds(160, 150, 21, 21);

        rbtnX5.setForeground(new java.awt.Color(204, 204, 204));
        rbtnX5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnX5ActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnX5);
        rbtnX5.setBounds(100, 150, 21, 21);

        rbtnX6.setForeground(new java.awt.Color(204, 204, 204));
        rbtnX6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnX6ActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnX6);
        rbtnX6.setBounds(40, 150, 21, 21);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtX6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtX6ActionPerformed

    }//GEN-LAST:event_txtX6ActionPerformed

    private void txtPorcentajeErrorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentajeErrorKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 44) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_txtPorcentajeErrorKeyTyped

    private void txtX6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX6KeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 44) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_txtX6KeyTyped

    private void txtX5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX5KeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 44) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_txtX5KeyTyped

    private void txtX4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX4KeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 44) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_txtX4KeyTyped

    private void txtX3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX3KeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 44) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_txtX3KeyTyped

    private void txtX2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX2KeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 44) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_txtX2KeyTyped

    private void txtXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtXKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 44) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_txtXKeyTyped

    private void txtCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 44) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_txtCKeyTyped

    private void txtValorInicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorInicioKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 44) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_txtValorInicioKeyTyped

    private void btComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComenzarActionPerformed

        try {

            //porcentaje de error
            double porcentajeError = Double.parseDouble(txtPorcentajeError.getText());
            //Valores de la función
            double x6 = Double.parseDouble(txtX6.getText());
            double x5 = Double.parseDouble(txtX5.getText());
            double x4 = Double.parseDouble(txtX4.getText());
            double x3 = Double.parseDouble(txtX3.getText());
            double x2 = Double.parseDouble(txtX2.getText());
            double x = Double.parseDouble(txtX.getText());
            double c = Double.parseDouble(txtC.getText());
            //Valores Exponentes
            double exp6 = 6.0;
            double exp5 = 5.0;
            double exp4 = 4.0;
            double exp3 = 3.0;
            double exp2 = 2.0;
            double exp1 = 1.0;
            double exp0 = 0.0;

            double xi = Double.parseDouble(txtValorInicio.getText());
            //Valores Para los Raounded
            int decimal1 = (int) (Math.pow(10, (int) spinnerNumeroDecimales.getValue()));
            double decimal2 = (double) decimal1;

            double Fx0 = x6 * (Math.pow(xi, exp6)) + x5 * (Math.pow(xi, exp5))
                    + x4 * (Math.pow(xi, exp4)) + x3 * (Math.pow(xi, exp3)) + x2 * (Math.pow(xi, exp2))
                    + x * (Math.pow(xi, exp1)) + c;
            double DerivadaFx0 = x6 * exp6 * (Math.pow(xi, exp5)) + x5 * exp5 * (Math.pow(xi, exp4))
                    + x4 * exp4 * (Math.pow(xi, exp3)) + x3 * exp3 * (Math.pow(xi, exp2))
                    + x2 * exp2 * (Math.pow(xi, exp1)) + x * exp1 * (Math.pow(xi, exp0));

            System.out.println("Fx0: " + Fx0);
            System.out.println("F'x0: " + DerivadaFx0);
            System.out.println("XI: " + xi);
            double auxXi;

            do {
                iteracion++;
                auxXi = xi;
                System.out.println("\nAuxXi: " + auxXi);

                Fx0 = x6 * (Math.pow(xi, exp6)) + x5 * (Math.pow(xi, exp5))
                        + x4 * (Math.pow(xi, exp4)) + x3 * (Math.pow(xi, exp3)) + x2 * (Math.pow(xi, exp2))
                        + x * (Math.pow(xi, exp1)) + c;
                DerivadaFx0 = x6 * exp6 * (Math.pow(xi, exp5)) + x5 * exp5 * (Math.pow(xi, exp4))
                        + x4 * exp4 * (Math.pow(xi, exp3)) + x3 * exp3 * (Math.pow(xi, exp2))
                        + x2 * exp2 * (Math.pow(xi, exp1)) + x * exp1 * (Math.pow(xi, exp0));
                System.out.println("Fx0: " + Fx0);
                System.out.println("F'x0: " + DerivadaFx0+"\nn");

                xi = xi - (Fx0 / DerivadaFx0);
                System.out.println("xi: " + xi+"\nn");

                errorRelativoIteracion = Math.abs(((xi - auxXi) / xi) * 100);
                System.out.println("Error: " + errorRelativoIteracion);

                roundedError = Math.round(errorRelativoIteracion * decimal1) / decimal2;
                roundedXi = Math.round(xi * decimal1) / decimal2;

                
                   txtAreaR.setText("iteracion ("+iteracion+")"+"\nerror Relativo: "+roundedError+"\nvalor de x: "+roundedXi+"\n\n");
            texto+=txtAreaR.getText();

            } while (iteracion <= 50 && porcentajeError <= roundedError);
            txtAreaR.setText(texto);
             texto="";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "llene los campos");
        }


    }//GEN-LAST:event_btComenzarActionPerformed

    private void rbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCActionPerformed
        // TODO add your handling code here:
        if (rbtnC.isSelected()) {
            txtC.setText(String.valueOf(0));
            txtC.setEnabled(false);
        } else {
            txtC.setEnabled(true);
        }
    }//GEN-LAST:event_rbtnCActionPerformed

    private void rbtnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnXActionPerformed
        // TODO add your handling code here:
        if (rbtnX.isSelected()) {
            txtX.setText(String.valueOf(0));
            txtX.setEnabled(false);
        } else {
            txtX.setEnabled(true);
        }
    }//GEN-LAST:event_rbtnXActionPerformed

    private void rbtnX2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnX2ActionPerformed
        // TODO add your handling code here:
        if (rbtnX2.isSelected()) {
            txtX2.setText(String.valueOf(0));
            txtX2.setEnabled(false);
        } else {
            txtX2.setEnabled(true);
        }
    }//GEN-LAST:event_rbtnX2ActionPerformed

    private void rbtnX3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnX3ActionPerformed
        // TODO add your handling code here:
        if (rbtnX3.isSelected()) {
            txtX3.setText(String.valueOf(0));
            txtX3.setEnabled(false);
        } else {
            txtX3.setEnabled(true);
        }
    }//GEN-LAST:event_rbtnX3ActionPerformed

    private void rbtnX4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnX4ActionPerformed
        // TODO add your handling code here:
        if (rbtnX4.isSelected()) {
            txtX4.setText(String.valueOf(0));
            txtX4.setEnabled(false);
        } else {
            txtX4.setEnabled(true);
        }
    }//GEN-LAST:event_rbtnX4ActionPerformed

    private void rbtnX5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnX5ActionPerformed
        // TODO add your handling code here:
        if (rbtnX5.isSelected()) {
            txtX5.setText(String.valueOf(0));
            txtX5.setEnabled(false);
        } else {
            txtX5.setEnabled(true);
        }
    }//GEN-LAST:event_rbtnX5ActionPerformed

    private void rbtnX6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnX6ActionPerformed
        // TODO add your handling code here:
        if (rbtnX6.isSelected()) {
            txtX6.setText(String.valueOf(0));
            txtX6.setEnabled(false);
        } else {
            txtX6.setEnabled(true);
        }
    }//GEN-LAST:event_rbtnX6ActionPerformed

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
            java.util.logging.Logger.getLogger(NewtonRaphson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewtonRaphson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewtonRaphson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewtonRaphson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewtonRaphson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btComenzar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbtnC;
    private javax.swing.JRadioButton rbtnX;
    private javax.swing.JRadioButton rbtnX2;
    private javax.swing.JRadioButton rbtnX3;
    private javax.swing.JRadioButton rbtnX4;
    private javax.swing.JRadioButton rbtnX5;
    private javax.swing.JRadioButton rbtnX6;
    private javax.swing.JSpinner spinnerNumeroDecimales;
    private javax.swing.JTextArea txtAreaR;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtPorcentajeError;
    private javax.swing.JTextField txtValorInicio;
    private javax.swing.JTextField txtX;
    private javax.swing.JTextField txtX2;
    private javax.swing.JTextField txtX3;
    private javax.swing.JTextField txtX4;
    private javax.swing.JTextField txtX5;
    private javax.swing.JTextField txtX6;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
