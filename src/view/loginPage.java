/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Juan Antonio
 */
public class loginPage extends javax.swing.JFrame {

    /**
     * Creates new form loginPage
     */
    public loginPage() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passlogin = new javax.swing.JTextField();
        nimniplogin = new javax.swing.JTextField();
        signinsignin = new javax.swing.JButton();
        signupsignin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lupapasswordsignin = new javax.swing.JButton();
        xlogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIM/NIP  :");

        jLabel2.setText("Password :");

        passlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passloginActionPerformed(evt);
            }
        });

        nimniplogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimniploginActionPerformed(evt);
            }
        });

        signinsignin.setText("Sign In");
        signinsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinsigninActionPerformed(evt);
            }
        });

        signupsignin.setText("Sign Up");
        signupsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupsigninActionPerformed(evt);
            }
        });

        jLabel3.setText("Aplikasi Pembelajaran Online");

        lupapasswordsignin.setText("Lupa Password");
        lupapasswordsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupapasswordsigninActionPerformed(evt);
            }
        });

        xlogin.setText("X");
        xlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xloginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(lupapasswordsignin))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(signupsignin)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nimniplogin, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(signinsignin))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 407, Short.MAX_VALUE)
                                .addComponent(xlogin)
                                .addGap(18, 18, 18))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nimniplogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(passlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(xlogin)
                        .addGap(170, 170, 170)
                        .addComponent(signinsignin)))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signupsignin)
                    .addComponent(lupapasswordsignin))
                .addContainerGap(306, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getNimniplogin() {
        return nimniplogin;
    }

    public void setNimniplogin(JTextField nimniplogin) {
        this.nimniplogin = nimniplogin;
    }

    public JTextField getPasslogin() {
        return passlogin;
    }

    public void setPasslogin(JTextField passlogin) {
        this.passlogin = passlogin;
    }

    public JButton getLupapasswordsignin() {
        return lupapasswordsignin;
    }

    public JButton getSigninsignin() {
        return signinsignin;
    }

    public JButton getSignupsignin() {
        return signupsignin;
    }

    public JButton getXlogin() {
        return xlogin;
    }
    
    public void addListener (ActionListener e) {
        lupapasswordsignin.addActionListener(e);
        signupsignin.addActionListener(e);
    }
    

    private void passloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passloginActionPerformed

    private void nimniploginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimniploginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nimniploginActionPerformed

    private void signinsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinsigninActionPerformed
        
    }//GEN-LAST:event_signinsigninActionPerformed

    private void signupsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupsigninActionPerformed
        dispose();
        new signupPage().setVisible(true);
    }//GEN-LAST:event_signupsigninActionPerformed

    private void lupapasswordsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupapasswordsigninActionPerformed
        dispose();
        new lupapasswordPage().setVisible(true);
    }//GEN-LAST:event_lupapasswordsigninActionPerformed

    private void xloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xloginActionPerformed
        dispose();
    }//GEN-LAST:event_xloginActionPerformed

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
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton lupapasswordsignin;
    private javax.swing.JTextField nimniplogin;
    private javax.swing.JTextField passlogin;
    private javax.swing.JButton signinsignin;
    private javax.swing.JButton signupsignin;
    private javax.swing.JButton xlogin;
    // End of variables declaration//GEN-END:variables
}
