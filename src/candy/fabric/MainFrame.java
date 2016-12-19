/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candy.fabric;

import java.awt.Color;

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
        getContentPane().setBackground(new Color( 59 , 63 , 66));
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
        ButtonForStore = new javax.swing.JButton();
        buttonForSettings = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Frame");

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

        ButtonForStore.setBackground(new java.awt.Color(73, 77, 78));
        ButtonForStore.setForeground(new java.awt.Color(204, 204, 204));
        ButtonForStore.setText("Store House");
        ButtonForStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonForStoreActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonForStore, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonForSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonForProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonForStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(buttonForStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonForProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonForStore, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonForSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonForProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonForProductActionPerformed
        // TODO add your handling code here:
     ProductManage productObj = new ProductManage();
    productObj.pack();
    productObj.setLocationRelativeTo(null);
    productObj.setVisible(true);
    }//GEN-LAST:event_ButtonForProductActionPerformed

    private void buttonForSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonForSettingsActionPerformed
        // TODO add your handling code here:
         Setting settingsObj = new Setting();
     settingsObj.setVisible(true);
    }//GEN-LAST:event_buttonForSettingsActionPerformed

    private void buttonForStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonForStaffActionPerformed
        // TODO add your handling code here:
        StaffManage staffObj = new StaffManage();
     
         staffObj.pack();
    staffObj.setLocationRelativeTo(null);
    staffObj.setVisible(true);
      
       
    }//GEN-LAST:event_buttonForStaffActionPerformed

    private void ButtonForStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonForStoreActionPerformed
        // TODO add your handling code here:
        StoreHouse storeObj = new StoreHouse();
        storeObj.pack();
    storeObj.setLocationRelativeTo(null);
    storeObj.setVisible(true);
    }//GEN-LAST:event_ButtonForStoreActionPerformed

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
    private javax.swing.JButton ButtonForStore;
    private javax.swing.JButton buttonForSettings;
    private javax.swing.JButton buttonForStaff;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
