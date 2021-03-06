/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candy.fabric;

import java.awt.Color;
import javax.swing.JFrame;



public class Settings extends javax.swing.JFrame {

    /**
     * Creates new form Settings
     */
    public Settings() {
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

        buttonForConfirm = new javax.swing.JButton();
        buttonForBack = new javax.swing.JButton();
        comboBoxForColor = new javax.swing.JComboBox<String>();
        laberForDisplay = new javax.swing.JLabel();
        laberForInfoColor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonForConfirm.setText("Confirm");
        buttonForConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonForConfirmActionPerformed(evt);
            }
        });

        buttonForBack.setText("Go Back");
        buttonForBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonForBackActionPerformed(evt);
            }
        });

        comboBoxForColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Platinum", "Gold", "Silver" }));

        laberForDisplay.setText("Color");

        laberForInfoColor.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        laberForInfoColor.setForeground(new java.awt.Color(153, 153, 255));
        laberForInfoColor.setText("Please choose color and click Confirm!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(laberForDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonForConfirm)
                        .addGap(72, 72, 72)
                        .addComponent(buttonForBack))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboBoxForColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(laberForInfoColor)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(laberForInfoColor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBoxForColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(laberForDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonForConfirm)
                    .addComponent(buttonForBack))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonForConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonForConfirmActionPerformed
        // TODO add your handling code here:
        changeColor();
       repaintFrame();
    }//GEN-LAST:event_buttonForConfirmActionPerformed

    private void buttonForBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonForBackActionPerformed
        // TODO add your handling code here:
        MainFrame mainFrame = new MainFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       mainFrame.pack();
    mainFrame.setLocationRelativeTo(null);
    mainFrame.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_buttonForBackActionPerformed
private void changeColor(){
    
    ContainerClass.changeColorWithClass(comboBoxForColor.getSelectedItem().toString());
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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }
private void repaintFrame(){
     Settings settingsObj = new Settings();
        settingsObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       settingsObj.pack();
    settingsObj.setLocationRelativeTo(null);
    settingsObj.setVisible(true);
        super.dispose();
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonForBack;
    private javax.swing.JButton buttonForConfirm;
    private javax.swing.JComboBox<String> comboBoxForColor;
    private javax.swing.JLabel laberForDisplay;
    private javax.swing.JLabel laberForInfoColor;
    // End of variables declaration//GEN-END:variables
}
