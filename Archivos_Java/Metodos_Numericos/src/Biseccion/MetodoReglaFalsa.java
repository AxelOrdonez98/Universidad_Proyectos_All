/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biseccion;
import java.math.BigDecimal;
import java.math.RoundingMode;
import metodos.numericos.calcularRaiz;
/**
 *
 * @author kiuub
 */
public class MetodoReglaFalsa extends javax.swing.JFrame {

    private double errorRelativo,funcionX0,funcionX1,funcionXr,funcionXrN,valorFuncionA,x0,valorFuncionB,valorPMedio,comparacionFunciones,porError,funcionPMedio;
    private  int cont=0;
    private  double x6,x5,x4,x3,x2,x1,c,valorAAux,valorBAux,compAPm,compBPm,decimales,funcionMAux,valorA,valorB;
    private String texto="";
    calcularRaiz metodo =null;
     
    /**
     * Creates new form metodoBiseccion
     */
    public MetodoReglaFalsa() {
        //btnCalcular.setEnabled(false);
        initComponents();
        
    }
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtConstante = new javax.swing.JTextField();
        txtSexta = new javax.swing.JTextField();
        txtQuinta = new javax.swing.JTextField();
        txtCuarta = new javax.swing.JTextField();
        txtCubica = new javax.swing.JTextField();
        txtCuadrada = new javax.swing.JTextField();
        txtLineal = new javax.swing.JTextField();
        txtValorARango = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtValorBRango = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaValores = new javax.swing.JTextArea();
        rbtnX6 = new javax.swing.JRadioButton();
        rbtnX5 = new javax.swing.JRadioButton();
        rbtnX4 = new javax.swing.JRadioButton();
        rbtnX3 = new javax.swing.JRadioButton();
        rbtnX2 = new javax.swing.JRadioButton();
        rbtnX = new javax.swing.JRadioButton();
        rbtnC = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        txtPorError = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtDecimales = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        lblIteraciones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 450));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("false"), this, org.jdesktop.beansbinding.BeanProperty.create("resizable"));
        bindingGroup.addBinding(binding);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("x");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 20, -1));

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("6");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 20, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("x");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 20, -1));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("5");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 20, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("x");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 20, -1));

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("4");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 20, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("x");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 20, -1));

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("3");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 20, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("x");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 20, -1));

        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("2");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 20, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("c");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 20, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("x");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 20, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Rango");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtConstante.setBackground(new java.awt.Color(102, 102, 102));
        txtConstante.setForeground(new java.awt.Color(204, 204, 204));
        txtConstante.setText("0");
        jPanel1.add(txtConstante, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 60, -1));

        txtSexta.setBackground(new java.awt.Color(102, 102, 102));
        txtSexta.setForeground(new java.awt.Color(204, 204, 204));
        txtSexta.setText("0");
        jPanel1.add(txtSexta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, -1));

        txtQuinta.setBackground(new java.awt.Color(102, 102, 102));
        txtQuinta.setForeground(new java.awt.Color(204, 204, 204));
        txtQuinta.setText("0");
        jPanel1.add(txtQuinta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 50, -1));

        txtCuarta.setBackground(new java.awt.Color(102, 102, 102));
        txtCuarta.setForeground(new java.awt.Color(204, 204, 204));
        txtCuarta.setText("0");
        jPanel1.add(txtCuarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 50, -1));

        txtCubica.setBackground(new java.awt.Color(102, 102, 102));
        txtCubica.setForeground(new java.awt.Color(204, 204, 204));
        txtCubica.setText("0");
        jPanel1.add(txtCubica, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 50, -1));

        txtCuadrada.setBackground(new java.awt.Color(102, 102, 102));
        txtCuadrada.setForeground(new java.awt.Color(204, 204, 204));
        txtCuadrada.setText("0");
        jPanel1.add(txtCuadrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 60, -1));

        txtLineal.setBackground(new java.awt.Color(102, 102, 102));
        txtLineal.setForeground(new java.awt.Color(204, 204, 204));
        txtLineal.setText("0");
        jPanel1.add(txtLineal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 60, -1));

        txtValorARango.setBackground(new java.awt.Color(102, 102, 102));
        txtValorARango.setForeground(new java.awt.Color(204, 204, 204));
        txtValorARango.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "a", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel1.add(txtValorARango, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 70, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText(",");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 10, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("]");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 10, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("[");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 10, 30));

        txtValorBRango.setBackground(new java.awt.Color(102, 102, 102));
        txtValorBRango.setForeground(new java.awt.Color(204, 204, 204));
        txtValorBRango.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "b", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel1.add(txtValorBRango, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 70, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Metodo de la regla falsa");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        txtAreaValores.setBackground(new java.awt.Color(102, 102, 102));
        txtAreaValores.setColumns(20);
        txtAreaValores.setForeground(new java.awt.Color(204, 204, 204));
        txtAreaValores.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtAreaValores, org.jdesktop.beansbinding.ELProperty.create("false"), txtAreaValores, org.jdesktop.beansbinding.BeanProperty.create("editable"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(txtAreaValores);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 310, 390));

        rbtnX6.setBackground(new java.awt.Color(51, 51, 51));
        rbtnX6.setForeground(new java.awt.Color(204, 204, 204));
        rbtnX6.setText("si/no");
        rbtnX6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnX6ActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnX6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        rbtnX5.setBackground(new java.awt.Color(51, 51, 51));
        rbtnX5.setForeground(new java.awt.Color(204, 204, 204));
        rbtnX5.setText("si/no");
        rbtnX5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnX5ActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnX5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        rbtnX4.setBackground(new java.awt.Color(51, 51, 51));
        rbtnX4.setForeground(new java.awt.Color(204, 204, 204));
        rbtnX4.setText("si/no");
        rbtnX4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnX4ActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnX4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        rbtnX3.setBackground(new java.awt.Color(51, 51, 51));
        rbtnX3.setForeground(new java.awt.Color(204, 204, 204));
        rbtnX3.setText("si/no");
        rbtnX3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnX3ActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnX3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        rbtnX2.setBackground(new java.awt.Color(51, 51, 51));
        rbtnX2.setForeground(new java.awt.Color(204, 204, 204));
        rbtnX2.setText("si/no");
        rbtnX2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnX2ActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        rbtnX.setBackground(new java.awt.Color(51, 51, 51));
        rbtnX.setForeground(new java.awt.Color(204, 204, 204));
        rbtnX.setText("si/no");
        rbtnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnXActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        rbtnC.setBackground(new java.awt.Color(51, 51, 51));
        rbtnC.setForeground(new java.awt.Color(204, 204, 204));
        rbtnC.setText("si/no");
        rbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("% de error");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        txtPorError.setBackground(new java.awt.Color(102, 102, 102));
        txtPorError.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtPorError, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 200, -1));

        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Numero de decimales");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txtDecimales.setBackground(new java.awt.Color(102, 102, 102));
        txtDecimales.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtDecimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 200, -1));

        btnCalcular.setBackground(new java.awt.Color(0, 51, 51));
        btnCalcular.setForeground(new java.awt.Color(204, 204, 204));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 200, 40));

        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Numero de iteraciones: ");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        lblIteraciones.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(lblIteraciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 300, 20));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnX6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnX6ActionPerformed
        // TODO add your handling code here:
        if (rbtnX6.isSelected()) {
            txtSexta.setText(String.valueOf(0));
            txtSexta.setEnabled(false);
        } else {
            txtSexta.setEnabled(true);
        }
    }//GEN-LAST:event_rbtnX6ActionPerformed

    private void rbtnX5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnX5ActionPerformed
        // TODO add your handling code here:
        if (rbtnX5.isSelected()) {
            txtQuinta.setText(String.valueOf(0));
            txtQuinta.setEnabled(false);
        } else {
            txtQuinta.setEnabled(true);
        }
    }//GEN-LAST:event_rbtnX5ActionPerformed

    private void rbtnX4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnX4ActionPerformed
        // TODO add your handling code here:
        if (rbtnX4.isSelected()) {
            txtCuarta.setText(String.valueOf(0));
            txtCuarta.setEnabled(false);
        } else {
            txtCuarta.setEnabled(true);
        }
    }//GEN-LAST:event_rbtnX4ActionPerformed

    private void rbtnX3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnX3ActionPerformed
        // TODO add your handling code here:
        if (rbtnX3.isSelected()) {
            txtCubica.setText(String.valueOf(0));
            txtCubica.setEnabled(false);
        } else {
            txtCubica.setEnabled(true);
        }
    }//GEN-LAST:event_rbtnX3ActionPerformed

    private void rbtnX2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnX2ActionPerformed
        // TODO add your handling code here:
        if (rbtnX2.isSelected()) {
            txtCuadrada.setText(String.valueOf(0));
            txtCuadrada.setEnabled(false);
        } else {
            txtCuadrada.setEnabled(true);
        }
    }//GEN-LAST:event_rbtnX2ActionPerformed

    private void rbtnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnXActionPerformed
        // TODO add your handling code here:
        if (rbtnX.isSelected()) {
            txtLineal.setText(String.valueOf(0));
            txtLineal.setEnabled(false);
        } else {
            txtLineal.setEnabled(true);
        }
    }//GEN-LAST:event_rbtnXActionPerformed

    private void rbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCActionPerformed
        // TODO add your handling code here:
        if (rbtnC.isSelected()) {
            txtConstante.setText(String.valueOf(0));
            txtConstante.setEnabled(false);
        } else {
            txtConstante.setEnabled(true);
        }
    }//GEN-LAST:event_rbtnCActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        metodo =  new calcularRaiz();
        if(metodo.isNumberN(txtConstante.getText().trim())==false||metodo.isNumberN(txtLineal.getText().trim())==false||metodo.isNumberN(txtCuadrada.getText().trim())==false||metodo.isNumberN(txtCubica.getText().trim())==false||metodo.isNumberN(txtCuarta.getText().trim())==false||metodo.isNumberN(txtQuinta.getText().trim())==false||metodo.isNumberN(txtSexta.getText().trim())==false||metodo.isNumber(txtPorError.getText().trim())==false||metodo.isNumberN(txtValorARango.getText().trim())==false||metodo.isNumberN(txtValorBRango.getText().trim())==false||metodo.isAInt(txtDecimales.getText().trim())==false){
            txtAreaValores.setText("ingrese solo numeros");
        }
        else{
        x6=Double.parseDouble(String.valueOf(txtSexta.getText()));
        x5=Double.parseDouble(String.valueOf(txtQuinta.getText()));
        x4=Double.parseDouble(String.valueOf(txtCuarta.getText()));
        x3=Double.parseDouble(String.valueOf(txtCubica.getText()));
        x2=Double.parseDouble(String.valueOf(txtCuadrada.getText()));
        x1=Double.parseDouble(String.valueOf(txtLineal.getText()));
        c=Double.parseDouble(String.valueOf(txtConstante.getText()));
        valorA=Integer.parseInt(String.valueOf(txtValorARango.getText()));
        valorB=Integer.parseInt(String.valueOf(txtValorBRango.getText()));
        valorFuncionA=(x6*Math.pow(valorA, 6))+(x5*Math.pow(valorA, 5))+(x4*Math.pow(valorA, 4))+(x3*Math.pow(valorA, 3))+(x2*Math.pow(valorA, 2))+(x1*Math.pow(valorA, 1))+c;
        valorFuncionB=(x6*Math.pow(valorB, 6))+(x5*Math.pow(valorB, 5))+(x4*Math.pow(valorB, 4))+(x3*Math.pow(valorB, 3))+(x2*Math.pow(valorB, 2))+(x1*Math.pow(valorB, 1))+c;
        decimales=Double.parseDouble(String.valueOf(txtDecimales.getText()));
        errorRelativo=0;
        funcionX0=valorFuncionA;
        funcionX1=valorFuncionB;
        porError=Double.parseDouble(String.valueOf(txtPorError.getText()));
        funcionXr=(((valorFuncionA*valorB)-(valorFuncionB*valorA))/(valorFuncionA-valorFuncionB));
        
        x0=funcionXr;
            BigDecimal decimalXr = new BigDecimal(x0);
            decimalXr = decimalXr.setScale((int)decimales, RoundingMode.HALF_UP);
            x0=decimalXr.doubleValue();
            texto+="valor xr: "+ x0+"\n\n";
        if(valorA!=valorB || valorB!=valorA){
           
        do{
          
            funcionX0=(x6*Math.pow(x0, 6))+(x5*Math.pow(x0, 5))+(x4*Math.pow(x0, 4))+(x3*Math.pow(x0, 3))+(x2*Math.pow(x0, 2))+(x1*Math.pow(x0, 1))+c;
            /*BigDecimal decimalA = new BigDecimal(valorFuncionA);
            decimalA = decimalA.setScale((int)decimales, RoundingMode.HALF_UP);
            valorFuncionA=decimalA.doubleValue();
            */
            
            //valorFuncionB=(x6*Math.pow(valorB, 6))+(x5*Math.pow(valorB, 5))+(x4*Math.pow(valorB, 4))+(x3*Math.pow(valorB, 3))+(x2*Math.pow(valorB, 2))+(x1*Math.pow(valorB, 1))+c;
            /*
            BigDecimal decimalB = new BigDecimal(valorFuncionB);
            decimalB = decimalB.setScale((int)decimales, RoundingMode.HALF_UP);
            valorFuncionB=decimalB.doubleValue();
           */
            
           /* compAPm = valorFuncionA*funcionPMedio;
            compBPm = valorFuncionB*funcionPMedio;*/
            funcionXrN=((valorB)-(((funcionX1*x0)-(funcionX1*valorB))/(funcionX0-funcionX1)));
            BigDecimal decimalXrN = new BigDecimal(funcionXrN);
            decimalXrN = decimalXrN.setScale((int)decimales, RoundingMode.HALF_UP);
            funcionXrN=decimalXrN.doubleValue();
            
            errorRelativo=Math.abs(((funcionXrN-x0)/funcionXrN)*100);
            
            BigDecimal decimalE = new BigDecimal(errorRelativo);
            decimalE = decimalE.setScale((int)decimales, RoundingMode.HALF_UP);
            errorRelativo=decimalE.doubleValue();
            
            x0=funcionXrN;
           
            txtAreaValores.setText("iteracion ("+cont+")"+"\nerror Relativo: "+errorRelativo+"\nvalor de x: "+x0+"\n\n");
            texto+=txtAreaValores.getText();
            //System.out.println("iteracion: "+ cont+"\nerror Relativo: "+errorRelativo+"\nvalor del punto medio: "+valorPMedio+"\nvalor funcion(x): "+ funcionAux+"\nvalor b"+valorBAux+"\n\n");
           cont++;
          
        }while(errorRelativo>porError&&cont!=200);
        txtAreaValores.setText(texto);
        lblIteraciones.setText(String.valueOf(cont+"       valor de la raiz: "+ x0));
        cont=0;
        texto="";
        }else {
            txtAreaValores.setText("los rangos deben ser diferentes");
        }
        
        
        
        }
        
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(MetodoReglaFalsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetodoReglaFalsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetodoReglaFalsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetodoReglaFalsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetodoReglaFalsa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIteraciones;
    private javax.swing.JRadioButton rbtnC;
    private javax.swing.JRadioButton rbtnX;
    private javax.swing.JRadioButton rbtnX2;
    private javax.swing.JRadioButton rbtnX3;
    private javax.swing.JRadioButton rbtnX4;
    private javax.swing.JRadioButton rbtnX5;
    private javax.swing.JRadioButton rbtnX6;
    private javax.swing.JTextArea txtAreaValores;
    private javax.swing.JTextField txtConstante;
    private javax.swing.JTextField txtCuadrada;
    private javax.swing.JTextField txtCuarta;
    private javax.swing.JTextField txtCubica;
    private javax.swing.JTextField txtDecimales;
    private javax.swing.JTextField txtLineal;
    private javax.swing.JTextField txtPorError;
    private javax.swing.JTextField txtQuinta;
    private javax.swing.JTextField txtSexta;
    private javax.swing.JTextField txtValorARango;
    private javax.swing.JTextField txtValorBRango;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
