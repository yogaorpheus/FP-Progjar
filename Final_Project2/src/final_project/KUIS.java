/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project;

/**
 *
 * @author ASUS
 */
public class KUIS extends javax.swing.JFrame {

    /**
     * Creates new form KUIS
     */
    public KUIS() {
        initComponents();
        this.setSize(425,370);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField6 = new java.awt.TextField();
        jButton7 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        textField1 = new java.awt.TextField();
        jTextField8 = new javax.swing.JTextField();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        textField4 = new java.awt.TextField();
        textField5 = new java.awt.TextField();
        textField7 = new java.awt.TextField();
        textField8 = new java.awt.TextField();
        jTextField1 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        textField6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textField6.setText("TIMER");
        textField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField6ActionPerformed(evt);
            }
        });
        getContentPane().add(textField6);
        textField6.setBounds(30, 10, 60, 23);

        jButton7.setBackground(new java.awt.Color(165, 141, 23));
        jButton7.setForeground(new java.awt.Color(58, 56, 46));
        jButton7.setText("Menu");
        getContentPane().add(jButton7);
        jButton7.setBounds(330, 10, 59, 23);

        jTextField6.setBackground(new java.awt.Color(214, 203, 152));
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField6.setText("SCORE");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(320, 50, 73, 20);

        textField1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textField1.setText("1");
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        getContentPane().add(textField1);
        textField1.setBounds(201, 48, 20, 23);

        jTextField8.setBackground(new java.awt.Color(214, 203, 152));
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField8.setText("KATEGORI");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(10, 48, 100, 20);

        textField2.setText("Question");
        getContentPane().add(textField2);
        textField2.setBounds(18, 75, 213, 33);

        textField3.setText("textField3");
        getContentPane().add(textField3);
        textField3.setBounds(46, 118, 149, 20);

        textField4.setText("textField4");
        getContentPane().add(textField4);
        textField4.setBounds(46, 148, 149, 20);

        textField5.setText("textField5");
        getContentPane().add(textField5);
        textField5.setBounds(46, 178, 149, 20);

        textField7.setText("textField7");
        getContentPane().add(textField7);
        textField7.setBounds(46, 208, 149, 20);

        textField8.setText("textField8");
        getContentPane().add(textField8);
        textField8.setBounds(46, 241, 149, 20);

        jTextField1.setText("Ketikkan Jawabannya disini");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(232, 148, 151, 50);

        jButton8.setBackground(new java.awt.Color(165, 141, 23));
        jButton8.setForeground(new java.awt.Color(58, 56, 46));
        jButton8.setText("Submit");
        getContentPane().add(jButton8);
        jButton8.setBounds(320, 210, 65, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/final_project/back.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField6ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

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
            java.util.logging.Logger.getLogger(KUIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KUIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KUIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KUIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KUIS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    private java.awt.TextField textField6;
    private java.awt.TextField textField7;
    private java.awt.TextField textField8;
    // End of variables declaration//GEN-END:variables
}
