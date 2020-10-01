package com.prog.cnv.sys.control.system.student.StudentManagement;

import com.prog.cnv.sys.control.system.control.Database;
import com.prog.cnv.sys.control.system.control.Message;
import com.prog.cnv.sys.control.system.student.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UpdateStudentSchedule extends javax.swing.JFrame {

    private double totalAdmission;
    private double totalClassFee;
    String pmethod;
    String rfid;
    int user;

    public UpdateStudentSchedule() {
        initComponents();
        txt_uss_amountofpmt.setEnabled(false);
        txt_uss_fee.setEnabled(false);
        txt_uss_ntot.setEnabled(false);
        cb_uss_card.setEnabled(false);
        txt_uss_cno.setEnabled(false);
        txt_uss_refno.setEnabled(false);
        fetchDataToComboBox();
        fetchDataToBelowTable();
    }

    public UpdateStudentSchedule(String userFlag) {
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        cb_uss_subject = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        cb_uss_card = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        txt_uss_grade = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txt_uss_student = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txt_uss_school = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btn_uss_search = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_uss_fcs = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        txt_uss_ntot = new javax.swing.JTextField();
        txt_uss_cno = new javax.swing.JTextField();
        txt_uss_fee = new javax.swing.JTextField();
        txt_uss_amountofpmt = new javax.swing.JTextField();
        txt_uss_refno = new javax.swing.JTextField();
        txt_uss_pmt = new javax.swing.JTextField();
        txt_uss_bala = new javax.swing.JTextField();
        cb_uss_teacher = new javax.swing.JComboBox<>();
        jrb_uss_cash = new javax.swing.JRadioButton();
        jrb_uss_card = new javax.swing.JRadioButton();
        btn_uss_bill = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tab_uss_ssub = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tab_uss_rclass = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tab_uss_cpreview = new javax.swing.JTable();
        txt_uss_conna = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

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

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Update Student Schedule");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

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

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 15, 110, 15));

        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 110, 15));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, 1370, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 350, 220, 10));

        jLabel31.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel31.setText("SUBJECT");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 30));

        jLabel32.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel32.setText("STUDENT");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        cb_uss_subject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cb_uss_subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_uss_subjectActionPerformed(evt);
            }
        });
        jPanel4.add(cb_uss_subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 160, 30));

        jLabel33.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel33.setText("TEACHER");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, 30));

        cb_uss_card.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel4.add(cb_uss_card, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, 160, 30));

        jLabel34.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel34.setText("AGE");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 40, 30));

        txt_uss_grade.setEditable(false);
        jPanel4.add(txt_uss_grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 50, 30));

        jLabel35.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel35.setText("CONTACT");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, 30));

        txt_uss_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_uss_studentActionPerformed(evt);
            }
        });
        txt_uss_student.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_uss_studentKeyTyped(evt);
            }
        });
        jPanel4.add(txt_uss_student, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 190, 30));

        jLabel36.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel36.setText("AMOUNT");
        jPanel4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 330, -1, 30));

        txt_uss_school.setEditable(false);
        jPanel4.add(txt_uss_school, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 210, 30));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 10, 690));

        btn_uss_search.setText("FIND");
        btn_uss_search.setBorder(null);
        btn_uss_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uss_searchActionPerformed(evt);
            }
        });
        jPanel4.add(btn_uss_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 60, 30));

        jLabel30.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel30.setText("CLASS PREVIEW");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel4.setText("SCHEDULED SUBJECT");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 360, -1, -1));

        tab_uss_fcs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student", "Teacher", "Subject", "Class", "Day", "Start time", "End time", "Grade", "Fee", "Payment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab_uss_fcs.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                tab_uss_fcsComponentResized(evt);
            }
        });
        jScrollPane2.setViewportView(tab_uss_fcs);
        if (tab_uss_fcs.getColumnModel().getColumnCount() > 0) {
            tab_uss_fcs.getColumnModel().getColumn(0).setResizable(false);
            tab_uss_fcs.getColumnModel().getColumn(1).setResizable(false);
            tab_uss_fcs.getColumnModel().getColumn(2).setResizable(false);
            tab_uss_fcs.getColumnModel().getColumn(3).setResizable(false);
            tab_uss_fcs.getColumnModel().getColumn(4).setResizable(false);
            tab_uss_fcs.getColumnModel().getColumn(5).setResizable(false);
            tab_uss_fcs.getColumnModel().getColumn(6).setResizable(false);
            tab_uss_fcs.getColumnModel().getColumn(7).setResizable(false);
            tab_uss_fcs.getColumnModel().getColumn(8).setResizable(false);
            tab_uss_fcs.getColumnModel().getColumn(9).setResizable(false);
        }

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 1110, 210));

        jLabel37.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("FINAL CLASS SCHEDULE");
        jPanel4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 40));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1110, 10));

        jLabel38.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("AMOUNT");
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, -1, 20));

        jLabel39.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("FEE");
        jPanel4.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 590, -1, 20));

        jLabel29.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("DISCOUNT");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 590, -1, 20));

        jLabel40.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("METHOD");
        jPanel4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, -1, 20));

        jLabel44.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("BALANCE");
        jPanel4.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 670, -1, 20));

        jLabel45.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("PAYMENT");
        jPanel4.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, -1, 20));

        jLabel46.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("CARD");
        jPanel4.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 630, -1, -1));

        jLabel47.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("DUE AMOUNT");
        jPanel4.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 670, -1, 20));

        jLabel48.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("REF NO");
        jPanel4.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 630, -1, -1));

        txt_uss_ntot.setEditable(false);
        txt_uss_ntot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_uss_ntot.setText("0");
        jPanel4.add(txt_uss_ntot, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 590, 160, 30));
        jPanel4.add(txt_uss_cno, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 630, 130, 30));

        txt_uss_fee.setEditable(false);
        txt_uss_fee.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_uss_fee.setText("0");
        jPanel4.add(txt_uss_fee, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 590, 160, 30));

        txt_uss_amountofpmt.setEditable(false);
        txt_uss_amountofpmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_uss_amountofpmt.setText("0");
        jPanel4.add(txt_uss_amountofpmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, 160, 30));
        jPanel4.add(txt_uss_refno, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 630, 160, 30));

        txt_uss_pmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_uss_pmt.setText("0");
        txt_uss_pmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_uss_pmtActionPerformed(evt);
            }
        });
        txt_uss_pmt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_uss_pmtKeyTyped(evt);
            }
        });
        jPanel4.add(txt_uss_pmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 670, 160, 30));

        txt_uss_bala.setEditable(false);
        txt_uss_bala.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_uss_bala.setText("0");
        jPanel4.add(txt_uss_bala, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 670, 160, 30));

        cb_uss_teacher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel4.add(cb_uss_teacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 180, 30));

        jrb_uss_cash.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jrb_uss_cash);
        jrb_uss_cash.setText("CASH");
        jrb_uss_cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_uss_cashActionPerformed(evt);
            }
        });
        jPanel4.add(jrb_uss_cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 80, -1));

        jrb_uss_card.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jrb_uss_card);
        jrb_uss_card.setText("CARD");
        jrb_uss_card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_uss_cardActionPerformed(evt);
            }
        });
        jPanel4.add(jrb_uss_card, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 630, 70, -1));

        btn_uss_bill.setText("BILL");
        btn_uss_bill.setBorder(null);
        btn_uss_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uss_billActionPerformed(evt);
            }
        });
        jPanel4.add(btn_uss_bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 60, 170, 40));

        tab_uss_ssub.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject", "Type", "State"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tab_uss_ssub);
        if (tab_uss_ssub.getColumnModel().getColumnCount() > 0) {
            tab_uss_ssub.getColumnModel().getColumn(0).setResizable(false);
            tab_uss_ssub.getColumnModel().getColumn(1).setResizable(false);
            tab_uss_ssub.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 390, 220, 310));

        tab_uss_rclass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject", "Teacher", "Class", "Day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tab_uss_rclass);
        if (tab_uss_rclass.getColumnModel().getColumnCount() > 0) {
            tab_uss_rclass.getColumnModel().getColumn(0).setResizable(false);
            tab_uss_rclass.getColumnModel().getColumn(1).setResizable(false);
            tab_uss_rclass.getColumnModel().getColumn(2).setResizable(false);
            tab_uss_rclass.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 50, 220, 280));

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel6.setText("REGISTERED CLASS");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, -1, 30));

        tab_uss_cpreview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher", "Subject", "Class", "Day", "Start time", "End time", "Fee", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tab_uss_cpreview);
        if (tab_uss_cpreview.getColumnModel().getColumnCount() > 0) {
            tab_uss_cpreview.getColumnModel().getColumn(0).setResizable(false);
            tab_uss_cpreview.getColumnModel().getColumn(1).setResizable(false);
            tab_uss_cpreview.getColumnModel().getColumn(2).setResizable(false);
            tab_uss_cpreview.getColumnModel().getColumn(3).setResizable(false);
            tab_uss_cpreview.getColumnModel().getColumn(4).setResizable(false);
            tab_uss_cpreview.getColumnModel().getColumn(5).setResizable(false);
            tab_uss_cpreview.getColumnModel().getColumn(6).setResizable(false);
            tab_uss_cpreview.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel4.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1110, 190));

        txt_uss_conna.setEditable(false);
        jPanel4.add(txt_uss_conna, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 160, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Delete_Row_20px.png"))); // NOI18N
        jButton2.setToolTipText("REMOVE");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 50, 40));

        jLabel42.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("NET TOTAL");
        jPanel4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 590, -1, 20));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 590, 130, 30));

        jLabel49.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("NO");
        jPanel4.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 630, -1, 20));

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setText("0");
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 670, 130, 30));

        jLabel43.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel43.setText("SCHOOL");
        jPanel4.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, 30));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 330, 140, 30));

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

    private void txt_uss_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_uss_studentActionPerformed
        try {
            SimpleDateFormat sdfY = new SimpleDateFormat("yyyy");
            ResultSet rs1 = Database.getData("SELECT std_id, std_fname, std_mname, std_lname, std_dob, std_school, std_mobile, std_home, std_par_home, std_par_mobile, std_image FROM Student WHERE std_rfid = '" + txt_uss_student.getText() + "' OR std_mobile = '" + txt_uss_student.getText() + "' OR std_home= '" + txt_uss_student.getText() + "' OR std_par_home = '" + txt_uss_student.getText() + "' OR std_par_mobile = '" + txt_uss_student.getText() + "'");
            if (rs1.next()) {
                rfid = txt_uss_student.getText();
                txt_uss_student.setText(rs1.getString("std_fname") + " " + rs1.getString("std_mname") + " " + rs1.getString("std_lname"));
                txt_uss_grade.setText((Integer.parseInt(sdfY.format(new Date())) - Integer.parseInt(sdfY.format(rs1.getDate("std_dob")))) + "");
                if (!rs1.getString("std_mobile").isEmpty()) {
                    txt_uss_conna.setText(rs1.getString("std_mobile"));
                } else if (!rs1.getString("std_home").isEmpty()) {
                    txt_uss_conna.setText(rs1.getString("std_home"));
                } else if (!rs1.getString("std_par_home").isEmpty()) {
                    txt_uss_conna.setText(rs1.getString("std_par_home"));
                } else if (!rs1.getString("std_par_mobile").isEmpty()) {
                    txt_uss_conna.setText(rs1.getString("std_par_mobile"));
                } else {
                    txt_uss_conna.setText("No Contact no!");
                }
                txt_uss_school.setText(rs1.getString("std_school"));
            }
            fetchDataToTable(rs1.getString("std_id"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txt_uss_studentActionPerformed

    private void cb_uss_subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_uss_subjectActionPerformed
        try {
            ResultSet rs = Database.getData("SELECT `employee`.`emp_fname`, `employee`.`emp_mname`, `employee`.`emp_lname`\n"
                    + "FROM `cambridge_project`.`class` INNER JOIN `cambridge_project`.`employee` ON (`class`.`emp_id` = `employee`.`emp_id`)\n"
                    + "INNER JOIN `cambridge_project`.`subject` ON (`class`.`sub_id` = `subject`.`sub_id`) WHERE `subject`.`sub_name`= '" + cb_uss_subject.getSelectedItem() + "'");
            cb_uss_teacher.removeAllItems();
            while (rs.next()) {
                cb_uss_teacher.addItem(rs.getString("emp_fname") + " " + rs.getString("emp_mname") + " " + rs.getString("emp_lname"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_cb_uss_subjectActionPerformed

    private void btn_uss_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uss_searchActionPerformed
        try {
            String tecName[] = cb_uss_teacher.getSelectedItem().toString().split(" ");
            ResultSet rs = Database.getData("SELECT `employee`.`emp_fname`, `employee`.`emp_mname`, `employee`.`emp_lname`, `subject`.`sub_name`, `classtype`.`clt_type`\n"
                    + ", `day`.`day_name`, `classscheduleday`.`csd_start_time`, `classscheduleday`.`csd_end_time`, `class`.`cls_fee`, `class`.`cls_grade` FROM\n"
                    + "`cambridge_project`.`classscheduleday` INNER JOIN `cambridge_project`.`day` ON (`classscheduleday`.`day_id` = `day`.`day_id`)\n"
                    + "INNER JOIN `cambridge_project`.`class` ON (`classscheduleday`.`cls_id` = `class`.`cls_id`) INNER JOIN `cambridge_project`.`employee` \n"
                    + "ON (`class`.`emp_id` = `employee`.`emp_id`) INNER JOIN `cambridge_project`.`subject` ON (`class`.`sub_id` = `subject`.`sub_id`)\n"
                    + "INNER JOIN `cambridge_project`.`classtype` ON (`class`.`clt_id` = `classtype`.`clt_id`) WHERE `class`.`cls_state` = '1' AND \n"
                    + "`employee`.`emp_fname` = '" + tecName[0] + "' AND `employee`.`emp_mname` = '" + tecName[1] + "' AND `employee`.`emp_lname` = '" + tecName[2] + "' AND `subject`.`sub_name` = '" + cb_uss_subject.getSelectedItem() + "'");
            DefaultTableModel dtm = (DefaultTableModel) tab_uss_cpreview.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("emp_fname") + " " + rs.getString("emp_mname") + " " + rs.getString("emp_lname"));
                v.add(rs.getString("sub_name"));
                v.add(rs.getString("clt_type"));
                v.add(rs.getString("day_name"));
                v.add(rs.getString("csd_start_time"));
                v.add(rs.getString("csd_end_time"));
                v.add(rs.getString("cls_fee"));
                v.add(rs.getString("cls_grade"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_uss_searchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tab_uss_fcs.getModel();
        int selectedRwow = tab_uss_fcs.getSelectedRow();
        double ntotal = Double.parseDouble(dtm.getValueAt(selectedRwow, 8).toString());
        double fee = Double.parseDouble(dtm.getValueAt(selectedRwow, 7).toString());
        double newTotal = Double.parseDouble(txt_uss_ntot.getText()) - ntotal;
        totalClassFee -= fee;
        txt_uss_amountofpmt.setText(totalAdmission + "");
        txt_uss_fee.setText(totalClassFee + "");
        txt_uss_ntot.setText(newTotal + "");
        dtm.removeRow(selectedRwow);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tab_uss_fcsComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tab_uss_fcsComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_tab_uss_fcsComponentResized

    private void txt_uss_pmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_uss_pmtActionPerformed
        double payment = Double.parseDouble(txt_uss_pmt.getText());
        double netTotal = Double.parseDouble(txt_uss_ntot.getText());
        if (payment > netTotal) {
            double fowardPayment = payment - netTotal;
            txt_uss_bala.setText(fowardPayment + "");
        } else if (payment == netTotal) {
            //This is equal full payment
            txt_uss_bala.setText(0 + "");
        } else if (payment < netTotal) {
            double duepayment = netTotal - payment;
            jTextField2.setText(duepayment + "");
        }
    }//GEN-LAST:event_txt_uss_pmtActionPerformed

    private void jrb_uss_cardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_uss_cardActionPerformed
        cb_uss_card.setEnabled(true);
        txt_uss_cno.setEnabled(true);
        txt_uss_refno.setEnabled(true);
        pmethod = "CARD";
    }//GEN-LAST:event_jrb_uss_cardActionPerformed

    private void jrb_uss_cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_uss_cashActionPerformed
        cb_uss_card.setEnabled(false);
        txt_uss_cno.setEnabled(false);
        txt_uss_refno.setEnabled(false);
        pmethod = "CASH";
    }//GEN-LAST:event_jrb_uss_cashActionPerformed

    private void btn_uss_billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uss_billActionPerformed
        SimpleDateFormat sdfD = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdfT = new SimpleDateFormat("hh:mm:ss");
        try {
            //Generate Bil
            int bill = 0;
            Database.sendData("INSERT INTO Bill(bil_time, bil_date, bil_total, bil_discount, bil_nettotal) "
                    + "VALUES('" + sdfT.format(new Date()) + "', '" + sdfD.format(new Date()) + "', '" + Double.parseDouble(txt_uss_fee.getText()) + "', '" + Double.parseDouble(jTextField1.getText()) + "', '" + Double.parseDouble(txt_uss_ntot.getText()) + "')");
            ResultSet rs1 = Database.getData("SELECT bil_id FROM Bill WHERE bil_time = '" + sdfT.format(new Date()) + "' AND bil_date = '" + sdfD.format(new Date()) + "' AND bil_total = '" + Double.parseDouble(txt_uss_fee.getText()) + "' AND bil_discount = '" + Double.parseDouble(jTextField1.getText()) + "' AND bil_nettotal = '" + Double.parseDouble(txt_uss_ntot.getText()) + "'");
            if (rs1.next()) {
                bill = rs1.getInt("bil_id");
            }
            DefaultTableModel dtm = (DefaultTableModel) tab_uss_fcs.getModel();
            for (int i = 0; i < dtm.getRowCount(); i++) {
                int classID = 0;
                String teacher[] = dtm.getValueAt(i, 1).toString().split(" ");
                ResultSet rs2 = Database.getData("SELECT `class`.`cls_id` FROM `cambridge_project`.`classscheduleday` INNER JOIN `cambridge_project`.`class` \n"
                        + "ON (`classscheduleday`.`cls_id` = `class`.`cls_id`) INNER JOIN `cambridge_project`.`day` ON (`classscheduleday`.`day_id` = `day`.`day_id`)\n"
                        + "INNER JOIN `cambridge_project`.`classtype` ON (`class`.`clt_id` = `classtype`.`clt_id`) INNER JOIN `cambridge_project`.`subject` \n"
                        + "ON (`class`.`sub_id` = `subject`.`sub_id`) INNER JOIN `cambridge_project`.`employee` ON (`class`.`emp_id` = `employee`.`emp_id`)  WHERE \n"
                        + "`class`.`cls_grade` = '" + dtm.getValueAt(i, 7) + "' AND `class`.`cls_fee` = '" + dtm.getValueAt(i, 8) + "' AND `class`.`emp_id` = (SELECT emp_id FROM Employee WHERE emp_fname = '" + teacher[0] + "' \n"
                        + "AND emp_mname = '" + teacher[1] + "' AND emp_lname = '" + teacher[2] + "') AND `class`.`clt_id` = (SELECT clt_id FROM classType WHERE clt_type = '" + dtm.getValueAt(i, 3) + "') \n"
                        + "AND `day`.`day_id` = (SELECT day_id FROM DAY WHERE day_name = '" + dtm.getValueAt(i, 4) + "') AND `classscheduleday`.`csd_start_time` = '" + dtm.getValueAt(i, 5) + "' \n"
                        + "AND `classscheduleday`.`csd_end_time` = '" + dtm.getValueAt(i, 6) + "'");
                if (rs2.next()) {
                    classID = rs2.getInt("cls_id");
                }
                Database.sendData("INSERT INTO studentClass (cls_id, std_id, sdc_reg_date, sdc_reg_time) "
                        + "VALUES('" + classID + "', (SELECT std_id FROM Student WHERE std_rfid = '" + rfid + "'), '" + sdfD.format(new Date()) + "', '" + sdfT.format(new Date()) + "')");
                Database.sendData("INSERT INTO classPayment (clp_time, clp_date, clp_amount, clp_currentFee, bil_id, cls_id) "
                        + "VALUES('" + sdfT.format(new Date()) + "', '" + sdfD.format(new Date()) + "', '" + Double.parseDouble(dtm.getValueAt(i, 9).toString()) + "', '" + Double.parseDouble(dtm.getValueAt(i, 8).toString()) + "', '" + bill + "', '" + classID + "')");
            }
            String student[] = txt_uss_student.getText().split(" ");
            Database.sendData("INSERT INTO billpayment (blp_time, blp_date, blp_payment, blp_balance, blp_due, blp_pmtmethod, blp_card, blp_card_no, blp_ref_no, std_id, bil_id) "
                    + "VALUES('" + sdfT.format(new Date()) + "', '" + sdfD.format(new Date()) + "', '" + Double.parseDouble(txt_uss_pmt.getText()) + "', '" + Double.parseDouble(txt_uss_bala.getText()) + "', '" + Double.parseDouble(jTextField2.getText()) + "','" + pmethod + "', '" + cb_uss_card.getSelectedItem() + "', '" + txt_uss_cno.getText() + "', '" + txt_uss_refno.getText() + "', (SELECT std_id FROM Student WHERE std_rfid = '" + rfid + "'), '" + bill + "')");
            int option = JOptionPane.showConfirmDialog(null, Message.DOYOUNEEDBILL);
            if (option == 0) {
                printBill();
            } else if (option == 1) {
                JOptionPane.showMessageDialog(null, "PAYMENT SUCCESSFULL!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        sendStudentMessag();
        sendStudentEmail();
    }//GEN-LAST:event_btn_uss_billActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        DefaultTableModel dtm1 = (DefaultTableModel) tab_uss_cpreview.getModel();
        DefaultTableModel dtm2 = (DefaultTableModel) tab_uss_fcs.getModel();
        Vector v = new Vector();
        v.add(txt_uss_student.getText() + "");
        v.add(dtm1.getValueAt(tab_uss_cpreview.getSelectedRow(), 0));
        v.add(dtm1.getValueAt(tab_uss_cpreview.getSelectedRow(), 1));
        v.add(dtm1.getValueAt(tab_uss_cpreview.getSelectedRow(), 2));
        v.add(dtm1.getValueAt(tab_uss_cpreview.getSelectedRow(), 3));
        v.add(dtm1.getValueAt(tab_uss_cpreview.getSelectedRow(), 4));
        v.add(dtm1.getValueAt(tab_uss_cpreview.getSelectedRow(), 5));
        v.add(dtm1.getValueAt(tab_uss_cpreview.getSelectedRow(), 7));
        v.add(dtm1.getValueAt(tab_uss_cpreview.getSelectedRow(), 6));
        v.add(jTextField3.getText());
        dtm2.addRow(v);
        double totalFee = 0.0;
        double totalPayment = 0.0;
        for (int i = 0; i < dtm2.getRowCount(); i++) {
            totalFee += Double.parseDouble(dtm2.getValueAt(i, 8).toString());
            totalPayment += Double.parseDouble(dtm2.getValueAt(i, 9).toString());
        }
        txt_uss_fee.setText(totalFee + "");
        txt_uss_amountofpmt.setText(totalPayment + "");
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        double discount = Double.parseDouble(jTextField1.getText());
        double total = Double.parseDouble(txt_uss_fee.getText());
        double disnetprice = total - ((total * discount) / 100);
        txt_uss_ntot.setText(disnetprice + "");
    }//GEN-LAST:event_jTextField1ActionPerformed

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

    private void txt_uss_studentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_uss_studentKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_uss_studentKeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || (evt.getKeyChar() == '.')) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || (evt.getKeyChar() == '.')) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void txt_uss_pmtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_uss_pmtKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || (evt.getKeyChar() == '.')) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_uss_pmtKeyTyped

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
            java.util.logging.Logger.getLogger(UpdateStudentSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStudentSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_uss_bill;
    private javax.swing.JButton btn_uss_search;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_uss_card;
    private javax.swing.JComboBox<String> cb_uss_subject;
    private javax.swing.JComboBox<String> cb_uss_teacher;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JRadioButton jrb_uss_card;
    private javax.swing.JRadioButton jrb_uss_cash;
    private javax.swing.JTable tab_uss_cpreview;
    private javax.swing.JTable tab_uss_fcs;
    private javax.swing.JTable tab_uss_rclass;
    private javax.swing.JTable tab_uss_ssub;
    private javax.swing.JTextField txt_uss_amountofpmt;
    private javax.swing.JTextField txt_uss_bala;
    private javax.swing.JTextField txt_uss_cno;
    private javax.swing.JTextField txt_uss_conna;
    private javax.swing.JTextField txt_uss_fee;
    private javax.swing.JTextField txt_uss_grade;
    private javax.swing.JTextField txt_uss_ntot;
    private javax.swing.JTextField txt_uss_pmt;
    private javax.swing.JTextField txt_uss_refno;
    private javax.swing.JTextField txt_uss_school;
    private javax.swing.JTextField txt_uss_student;
    // End of variables declaration//GEN-END:variables

    private void fetchDataToComboBox() {
        try {
            ResultSet rs1 = Database.getData("SELECT DISTINCT sub_name FROM Subject WHERE sub_state = '1'");
            while (rs1.next()) {
                cb_uss_subject.addItem(rs1.getString("sub_name"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fetchDataToTable(String flag1) {
        try {
            Thread.sleep(10);
            ResultSet rs1 = Database.getData("SELECT DISTINCT `subject`.`sub_name`, `classtype`.`clt_type`, `employee`.`emp_fname`, `employee`.`emp_mname`, `employee`.`emp_lname`, `day`.`day_name`\n"
                    + "FROM `cambridge_project`.`class` INNER JOIN `cambridge_project`.`subject` ON (`class`.`sub_id` = `subject`.`sub_id`)\n"
                    + "INNER JOIN `cambridge_project`.`classtype` ON (`class`.`clt_id` = `classtype`.`clt_id`) INNER JOIN `cambridge_project`.`classscheduleday` \n"
                    + "ON (`classscheduleday`.`cls_id` = `class`.`cls_id`) INNER JOIN `cambridge_project`.`day` ON (`classscheduleday`.`day_id` = `day`.`day_id`)\n"
                    + "INNER JOIN `cambridge_project`.`employee` ON (`class`.`emp_id` = `employee`.`emp_id`) INNER JOIN `cambridge_project`.`studentclass` \n"
                    + "ON (`studentclass`.`cls_id` = `class`.`cls_id`) INNER JOIN `cambridge_project`.`student` ON (`studentclass`.`std_id` = `student`.`std_id`) \n"
                    + "WHERE `student`.`std_id` = '" + flag1 + "'");
            DefaultTableModel dtm1 = (DefaultTableModel) tab_uss_rclass.getModel();
            dtm1.setRowCount(0);
            while (rs1.next()) {
                Vector v = new Vector();
                v.add(rs1.getString("sub_name"));
                v.add(rs1.getString("emp_fname") + " " + rs1.getString("emp_mname") + " " + rs1.getString("emp_lname"));
                v.add(rs1.getString("clt_type"));
                v.add(rs1.getString("day_name"));
                dtm1.addRow(v);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fetchDataToBelowTable() {
        try {
            ResultSet rs2 = Database.getData("SELECT DISTINCT `subject`.`sub_name`, `subject`.`sub_state`, `subjecttype`.`sbt_type` FROM SUBJECT, `subjecttype` WHERE `subject`.`sbt_id` = `subjecttype`.`sbt_id`");
            DefaultTableModel dtm2 = (DefaultTableModel) tab_uss_ssub.getModel();
            dtm2.setRowCount(0);
            while (rs2.next()) {
                Vector v = new Vector();
                v.add(rs2.getString("sub_name"));
                v.add(rs2.getString("sbt_type"));
                v.add(rs2.getString("sub_state"));
                dtm2.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendStudentMessag() {

    }

    private void sendStudentEmail() {

    }

    private void printBill() {
        JOptionPane.showMessageDialog(null, "PAYMENT SUCCESSFULL!");
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
                jLabel41.setText(date);
                sdf = new SimpleDateFormat("hh:mm:ss");
                time = sdf.format(d);
                jLabel50.setText(time);
            }
        });
        t.start();
    }

}
