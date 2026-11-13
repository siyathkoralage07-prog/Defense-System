/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defensesystem;

/**
 *
 * @author user
 */
public class Submarine extends SuperDefence {

    private int currentStrength = 0;
    
    public Submarine() {
        initComponents();
    }
    
    private void updateWeaponButtons(){
        boolean isInPosition = checkPosition6.isSelected();

        if(isInPosition && currentStrength >= 20){
            btnShoot6.setEnabled(true);
        }else{
            btnShoot6.setEnabled(false);
        }

        if(isInPosition && currentStrength >= 40){
            btnSonar.setEnabled(true);
        }else{
            btnSonar.setEnabled(false);
        }

        if(isInPosition && currentStrength >= 60){
            btnTomahawk.setEnabled(true);
        }else{
            btnTomahawk.setEnabled(false);
        }

        if(isInPosition && currentStrength >= 80){
            btnTrident.setEnabled(true);
        }else{
            btnTrident.setEnabled(false);
        }
    }

    @Override
    public void updateAreaClear(boolean isCleared){
        setAreaLabel(lblAreaStatus6, isCleared);
    }

    @Override
    public void updatePosition(int strengthValue){
        this.currentStrength = strengthValue;
        updateWeaponButtons();
    }

    @Override
    public void receiveMessage(String message){
        showIncomingMessage(txtMessageBox6, message);
    }

    @Override
    public String getUnitName(){
        return "Submarine";
    }

    @Override
    public int getSoldierCount(){
        return (int) spinnerSoldierCount6.getValue();
    }

    @Override
    public int getAmmoCount(){
        return (int) spinnerAmmoCount6.getValue();
    }

    @Override
    public int getFuelOrEnergyAmount(){
        return sliderEnergy.getValue();
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTrident = new javax.swing.JButton();
        txtMessageInput6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        spinnerAmmoCount6 = new javax.swing.JSpinner();
        btnSend6 = new javax.swing.JButton();
        checkPosition6 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        sliderOxygen = new javax.swing.JSlider();
        spinnerSoldierCount6 = new javax.swing.JSpinner();
        lblAreaStatus6 = new javax.swing.JLabel();
        btnSonar = new javax.swing.JButton();
        btnShoot6 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtMessageBox6 = new javax.swing.JTextArea();
        btnTomahawk = new javax.swing.JButton();
        sliderEnergy = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Submarine");

        btnTrident.setText("Trident-2 Missile");
        btnTrident.setEnabled(false);

        jLabel13.setText("Soldier Count");

        btnSend6.setText("Send");
        btnSend6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSend6ActionPerformed(evt);
            }
        });

        checkPosition6.setText("Position");
        checkPosition6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPosition6ActionPerformed(evt);
            }
        });

        jLabel14.setText("Ammo Count");

        sliderOxygen.setMajorTickSpacing(20);
        sliderOxygen.setMinorTickSpacing(10);
        sliderOxygen.setOrientation(javax.swing.JSlider.VERTICAL);
        sliderOxygen.setPaintLabels(true);
        sliderOxygen.setPaintTicks(true);
        sliderOxygen.setValue(100);

        lblAreaStatus6.setText("Area Not CLeared");

        btnSonar.setText("Sonar Operation");
        btnSonar.setEnabled(false);
        btnSonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonarActionPerformed(evt);
            }
        });

        btnShoot6.setText("Shoot");
        btnShoot6.setEnabled(false);

        txtMessageBox6.setEditable(false);
        txtMessageBox6.setColumns(20);
        txtMessageBox6.setLineWrap(true);
        txtMessageBox6.setRows(5);
        jScrollPane7.setViewportView(txtMessageBox6);

        btnTomahawk.setText("Tomahawk Missile");
        btnTomahawk.setEnabled(false);

        sliderEnergy.setMajorTickSpacing(20);
        sliderEnergy.setMinorTickSpacing(10);
        sliderEnergy.setOrientation(javax.swing.JSlider.VERTICAL);
        sliderEnergy.setPaintLabels(true);
        sliderEnergy.setPaintTicks(true);
        sliderEnergy.setValue(100);

        jLabel1.setText("Energy");

        jLabel2.setText("Oxygen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAreaStatus6)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnShoot6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnSonar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnTomahawk, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnTrident, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(spinnerAmmoCount6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(spinnerSoldierCount6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(checkPosition6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMessageInput6, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSend6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sliderEnergy, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sliderOxygen, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAreaStatus6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(spinnerSoldierCount6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sliderOxygen, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sliderEnergy, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShoot6)
                            .addComponent(jLabel14)
                            .addComponent(spinnerAmmoCount6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSonar))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTomahawk)
                            .addComponent(checkPosition6)
                            .addComponent(btnTrident))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMessageInput6, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(btnSend6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSend6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSend6ActionPerformed
        sendToMainController(getUnitName(), txtMessageInput6.getText());
        txtMessageInput6.setText("");
    }//GEN-LAST:event_btnSend6ActionPerformed

    private void btnSonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSonarActionPerformed

    private void checkPosition6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPosition6ActionPerformed
       updateWeaponButtons();
    }//GEN-LAST:event_checkPosition6ActionPerformed

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
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Submarine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend6;
    private javax.swing.JButton btnShoot6;
    private javax.swing.JButton btnSonar;
    private javax.swing.JButton btnTomahawk;
    private javax.swing.JButton btnTrident;
    private javax.swing.JCheckBox checkPosition6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblAreaStatus6;
    private javax.swing.JSlider sliderEnergy;
    private javax.swing.JSlider sliderOxygen;
    private javax.swing.JSpinner spinnerAmmoCount6;
    private javax.swing.JSpinner spinnerSoldierCount6;
    private javax.swing.JTextArea txtMessageBox6;
    private javax.swing.JTextField txtMessageInput6;
    // End of variables declaration//GEN-END:variables
}
