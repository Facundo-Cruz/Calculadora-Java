package calculadora_v2;

import java.awt.Color;
import java.awt.Frame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Calculadora extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");

    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        minimizar = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_equals = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_exp = new javax.swing.JButton();
        btn_porcentaje = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();
        btn_mult = new javax.swing.JButton();
        btn_menos = new javax.swing.JButton();
        btn_mas = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_point = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 204));
        jLabel2.setText("•");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(244, 253, 251));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(244, 253, 251));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setBackground(new java.awt.Color(55, 62, 71));
        txtOperacion.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 330, 50));

        txtResultado.setBackground(new java.awt.Color(55, 62, 71));
        txtResultado.setFont(new java.awt.Font("Segoe UI Black", 1, 43)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 330, 80));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-cambio-2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 30, 20));

        minimizar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        minimizar.setForeground(new java.awt.Color(255, 204, 0));
        minimizar.setText("•");
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        jPanel3.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 20, 30));

        cerrar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        cerrar.setForeground(new java.awt.Color(255, 0, 204));
        cerrar.setText("•");
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        jPanel3.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 150));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(340, 390));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_equals.setBackground(new java.awt.Color(55, 62, 71));
        btn_equals.setFont(new java.awt.Font("Segoe UI Historic", 0, 26)); // NOI18N
        btn_equals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-3.png"))); // NOI18N
        btn_equals.setText("=");
        btn_equals.setFocusPainted(false);
        btn_equals.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_equals.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_equals.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1-pressed.png"))); // NOI18N
        btn_equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equalsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_equals, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 340, 50, 50));

        btn_4.setBackground(new java.awt.Color(55, 62, 71));
        btn_4.setFont(new java.awt.Font("Segoe UI Historic", 0, 26)); // NOI18N
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-2.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1-pressed.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 184, 50, 50));

        btn_exp.setBackground(new java.awt.Color(55, 62, 71));
        btn_exp.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        btn_exp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_exp.setText("<-");
        btn_exp.setFocusPainted(false);
        btn_exp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_exp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1-pressed.png"))); // NOI18N
        btn_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_expActionPerformed(evt);
            }
        });
        jPanel1.add(btn_exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 28, 50, 50));

        btn_porcentaje.setBackground(new java.awt.Color(55, 62, 71));
        btn_porcentaje.setFont(new java.awt.Font("Segoe UI Historic", 0, 22)); // NOI18N
        btn_porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_porcentaje.setText("%");
        btn_porcentaje.setFocusPainted(false);
        btn_porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_porcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1-pressed.png"))); // NOI18N
        btn_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcentajeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 28, 50, 50));

        btn_div.setBackground(new java.awt.Color(55, 62, 71));
        btn_div.setFont(new java.awt.Font("Segoe UI Historic", 0, 26)); // NOI18N
        btn_div.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_div.setText("/");
        btn_div.setFocusPainted(false);
        btn_div.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_div.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_div.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1-pressed.png"))); // NOI18N
        btn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divActionPerformed(evt);
            }
        });
        jPanel1.add(btn_div, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 28, 50, 50));

        btn_mult.setBackground(new java.awt.Color(55, 62, 71));
        btn_mult.setFont(new java.awt.Font("Segoe UI Historic", 0, 26)); // NOI18N
        btn_mult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_mult.setText("x");
        btn_mult.setFocusPainted(false);
        btn_mult.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mult.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_mult.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1-pressed.png"))); // NOI18N
        btn_mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multActionPerformed(evt);
            }
        });
        jPanel1.add(btn_mult, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 106, 50, 50));

        btn_menos.setBackground(new java.awt.Color(55, 62, 71));
        btn_menos.setFont(new java.awt.Font("Segoe UI Historic", 0, 26)); // NOI18N
        btn_menos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_menos.setText("-");
        btn_menos.setFocusPainted(false);
        btn_menos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_menos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_menos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1-pressed.png"))); // NOI18N
        btn_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_menos, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 184, 50, 50));

        btn_mas.setBackground(new java.awt.Color(55, 62, 71));
        btn_mas.setFont(new java.awt.Font("Segoe UI Historic", 0, 26)); // NOI18N
        btn_mas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_mas.setText("+");
        btn_mas.setFocusPainted(false);
        btn_mas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_mas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1-pressed.png"))); // NOI18N
        btn_mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masActionPerformed(evt);
            }
        });
        jPanel1.add(btn_mas, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 262, 50, 50));

        btn_c.setBackground(new java.awt.Color(55, 62, 71));
        btn_c.setFont(new java.awt.Font("Segoe UI Historic", 0, 26)); // NOI18N
        btn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_c.setText("C");
        btn_c.setFocusPainted(false);
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1-pressed.png"))); // NOI18N
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel1.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 28, 50, 50));

        btn_7.setBackground(new java.awt.Color(55, 62, 71));
        btn_7.setFont(new java.awt.Font("Segoe UI Historic", 0, 26)); // NOI18N
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-2.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1-pressed.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 106, 50, 50));

        btn_8.setBackground(new java.awt.Color(55, 62, 71));
        btn_8.setFont(new java.awt.Font("Segoe UI Historic", 0, 26)); // NOI18N
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-2.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1-pressed.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 106, 50, 50));

        btn_9.setBackground(new java.awt.Color(55, 62, 71));
        btn_9.setFont(new java.awt.Font("Segoe UI Historic", 0, 26)); // NOI18N
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-2.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1-pressed.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 106, 50, 50));

        btn_6.setBackground(new java.awt.Color(55, 62, 71));
        btn_6.setFont(new java.awt.Font("Segoe UI Historic", 0, 26)); // NOI18N
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-2.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1-pressed.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 184, 50, 50));

        btn_3.setBackground(new java.awt.Color(55, 62, 71));
        btn_3.setFont(new java.awt.Font("Segoe UI Historic", 0, 26)); // NOI18N
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-2.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1-pressed.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 262, 50, 50));

        btn_point.setBackground(new java.awt.Color(55, 62, 71));
        btn_point.setFont(new java.awt.Font("Segoe UI Historic", 0, 26)); // NOI18N
        btn_point.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-2.png"))); // NOI18N
        btn_point.setText(".");
        btn_point.setFocusPainted(false);
        btn_point.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_point.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_point.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1-pressed.png"))); // NOI18N
        btn_point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pointActionPerformed(evt);
            }
        });
        jPanel1.add(btn_point, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 340, 50, 50));

        btn_0.setBackground(new java.awt.Color(55, 62, 71));
        btn_0.setFont(new java.awt.Font("Segoe UI Historic", 0, 26)); // NOI18N
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-2.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1-pressed.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 340, 50, 50));

        btn_1.setBackground(new java.awt.Color(55, 62, 71));
        btn_1.setFont(new java.awt.Font("Segoe UI Historic", 0, 26)); // NOI18N
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-2.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1-pressed.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 262, 50, 50));

        btn_2.setBackground(new java.awt.Color(55, 62, 71));
        btn_2.setFont(new java.awt.Font("Segoe UI Historic", 0, 26)); // NOI18N
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-2.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1-pressed.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 262, 50, 50));

        btn_5.setBackground(new java.awt.Color(55, 62, 71));
        btn_5.setFont(new java.awt.Font("Segoe UI Historic", 0, 26)); // NOI18N
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-2.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-1-pressed.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 184, 50, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, 415));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equalsActionPerformed
        try {
            if (txtOperacion.getText().length() != 0) {
                txtResultado.setText(se.eval(txtOperacion.getText()).toString());
            }
        } catch (ScriptException ex) {
            txtOperacion.setText("Syntax Error --> [C] : Cancel");
        }
    }//GEN-LAST:event_btn_equalsActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        addNumber("4");
        btn_equals.doClick();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expActionPerformed

        if (txtOperacion.getText().length() > 1) {
            String txt = txtOperacion.getText().substring(0, txtOperacion.getText().length() - 1);
            txtOperacion.setText(txt);
            char lastChar = txt.charAt(txt.length() - 1);
            if (lastChar != '+' && lastChar != '-' && lastChar != '/' && lastChar != '*' && lastChar != '%' && lastChar != '.') {
                btn_equals.doClick();
            }
        } else {
            txtOperacion.setText("");
            txtResultado.setText("");
        }

    }//GEN-LAST:event_btn_expActionPerformed

    private void btn_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcentajeActionPerformed
        addNumber("%");
    }//GEN-LAST:event_btn_porcentajeActionPerformed

    private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed
        addNumber("/");
    }//GEN-LAST:event_btn_divActionPerformed

    private void btn_multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multActionPerformed
        addNumber("*");
    }//GEN-LAST:event_btn_multActionPerformed

    private void btn_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menosActionPerformed
        addNumber("-");
    }//GEN-LAST:event_btn_menosActionPerformed

    private void btn_masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masActionPerformed
        addNumber("+");
    }//GEN-LAST:event_btn_masActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        txtResultado.setText("");
        txtOperacion.setText("");
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addNumber("7");
        btn_equals.doClick();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        addNumber("8");
        btn_equals.doClick();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        addNumber("9");
        btn_equals.doClick();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        addNumber("6");
        btn_equals.doClick();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        addNumber("3");
        btn_equals.doClick();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pointActionPerformed
        if (!txtOperacion.getText().contains(".")) {
            addNumber(".");
            btn_equals.doClick();
        } else {
            String[] op = {"-", "+", "%", "*", "/"};
            String operation = txtOperacion.getText();
            String newOperation = "";
            boolean var = false;
            for (int i = operation.length() - 1; i >= 0; i--) {
                for (int j = 0; j < op.length; j++) {
                    if (String.valueOf(operation.charAt(i)).equals(op[j])) {
                        var = true;
                        break;
                    }
                }
                if (var) {
                    break;
                }
                newOperation = newOperation + operation.charAt(i);
            }
            if (!newOperation.contains(".")) {
                addNumber(".");
                btn_equals.doClick();
            }
        }


    }//GEN-LAST:event_btn_pointActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        addNumber("0");
        btn_equals.doClick();
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        addNumber("1");
        btn_equals.doClick();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        addNumber("2");
        btn_equals.doClick();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addNumber("5");
        btn_equals.doClick();
    }//GEN-LAST:event_btn_5ActionPerformed
    boolean darkMode = false;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!darkMode) {
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-cambio-dark.png")));
            jPanel3.setBackground(Color.decode("#212b41"));
            jPanel1.setBackground(Color.decode("#2e3951"));
            txtOperacion.setForeground(Color.decode("#0db387"));
            txtResultado.setForeground(Color.decode("#0db387"));
            cambiarColorDeBoton(btn_0);
            cambiarColorDeBoton(btn_1);
            cambiarColorDeBoton(btn_2);
            cambiarColorDeBoton(btn_3);
            cambiarColorDeBoton(btn_4);
            cambiarColorDeBoton(btn_5);
            cambiarColorDeBoton(btn_6);
            cambiarColorDeBoton(btn_7);
            cambiarColorDeBoton(btn_8);
            cambiarColorDeBoton(btn_9);
            cambiarColorDeBoton(btn_point);
            cambiarColorDeBoton2(btn_mas);
            cambiarColorDeBoton2(btn_menos);
            cambiarColorDeBoton2(btn_mult);
            cambiarColorDeBoton2(btn_exp);
            cambiarColorDeBoton2(btn_div);
            cambiarColorDeBoton2(btn_porcentaje);
            cambiarColorDeBoton2(btn_c);
            btn_equals.setIcon(new ImageIcon(getClass().getResource("/image/btn-3-dark.png")));
            btn_equals.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn-3-dark.png")));
            btn_equals.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn-3-dark-pressed.png")));
            btn_equals.setForeground(Color.decode("#96a8a0"));
            darkMode = true;
        } else {
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btn-cambio-2.png")));
            jPanel3.setBackground(Color.decode("#f4fdfb"));
            jPanel1.setBackground(Color.decode("#ffffff"));
            txtOperacion.setForeground(Color.decode("#373e47"));
            txtResultado.setForeground(Color.decode("#373e47"));
            cambiarColorDeBotonMode(btn_0);
            cambiarColorDeBotonMode(btn_1);
            cambiarColorDeBotonMode(btn_2);
            cambiarColorDeBotonMode(btn_3);
            cambiarColorDeBotonMode(btn_4);
            cambiarColorDeBotonMode(btn_5);
            cambiarColorDeBotonMode(btn_6);
            cambiarColorDeBotonMode(btn_7);
            cambiarColorDeBotonMode(btn_8);
            cambiarColorDeBotonMode(btn_9);
            cambiarColorDeBotonMode(btn_point);
            cambiarColorDeBoton2Mode(btn_mas);
            cambiarColorDeBoton2Mode(btn_menos);
            cambiarColorDeBoton2Mode(btn_mult);
            cambiarColorDeBoton2Mode(btn_exp);
            cambiarColorDeBoton2Mode(btn_div);
            cambiarColorDeBoton2Mode(btn_porcentaje);
            cambiarColorDeBoton2Mode(btn_c);
            btn_equals.setIcon(new ImageIcon(getClass().getResource("/image/btn-3.png")));
            btn_equals.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn-3.png")));
            btn_equals.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn-1-pressed.png")));
            btn_equals.setForeground(Color.decode("#ffffff"));
            darkMode = false;   
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    public void cambiarColorDeBoton(JButton button) {
        button.setIcon(new ImageIcon(getClass().getResource("/image/btn-1-dark.png")));
        button.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn-1-dark.png")));
        button.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn-1-pressed-dark-claro.png")));
        button.setForeground(Color.decode("#96a8a0"));
    }

    public void cambiarColorDeBoton2(JButton button) {
        button.setIcon(new ImageIcon(getClass().getResource("/image/btn-1-pressed-dark-claro.png")));
        button.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn-1-pressed-dark-claro.png")));
        button.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn-1-pressed-dark.png")));
        button.setForeground(Color.decode("#0db387"));
    }
    
    public void cambiarColorDeBotonMode(JButton button) {
        button.setIcon(new ImageIcon(getClass().getResource("/image/btn-2.png")));
        button.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn-2.png")));
        button.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn-1-pressed.png")));
        button.setForeground(Color.decode("#373e47"));
    }
    public void cambiarColorDeBoton2Mode(JButton button) {
        button.setIcon(new ImageIcon(getClass().getResource("/image/btn-1.png")));
        button.setPressedIcon(new ImageIcon(getClass().getResource("/image/btn-1.png")));
        button.setRolloverIcon(new ImageIcon(getClass().getResource("/image/btn-1-pressed.png")));
        button.setForeground(Color.decode("#373e47"));
    }
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    public void addNumber(String digit) {
        txtOperacion.setText(txtOperacion.getText() + digit);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_equals;
    private javax.swing.JButton btn_exp;
    private javax.swing.JButton btn_mas;
    private javax.swing.JButton btn_menos;
    private javax.swing.JButton btn_mult;
    private javax.swing.JButton btn_point;
    private javax.swing.JButton btn_porcentaje;
    private javax.swing.JLabel cerrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel minimizar;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
