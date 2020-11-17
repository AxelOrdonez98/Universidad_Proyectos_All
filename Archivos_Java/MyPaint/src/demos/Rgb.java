package demos;
import java.awt.Color;
public class Rgb extends javax.swing.JFrame {

    public Rgb() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        comboRojo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        comboVerde = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        comboAzul = new javax.swing.JComboBox<>();
        panelColorCombo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spinnerRojo = new javax.swing.JSpinner();
        spinnerVerde = new javax.swing.JSpinner();
        spinnerAzul = new javax.swing.JSpinner();
        panelColoorSpinner = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        sliderRojo = new javax.swing.JSlider();
        sliderVerde = new javax.swing.JSlider();
        sliderAzul = new javax.swing.JSlider();
        panelColorSlinder = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 800));
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel11.setLayout(new javax.swing.BoxLayout(jPanel11, javax.swing.BoxLayout.LINE_AXIS));

        jLabel7.setText("Rojo");
        jPanel11.add(jLabel7);

        comboRojo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120", "121", "122", "123", "124", "125", "126", "127", "128", "129", "130", "131", "132", "133", "134", "135", "136", "137", "138", "139", "140", "141", "142", "143", "144", "145", "146", "147", "148", "149", "150", "151", "152", "153", "154", "155", "156", "157", "158", "159", "160", "161", "162", "163", "164", "165", "166", "167", "168", "169", "170", "171", "172", "173", "174", "175", "176", "177", "178", "179", "180", "181", "182", "183", "184", "185", "186", "187", "188", "189", "190", "191", "192", "193", "194", "195", "196", "197", "198", "199", "200", "201", "202", "203", "204", "205", "206", "207", "208", "209", "210", "211", "212", "213", "214", "215", "216", "217", "218", "219", "220", "221", "222", "223", "224", "225", "226", "227", "228", "229", "230", "231", "232", "233", "234", "235", "236", "237", "238", "239", "240", "241", "242", "243", "244", "245", "246", "247", "248", "249", "250", "251", "252", "253", "254", "255" }));
        comboRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRojoActionPerformed(evt);
            }
        });
        jPanel11.add(comboRojo);

        jLabel8.setText("Verde");
        jPanel11.add(jLabel8);

        comboVerde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120", "121", "122", "123", "124", "125", "126", "127", "128", "129", "130", "131", "132", "133", "134", "135", "136", "137", "138", "139", "140", "141", "142", "143", "144", "145", "146", "147", "148", "149", "150", "151", "152", "153", "154", "155", "156", "157", "158", "159", "160", "161", "162", "163", "164", "165", "166", "167", "168", "169", "170", "171", "172", "173", "174", "175", "176", "177", "178", "179", "180", "181", "182", "183", "184", "185", "186", "187", "188", "189", "190", "191", "192", "193", "194", "195", "196", "197", "198", "199", "200", "201", "202", "203", "204", "205", "206", "207", "208", "209", "210", "211", "212", "213", "214", "215", "216", "217", "218", "219", "220", "221", "222", "223", "224", "225", "226", "227", "228", "229", "230", "231", "232", "233", "234", "235", "236", "237", "238", "239", "240", "241", "242", "243", "244", "245", "246", "247", "248", "249", "250", "251", "252", "253", "254", "255" }));
        comboVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVerdeActionPerformed(evt);
            }
        });
        jPanel11.add(comboVerde);

        jLabel9.setText("Azul");
        jPanel11.add(jLabel9);

        comboAzul.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120", "121", "122", "123", "124", "125", "126", "127", "128", "129", "130", "131", "132", "133", "134", "135", "136", "137", "138", "139", "140", "141", "142", "143", "144", "145", "146", "147", "148", "149", "150", "151", "152", "153", "154", "155", "156", "157", "158", "159", "160", "161", "162", "163", "164", "165", "166", "167", "168", "169", "170", "171", "172", "173", "174", "175", "176", "177", "178", "179", "180", "181", "182", "183", "184", "185", "186", "187", "188", "189", "190", "191", "192", "193", "194", "195", "196", "197", "198", "199", "200", "201", "202", "203", "204", "205", "206", "207", "208", "209", "210", "211", "212", "213", "214", "215", "216", "217", "218", "219", "220", "221", "222", "223", "224", "225", "226", "227", "228", "229", "230", "231", "232", "233", "234", "235", "236", "237", "238", "239", "240", "241", "242", "243", "244", "245", "246", "247", "248", "249", "250", "251", "252", "253", "254", "255" }));
        comboAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAzulActionPerformed(evt);
            }
        });
        jPanel11.add(comboAzul);

        jPanel1.add(jPanel11, java.awt.BorderLayout.NORTH);

        panelColorCombo.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelColorComboLayout = new javax.swing.GroupLayout(panelColorCombo);
        panelColorCombo.setLayout(panelColorComboLayout);
        panelColorComboLayout.setHorizontalGroup(
            panelColorComboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        panelColorComboLayout.setVerticalGroup(
            panelColorComboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );

        jPanel1.add(panelColorCombo, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Combo box", jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Rojo");

        jLabel2.setText("Verde");

        jLabel3.setText("Azul");

        spinnerRojo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        spinnerRojo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerRojoStateChanged(evt);
            }
        });

        spinnerVerde.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        spinnerVerde.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerVerdeStateChanged(evt);
            }
        });

        spinnerAzul.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        spinnerAzul.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerAzulStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinnerRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinnerVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinnerAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(spinnerVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spinnerAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(spinnerRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.NORTH);

        panelColoorSpinner.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(panelColoorSpinner, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Spinner", jPanel2);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel9.setLayout(new java.awt.GridLayout(1, 3, 50, 10));

        sliderRojo.setMajorTickSpacing(50);
        sliderRojo.setMaximum(255);
        sliderRojo.setMinorTickSpacing(1);
        sliderRojo.setPaintLabels(true);
        sliderRojo.setPaintTicks(true);
        sliderRojo.setSnapToTicks(true);
        sliderRojo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ROJO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        sliderRojo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderRojoStateChanged(evt);
            }
        });
        jPanel9.add(sliderRojo);

        sliderVerde.setMajorTickSpacing(50);
        sliderVerde.setMaximum(255);
        sliderVerde.setMinorTickSpacing(1);
        sliderVerde.setPaintLabels(true);
        sliderVerde.setPaintTicks(true);
        sliderVerde.setSnapToTicks(true);
        sliderVerde.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VERDE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        sliderVerde.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderVerdeStateChanged(evt);
            }
        });
        jPanel9.add(sliderVerde);

        sliderAzul.setMajorTickSpacing(50);
        sliderAzul.setMaximum(255);
        sliderAzul.setMinorTickSpacing(1);
        sliderAzul.setPaintLabels(true);
        sliderAzul.setPaintTicks(true);
        sliderAzul.setSnapToTicks(true);
        sliderAzul.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AZUL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        sliderAzul.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderAzulStateChanged(evt);
            }
        });
        jPanel9.add(sliderAzul);

        jPanel3.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        panelColorSlinder.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelColorSlinderLayout = new javax.swing.GroupLayout(panelColorSlinder);
        panelColorSlinder.setLayout(panelColorSlinderLayout);
        panelColorSlinderLayout.setHorizontalGroup(
            panelColorSlinderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        panelColorSlinderLayout.setVerticalGroup(
            panelColorSlinderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(panelColorSlinder, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Slider", jPanel3);

        getContentPane().add(jTabbedPane1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRojoActionPerformed
        // TODO add your handling code here:
        rgbComoboBox();
    }//GEN-LAST:event_comboRojoActionPerformed

    private void sliderRojoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderRojoStateChanged
        // TODO add your handling code here:
        rgb();
    }//GEN-LAST:event_sliderRojoStateChanged

    private void sliderVerdeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderVerdeStateChanged
        // TODO add your handling code here:
        rgb();
    }//GEN-LAST:event_sliderVerdeStateChanged

    private void sliderAzulStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderAzulStateChanged
        // TODO add your handling code here:
        rgb();
    }//GEN-LAST:event_sliderAzulStateChanged

    private void spinnerRojoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerRojoStateChanged
        // TODO add your handling code here:
        rgbSpinner();
    }//GEN-LAST:event_spinnerRojoStateChanged

    private void spinnerVerdeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerVerdeStateChanged
        // TODO add your handling code here:
        rgbSpinner();
    }//GEN-LAST:event_spinnerVerdeStateChanged

    private void spinnerAzulStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerAzulStateChanged
        // TODO add your handling code here:
        rgbSpinner();
    }//GEN-LAST:event_spinnerAzulStateChanged

    private void comboVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVerdeActionPerformed
        // TODO add your handling code here:
        rgbComoboBox();
    }//GEN-LAST:event_comboVerdeActionPerformed

    private void comboAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAzulActionPerformed
        // TODO add your handling code here:
        rgbComoboBox();
    }//GEN-LAST:event_comboAzulActionPerformed

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
            java.util.logging.Logger.getLogger(Rgb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rgb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rgb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rgb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rgb().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboAzul;
    private javax.swing.JComboBox<String> comboRojo;
    private javax.swing.JComboBox<String> comboVerde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelColoorSpinner;
    private javax.swing.JPanel panelColorCombo;
    private javax.swing.JPanel panelColorSlinder;
    private javax.swing.JSlider sliderAzul;
    private javax.swing.JSlider sliderRojo;
    private javax.swing.JSlider sliderVerde;
    private javax.swing.JSpinner spinnerAzul;
    private javax.swing.JSpinner spinnerRojo;
    private javax.swing.JSpinner spinnerVerde;
    // End of variables declaration//GEN-END:variables
    private void rgb() {
        int r, g, b;
        r = sliderRojo.getValue();
        g = sliderVerde.getValue();
        b = sliderAzul.getValue();
        panelColorSlinder.setBackground(new Color(r, g, b));
    }

    private void rgbSpinner() {
        int r, g, b;
        r = (int) spinnerRojo.getValue();
        g = (int) spinnerVerde.getValue();
        b = (int) spinnerAzul.getValue();
        panelColoorSpinner.setBackground(new Color(r, g, b));
    }

    private void rgbComoboBox() {
        int r, g, b;
        r = comboRojo.getSelectedIndex();
        g = comboVerde.getSelectedIndex();
        b = comboAzul.getSelectedIndex();
        panelColorCombo.setBackground(new Color(r, g, b));
    }
}