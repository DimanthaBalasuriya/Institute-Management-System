package com.prog.cnv.sys.control.system.student.PaymentAndBill;

import com.prog.cnv.sys.control.system.control.Database;
import com.prog.cnv.sys.control.system.control.Message;
import com.prog.cnv.sys.control.system.student.Login;
import com.prog.cnv.sys.control.system.student.ReportViewer;
import com.prog.cnv.sys.control.system.student.Teacher.TeacherRegistration;
import com.prog.cnv.sys.control.system.student.Teacher.TeacherSalery;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class MonthlySaleryPreview extends javax.swing.JFrame {

    int user;

    public MonthlySaleryPreview() {
        initComponents();
        setDateAndTime();
        fetchDataToLable();
        fetchDataToMainPreviewTable();
        fetchDataToSidePanelTable();
    }

    public MonthlySaleryPreview(String user) {
        this();
        this.user = Integer.parseInt(user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(40, 40, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Shutdown_25px.png"))); // NOI18N
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 30, 20));

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
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 30, 30));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Salery Preview");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel13.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 390, 210, 10));
        jPanel13.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1120, 10));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subjet", "Class"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel13.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 430, 210, 270));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_School_Director_70px_1.png"))); // NOI18N
        jLabel8.setToolTipText("");
        jPanel13.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 60));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Google_Classroom_70px.png"))); // NOI18N
        jLabel9.setToolTipText("");
        jPanel13.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 70, 60));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Student_Male_70px.png"))); // NOI18N
        jLabel10.setToolTipText("");
        jPanel13.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 70, 60));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_saving_book_70px_1.png"))); // NOI18N
        jLabel11.setToolTipText("");
        jPanel13.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 80, 60));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_deposit_70px_1.png"))); // NOI18N
        jLabel12.setToolTipText("");
        jPanel13.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 70, 60));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Class Count");
        jLabel13.setToolTipText("");
        jPanel13.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 100, 20));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Student Count");
        jLabel14.setToolTipText("");
        jPanel13.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 100, 20));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Account Count");
        jLabel15.setToolTipText("");
        jPanel13.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, 100, 20));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Subject Count");
        jLabel16.setToolTipText("");
        jPanel13.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 100, 20));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Teacher Count");
        jLabel17.setToolTipText("");
        jPanel13.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 100, 20));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 40, 20));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, 40, 20));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 40, 40, 20));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 40, 20));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 40, 20));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 190, 60));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 60));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 190, 60));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 190, 60));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 190, 60));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Payment preview of Month");
        jPanel13.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 240, 50));

        jButton4.setText("REFRESH");
        jButton4.setBorder(null);
        jPanel13.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 140, 30));

        jButton5.setText("TEACHER SALERY");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 150, 30));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_print_25px.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 80, 70, 50));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel13.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, 10, 690));

        jTable2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher", "Class", "Pays", "Earn", "Deduction", "Net Earn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel13.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1120, 570));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject", "Class"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel13.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 50, 210, 330));

        jLabel37.setText("Currently scheduled subject");
        jPanel13.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 400, 160, 30));

        jLabel38.setText("Currently scheduled class");
        jPanel13.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 160, 30));

        jButton7.setText("TEACHER");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, 170, 30));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1370, 710));

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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        TeacherSalery tes = new TeacherSalery(user + "");
        tes.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        TeacherRegistration tre = new TeacherRegistration(user + "");
        tre.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            SimpleDateFormat sdfM = new SimpleDateFormat("MMMM");
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            JRTableModelDataSource dataresource = new JRTableModelDataSource(dtm);
            String report = "D://MYPROJECT//CAMBRIDGE_NEW_VERSION_1_0//src//com//prog//cnv//sys//report//MonthlySalaryOfAllTeacher.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(report);
            HashMap<String, Object> m = new HashMap();
            m.put("month", sdfM.format(new Date()).toString());
            JasperPrint jp = JasperFillManager.fillReport(jr, m, dataresource);
            ReportViewer rv = new ReportViewer(jp);
            rv.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "PRINTING ERROR!");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
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
    }//GEN-LAST:event_jLabel27MouseClicked

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
            java.util.logging.Logger.getLogger(MonthlySaleryPreview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonthlySaleryPreview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonthlySaleryPreview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonthlySaleryPreview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonthlySaleryPreview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables

    private void fetchDataToLable() {
        try {
            ResultSet rs1 = Database.getData("SELECT COUNT(emp_id) AS teacherCount FROM Employee WHERE emp_position = 'Teacher'");
            if (rs1.next()) {
                jLabel22.setText(rs1.getInt("teacherCount") + "");
            }
            ResultSet rs2 = Database.getData("SELECT COUNT(sub_id) AS subjectCount FROM Subject WHERE sub_state = '1'");
            if (rs2.next()) {
                jLabel19.setText(rs2.getInt("subjectCount") + "");
            }
            ResultSet rs3 = Database.getData("SELECT COUNT(std_id) AS studentCount FROM Student");
            if (rs3.next()) {
                jLabel21.setText(rs3.getInt("studentCount") + "");
            }
            ResultSet rs4 = Database.getData("SELECT COUNT(cls_id) AS classCount FROM Class");
            if (rs4.next()) {
                jLabel18.setText(rs4.getInt("classCount") + "");
            }
            ResultSet rs5 = Database.getData("SELECT COUNT(acc_id) AS accountCount FROM Account");
            if (rs5.next()) {
                jLabel20.setText(rs5.getInt("accountCount") + "");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fetchDataToSidePanelTable() {
        try {
            ResultSet rs1 = Database.getData("SELECT `subject`.`sub_name`, `classtype`.`clt_type`, `class`.`cls_grade` FROM `cambridge_project`.`class` INNER JOIN `cambridge_project`.`subject` ON (`class`.`sub_id` = `subject`.`sub_id`)\n"
                    + "INNER JOIN `cambridge_project`.`classtype` ON (`class`.`clt_id` = `classtype`.`clt_id`)");
            DefaultTableModel dtm1 = (DefaultTableModel) jTable3.getModel();
            dtm1.setRowCount(0);
            while (rs1.next()) {
                Vector v = new Vector();
                v.add(rs1.getString("sub_name"));
                v.add(rs1.getString("clt_type") + "_" + rs1.getString("cls_grade"));
                dtm1.addRow(v);
            }
            ResultSet rs2 = Database.getData("SELECT DISTINCT sub_name, sub_state FROM SUBJECT ");
            DefaultTableModel dtm2 = (DefaultTableModel) jTable1.getModel();
            dtm2.setRowCount(0);
            while (rs2.next()) {
                Vector v = new Vector();
                v.add(rs2.getString("sub_name"));
                if (rs2.getString("sub_state").equalsIgnoreCase("1")) {
                    v.add("active");
                } else {
                    v.add("close");
                }
                dtm2.addRow(v);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fetchDataToMainPreviewTable() {
        try {
            //How i calculate earnings of a teacher by each class
            //Get teacher list
            //Get the scheduled class of them
            //Get sum of earnig
            //Get commision of class
            //Deduct commission from earning
            //Show on table
            ResultSet rs1 = Database.getData("SELECT emp_id, emp_fname, emp_mname, emp_lname FROM Employee WHERE emp_position = 'TEACHER'");
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setRowCount(0);
            while (rs1.next()) {
                int teacherID = Integer.parseInt(rs1.getString("emp_id"));
                String teacherName = rs1.getString("emp_fname") + " " + rs1.getString("emp_mname") + " " + rs1.getString("emp_lname");
                ResultSet rs2 = Database.getData("SELECT `class`.`cls_grade`, `subject`.`sub_name`, `classtype`.`clt_type`, `class`.`cls_id`, `class`.`cls_pmt_comi` FROM `cambridge_project`.`class`\n"
                        + "INNER JOIN `cambridge_project`.`employee` ON (`class`.`emp_id` = `employee`.`emp_id`) INNER JOIN `cambridge_project`.`subject` \n"
                        + "ON (`class`.`sub_id` = `subject`.`sub_id`) INNER JOIN `cambridge_project`.`classtype` ON (`class`.`clt_id` = `classtype`.`clt_id`) \n"
                        + "WHERE `employee`.`emp_id` = '" + teacherID + "' AND YEAR(`class`.`cls_reg_date`) = YEAR(CURRENT_DATE) ORDER BY `class`.`cls_id`");
                while (rs2.next()) {
                    int classId = rs2.getInt("cls_id");
                    int grade = rs2.getInt("cls_grade");
                    double classCommice = rs2.getDouble("cls_pmt_comi");
                    String subject = rs2.getString("sub_name");
                    String classType = rs2.getString("clt_type");
                    System.out.println(classId);
                    //Class Ekata karala thiyena payment tika gaththa comis eka deduct kala display kala
                    ResultSet rs3 = Database.getData("SELECT SUM(`classpayment`.`clp_amount`) AS paidAmount FROM `classpayment` WHERE MONTH(`classpayment`.`clp_date`) = MONTH(CURRENT_DATE) AND YEAR(`classpayment`.`clp_date`) = YEAR(CURRENT_DATE) AND `classpayment`.`cls_id` = '" + classId + "'");
                    if (rs3.next()) {
                        double totalPaidAmountForClass = rs3.getDouble("paidAmount");
                        double deduction = (totalPaidAmountForClass * classCommice) / 100;
                        double netEarn = totalPaidAmountForClass - deduction;
                        int paidCount = 0;
                        ResultSet rs4 = Database.getData("SELECT COUNT(`classpayment`.`clp_id`) AS paidCount FROM `classpayment` WHERE MONTH(`classpayment`.`clp_date`) = MONTH(CURRENT_DATE) AND YEAR(`classpayment`.`clp_date`) = YEAR(CURRENT_DATE) AND `classpayment`.`cls_id` = '" + classId + "'");
                        if (rs4.next()) {
                            paidCount = rs4.getInt("paidCount");
                        }
                        Vector v = new Vector();
                        v.add(teacherName);
                        v.add(subject + "_" + classType + "_" + grade);
                        v.add(paidCount);
                        v.add(totalPaidAmountForClass);
                        v.add(deduction);
                        v.add(netEarn);
                        dtm.addRow(v);
                    }

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
                jLabel30.setText(date);
                sdf = new SimpleDateFormat("hh:mm:ss");
                time = sdf.format(d);
                jLabel29.setText(time);
            }
        });
        t.start();
    }

}
