/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplication_P;

import java.awt.Color;

/**
 *
 * @author radu.muntianu
 */
public class Aplication extends javax.swing.JFrame {
    double weightVar;
    double heightVar;
    double ageVar;
    double resultVar;

    /**
     * Creates new form Aplication
     */
    public Aplication() {
        initComponents();
        height.setBackground(new Color(0, 0, 0, 64));
        weight.setBackground(new Color(0, 0, 0, 64));
        age.setBackground(new Color(0, 0, 0, 64));
        result.setBackground(new Color(0, 0, 0, 64));
        calculate.setBackground(new Color(0, 0, 0, 64));
        result1.setBackground(new Color(0, 0, 0, 64));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        weight = new javax.swing.JTextField();
        height = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();
        result = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        result1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calories calculator");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 0, 51));
        setFocusable(false);
        setIconImages(null);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(1620, 1040));
        jPanel1.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(final java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(540, 10, 34, 30);

        weight.setBackground(new java.awt.Color(204, 204, 204));
        weight.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        weight.setForeground(new java.awt.Color(204, 204, 204));
        weight.setText(" ");
        weight.setCaretColor(new java.awt.Color(255, 255, 255));
        weight.setPreferredSize(new java.awt.Dimension(6, 35));
        weight.setSelectionColor(new java.awt.Color(0, 0, 0));
        weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                weightActionPerformed(evt);
            }
        });
        jPanel1.add(weight);
        weight.setBounds(10, 80, 194, 35);

        height.setBackground(new java.awt.Color(204, 204, 204));
        height.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        height.setForeground(new java.awt.Color(204, 204, 204));
        height.setText(" ");
        height.setCaretColor(new java.awt.Color(255, 255, 255));
        height.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        height.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        height.setPreferredSize(new java.awt.Dimension(6, 35));
        height.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                heightActionPerformed(evt);
            }
        });
        jPanel1.add(height);
        height.setBounds(10, 130, 194, 35);

        age.setBackground(new java.awt.Color(204, 204, 204));
        age.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        age.setForeground(new java.awt.Color(204, 204, 204));
        age.setText(" ");
        age.setCaretColor(new java.awt.Color(255, 255, 255));
        age.setPreferredSize(new java.awt.Dimension(6, 35));
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        jPanel1.add(age);
        age.setBounds(10, 180, 194, 35);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Weight in kg.");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(210, 80, 134, 30);

        jComboBox1.setBackground(new java.awt.Color(102, 102, 102));
        jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jComboBox1.setToolTipText("");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(10, 20, 110, 20);
        jComboBox1.getAccessibleContext().setAccessibleName("");

        jComboBox2.setBackground(new java.awt.Color(102, 102, 102));
        jComboBox2.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Lightly active(moderate exercise but sedentary job)",
                        "Moderately active(intense exercise but sedentary job)",
                        "Very active(intense exercise and active job)" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(10, 50, 320, 20);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Height in cm.");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 130, 134, 35);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Age.");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 180, 57, 35);

        calculate.setBackground(new java.awt.Color(153, 153, 153));
        calculate.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        calculate.setForeground(new java.awt.Color(204, 204, 204));
        calculate.setText("Calculate");
        calculate.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });
        jPanel1.add(calculate);
        calculate.setBounds(10, 230, 121, 34);

        result.setEditable(false);
        result.setBackground(new java.awt.Color(204, 204, 204));
        result.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        result.setForeground(new java.awt.Color(204, 204, 204));
        result.setText(" ");
        result.setPreferredSize(new java.awt.Dimension(6, 35));
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });
        jPanel1.add(result);
        result.setBounds(10, 280, 194, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Calories needed to lose weight.");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 280, 276, 32);

        result1.setEditable(false);
        result1.setBackground(new java.awt.Color(204, 204, 204));
        result1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        result1.setForeground(new java.awt.Color(204, 204, 204));
        result1.setText(" ");
        result1.setPreferredSize(new java.awt.Dimension(6, 35));
        result1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                result1ActionPerformed(evt);
            }
        });
        jPanel1.add(result1);
        result1.setBounds(10, 330, 194, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Calories needed to gain muscle.");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(210, 330, 276, 32);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplication_P/images/kettleball-pow.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 570, 380);

        final javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380,
                Short.MAX_VALUE));

        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(570, 380));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void weightActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_weightActionPerformed
        // TODO add your handling code here:
        final String EnterNumber = weight.getText();
        weight.setText(EnterNumber);
    }// GEN-LAST:event_weightActionPerformed

    private void heightActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_heightActionPerformed
        // TODO add your handling code here:
        final String EnterNumber = height.getText();
        height.setText(EnterNumber);
    }// GEN-LAST:event_heightActionPerformed

    private void ageActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ageActionPerformed
        final String EnterNumber = age.getText();
        age.setText(EnterNumber);
    }// GEN-LAST:event_ageActionPerformed

    private void calculateActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_calculateActionPerformed
        // TODO add your handling code here:
        final String gender = (jComboBox1.getSelectedItem().toString());
        final String activity = (jComboBox2.getSelectedItem().toString());
        double activityElement = 0;

        weightVar = Double.parseDouble(weight.getText());
        heightVar = Double.parseDouble(height.getText());
        ageVar = Double.parseDouble(age.getText());

        if (activity == "Moderately active(intense exercise but sedentary job)") {
            activityElement = 297;
        }
        if (activity == "Very active(intense exercise and active job)") {
            activityElement = 612;
        }
        if (gender == "Male") {
            resultVar = (10 * weightVar) + (6.25 * heightVar) - (5 * ageVar) + 5 + activityElement;

        } else {
            resultVar = (10 * weightVar) + (6.25 * heightVar) - (5 * ageVar) - 161 + activityElement;

        }

        String answer;
        String answer1;
        answer = String.format(" %.0f", resultVar);
        answer1 = String.format(" %.0f", resultVar + 830);
        result.setText(answer);
        result1.setText(answer1);

    }// GEN-LAST:event_calculateActionPerformed

    private void resultActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_resultActionPerformed
        // TODO add your handling code here:
        // String answer;
        // answer= String.format("%.0f", resultVar);
        // result.setText(answer);

    }// GEN-LAST:event_resultActionPerformed

    private void jLabel6MousePressed(final java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel6MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }// GEN-LAST:event_jLabel6MousePressed

    private void jComboBox1ActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jComboBox2ActionPerformed

    private void result1ActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_result1ActionPerformed

    }// GEN-LAST:event_result1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(final String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (final javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (final ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aplication.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (final InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplication.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (final IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplication.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (final javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplication.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JButton calculate;
    private javax.swing.JTextField height;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField result;
    private javax.swing.JTextField result1;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}
