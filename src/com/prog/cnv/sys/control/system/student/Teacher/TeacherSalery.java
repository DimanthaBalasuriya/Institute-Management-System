package com.prog.cnv.sys.control.system.student.Teacher;

import com.prog.cnv.sys.control.system.control.Database;
import com.prog.cnv.sys.control.system.control.Message;
import com.prog.cnv.sys.control.system.control.Systemcontroller;
import com.prog.cnv.sys.control.system.student.Login;
import com.prog.cnv.sys.control.system.student.ReportViewer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class TeacherSalery extends javax.swing.JFrame {

    private int tecID;
    private int user;
    private static double totalNetEarn = 0.0;

    public TeacherSalery() {
        initComponents();
        setDateAndTime();
        fetchDataToComboBox();
        txt_pge_abalance.setVisible(false);
        jLabel32.setVisible(false);
    }

    public TeacherSalery(String userFlag) {
        this();
        user = Integer.parseInt(userFlag);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txt_pge_withAmount = new javax.swing.JTextField();
        btn_withdraw = new javax.swing.JButton();
        txt_pge_abalance = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        btn_add_to_account = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        cb_pge_teacher = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txt_pge_email = new javax.swing.JTextField();
        txt_pge_nic = new javax.swing.JTextField();
        txt_pge_totEarn = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btn_pay_generate = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txt_pge_cono1 = new javax.swing.JTextField();
        txt_pge_totDeduction = new javax.swing.JTextField();
        txt_pge_totNarn = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txt_pge_totPay = new javax.swing.JTextField();
        btn_calculateTotal = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(40, 40, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Shutdown_25px.png"))); // NOI18N
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 30, 20));

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 15, 110, 15));

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 110, 15));

        jLabel32.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Withdraw Amount");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 20, -1));

        txt_pge_withAmount.setOpaque(false);
        txt_pge_withAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pge_withAmountActionPerformed(evt);
            }
        });
        txt_pge_withAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pge_withAmountKeyTyped(evt);
            }
        });
        jPanel2.add(txt_pge_withAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 20, 0));

        btn_withdraw.setBorder(null);
        btn_withdraw.setOpaque(false);
        btn_withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_withdrawActionPerformed(evt);
            }
        });
        jPanel2.add(btn_withdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 30, 20));

        txt_pge_abalance.setEditable(false);
        txt_pge_abalance.setEnabled(false);
        jPanel2.add(txt_pge_abalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 70, 20));

        jLabel34.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Account Balance");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, -60, -1, -1));

        btn_add_to_account.setBorder(null);
        btn_add_to_account.setOpaque(false);
        btn_add_to_account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_to_accountActionPerformed(evt);
            }
        });
        jPanel2.add(btn_add_to_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 20, 20));

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
        jLabel5.setText("Pay Generate");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Email");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, -1, 30));

        cb_pge_teacher.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        cb_pge_teacher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cb_pge_teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_pge_teacherActionPerformed(evt);
            }
        });
        jPanel4.add(cb_pge_teacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 6, 260, 40));

        jLabel24.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Teacher Earn Class By Class");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel25.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("NIC");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 50, 30));

        jLabel26.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Contact no");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 80, 30));

        txt_pge_email.setEditable(false);
        txt_pge_email.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        txt_pge_email.setEnabled(false);
        jPanel4.add(txt_pge_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 4, 180, 40));

        txt_pge_nic.setEditable(false);
        txt_pge_nic.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        txt_pge_nic.setEnabled(false);
        jPanel4.add(txt_pge_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 4, 180, 40));

        txt_pge_totEarn.setEditable(false);
        txt_pge_totEarn.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        txt_pge_totEarn.setEnabled(false);
        jPanel4.add(txt_pge_totEarn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 650, 140, 40));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1350, 10));

        btn_pay_generate.setText("GENERATE");
        btn_pay_generate.setBorder(null);
        btn_pay_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pay_generateActionPerformed(evt);
            }
        });
        jPanel4.add(btn_pay_generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 5, 100, 40));

        jLabel27.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("EARNING");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 650, -1, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class", "Type", "Day", "Pays", "Earn", "Deduction", "Net Earn", "Month"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1350, 550));

        jLabel28.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Teacher");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jLabel29.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("PAYS");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, -1, 30));

        jLabel31.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 640, 460, 60));

        txt_pge_cono1.setEditable(false);
        txt_pge_cono1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        txt_pge_cono1.setEnabled(false);
        jPanel4.add(txt_pge_cono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 4, 170, 40));

        txt_pge_totDeduction.setEditable(false);
        txt_pge_totDeduction.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        txt_pge_totDeduction.setEnabled(false);
        jPanel4.add(txt_pge_totDeduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 650, 140, 40));

        txt_pge_totNarn.setEditable(false);
        txt_pge_totNarn.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        txt_pge_totNarn.setEnabled(false);
        jPanel4.add(txt_pge_totNarn, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 650, 140, 40));

        jLabel33.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("DEDUCTION");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 650, -1, 30));

        txt_pge_totPay.setEditable(false);
        txt_pge_totPay.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        txt_pge_totPay.setEnabled(false);
        jPanel4.add(txt_pge_totPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 650, 140, 40));

        btn_calculateTotal.setText("TOTAL");
        btn_calculateTotal.setBorder(null);
        btn_calculateTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculateTotalActionPerformed(evt);
            }
        });
        jPanel4.add(btn_calculateTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 650, 160, 40));

        jLabel35.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("NET EARN");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 650, -1, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_print_25px.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 50, 60, 40));

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

    private void btn_withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_withdrawActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Do you want to Withdraw Money!");
        SimpleDateFormat sdfDN = new SimpleDateFormat("dd");
        if (option == 0) {
            double withdrawAmount = Double.parseDouble(txt_pge_withAmount.getText());
            try {
                ResultSet rs1 = Database.getData("SELECT acc_amount FROM Account WHERE emp_id = '" + tecID + "'");
                if (rs1.next()) {
                    double currentAccountAmount = Double.parseDouble(rs1.getString("acc_amount"));
                    double newAccountAmount = currentAccountAmount - withdrawAmount;
                    Database.sendData("UPDATE Account SET acc_amount = '" + newAccountAmount + "' WHERE emp_id = '" + tecID + "'");
                }
                updateAccountAmount();
                jLabel31.setText("Withdraw Successfull!");
            } catch (Exception e) {
                e.printStackTrace();
                jLabel31.setText("Withdraw not successfull!");
            }
        } else if (option == 1) {
            //Do nothing
        }
    }//GEN-LAST:event_btn_withdrawActionPerformed

    private void cb_pge_teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_pge_teacherActionPerformed
        try {
            String tecName[] = cb_pge_teacher.getSelectedItem().toString().split(" ");
            ResultSet rs = Database.getData("SELECT emp_id, emp_nic, emp_mobile, emp_email FROM Employee WHERE emp_fname = '" + tecName[0] + "' AND emp_mname = '" + tecName[1] + "' AND emp_lname = '" + tecName[2] + "' AND emp_position = 'TEACHER'");
            if (rs.next()) {
                tecID = Integer.parseInt(rs.getString("emp_id"));
                txt_pge_nic.setText(rs.getString("emp_nic"));
                txt_pge_cono1.setText(rs.getString("emp_mobile"));
                txt_pge_email.setText(rs.getString("emp_email"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_cb_pge_teacherActionPerformed

    private void btn_pay_generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pay_generateActionPerformed
        //Generate Payments for all teachers.
        //Get Date of this month
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy:MM:dd");
        //String today = sdf1.format(new Date());
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(new Date());
        int firstDay = cal1.getActualMinimum(Calendar.DAY_OF_MONTH);
        int lastDay = cal1.getActualMaximum(Calendar.DAY_OF_MONTH);
        int today = cal1.get(Calendar.DAY_OF_MONTH);

        if (today == lastDay) {
            //Normal process.
            generatePayment();
        } else {
            generatePayment();
            //Require admin priviliages.
        }

        //Check if a date is a last date of a month
        //if last date ok and generate payment
        //if not a last date get admin priviliages show pop up and ask permission with admin password
        //Generate payment
    }//GEN-LAST:event_btn_pay_generateActionPerformed

    private void txt_pge_withAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pge_withAmountActionPerformed

    }//GEN-LAST:event_txt_pge_withAmountActionPerformed

    private void btn_calculateTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calculateTotalActionPerformed
        DefaultTableModel dtm1 = (DefaultTableModel) jTable1.getModel();
        int pays = 0;
        double earn = 0.0;
        double deduction = 0.0;
        double netEarn = 0.0;
        for (int i = 0; i < dtm1.getRowCount(); i++) {
            pays += Double.parseDouble(dtm1.getValueAt(i, 3).toString());
            earn += Double.parseDouble(dtm1.getValueAt(i, 4).toString());
            deduction += Double.parseDouble(dtm1.getValueAt(i, 5).toString());
            netEarn += Double.parseDouble(dtm1.getValueAt(i, 6).toString());
        }
        totalNetEarn = netEarn;
        txt_pge_totPay.setText(pays + "");
        txt_pge_totEarn.setText(earn + "");
        txt_pge_totDeduction.setText(deduction + "");
        txt_pge_totNarn.setText(netEarn + "");
    }//GEN-LAST:event_btn_calculateTotalActionPerformed

    private void btn_add_to_accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_to_accountActionPerformed
        try {
            SimpleDateFormat sdfT = new SimpleDateFormat("hh:mm:ss");
            SimpleDateFormat sdfD = new SimpleDateFormat("yyyy:MM:dd");
            ResultSet rs1 = Database.getData("SELECT acc_amount FROM Account WHERE emp_id = '" + tecID + "'");
            if (rs1.next()) {
                double currentAccountValue = Double.parseDouble(rs1.getString("acc_amount"));
                double newAccountValue = currentAccountValue + totalNetEarn;
                Database.sendData("UPDATE Account SET acc_amount = '" + newAccountValue + "' WHERE emp_id = '" + tecID + "'");
            }
            updateAccountAmount();
            //Fill Data to classPayReceive table

            JOptionPane.showMessageDialog(null, "Earning transfer corectly to Account!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_add_to_accountActionPerformed

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
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
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            SimpleDateFormat sdfM = new SimpleDateFormat("MMMM");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            JRTableModelDataSource dataresource = new JRTableModelDataSource(dtm);
            String report = "D://MYPROJECT//CAMBRIDGE_NEW_VERSION_1_0//src//com//prog//cnv//sys//report//SelectedTeacherSalary.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(report);
            HashMap<String, Object> m = new HashMap<>();
            m.put("teachername", cb_pge_teacher.getSelectedItem().toString());
            m.put("month", sdfM.format(new Date()));
            m.put("paids", txt_pge_totPay.getText().toString());
            m.put("earnings", txt_pge_totEarn.getText().toString());
            m.put("deductions", txt_pge_totDeduction.getText().toString());
            m.put("netearns", txt_pge_totNarn.getText().toString());
            JasperPrint jp = JasperFillManager.fillReport(jr, m, dataresource);
            ReportViewer rv = new ReportViewer(jp);
            rv.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "PRINTING ERROR!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_pge_withAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pge_withAmountKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || (evt.getKeyChar() == '.')) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_pge_withAmountKeyTyped

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
            java.util.logging.Logger.getLogger(TeacherSalery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherSalery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherSalery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherSalery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherSalery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_to_account;
    private javax.swing.JButton btn_calculateTotal;
    private javax.swing.JButton btn_pay_generate;
    private javax.swing.JButton btn_withdraw;
    private javax.swing.JComboBox<String> cb_pge_teacher;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_pge_abalance;
    private javax.swing.JTextField txt_pge_cono1;
    private javax.swing.JTextField txt_pge_email;
    private javax.swing.JTextField txt_pge_nic;
    private javax.swing.JTextField txt_pge_totDeduction;
    private javax.swing.JTextField txt_pge_totEarn;
    private javax.swing.JTextField txt_pge_totNarn;
    private javax.swing.JTextField txt_pge_totPay;
    private javax.swing.JTextField txt_pge_withAmount;
    // End of variables declaration//GEN-END:variables

    private void fetchDataToComboBox() {
        try {
            ResultSet rs = Database.getData("SELECT emp_fname, emp_mname, emp_lname FROM Employee WHERE emp_position = 'TEACHER'");
            while (rs.next()) {
                cb_pge_teacher.addItem(rs.getString("emp_fname") + " " + rs.getString("emp_mname") + " " + rs.getString("emp_lname"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void generatePayment() {
        try {
            System.out.println("A");
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy:MM:dd");
            SimpleDateFormat sdf2 = new SimpleDateFormat("MMMM");
            ResultSet rs1 = Database.getData("SELECT `class`.`cls_id` FROM `cambridge_project`.`class` INNER JOIN `cambridge_project`.`employee` ON (`class`.`emp_id` = `employee`.`emp_id`)\n"
                    + "WHERE `employee`.`emp_id` = '" + tecID + "' AND YEAR(`class`.`cls_reg_date`) = YEAR(CURRENT_DATE)");

            DefaultTableModel dtm1 = (DefaultTableModel) jTable1.getModel();
            dtm1.setRowCount(0);
            while (rs1.next()) {
                System.out.println(rs1.getString("cls_id"));
                int classId = Integer.parseInt(rs1.getString("cls_id"));
                int paymentCount = 0;
                double totalStudentPayment = 0.0;
                double commision = 0.0;
                String subjectName = "";
                String classType = "";
                String day = "";
                //Get Count of payments for the class.
                //Get Total of payments for this class.
                ResultSet rs2 = Database.getData("SELECT `subject`.`sub_name`, `day`.`day_name`, `classpayment`.`clp_amount`, `classtype`.`clt_type`, `class`.`cls_pmt_comi` FROM `cambridge_project`.`classpayment`\n"
                        + "INNER JOIN `cambridge_project`.`class` ON (`classpayment`.`cls_id` = `class`.`cls_id`) INNER JOIN `cambridge_project`.`subject` \n"
                        + "ON (`class`.`sub_id` = `subject`.`sub_id`) INNER JOIN `cambridge_project`.`classtype` ON (`class`.`clt_id` = `classtype`.`clt_id`)\n"
                        + "INNER JOIN `cambridge_project`.`classscheduleday` ON (`classscheduleday`.`cls_id` = `class`.`cls_id`) INNER JOIN `cambridge_project`.`day` \n"
                        + "ON (`classscheduleday`.`day_id` = `day`.`day_id`) WHERE `class`.`cls_id` = '" + classId + "'\n"
                        + "");
                while (rs2.next()) {
                    paymentCount = paymentCount + 1;
                    double studentPayment = Double.parseDouble(rs2.getString("clp_amount"));
                    commision = Double.parseDouble(rs2.getString("cls_pmt_comi"));
                    totalStudentPayment = totalStudentPayment + studentPayment;
                    subjectName = rs2.getString("sub_name");
                    classType = rs2.getString("clt_type");
                    day = rs2.getString("day_name");
                }
                double deduction = (totalStudentPayment * commision) / 100;
                double netEarn = totalStudentPayment - deduction;
                Vector v = new Vector();
                v.add(subjectName);
                v.add(classType);
                v.add(day);
                v.add(paymentCount);
                v.add(totalStudentPayment);
                v.add(deduction);
                v.add(netEarn);
                v.add(sdf2.format(new Date()));
                dtm1.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void updateAccountAmount() {
        try {
            ResultSet rs1 = Database.getData("SELECT acc_amount FROM Account WHERE emp_id = '" + tecID + "'");
            if (rs1.next()) {
                txt_pge_abalance.setText(rs1.getString("acc_amount"));
            }
        } catch (Exception e) {
            e.printStackTrace();
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
                jLabel36.setText(date);
                sdf = new SimpleDateFormat("hh:mm:ss");
                time = sdf.format(d);
                jLabel37.setText(time);
            }
        });
        t.start();
    }

}
