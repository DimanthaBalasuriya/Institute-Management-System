package com.prog.cnv.sys.control.system.student.PaymentAndBill;

import com.prog.cnv.sys.control.system.control.Database;
import com.prog.cnv.sys.control.system.control.Message;
import com.prog.cnv.sys.control.system.student.Login;
import com.prog.cnv.sys.control.system.student.ReportViewer;
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

public class PaymentWizarrd extends javax.swing.JFrame {

    String selectedPaymentMethod;
    int user;
    boolean billState = true;

    public PaymentWizarrd() {
        initComponents();
        setDateAndTime();
        upperLableValues();
        cb_pwz_card.setEnabled(false);
        txt_pwz_cardNo.setEnabled(false);
        txt_pwz_refNo.setEnabled(false);
        txt_pwz_balance.setEnabled(false);
        txt_pwz_due.setEnabled(false);
        txt_pwz_ntotal.setEnabled(false);
        txt_pwz_total.setEnabled(false);
    }

    public PaymentWizarrd(String userFlag) {
        this();
        user = Integer.parseInt(userFlag);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        txt_pwz_id = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txt_pwz_name = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txt_pwz_position = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_pwz_selectedpayment = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        txt_pwz_cardNo = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txt_pwz_payment = new javax.swing.JTextField();
        jrb_pwz_cash = new javax.swing.JRadioButton();
        jtb_pwz_card = new javax.swing.JRadioButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txt_pwz_balance = new javax.swing.JTextField();
        btn_pwz_bill = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        txt_pwz_total = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txt_pwz_discount = new javax.swing.JTextField();
        txt_pwz_ntotal = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txt_pwz_due = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tab_pwz_pendingpayment = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel46 = new javax.swing.JLabel();
        cb_pwz_card = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        txt_pwz_refNo = new javax.swing.JTextField();
        btn_pwz_remove = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        lab_totalpayment = new javax.swing.JLabel();
        lab_student = new javax.swing.JLabel();
        lab_teacher = new javax.swing.JLabel();
        lab_class = new javax.swing.JLabel();
        lab_payment = new javax.swing.JLabel();
        lab_studentavt = new javax.swing.JLabel();
        lab_teacheravt = new javax.swing.JLabel();
        lab_classavt = new javax.swing.JLabel();
        lab_paymentavt = new javax.swing.JLabel();
        lab_totalpaymentavt = new javax.swing.JLabel();
        lab_student_txt = new javax.swing.JLabel();
        lab_teacher_txt = new javax.swing.JLabel();
        lab_totalpayment_txt = new javax.swing.JLabel();
        lab_pcount_txt = new javax.swing.JLabel();
        lab_class_txt = new javax.swing.JLabel();
        lab_totalPayment_count = new javax.swing.JLabel();
        lab_teacher_count = new javax.swing.JLabel();
        lab_class_count = new javax.swing.JLabel();
        lab_payment_count = new javax.swing.JLabel();
        lab_student_count = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txt_pwz_payAmount = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel5.setText("Payment Wizard");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("ID");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));

        txt_pwz_id.setBackground(new java.awt.Color(255, 255, 255));
        txt_pwz_id.setForeground(new java.awt.Color(51, 51, 51));
        txt_pwz_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pwz_idActionPerformed(evt);
            }
        });
        txt_pwz_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_pwz_idKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pwz_idKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pwz_idKeyTyped(evt);
            }
        });
        jPanel4.add(txt_pwz_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 200, 30));

        jLabel34.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Payment");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, 40));

        txt_pwz_name.setEditable(false);
        txt_pwz_name.setBackground(new java.awt.Color(255, 255, 255));
        txt_pwz_name.setForeground(new java.awt.Color(51, 51, 51));
        jPanel4.add(txt_pwz_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 200, 30));

        jLabel35.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Position");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, 30));

        txt_pwz_position.setEditable(false);
        txt_pwz_position.setBackground(new java.awt.Color(255, 255, 255));
        txt_pwz_position.setForeground(new java.awt.Color(51, 51, 51));
        jPanel4.add(txt_pwz_position, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 200, 30));

        jLabel36.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Name");
        jPanel4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, 30));

        jLabel37.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Payment ");
        jPanel4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 130, -1, -1));

        tab_pwz_selectedpayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Title", "Description", "Month", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tab_pwz_selectedpayment);
        if (tab_pwz_selectedpayment.getColumnModel().getColumnCount() > 0) {
            tab_pwz_selectedpayment.getColumnModel().getColumn(0).setResizable(false);
            tab_pwz_selectedpayment.getColumnModel().getColumn(1).setResizable(false);
            tab_pwz_selectedpayment.getColumnModel().getColumn(2).setResizable(false);
            tab_pwz_selectedpayment.getColumnModel().getColumn(3).setResizable(false);
            tab_pwz_selectedpayment.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 1020, 210));

        jLabel38.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("CARD");
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 360, -1, 30));

        txt_pwz_cardNo.setBackground(new java.awt.Color(255, 255, 255));
        txt_pwz_cardNo.setForeground(new java.awt.Color(51, 51, 51));
        jPanel4.add(txt_pwz_cardNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 410, 210, 30));

        jLabel39.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("PAYMENT");
        jPanel4.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 510, -1, 30));

        txt_pwz_payment.setBackground(new java.awt.Color(255, 255, 255));
        txt_pwz_payment.setForeground(new java.awt.Color(51, 51, 51));
        txt_pwz_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pwz_paymentActionPerformed(evt);
            }
        });
        txt_pwz_payment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pwz_paymentKeyTyped(evt);
            }
        });
        jPanel4.add(txt_pwz_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 510, 210, 30));

        jrb_pwz_cash.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jrb_pwz_cash);
        jrb_pwz_cash.setText("CASH");
        jrb_pwz_cash.setBorder(null);
        jrb_pwz_cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_pwz_cashActionPerformed(evt);
            }
        });
        jPanel4.add(jrb_pwz_cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 310, 70, 30));

        jtb_pwz_card.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jtb_pwz_card);
        jtb_pwz_card.setText("CARD");
        jtb_pwz_card.setBorder(null);
        jtb_pwz_card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtb_pwz_cardActionPerformed(evt);
            }
        });
        jPanel4.add(jtb_pwz_card, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 310, 70, 30));

        jLabel40.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Amount");
        jPanel4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 430, -1, 30));

        jLabel41.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("BALANCE");
        jPanel4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 560, -1, 30));

        txt_pwz_balance.setBackground(new java.awt.Color(255, 255, 255));
        txt_pwz_balance.setForeground(new java.awt.Color(51, 51, 51));
        jPanel4.add(txt_pwz_balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 560, 210, 30));

        btn_pwz_bill.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btn_pwz_bill.setText("ISSUE BILL");
        btn_pwz_bill.setBorder(null);
        btn_pwz_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pwz_billActionPerformed(evt);
            }
        });
        jPanel4.add(btn_pwz_bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 650, 300, 50));

        jLabel42.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("TOTAL");
        jPanel4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 160, -1, 30));

        txt_pwz_total.setBackground(new java.awt.Color(255, 255, 255));
        txt_pwz_total.setForeground(new java.awt.Color(51, 51, 51));
        jPanel4.add(txt_pwz_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 160, 210, 30));

        jLabel43.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("DISCOUNT");
        jPanel4.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 210, -1, 30));

        txt_pwz_discount.setBackground(new java.awt.Color(255, 255, 255));
        txt_pwz_discount.setForeground(new java.awt.Color(51, 51, 51));
        txt_pwz_discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pwz_discountActionPerformed(evt);
            }
        });
        txt_pwz_discount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pwz_discountKeyTyped(evt);
            }
        });
        jPanel4.add(txt_pwz_discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 210, 210, 30));

        txt_pwz_ntotal.setBackground(new java.awt.Color(255, 255, 255));
        txt_pwz_ntotal.setForeground(new java.awt.Color(51, 51, 51));
        jPanel4.add(txt_pwz_ntotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 260, 210, 30));

        jLabel44.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("NET TOTAL");
        jPanel4.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 260, -1, 30));

        jLabel45.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("DUE");
        jPanel4.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 610, -1, 30));

        txt_pwz_due.setBackground(new java.awt.Color(255, 255, 255));
        txt_pwz_due.setForeground(new java.awt.Color(51, 51, 51));
        jPanel4.add(txt_pwz_due, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 610, 210, 30));

        tab_pwz_pendingpayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Title", "Description", "Month", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab_pwz_pendingpayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_pwz_pendingpaymentMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tab_pwz_pendingpayment);
        if (tab_pwz_pendingpayment.getColumnModel().getColumnCount() > 0) {
            tab_pwz_pendingpayment.getColumnModel().getColumn(0).setResizable(false);
            tab_pwz_pendingpayment.getColumnModel().getColumn(1).setResizable(false);
            tab_pwz_pendingpayment.getColumnModel().getColumn(2).setResizable(false);
            tab_pwz_pendingpayment.getColumnModel().getColumn(3).setResizable(false);
            tab_pwz_pendingpayment.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 1020, 240));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 475, 910, 10));

        jLabel46.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("PAY TYPE");
        jPanel4.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 310, -1, 30));

        cb_pwz_card.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Master", "Visa", "Amex" }));
        jPanel4.add(cb_pwz_card, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 360, 210, 30));

        jLabel47.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("REF NO");
        jPanel4.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 460, -1, 30));

        txt_pwz_refNo.setBackground(new java.awt.Color(255, 255, 255));
        txt_pwz_refNo.setForeground(new java.awt.Color(51, 51, 51));
        jPanel4.add(txt_pwz_refNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 460, 210, 30));

        btn_pwz_remove.setBackground(new java.awt.Color(255, 255, 255));
        btn_pwz_remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Delete_Row_20px.png"))); // NOI18N
        btn_pwz_remove.setBorder(null);
        btn_pwz_remove.setOpaque(false);
        btn_pwz_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pwz_removeActionPerformed(evt);
            }
        });
        jPanel4.add(btn_pwz_remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(991, 460, 40, 30));

        jLabel48.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Pending payment");
        jPanel4.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        lab_totalpayment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel4.add(lab_totalpayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 240, 100));

        lab_student.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel4.add(lab_student, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 100));

        lab_teacher.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel4.add(lab_teacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 240, 100));

        lab_class.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel4.add(lab_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 240, 100));

        lab_payment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel4.add(lab_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 240, 100));

        lab_studentavt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Student_Male_70px.png"))); // NOI18N
        jPanel4.add(lab_studentavt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 80));

        lab_teacheravt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_School_Director_70px_1.png"))); // NOI18N
        jPanel4.add(lab_teacheravt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 90, 80));

        lab_classavt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Google_Classroom_70px.png"))); // NOI18N
        jPanel4.add(lab_classavt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 90, 80));

        lab_paymentavt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Coins_70px.png"))); // NOI18N
        jPanel4.add(lab_paymentavt, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 90, 80));

        lab_totalpaymentavt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Cash_in_Hand_70px.png"))); // NOI18N
        jPanel4.add(lab_totalpaymentavt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, 90, 80));

        lab_student_txt.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lab_student_txt.setText("Total Student");
        jPanel4.add(lab_student_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 110, 20));

        lab_teacher_txt.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lab_teacher_txt.setText("Total Teacher");
        jPanel4.add(lab_teacher_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 110, 20));

        lab_totalpayment_txt.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lab_totalpayment_txt.setText("Total payment");
        jPanel4.add(lab_totalpayment_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 20, 110, 20));

        lab_pcount_txt.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lab_pcount_txt.setText("Payment Count");
        jPanel4.add(lab_pcount_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 110, 20));

        lab_class_txt.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lab_class_txt.setText("Total Class");
        jPanel4.add(lab_class_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 110, 20));

        lab_totalPayment_count.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jPanel4.add(lab_totalPayment_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 50, 80, 20));

        lab_teacher_count.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jPanel4.add(lab_teacher_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 30, 20));

        lab_class_count.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jPanel4.add(lab_class_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 30, 20));

        lab_payment_count.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jPanel4.add(lab_payment_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 50, 30, 20));

        lab_student_count.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jPanel4.add(lab_student_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 30, 20));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 130, 10, 580));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1350, 10));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 890, 10));

        txt_pwz_payAmount.setCaretColor(new java.awt.Color(51, 51, 51));
        txt_pwz_payAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pwz_payAmountActionPerformed(evt);
            }
        });
        txt_pwz_payAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_pwz_payAmountKeyTyped(evt);
            }
        });
        jPanel4.add(txt_pwz_payAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 430, 160, 30));

        jLabel49.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("CARD NO");
        jPanel4.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 410, -1, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1370, 710));

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

    private void btn_pwz_billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pwz_billActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Do you need a bill!");
        if (option == 0) {
            billState = true;
            executePayment();
        } else {
            billState = false;
            executePayment();
        }
    }//GEN-LAST:event_btn_pwz_billActionPerformed

    private void txt_pwz_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pwz_idActionPerformed
        try {
            ResultSet rs1 = Database.getData("SELECT std_id, std_fname, std_mname, std_lname FROM Student WHERE std_rfid = '" + txt_pwz_id.getText() + "' OR std_mobile = '" + txt_pwz_id.getText() + "' OR std_home = '" + txt_pwz_id.getText() + "'");
            ResultSet rs2 = Database.getData("SELECT emp_id, emp_fname, emp_mname, emp_lname FROM Employee WHERE emp_rfid = '" + txt_pwz_id.getText() + "' OR emp_nic = '" + txt_pwz_id.getText() + "'");
            if (rs1.next()) {
                txt_pwz_name.setText(rs1.getString("std_fname") + " " + rs1.getString("std_mname") + " " + rs1.getString("std_lname"));
                txt_pwz_position.setText("STUDENT");
                studentPaymentWizard(rs1.getString("std_id"));
            }
            if (rs2.next()) {
                txt_pwz_name.setText(rs2.getString("emp_fname") + " " + rs2.getString("emp_mname") + " " + rs2.getString("emp_lname"));
                txt_pwz_position.setText("EMPLOYEE");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txt_pwz_idActionPerformed

    private void btn_pwz_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pwz_removeActionPerformed
        if (tab_pwz_selectedpayment.isRowSelected(tab_pwz_selectedpayment.getSelectedRow())) {
            DefaultTableModel dtm = (DefaultTableModel) tab_pwz_selectedpayment.getModel();
            double decrePrice = Double.parseDouble(dtm.getValueAt(tab_pwz_selectedpayment.getSelectedRow(), 4).toString());
            double currenTotal = Double.parseDouble(txt_pwz_total.getText());
            double newTotal = currenTotal - decrePrice;
            txt_pwz_total.setText(newTotal + "");
            dtm.removeRow(tab_pwz_selectedpayment.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "PLEASE SELECT ANY DATA ROW IN PAYMENT TABLE!");
        }
    }//GEN-LAST:event_btn_pwz_removeActionPerformed

    private void tab_pwz_pendingpaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_pwz_pendingpaymentMouseClicked

    }//GEN-LAST:event_tab_pwz_pendingpaymentMouseClicked

    private void jtb_pwz_cardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtb_pwz_cardActionPerformed
        cb_pwz_card.setEnabled(true);
        txt_pwz_cardNo.setEnabled(true);
        txt_pwz_refNo.setEnabled(true);
        selectedPaymentMethod = "CARD";
    }//GEN-LAST:event_jtb_pwz_cardActionPerformed

    private void jrb_pwz_cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_pwz_cashActionPerformed
        cb_pwz_card.setEnabled(false);
        txt_pwz_cardNo.setEnabled(false);
        txt_pwz_refNo.setEnabled(false);
        selectedPaymentMethod = "CASH";
    }//GEN-LAST:event_jrb_pwz_cashActionPerformed

    private void txt_pwz_discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pwz_discountActionPerformed
        double discount = Double.parseDouble(txt_pwz_discount.getText());
        double total = Double.parseDouble(txt_pwz_total.getText());
        double nTotal = total - ((total * discount) / 100);
        txt_pwz_ntotal.setText(nTotal + "");
    }//GEN-LAST:event_txt_pwz_discountActionPerformed

    private void txt_pwz_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pwz_paymentActionPerformed
        double payment = Double.parseDouble(txt_pwz_payment.getText());
        double nTotal = Double.parseDouble(txt_pwz_ntotal.getText());
        if (payment >= nTotal) {
            double balance = Math.abs(payment - nTotal);
            txt_pwz_balance.setText(balance + "");
            txt_pwz_due.setText(0 + "");
        } else if (payment < nTotal) {
            double duebalance = Math.abs(nTotal - payment);
            txt_pwz_due.setText(duebalance + "");
            txt_pwz_balance.setText(0 + "");
        }
    }//GEN-LAST:event_txt_pwz_paymentActionPerformed

    private void txt_pwz_payAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pwz_payAmountActionPerformed
        DefaultTableModel dtm1 = (DefaultTableModel) tab_pwz_pendingpayment.getModel();
        if (tab_pwz_pendingpayment.isRowSelected(tab_pwz_pendingpayment.getSelectedRow())) {
            DefaultTableModel dtm2 = (DefaultTableModel) tab_pwz_selectedpayment.getModel();
            double classFee = Double.parseDouble(dtm1.getValueAt(tab_pwz_pendingpayment.getSelectedRow(), 4).toString());
            Vector v = new Vector();
            v.add(dtm1.getValueAt(tab_pwz_pendingpayment.getSelectedRow(), 0).toString());
            v.add(dtm1.getValueAt(tab_pwz_pendingpayment.getSelectedRow(), 1).toString());
            v.add(dtm1.getValueAt(tab_pwz_pendingpayment.getSelectedRow(), 2).toString());
            v.add(dtm1.getValueAt(tab_pwz_pendingpayment.getSelectedRow(), 3).toString());
            if (txt_pwz_payAmount.getText().isEmpty()) {
                v.add(classFee);
            } else {
                v.add(txt_pwz_payAmount.getText());
            }
            dtm2.addRow(v);
            if (txt_pwz_total.getText().isEmpty()) {
                if (txt_pwz_payAmount.getText().isEmpty()) {
                    double totalFee = classFee;
                    txt_pwz_total.setText(totalFee + "");
                } else {
                    txt_pwz_total.setText(txt_pwz_payAmount.getText());
                }
            } else {
                if (txt_pwz_payAmount.getText().isEmpty()) {
                    double totalFee = classFee + Double.parseDouble(txt_pwz_total.getText());
                    txt_pwz_total.setText(totalFee + "");
                } else {
                    double totalFee = Double.parseDouble(txt_pwz_payAmount.getText()) + Double.parseDouble(txt_pwz_total.getText());
                    txt_pwz_total.setText(totalFee + "");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "PLEASE SELECT ANY DATA ROW IN PAYMENT TABLE!");
        }
    }//GEN-LAST:event_txt_pwz_payAmountActionPerformed

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

    private void txt_pwz_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pwz_idKeyReleased

    }//GEN-LAST:event_txt_pwz_idKeyReleased

    private void txt_pwz_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pwz_idKeyPressed

    }//GEN-LAST:event_txt_pwz_idKeyPressed

    private void txt_pwz_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pwz_idKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_pwz_idKeyTyped

    private void txt_pwz_payAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pwz_payAmountKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || (evt.getKeyChar() == '.')) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_pwz_payAmountKeyTyped

    private void txt_pwz_discountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pwz_discountKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || (evt.getKeyChar() == '.')) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_pwz_discountKeyTyped

    private void txt_pwz_paymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pwz_paymentKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || (evt.getKeyChar() == '.')) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_pwz_paymentKeyTyped

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
            java.util.logging.Logger.getLogger(PaymentWizarrd.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentWizarrd.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentWizarrd.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentWizarrd.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentWizarrd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pwz_bill;
    private javax.swing.JButton btn_pwz_remove;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_pwz_card;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JRadioButton jrb_pwz_cash;
    private javax.swing.JRadioButton jtb_pwz_card;
    private javax.swing.JLabel lab_class;
    private javax.swing.JLabel lab_class_count;
    private javax.swing.JLabel lab_class_txt;
    private javax.swing.JLabel lab_classavt;
    private javax.swing.JLabel lab_payment;
    private javax.swing.JLabel lab_payment_count;
    private javax.swing.JLabel lab_paymentavt;
    private javax.swing.JLabel lab_pcount_txt;
    private javax.swing.JLabel lab_student;
    private javax.swing.JLabel lab_student_count;
    private javax.swing.JLabel lab_student_txt;
    private javax.swing.JLabel lab_studentavt;
    private javax.swing.JLabel lab_teacher;
    private javax.swing.JLabel lab_teacher_count;
    private javax.swing.JLabel lab_teacher_txt;
    private javax.swing.JLabel lab_teacheravt;
    private javax.swing.JLabel lab_totalPayment_count;
    private javax.swing.JLabel lab_totalpayment;
    private javax.swing.JLabel lab_totalpayment_txt;
    private javax.swing.JLabel lab_totalpaymentavt;
    private javax.swing.JTable tab_pwz_pendingpayment;
    private javax.swing.JTable tab_pwz_selectedpayment;
    private javax.swing.JTextField txt_pwz_balance;
    private javax.swing.JTextField txt_pwz_cardNo;
    private javax.swing.JTextField txt_pwz_discount;
    private javax.swing.JTextField txt_pwz_due;
    private javax.swing.JTextField txt_pwz_id;
    private javax.swing.JTextField txt_pwz_name;
    private javax.swing.JTextField txt_pwz_ntotal;
    private javax.swing.JTextField txt_pwz_payAmount;
    private javax.swing.JTextField txt_pwz_payment;
    private javax.swing.JTextField txt_pwz_position;
    private javax.swing.JTextField txt_pwz_refNo;
    private javax.swing.JTextField txt_pwz_total;
    // End of variables declaration//GEN-END:variables

    private void studentPaymentWizard(String studentID) {
        try {
            //Dan month eke idan lamaya register vechcha year eke reg wechcha month eka dakwa loop ekak ynawa 
            //meka athuledi lamay addala month walata geviya yuthu mudal gananaya kara penwanawa.
            SimpleDateFormat sdfMN = new SimpleDateFormat("MM");
            SimpleDateFormat sdfYN = new SimpleDateFormat("yyyy");
            DefaultTableModel dtm = (DefaultTableModel) tab_pwz_pendingpayment.getModel();
            dtm.setRowCount(0);
            ResultSet rs1 = Database.getData("SELECT YEAR(`student`.`std_reg_date`) AS yer, MONTH(`student`.`std_reg_date`) AS mon FROM Student WHERE `student`.std_id = '" + studentID + "'");
            if (rs1.next()) {
                int ryer = rs1.getInt("yer");
                int rmon = rs1.getInt("mon");
                int cyer = Integer.parseInt(sdfYN.format(new Date()));
                int cmon = Integer.parseInt(sdfMN.format(new Date()));

                for (int i = cyer; i >= ryer; i--) {
                    for (int j = 12; j >= 1; j--) {
                        //i kiyanne year eka
                        //j kiyanne month eka
                        if ((cmon < j) && (cyer == i)) {
                            continue;
                        }
                        String teacher = "";
                        String grade = "";
                        String classType = "";
                        String subject = "";

                        ResultSet rs2 = Database.getData("SELECT DISTINCT `class`.`cls_id` FROM `cambridge_project`.`studentclass` INNER JOIN `cambridge_project`.`class` ON (`studentclass`.`cls_id` = `class`.`cls_id`)\n"
                                + "INNER JOIN `cambridge_project`.`student` ON (`studentclass`.`std_id` = `student`.`std_id`) WHERE `student`.`std_id` = '" + studentID + "'");
                        while (rs2.next()) {
                            int clsID = rs2.getInt("cls_id");

                            ResultSet rs4 = Database.getData("SELECT `employee`.`emp_fname`, `employee`.`emp_mname`, `employee`.`emp_lname`, `class`.`cls_grade`, `subject`.`sub_name`, `classtype`.`clt_type`\n"
                                    + "FROM `cambridge_project`.`class` INNER JOIN `cambridge_project`.`subject` ON (`class`.`sub_id` = `subject`.`sub_id`)\n"
                                    + "INNER JOIN `cambridge_project`.`employee` ON (`class`.`emp_id` = `employee`.`emp_id`) INNER JOIN `cambridge_project`.`classtype` \n"
                                    + "ON (`class`.`clt_id` = `classtype`.`clt_id`) WHERE `class`.`cls_id` = '" + clsID + "'");
                            if (rs4.next()) {
                                teacher = rs4.getString("emp_fname") + " " + rs4.getString("emp_mname") + " " + rs4.getString("emp_lname");
                                grade = rs4.getString("cls_grade");
                                classType = rs4.getString("clt_type");
                                subject = rs4.getString("sub_name");
                            }
                            //`bill`.`bil_id`,
                            ResultSet rs3 = Database.getData("SELECT `bill`.`bil_id`, `classpayment`.`clp_amount`, `classpayment`.`clp_currentFee`, `class`.`cls_fee` FROM `cambridge_project`.`classpayment`\n"
                                    + "INNER JOIN `cambridge_project`.`class` ON (`classpayment`.`cls_id` = `class`.`cls_id`) INNER JOIN `cambridge_project`.`subject` \n"
                                    + "ON (`class`.`sub_id` = `subject`.`sub_id`) INNER JOIN `cambridge_project`.`classtype` ON (`class`.`clt_id` = `classtype`.`clt_id`)\n"
                                    + "INNER JOIN `cambridge_project`.`bill` ON (`classpayment`.`bil_id` = `bill`.`bil_id`) INNER JOIN `cambridge_project`.`billpayment` \n"
                                    + "ON (`billpayment`.`bil_id` = `bill`.`bil_id`) INNER JOIN `cambridge_project`.`student` ON (`billpayment`.`std_id` = `student`.`std_id`) \n"
                                    + "WHERE `class`.`cls_id` = '" + clsID + "' AND `student`.`std_id` = '" + studentID + "' AND YEAR(`classpayment`.`clp_date`) = '" + i + "' AND MONTH(`classpayment`.`clp_date`) = '" + j + "'");
                            if (rs3.next()) {
                                double paidAmount = rs3.getDouble("clp_amount");
                                double classFeeAt = rs3.getDouble("clp_currentFee");
                                double currentClassFee = rs3.getDouble("cls_fee");
                                int bill = rs3.getInt("bil_id");

                                if (classFeeAt < currentClassFee) {
                                    //Adala kaalet anuwa thama class fee eka hadanna one
                                    if (paidAmount < classFeeAt) {
                                        //Due eka calculate karala view karanne
                                        double dueForPaymet = classFeeAt - paidAmount;
                                        Vector v = new Vector();
                                        v.add(clsID);
                                        v.add("CLASS FEE" + "_" + "DUE" + "_" + bill);
                                        v.add(teacher + "_" + subject + "_" + classType + "_" + grade);
                                        v.add(monthName(j) + "_" + i);
                                        v.add(dueForPaymet);
                                        v.add(bill);
                                        dtm.addRow(v);
                                    } else if (paidAmount == classFeeAt) {
                                        //Me kiyanne payment karala e
                                    }
                                } else if (classFeeAt == currentClassFee) {
                                    //Normal class fee eka displaykarana
                                    if (paidAmount < currentClassFee) {
                                        //Due eka calculate karala pennnana
                                        double dueForPayment = currentClassFee - paidAmount;
                                        Vector v = new Vector();
                                        v.add(clsID);
                                        v.add("CLASS FEE" + "_" + "DUE" + "_" + bill);
                                        v.add(teacher + "_" + subject + "_" + classType + "_" + grade);
                                        v.add(monthName(j) + "_" + i);
                                        v.add(dueForPayment);
                                        v.add(bill);
                                        dtm.addRow(v);
                                    } else if (paidAmount == currentClassFee) {
                                        //Me kiyanne payment karala
                                    }
                                } else if (classFeeAt > currentClassFee) {
                                    //Addala kaaleta anuwa thama class fee eka hadanna one
                                    if (paidAmount < classFeeAt) {
                                        //Adala due eka caculate karala pennnana
                                        double dueForPayment = classFeeAt - paidAmount;
                                        Vector v = new Vector();
                                        v.add(clsID);
                                        v.add("CLASS FEE" + "_" + "DUE" + "_" + bill);
                                        v.add(teacher + "_" + subject + "_" + classType + "_" + grade);
                                        v.add(monthName(j) + "_" + i);
                                        v.add(dueForPayment);
                                        v.add(bill);
                                        dtm.addRow(v);
                                    } else if (paidAmount == classFeeAt) {
                                        //payment karla
                                    }
                                }

                            } else {
                                //Lamaya payment karala na
                                double clsFee = 0.0;
                                ResultSet rs5 = Database.getData("SELECT `class`.`cls_fee` FROM `class` WHERE `class`.`cls_id` = '" + clsID + "'");
                                if (rs5.next()) {
                                    clsFee = rs5.getDouble("cls_fee");
                                }
                                Vector v = new Vector();
                                v.add(clsID);
                                v.add("CLASS FEE" + "_" + "TOT" + "_" + "NO");
                                v.add(teacher + "_" + subject + "_" + classType + "_" + grade);
                                v.add(monthName(j) + "_" + i);
                                v.add(clsFee);
                                dtm.addRow(v);
                            }
                        }

                        if ((ryer == i) && (rmon == j)) {
                            break;
                        }
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String monthName(int flag1) {
        switch (flag1) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return null;
        }
    }

    private int monthNo(String flag1) {
        switch (flag1) {
            case "January":
                return 1;
            case "February":
                return 2;
            case "March":
                return 3;
            case "April":
                return 4;
            case "May":
                return 5;
            case "June":
                return 6;
            case "July":
                return 7;
            case "August":
                return 8;
            case "September":
                return 9;
            case "October":
                return 10;
            case "November":
                return 11;
            case "December":
                return 12;
            default:
                return 0;
        }
    }

    private void upperLableValues() {
        try {
            SimpleDateFormat sdfD = new SimpleDateFormat("yyyy-MM-dd");
            ResultSet rs1 = Database.getData("SELECT COUNT(std_id) AS student FROM Student");
            if (rs1.next()) {
                int stdCount = Integer.parseInt(rs1.getString("student"));
                lab_student_count.setText(stdCount + "");
            } else {
                lab_student_count.setText(0 + "");
            }
            ResultSet rs2 = Database.getData("SELECT COUNT(emp_id) AS teacher FROM Employee WHERE emp_position = 'Teacher'");
            if (rs2.next()) {
                int tecCount = Integer.parseInt(rs2.getString("teacher"));
                lab_teacher_count.setText(tecCount + "");
            } else {
                lab_teacher_count.setText(0 + "");
            }
            ResultSet rs3 = Database.getData("SELECT COUNT(cls_id) AS class FROM Class");
            if (rs3.next()) {
                int clsCount = Integer.parseInt(rs3.getString("class"));
                lab_class_count.setText(clsCount + "");
            } else {
                lab_class_count.setText(0 + "");
            }
            ResultSet rs4 = Database.getData("SELECT COUNT(blp_id) AS payment FROM billPayment WHERE blp_date = '" + sdfD.format(new Date()) + "'");
            if (rs4.next()) {
                double payment = Double.parseDouble(rs4.getString("payment"));
                lab_payment_count.setText(payment + "");
            } else {
                lab_payment_count.setText(0 + "");
            }
            ResultSet rs5 = Database.getData("SELECT SUM(bil_nettotal) AS totalToday FROM Bill WHERE bil_date = '" + sdfD.format(new Date()) + "'");
            if (rs5.next()) {
                double totalPayment = rs5.getDouble("totalToday");
                lab_totalPayment_count.setText(totalPayment + "");
            } else {
                lab_totalPayment_count.setText(0 + "");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void executePayment() {
        double totalBill = Double.parseDouble(txt_pwz_total.getText());
        double discountBill = Double.parseDouble(txt_pwz_discount.getText());
        double netTotalBill = Double.parseDouble(txt_pwz_ntotal.getText());
        double paymentBill = Double.parseDouble(txt_pwz_payment.getText());
        double balanceBill = Double.parseDouble(txt_pwz_balance.getText());
        double dueBill = Double.parseDouble(txt_pwz_due.getText());
        String cardName = cb_pwz_card.getSelectedItem().toString();
        String cardNo = txt_pwz_cardNo.getText();
        String cardRefNo = txt_pwz_refNo.getText();
        SimpleDateFormat sdfD = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdfT = new SimpleDateFormat("hh:mm:ss");
        SimpleDateFormat sdfM = new SimpleDateFormat("MMMM");
        SimpleDateFormat sdfY = new SimpleDateFormat("yyyy");

        try {
            int studentID = 0;
            ResultSet rs = Database.getData("SELECT `student`.`std_id` FROM `student` WHERE `student`.`std_rfid` = '" + txt_pwz_id.getText() + "'");
            if (rs.next()) {
                studentID = rs.getInt("std_id");
            }
            Database.sendData("INSERT INTO Bill(bil_time, bil_date, bil_total, bil_discount, bil_nettotal) VALUES('" + sdfT.format(new Date()) + "', '" + sdfD.format(new Date()) + "', '" + totalBill + "', '" + discountBill + "', '" + netTotalBill + "')");
            ResultSet rs1 = Database.getData("SELECT bil_id FROM Bill WHERE bil_time = '" + sdfT.format(new Date()) + "' AND bil_date = '" + sdfD.format(new Date()) + "' AND bil_state = 1");
            if (rs1.next()) {
                int billId = rs1.getInt("bil_id");
                Database.sendData("INSERT INTO billPayment(blp_time, blp_date, blp_payment, blp_balance, blp_due, blp_pmtmethod, blp_card, blp_card_no, blp_ref_no, std_id, bil_id) VALUES('" + sdfT.format(new Date()) + "', '" + sdfD.format(new Date()) + "', '" + paymentBill + "', '" + balanceBill + "', '" + dueBill + "', '" + selectedPaymentMethod + "', '" + cardName + "', '" + cardNo + "', '" + cardRefNo + "', '" + studentID + "','" + billId + "')");
                DefaultTableModel dtm = (DefaultTableModel) tab_pwz_selectedpayment.getModel();
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    String monthYear[] = dtm.getValueAt(i, 3).toString().split("_");
                    String month = monthYear[0];
                    String year = monthYear[1];
                    String cmonth = sdfM.format(new Date());
                    String cyear = sdfY.format(new Date());
                    String day = "01";
                    String titleAr[] = dtm.getValueAt(i, 1).toString().split("_");
                    double paidAmount = Double.parseDouble(dtm.getValueAt(i, 4).toString());
                    double currentClassFee = 0.0;
                    int classID = Integer.parseInt(dtm.getValueAt(i, 0).toString());
                    ResultSet cr = Database.getData("SELECT `class`.`cls_fee` FROM Class WHERE `class`.`cls_id` = '" + classID + "'");
                    if (cr.next()) {
                        currentClassFee = cr.getDouble("cls_fee");
                    }
                    if (titleAr[0].equals("CLASS FEE")) {
                        if ((month == cmonth) && (year == cyear)) {
                            //Ada una eage daaana
                            if (titleAr[1].equals("DUE")) {
                                int bilID = Integer.parseInt(titleAr[2]);
                                ResultSet rsb = Database.getData("SELECT `classpayment`.`clp_amount` FROM `classpayment` WHERE `classpayment`.`bil_id` = '" + bilID + "' AND `classpayment`.`cls_id` = '" + classID + "'");
                                if (rsb.next()) {
                                    double upAmount = paidAmount + rsb.getDouble("clp_amount");
                                    Database.sendData("UPDATE `classpayment` SET `classpayment`.`clp_amount` = '" + upAmount + "' WHERE `classpayment`.`bil_id` = '" + bilID + "' AND `classpayment`.`cls_id` = '" + classID + "'");
                                }
                            } else if (titleAr[1].equals("TOT")) {
                                Database.sendData("INSERT INTO classPayment(clp_time, clp_date, clp_amount, "
                                        + "clp_currentFee, bil_id, cls_id) "
                                        + "VALUES('" + sdfT.format(new Date()) + "', '" + sdfD.format(new Date()) + "', '" + paidAmount + "',"
                                        + "'" + currentClassFee + "', '" + billId + "', '" + classID + "')");
                            }
                        } else {
                            //eda una wage daanna
                            String makeNewDate = year + "-" + monthNo(month) + "-" + day;
                            if (titleAr[1].equals("DUE")) {
                                //Due Payment eka hadanna one
                                int bilID = Integer.parseInt(titleAr[2]);
                                ResultSet rsb = Database.getData("SELECT `classpayment`.`clp_amount` FROM `classpayment` WHERE `classpayment`.`bil_id` = '" + bilID + "' AND `classpayment`.`cls_id` = '" + classID + "'");
                                if (rsb.next()) {
                                    double upAmount = paidAmount + rsb.getDouble("clp_amount");
                                    Database.sendData("UPDATE `classpayment` SET `classpayment`.`clp_amount` = '" + upAmount + "' WHERE `classpayment`.`bil_id` = '" + bilID + "' AND `classpayment`.`cls_id` = '" + classID + "'");
                                }
                            } else if (titleAr[1].equals("TOT")) {
                                Database.sendData("INSERT INTO classPayment(clp_time, clp_date, clp_amount, "
                                        + "clp_currentFee, bil_id, cls_id) "
                                        + "VALUES('" + sdfT.format(new Date()) + "', '" + makeNewDate + "', '" + paidAmount + "',"
                                        + "'" + currentClassFee + "', '" + billId + "', '" + classID + "')");
                            }
                        }
                    } else if (titleAr[0].equals("INVOICE")) {
                        if ((month == cmonth) && (year == cyear)) {
                            //Ada una wage daaana
                        } else {
                            //eda una wage daanna
                            String makeNewDate = year + "-" + monthNo(month) + "-" + day;
                        }
                    }
                }
                if (billState) {
                    executeBill(billId);
                }
                clearFields();
                upperLableValues();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void executeBill(int bill) {
        try {
            String username = "";
            int quantity = 0;
            ResultSet rs1 = Database.getData("SELECT use_username FROM USer WHERE use_id = '" + user + "'");
            if (rs1.next()) {
                username = rs1.getString("use_username");
            }

            DefaultTableModel dtmQty = (DefaultTableModel) tab_pwz_selectedpayment.getModel();
            quantity = dtmQty.getRowCount();

            SimpleDateFormat sdfD = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sdfT = new SimpleDateFormat("hh:mm:ss");
            DefaultTableModel dtm = (DefaultTableModel) tab_pwz_selectedpayment.getModel();
            JRTableModelDataSource dataresource = new JRTableModelDataSource(dtm);
            String report = "D://MYPROJECT//CAMBRIDGE_NEW_VERSION_1_0//src//com//prog//cnv//sys//report//PaymentReceipt.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(report);
            HashMap<String, Object> m = new HashMap();
            m.put("cashier", username);
            m.put("student", txt_pwz_name.getText().toString());
            m.put("payment", selectedPaymentMethod);
            m.put("bil", bill + "");
            m.put("date", sdfD.format(new Date()));
            m.put("time", sdfT.format(new Date()));
            m.put("total", txt_pwz_total.getText().toString());
            m.put("quanity", quantity);
            m.put("discount", txt_pwz_discount.getText().toString());
            m.put("nettotal", txt_pwz_ntotal.getText().toString());
            JasperPrint jp = JasperFillManager.fillReport(jr, m, dataresource);
            ReportViewer rv = new ReportViewer(jp);
            rv.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "PRINTING ERROR!");
        }
    }

    private void clearFields() {
        txt_pwz_balance.setText(null);
        txt_pwz_cardNo.setText(null);
        txt_pwz_discount.setText(null);
        txt_pwz_due.setText(null);
        txt_pwz_ntotal.setText(null);
        txt_pwz_payAmount.setText(null);
        txt_pwz_payment.setText(null);
        txt_pwz_refNo.setText(null);
        txt_pwz_total.setText(null);
        DefaultTableModel dtm = (DefaultTableModel) tab_pwz_selectedpayment.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs1 = Database.getData("SELECT std_id, std_fname, std_mname, std_lname FROM Student WHERE std_rfid = '" + txt_pwz_id.getText() + "' OR std_mobile = '" + txt_pwz_id.getText() + "' OR std_home = '" + txt_pwz_id.getText() + "'");
            ResultSet rs2 = Database.getData("SELECT emp_id, emp_fname, emp_mname, emp_lname FROM Employee WHERE emp_rfid = '" + txt_pwz_id.getText() + "' OR emp_nic = '" + txt_pwz_id.getText() + "'");
            if (rs1.next()) {
                txt_pwz_name.setText(rs1.getString("std_fname") + " " + rs1.getString("std_mname") + " " + rs1.getString("std_lname"));
                txt_pwz_position.setText("STUDENT");
                studentPaymentWizard(rs1.getString("std_id"));
            }
            if (rs2.next()) {
                txt_pwz_name.setText(rs2.getString("emp_fname") + " " + rs2.getString("emp_mname") + " " + rs2.getString("emp_lname"));
                txt_pwz_position.setText("EMPLOYEE");
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
