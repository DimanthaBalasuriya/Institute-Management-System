package com.prog.cnv.sys.control.system.student.Teacher;

import com.prog.cnv.sys.control.system.control.Database;
import com.prog.cnv.sys.control.system.control.Message;
import com.prog.cnv.sys.control.system.student.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author CHAMOD DIYAMANTHA BALASURIYA
 */
public class ScheduleClass extends javax.swing.JFrame {

    int user;

    public ScheduleClass() {
        initComponents();
        setDateAndTime();
        comboBoxValue();
        setDateToRightTable();
        fetchDataToLable();
        tab_scc_currentClass.setEnabled(false);
        tab_scc_schClass.setEnabled(false);
        jTable1.setEnabled(false);
    }

    public ScheduleClass(String user) {
        this();
        this.user = Integer.parseInt(user);
        System.out.println(user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cb_scc_teacher = new javax.swing.JComboBox<>();
        cb_scc_subject = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cb_scc_day = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txt_scc_fee = new javax.swing.JTextField();
        cb_scc_type = new javax.swing.JComboBox<>();
        btn_scc_schedule = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        cb_scc_subjecttype = new javax.swing.JComboBox<>();
        cb_scc_grade = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tab_scc_schClass = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tab_scc_currentClass = new javax.swing.JTable();
        txt_scc_comi = new javax.swing.JTextField();
        timePicker1 = new com.github.lgooddatepicker.components.TimePicker();
        timePicker2 = new com.github.lgooddatepicker.components.TimePicker();
        jLabel36 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lab_scc_count1 = new javax.swing.JLabel();
        lab_scc_count3 = new javax.swing.JLabel();
        lab_scc_count2 = new javax.swing.JLabel();
        lab_scc_avt = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lab_scc_expClass = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lab_scc_expiclass = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 110, 15));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, 1370, 30));

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
        jLabel5.setText("Class Scheduler");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1365, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SCHEDULE CLASS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 30));

        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Class");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, -1, -1));

        jLabel22.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Sub type");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        cb_scc_teacher.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        cb_scc_teacher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cb_scc_teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_scc_teacherActionPerformed(evt);
            }
        });
        jPanel1.add(cb_scc_teacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 250, 30));

        cb_scc_subject.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        cb_scc_subject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cb_scc_subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_scc_subjectActionPerformed(evt);
            }
        });
        jPanel1.add(cb_scc_subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, 180, 30));

        jLabel23.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Teacher");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel24.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("End date");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        cb_scc_day.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        cb_scc_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cb_scc_day.setEnabled(false);
        cb_scc_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_scc_dayActionPerformed(evt);
            }
        });
        jPanel1.add(cb_scc_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 130, 30));

        jLabel26.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Start time");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        jLabel27.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("End time");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, -1));

        jLabel29.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Day");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel30.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Fee");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel31.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Commision");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        txt_scc_fee.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        txt_scc_fee.setToolTipText("");
        txt_scc_fee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_scc_feeKeyTyped(evt);
            }
        });
        jPanel1.add(txt_scc_fee, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 210, 30));

        cb_scc_type.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        cb_scc_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel1.add(cb_scc_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 110, 30));

        btn_scc_schedule.setText("SCHEDULE");
        btn_scc_schedule.setBorder(null);
        btn_scc_schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_scc_scheduleActionPerformed(evt);
            }
        });
        jPanel1.add(btn_scc_schedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 620, 160, 40));

        jLabel32.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Subject");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

        cb_scc_subjecttype.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        cb_scc_subjecttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cb_scc_subjecttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_scc_subjecttypeActionPerformed(evt);
            }
        });
        jPanel1.add(cb_scc_subjecttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 180, 30));

        cb_scc_grade.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        cb_scc_grade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cb_scc_grade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_scc_gradeMouseClicked(evt);
            }
        });
        cb_scc_grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_scc_gradeActionPerformed(evt);
            }
        });
        jPanel1.add(cb_scc_grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 40, 110, 30));

        jLabel33.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Grade");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 40, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Current class");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 20));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("New Schedule class");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, 20));

        tab_scc_schClass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab_scc_schClass.setRowSelectionAllowed(false);
        jScrollPane3.setViewportView(tab_scc_schClass);
        if (tab_scc_schClass.getColumnModel().getColumnCount() > 0) {
            tab_scc_schClass.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 180, 300));

        tab_scc_currentClass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab_scc_currentClass.setRowSelectionAllowed(false);
        jScrollPane4.setViewportView(tab_scc_currentClass);
        if (tab_scc_currentClass.getColumnModel().getColumnCount() > 0) {
            tab_scc_currentClass.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 180, 310));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, 200, 690));

        txt_scc_comi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_scc_comiKeyTyped(evt);
            }
        });
        jPanel1.add(txt_scc_comi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 180, 30));

        timePicker1.setEnabled(false);
        jPanel1.add(timePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 190, 30));

        timePicker2.setEnabled(false);
        jPanel1.add(timePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 190, 30));

        jLabel36.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Room");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel25.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Floor");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 80, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 120, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 80, 110, 30));

        jButton2.setText("SCHEDULE");
        jButton2.setBorder(null);
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 190, 140, 35));

        jButton3.setText("SCHEDULE DATE");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 140, 150, 35));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DAY", "START TIME", "END TIME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setEnabled(false);
        jTable1.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 1140, 380));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 1140, 10));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 180, 35));

        lab_scc_count1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_scc_count1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lab_scc_count1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lab_scc_count1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 660, 20, 20));

        lab_scc_count3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_scc_count3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lab_scc_count3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lab_scc_count3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 660, 20, 20));

        lab_scc_count2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_scc_count2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lab_scc_count2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lab_scc_count2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 660, 20, 20));

        lab_scc_avt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_scc_avt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_training_70px_1.png"))); // NOI18N
        jPanel1.add(lab_scc_avt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 90, 80));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Total class");
        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 630, 90, -1));

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 270, 80));

        lab_scc_expClass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_scc_expClass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_class_70px.png"))); // NOI18N
        jPanel1.add(lab_scc_expClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 110, 80));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Total expired class");
        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 630, 140, 20));

        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 280, 80));

        lab_scc_expiclass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_scc_expiclass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_classroom_70px.png"))); // NOI18N
        jPanel1.add(lab_scc_expiclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 620, 90, 80));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Total expiring class");
        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 630, 140, 20));

        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 620, 270, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1365, 708));

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

    private void cb_scc_teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_scc_teacherActionPerformed
        //cls_id, cls_fee, cls_aFee, cls_grade, sub_id, clr_id, emp_id, clt_id, cls_reg_date, cls_reg_time, cls_state, use_id, cls_end_date, cls_pmt_comi
    }//GEN-LAST:event_cb_scc_teacherActionPerformed

    private void btn_scc_scheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_scc_scheduleActionPerformed
        try {
            SimpleDateFormat sdfD = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sdfT = new SimpleDateFormat("hh:mm:ss");
            Date d = jDateChooser1.getDate();
            String tecname[] = cb_scc_teacher.getSelectedItem().toString().split(" ");
            Database.sendData("INSERT INTO Class (cls_fee, cls_grade, sub_id, clr_id, emp_id, clt_id, cls_reg_date, cls_reg_time, use_id, cls_end_date, cls_pmt_comi) "
                    + "VALUES('" + Double.parseDouble(txt_scc_fee.getText()) + "', '" + cb_scc_grade.getSelectedItem() + "', (SELECT sub_id FROM Subject WHERE sub_name = '" + cb_scc_subject.getSelectedItem() + "' AND sbt_id = (SELECT sbt_id FROM subjectType WHERE sbt_type = '" + cb_scc_subjecttype.getSelectedItem() + "')),"
                    + "(SELECT clr_id FROM classRoom WHERE clr_no = '" + jComboBox1.getSelectedItem() + "' AND flr_id = (SELECT flr_id FROM Floor WHERE flr_no = '" + jComboBox2.getSelectedItem() + "')),(SELECT emp_id FROM Employee WHERE emp_fname = '" + tecname[0] + "' AND emp_mname = '" + tecname[1] + "' AND emp_lname = '" + tecname[2] + "'), (SELECT clt_id FROM classType WHERE clt_type = '" + cb_scc_type.getSelectedItem() + "'), '" + sdfD.format(new Date()) + "', '" + sdfT.format(new Date()) + "', '" + user + "', '" + sdfD.format(d) + "', '" + Double.parseDouble(txt_scc_comi.getText()) + "')");
            ResultSet rs1 = Database.getData("SELECT cls_id FROM Class WHERE cls_fee = '" + Double.parseDouble(txt_scc_fee.getText()) + "' AND cls_grade = '" + cb_scc_grade.getSelectedItem() + "' AND cls_reg_date = '" + sdfD.format(new Date()) + "' AND cls_end_date = '" + sdfD.format(d) + "'");
            if (rs1.next()) {
                int clas = rs1.getInt("cls_id");
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    Database.sendData("INSERT INTO classscheduleday(cls_id, day_id, csd_start_time, csd_end_time) "
                            + "VALUES('" + clas + "', (SELECT day_id FROM Day WHERE day_name = '" + dtm.getValueAt(i, 0) + "'), '" + dtm.getValueAt(i, 1) + "', '" + dtm.getValueAt(i, 2) + "')");
                }
            }
            JOptionPane.showMessageDialog(null, Message.SUCCESSFULLDATAINSERT);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_scc_scheduleActionPerformed

    private void cb_scc_subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_scc_subjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_scc_subjectActionPerformed

    private void cb_scc_subjecttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_scc_subjecttypeActionPerformed
        String subType = cb_scc_subjecttype.getSelectedItem().toString();
        String[] primary = {"1", "2", "3", "4", "5"};
        String[] secondary = {"6", "7", "8", "9", "10", "11", "OL", "AL"};
        String[] sportAndFiteness = {"No Grade"};
        String[] other = {"No Grade"};
        cb_scc_grade.removeAllItems();
        if (subType.equalsIgnoreCase("Primary")) {
            //cb_scc_grade.removeAllItems();
            for (int i = 0; i < primary.length; i++) {
                cb_scc_grade.addItem(primary[i]);
            }
        } else if (subType.equalsIgnoreCase("Secondary")) {
            //cb_scc_grade.removeAllItems();
            for (int i = 0; i < secondary.length; i++) {
                cb_scc_grade.addItem(secondary[i]);
            }
        } else if (subType.equals("Fitness and Sport")) {
            //cb_scc_grade.removeAllItems();
            for (int i = 0; i < sportAndFiteness.length; i++) {
                cb_scc_grade.addItem(sportAndFiteness[i]);
            }
        } else if (subType.equalsIgnoreCase(
                "Other")) {
            //cb_scc_grade.removeAllItems();
            for (int i = 0; i < other.length; i++) {
                cb_scc_grade.addItem(other[i]);
            }
        } else {
            System.out.println("No Subject grades in this type");
        }
        try {
            ResultSet rs2 = Database.getData("SELECT sub_name FROM Subject WHERE sbt_id = (SELECT sbt_id FROM subjectType WHERE sbt_type = '" + cb_scc_subjecttype.getSelectedItem() + "')");
            cb_scc_subject.removeAllItems();
            while (rs2.next()) {
                cb_scc_subject.addItem(rs2.getString("sub_name"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_cb_scc_subjecttypeActionPerformed

    private void cb_scc_gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_scc_gradeActionPerformed

    }//GEN-LAST:event_cb_scc_gradeActionPerformed

    private void cb_scc_gradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_scc_gradeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_scc_gradeMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cb_scc_day.setEnabled(true);
        timePicker1.setEnabled(true);
        timePicker2.setEnabled(true);
        jButton2.setEnabled(true);
        jTable1.setEnabled(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        Vector v = new Vector();
        v.add(cb_scc_day.getSelectedItem());
        v.add(timePicker1.getTime());
        v.add(timePicker2.getTime());
        dtm.addRow(v);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cb_scc_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_scc_dayActionPerformed

    }//GEN-LAST:event_cb_scc_dayActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        try {
            ResultSet rs1 = Database.getData("SELECT clr_no FROM classRoom WHERE flr_id = (SELECT flr_id FROM Floor WHERE flr_no = '" + jComboBox2.getSelectedItem() + "')");
            jComboBox1.removeAllItems();
            while (rs1.next()) {
                jComboBox1.addItem(rs1.getString("clr_no"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

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

    private void txt_scc_feeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_scc_feeKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || (evt.getKeyChar() == '.')) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_scc_feeKeyTyped

    private void txt_scc_comiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_scc_comiKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || (evt.getKeyChar() == '.')) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_scc_comiKeyTyped

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
            java.util.logging.Logger.getLogger(ScheduleClass.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScheduleClass.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScheduleClass.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScheduleClass.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScheduleClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_scc_schedule;
    private javax.swing.JComboBox<String> cb_scc_day;
    private javax.swing.JComboBox<String> cb_scc_grade;
    private javax.swing.JComboBox<String> cb_scc_subject;
    private javax.swing.JComboBox<String> cb_scc_subjecttype;
    private javax.swing.JComboBox<String> cb_scc_teacher;
    private javax.swing.JComboBox<String> cb_scc_type;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lab_scc_avt;
    private javax.swing.JLabel lab_scc_count1;
    private javax.swing.JLabel lab_scc_count2;
    private javax.swing.JLabel lab_scc_count3;
    private javax.swing.JLabel lab_scc_expClass;
    private javax.swing.JLabel lab_scc_expiclass;
    private javax.swing.JTable tab_scc_currentClass;
    private javax.swing.JTable tab_scc_schClass;
    private com.github.lgooddatepicker.components.TimePicker timePicker1;
    private com.github.lgooddatepicker.components.TimePicker timePicker2;
    private javax.swing.JTextField txt_scc_comi;
    private javax.swing.JTextField txt_scc_fee;
    // End of variables declaration//GEN-END:variables

    private void comboBoxValue() {
        try {
            ResultSet rs1 = Database.getData("SELECT emp_fname, emp_mname, emp_lname FROM Employee WHERE emp_position = 'TEACHER'");
            cb_scc_teacher.removeAll();
            while (rs1.next()) {
                cb_scc_teacher.addItem(rs1.getString("emp_fname") + " " + rs1.getString("emp_mname") + " " + rs1.getString("emp_lname"));
            }
            ResultSet rs3 = Database.getData("SELECT clt_type FROM classType");
            cb_scc_type.removeAll();
            while (rs3.next()) {
                cb_scc_type.addItem(rs3.getString("clt_type"));
            }
            cb_scc_subjecttype.removeAll();
            ResultSet rs7 = Database.getData("SELECT sbt_type FROM subjectType");
            while (rs7.next()) {
                cb_scc_subjecttype.addItem(rs7.getString("sbt_type"));
            }
            ResultSet rs2 = Database.getData("SELECT day_name FROM Day");
            while (rs2.next()) {
                cb_scc_day.addItem(rs2.getString("day_name"));
            }
            ResultSet rs4 = Database.getData("SELECT flr_no FROM Floor");
            while (rs4.next()) {
                jComboBox2.addItem(rs4.getString("flr_no"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void setDateToRightTable() {
        try {
            ResultSet rs1 = Database.getData("SELECT DISTINCT `subject`.`sub_name`, `classtype`.`clt_type`FROM `cambridge_project`.`class` INNER JOIN `cambridge_project`.`classtype` ON (`class`.`clt_id` = `classtype`.`clt_id`)\n"
                    + "INNER JOIN `cambridge_project`.`subject` ON (`class`.`sub_id` = `subject`.`sub_id`)");
            DefaultTableModel dtm1 = (DefaultTableModel) tab_scc_currentClass.getModel();
            dtm1.setRowCount(0);
            while (rs1.next()) {
                Vector v = new Vector();
                v.add(rs1.getString("sub_name") + " " + rs1.getString("clt_type"));
                dtm1.addRow(v);
            }
            ResultSet rs2 = Database.getData("SELECT DISTINCT sub_name FROM Subject");
            DefaultTableModel dtm2 = (DefaultTableModel) tab_scc_schClass.getModel();
            dtm2.setRowCount(0);
            while (rs2.next()) {
                Vector v = new Vector();
                v.add(rs2.getString("sub_name"));
                dtm2.addRow(v);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fetchDataToLable() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ResultSet rs4 = Database.getData("SELECT COUNT(cls_id) AS expCount FROM Class WHERE DATE(cls_end_date) < '" + sdf.format(new Date()) + "'");
            if (rs4.next()) {
                lab_scc_count1.setText(rs4.getInt("expCount") + "");
            }
            ResultSet rs5 = Database.getData("SELECT COUNT(cls_id) AS nexpCount FROM Class WHERE DATE(cls_end_date) >= '" + sdf.format(new Date()) + "'");
            if (rs5.next()) {
                lab_scc_count2.setText(rs5.getInt("nexpCount") + "");
            }
            ResultSet rs6 = Database.getData("SELECT COUNT(cls_id) AS expingCount FROM Class WHERE DATE(cls_end_date) >= '" + sdf.format(new Date()) + "'");
            if (rs6.next()) {
                lab_scc_count3.setText(rs6.getInt("expingCount") + "");
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
                jLabel35.setText(time);
            }
        });
        t.start();
    }
}
