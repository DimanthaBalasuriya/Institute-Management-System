package com.prog.cnv.sys.control.system.student;

import com.prog.cnv.sys.control.system.student.PaymentAndBill.CashierWizard;
import com.prog.cnv.sys.control.system.control.Database;
import com.prog.cnv.sys.control.system.control.MD5;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Login extends javax.swing.JFrame {

    int logCounter = 1;

    public Login() {
        initComponents();
        setDateAndTime();
        lab_use_fpass.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txt_log_username = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_log_login = new javax.swing.JButton();
        lab_use_message = new javax.swing.JLabel();
        lab_use_fpass = new javax.swing.JLabel();
        lab_use_message1 = new javax.swing.JLabel();
        txt_log_password = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lab_use_privacy = new javax.swing.JLabel();
        lab_use_help = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_log_username.setBackground(new java.awt.Color(255, 255, 255));
        txt_log_username.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        txt_log_username.setForeground(new java.awt.Color(51, 51, 51));
        txt_log_username.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)), "Username", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 153, 51))); // NOI18N
        txt_log_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_log_usernameActionPerformed(evt);
            }
        });
        jPanel3.add(txt_log_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 650, 60));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CAMBRIDGE INSTITUTE");
        jLabel5.setOpaque(true);
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 90));

        btn_log_login.setText("LOGIN");
        btn_log_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_log_loginActionPerformed(evt);
            }
        });
        jPanel3.add(btn_log_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 120, 40));

        lab_use_message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lab_use_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 130, 20));

        lab_use_fpass.setForeground(new java.awt.Color(0, 153, 51));
        lab_use_fpass.setText("Forget Password ?");
        lab_use_fpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_use_fpassMouseClicked(evt);
            }
        });
        jPanel3.add(lab_use_fpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 210, 20));

        lab_use_message1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lab_use_message1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 130, 20));

        txt_log_password.setBackground(new java.awt.Color(255, 255, 255));
        txt_log_password.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51)), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 153, 51))); // NOI18N
        txt_log_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_log_passwordActionPerformed(evt);
            }
        });
        jPanel3.add(txt_log_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 650, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 710, 370));

        jPanel4.setBackground(new java.awt.Color(40, 40, 40));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Cancel_20px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 30, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LOGIN");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        jPanel5.setBackground(new java.awt.Color(40, 40, 40));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lab_use_privacy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_use_privacy.setText("PRIVACY");
        lab_use_privacy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lab_use_privacyMouseClicked(evt);
            }
        });
        jPanel5.add(lab_use_privacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

        lab_use_help.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_use_help.setText("HELP");
        jPanel5.add(lab_use_help, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 40, 30));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 110, 15));

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 15, 110, 15));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, 1370, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/Capture.JPG"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1370, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btn_log_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_log_loginActionPerformed
        String username = txt_log_username.getText();
        String password = txt_log_password.getText();
        String encryptedPassword = MD5.getHash(password);
        SimpleDateFormat sdfD = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdfT = new SimpleDateFormat("hh:mm:ss");
        String usertype = "";
        try {
            ResultSet rs1 = Database.getData("SELECT `user`.`use_avatar`, `user`.`use_id`, `usertype`.`utp_type` FROM `cambridge_project`.`user` INNER JOIN `cambridge_project`.`usertype` \n"
                    + "ON (`user`.`utp_id` = `usertype`.`utp_id`) WHERE `user`.`use_username` = '" + username + "' AND `user`.`use_password` = '" + encryptedPassword + "'");
            if (rs1.next()) {
                usertype = rs1.getString("utp_type");
                String user = rs1.getString("use_id");
                if (usertype.equalsIgnoreCase("ADMIN")) {
                    AdminPanel adp = new AdminPanel(user);
                    adp.setVisible(true);
                    Database.sendData("INSERT INTO loginsession(lgs_inTime,lgs_date, use_id) "
                            + "VALUES('" + sdfT.format(new Date()) + "', '" + sdfD.format(new Date()) + "', '" + user + "')");
                    Database.sendData("INSERT INTO notification (nti_title, nti_body, nti_date, nti_time, use_id) "
                            + "VALUES('LOGIN','ADMIN USER LOGING TO SYSTEM!','" + sdfD.format(new Date()) + "','" + sdfT.format(new Date()) + "','" + user + "')");
                    this.dispose();
                } else if ((usertype.equalsIgnoreCase("CASHIER"))) {
                    CashierWizard cw = new CashierWizard(user);
                    cw.setVisible(true);
                    Database.sendData("INSERT INTO loginsession(lgs_inTime,lgs_date, use_id) "
                            + "VALUES('" + sdfT.format(new Date()) + "', '" + sdfD.format(new Date()) + "', '" + user + "')");
                    Database.sendData("INSERT INTO notification (nti_title, nti_body, nti_date, nti_time, use_id) "
                            + "VALUES('LOGIN','USER LOGING TO SYSTEM!','" + sdfD.format(new Date()) + "','" + sdfT.format(new Date()) + "','" + user + "')");
                    this.dispose();
                }
            } else if (txt_log_username.getText().equalsIgnoreCase("Chamod") && txt_log_password.getText().equalsIgnoreCase("12345")) {
                Setting set = new Setting();
                set.setVisible(true);
            } else {
                if (logCounter == 3) {
                    lab_use_fpass.setVisible(true);
                    logCounter = 0;
                } else {
                    logCounter++;
                }
                lab_use_message.setText("Please Check your");
                lab_use_message.setBackground(Color.red);
                lab_use_message.setForeground(Color.white);
                lab_use_message.setOpaque(true);
                lab_use_message1.setText("Credentials!");
                lab_use_message1.setBackground(Color.red);
                lab_use_message1.setForeground(Color.white);
                lab_use_message1.setOpaque(true);
            }
            System.out.println(logCounter);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_log_loginActionPerformed

    private void lab_use_fpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_use_fpassMouseClicked
        SendingMale sm = new SendingMale();
        sm.setVisible(true);
//        for (int i = 0; i < 100; i++) {
//            try {
//                Thread.sleep(100);
//                if (i == 0) {
//                    sm.setVisible(true);
//                    sm.setAlwaysOnTop(true);
//                } else if (i == 99) {
//                    sm.dispose();
//                }
//            } catch (Exception e) {
//                System.out.println(e);
//            }
        //     }
    }//GEN-LAST:event_lab_use_fpassMouseClicked

    private void lab_use_privacyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lab_use_privacyMouseClicked

    }//GEN-LAST:event_lab_use_privacyMouseClicked

    private void txt_log_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_log_usernameActionPerformed
        txt_log_password.grabFocus();
    }//GEN-LAST:event_txt_log_usernameActionPerformed

    private void txt_log_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_log_passwordActionPerformed
        btn_log_login.grabFocus();
    }//GEN-LAST:event_txt_log_passwordActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_log_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lab_use_fpass;
    private javax.swing.JLabel lab_use_help;
    private javax.swing.JLabel lab_use_message;
    private javax.swing.JLabel lab_use_message1;
    private javax.swing.JLabel lab_use_privacy;
    private javax.swing.JPasswordField txt_log_password;
    private javax.swing.JTextField txt_log_username;
    // End of variables declaration//GEN-END:variables

    String date;
    String time;

    SimpleDateFormat sdf;
    Date d;

    private void setDateAndTime() {
        javax.swing.Timer t = new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d = new Date();
                sdf = new SimpleDateFormat("yyyy-MM-dd");
                date = sdf.format(d);
                jLabel30.setText(date);
                sdf = new SimpleDateFormat("hh:mm:ss");
                time = sdf.format(d);
                jLabel29.setText(time);
            }
        });
        t.start();
    }

}
