/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Juan Antonio
 */
public class homeMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form homeMahasiswa
     */
    public homeMahasiswa() {
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

        editprofilehomemahasiswa = new javax.swing.JButton();
        lihatnilaihomemahasiswa = new javax.swing.JButton();
        uploadjawabanhomemahasiswa = new javax.swing.JButton();
        signouthomemahasiswa = new javax.swing.JButton();
        downloadmaterihomemahasiswa = new javax.swing.JButton();
        lihatkehadiranhomemahasiswa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editprofilehomemahasiswa.setText("Edit Profil");
        editprofilehomemahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editprofilehomemahasiswaActionPerformed(evt);
            }
        });

        lihatnilaihomemahasiswa.setText("Lihat Nilai");

        uploadjawabanhomemahasiswa.setText("Upload Jawaban");

        signouthomemahasiswa.setText("Sign Out");
        signouthomemahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signouthomemahasiswaActionPerformed(evt);
            }
        });

        downloadmaterihomemahasiswa.setText("Download Materi");

        lihatkehadiranhomemahasiswa.setText("Lihat Kehadiran");

        jLabel1.setText("Selamat Datang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(signouthomemahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editprofilehomemahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lihatkehadiranhomemahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lihatnilaihomemahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uploadjawabanhomemahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(downloadmaterihomemahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(189, 189, 189))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(editprofilehomemahasiswa)
                .addGap(36, 36, 36)
                .addComponent(downloadmaterihomemahasiswa)
                .addGap(40, 40, 40)
                .addComponent(uploadjawabanhomemahasiswa)
                .addGap(51, 51, 51)
                .addComponent(lihatnilaihomemahasiswa)
                .addGap(46, 46, 46)
                .addComponent(lihatkehadiranhomemahasiswa)
                .addGap(58, 58, 58)
                .addComponent(signouthomemahasiswa)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getDownloadmaterihomemahasiswa() {
        return downloadmaterihomemahasiswa;
    }

    public JButton getEditprofilehomemahasiswa() {
        return editprofilehomemahasiswa;
    }

    public JButton getLihatkehadiranhomemahasiswa() {
        return lihatkehadiranhomemahasiswa;
    }

    public JButton getLihatnilaihomemahasiswa() {
        return lihatnilaihomemahasiswa;
    }

    public JButton getSignouthomemahasiswa() {
        return signouthomemahasiswa;
    }

    public JButton getUploadjawabanhomemahasiswa() {
        return uploadjawabanhomemahasiswa;
    }

    private void signouthomemahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signouthomemahasiswaActionPerformed
        dispose();
        new loginPage().setVisible(true);
    }//GEN-LAST:event_signouthomemahasiswaActionPerformed

    private void editprofilehomemahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editprofilehomemahasiswaActionPerformed
        //dispose();
        //new editProfilm().setVisible(true);
    }//GEN-LAST:event_editprofilehomemahasiswaActionPerformed

    public void addListener (ActionListener e) {
        editprofilehomemahasiswa.addActionListener(e);
        downloadmaterihomemahasiswa.addActionListener(e);
        uploadjawabanhomemahasiswa.addActionListener(e);
        lihatnilaihomemahasiswa.addActionListener(e);
        lihatkehadiranhomemahasiswa.addActionListener(e);
        signouthomemahasiswa.addActionListener(e);
    }
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
            java.util.logging.Logger.getLogger(homeMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton downloadmaterihomemahasiswa;
    private javax.swing.JButton editprofilehomemahasiswa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lihatkehadiranhomemahasiswa;
    private javax.swing.JButton lihatnilaihomemahasiswa;
    private javax.swing.JButton signouthomemahasiswa;
    private javax.swing.JButton uploadjawabanhomemahasiswa;
    // End of variables declaration//GEN-END:variables
}
