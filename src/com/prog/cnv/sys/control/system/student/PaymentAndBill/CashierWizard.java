package com.prog.cnv.sys.control.system.student.PaymentAndBill;

import com.prog.cnv.sys.control.system.control.Database;
import com.prog.cnv.sys.control.system.control.Message;
import com.prog.cnv.sys.control.system.control.Systemcontroller;
import com.prog.cnv.sys.control.system.student.AttendanceAnalytics;
import com.prog.cnv.sys.control.system.student.ClassManagement.ClassSchedule;
import com.prog.cnv.sys.control.system.student.Login;
import com.prog.cnv.sys.control.system.student.ReportViewer;
import com.prog.cnv.sys.control.system.student.Teacher.TeacherList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
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

public class CashierWizard extends javax.swing.JFrame {

    int holderID;
    int user;
    String payType;

    public CashierWizard() {
        initComponents();
        setDateAndTime();
        txt_csw_name.setEnabled(false);
        txt_csw_pos.setEnabled(false);
        txt_csw_price.setEnabled(false);
        txt_csw_nprice.setEnabled(false);
        cb_csw_card.setEnabled(false);
        txt_csw_cno.setEnabled(false);
        txt_csw_refno.setEnabled(false);
        txt_csw_balance.setEnabled(false);
        txt_csw_due.setEnabled(false);
        jList1.setVisible(false);
        jScrollPane2.setVisible(false);
        fetchCountsToLable();
    }

    public CashierWizard(String userFlag) {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cb_csw_card = new javax.swing.JComboBox<>();
        txt_csw_unutDis = new javax.swing.JTextField();
        txt_csw_qty = new javax.swing.JTextField();
        txt_csw_price = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_csw_preview = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txt_csw_name = new javax.swing.JTextField();
        txt_csw_id = new javax.swing.JTextField();
        txt_csw_fdis = new javax.swing.JTextField();
        txt_csw_nprice = new javax.swing.JTextField();
        txt_csw_cno = new javax.swing.JTextField();
        txt_csw_refno = new javax.swing.JTextField();
        txt_csw_pmt = new javax.swing.JTextField();
        txt_csw_due = new javax.swing.JTextField();
        txt_csw_balance = new javax.swing.JTextField();
        btn_csw_remove = new javax.swing.JButton();
        btn_csw_bill = new javax.swing.JButton();
        txt_csw_pos = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btn_csw_tinvoice = new javax.swing.JButton();
        btn_csw_attendance = new javax.swing.JButton();
        btn_csw_teacher = new javax.swing.JButton();
        btn_csw_ttable = new javax.swing.JButton();
        btn_csw_payment = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        lab_cls_avt = new javax.swing.JLabel();
        lab_pmt_avt = new javax.swing.JLabel();
        lab_att_avt = new javax.swing.JLabel();
        lab_inv_avt = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lab_pmt_count = new javax.swing.JLabel();
        lab_cls_count = new javax.swing.JLabel();
        lab_att_count = new javax.swing.JLabel();
        lab_inv_count = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        txt_csw_item = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

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
        jLabel5.setText("Cashier Wizard");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        jPanel2.setBackground(new java.awt.Color(40, 40, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Shutdown_25px.png"))); // NOI18N
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel44MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel44MouseExited(evt);
            }
        });
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 30, 20));

        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 15, 110, 15));

        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 110, 15));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, 1370, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 220, 220));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 10, 690));

        jLabel25.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("ITEM");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 30));

        jLabel26.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("QUANTITY");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, -1, 30));

        jLabel27.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("PRICE");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, 30));

        jLabel28.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("DISCOUNT");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, -1, 30));

        cb_csw_card.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel4.add(cb_csw_card, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 670, 140, 30));

        txt_csw_unutDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_csw_unutDisActionPerformed(evt);
            }
        });
        txt_csw_unutDis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_csw_unutDisKeyTyped(evt);
            }
        });
        jPanel4.add(txt_csw_unutDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 100, 30));

        txt_csw_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_csw_qtyActionPerformed(evt);
            }
        });
        txt_csw_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_csw_qtyKeyTyped(evt);
            }
        });
        jPanel4.add(txt_csw_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 70, 30));

        txt_csw_price.setEditable(false);
        jPanel4.add(txt_csw_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 100, 30));

        tab_csw_preview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM", "QUANTITY", "PRICE", "DISCOUNT", "NET PRICE"
            }
        ));
        jScrollPane1.setViewportView(tab_csw_preview);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 1180, 350));

        jLabel29.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("NET PRICE");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 580, -1, 30));

        jLabel30.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("ID NO");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        jLabel31.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("QUANTITY");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, 30));

        jLabel32.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("DUE");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 620, -1, 30));

        jLabel34.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("NAME");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, 40));

        jLabel35.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("PAYMENT");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, -1, 30));

        jLabel36.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("PAY METHOD");
        jPanel4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, -1, 30));

        jLabel37.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("NO");
        jPanel4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 670, -1, -1));

        jLabel38.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("BALANCE");
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 620, -1, 30));

        jLabel39.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("CARD");
        jPanel4.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, -1, -1));

        jLabel40.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("REF NO");
        jPanel4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 670, -1, -1));

        txt_csw_name.setEditable(false);
        txt_csw_name.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jPanel4.add(txt_csw_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 300, 40));

        txt_csw_id.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        txt_csw_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_csw_idActionPerformed(evt);
            }
        });
        txt_csw_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_csw_idKeyTyped(evt);
            }
        });
        jPanel4.add(txt_csw_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 200, 40));

        txt_csw_fdis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_csw_fdisActionPerformed(evt);
            }
        });
        txt_csw_fdis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_csw_fdisKeyTyped(evt);
            }
        });
        jPanel4.add(txt_csw_fdis, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 580, 140, 35));

        txt_csw_nprice.setEditable(false);
        jPanel4.add(txt_csw_nprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 580, 170, 35));

        txt_csw_cno.setEditable(false);
        jPanel4.add(txt_csw_cno, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 670, 140, 30));

        txt_csw_refno.setEditable(false);
        txt_csw_refno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_csw_refnoActionPerformed(evt);
            }
        });
        jPanel4.add(txt_csw_refno, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 670, 140, 30));

        txt_csw_pmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_csw_pmtActionPerformed(evt);
            }
        });
        txt_csw_pmt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_csw_pmtKeyTyped(evt);
            }
        });
        jPanel4.add(txt_csw_pmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 620, 140, 40));

        txt_csw_due.setEditable(false);
        jPanel4.add(txt_csw_due, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 620, 170, 35));

        txt_csw_balance.setEditable(false);
        jPanel4.add(txt_csw_balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 620, 140, 40));

        btn_csw_remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Delete_Row_20px.png"))); // NOI18N
        btn_csw_remove.setToolTipText("REMOVE");
        btn_csw_remove.setBorder(null);
        btn_csw_remove.setContentAreaFilled(false);
        jPanel4.add(btn_csw_remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 180, 30, 30));

        btn_csw_bill.setText("BILL");
        btn_csw_bill.setToolTipText("BILL");
        btn_csw_bill.setBorder(null);
        btn_csw_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_csw_billActionPerformed(evt);
            }
        });
        jPanel4.add(btn_csw_bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 660, 270, 40));

        txt_csw_pos.setEditable(false);
        txt_csw_pos.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jPanel4.add(txt_csw_pos, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 150, 40));

        jLabel41.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("POSITION");
        jPanel4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, 40));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1180, 10));

        btn_csw_tinvoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_invoice_70px_1.png"))); // NOI18N
        btn_csw_tinvoice.setToolTipText("INVOICE");
        btn_csw_tinvoice.setBorder(null);
        btn_csw_tinvoice.setContentAreaFilled(false);
        btn_csw_tinvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_csw_tinvoiceActionPerformed(evt);
            }
        });
        jPanel4.add(btn_csw_tinvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 460, 150, 110));

        btn_csw_attendance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_students_70px.png"))); // NOI18N
        btn_csw_attendance.setToolTipText("ATTENDANCE");
        btn_csw_attendance.setBorder(null);
        btn_csw_attendance.setContentAreaFilled(false);
        btn_csw_attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_csw_attendanceActionPerformed(evt);
            }
        });
        jPanel4.add(btn_csw_attendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 590, 150, 110));

        btn_csw_teacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_School_Director_70px_1.png"))); // NOI18N
        btn_csw_teacher.setToolTipText("TEACHER");
        btn_csw_teacher.setBorder(null);
        btn_csw_teacher.setContentAreaFilled(false);
        btn_csw_teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_csw_teacherActionPerformed(evt);
            }
        });
        jPanel4.add(btn_csw_teacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 160, 150, 110));

        btn_csw_ttable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_timetable_70px.png"))); // NOI18N
        btn_csw_ttable.setToolTipText("CLASS SCHEDULE");
        btn_csw_ttable.setBorder(null);
        btn_csw_ttable.setContentAreaFilled(false);
        btn_csw_ttable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_csw_ttableActionPerformed(evt);
            }
        });
        jPanel4.add(btn_csw_ttable, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 310, 150, 110));

        btn_csw_payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_cash_in_hand_70px_1.png"))); // NOI18N
        btn_csw_payment.setToolTipText("PAYMENT");
        btn_csw_payment.setBorder(null);
        btn_csw_payment.setContentAreaFilled(false);
        btn_csw_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_csw_paymentActionPerformed(evt);
            }
        });
        jPanel4.add(btn_csw_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, 150, 110));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1180, 10));

        lab_cls_avt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_cls_avt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_class_70px.png"))); // NOI18N
        jPanel4.add(lab_cls_avt, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 70, 90, 90));

        lab_pmt_avt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_pmt_avt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Coins_70px.png"))); // NOI18N
        jPanel4.add(lab_pmt_avt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 90, 90));

        lab_att_avt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_att_avt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_students_70px.png"))); // NOI18N
        jPanel4.add(lab_att_avt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 90, 90));

        lab_inv_avt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_inv_avt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_invoice_70px_1.png"))); // NOI18N
        jPanel4.add(lab_inv_avt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, 90));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("CLASS");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 80, 70, 20));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("ATTENDACE");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 80, 20));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("PAYMENTS");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 70, 20));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("INVOICES");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 70, 20));

        lab_pmt_count.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lab_pmt_count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_pmt_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 40, 20));

        lab_cls_count.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lab_cls_count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_cls_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 110, 40, 20));

        lab_att_count.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lab_att_count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_att_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 40, 20));

        lab_inv_count.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lab_inv_count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_inv_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 40, 20));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 70, 210, 90));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 210, 90));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 210, 90));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 210, 90));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("CARD");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 630, 70, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("CASH");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 630, 70, -1));

        txt_csw_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_csw_itemActionPerformed(evt);
            }
        });
        txt_csw_item.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_csw_itemKeyReleased(evt);
            }
        });
        jPanel4.add(txt_csw_item, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 220, 30));

        jLabel33.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("DISCOUNT");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 580, -1, 30));

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, 140, 35));

        jLabel43.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("TOTAL");
        jPanel4.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 580, -1, 30));

        jTextField2.setEditable(false);
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, 150, 35));

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

    private void txt_csw_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_csw_idActionPerformed
        try {
            ResultSet rs1 = Database.getData("SELECT std_id, std_fname, std_mname, std_lname FROM Student WHERE std_rfid = '" + txt_csw_id.getText() + "' OR std_mobile = '" + txt_csw_id.getText() + "' OR std_home = '" + txt_csw_id.getText() + "'");
            if (rs1.next()) {
                txt_csw_name.setText(rs1.getString("std_fname") + " " + rs1.getString("std_mname") + " " + rs1.getString("std_lname"));
                txt_csw_pos.setText("STUDENT");
                holderID = Integer.parseInt(rs1.getString("std_id"));
            }
            ResultSet rs2 = Database.getData("SELECT emp_id, emp_fname, emp_lname, emp_mname, emp_position FROM Employee WHERE emp_rfid = '" + txt_csw_id.getText() + "' OR emp_nic = '" + txt_csw_id.getText() + "' OR emp_mobile = '" + txt_csw_id.getText() + "' OR emp_home = '" + txt_csw_id.getText() + "'");
            if (rs2.next()) {
                txt_csw_name.setText(rs2.getString("emp_fname") + " " + rs2.getString("emp_mname") + " " + rs2.getString("emp_lname"));
                txt_csw_pos.setText(rs2.getString("emp_position"));
                holderID = Integer.parseInt(rs1.getString("emp_id"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txt_csw_idActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        cb_csw_card.setEnabled(true);
        txt_csw_cno.setEnabled(true);
        txt_csw_refno.setEnabled(true);
        payType = "CARD";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        cb_csw_card.setEnabled(false);
        txt_csw_cno.setEnabled(false);
        txt_csw_refno.setEnabled(false);
        payType = "CASH";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void txt_csw_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_csw_qtyActionPerformed
        try {
            ResultSet rs1 = Database.getData("SELECT ite_quantity FROM Item WHERE ite_name = '" + txt_csw_item.getText() + "'");
            if (rs1.next()) {
                double qty = Double.parseDouble(rs1.getString("ite_quantity"));
                double iqty = Double.parseDouble(txt_csw_qty.getText());
                if (qty >= Systemcontroller.rop && (iqty <= qty && iqty >= Systemcontroller.rop)) {
                    System.out.println("hello");
                } else {
                    if (iqty <= Systemcontroller.rop) {
                        if (Systemcontroller.ropLevelInvoice == true) {
                            System.out.println("stock release!");
                        } else {
                            System.out.println("Cannot release stock!");
                        }
                    } else if (iqty >= qty) {
                        System.out.println("not enough stock!");
                    }
                }
            }
            txt_csw_unutDis.grabFocus();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txt_csw_qtyActionPerformed

    private void txt_csw_unutDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_csw_unutDisActionPerformed
        try {
            double price = 0;
            ResultSet rs1 = Database.getData("SELECT ite_unit_price FROM Item WHERE ite_name = '" + txt_csw_item.getText() + "'");
            if (rs1.next()) {
                price = Double.parseDouble(rs1.getString("ite_unit_price"));
            }
            double qty = Double.parseDouble(txt_csw_qty.getText());
            double dis = Double.parseDouble(txt_csw_unutDis.getText());
            double totalPrice = qty * price;
            double discount = (totalPrice * dis) / 100;
            double disIncludePrice = totalPrice - discount;
            DefaultTableModel dtm = (DefaultTableModel) tab_csw_preview.getModel();
            Vector v = new Vector();
            v.add(txt_csw_item.getText());
            v.add(txt_csw_qty.getText());
            v.add(totalPrice);
            v.add(discount);
            v.add(disIncludePrice);
            dtm.addRow(v);
            double newTotalPrice = 0.0;
            int newTotalQuaty = 0;
            for (int i = 0; i < dtm.getRowCount(); i++) {
                newTotalPrice += Double.parseDouble(dtm.getValueAt(i, 4).toString());
                newTotalQuaty += Integer.parseInt(dtm.getValueAt(i, 1).toString());
            }
            jTextField2.setText(newTotalQuaty + "");
            jTextField1.setText(newTotalPrice + "");
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_txt_csw_unutDisActionPerformed

    private void txt_csw_fdisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_csw_fdisActionPerformed
        double ediscount = Double.parseDouble(txt_csw_fdis.getText());
        double total = Double.parseDouble(jTextField1.getText());
        double disIncludePrice = total - ((total * ediscount) / 100);
        if (ediscount == 0) {
            txt_csw_fdis.setText(0 + "");
            txt_csw_nprice.setText(total + "");
        } else {
            txt_csw_nprice.setText(disIncludePrice + "");
        }
    }//GEN-LAST:event_txt_csw_fdisActionPerformed

    private void txt_csw_pmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_csw_pmtActionPerformed
        double nPrice = Double.parseDouble(txt_csw_nprice.getText());
        double payment = Double.parseDouble(txt_csw_pmt.getText());
        if (payment <= nPrice) {
            double bal = Math.abs(payment - nPrice);
            txt_csw_balance.setText(0 + "");
            txt_csw_due.setText(bal + "");
        } else if (payment >= nPrice) {
            double bal = Math.abs(payment - nPrice);
            txt_csw_balance.setText(bal + "");
            txt_csw_due.setText(0 + "");
        }
    }//GEN-LAST:event_txt_csw_pmtActionPerformed

    private void btn_csw_teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_csw_teacherActionPerformed
        TeacherList tli = new TeacherList();
        tli.setVisible(true);
    }//GEN-LAST:event_btn_csw_teacherActionPerformed

    private void btn_csw_ttableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_csw_ttableActionPerformed
        ClassSchedule csc = new ClassSchedule();
        csc.setVisible(true);
    }//GEN-LAST:event_btn_csw_ttableActionPerformed

    private void btn_csw_tinvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_csw_tinvoiceActionPerformed
        InvoicePreview ivp = new InvoicePreview();
        ivp.setVisible(true);
    }//GEN-LAST:event_btn_csw_tinvoiceActionPerformed

    private void btn_csw_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_csw_paymentActionPerformed
        PaymentWizarrd pmw = new PaymentWizarrd();
        pmw.setVisible(true);
    }//GEN-LAST:event_btn_csw_paymentActionPerformed

    private void btn_csw_attendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_csw_attendanceActionPerformed
        AttendanceAnalytics aaa = new AttendanceAnalytics();
        aaa.setVisible(true);
    }//GEN-LAST:event_btn_csw_attendanceActionPerformed

    private void btn_csw_billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_csw_billActionPerformed
        try {
            SimpleDateFormat sdfD = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sdfT = new SimpleDateFormat("hh:mm:ss");
            DefaultTableModel dtm = (DefaultTableModel) tab_csw_preview.getModel();
            //To get Item Count
            int itemQty = 0;
            for (int i = 0; i < dtm.getRowCount(); i++) {
                itemQty += Integer.parseInt(dtm.getValueAt(i, 1).toString());
            }
            double countedNetTotal = Double.parseDouble(jTextField1.getText());
            double fdiscount = Double.parseDouble(txt_csw_fdis.getText());
            double payment = Double.parseDouble(txt_csw_pmt.getText());
            double netprice = Double.parseDouble(txt_csw_nprice.getText());
            double balance = Double.parseDouble(txt_csw_balance.getText());
            double duebalance = Double.parseDouble(txt_csw_due.getText());
            int invoice = 0;
            //This is used to insert data into invoice table
            //inv_isu_date, inv_isu_time, inv_sub_total, inv_discount, inv_ite_qty, inv_net_total, use_id
            Database.sendData("INSERT INTO Invoice(inv_isu_date, inv_isu_time, inv_sub_total, inv_discount, inv_ite_qty, inv_net_total, use_id) "
                    + "VALUES('" + sdfD.format(new Date()) + "', '" + sdfT.format(new Date()) + "', '" + countedNetTotal + "', '" + fdiscount + "', '" + itemQty + "', '" + netprice + "', '" + user + "')");
            //Get invoice id from invoice Table
            ResultSet rs = Database.getData("SELECT inv_id FROM Invoice WHERE inv_isu_date = '" + sdfD.format(new Date()) + "' AND inv_sub_total = '" + countedNetTotal + "' AND inv_discount = '" + fdiscount + "' AND inv_ite_qty = '" + itemQty + "' AND inv_net_total = '" + netprice + "'AND use_id = '" + user + "'");
            if (rs.next()) {
                invoice = Integer.parseInt(rs.getString("inv_id"));
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    Database.sendData("INSERT INTO invoiceItem (ite_id, inv_id, ivi_qty, ivi_sub_total, ivi_discount, ivi_net_total) "
                            + "VALUES((SELECT ite_id FROM Item WHERE ite_name = '" + dtm.getValueAt(i, 0) + "'), '" + invoice + "', '" + Integer.parseInt(dtm.getValueAt(i, 1).toString()) + "', '" + Double.parseDouble(dtm.getValueAt(i, 2).toString()) + "','" + Double.parseDouble(dtm.getValueAt(i, 3).toString()) + "', '" + Double.parseDouble(dtm.getValueAt(i, 4).toString()) + "')");
                }
            }
            //Bill eka hadanna
            int billId = 0;
            Database.sendData("INSERT INTO Bill(bil_time, bil_date, bil_total, bil_discount, bil_nettotal) "
                    + "VALUES('" + sdfT.format(new Date()) + "', '" + sdfD.format(new Date()) + "', '" + countedNetTotal + "', '" + fdiscount + "', '" + netprice + "')");
            ResultSet rs1 = Database.getData("SELECT bil_id FROM Bill WHERE bil_date = '" + sdfD.format(new Date()) + "' AND bil_total = '" + countedNetTotal + "' AND bil_discount = '" + fdiscount + "' AND bil_nettotal = '" + netprice + "'");
            if (rs1.next()) {
                billId = rs1.getInt("bil_id");
            }
            //Invoice payment eka hadanna
            Database.sendData("INSERT INTO invoicePayment (inp_time, inp_date, inp_amount, bil_id, inv_id) "
                    + "VALUES('" + sdfT.format(new Date()) + "', '" + sdfD.format(new Date()) + "', '" + Double.parseDouble(txt_csw_pmt.getText()) + "', '" + billId + "' , '" + invoice + "')");
            //Bill Payment eka hadanna
            Database.sendData("INSERT INTO billPayment (blp_time, blp_date, blp_payment, blp_balance, blp_due, blp_pmtmethod, blp_card, blp_card_no, blp_ref_no, std_id, bil_id) "
                    + "VALUES('" + sdfT.format(new Date()) + "', '" + sdfD.format(new Date()) + "', '" + Double.parseDouble(txt_csw_pmt.getText()) + "', '" + Double.parseDouble(txt_csw_balance.getText()) + "', '" + Double.parseDouble(txt_csw_due.getText()) + "', '" + payType + "', '" + cb_csw_card.getSelectedItem() + "', '" + txt_csw_cno.getText() + "','" + txt_csw_refno.getText() + "','" + holderID + "', '" + billId + "')");
            int option = JOptionPane.showConfirmDialog(null, Message.DOYOUNEEDBILL);
            if (option == 0) {
                printBill(invoice);
            } else if (option == 1) {
                JOptionPane.showMessageDialog(null, "PAYMENT SUCCESSFULL!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_csw_billActionPerformed

    private void txt_csw_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_csw_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_csw_itemActionPerformed

    private void txt_csw_itemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_csw_itemKeyReleased
        jList1.setVisible(true);
        jScrollPane2.setVisible(true);
        try {
            ResultSet rs = Database.getData("SELECT ite_name FROM Item WHERE ite_name LIKE '" + txt_csw_item.getText() + "%' ");
            Vector v = new Vector();
            while (rs.next()) {
                v.add(rs.getString("ite_name"));
            }
            jList1.setListData(v);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txt_csw_itemKeyReleased

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        try {
            ResultSet rs1 = Database.getData("SELECT ite_unit_price FROM Item WHERE ite_name = '" + jList1.getSelectedValue() + "'");
            if (rs1.next()) {
                txt_csw_price.setText(rs1.getString("ite_unit_price"));
                txt_csw_item.setText(jList1.getSelectedValue());
                jList1.setVisible(false);
                jScrollPane2.setVisible(false);
            }
            txt_csw_qty.grabFocus();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void txt_csw_refnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_csw_refnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_csw_refnoActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
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
    }//GEN-LAST:event_jLabel44MouseClicked

    private void jLabel44MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseEntered

    }//GEN-LAST:event_jLabel44MouseEntered

    private void jLabel44MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseExited

    }//GEN-LAST:event_jLabel44MouseExited

    private void txt_csw_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_csw_idKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_csw_idKeyTyped

    private void txt_csw_qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_csw_qtyKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_csw_qtyKeyTyped

    private void txt_csw_unutDisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_csw_unutDisKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || (evt.getKeyChar() == '.')) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_csw_unutDisKeyTyped

    private void txt_csw_fdisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_csw_fdisKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || (evt.getKeyChar() == '.')) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_csw_fdisKeyTyped

    private void txt_csw_pmtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_csw_pmtKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || (evt.getKeyChar() == '.')) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_csw_pmtKeyTyped

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
            java.util.logging.Logger.getLogger(CashierWizard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierWizard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierWizard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierWizard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierWizard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_csw_attendance;
    private javax.swing.JButton btn_csw_bill;
    private javax.swing.JButton btn_csw_payment;
    private javax.swing.JButton btn_csw_remove;
    private javax.swing.JButton btn_csw_teacher;
    private javax.swing.JButton btn_csw_tinvoice;
    private javax.swing.JButton btn_csw_ttable;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_csw_card;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lab_att_avt;
    private javax.swing.JLabel lab_att_count;
    private javax.swing.JLabel lab_cls_avt;
    private javax.swing.JLabel lab_cls_count;
    private javax.swing.JLabel lab_inv_avt;
    private javax.swing.JLabel lab_inv_count;
    private javax.swing.JLabel lab_pmt_avt;
    private javax.swing.JLabel lab_pmt_count;
    private javax.swing.JTable tab_csw_preview;
    private javax.swing.JTextField txt_csw_balance;
    private javax.swing.JTextField txt_csw_cno;
    private javax.swing.JTextField txt_csw_due;
    private javax.swing.JTextField txt_csw_fdis;
    private javax.swing.JTextField txt_csw_id;
    private javax.swing.JTextField txt_csw_item;
    private javax.swing.JTextField txt_csw_name;
    private javax.swing.JTextField txt_csw_nprice;
    private javax.swing.JTextField txt_csw_pmt;
    private javax.swing.JTextField txt_csw_pos;
    private javax.swing.JTextField txt_csw_price;
    private javax.swing.JTextField txt_csw_qty;
    private javax.swing.JTextField txt_csw_refno;
    private javax.swing.JTextField txt_csw_unutDis;
    // End of variables declaration//GEN-END:variables

    private void fetchCountsToLable() {
        try {
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sdf2 = new SimpleDateFormat("DDDD");
            ResultSet rs1 = Database.getData("SELECT COUNT(inv_id) AS invoiceCount FROM Invoice WHERE inv_isu_date = '" + sdf1.format(new Date()) + "'");
            if (rs1.next()) {
                lab_inv_count.setText(rs1.getInt("invoiceCount") + "");
            }
            ResultSet rs2 = Database.getData("SELECT COUNT(sta_id) AS attendaceCount FROM studentAttendance WHERE sta_date = '" + sdf1.format(new Date()) + "'");
            if (rs2.next()) {
                lab_att_count.setText(rs2.getInt("attendaceCount") + "");
            }
            ResultSet rs3 = Database.getData("SELECT COUNT(blp_id) AS studentPayment FROM billPayment WHERE blp_date = '" + sdf1.format(new Date()) + "'");
            if (rs3.next()) {
                lab_pmt_count.setText(rs3.getInt("studentPayment") + "");
            }
            ResultSet rs4 = Database.getData("SELECT COUNT(cls_id) AS classCount FROM Class");
            if (rs4.next()) {
                lab_cls_count.setText(rs4.getInt("classCount") + "");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void printBill(int invoice) {
        SimpleDateFormat sdfD = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdfT = new SimpleDateFormat("hh-mm-ss");
        String username = "";
        try {
            ResultSet rs = Database.getData("SELECT use_username FROM User WHERE use_id = '" + user + "'");
            if (rs.next()) {
                username = rs.getString("use_username");
            }
            String path = "D://MYPROJECT//CAMBRIDGE_NEW_VERSION_1_0//src//com//prog//cnv//sys//report//Invoice.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap<String, Object> m = new HashMap<>();
            m.put("cashier", username);
            m.put("student", txt_csw_name.getText().toString());
            m.put("paymenttype", payType);
            m.put("invoice", invoice + "");
            m.put("date", sdfD.format(new Date()) + "");
            m.put("time", sdfT.format(new Date()) + "");
            m.put("total", jTextField1.getText().toString());
            m.put("quantity", jTextField2.getText().toString());
            m.put("discount", txt_csw_fdis.getText().toString());
            m.put("nettotal", txt_csw_nprice.getText().toString());
            JasperPrint jp = JasperFillManager.fillReport(jr, m, Database.getConnection());
            ReportViewer rv = new ReportViewer(jp);
            rv.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "PRINTING ERROR!");
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
                jLabel45.setText(date);
                sdf = new SimpleDateFormat("hh:mm:ss");
                time = sdf.format(d);
                jLabel46.setText(time);
            }
        });
        t.start();
    }

}
