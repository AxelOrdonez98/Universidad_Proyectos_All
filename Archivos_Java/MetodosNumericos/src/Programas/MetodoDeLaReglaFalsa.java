package Programas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

/**
 *
 * @author Axel Ordoñez
 */
public class MetodoDeLaReglaFalsa extends javax.swing.JFrame {

    public MetodoDeLaReglaFalsa() {
        initComponents();
        txt1.setEnabled(false);
        txt2.setEnabled(false);
        txt3.setEnabled(false);
        txt4.setEnabled(false);
        txt5.setEnabled(false);
        txt6.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtX0 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtX1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtError = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        SpinnerDecimales = new javax.swing.JSpinner();
        BotonGenerar = new javax.swing.JButton();
        BotonAyuda = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt5 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt6 = new javax.swing.JTextField();
        RbotonX1 = new javax.swing.JRadioButton();
        RbotonX2 = new javax.swing.JRadioButton();
        RbotonX3 = new javax.swing.JRadioButton();
        RbotonX4 = new javax.swing.JRadioButton();
        RbotonX5 = new javax.swing.JRadioButton();
        RbotonX6 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtImprimir = new javax.swing.JTextArea();
        txtConstante = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        BotonLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("false"), this, org.jdesktop.beansbinding.BeanProperty.create("resizable"));
        bindingGroup.addBinding(binding);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("MÉTODO  DE  LA  REGLA FALSA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("f(X) =");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("[");

        txtX0.setText("0");
        txtX0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtX0ActionPerformed(evt);
            }
        });
        txtX0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX0KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText(",");

        txtX1.setText("0");
        txtX1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX1KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("]");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText(" RANGO   = ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("% DE ERROR");

        txtError.setText("0.0");
        txtError.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtErrorKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("NUMERO DE DECIMALES");

        SpinnerDecimales.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        SpinnerDecimales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SpinnerDecimalesKeyTyped(evt);
            }
        });

        BotonGenerar.setText("Generar");
        BotonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGenerarActionPerformed(evt);
            }
        });

        BotonAyuda.setText("Ayuda");
        BotonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAyudaActionPerformed(evt);
            }
        });

        txt1.setText("0");
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1KeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText(",");

        txt2.setText("0");
        txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2KeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText(",");

        txt3.setText("0");
        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });
        txt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3KeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText(",");

        txt4.setText("0");
        txt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4KeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText(",");

        txt5.setText("0");
        txt5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5KeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText(",");

        txt6.setText("0");
        txt6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6KeyTyped(evt);
            }
        });

        RbotonX1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RbotonX1.setText("X^1");
        RbotonX1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbotonX1ActionPerformed(evt);
            }
        });

        RbotonX2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RbotonX2.setText("X^2");
        RbotonX2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbotonX2ActionPerformed(evt);
            }
        });

        RbotonX3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RbotonX3.setText("X^3");
        RbotonX3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbotonX3ActionPerformed(evt);
            }
        });

        RbotonX4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RbotonX4.setText("X^4");
        RbotonX4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbotonX4ActionPerformed(evt);
            }
        });

        RbotonX5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RbotonX5.setText("X^5");
        RbotonX5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbotonX5ActionPerformed(evt);
            }
        });

        RbotonX6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RbotonX6.setText("X^6");
        RbotonX6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbotonX6ActionPerformed(evt);
            }
        });

        TxtImprimir.setEditable(false);
        TxtImprimir.setBackground(new java.awt.Color(240, 240, 240));
        TxtImprimir.setColumns(20);
        TxtImprimir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TxtImprimir.setRows(5);
        TxtImprimir.setBorder(null);
        TxtImprimir.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        TxtImprimir.setSelectionColor(new java.awt.Color(240, 240, 240));
        jScrollPane1.setViewportView(TxtImprimir);

        txtConstante.setText("1");
        txtConstante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConstanteKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Constante = ");

        BotonLimpiar.setText("Limpiar");
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(14, 14, 14))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(SpinnerDecimales, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BotonGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(RbotonX1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(RbotonX2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(RbotonX3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(RbotonX4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(RbotonX5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(RbotonX6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt6))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel9)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonAyuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtConstante, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtX0, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbotonX1)
                    .addComponent(RbotonX2)
                    .addComponent(RbotonX3)
                    .addComponent(RbotonX4)
                    .addComponent(RbotonX5)
                    .addComponent(RbotonX6)
                    .addComponent(txtConstante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt1)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt2)
                        .addComponent(jLabel12)
                        .addComponent(txt3))
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt4)
                        .addComponent(jLabel16))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt5)
                        .addComponent(jLabel18)
                        .addComponent(txt6))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtX0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinnerDecimales, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

    private void BotonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGenerarActionPerformed
        int Cont = 0;
        double Constante = Double.parseDouble(txtConstante.getText());
        double x0 = Double.parseDouble(txtX0.getText()), x1 = Double.parseDouble(txtX1.getText()), NuevoError, xr, xrn;
        double fx0, fx1;
        double error = Double.parseDouble(txtError.getText());
        double valor1 = Double.parseDouble(txt1.getText());
        double valor2 = Double.parseDouble(txt2.getText());
        double valor3 = Double.parseDouble(txt3.getText());
        double valor4 = Double.parseDouble(txt4.getText());
        double valor5 = Double.parseDouble(txt5.getText());
        double valor6 = Double.parseDouble(txt6.getText());
        int decimales = (int) SpinnerDecimales.getValue();
        if (RbotonX1.isSelected() == true || RbotonX2.isSelected() == true || RbotonX3.isSelected() == true || RbotonX4.isSelected() == true || RbotonX5.isSelected() == true || RbotonX6.isSelected() == true) {
            TxtImprimir.setText(null);
            Cont++;
            fx0 = (valor1 * Math.pow(x0, 1)) + (valor2 * Math.pow(x0, 2)) + (valor3 * Math.pow(x0, 3)) + (valor4 * Math.pow(x0, 4)) + (valor5 * Math.pow(x0, 5)) + (valor6 * Math.pow(x0, 6)) + Constante;
            fx1 = (valor1 * Math.pow(x1, 1)) + (valor2 * Math.pow(x1, 2)) + (valor3 * Math.pow(x1, 3)) + (valor4 * Math.pow(x1, 4)) + (valor5 * Math.pow(x1, 5)) + (valor6 * Math.pow(x1, 6)) + Constante;
            xr = ((fx0 * x1) - (fx1 * x0)) / ((fx0) - (fx1));
            x0 = xr;
            BigDecimal db = new BigDecimal(xr);
            db = db.setScale(decimales, RoundingMode.HALF_UP);
            TxtImprimir.append("============================================\n");
            TxtImprimir.append("Iteraciones: " + Cont + "\n");
            TxtImprimir.append("xr = ((fx0 * x1) - (fx1 * x1)) / ((fx0) - (fx1))\nEl valor de xr es: " + db.doubleValue() + "\n");
            TxtImprimir.append("============================================");
            do {
                Cont++;
                TxtImprimir.append("\nIteraciones: " + Cont + "\n");

                fx0 = (valor1 * Math.pow(x0, 1)) + (valor2 * Math.pow(x0, 2)) + (valor3 * Math.pow(x0, 3)) + (valor4 * Math.pow(x0, 4)) + (valor5 * Math.pow(x0, 5) + (valor6 * Math.pow(x0, 6)) + Constante);

                xrn = (x1) - (((fx1 * x0) - (fx1 * x1)) / ((fx0) - (fx1)));
                NuevoError = (Math.abs((xrn - x0) / xrn)) * (100);

                x0 = xrn;

                BigDecimal db1 = new BigDecimal(x0);
                db1 = db1.setScale(decimales, RoundingMode.HALF_UP);

                BigDecimal db2 = new BigDecimal(NuevoError);
                db2 = db2.setScale(decimales, RoundingMode.HALF_UP);

                TxtImprimir.append("El valor de Xrn es igual a: " + db1.doubleValue());
                TxtImprimir.append("\nEl error relativo es: " + db2.doubleValue() + " %");
                TxtImprimir.append("\n============================================");

                if (Cont == 200) {
                    TxtImprimir.append("\nSe llego al limite de las iteraciones '" + Cont + "'\nAdios");
                    TxtImprimir.append("\n============================================");
                    break;
                }
            } while (NuevoError >= error);
        } else {
            TxtImprimir.append("Por favor rellene los campos\n");
        }

    }//GEN-LAST:event_BotonGenerarActionPerformed

    private void RbotonX1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbotonX1ActionPerformed
        if (RbotonX1.isSelected() == false) {
            txt1.setEnabled(false);
        } else {
            txt1.setEnabled(true);
        }
    }//GEN-LAST:event_RbotonX1ActionPerformed

    private void RbotonX2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbotonX2ActionPerformed
        if (RbotonX2.isSelected() == false) {
            txt2.setEnabled(false);
        } else {
            txt2.setEnabled(true);
        }
    }//GEN-LAST:event_RbotonX2ActionPerformed

    private void RbotonX3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbotonX3ActionPerformed
        if (RbotonX3.isSelected() == false) {
            txt3.setEnabled(false);
        } else {
            txt3.setEnabled(true);
        }
    }//GEN-LAST:event_RbotonX3ActionPerformed

    private void RbotonX4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbotonX4ActionPerformed
        if (RbotonX4.isSelected() == false) {
            txt4.setEnabled(false);
        } else {
            txt4.setEnabled(true);
        }
    }//GEN-LAST:event_RbotonX4ActionPerformed

    private void RbotonX5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbotonX5ActionPerformed
        if (RbotonX5.isSelected() == false) {
            txt5.setEnabled(false);
        } else {
            txt5.setEnabled(true);
        }
    }//GEN-LAST:event_RbotonX5ActionPerformed

    private void RbotonX6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbotonX6ActionPerformed
        if (RbotonX6.isSelected() == false) {
            txt6.setEnabled(false);
        } else {
            txt6.setEnabled(true);
        }
    }//GEN-LAST:event_RbotonX6ActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
        TxtImprimir.setText(null);
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void txt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyTyped
        
    }//GEN-LAST:event_txt1KeyTyped

    private void txt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyTyped
        
    }//GEN-LAST:event_txt2KeyTyped

    private void txt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyTyped
        
    }//GEN-LAST:event_txt3KeyTyped

    private void txt4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4KeyTyped
        
    }//GEN-LAST:event_txt4KeyTyped

    private void txt5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5KeyTyped
       
    }//GEN-LAST:event_txt5KeyTyped

    private void txt6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6KeyTyped
        
    }//GEN-LAST:event_txt6KeyTyped

    private void txtConstanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConstanteKeyTyped
       
    }//GEN-LAST:event_txtConstanteKeyTyped

    private void txtX0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX0KeyTyped
        
    }//GEN-LAST:event_txtX0KeyTyped

    private void txtX1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX1KeyTyped
       
    }//GEN-LAST:event_txtX1KeyTyped

    private void txtErrorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtErrorKeyTyped
        
    }//GEN-LAST:event_txtErrorKeyTyped

    private void SpinnerDecimalesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SpinnerDecimalesKeyTyped
       
    }//GEN-LAST:event_SpinnerDecimalesKeyTyped

    private void BotonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAyudaActionPerformed
        JOptionPane.showMessageDialog(null, " A Y U D A \n"
                + "-No ingresar numeros con decimales en el intervalo\n"
                + "-Solo se aceptan 11 decimales como maximos y  como minimo 0\n"
                + "-En la funcion solo acepta numeros y decimales positivos");
    }//GEN-LAST:event_BotonAyudaActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void txtX0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtX0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtX0ActionPerformed

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
            java.util.logging.Logger.getLogger(MetodoDeLaReglaFalsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetodoDeLaReglaFalsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetodoDeLaReglaFalsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetodoDeLaReglaFalsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetodoDeLaReglaFalsa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAyuda;
    private javax.swing.JButton BotonGenerar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JRadioButton RbotonX1;
    private javax.swing.JRadioButton RbotonX2;
    private javax.swing.JRadioButton RbotonX3;
    private javax.swing.JRadioButton RbotonX4;
    private javax.swing.JRadioButton RbotonX5;
    private javax.swing.JRadioButton RbotonX6;
    private javax.swing.JSpinner SpinnerDecimales;
    private javax.swing.JTextArea TxtImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txtConstante;
    private javax.swing.JTextField txtError;
    private javax.swing.JTextField txtX0;
    private javax.swing.JTextField txtX1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}