/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candy.fabric;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Acer-Aspire
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
       
        initComponents();
         getContentPane().setBackground(new Color( ContainerClass.valOne , ContainerClass.valTwo , ContainerClass.valThree));
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        buttonForStaff = new javax.swing.JButton();
        ButtonForProduct = new javax.swing.JButton();
        buttonForBack = new javax.swing.JButton();
        buttonForExit = new javax.swing.JButton();
        buttonForSettings = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Frame");
        setBackground(new java.awt.Color(59, 63, 66));

        buttonForStaff.setBackground(new java.awt.Color(73, 77, 78));
        buttonForStaff.setForeground(new java.awt.Color(204, 204, 204));
        buttonForStaff.setText("Staff Management");
        buttonForStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonForStaffActionPerformed(evt);
            }
        });

        ButtonForProduct.setBackground(new java.awt.Color(73, 77, 78));
        ButtonForProduct.setForeground(new java.awt.Color(204, 204, 204));
        ButtonForProduct.setText("Product Management");
        ButtonForProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonForProductActionPerformed(evt);
            }
        });

        buttonForBack.setBackground(new java.awt.Color(73, 77, 78));
        buttonForBack.setForeground(new java.awt.Color(204, 204, 204));
        buttonForBack.setText("Go Back");
        buttonForBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonForBackActionPerformed(evt);
            }
        });

        buttonForExit.setBackground(new java.awt.Color(73, 77, 78));
        buttonForExit.setForeground(new java.awt.Color(204, 204, 204));
        buttonForExit.setText("Exit");
        buttonForExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonForExitActionPerformed(evt);
            }
        });

        buttonForSettings.setBackground(new java.awt.Color(73, 77, 78));
        buttonForSettings.setForeground(new java.awt.Color(204, 204, 204));
        buttonForSettings.setText("Settings");
        buttonForSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonForSettingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonForBack, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(buttonForExit, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addComponent(ButtonForProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addComponent(buttonForStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addComponent(buttonForSettings, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
                .addGap(190, 190, 190))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(buttonForStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonForProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonForSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonForBack, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonForExit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonForProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonForProductActionPerformed
        // TODO add your handling code here:
     ProductManage productObj = new ProductManage();
    productObj.pack();
    productObj.setLocationRelativeTo(null);
    productObj.setVisible(true);
         super.dispose();
        
      
    }//GEN-LAST:event_ButtonForProductActionPerformed

    private void buttonForStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonForStaffActionPerformed
        // TODO add your handling code here:
        StaffManage staffObj = new StaffManage();
     
         staffObj.pack();
    staffObj.setLocationRelativeTo(null);
    staffObj.setVisible(true);
      super.dispose();
       
    }//GEN-LAST:event_buttonForStaffActionPerformed

    private void buttonForBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonForBackActionPerformed
        // TODO add your handling code here:
         EntryForm entryForm = new EntryForm();
                        entryForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        entryForm.pack();
                        entryForm.setLocationRelativeTo(null);
                        entryForm.setVisible(true);
                        super.dispose();
        
    }//GEN-LAST:event_buttonForBackActionPerformed

    private void buttonForExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonForExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_buttonForExitActionPerformed

    private void buttonForSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonForSettingsActionPerformed
        // TODO add your handling code here:
        Settings   settingsObj = new Settings();
    settingsObj.pack();
    settingsObj.setLocationRelativeTo(null);
    settingsObj.setVisible(true);
         super.dispose();
    }//GEN-LAST:event_buttonForSettingsActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonForProduct;
    private javax.swing.JButton buttonForBack;
    private javax.swing.JButton buttonForExit;
    private javax.swing.JButton buttonForSettings;
    private javax.swing.JButton buttonForStaff;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
