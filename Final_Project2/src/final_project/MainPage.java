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
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public MainPage() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(181, 241, 252));

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(181, 241, 252));
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(282, 11, 24, 38);

        jScrollPane2.setBackground(new java.awt.Color(181, 241, 252));

        jTextPane2.setEditable(false);
        jTextPane2.setBackground(new java.awt.Color(181, 241, 252));
        jScrollPane2.setViewportView(jTextPane2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(342, 11, 24, 38);

        jScrollPane3.setBackground(new java.awt.Color(181, 241, 252));

        jTextPane3.setEditable(false);
        jTextPane3.setBackground(new java.awt.Color(181, 241, 252));
        jScrollPane3.setViewportView(jTextPane3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(312, 11, 24, 38);

        jScrollPane4.setBackground(new java.awt.Color(181, 241, 252));

        jTextPane4.setEditable(false);
        jTextPane4.setBackground(new java.awt.Color(181, 241, 252));
        jScrollPane4.setViewportView(jTextPane4);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(376, 11, 24, 38);

        jLabel1.setBackground(new java.awt.Color(7, 66, 112));
        jLabel1.setFont(new java.awt.Font("Bodoni MT Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(8, 43, 71));
        jLabel1.setText("Score Tertinggi");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(131, 11, 141, 22);

        jLabel2.setBackground(new java.awt.Color(9, 82, 155));
        jLabel2.setFont(new java.awt.Font("Snap ITC", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(9, 82, 155));
        jLabel2.setText("Tebak Tebakan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 50, 302, 47);

        jLabel3.setFont(new java.awt.Font("STCaiyun", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(9, 82, 155));
        jLabel3.setText("Santai");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 100, 98, 39);

        jToggleButton1.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jToggleButton1.setText("Play Game");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(140, 180, 127, 27);

        jToggleButton2.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jToggleButton2.setText("Rank");
        jToggleButton2.setFocusCycleRoot(true);
        jToggleButton2.setInheritsPopupMenu(true);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(140, 220, 127, 27);

        jToggleButton3.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jToggleButton3.setText("EXIT");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton3);
        jToggleButton3.setBounds(140, 260, 127, 27);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setText("USERNAME");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(150, 140, 106, 28);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 410, 330);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/final_project/background.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 410, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration//GEN-END:variables
}