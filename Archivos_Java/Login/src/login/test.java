package login;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class test extends javax.swing.JFrame {

    public String nombre = "";
    public String correo = "";
    private Double cantidad;
    private boolean ssgm;
    private boolean dep;
    private boolean Vales;
    private boolean Comedor;
    private boolean seguroVida;
    private boolean diasPersonales;
    private boolean diasEnfermedad;

    public test() {
        initComponents();
        txtSgmm.setEnabled(false);
        txtSgmmDep.setEnabled(false);
        txtVales.setEnabled(false);
        txtComedor.setEnabled(false);
        txtDiasEnfermedad.setEnabled(false);
        txtDiasPersonales.setEnabled(false);
        txtSeguroVida.setEnabled(false);
        txtSalarioAnual.setEnabled(false);
        System.out.println(nombre + correo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dependientes = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        JBotonLimpiar = new javax.swing.JButton();
        lbl_vacaciones = new javax.swing.JLabel();
        lbl_salariomensual = new javax.swing.JLabel();
        txtDependientes = new javax.swing.JTextField();
        txtSalarioMensual = new javax.swing.JTextField();
        txtSalarioAnual = new javax.swing.JTextField();
        lbl_Aguinaldo = new javax.swing.JLabel();
        lbl_Prima_vacacional = new javax.swing.JLabel();
        lbl_salarioanual = new javax.swing.JLabel();
        lbl_infonavit = new javax.swing.JLabel();
        lbl_imss = new javax.swing.JLabel();
        lbl_rcv = new javax.swing.JLabel();
        TOTALPRESTACIONES = new javax.swing.JLabel();
        rbtSalarioAnual = new javax.swing.JRadioButton();
        txtAguinaldo = new javax.swing.JTextField();
        txtPrimaVacional = new javax.swing.JTextField();
        txtVacaciones = new javax.swing.JTextField();
        txtInfonavit = new javax.swing.JTextField();
        txtRcv = new javax.swing.JTextField();
        txtImss = new javax.swing.JTextField();
        txtTotalPrestaciones = new javax.swing.JTextField();
        lbl_SGMM = new javax.swing.JLabel();
        lbl_SGMMDEP = new javax.swing.JLabel();
        lbl_VALES = new javax.swing.JLabel();
        lbl_COMEDOR = new javax.swing.JLabel();
        lbl_SEGURO_DE_VIDA = new javax.swing.JLabel();
        lbl_3_PERSONAL = new javax.swing.JLabel();
        lbl_3_SICK = new javax.swing.JLabel();
        total_bofA = new javax.swing.JTextField();
        lbl_total_bofA = new javax.swing.JLabel();
        rbtsgmm = new javax.swing.JRadioButton();
        rbtSgmmDep = new javax.swing.JRadioButton();
        rbtVales = new javax.swing.JRadioButton();
        rbtComedor = new javax.swing.JRadioButton();
        rbtSeguroVida = new javax.swing.JRadioButton();
        rbtDiasPersonales = new javax.swing.JRadioButton();
        rbtDiasEnfermedad = new javax.swing.JRadioButton();
        txtSgmm = new javax.swing.JTextField();
        txtSgmmDep = new javax.swing.JTextField();
        txtVales = new javax.swing.JTextField();
        txtComedor = new javax.swing.JTextField();
        txtSeguroVida = new javax.swing.JTextField();
        txtDiasPersonales = new javax.swing.JTextField();
        txtDiasEnfermedad = new javax.swing.JTextField();
        lbl_total_beneficios = new javax.swing.JLabel();
        lbl_bonos_anuales = new javax.swing.JLabel();
        lbl_total_compensacion_mensual = new javax.swing.JLabel();
        BotonCalcular = new javax.swing.JButton();
        txtBonosAnuales = new javax.swing.JTextField();
        txtTotalBeneficios = new javax.swing.JTextField();
        txtTotalCompensaciones = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fondopantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setUndecorated(true);
        getContentPane().setLayout(null);

        Dependientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Dependientes.setForeground(new java.awt.Color(255, 255, 255));
        Dependientes.setText("Dependientes :");
        getContentPane().add(Dependientes);
        Dependientes.setBounds(40, 120, 130, 20);

        btn_salir.setBackground(new java.awt.Color(204, 204, 204));
        btn_salir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_salir.setText("SALIR");
        btn_salir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir);
        btn_salir.setBounds(890, 10, 100, 27);

        JBotonLimpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JBotonLimpiar.setText("Limpiar");
        JBotonLimpiar.setToolTipText("");
        JBotonLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBotonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(JBotonLimpiar);
        JBotonLimpiar.setBounds(890, 50, 100, 27);

        lbl_vacaciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_vacaciones.setForeground(new java.awt.Color(255, 255, 255));
        lbl_vacaciones.setText("Vacaciones :");
        getContentPane().add(lbl_vacaciones);
        lbl_vacaciones.setBounds(40, 240, 110, 20);

        lbl_salariomensual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_salariomensual.setForeground(new java.awt.Color(255, 255, 255));
        lbl_salariomensual.setText("Salario Mensual :");
        getContentPane().add(lbl_salariomensual);
        lbl_salariomensual.setBounds(40, 80, 130, 20);

        txtDependientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDependientesKeyTyped(evt);
            }
        });
        getContentPane().add(txtDependientes);
        txtDependientes.setBounds(190, 110, 90, 40);

        txtSalarioMensual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalarioMensualKeyTyped(evt);
            }
        });
        getContentPane().add(txtSalarioMensual);
        txtSalarioMensual.setBounds(190, 70, 90, 40);

        txtSalarioAnual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioAnualActionPerformed(evt);
            }
        });
        txtSalarioAnual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalarioAnualKeyTyped(evt);
            }
        });
        getContentPane().add(txtSalarioAnual);
        txtSalarioAnual.setBounds(190, 30, 90, 40);

        lbl_Aguinaldo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Aguinaldo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Aguinaldo.setText("Aguinaldo :");
        getContentPane().add(lbl_Aguinaldo);
        lbl_Aguinaldo.setBounds(40, 200, 110, 20);

        lbl_Prima_vacacional.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Prima_vacacional.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Prima_vacacional.setText("Prima Vacacional :");
        getContentPane().add(lbl_Prima_vacacional);
        lbl_Prima_vacacional.setBounds(40, 280, 140, 20);

        lbl_salarioanual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_salarioanual.setForeground(new java.awt.Color(255, 255, 255));
        lbl_salarioanual.setText("Salario Anual :");
        getContentPane().add(lbl_salarioanual);
        lbl_salarioanual.setBounds(40, 40, 110, 20);

        lbl_infonavit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_infonavit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_infonavit.setText("Infonavit :");
        getContentPane().add(lbl_infonavit);
        lbl_infonavit.setBounds(40, 320, 110, 20);

        lbl_imss.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_imss.setForeground(new java.awt.Color(255, 255, 255));
        lbl_imss.setText("IMSS :");
        getContentPane().add(lbl_imss);
        lbl_imss.setBounds(40, 360, 110, 20);

        lbl_rcv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_rcv.setForeground(new java.awt.Color(255, 255, 255));
        lbl_rcv.setText("RCV (Retiro Cecentia en Edad) :");
        getContentPane().add(lbl_rcv);
        lbl_rcv.setBounds(40, 400, 220, 17);

        TOTALPRESTACIONES.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TOTALPRESTACIONES.setForeground(new java.awt.Color(204, 255, 255));
        TOTALPRESTACIONES.setText("TOTAL PRESTACIONES :");
        getContentPane().add(TOTALPRESTACIONES);
        TOTALPRESTACIONES.setBounds(80, 450, 180, 17);

        rbtSalarioAnual.setText("Habilitar");
        rbtSalarioAnual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtSalarioAnualActionPerformed(evt);
            }
        });
        getContentPane().add(rbtSalarioAnual);
        rbtSalarioAnual.setBounds(290, 40, 90, 23);

        txtAguinaldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAguinaldoKeyTyped(evt);
            }
        });
        getContentPane().add(txtAguinaldo);
        txtAguinaldo.setBounds(290, 190, 90, 40);

        txtPrimaVacional.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrimaVacionalKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrimaVacional);
        txtPrimaVacional.setBounds(290, 270, 90, 40);

        txtVacaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVacacionesKeyTyped(evt);
            }
        });
        getContentPane().add(txtVacaciones);
        txtVacaciones.setBounds(290, 230, 90, 40);

        txtInfonavit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInfonavitKeyTyped(evt);
            }
        });
        getContentPane().add(txtInfonavit);
        txtInfonavit.setBounds(290, 310, 90, 40);

        txtRcv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRcvKeyTyped(evt);
            }
        });
        getContentPane().add(txtRcv);
        txtRcv.setBounds(290, 390, 90, 40);

        txtImss.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImssKeyTyped(evt);
            }
        });
        getContentPane().add(txtImss);
        txtImss.setBounds(290, 350, 90, 40);

        txtTotalPrestaciones.setEditable(false);
        txtTotalPrestaciones.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalPrestaciones.setEnabled(false);
        txtTotalPrestaciones.setFocusable(false);
        getContentPane().add(txtTotalPrestaciones);
        txtTotalPrestaciones.setBounds(290, 440, 130, 40);

        lbl_SGMM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_SGMM.setText("SGMM :");
        getContentPane().add(lbl_SGMM);
        lbl_SGMM.setBounds(590, 240, 60, 14);

        lbl_SGMMDEP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_SGMMDEP.setText("SGMM Dep :");
        getContentPane().add(lbl_SGMMDEP);
        lbl_SGMMDEP.setBounds(590, 270, 100, 17);

        lbl_VALES.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_VALES.setText("Vales :");
        getContentPane().add(lbl_VALES);
        lbl_VALES.setBounds(590, 300, 50, 17);

        lbl_COMEDOR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_COMEDOR.setText("Comedor :");
        getContentPane().add(lbl_COMEDOR);
        lbl_COMEDOR.setBounds(590, 330, 90, 17);

        lbl_SEGURO_DE_VIDA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_SEGURO_DE_VIDA.setText("Seguro de Vida :");
        getContentPane().add(lbl_SEGURO_DE_VIDA);
        lbl_SEGURO_DE_VIDA.setBounds(590, 360, 140, 17);

        lbl_3_PERSONAL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_3_PERSONAL.setText("3 Dias Personales :");
        getContentPane().add(lbl_3_PERSONAL);
        lbl_3_PERSONAL.setBounds(590, 390, 150, 17);

        lbl_3_SICK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_3_SICK.setText("3 Dias por Enfermedad :");
        getContentPane().add(lbl_3_SICK);
        lbl_3_SICK.setBounds(590, 420, 180, 17);

        total_bofA.setEditable(false);
        total_bofA.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(total_bofA);
        total_bofA.setBounds(700, 450, 140, 30);

        lbl_total_bofA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_total_bofA.setText("Total BofA :");
        getContentPane().add(lbl_total_bofA);
        lbl_total_bofA.setBounds(590, 450, 100, 17);

        rbtsgmm.setText("Habilitar");
        rbtsgmm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtsgmmActionPerformed(evt);
            }
        });
        getContentPane().add(rbtsgmm);
        rbtsgmm.setBounds(830, 230, 80, 23);

        rbtSgmmDep.setText("Habilitar");
        rbtSgmmDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtSgmmDepActionPerformed(evt);
            }
        });
        getContentPane().add(rbtSgmmDep);
        rbtSgmmDep.setBounds(830, 260, 80, 23);

        rbtVales.setText("Habilitar");
        rbtVales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtValesActionPerformed(evt);
            }
        });
        getContentPane().add(rbtVales);
        rbtVales.setBounds(830, 290, 80, 23);

        rbtComedor.setText("Habilitar");
        rbtComedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtComedorActionPerformed(evt);
            }
        });
        getContentPane().add(rbtComedor);
        rbtComedor.setBounds(830, 320, 80, 23);

        rbtSeguroVida.setText("Habilitar");
        rbtSeguroVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtSeguroVidaActionPerformed(evt);
            }
        });
        getContentPane().add(rbtSeguroVida);
        rbtSeguroVida.setBounds(830, 350, 80, 23);

        rbtDiasPersonales.setText("Habilitar");
        rbtDiasPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDiasPersonalesActionPerformed(evt);
            }
        });
        getContentPane().add(rbtDiasPersonales);
        rbtDiasPersonales.setBounds(830, 380, 80, 20);

        rbtDiasEnfermedad.setText("Habilitar");
        rbtDiasEnfermedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDiasEnfermedadActionPerformed(evt);
            }
        });
        getContentPane().add(rbtDiasEnfermedad);
        rbtDiasEnfermedad.setBounds(830, 410, 80, 23);

        txtSgmm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSgmmKeyTyped(evt);
            }
        });
        getContentPane().add(txtSgmm);
        txtSgmm.setBounds(770, 230, 60, 30);

        txtSgmmDep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSgmmDepKeyTyped(evt);
            }
        });
        getContentPane().add(txtSgmmDep);
        txtSgmmDep.setBounds(770, 260, 60, 30);

        txtVales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValesKeyTyped(evt);
            }
        });
        getContentPane().add(txtVales);
        txtVales.setBounds(770, 290, 60, 30);

        txtComedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtComedorKeyTyped(evt);
            }
        });
        getContentPane().add(txtComedor);
        txtComedor.setBounds(770, 320, 60, 30);

        txtSeguroVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeguroVidaActionPerformed(evt);
            }
        });
        txtSeguroVida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSeguroVidaKeyTyped(evt);
            }
        });
        getContentPane().add(txtSeguroVida);
        txtSeguroVida.setBounds(770, 350, 60, 30);

        txtDiasPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasPersonalesActionPerformed(evt);
            }
        });
        txtDiasPersonales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiasPersonalesKeyTyped(evt);
            }
        });
        getContentPane().add(txtDiasPersonales);
        txtDiasPersonales.setBounds(770, 380, 60, 30);

        txtDiasEnfermedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiasEnfermedadKeyTyped(evt);
            }
        });
        getContentPane().add(txtDiasEnfermedad);
        txtDiasEnfermedad.setBounds(770, 410, 60, 30);

        lbl_total_beneficios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_total_beneficios.setText("Total de Beneficios :");
        getContentPane().add(lbl_total_beneficios);
        lbl_total_beneficios.setBounds(650, 100, 150, 17);

        lbl_bonos_anuales.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_bonos_anuales.setText("Bonos Anuales :");
        getContentPane().add(lbl_bonos_anuales);
        lbl_bonos_anuales.setBounds(680, 180, 120, 17);

        lbl_total_compensacion_mensual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_total_compensacion_mensual.setText("Total de compensaciones por mes :");
        getContentPane().add(lbl_total_compensacion_mensual);
        lbl_total_compensacion_mensual.setBounds(550, 140, 250, 17);

        BotonCalcular.setBackground(new java.awt.Color(204, 204, 204));
        BotonCalcular.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        BotonCalcular.setText("Calcular");
        BotonCalcular.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BotonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(BotonCalcular);
        BotonCalcular.setBounds(870, 450, 120, 40);

        txtBonosAnuales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBonosAnualesKeyTyped(evt);
            }
        });
        getContentPane().add(txtBonosAnuales);
        txtBonosAnuales.setBounds(810, 170, 80, 40);

        txtTotalBeneficios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalBeneficiosKeyTyped(evt);
            }
        });
        getContentPane().add(txtTotalBeneficios);
        txtTotalBeneficios.setBounds(810, 90, 80, 40);

        txtTotalCompensaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalCompensacionesKeyTyped(evt);
            }
        });
        getContentPane().add(txtTotalCompensaciones);
        txtTotalCompensaciones.setBounds(810, 130, 80, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(5, 5, 5));
        jLabel4.setText("Calculadora de Bonos Empresariales");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 20, 400, 60);

        fondopantalla.setBackground(new java.awt.Color(80, 11, 45));
        fondopantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/fondo10.jpg"))); // NOI18N
        fondopantalla.setText("fondo");
        fondopantalla.setMaximumSize(new java.awt.Dimension(1032, 66));
        getContentPane().add(fondopantalla);
        fondopantalla.setBounds(0, 0, 1000, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();//cierra solo la ventana que se muestra
        System.exit(0);//se cierra todo el programa

    }//GEN-LAST:event_btn_salirActionPerformed

    private void txtSalarioAnualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioAnualKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 47) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {

        }
    }//GEN-LAST:event_txtSalarioAnualKeyTyped

    private void txtSalarioMensualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioMensualKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 47) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {

        }
    }//GEN-LAST:event_txtSalarioMensualKeyTyped

    private void txtDependientesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDependientesKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 47) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {

        }
    }//GEN-LAST:event_txtDependientesKeyTyped

    private void txtAguinaldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAguinaldoKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 47) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {

        }
    }//GEN-LAST:event_txtAguinaldoKeyTyped

    private void txtVacacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVacacionesKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 47) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {

        }
    }//GEN-LAST:event_txtVacacionesKeyTyped

    private void txtPrimaVacionalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrimaVacionalKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 47) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {

        }
    }//GEN-LAST:event_txtPrimaVacionalKeyTyped

    private void txtInfonavitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInfonavitKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 47) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {

        }
    }//GEN-LAST:event_txtInfonavitKeyTyped

    private void txtImssKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImssKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 47) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {

        }
    }//GEN-LAST:event_txtImssKeyTyped

    private void txtRcvKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRcvKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 47) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {

        }
    }//GEN-LAST:event_txtRcvKeyTyped

    private void txtTotalBeneficiosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalBeneficiosKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 47) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {

        }
    }//GEN-LAST:event_txtTotalBeneficiosKeyTyped

    private void txtTotalCompensacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalCompensacionesKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 47) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {

        }
    }//GEN-LAST:event_txtTotalCompensacionesKeyTyped

    private void txtBonosAnualesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBonosAnualesKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 47) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {

        }
    }//GEN-LAST:event_txtBonosAnualesKeyTyped

    private void txtSgmmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSgmmKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 47) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {

        }
    }//GEN-LAST:event_txtSgmmKeyTyped

    private void txtSgmmDepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSgmmDepKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 47) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {

        }
    }//GEN-LAST:event_txtSgmmDepKeyTyped

    private void txtValesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValesKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 47) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {

        }
    }//GEN-LAST:event_txtValesKeyTyped

    private void txtComedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComedorKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 47) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {

        }
    }//GEN-LAST:event_txtComedorKeyTyped

    private void txtSeguroVidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeguroVidaKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 47) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {

        }
    }//GEN-LAST:event_txtSeguroVidaKeyTyped

    private void txtDiasPersonalesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasPersonalesKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 47) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {

        }
    }//GEN-LAST:event_txtDiasPersonalesKeyTyped

    private void txtDiasEnfermedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasEnfermedadKeyTyped
        char c = evt.getKeyChar();
        //Sin punto decimal puros enteros
        if ((c >= 33 && c <= 47) || (c >= 58 && c <= 253)) {
            evt.consume();
        } else {

        }
    }//GEN-LAST:event_txtDiasEnfermedadKeyTyped

    private void BotonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCalcularActionPerformed
        String escritura = "Nombre: " + nombre + "\nCorreo: " + correo;
        String ruta = "C:\\Users\\Axel Ordoñez\\Desktop";
        String nombreArchivo = "\\" + nombre;
        String tipo = ".txt";
        double total = 0;
        try {
            double salarioMensual = Double.parseDouble(txtSalarioMensual.getText());
            double dependientes = Double.parseDouble(txtDependientes.getText());
            double aguinaldo = Double.parseDouble(txtAguinaldo.getText());
            double vacaciones = Double.parseDouble(txtVacaciones.getText());
            double prima = Double.parseDouble(txtPrimaVacional.getText());
            double infonavit = Double.parseDouble(txtInfonavit.getText());
            double imss = Double.parseDouble(txtImss.getText());
            double rcv = Double.parseDouble(txtRcv.getText());
            double totalBeneficios = Double.parseDouble(txtTotalBeneficios.getText());
            double totalCompensaciones = Double.parseDouble(txtTotalCompensaciones.getText());
            double bonosAnuales = Double.parseDouble(txtBonosAnuales.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Llene los campos obligatorios");
        }
        escritura  += "\nTotal oferta: " + String.valueOf(total);
        try (FileWriter archivo = new FileWriter(ruta + nombreArchivo + tipo);
        BufferedWriter bw = new BufferedWriter(archivo)) {
            bw.write(escritura);
        } catch (IOException e) {
            
        }
    }//GEN-LAST:event_BotonCalcularActionPerformed

    private void rbtComedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtComedorActionPerformed
        // TODO add your handling code here:
        if (rbtComedor.isSelected() == false) {
            txtComedor.setEnabled(false);
        } else {
            txtComedor.setEnabled(true);
        }
    }//GEN-LAST:event_rbtComedorActionPerformed

    private void rbtsgmmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtsgmmActionPerformed
        // TODO add your handling code here:
        if (rbtsgmm.isSelected() == false) {
            txtSgmm.setEnabled(false);
        } else {
            txtSgmm.setEnabled(true);
        }
    }//GEN-LAST:event_rbtsgmmActionPerformed

    private void rbtSgmmDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtSgmmDepActionPerformed
        // TODO add your handling code here:
        if (rbtSgmmDep.isSelected() == false) {
            txtSgmmDep.setEnabled(false);
        } else {
            txtSgmmDep.setEnabled(true);
        }
    }//GEN-LAST:event_rbtSgmmDepActionPerformed

    private void rbtValesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtValesActionPerformed
        // TODO add your handling code here:
        if (rbtVales.isSelected() == false) {
            txtVales.setEnabled(false);
        } else {
            txtVales.setEnabled(true);
        }
    }//GEN-LAST:event_rbtValesActionPerformed

    private void txtSeguroVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeguroVidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeguroVidaActionPerformed

    private void rbtSeguroVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtSeguroVidaActionPerformed
        // TODO add your handling code here:
        if (rbtSeguroVida.isSelected() == false) {
            txtSeguroVida.setEnabled(false);
        } else {
            txtSeguroVida.setEnabled(true);
        }
    }//GEN-LAST:event_rbtSeguroVidaActionPerformed

    private void txtDiasPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasPersonalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasPersonalesActionPerformed

    private void rbtDiasPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDiasPersonalesActionPerformed
        // TODO add your handling code here:
        if (rbtDiasPersonales.isSelected() == false) {
            txtDiasPersonales.setEnabled(false);
        } else {
            txtDiasPersonales.setEnabled(true);
        }
    }//GEN-LAST:event_rbtDiasPersonalesActionPerformed

    private void rbtDiasEnfermedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDiasEnfermedadActionPerformed
        // TODO add your handling code here:
        if (rbtDiasEnfermedad.isSelected() == false) {
            txtDiasEnfermedad.setEnabled(false);
        } else {
            txtDiasEnfermedad.setEnabled(true);
        }
    }//GEN-LAST:event_rbtDiasEnfermedadActionPerformed

    private void rbtSalarioAnualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtSalarioAnualActionPerformed
        // TODO add your handling code here:
        if (rbtSalarioAnual.isSelected() == false) {
            txtSalarioAnual.setEnabled(false);
        } else {
            txtSalarioAnual.setEnabled(true);
        }
    }//GEN-LAST:event_rbtSalarioAnualActionPerformed

    private void txtSalarioAnualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioAnualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioAnualActionPerformed

    private void JBotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBotonLimpiarActionPerformed
        // TODO add your handling code here:
        txtAguinaldo.setText("");
        txtBonosAnuales.setText("");
        txtComedor.setText("");
        txtDependientes.setText("");
        txtDiasEnfermedad.setText("");
        txtDiasPersonales.setText("");
        txtImss.setText("");
        txtInfonavit.setText("");
        txtPrimaVacional.setText("");
        txtRcv.setText("");
        txtSalarioAnual.setText("");
        txtSalarioMensual.setText("");
        txtSeguroVida.setText("");
        txtSgmm.setText("");
        txtSgmmDep.setText("");
        txtTotalBeneficios.setText("");
        txtTotalCompensaciones.setText("");
        txtTotalPrestaciones.setText("");
        txtVacaciones.setText("");
        txtVales.setText("");
    }//GEN-LAST:event_JBotonLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCalcular;
    private javax.swing.JLabel Dependientes;
    private javax.swing.JButton JBotonLimpiar;
    private javax.swing.JLabel TOTALPRESTACIONES;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel fondopantalla;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_3_PERSONAL;
    private javax.swing.JLabel lbl_3_SICK;
    private javax.swing.JLabel lbl_Aguinaldo;
    private javax.swing.JLabel lbl_COMEDOR;
    private javax.swing.JLabel lbl_Prima_vacacional;
    private javax.swing.JLabel lbl_SEGURO_DE_VIDA;
    private javax.swing.JLabel lbl_SGMM;
    private javax.swing.JLabel lbl_SGMMDEP;
    private javax.swing.JLabel lbl_VALES;
    private javax.swing.JLabel lbl_bonos_anuales;
    private javax.swing.JLabel lbl_imss;
    private javax.swing.JLabel lbl_infonavit;
    private javax.swing.JLabel lbl_rcv;
    private javax.swing.JLabel lbl_salarioanual;
    private javax.swing.JLabel lbl_salariomensual;
    private javax.swing.JLabel lbl_total_beneficios;
    private javax.swing.JLabel lbl_total_bofA;
    private javax.swing.JLabel lbl_total_compensacion_mensual;
    private javax.swing.JLabel lbl_vacaciones;
    private javax.swing.JRadioButton rbtComedor;
    private javax.swing.JRadioButton rbtDiasEnfermedad;
    private javax.swing.JRadioButton rbtDiasPersonales;
    private javax.swing.JRadioButton rbtSalarioAnual;
    private javax.swing.JRadioButton rbtSeguroVida;
    private javax.swing.JRadioButton rbtSgmmDep;
    private javax.swing.JRadioButton rbtVales;
    private javax.swing.JRadioButton rbtsgmm;
    private javax.swing.JTextField total_bofA;
    private javax.swing.JTextField txtAguinaldo;
    private javax.swing.JTextField txtBonosAnuales;
    private javax.swing.JTextField txtComedor;
    private javax.swing.JTextField txtDependientes;
    private javax.swing.JTextField txtDiasEnfermedad;
    private javax.swing.JTextField txtDiasPersonales;
    private javax.swing.JTextField txtImss;
    private javax.swing.JTextField txtInfonavit;
    private javax.swing.JTextField txtPrimaVacional;
    private javax.swing.JTextField txtRcv;
    private javax.swing.JTextField txtSalarioAnual;
    private javax.swing.JTextField txtSalarioMensual;
    private javax.swing.JTextField txtSeguroVida;
    private javax.swing.JTextField txtSgmm;
    private javax.swing.JTextField txtSgmmDep;
    private javax.swing.JTextField txtTotalBeneficios;
    private javax.swing.JTextField txtTotalCompensaciones;
    private javax.swing.JTextField txtTotalPrestaciones;
    private javax.swing.JTextField txtVacaciones;
    private javax.swing.JTextField txtVales;
    // End of variables declaration//GEN-END:variables
}
