package com.prog.cnv.sys.control.system.student.ClassManagement;

import com.prog.cnv.sys.control.system.control.Database;
import com.prog.cnv.sys.control.system.control.Message;
import com.prog.cnv.sys.control.system.student.Login;
import com.prog.cnv.sys.control.system.student.ReportViewer;
import com.prog.cnv.sys.control.system.student.Teacher.ScheduleClass;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;

public class ClassSchedule extends javax.swing.JFrame {

    int user;

    public ClassSchedule() {
        initComponents();
        setDateAndTime();
        tableValue();
        comboBoxValue();
    }

    public ClassSchedule(String user) {
        this();
        this.user = Integer.parseInt(user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_csp_preview = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        cb_csp_teacher = new javax.swing.JComboBox<>();
        cb_csp_grade = new javax.swing.JComboBox<>();
        cb_csp_subject = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(40, 40, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Shutdown_25px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 15, 110, 15));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1365, 30));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab_csp_preview.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        tab_csp_preview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Time", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        ));
        tab_csp_preview.setRowHeight(20);
        tab_csp_preview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_csp_previewMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tab_csp_preview);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1350, 620));

        jLabel30.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Subject");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, -1, 40));

        jLabel31.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Class schedule preview");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel32.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Teacher");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, -1, 40));

        jLabel33.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Grade");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 50, 40));

        cb_csp_teacher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cb_csp_teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_csp_teacherActionPerformed(evt);
            }
        });
        jPanel5.add(cb_csp_teacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 5, 190, 30));

        cb_csp_grade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" }));
        cb_csp_grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_csp_gradeActionPerformed(evt);
            }
        });
        jPanel5.add(cb_csp_grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 5, 80, 30));

        cb_csp_subject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cb_csp_subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_csp_subjectActionPerformed(evt);
            }
        });
        jPanel5.add(cb_csp_subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 5, 190, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_print_25px.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 665, 40, 40));

        jButton3.setText("Schedule class");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 665, 140, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1365, 710));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1365, 770));

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

    private void cb_csp_subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_csp_subjectActionPerformed
        tableFilterBySubject(cb_csp_subject.getSelectedItem().toString());
    }//GEN-LAST:event_cb_csp_subjectActionPerformed

    private void cb_csp_teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_csp_teacherActionPerformed
        tableFilterByTeacher(cb_csp_teacher.getSelectedItem().toString());
    }//GEN-LAST:event_cb_csp_teacherActionPerformed

    private void cb_csp_gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_csp_gradeActionPerformed
        if (cb_csp_teacher.getSelectedItem().equals("Select") && cb_csp_subject.getSelectedItem().equals("Select")) {
            String grade = cb_csp_grade.getSelectedItem().toString();
            tableFilterByOnlyGrade(grade);
        } else {
            String teacher = cb_csp_teacher.getSelectedItem().toString();
            String subject = cb_csp_subject.getSelectedItem().toString();
            String grade = cb_csp_grade.getSelectedItem().toString();
            tableFilterByTeacherAndSubject(teacher, subject, grade);
        }
    }//GEN-LAST:event_cb_csp_gradeActionPerformed

    private void tab_csp_previewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_csp_previewMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) tab_csp_preview.getModel();
        String columnName = dtm.getColumnName(tab_csp_preview.getSelectedColumn());
        String time = dtm.getValueAt(tab_csp_preview.getSelectedRow(), 0).toString();
        ExpandClassTime ect = new ExpandClassTime(columnName, time);
        ect.setVisible(true);
    }//GEN-LAST:event_tab_csp_previewMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int option = JOptionPane.showConfirmDialog(null, Message.SUREYOUWANTTOLOGOUT);
        if (option == 0) {
            Login log = new Login();
            log.setVisible(true);
            try {
                SimpleDateFormat sdfD = new SimpleDateFormat();
                ResultSet rs1 = Database.getData("SELECT lgs_id FROM loginsession WHERE use_id = '" + user + "' AND lgs_date = '" + sdfD.format(new Date()) + "' AND lgs_outTime IS NULL");
                if (rs1.next()) {
                    int logID = Integer.parseInt(rs1.getString("lgs_id"));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            dispose();
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ScheduleClass cs = new ScheduleClass(user + "");
        cs.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            SimpleDateFormat sdfM = new SimpleDateFormat("yyyy");
            DefaultTableModel dtm = (DefaultTableModel) tab_csp_preview.getModel();
            JRTableModelDataSource dataresource = new JRTableModelDataSource(dtm);
            String report = "D://MYPROJECT//CAMBRIDGE_NEW_VERSION_1_0//src//com//prog//cnv//sys//report//TimeTable.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(report);
            HashMap<String, Object> m = new HashMap();
            m.put("year", sdfM.format(new Date()).toString());
            JasperPrint jp = JasperFillManager.fillReport(jr, m, dataresource);
            ReportViewer rv = new ReportViewer(jp);
            rv.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "PRINTING ERROR!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ClassSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_csp_grade;
    private javax.swing.JComboBox<String> cb_csp_subject;
    private javax.swing.JComboBox<String> cb_csp_teacher;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tab_csp_preview;
    // End of variables declaration//GEN-END:variables

    private void tableValue() {
        try {
            ResultSet rs1 = Database.getData("SELECT `day`.`day_name`, `classscheduleday`.`csd_start_time`, `class`.`cls_grade`, `subject`.`sub_name`, `classtype`.`clt_type` FROM\n"
                    + "`cambridge_project`.`classscheduleday` INNER JOIN `cambridge_project`.`day` ON (`classscheduleday`.`day_id` = `day`.`day_id`)\n"
                    + "INNER JOIN `cambridge_project`.`class` ON (`classscheduleday`.`cls_id` = `class`.`cls_id`) INNER JOIN `cambridge_project`.`classtype` \n"
                    + "ON (`class`.`clt_id` = `classtype`.`clt_id`) INNER JOIN `cambridge_project`.`subject` ON (`class`.`sub_id` = `subject`.`sub_id`)");
            while (rs1.next()) {
                String day = rs1.getString("day_name");
                String time = rs1.getString("csd_start_time");
                int row = 0;
                int col = 0;
                boolean already = false;
                DefaultTableModel dtm = (DefaultTableModel) tab_csp_preview.getModel();
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    if (dtm.getValueAt(i, 0).toString().equalsIgnoreCase(time)) {
                        already = true;
                        row = i;
                    }
                }
                if (already) {
                    for (int i = 0; i < dtm.getColumnCount(); i++) {
                        if (dtm.getColumnName(i).toString().equalsIgnoreCase(day)) {
                            col = i;
                        }
                    }
                    String value = rs1.getString("sub_name") + " " + rs1.getString("clt_type");
                    dtm.setValueAt(value, row, col);
                } else {
                    //Kelinma daanna
                    Vector v = new Vector();
                    v.add(rs1.getString("csd_start_time"));
                    dtm.addRow(v);
                    for (int i = 0; i < dtm.getRowCount(); i++) {
                        if (dtm.getValueAt(i, 0).toString().equalsIgnoreCase(time)) {
                            row = i;
                        }
                    }
                    //Day ekata adalawa class details thama danna thiyenne
                    for (int i = 0; i < dtm.getColumnCount(); i++) {
                        if (dtm.getColumnName(i).toString().equalsIgnoreCase(day)) {
                            col = i;
                        }
                    }
                    String value = rs1.getString("sub_name") + " " + rs1.getString("clt_type");
                    dtm.setValueAt(value, row, col);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void comboBoxValue() {
        try {
            ResultSet rs1 = Database.getData("SELECT emp_fname, emp_mname, emp_lname FROM Employee WHERE emp_position = 'TEACHER' AND emp_mem_state = 'active'");
            while (rs1.next()) {
                cb_csp_teacher.addItem(rs1.getString("emp_fname") + " " + rs1.getString("emp_mname") + " " + rs1.getString("emp_lname"));
            }
            ResultSet rs2 = Database.getData("SELECT DISTINCT sub_name FROM Subject WHERE sub_state = '1'");
            while (rs2.next()) {
                cb_csp_subject.addItem(rs2.getString("sub_name"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void tableFilterByTeacher(String filterOption) {
        try {
            String filter[] = filterOption.split(" ");
            ResultSet rs1 = Database.getData("SELECT `day`.`day_name`, `classscheduleday`.`csd_start_time`, `class`.`cls_grade`, `subject`.`sub_name`, `classtype`.`clt_type` FROM\n"
                    + "`cambridge_project`.`classscheduleday` INNER JOIN `cambridge_project`.`day` ON (`classscheduleday`.`day_id` = `day`.`day_id`)\n"
                    + "INNER JOIN `cambridge_project`.`class` ON (`classscheduleday`.`cls_id` = `class`.`cls_id`) INNER JOIN `cambridge_project`.`classtype` \n"
                    + "ON (`class`.`clt_id` = `classtype`.`clt_id`) INNER JOIN `cambridge_project`.`subject` ON (`class`.`sub_id` = `subject`.`sub_id`)\n"
                    + "INNER JOIN `cambridge_project`.`employee` ON (`class`.`emp_id` = `employee`.`emp_id`) WHERE `employee`.`emp_fname` = '" + filter[0] + "' AND `employee`.`emp_mname` = '" + filter[1] + "' AND `employee`.`emp_lname` = '" + filter[2] + "'");
            DefaultTableModel dtm = (DefaultTableModel) tab_csp_preview.getModel();
            dtm.setRowCount(0);
            while (rs1.next()) {
                String day = rs1.getString("day_name");
                String time = rs1.getString("csd_start_time");
                int row = 0;
                int col = 0;
                boolean already = false;
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    if (dtm.getValueAt(i, 0).toString().equalsIgnoreCase(time)) {
                        already = true;
                        row = i;
                    }
                }
                if (already) {
                    for (int i = 0; i < dtm.getColumnCount(); i++) {
                        if (dtm.getColumnName(i).toString().equalsIgnoreCase(day)) {
                            col = i;
                        }
                    }
                    String value = rs1.getString("sub_name") + " " + rs1.getString("clt_type");
                    dtm.setValueAt(value, row, col);
                } else {
                    //Kelinma daanna
                    Vector v = new Vector();
                    v.add(rs1.getString("csd_start_time"));
                    dtm.addRow(v);
                    for (int i = 0; i < dtm.getRowCount(); i++) {
                        if (dtm.getValueAt(i, 0).toString().equalsIgnoreCase(time)) {
                            row = i;
                        }
                    }
                    //Day ekata adalawa class details thama danna thiyenne
                    for (int i = 0; i < dtm.getColumnCount(); i++) {
                        if (dtm.getColumnName(i).toString().equalsIgnoreCase(day)) {
                            col = i;
                        }
                    }
                    String value = rs1.getString("sub_name") + " " + rs1.getString("clt_type");
                    dtm.setValueAt(value, row, col);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void tableFilterBySubject(String filterOption) {
        try {
            ResultSet rs1 = Database.getData("SELECT `day`.`day_name`, `classscheduleday`.`csd_start_time`, `class`.`cls_grade`, `subject`.`sub_name`, `classtype`.`clt_type` FROM\n"
                    + "`cambridge_project`.`classscheduleday` INNER JOIN `cambridge_project`.`day` ON (`classscheduleday`.`day_id` = `day`.`day_id`)\n"
                    + "INNER JOIN `cambridge_project`.`class` ON (`classscheduleday`.`cls_id` = `class`.`cls_id`) INNER JOIN `cambridge_project`.`classtype` \n"
                    + "ON (`class`.`clt_id` = `classtype`.`clt_id`) INNER JOIN `cambridge_project`.`subject` ON (`class`.`sub_id` = `subject`.`sub_id`)\n"
                    + "INNER JOIN `cambridge_project`.`employee` ON (`class`.`emp_id` = `employee`.`emp_id`) WHERE `subject`.`sub_name` = '" + filterOption + "'");
            DefaultTableModel dtm = (DefaultTableModel) tab_csp_preview.getModel();
            dtm.setRowCount(0);
            while (rs1.next()) {
                String day = rs1.getString("day_name");
                String time = rs1.getString("csd_start_time");
                int row = 0;
                int col = 0;
                boolean already = false;
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    if (dtm.getValueAt(i, 0).toString().equalsIgnoreCase(time)) {
                        already = true;
                        row = i;
                    }
                }
                if (already) {
                    for (int i = 0; i < dtm.getColumnCount(); i++) {
                        if (dtm.getColumnName(i).toString().equalsIgnoreCase(day)) {
                            col = i;
                        }
                    }
                    String value = rs1.getString("sub_name") + " " + rs1.getString("clt_type");
                    dtm.setValueAt(value, row, col);
                } else {
                    //Kelinma daanna
                    Vector v = new Vector();
                    v.add(rs1.getString("csd_start_time"));
                    dtm.addRow(v);
                    for (int i = 0; i < dtm.getRowCount(); i++) {
                        if (dtm.getValueAt(i, 0).toString().equalsIgnoreCase(time)) {
                            row = i;
                        }
                    }
                    //Day ekata adalawa class details thama danna thiyenne
                    for (int i = 0; i < dtm.getColumnCount(); i++) {
                        if (dtm.getColumnName(i).toString().equalsIgnoreCase(day)) {
                            col = i;
                        }
                    }
                    String value = rs1.getString("sub_name") + " " + rs1.getString("clt_type");
                    dtm.setValueAt(value, row, col);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void tableFilterByTeacherAndSubject(String flag1, String flag2, String flag3) {
        String teacher[] = flag1.split(" ");
        try {
            ResultSet rs1 = Database.getData("SELECT `class`.`cls_sTime` , `class`.`cls_day` , `class`.`cls_grade` , `subject`.`sub_name`, `classtype`.`clt_type`\n"
                    + "FROM `cambridge_project`.`class` INNER JOIN `cambridge_project`.`classtype` ON (`class`.`clt_id` = `classtype`.`clt_id`) \n"
                    + "INNER JOIN `cambridge_project`.`subject` ON (`class`.`sub_id` = `subject`.`sub_id`) \n"
                    + "WHERE `class`.`sub_id` = (SELECT sub_id FROM SUBJECT WHERE `class`.`emp_id` = (SELECT emp_id FROM Employee WHERE emp_fname = '" + teacher[0] + "' AND emp_mname = '" + teacher[1] + "' AND emp_lname = '" + teacher[2] + "') AND `class`.`sub_id` = (SELECT sub_id FROM SUBJECT WHERE `sub_name` = '" + flag2 + "') AND `class`.`cls_grade` = '" + flag3 + "')");
            while (rs1.next()) {
                String day = rs1.getString("cls_day");
                String time = rs1.getString("cls_sTime");
                int row = 0;
                int col = 0;
                boolean already = false;
                DefaultTableModel dtm = (DefaultTableModel) tab_csp_preview.getModel();
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    if (dtm.getValueAt(i, 0).toString().equalsIgnoreCase(time)) {
                        already = true;
                        row = i;
                    }
                }
                if (already) {
                    for (int i = 0; i < dtm.getColumnCount(); i++) {
                        if (dtm.getColumnName(i).toString().equalsIgnoreCase(day)) {
                            col = i;
                        }
                    }
                    String value = rs1.getString("cls_day");
                    dtm.setValueAt(value, row, col);
                } else {
                    //Kelinma daanna
                    Vector v = new Vector();
                    v.add(rs1.getString("cls_sTime"));
                    dtm.addRow(v);
                    for (int i = 0; i < dtm.getRowCount(); i++) {
                        if (dtm.getValueAt(i, 0).toString().equalsIgnoreCase(time)) {
                            row = i;
                        }
                    }
                    //Day ekata adalawa class details thama danna thiyenne
                    for (int i = 0; i < dtm.getColumnCount(); i++) {
                        if (dtm.getColumnName(i).toString().equalsIgnoreCase(day)) {
                            col = i;
                        }
                    }
                    String value = rs1.getString("cls_day");
                    dtm.setValueAt(value, row, col);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void tableFilterByOnlyGrade(String flag1) {
        try {
            ResultSet rs1 = Database.getData("SELECT `class`.`cls_sTime` , `class`.`cls_day` , `class`.`cls_grade` , `subject`.`sub_name`, `classtype`.`clt_type`\n"
                    + "FROM `cambridge_project`.`class` INNER JOIN `cambridge_project`.`classtype` ON (`class`.`clt_id` = `classtype`.`clt_id`) \n"
                    + "INNER JOIN `cambridge_project`.`subject` ON (`class`.`sub_id` = `subject`.`sub_id`) \n"
                    + "WHERE `class`.`cls_grade` = '" + flag1 + "'");
            while (rs1.next()) {
                String day = rs1.getString("cls_day");
                String time = rs1.getString("cls_sTime");
                int row = 0;
                int col = 0;
                boolean already = false;
                DefaultTableModel dtm = (DefaultTableModel) tab_csp_preview.getModel();
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    if (dtm.getValueAt(i, 0).toString().equalsIgnoreCase(time)) {
                        already = true;
                        row = i;
                    }
                }
                if (already) {
                    for (int i = 0; i < dtm.getColumnCount(); i++) {
                        if (dtm.getColumnName(i).toString().equalsIgnoreCase(day)) {
                            col = i;
                        }
                    }
                    String value = rs1.getString("cls_day");
                    dtm.setValueAt(value, row, col);
                } else {
                    //Kelinma daanna
                    Vector v = new Vector();
                    v.add(rs1.getString("cls_sTime"));
                    dtm.addRow(v);
                    for (int i = 0; i < dtm.getRowCount(); i++) {
                        if (dtm.getValueAt(i, 0).toString().equalsIgnoreCase(time)) {
                            row = i;
                        }
                    }
                    //Day ekata adalawa class details thama danna thiyenne
                    for (int i = 0; i < dtm.getColumnCount(); i++) {
                        if (dtm.getColumnName(i).toString().equalsIgnoreCase(day)) {
                            col = i;
                        }
                    }
                    String value = rs1.getString("cls_day");
                    dtm.setValueAt(value, row, col);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

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
                jLabel34.setText(date);
                sdf = new SimpleDateFormat("hh:mm:ss");
                time = sdf.format(d);
                jLabel29.setText(time);
            }
        });
        t.start();
    }

}
