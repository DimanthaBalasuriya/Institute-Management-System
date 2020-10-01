package com.prog.cnv.sys.control.system.student.ClassManagement;

import com.prog.cnv.sys.control.system.control.Database;
import com.prog.cnv.sys.control.system.control.Message;
import com.prog.cnv.sys.control.system.student.ReportViewer;
import com.prog.cnv.sys.control.system.student.Teacher.UpdateNotifyWizard;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class UpdateClassSchedule extends javax.swing.JFrame {

    int user;

    public UpdateClassSchedule() {
        initComponents();
        fetchDateToTable();
        fetchDataToLable();
    }

    public UpdateClassSchedule(String user) {
        this();
        this.user = Integer.parseInt(user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(40, 40, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 1370, 20));

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
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 30, 30));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Class Preview");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 30, 10, 680));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 1130, 10));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject", "Teaher", "Class", "Day", "Grade", "Start", "End", "State"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1220, 630));

        jLabel38.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("CLASS LIST");
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jButton1.setText("ACTIVE");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, 110, 37));

        jButton2.setText("UPDATE");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 680, 110, 37));

        jButton3.setText("DEACTIVE");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 680, 110, 37));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_training_70px_1.png"))); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 560, 110, 80));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_class_70px.png"))); // NOI18N
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 390, 110, 80));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_classroom_70px.png"))); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 210, 110, 80));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Google_Classroom_70px.png"))); // NOI18N
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 30, 110, 80));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Deactive Class");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 480, 110, 20));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Active Class");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 300, 110, 20));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Today Class");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 650, 110, 20));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Total Class");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 120, 110, 20));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 680, 110, 20));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 330, 110, 20));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 150, 110, 20));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 510, 110, 20));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 30, 110, 150));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 210, 110, 150));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 390, 110, 150));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 560, 110, 150));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_print_25px.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 680, 50, 37));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1370, 720));

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
        setLocationRelativeTo(null);
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        if (jTable1.isRowSelected(jTable1.getSelectedRow())) {
            int selectedRow = jTable1.getSelectedRow();
            String subject = dtm.getValueAt(selectedRow, 0).toString();
            String teacher[] = dtm.getValueAt(selectedRow, 1).toString().split(" ");
            String type = dtm.getValueAt(selectedRow, 2).toString();
            String day = dtm.getValueAt(selectedRow, 3).toString();
            String grade = dtm.getValueAt(selectedRow, 4).toString();
            String start = dtm.getValueAt(selectedRow, 5).toString();
            String end = dtm.getValueAt(selectedRow, 6).toString();
            try {
                ResultSet rs = Database.getData("SELECT `class`.`cls_id` FROM `cambridge_project`.`classscheduleday` INNER JOIN `cambridge_project`.`class` ON (`classscheduleday`.`cls_id` = `class`.`cls_id`)\n"
                        + "INNER JOIN `cambridge_project`.`day` ON (`classscheduleday`.`day_id` = `day`.`day_id`) INNER JOIN `cambridge_project`.`employee` \n"
                        + "ON (`class`.`emp_id` = `employee`.`emp_id`) INNER JOIN `cambridge_project`.`subject` ON (`class`.`sub_id` = `subject`.`sub_id`)\n"
                        + "INNER JOIN `cambridge_project`.`classtype` ON (`class`.`clt_id` = `classtype`.`clt_id`) WHERE subject.`sub_name` = '" + subject + "' \n"
                        + "AND `employee`.`emp_fname` = '" + teacher[0] + "' AND `employee`.`emp_mname` = '" + teacher[1] + "' AND `employee`.`emp_lname` = '" + teacher[2] + "' AND `classtype`.`clt_type` = '" + type + "' \n"
                        + "AND day.`day_name` = '" + day + "' AND `class`.`cls_grade` = '" + grade + "' AND `classscheduleday`.`csd_start_time` = '" + start + "' AND `classscheduleday`.`csd_end_time`= '" + end + "'");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Are you sure!");
                    Database.sendData("UPDATE Class SET cls_state = '1' WHERE cls_id = '" + rs.getInt("cls_id") + "'");
                    fetchDateToTable();
                } else {
                    System.out.println("cannot find specified class object!");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, Message.NOSELECTEDROW);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        if (jTable1.isRowSelected(jTable1.getSelectedRow())) {
            int selectedRow = jTable1.getSelectedRow();
            String subject = dtm.getValueAt(selectedRow, 0).toString();
            String teacher[] = dtm.getValueAt(selectedRow, 1).toString().split(" ");
            String type = dtm.getValueAt(selectedRow, 2).toString();
            String day = dtm.getValueAt(selectedRow, 3).toString();
            String grade = dtm.getValueAt(selectedRow, 4).toString();
            String start = dtm.getValueAt(selectedRow, 5).toString();
            String end = dtm.getValueAt(selectedRow, 6).toString();
            try {
                ResultSet rs = Database.getData("SELECT `class`.`cls_id` FROM `cambridge_project`.`classscheduleday` INNER JOIN `cambridge_project`.`class` ON (`classscheduleday`.`cls_id` = `class`.`cls_id`)\n"
                        + "INNER JOIN `cambridge_project`.`day` ON (`classscheduleday`.`day_id` = `day`.`day_id`) INNER JOIN `cambridge_project`.`employee` \n"
                        + "ON (`class`.`emp_id` = `employee`.`emp_id`) INNER JOIN `cambridge_project`.`subject` ON (`class`.`sub_id` = `subject`.`sub_id`)\n"
                        + "INNER JOIN `cambridge_project`.`classtype` ON (`class`.`clt_id` = `classtype`.`clt_id`) WHERE subject.`sub_name` = '" + subject + "' \n"
                        + "AND `employee`.`emp_fname` = '" + teacher[0] + "' AND `employee`.`emp_mname` = '" + teacher[1] + "' AND `employee`.`emp_lname` = '" + teacher[2] + "' AND `classtype`.`clt_type` = '" + type + "' \n"
                        + "AND day.`day_name` = '" + day + "' AND `class`.`cls_grade` = '" + grade + "' AND `classscheduleday`.`csd_start_time` = '" + start + "' AND `classscheduleday`.`csd_end_time`= '" + end + "'");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Are you sure!");
                    Database.sendData("UPDATE Class SET cls_state = '0' WHERE cls_id = '" + rs.getInt("cls_id") + "'");
                    fetchDateToTable();
                } else {
                    System.out.println("cannot find specified class object!");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, Message.NOSELECTEDROW);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        if (jTable1.isRowSelected(jTable1.getSelectedRow())) {
            int selectedRow = jTable1.getSelectedRow();
            String subject = dtm.getValueAt(selectedRow, 0).toString();
            String teacher[] = dtm.getValueAt(selectedRow, 1).toString().split(" ");
            String type = dtm.getValueAt(selectedRow, 2).toString();
            String day = dtm.getValueAt(selectedRow, 3).toString();
            String grade = dtm.getValueAt(selectedRow, 4).toString();
            String start = dtm.getValueAt(selectedRow, 5).toString();
            String end = dtm.getValueAt(selectedRow, 6).toString();
            try {
                String tecName[] = dtm.getValueAt(jTable1.getSelectedRow(), 1).toString().split(" ");
                ResultSet rs = Database.getData("SELECT `class`.`cls_id` FROM `cambridge_project`.`classscheduleday` INNER JOIN `cambridge_project`.`class` ON (`classscheduleday`.`cls_id` = `class`.`cls_id`)\n"
                        + "INNER JOIN `cambridge_project`.`day` ON (`classscheduleday`.`day_id` = `day`.`day_id`) INNER JOIN `cambridge_project`.`employee` \n"
                        + "ON (`class`.`emp_id` = `employee`.`emp_id`) INNER JOIN `cambridge_project`.`subject` ON (`class`.`sub_id` = `subject`.`sub_id`)\n"
                        + "INNER JOIN `cambridge_project`.`classtype` ON (`class`.`clt_id` = `classtype`.`clt_id`) WHERE subject.`sub_name` = '" + subject + "' \n"
                        + "AND `employee`.`emp_fname` = '" + teacher[0] + "' AND `employee`.`emp_mname` = '" + teacher[1] + "' AND `employee`.`emp_lname` = '" + teacher[2] + "' AND `classtype`.`clt_type` = '" + type + "' \n"
                        + "AND day.`day_name` = '" + day + "' AND `class`.`cls_grade` = '" + grade + "' AND `classscheduleday`.`csd_start_time` = '" + start + "' AND `classscheduleday`.`csd_end_time`= '" + end + "'");
                if (rs.next()) {
                    UpdateNotifyWizard unw = new UpdateNotifyWizard(rs.getString("cls_id").toString(), start, end);
                    unw.setVisible(true);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, Message.NOSELECTEDROW);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            String path = "D://MYPROJECT//CAMBRIDGE_NEW_VERSION_1_0//src//com//prog//cnv//sys//report//ScheduledClassList.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, Database.getConnection());
            ReportViewer rv = new ReportViewer(jp);
            rv.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "PRINTING ERROR!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateClassSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateClassSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateClassSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateClassSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateClassSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void fetchDateToTable() {
        try {
            ResultSet rs = Database.getData("SELECT `subject`.`sub_name`, `classtype`.`clt_type`, `day`.`day_name`, `classscheduleday`.`csd_start_time`, `classscheduleday`.`csd_end_time`\n"
                    + ", `class`.`cls_grade`, `classscheduleday`.`csd_start_time`, `classscheduleday`.`csd_end_time`, `class`.`cls_state`, `employee`.`emp_fname`\n"
                    + ", `employee`.`emp_mname`, `employee`.`emp_lname` FROM `cambridge_project`.`classscheduleday` INNER JOIN `cambridge_project`.`class` \n"
                    + "ON (`classscheduleday`.`cls_id` = `class`.`cls_id`) INNER JOIN `cambridge_project`.`day` ON (`classscheduleday`.`day_id` = `day`.`day_id`)\n"
                    + "INNER JOIN `cambridge_project`.`subject` ON (`class`.`sub_id` = `subject`.`sub_id`) INNER JOIN `cambridge_project`.`classtype` \n"
                    + "ON (`class`.`clt_id` = `classtype`.`clt_id`) INNER JOIN `cambridge_project`.`employee` ON (`class`.`emp_id` = `employee`.`emp_id`)");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("sub_name"));
                v.add(rs.getString("emp_fname") + " " + rs.getString("emp_mname") + " " + rs.getString("emp_lname"));
                v.add(rs.getString("clt_type"));
                v.add(rs.getString("day_name"));
                v.add(rs.getString("cls_grade"));
                v.add(rs.getString("csd_start_time"));
                v.add(rs.getString("csd_end_time"));
                v.add(rs.getString("cls_state"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fetchDataToLable() {
        try {
            SimpleDateFormat sdfD = new SimpleDateFormat("DDDD");
            ResultSet rs1 = Database.getData("SELECT COUNT(cls_id) AS classCount FROM Class");
            if (rs1.next()) {
                jLabel21.setText(rs1.getInt("classCount") + "");
            }
            ResultSet rs2 = Database.getData("SELECT COUNT(cls_id) AS active FROM Class WHERE cls_state = '1'");
            if (rs2.next()) {
                jLabel20.setText(rs2.getInt("active") + "");
            }
            ResultSet rs3 = Database.getData("SELECT COUNT(cls_id) AS deactive FROM Class WHERE cls_state = '0'");
            if (rs3.next()) {
                jLabel22.setText(rs3.getInt("deactive") + "");
            }
            ResultSet rs4 = Database.getData("SELECT COUNT(`class`.`cls_id`) AS todayClassCount FROM `cambridge_project`.`classscheduleday` INNER JOIN `cambridge_project`.`class` \n"
                    + "ON (`classscheduleday`.`cls_id` = `class`.`cls_id`) INNER JOIN `cambridge_project`.`day` ON (`classscheduleday`.`day_id` = `day`.`day_id`) \n"
                    + "WHERE day.`day_name` = Day(current_date)");
            if (rs4.next()) {
                jLabel19.setText(rs4.getInt("todayClassCount") + "");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
