package com.prog.cnv.sys.control.system.student.StudentManagement;

import com.prog.cnv.sys.control.system.control.Database;
import com.prog.cnv.sys.control.system.student.PaymentAndBill.YouNotPay;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javafx.scene.layout.Border;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StudentAttendanceCollect extends javax.swing.JFrame {

    JLabel lable;
    JLabel subject;
    JLabel day;
    JLabel type;
    JLabel time;

    public StudentAttendanceCollect() {
        initComponents();
        setDateAndTime();
        fetchDataToLable();
        fetchPendingClassToday();
        txt_atm_class.setEnabled(false);
        //txt_atm_intime.setEnabled(false);
        //txt_atm_message.setEnabled(false);
        txt_atm_name.setEnabled(false);
        txt_atm_school.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lab_pdn_class = new javax.swing.JLabel();
        lab_cls_count = new javax.swing.JLabel();
        lab_att_coun = new javax.swing.JLabel();
        lab_fin_class = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txt_atm_rfid = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txt_atm_name = new javax.swing.JTextField();
        txt_atm_school = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txt_atm_class = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txt_atm_intime = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_atm_preview = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        lab_std_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(40, 40, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 15, 110, 15));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 110, 15));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, 1370, 30));

        jPanel3.setBackground(new java.awt.Color(40, 40, 40));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Cancel_20px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1335, 0, 30, 30));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Class Schedule preview");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 10, 690));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 10, 690));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_task_completed_70px.png"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 80, 90));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_data_pending_70px_1.png"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 80, 90));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Google_Classroom_70px.png"))); // NOI18N
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 80, 90));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_students_70px.png"))); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 80, 90));

        jLabel11.setText("Pending Class");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 90, 20));

        jLabel12.setText("Class count");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 90, 20));

        jLabel13.setText("Finished Class");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, 90, 20));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel14.setText("Attendance Count");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 90, 20));

        lab_pdn_class.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_pdn_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, 30, 20));

        lab_cls_count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_cls_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 30, 20));

        lab_att_coun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_att_coun, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 30, 20));

        lab_fin_class.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_fin_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 40, 30, 20));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 190, 90));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 190, 90));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 190, 90));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 190, 90));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_atm_rfid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_atm_rfidActionPerformed(evt);
            }
        });
        txt_atm_rfid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_atm_rfidKeyTyped(evt);
            }
        });
        jPanel5.add(txt_atm_rfid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 200, 30));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 200, 10));

        jLabel32.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("ID NO");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, -1));

        jLabel33.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("NAME");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 50, -1));

        txt_atm_name.setEditable(false);
        jPanel5.add(txt_atm_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 200, 30));

        txt_atm_school.setEditable(false);
        jPanel5.add(txt_atm_school, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 200, 30));

        jLabel34.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("SCHOOL");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 60, -1));

        jLabel35.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("CLASS");
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 50, -1));

        txt_atm_class.setEditable(false);
        jPanel5.add(txt_atm_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 200, 30));

        jLabel37.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("INTIME");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        txt_atm_intime.setEditable(false);
        jPanel5.add(txt_atm_intime, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 200, 30));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 220, 700));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 940, 10));

        tab_atm_preview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student", "Class", "Type", "In", "State"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tab_atm_preview);
        if (tab_atm_preview.getColumnModel().getColumnCount() > 0) {
            tab_atm_preview.getColumnModel().getColumn(0).setResizable(false);
            tab_atm_preview.getColumnModel().getColumn(1).setResizable(false);
            tab_atm_preview.getColumnModel().getColumn(2).setResizable(false);
            tab_atm_preview.getColumnModel().getColumn(3).setResizable(false);
            tab_atm_preview.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 940, 530));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pending Class", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 700));

        lab_std_image.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lab_std_image.setForeground(new java.awt.Color(51, 51, 51));
        lab_std_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_std_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 660, 940, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1370, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Cancel_30px.png")));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Cancel_20px.png")));
    }//GEN-LAST:event_jLabel1MouseExited

    private void txt_atm_rfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_atm_rfidActionPerformed
        try {
            ResultSet rs1 = Database.getData("SELECT std_id, std_fname, std_mname, std_lname, std_school, std_image FROM Student WHERE std_rfid = '" + txt_atm_rfid.getText() + "'");
            if (rs1.next()) {
                txt_atm_name.setText(rs1.getString("std_fname") + " " + rs1.getString("std_mname") + " " + rs1.getString("std_lname"));
                txt_atm_school.setText(rs1.getString("std_school"));
                //(rs1.getString("std_image"));
                int studentID = Integer.parseInt(rs1.getString("std_id"));
                executeAttendanceMarkCriteria(studentID);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txt_atm_rfidActionPerformed

    private void txt_atm_rfidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_atm_rfidKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_atm_rfidKeyTyped

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
            java.util.logging.Logger.getLogger(StudentAttendanceCollect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentAttendanceCollect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentAttendanceCollect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentAttendanceCollect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentAttendanceCollect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lab_att_coun;
    private javax.swing.JLabel lab_cls_count;
    private javax.swing.JLabel lab_fin_class;
    private javax.swing.JLabel lab_pdn_class;
    private javax.swing.JLabel lab_std_image;
    private javax.swing.JTable tab_atm_preview;
    private javax.swing.JTextField txt_atm_class;
    private javax.swing.JTextField txt_atm_intime;
    private javax.swing.JTextField txt_atm_name;
    private javax.swing.JTextField txt_atm_rfid;
    private javax.swing.JTextField txt_atm_school;
    // End of variables declaration//GEN-END:variables

    private void fetchDataToLable() {
        try {
            SimpleDateFormat sdfD = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sdfDD = new SimpleDateFormat("EEEE");
            SimpleDateFormat sdfT = new SimpleDateFormat("hh:mm:ss");
            ResultSet rs1 = Database.getData("SELECT COUNT(sta_id) AS todayAttendanceCount FROM studentAttendance WHERE sta_date = '" + sdfD.format(new Date()) + "' AND sta_day = '" + sdfDD.format(new Date()) + "'");
            if (rs1.next()) {
                lab_att_coun.setText(rs1.getInt("todayAttendanceCount") + "");
            }
            ResultSet rs2 = Database.getData("SELECT COUNT(`class`.`cls_id`) AS classCount FROM `cambridge_project`.`classscheduleday` INNER JOIN `cambridge_project`.`day` ON (`classscheduleday`.`day_id` = `day`.`day_id`)\n"
                    + "INNER JOIN `cambridge_project`.`class` ON (`classscheduleday`.`cls_id` = `class`.`cls_id`) WHERE day.`day_name` = '" + sdfDD.format(new Date()) + "'");
            if (rs2.next()) {
                lab_cls_count.setText(rs2.getInt("classCount") + "");
            }
            ResultSet rs3 = Database.getData("SELECT COUNT(`class`.`cls_id`) AS pendingClassCount FROM `cambridge_project`.`classscheduleday` INNER JOIN `cambridge_project`.`day` ON (`classscheduleday`.`day_id` = `day`.`day_id`)\n"
                    + "INNER JOIN `cambridge_project`.`class` ON (`classscheduleday`.`cls_id` = `class`.`cls_id`) WHERE `classscheduleday`.`csd_start_time` > '" + sdfT.format(new Date()) + "' AND day.`day_name` = '" + sdfDD.format(new Date()) + "'");
            if (rs3.next()) {
                lab_pdn_class.setText(rs3.getInt("pendingClassCount") + "");
            }
            ResultSet rs4 = Database.getData("SELECT COUNT(`class`.`cls_id`) AS finishedClassCount FROM `cambridge_project`.`classscheduleday` INNER JOIN `cambridge_project`.`day` ON (`classscheduleday`.`day_id` = `day`.`day_id`)\n"
                    + "INNER JOIN `cambridge_project`.`class` ON (`classscheduleday`.`cls_id` = `class`.`cls_id`) WHERE `classscheduleday`.`csd_start_time` < '" + sdfT.format(new Date()) + "' AND day.`day_name` = '" + sdfDD.format(new Date()) + "'");
            if (rs4.next()) {
                lab_fin_class.setText(rs4.getInt("finishedClassCount") + "");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fetchAvtToLable(String flag1) {
        try {
            File file = new File(flag1);
            Image img = ImageIO.read(file);
            img = img.getScaledInstance(lab_std_image.getWidth(), lab_std_image.getHeight(), img.SCALE_SMOOTH);
            lab_std_image.setIcon(new ImageIcon(img));
        } catch (FileNotFoundException ffe) {
            System.out.println(ffe);
        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
//This system does not support to mark out time of the student

    private void executeAttendanceMarkCriteria(int flag1) {
        try {
            String increaseAndDecreaseTimeAmount = "00:30:00";
            SimpleDateFormat sdfDD = new SimpleDateFormat("EEEE");
            SimpleDateFormat sdfT = new SimpleDateFormat("hh:mm:ss");
            SimpleDateFormat sdfM = new SimpleDateFormat("MMMM");
            ResultSet rs1 = Database.getData("SELECT `class`.`cls_id`, `classscheduleday`.`csd_start_time`, `classscheduleday`.`csd_end_time`, `class`.`cls_fee`, `subject`.`sub_name`, `classtype`.`clt_type`\n"
                    + "FROM `cambridge_project`.`studentclass` INNER JOIN `cambridge_project`.`class` ON (`studentclass`.`cls_id` = `class`.`cls_id`) INNER JOIN `cambridge_project`.`student` \n"
                    + "ON (`studentclass`.`std_id` = `student`.`std_id`) INNER JOIN `cambridge_project`.`classtype` ON (`class`.`clt_id` = `classtype`.`clt_id`)\n"
                    + "INNER JOIN `cambridge_project`.`subject` ON (`class`.`sub_id` = `subject`.`sub_id`) INNER JOIN `cambridge_project`.`classscheduleday` \n"
                    + "ON (`classscheduleday`.`cls_id` = `class`.`cls_id`) INNER JOIN `cambridge_project`.`day` ON (`classscheduleday`.`day_id` = `day`.`day_id`) WHERE `student`.`std_id` = '" + flag1 + "' \n"
                    + "AND `day`.`day_name` = '" + sdfDD.format(new Date()) + "'");
            while (rs1.next()) {
                //System.out.println("hello");
                Date startTime = sdfT.parse(rs1.getString("csd_start_time"));
                //Date endTime = sdfT.parse(rs1.getString("cls_eTime"));
                Date freeTime = sdfT.parse(increaseAndDecreaseTimeAmount);
                Date currentTime = sdfT.parse(sdfT.format(new Date()));
                String subject = rs1.getString("sub_name");
                String classType = rs1.getString("clt_type");
                double classFee = Double.parseDouble(rs1.getString("cls_fee"));
                int classID = Integer.parseInt(rs1.getString("cls_id"));
                SimpleDateFormat sdfTI = new SimpleDateFormat("hh:mm");
                System.out.println("Class Start Time :" + rs1.getString("csd_start_time"));
                int time1 = Integer.parseInt(removeDot(sdfTI.format(new Date()).toString()));
                int time2 = Integer.parseInt(removeDot(sdfTI.format(startTime)));
                System.out.println(time1 + " --- " + time2);
                if ((((time2 - 30) <= time1) && ((time2 + 30) >= time1)) || (time1 == time2)) {
                    ResultSet rs2 = Database.getData("SELECT `classpayment`.`clp_amount` FROM `cambridge_project`.`classpayment` INNER JOIN `cambridge_project`.`class` \n"
                            + "ON (`classpayment`.`cls_id` = `class`.`cls_id`) INNER JOIN `cambridge_project`.`bill` ON (`classpayment`.`bil_id` = `bill`.`bil_id`)\n"
                            + "INNER JOIN `cambridge_project`.`billpayment` ON (`billpayment`.`bil_id` = `bill`.`bil_id`) INNER JOIN `cambridge_project`.`student` \n"
                            + "ON (`billpayment`.`std_id` = `student`.`std_id`) WHERE `class`.`cls_id` = '" + classID + "' AND `student`.`std_id` = '" + flag1 + "' \n"
                            + "AND MONTHNAME(`classpayment`.`clp_date`) = MONTHNAME(CURRENT_DATE) AND YEAR(`classpayment`.`clp_date`) = YEAR(CURRENT_DATE)");
                    if (rs2.next()) {
                        double studentPayedAmount = Double.parseDouble(rs2.getString("clp_amount"));
                        if (studentPayedAmount < classFee) {
                            //Attendance mark karanna
                            attendanceMark(classID, flag1);
                        } else if (studentPayedAmount == classFee) {
                            //Attendance mark karanna
                            attendanceMark(classID, flag1);
                        }
                    } else {
                        //Pay karala nathnm week no eka count karanna eka 2k nm epa arayata kiyanna
                        //1 nm aulak na attendance mark karanna
                        Calendar cal = Calendar.getInstance();
                        int week = cal.get(Calendar.WEEK_OF_YEAR);
                        if (week == 2) {
                            YouNotPay ynp = new YouNotPay();
                            //txt_atm_message.setText("");
                            for (int i = 0; i < 100; i++) {
                                try {
                                    Thread.sleep(100);
                                    if (i == 0) {
                                        ynp.setVisible(true);
                                    } else if (i == 99) {
                                        ynp.dispose();
                                    }
                                } catch (Exception e) {
                                    System.out.println(e);
                                }
                            }
                        } else if (week == 1) {
                            attendanceMark(classID, flag1);
                        }
                    }
                } else {
                    //Welawata awith nathnm
                    lab_std_image.setText("Go to the counter!");
                    System.out.println("Please Go to the Counter!");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void attendanceMark(int flag1, int flag2) {
        SimpleDateFormat sdfD = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdfT = new SimpleDateFormat("hh:mm:ss");
        SimpleDateFormat sdfDY = new SimpleDateFormat("dddd");
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.WEEK_OF_YEAR);
        try {
            Database.sendData("INSERT INTO studentAttendance(std_id, cls_id, sta_date, sta_intime, sta_outTime, sta_week_no, sta_day) "
                    + "VALUES('" + flag2 + "', '" + flag1 + "', '" + sdfD.format(new Date()) + "', '" + sdfT.format(new Date()) + "', '" + sdfT.format(new Date()) + "', '" + week + "', '" + sdfDY.format(new Date()) + "')");
            txt_atm_intime.setText(sdfT.format(new Date()));
            fetchDataToAttendancePreviewTable();
            fetchDataToLable();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fetchDataToAttendancePreviewTable() {
        try {
            SimpleDateFormat sdfD = new SimpleDateFormat("yyyy-MM-dd");
            ResultSet rs = Database.getData("SELECT `student`.`std_fname`, `student`.`std_mname`, `student`.`std_lname`, `studentattendance`.`sta_intime`, `studentattendance`.`sta_cm_state`\n"
                    + ", `subject`.`sub_name`, `classtype`.`clt_type` FROM `cambridge_project`.`studentattendance` INNER JOIN `cambridge_project`.`student` \n"
                    + "ON (`studentattendance`.`std_id` = `student`.`std_id`) INNER JOIN `cambridge_project`.`class` ON (`studentattendance`.`cls_id` = `class`.`cls_id`)\n"
                    + "INNER JOIN `cambridge_project`.`classtype` ON (`class`.`clt_id` = `classtype`.`clt_id`) INNER JOIN `cambridge_project`.`subject` \n"
                    + "ON (`class`.`sub_id` = `subject`.`sub_id`) WHERE `studentattendance`.`sta_date` = CURRENT_DATE");
            DefaultTableModel dtm = (DefaultTableModel) tab_atm_preview.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("std_fname") + " " + rs.getString("std_mname") + " " + rs.getString("std_lname"));
                v.add(rs.getString("sub_name"));
                v.add(rs.getString("clt_type"));
                v.add(rs.getString("sta_intime"));
                v.add(rs.getString("sta_cm_state"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fetchPendingClassToday() {
        SimpleDateFormat sdfD = new SimpleDateFormat("EEEE");
        int marginTop = 15;
        int marginLeft = 10;
        int lableHeight = 50;
        int lableWidth = 130;
        try {
            ResultSet rs = Database.getData("SELECT `subject`.`sub_name`, `classtype`.`clt_type`, `classscheduleday`.`csd_start_time`, `day`.`day_name`, `class`.`cls_grade` FROM `cambridge_project`.`class`\n"
                    + "INNER JOIN `cambridge_project`.`classtype` ON (`class`.`clt_id` = `classtype`.`clt_id`) INNER JOIN `cambridge_project`.`subject` ON (`class`.`sub_id` = `subject`.`sub_id`)\n"
                    + "INNER JOIN `cambridge_project`.`classscheduleday` ON (`classscheduleday`.`cls_id` = `class`.`cls_id`) INNER JOIN `cambridge_project`.`day` ON (`classscheduleday`.`day_id` = `day`.`day_id`)\n"
                    + "WHERE `day`.`day_name` = '" + sdfD.format(new Date()) + "'");
            while (rs.next()) {
                lable = new JLabel();
                subject = new JLabel();
                day = new JLabel();
                type = new JLabel();
                time = new JLabel();
                subject.setBounds(5, 5, 50, 20);
                subject.setText(rs.getString("sub_name"));
                subject.setHorizontalAlignment(jLabel1.CENTER);
                subject.setVisible(true);
                lable.add(subject);
                day.setBounds(5, 30, 50, 15);
                day.setText(rs.getString("day_name"));
                day.setHorizontalAlignment(jLabel1.CENTER);
                day.setVisible(true);
                lable.add(day);
                type.setBounds(70, 30, 50, 15);
                type.setText(rs.getString("cls_grade"));
                type.setHorizontalAlignment(jLabel1.CENTER);
                type.setVisible(true);
                lable.add(type);
                time.setBounds(70, 5, 50, 20);
                time.setText(rs.getString("csd_start_time"));
                type.setHorizontalAlignment(jLabel1.CENTER);
                type.setVisible(true);
                lable.add(time);
                lable.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 1));
                lable.setBounds(marginLeft, marginTop, lableWidth, lableHeight);
                lable.setHorizontalAlignment(jLabel1.CENTER);
                lable.setVisible(true);
                lable.setBounds(10, 20, 130, 60);
                jPanel6.add(lable);
                marginTop += lableHeight + 5;
            }
        } catch (Exception e) {

        }
    }

    private String removeDot(String para) {
        String getPara[] = para.split(":");
        return getPara[0] + getPara[1];
    }

    String date;
    String time1;

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
                time1 = sdf.format(d);
                jLabel29.setText(time1);
            }
        });
        t.start();
    }
}
