/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defensesystem;

/**
 *
 * @author user
 */
public class Tank extends SuperDefence {

    private int currentStrength = 0;
    
    public Tank() {
        initComponents();
    }
    
    private void updateWeaponButtons(){
        boolean isInPosition = checkPosition.isSelected();

        if(isInPosition && currentStrength >= 20){
            btnShoot.setEnabled(true);
        }else{
            btnShoot.setEnabled(false);
        }

        if(isInPosition && currentStrength >= 40){
            btnMissile.setEnabled(true);
        }else{
            btnMissile.setEnabled(false);
        }

        if(isInPosition && currentStrength >= 60){
            btnRadar.setEnabled(true);
        }else {
            btnRadar.setEnabled(false);
        }

        if(isInPosition && currentStrength >= 80){
            btnRotate.setEnabled(true);
        }else{
            btnRotate.setEnabled(false);
        }
    }

    @Override
    public void updateAreaClear(boolean isCleared){
        setAreaLabel(lblAreaStatus, isCleared);
    }

    @Override
    public void updatePosition(int strengthValue){
        this.currentStrength = strengthValue;
        updateWeaponButtons();
    }

    @Override
    public void receiveMessage(String message){
        showIncomingMessage(txtMessageBox, message);
    }

    @Override
    public String getUnitName(){
        return "Tank";
    }

    @Override
    public int getSoldierCount(){
        return (int) spinnerSoldierCount.getValue();
    }

    @Override
    public int getAmmoCount(){
        return (int) spinnerAmmoCount.getValue();
    }

    @Override
    public int getFuelOrEnergyAmount(){
        return jSlider7.getValue();
    }

    private void checkPositionActionPerformed(){
        updateWeaponButtons();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        lblAreaStatus = new javax.swing.JLabel();
        btnShoot = new javax.swing.JButton();
        btnLaser = new javax.swing.JButton();
        btnMissile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spinnerSoldierCount = new javax.swing.JSpinner();
        spinnerAmmoCount = new javax.swing.JSpinner();
        checkPosition = new javax.swing.JCheckBox();
        jSlider1 = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessageBox = new javax.swing.JTextArea();
        txtMessageInput = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        jFrame2 = new javax.swing.JFrame();
        lblAreaStatus1 = new javax.swing.JLabel();
        btnShoot1 = new javax.swing.JButton();
        btnLaser1 = new javax.swing.JButton();
        btnMissile1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spinnerSoldierCount1 = new javax.swing.JSpinner();
        spinnerAmmoCount1 = new javax.swing.JSpinner();
        checkPosition1 = new javax.swing.JCheckBox();
        jSlider2 = new javax.swing.JSlider();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMessageBox1 = new javax.swing.JTextArea();
        txtMessageInput1 = new javax.swing.JTextField();
        btnSend1 = new javax.swing.JButton();
        jFrame3 = new javax.swing.JFrame();
        lblAreaStatus2 = new javax.swing.JLabel();
        btnShoot2 = new javax.swing.JButton();
        btnLaser2 = new javax.swing.JButton();
        btnMissile2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        spinnerSoldierCount2 = new javax.swing.JSpinner();
        spinnerAmmoCount2 = new javax.swing.JSpinner();
        checkPosition2 = new javax.swing.JCheckBox();
        jSlider3 = new javax.swing.JSlider();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMessageBox2 = new javax.swing.JTextArea();
        txtMessageInput2 = new javax.swing.JTextField();
        btnSend2 = new javax.swing.JButton();
        jFrame4 = new javax.swing.JFrame();
        lblAreaStatus3 = new javax.swing.JLabel();
        btnShoot3 = new javax.swing.JButton();
        btnLaser3 = new javax.swing.JButton();
        btnMissile3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spinnerSoldierCount3 = new javax.swing.JSpinner();
        spinnerAmmoCount3 = new javax.swing.JSpinner();
        checkPosition3 = new javax.swing.JCheckBox();
        jSlider4 = new javax.swing.JSlider();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtMessageBox3 = new javax.swing.JTextArea();
        txtMessageInput3 = new javax.swing.JTextField();
        btnSend3 = new javax.swing.JButton();
        jFrame5 = new javax.swing.JFrame();
        lblAreaStatus4 = new javax.swing.JLabel();
        btnShoot4 = new javax.swing.JButton();
        btnLaser4 = new javax.swing.JButton();
        btnMissile4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        spinnerSoldierCount4 = new javax.swing.JSpinner();
        spinnerAmmoCount4 = new javax.swing.JSpinner();
        checkPosition4 = new javax.swing.JCheckBox();
        jSlider5 = new javax.swing.JSlider();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtMessageBox4 = new javax.swing.JTextArea();
        txtMessageInput4 = new javax.swing.JTextField();
        btnSend4 = new javax.swing.JButton();
        jFrame6 = new javax.swing.JFrame();
        lblAreaStatus5 = new javax.swing.JLabel();
        btnShoot5 = new javax.swing.JButton();
        btnLaser5 = new javax.swing.JButton();
        btnMissile5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        spinnerSoldierCount5 = new javax.swing.JSpinner();
        spinnerAmmoCount5 = new javax.swing.JSpinner();
        checkPosition5 = new javax.swing.JCheckBox();
        jSlider6 = new javax.swing.JSlider();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtMessageBox5 = new javax.swing.JTextArea();
        txtMessageInput5 = new javax.swing.JTextField();
        btnSend5 = new javax.swing.JButton();
        spinnerAmmoCount6 = new javax.swing.JSpinner();
        checkPosition6 = new javax.swing.JCheckBox();
        jSlider7 = new javax.swing.JSlider();
        lblAreaStatus6 = new javax.swing.JLabel();
        btnShoot6 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtMessageBox6 = new javax.swing.JTextArea();
        btnRadar = new javax.swing.JButton();
        btnRotate = new javax.swing.JButton();
        txtMessageInput6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnSend6 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        spinnerSoldierCount6 = new javax.swing.JSpinner();
        btnMissile7 = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setTitle("Helicopter");

        lblAreaStatus.setText("Area Not CLeared");

        btnShoot.setText("Shoot");
        btnShoot.setEnabled(false);

        btnLaser.setText("Laser Operation");
        btnLaser.setEnabled(false);

        btnMissile.setText("Missile Operation");
        btnMissile.setEnabled(false);

        jLabel1.setText("Soldier Count");

        jLabel2.setText("Ammo Count");

        checkPosition.setText("Position");

        jSlider1.setMajorTickSpacing(20);
        jSlider1.setMinorTickSpacing(10);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(100);

        txtMessageBox.setEditable(false);
        txtMessageBox.setColumns(20);
        txtMessageBox.setLineWrap(true);
        txtMessageBox.setRows(5);
        jScrollPane1.setViewportView(txtMessageBox);

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAreaStatus)
                                    .addGroup(jFrame1Layout.createSequentialGroup()
                                        .addComponent(btnShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnMissile, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnLaser, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jFrame1Layout.createSequentialGroup()
                                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spinnerAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(checkPosition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(txtMessageInput)
                        .addGap(18, 18, 18)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAreaStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(spinnerSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShoot)
                            .addComponent(btnMissile)
                            .addComponent(jLabel2)
                            .addComponent(spinnerAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLaser)
                            .addComponent(checkPosition))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMessageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jFrame2.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame2.setTitle("Helicopter");

        lblAreaStatus1.setText("Area Not CLeared");

        btnShoot1.setText("Shoot");
        btnShoot1.setEnabled(false);

        btnLaser1.setText("Laser Operation");
        btnLaser1.setEnabled(false);

        btnMissile1.setText("Missile Operation");
        btnMissile1.setEnabled(false);

        jLabel3.setText("Soldier Count");

        jLabel4.setText("Ammo Count");

        checkPosition1.setText("Position");

        jSlider2.setMajorTickSpacing(20);
        jSlider2.setMinorTickSpacing(10);
        jSlider2.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);
        jSlider2.setValue(100);

        txtMessageBox1.setEditable(false);
        txtMessageBox1.setColumns(20);
        txtMessageBox1.setLineWrap(true);
        txtMessageBox1.setRows(5);
        jScrollPane2.setViewportView(txtMessageBox1);

        btnSend1.setText("Send");
        btnSend1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSend1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame2Layout.createSequentialGroup()
                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jFrame2Layout.createSequentialGroup()
                                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAreaStatus1)
                                    .addGroup(jFrame2Layout.createSequentialGroup()
                                        .addComponent(btnShoot1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnMissile1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnLaser1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jFrame2Layout.createSequentialGroup()
                                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spinnerAmmoCount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerSoldierCount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(checkPosition1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
                    .addGroup(jFrame2Layout.createSequentialGroup()
                        .addComponent(txtMessageInput1)
                        .addGap(18, 18, 18)
                        .addComponent(btnSend1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame2Layout.createSequentialGroup()
                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAreaStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(spinnerSoldierCount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShoot1)
                            .addComponent(btnMissile1)
                            .addComponent(jLabel4)
                            .addComponent(spinnerAmmoCount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLaser1)
                            .addComponent(checkPosition1))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMessageInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jFrame3.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame3.setTitle("Helicopter");

        lblAreaStatus2.setText("Area Not CLeared");

        btnShoot2.setText("Shoot");
        btnShoot2.setEnabled(false);

        btnLaser2.setText("Laser Operation");
        btnLaser2.setEnabled(false);

        btnMissile2.setText("Missile Operation");
        btnMissile2.setEnabled(false);

        jLabel5.setText("Soldier Count");

        jLabel6.setText("Ammo Count");

        checkPosition2.setText("Position");

        jSlider3.setMajorTickSpacing(20);
        jSlider3.setMinorTickSpacing(10);
        jSlider3.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider3.setPaintLabels(true);
        jSlider3.setPaintTicks(true);
        jSlider3.setValue(100);

        txtMessageBox2.setEditable(false);
        txtMessageBox2.setColumns(20);
        txtMessageBox2.setLineWrap(true);
        txtMessageBox2.setRows(5);
        jScrollPane3.setViewportView(txtMessageBox2);

        btnSend2.setText("Send");
        btnSend2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSend2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame3Layout.createSequentialGroup()
                        .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jFrame3Layout.createSequentialGroup()
                                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAreaStatus2)
                                    .addGroup(jFrame3Layout.createSequentialGroup()
                                        .addComponent(btnShoot2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnMissile2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnLaser2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jFrame3Layout.createSequentialGroup()
                                        .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spinnerAmmoCount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerSoldierCount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(checkPosition2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
                    .addGroup(jFrame3Layout.createSequentialGroup()
                        .addComponent(txtMessageInput2)
                        .addGap(18, 18, 18)
                        .addComponent(btnSend2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame3Layout.createSequentialGroup()
                        .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAreaStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(spinnerSoldierCount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShoot2)
                            .addComponent(btnMissile2)
                            .addComponent(jLabel6)
                            .addComponent(spinnerAmmoCount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLaser2)
                            .addComponent(checkPosition2))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMessageInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jFrame4.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame4.setTitle("Helicopter");

        lblAreaStatus3.setText("Area Not CLeared");

        btnShoot3.setText("Shoot");
        btnShoot3.setEnabled(false);

        btnLaser3.setText("Laser Operation");
        btnLaser3.setEnabled(false);

        btnMissile3.setText("Missile Operation");
        btnMissile3.setEnabled(false);

        jLabel7.setText("Soldier Count");

        jLabel8.setText("Ammo Count");

        checkPosition3.setText("Position");

        jSlider4.setMajorTickSpacing(20);
        jSlider4.setMinorTickSpacing(10);
        jSlider4.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider4.setPaintLabels(true);
        jSlider4.setPaintTicks(true);
        jSlider4.setValue(100);

        txtMessageBox3.setEditable(false);
        txtMessageBox3.setColumns(20);
        txtMessageBox3.setLineWrap(true);
        txtMessageBox3.setRows(5);
        jScrollPane4.setViewportView(txtMessageBox3);

        btnSend3.setText("Send");
        btnSend3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSend3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame4Layout.createSequentialGroup()
                        .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jFrame4Layout.createSequentialGroup()
                                .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAreaStatus3)
                                    .addGroup(jFrame4Layout.createSequentialGroup()
                                        .addComponent(btnShoot3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnMissile3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnLaser3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jFrame4Layout.createSequentialGroup()
                                        .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spinnerAmmoCount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerSoldierCount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(checkPosition3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
                    .addGroup(jFrame4Layout.createSequentialGroup()
                        .addComponent(txtMessageInput3)
                        .addGap(18, 18, 18)
                        .addComponent(btnSend3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addComponent(jSlider4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider4, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame4Layout.createSequentialGroup()
                        .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAreaStatus3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(spinnerSoldierCount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShoot3)
                            .addComponent(btnMissile3)
                            .addComponent(jLabel8)
                            .addComponent(spinnerAmmoCount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLaser3)
                            .addComponent(checkPosition3))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMessageInput3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jFrame5.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame5.setTitle("Helicopter");

        lblAreaStatus4.setText("Area Not CLeared");

        btnShoot4.setText("Shoot");
        btnShoot4.setEnabled(false);

        btnLaser4.setText("Laser Operation");
        btnLaser4.setEnabled(false);

        btnMissile4.setText("Missile Operation");
        btnMissile4.setEnabled(false);

        jLabel9.setText("Soldier Count");

        jLabel10.setText("Ammo Count");

        checkPosition4.setText("Position");

        jSlider5.setMajorTickSpacing(20);
        jSlider5.setMinorTickSpacing(10);
        jSlider5.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider5.setPaintLabels(true);
        jSlider5.setPaintTicks(true);
        jSlider5.setValue(100);

        txtMessageBox4.setEditable(false);
        txtMessageBox4.setColumns(20);
        txtMessageBox4.setLineWrap(true);
        txtMessageBox4.setRows(5);
        jScrollPane5.setViewportView(txtMessageBox4);

        btnSend4.setText("Send");
        btnSend4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSend4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame5Layout = new javax.swing.GroupLayout(jFrame5.getContentPane());
        jFrame5.getContentPane().setLayout(jFrame5Layout);
        jFrame5Layout.setHorizontalGroup(
            jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame5Layout.createSequentialGroup()
                        .addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jFrame5Layout.createSequentialGroup()
                                .addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAreaStatus4)
                                    .addGroup(jFrame5Layout.createSequentialGroup()
                                        .addComponent(btnShoot4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnMissile4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnLaser4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jFrame5Layout.createSequentialGroup()
                                        .addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spinnerAmmoCount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerSoldierCount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(checkPosition4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
                    .addGroup(jFrame5Layout.createSequentialGroup()
                        .addComponent(txtMessageInput4)
                        .addGap(18, 18, 18)
                        .addComponent(btnSend4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addComponent(jSlider5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jFrame5Layout.setVerticalGroup(
            jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider5, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame5Layout.createSequentialGroup()
                        .addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAreaStatus4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(spinnerSoldierCount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShoot4)
                            .addComponent(btnMissile4)
                            .addComponent(jLabel10)
                            .addComponent(spinnerAmmoCount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLaser4)
                            .addComponent(checkPosition4))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMessageInput4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jFrame6.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame6.setTitle("Helicopter");

        lblAreaStatus5.setText("Area Not CLeared");

        btnShoot5.setText("Shoot");
        btnShoot5.setEnabled(false);

        btnLaser5.setText("Laser Operation");
        btnLaser5.setEnabled(false);

        btnMissile5.setText("Missile Operation");
        btnMissile5.setEnabled(false);

        jLabel11.setText("Soldier Count");

        jLabel12.setText("Ammo Count");

        checkPosition5.setText("Position");

        jSlider6.setMajorTickSpacing(20);
        jSlider6.setMinorTickSpacing(10);
        jSlider6.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider6.setPaintLabels(true);
        jSlider6.setPaintTicks(true);
        jSlider6.setValue(100);

        txtMessageBox5.setEditable(false);
        txtMessageBox5.setColumns(20);
        txtMessageBox5.setLineWrap(true);
        txtMessageBox5.setRows(5);
        jScrollPane6.setViewportView(txtMessageBox5);

        btnSend5.setText("Send");
        btnSend5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSend5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame6Layout = new javax.swing.GroupLayout(jFrame6.getContentPane());
        jFrame6.getContentPane().setLayout(jFrame6Layout);
        jFrame6Layout.setHorizontalGroup(
            jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame6Layout.createSequentialGroup()
                        .addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jFrame6Layout.createSequentialGroup()
                                .addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAreaStatus5)
                                    .addGroup(jFrame6Layout.createSequentialGroup()
                                        .addComponent(btnShoot5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnMissile5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnLaser5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jFrame6Layout.createSequentialGroup()
                                        .addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spinnerAmmoCount5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spinnerSoldierCount5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(checkPosition5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
                    .addGroup(jFrame6Layout.createSequentialGroup()
                        .addComponent(txtMessageInput5)
                        .addGap(18, 18, 18)
                        .addComponent(btnSend5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addComponent(jSlider6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jFrame6Layout.setVerticalGroup(
            jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider6, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame6Layout.createSequentialGroup()
                        .addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAreaStatus5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(spinnerSoldierCount5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShoot5)
                            .addComponent(btnMissile5)
                            .addComponent(jLabel12)
                            .addComponent(spinnerAmmoCount5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLaser5)
                            .addComponent(checkPosition5))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jFrame6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMessageInput5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSend5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tank");

        checkPosition6.setText("Position");

        jSlider7.setMajorTickSpacing(20);
        jSlider7.setMinorTickSpacing(10);
        jSlider7.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider7.setPaintLabels(true);
        jSlider7.setPaintTicks(true);
        jSlider7.setValue(100);

        lblAreaStatus6.setText("Area Not CLeared");

        btnShoot6.setText("Shoot");
        btnShoot6.setEnabled(false);

        txtMessageBox6.setEditable(false);
        txtMessageBox6.setColumns(20);
        txtMessageBox6.setLineWrap(true);
        txtMessageBox6.setRows(5);
        jScrollPane7.setViewportView(txtMessageBox6);

        btnRadar.setText("Radar Operation");
        btnRadar.setEnabled(false);

        btnRotate.setText("Rotate Shooting");
        btnRotate.setEnabled(false);

        jLabel13.setText("Soldier Count");

        btnSend6.setText("Send");
        btnSend6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSend6ActionPerformed(evt);
            }
        });

        jLabel14.setText("Ammo Count");

        btnMissile7.setText("Missile Operation");
        btnMissile7.setEnabled(false);
        btnMissile7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMissile7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAreaStatus6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnShoot6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnMissile7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnRadar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnRotate, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMessageInput6)
                        .addGap(18, 18, 18)
                        .addComponent(btnSend6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addComponent(jSlider7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider7, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAreaStatus6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(spinnerSoldierCount6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShoot6)
                            .addComponent(jLabel14)
                            .addComponent(spinnerAmmoCount6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMissile7))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRadar)
                            .addComponent(checkPosition6)
                            .addComponent(btnRotate))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMessageInput6, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(btnSend6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        sendToMainController(getUnitName(), txtMessageInput.getText());
        txtMessageInput.setText("");
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnSend1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSend1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSend1ActionPerformed

    private void btnSend2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSend2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSend2ActionPerformed

    private void btnSend3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSend3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSend3ActionPerformed

    private void btnSend4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSend4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSend4ActionPerformed

    private void btnSend5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSend5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSend5ActionPerformed

    private void btnSend6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSend6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSend6ActionPerformed

    private void btnMissile7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMissile7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMissile7ActionPerformed

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
            java.util.logging.Logger.getLogger(Tank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLaser;
    private javax.swing.JButton btnLaser1;
    private javax.swing.JButton btnLaser2;
    private javax.swing.JButton btnLaser3;
    private javax.swing.JButton btnLaser4;
    private javax.swing.JButton btnLaser5;
    private javax.swing.JButton btnMissile;
    private javax.swing.JButton btnMissile1;
    private javax.swing.JButton btnMissile2;
    private javax.swing.JButton btnMissile3;
    private javax.swing.JButton btnMissile4;
    private javax.swing.JButton btnMissile5;
    private javax.swing.JButton btnMissile7;
    private javax.swing.JButton btnRadar;
    private javax.swing.JButton btnRotate;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnSend1;
    private javax.swing.JButton btnSend2;
    private javax.swing.JButton btnSend3;
    private javax.swing.JButton btnSend4;
    private javax.swing.JButton btnSend5;
    private javax.swing.JButton btnSend6;
    private javax.swing.JButton btnShoot;
    private javax.swing.JButton btnShoot1;
    private javax.swing.JButton btnShoot2;
    private javax.swing.JButton btnShoot3;
    private javax.swing.JButton btnShoot4;
    private javax.swing.JButton btnShoot5;
    private javax.swing.JButton btnShoot6;
    private javax.swing.JCheckBox checkPosition;
    private javax.swing.JCheckBox checkPosition1;
    private javax.swing.JCheckBox checkPosition2;
    private javax.swing.JCheckBox checkPosition3;
    private javax.swing.JCheckBox checkPosition4;
    private javax.swing.JCheckBox checkPosition5;
    private javax.swing.JCheckBox checkPosition6;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JFrame jFrame5;
    private javax.swing.JFrame jFrame6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    private javax.swing.JSlider jSlider4;
    private javax.swing.JSlider jSlider5;
    private javax.swing.JSlider jSlider6;
    private javax.swing.JSlider jSlider7;
    private javax.swing.JLabel lblAreaStatus;
    private javax.swing.JLabel lblAreaStatus1;
    private javax.swing.JLabel lblAreaStatus2;
    private javax.swing.JLabel lblAreaStatus3;
    private javax.swing.JLabel lblAreaStatus4;
    private javax.swing.JLabel lblAreaStatus5;
    private javax.swing.JLabel lblAreaStatus6;
    private javax.swing.JSpinner spinnerAmmoCount;
    private javax.swing.JSpinner spinnerAmmoCount1;
    private javax.swing.JSpinner spinnerAmmoCount2;
    private javax.swing.JSpinner spinnerAmmoCount3;
    private javax.swing.JSpinner spinnerAmmoCount4;
    private javax.swing.JSpinner spinnerAmmoCount5;
    private javax.swing.JSpinner spinnerAmmoCount6;
    private javax.swing.JSpinner spinnerSoldierCount;
    private javax.swing.JSpinner spinnerSoldierCount1;
    private javax.swing.JSpinner spinnerSoldierCount2;
    private javax.swing.JSpinner spinnerSoldierCount3;
    private javax.swing.JSpinner spinnerSoldierCount4;
    private javax.swing.JSpinner spinnerSoldierCount5;
    private javax.swing.JSpinner spinnerSoldierCount6;
    private javax.swing.JTextArea txtMessageBox;
    private javax.swing.JTextArea txtMessageBox1;
    private javax.swing.JTextArea txtMessageBox2;
    private javax.swing.JTextArea txtMessageBox3;
    private javax.swing.JTextArea txtMessageBox4;
    private javax.swing.JTextArea txtMessageBox5;
    private javax.swing.JTextArea txtMessageBox6;
    private javax.swing.JTextField txtMessageInput;
    private javax.swing.JTextField txtMessageInput1;
    private javax.swing.JTextField txtMessageInput2;
    private javax.swing.JTextField txtMessageInput3;
    private javax.swing.JTextField txtMessageInput4;
    private javax.swing.JTextField txtMessageInput5;
    private javax.swing.JTextField txtMessageInput6;
    // End of variables declaration//GEN-END:variables
}
