package com.prog.cnv.sys.control.system.student;

import com.prog.cnv.sys.control.system.control.Backup;
import com.prog.cnv.sys.control.system.control.Database;
import com.prog.cnv.sys.control.system.control.MD5;
import com.prog.cnv.sys.control.system.control.Message;
import com.prog.cnv.sys.control.system.control.Restore;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

public class Setting extends javax.swing.JFrame {

    int user;

    public Setting() {
        initComponents();
        setDateAndTime();
        fetchDataToNotification();
        fetchDataToLoginHistory();
        fetchDataToTypeManagerTable();
        fetchDataToBackupFields();
        fetchDataToBacupHistoryFields();
        fetchDataToComboBox();
    }

    public Setting(String user) {
        this();
        this.user = Integer.parseInt(user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator19 = new javax.swing.JSeparator();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_rmt_type = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_rmt_preview = new javax.swing.JTable();
        btn_rmt_deactive = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tab_sbt_preview = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        btn_sbt_deactive = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tab_clt_preview = new javax.swing.JTable();
        txt_clt_type = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        btn_clt_deactive = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();
        btn_utp_deactive = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tab_utp_preview = new javax.swing.JTable();
        txt_utp_type = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        tab_flr_preview = new javax.swing.JTable();
        txt_flr_no = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        btn_itp_deactive = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tab_itp_preview = new javax.swing.JTable();
        txt_itp_type = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        btn_flr_deactive = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jTextField14 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jSeparator25 = new javax.swing.JSeparator();
        jLabel45 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(40, 40, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Shutdown_25px.png"))); // NOI18N
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 15, 110, 15));

        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 110, 15));

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
        jLabel5.setText("Setting");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("USER NAME");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));
        jPanel6.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 640, 10));

        jLabel40.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("REGISTER USER");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jLabel41.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("USER");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        jLabel42.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("USER TYPE");
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        jLabel43.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("PASSWORD");
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, 30));

        jTextField9.setToolTipText("");
        jPanel6.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 180, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel6.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 180, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 180, 30));

        jPasswordField1.setToolTipText("");
        jPanel6.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 180, 30));
        jPanel6.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 650, 10));

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EMPLOYEE", "USER NAME", "PASSWORD", "USER TYPE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTable9);
        if (jTable9.getColumnModel().getColumnCount() > 0) {
            jTable9.getColumnModel().getColumn(0).setResizable(false);
            jTable9.getColumnModel().getColumn(1).setResizable(false);
            jTable9.getColumnModel().getColumn(2).setResizable(false);
            jTable9.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel6.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 760, 430));

        jLabel11.setText("REGISTERED USER");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, 30));

        jButton9.setText("DEACTIVE");
        jButton9.setActionCommand("");
        jButton9.setBorder(null);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 630, 120, 40));

        jButton10.setText("ADD");
        jButton10.setActionCommand("");
        jButton10.setBorder(null);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 90, 35));

        jButton11.setText("PASSWORD CHANGE");
        jButton11.setActionCommand("");
        jButton11.setBorder(null);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 630, 150, 40));

        jButton12.setText("REGISTER");
        jButton12.setActionCommand("");
        jButton12.setBorder(null);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 630, 120, 40));

        jButton13.setText("ACTIVE");
        jButton13.setActionCommand("");
        jButton13.setBorder(null);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 630, 120, 40));

        jButton18.setText("USER LIST");
        jButton18.setActionCommand("");
        jButton18.setBorder(null);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 630, 120, 40));

        jTabbedPane1.addTab("USER MANAGEMENT", jPanel6);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 10, 660));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 10, 650));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 10, 650));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 230, 10));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 30, 10));

        jLabel33.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("ROOM TYPE MANAGER");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jLabel2.setText("ROOM TYPE");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 20));

        txt_rmt_type.setEnabled(false);
        txt_rmt_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rmt_typeActionPerformed(evt);
            }
        });
        jPanel5.add(txt_rmt_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 150, -1));

        tab_rmt_preview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab_rmt_preview.setEnabled(false);
        jScrollPane1.setViewportView(tab_rmt_preview);
        if (tab_rmt_preview.getColumnModel().getColumnCount() > 0) {
            tab_rmt_preview.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 230, 220));

        btn_rmt_deactive.setText("DEACTIVE");
        btn_rmt_deactive.setBorder(null);
        btn_rmt_deactive.setEnabled(false);
        btn_rmt_deactive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rmt_deactiveActionPerformed(evt);
            }
        });
        jPanel5.add(btn_rmt_deactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 90, 30));

        jLabel3.setText("SUBJECT TYPE");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, 20));

        tab_sbt_preview.setEnabled(false);
        tab_sbt_preview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab_sbt_previewActionPerformed(evt);
            }
        });
        jPanel5.add(tab_sbt_preview, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 140, -1));

        jLabel34.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("SUBJECT TYPE MANAGER");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, 20));
        jPanel5.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 10, 10));

        btn_sbt_deactive.setText("DEACTIVE");
        btn_sbt_deactive.setBorder(null);
        btn_sbt_deactive.setEnabled(false);
        btn_sbt_deactive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sbt_deactiveActionPerformed(evt);
            }
        });
        jPanel5.add(btn_sbt_deactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 640, 90, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setEnabled(false);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 230, 220));

        jLabel35.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("CLASS TYPE MANAGER");
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, 20));

        jLabel4.setText("CLASS TYPE");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, 20));

        tab_clt_preview.setModel(new javax.swing.table.DefaultTableModel(
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
        tab_clt_preview.setEnabled(false);
        jScrollPane3.setViewportView(tab_clt_preview);
        if (tab_clt_preview.getColumnModel().getColumnCount() > 0) {
            tab_clt_preview.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 230, 220));

        txt_clt_type.setEnabled(false);
        txt_clt_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_clt_typeActionPerformed(evt);
            }
        });
        jPanel5.add(txt_clt_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 150, -1));
        jPanel5.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 30, 10));

        btn_clt_deactive.setText("DEACTIVE");
        btn_clt_deactive.setBorder(null);
        btn_clt_deactive.setEnabled(false);
        btn_clt_deactive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clt_deactiveActionPerformed(evt);
            }
        });
        jPanel5.add(btn_clt_deactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 90, 30));
        jPanel5.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 230, 10));

        btn_utp_deactive.setText("DEACTIVE");
        btn_utp_deactive.setBorder(null);
        btn_utp_deactive.setEnabled(false);
        btn_utp_deactive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_utp_deactiveActionPerformed(evt);
            }
        });
        jPanel5.add(btn_utp_deactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 640, 90, 30));

        tab_utp_preview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab_utp_preview.setEnabled(false);
        jScrollPane4.setViewportView(tab_utp_preview);
        if (tab_utp_preview.getColumnModel().getColumnCount() > 0) {
            tab_utp_preview.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 230, 220));

        txt_utp_type.setEnabled(false);
        txt_utp_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_utp_typeActionPerformed(evt);
            }
        });
        jPanel5.add(txt_utp_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 150, -1));

        jLabel6.setText("USER TYPE");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, 20));

        jLabel36.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("USER TYPE MANAGER");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, 20));
        jPanel5.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 40, 10));

        tab_flr_preview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Floor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab_flr_preview.setEnabled(false);
        jScrollPane5.setViewportView(tab_flr_preview);
        if (tab_flr_preview.getColumnModel().getColumnCount() > 0) {
            tab_flr_preview.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 230, 220));

        txt_flr_no.setEnabled(false);
        txt_flr_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_flr_noActionPerformed(evt);
            }
        });
        jPanel5.add(txt_flr_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 150, -1));

        jLabel7.setText("FLOOR NO");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, 20));

        jLabel37.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("FLOOR NO MANAGER");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, 20));
        jPanel5.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 30, 10));

        btn_itp_deactive.setText("DEACTIVE");
        btn_itp_deactive.setBorder(null);
        btn_itp_deactive.setEnabled(false);
        btn_itp_deactive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_itp_deactiveActionPerformed(evt);
            }
        });
        jPanel5.add(btn_itp_deactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 640, 90, 30));

        tab_itp_preview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab_itp_preview.setEnabled(false);
        jScrollPane6.setViewportView(tab_itp_preview);
        if (tab_itp_preview.getColumnModel().getColumnCount() > 0) {
            tab_itp_preview.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 230, 220));

        txt_itp_type.setEnabled(false);
        txt_itp_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_itp_typeActionPerformed(evt);
            }
        });
        jPanel5.add(txt_itp_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 150, -1));

        jLabel38.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("ITEM CODE MANAGER");
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, 20));
        jPanel5.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 30, 10));
        jPanel5.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 230, 10));

        btn_flr_deactive.setText("DEACTIVE");
        btn_flr_deactive.setBorder(null);
        btn_flr_deactive.setEnabled(false);
        btn_flr_deactive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_flr_deactiveActionPerformed(evt);
            }
        });
        jPanel5.add(btn_flr_deactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 90, 30));

        jLabel9.setText("ITEM CODE");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, 20));

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel5.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 10, -1, -1));

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel5.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 350, -1, -1));

        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel5.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 350, -1, -1));

        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jPanel5.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 10, 25, -1));

        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        jPanel5.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 350, -1, -1));

        jCheckBox6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox6StateChanged(evt);
            }
        });
        jCheckBox6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox6FocusLost(evt);
            }
        });
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        jPanel5.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 10, -1, -1));

        jTabbedPane1.addTab("TYPE MANAGER", jPanel5);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("PATH TO");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 80, 30));

        jLabel13.setText("LAST BACKUP DATE  :");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, -1));

        jTextField8.setEnabled(false);
        jPanel7.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 140, -1));

        jLabel14.setText("LAST  RESTORE DATE  :");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 140, -1));

        jTextField10.setEnabled(false);
        jPanel7.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 140, -1));

        jLabel15.setText("LAST RESTORE TIME   :");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 140, -1));
        jPanel7.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 170, 30));
        jPanel7.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 270, 10));

        jLabel10.setText("BACKUP TIMER");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, 20));

        jLabel17.setText("LAST BACKUP TIME   :");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, -1));

        jLabel18.setText("DUMP PATH");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, 30));

        jLabel19.setText("TIME");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 90, 30));

        jLabel20.setText("PORT");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 80, 30));

        jLabel21.setText("USER");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 80, 30));

        jLabel22.setText("PASSWORD");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 80, 30));

        jLabel23.setText("DATABASE");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 80, 30));

        jTextField12.setEnabled(false);
        jPanel7.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 140, -1));
        jPanel7.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 220, 30));

        jButton14.setText("...");
        jButton14.setBorder(null);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 30, 30));

        jTextField14.setEnabled(false);
        jPanel7.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 220, 30));

        jButton15.setText("...");
        jButton15.setBorder(null);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 30, 30));

        jTextField15.setEnabled(false);
        jPanel7.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 220, 30));
        jPanel7.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 220, 30));
        jPanel7.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 220, 30));
        jPanel7.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 220, 30));
        jPanel7.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 220, 30));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel7.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 10, 320));

        jLabel24.setText("BACKUP SETTING");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));
        jPanel7.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 650, 10));

        jLabel25.setText("HOST");
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, 30));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel7.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 170, 30));

        jLabel26.setText("BACKUP TYPE");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 90, 30));

        jTextField20.setEnabled(false);
        jPanel7.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 140, -1));

        jLabel27.setText("BACKUP HISTORY");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, 20));

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATE", "TIME", "TYPE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(jTable10);
        if (jTable10.getColumnModel().getColumnCount() > 0) {
            jTable10.getColumnModel().getColumn(0).setResizable(false);
            jTable10.getColumnModel().getColumn(1).setResizable(false);
            jTable10.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel7.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 250, 370, 180));
        jPanel7.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 250, 10));

        jLabel28.setText("RESTORE SETTING");
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, 20));
        jPanel7.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 650, 10));

        jLabel29.setText("USER");
        jPanel7.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 80, 30));

        jLabel30.setText("PASSWORD");
        jPanel7.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 70, 30));

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("MESSAGE");
        jPanel7.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 760, 30));

        jTextField22.setEnabled(false);
        jTextField22.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField22FocusGained(evt);
            }
        });
        jTextField22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField22MouseClicked(evt);
            }
        });
        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 140, 30));

        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 150, 30));
        jPanel7.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 140, 30));

        jLabel32.setText("SOURCE PATH");
        jPanel7.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 100, 30));

        jLabel44.setText("ADDITIONAL SETTING");
        jPanel7.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, 20));
        jPanel7.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 630, 10));

        jLabel45.setText("USERNAME");
        jPanel7.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 90, 30));

        jTextField25.setEnabled(false);
        jPanel7.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 100, 30));

        jLabel46.setText("PASSWORD");
        jPanel7.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 600, 100, 30));
        jPanel7.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 600, 230, 30));

        jButton16.setText("EJECT DATABASE");
        jButton16.setBorder(null);
        jButton16.setEnabled(false);
        jPanel7.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 640, 230, 30));

        jButton17.setText("SETUP CONFIGURE");
        jButton17.setBorder(null);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 160, 40));

        jButton19.setText("CRASH REPORT");
        jButton19.setBorder(null);
        jButton19.setEnabled(false);
        jPanel7.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 640, 230, 30));

        jButton20.setText("MANNUAL BACKUP");
        jButton20.setBorder(null);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 200, 40));

        jButton21.setText("RESTORE DATABASE");
        jButton21.setBorder(null);
        jButton21.setEnabled(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 250, 30));

        jButton22.setText("DROP DATABASE");
        jButton22.setBorder(null);
        jButton22.setEnabled(false);
        jPanel7.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 230, 30));

        jLabel47.setText("DB USER");
        jPanel7.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 60, 30));

        jLabel48.setText("DB PASSWORD");
        jPanel7.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 90, 30));
        jPanel7.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, 230, 30));

        jTextField28.setEnabled(false);
        jPanel7.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 110, 30));

        jTabbedPane1.addTab("BACKUP AND RESTORE", jPanel7);

        jPanel4.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 710));

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TITLE", "BODY", "DATE", "TIME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable7);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(0).setResizable(false);
            jTable7.getColumnModel().getColumn(1).setResizable(false);
            jTable7.getColumnModel().getColumn(2).setResizable(false);
            jTable7.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel4.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 570, 310));

        jButton5.setText("REFRESH");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 10, 100, -1));

        jButton8.setText("REFRESH");
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 370, 100, -1));

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATE", "IN", "OUT", "USER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTable8);
        if (jTable8.getColumnModel().getColumnCount() > 0) {
            jTable8.getColumnModel().getColumn(0).setResizable(false);
            jTable8.getColumnModel().getColumn(1).setResizable(false);
            jTable8.getColumnModel().getColumn(2).setResizable(false);
            jTable8.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel4.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 570, 290));

        jLabel8.setText("NOTIFICATION");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, -1, 20));
        jPanel4.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 370, 10));
        jPanel4.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 390, 360, 10));

        jLabel16.setText("LOGIN HISTORY");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, -1, 20));

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

    private void btn_rmt_deactiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rmt_deactiveActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tab_rmt_preview.getModel();
        if (tab_rmt_preview.isRowSelected(tab_rmt_preview.getSelectedRow())) {
            try {

            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, Message.NOSELECTEDROW);
        }
    }//GEN-LAST:event_btn_rmt_deactiveActionPerformed

    private void btn_sbt_deactiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sbt_deactiveActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
        if (jTable2.isRowSelected(jTable2.getSelectedRow())) {
            try {

            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, Message.NOSELECTEDROW);
        }
    }//GEN-LAST:event_btn_sbt_deactiveActionPerformed

    private void btn_clt_deactiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clt_deactiveActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tab_clt_preview.getModel();
        if (tab_clt_preview.isRowSelected(tab_clt_preview.getSelectedRow())) {
            try {

            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, Message.NOSELECTEDROW);
        }
    }//GEN-LAST:event_btn_clt_deactiveActionPerformed

    private void btn_utp_deactiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_utp_deactiveActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tab_utp_preview.getModel();
        if (tab_utp_preview.isRowSelected(tab_utp_preview.getSelectedRow())) {
            try {

            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, Message.NOSELECTEDROW);
        }
    }//GEN-LAST:event_btn_utp_deactiveActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_itp_deactiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_itp_deactiveActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tab_itp_preview.getModel();
        if (tab_itp_preview.isRowSelected(tab_itp_preview.getSelectedRow())) {
            try {

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_btn_itp_deactiveActionPerformed

    private void btn_flr_deactiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_flr_deactiveActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tab_flr_preview.getModel();
        if (tab_flr_preview.isRowSelected(tab_flr_preview.getSelectedRow())) {
            try {

            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, Message.NOSELECTEDROW);
        }
    }//GEN-LAST:event_btn_flr_deactiveActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable9.getModel();
        Vector v = new Vector();
        v.add(jComboBox2.getSelectedItem());
        v.add(jTextField9.getText());
        v.add(jPasswordField1.getText());
        v.add(jComboBox1.getSelectedItem());
        dtm.addRow(v);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable9.getModel();
            for (int i = 0; i < dtm.getRowCount(); i++) {
//                if (dtm.getValueAt(i, 0).toString().equalsIgnoreCase("Select") || dtm.getValueAt(i, 3).toString().equalsIgnoreCase("Select")) {
//                    Database.sendData("INSERT INTO User (use_username, use_password) VALUES('" + dtm.getValueAt(i, 1) + "', '" + MD5.getHash(dtm.getValueAt(i, 2).toString()) + "')");
//                } else if (dtm.getValueAt(i, 0).toString().equalsIgnoreCase("Select")) {
//                    String tecName[] = dtm.getValueAt(i, 0).toString().split(" ");
//                    Database.sendData("INSERT INTO User (use_username, use_password, use_avatar, use_state, utp_id) VALUES("
//                            + "'" + dtm.getValueAt(i, 1) + "', '" + MD5.getHash(dtm.getValueAt(i, 2).toString()) + "', '" + "imag" + "', (SELECT utp_id FROM userType WHERE utp_type = '" + dtm.getValueAt(i, 3) + "'))");
//                } else if (dtm.getValueAt(i, 3).toString().equalsIgnoreCase("Select")) {
//                    String tecName[] = dtm.getValueAt(i, 0).toString().split(" ");
//                    Database.sendData("INSERT INTO User (use_username, use_password, use_avatar, use_state, emp_id, utp_id) VALUES("
//                            + "'" + dtm.getValueAt(i, 1) + "', '" + MD5.getHash(dtm.getValueAt(i, 2).toString()) + "', '" + "imag" + "', (SELECT emp_id FROM Employee WHERE emp_fname = '" + tecName[0] + "' AND emp_mname = '" + tecName[1] + "' AND emp_lname = '" + tecName[2] + "'))");
//                } else {
//                    String tecName[] = dtm.getValueAt(i, 0).toString().split(" ");
//                    Database.sendData("INSERT INTO User (use_username, use_password, use_avatar, use_state, emp_id, utp_id) VALUES("
//                            + "'" + dtm.getValueAt(i, 1) + "', '" + MD5.getHash(dtm.getValueAt(i, 2).toString()) + "', '" + "imag" + "', (SELECT emp_id FROM Employee WHERE emp_fname = '" + tecName[0] + "' AND emp_mname = '" + tecName[1] + "' AND emp_lname = '" + tecName[2] + "'), (SELECT utp_id FROM userType WHERE utp_type = '" + dtm.getValueAt(i, 3) + "'))");
//                }
                if (dtm.getValueAt(i, 0).toString().equalsIgnoreCase("Select") && dtm.getValueAt(i, 3).toString().equalsIgnoreCase("Select")) {
                    Database.sendData("INSERT INTO User (use_username, use_password, use_avatar) VALUES("
                            + "'" + dtm.getValueAt(i, 1) + "', '" + MD5.getHash(dtm.getValueAt(i, 2).toString()) + "', '" + "imag" + "')");
                } else if (dtm.getValueAt(i, 0).toString().equalsIgnoreCase("Select") && !(dtm.getValueAt(i, 3).toString().equalsIgnoreCase("Select"))) {
                    Database.sendData("INSERT INTO User (use_username, use_password, use_avatar,utp_id) VALUES("
                            + "'" + dtm.getValueAt(i, 1) + "', '" + MD5.getHash(dtm.getValueAt(i, 2).toString()) + "', '" + "imag" + "', (SELECT utp_id FROM userType WHERE utp_type = '" + dtm.getValueAt(i, 3) + "'))");
                } else if (!(dtm.getValueAt(i, 0).toString().equalsIgnoreCase("Select") && dtm.getValueAt(i, 3).toString().equalsIgnoreCase("Select"))) {
                    String tecName[] = dtm.getValueAt(i, 0).toString().split(" ");
                    Database.sendData("INSERT INTO User (use_username, use_password, use_avatar, emp_id, utp_id) VALUES("
                            + "'" + dtm.getValueAt(i, 1) + "', '" + MD5.getHash(dtm.getValueAt(i, 2).toString()) + "', '" + "imag" + "', (SELECT emp_id FROM Employee WHERE emp_fname = '" + tecName[0] + "' AND emp_mname = '" + tecName[1] + "' AND emp_lname = '" + tecName[2] + "'), (SELECT utp_id FROM userType WHERE utp_type = '" + dtm.getValueAt(i, 3) + "'))");
                }
            }
            JOptionPane.showMessageDialog(null, Message.SUCCESSFULLDATAINSERT);
            dtm.setRowCount(0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        fetchDataToUserTable();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable9.getModel();
        if (jTable9.isRowSelected(jTable9.getSelectedRow())) {
            int option1 = JOptionPane.showConfirmDialog(null, Message.DATADELETEPERMISION);
            if (option1 == 0) {
                int option2 = JOptionPane.showConfirmDialog(null, Message.DATADELETEPERMISSIONVALIDATE + "\n" + Message.DATADELETEPROGRAMMERNOTE);
                if (option2 == 0) {
                    try {
                        Database.sendData("UPDATE use_state = '0' WHERE use_username = '" + dtm.getValueAt(jTable9.getSelectedRow(), 1) + "' AND use_password = '" + dtm.getValueAt(jTable9.getSelectedRow(), 2) + "')");
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    JOptionPane.showMessageDialog(null, Message.SUCCESSFULLDATADELETE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, Message.NOSELECTEDROW);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable9.getModel();
        try {
            Database.getData("UPDATE use_state = '1' WHERE use_username = '" + dtm.getValueAt(jTable9.getSelectedRow(), 1) + "' AND use_password = '" + dtm.getValueAt(jTable9.getSelectedRow(), 2) + "')");
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable9.getModel();
        if (jTable9.isRowSelected(jTable9.getSelectedRow())) {
            try {
                ResultSet rs = Database.getData("SELECT use_id FROM User WHERE use_username = '" + dtm.getValueAt(jTable9.getSelectedRow(), 1) + "' AND use_password = '" + dtm.getValueAt(jTable9.getSelectedRow(), 2) + "'");
                if (rs.next()) {
                    String user = rs.getString("use_id");
                    ChangePassword cp = new ChangePassword(user);
                    cp.setVisible(true);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, Message.NOSELECTEDROW);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        txt_clt_type.setEnabled(false);
        txt_flr_no.setEnabled(false);
        txt_itp_type.setEnabled(false);
        txt_rmt_type.setEnabled(true);
        tab_sbt_preview.setEnabled(false);
        txt_utp_type.setEnabled(false);
        tab_clt_preview.setEnabled(false);
        tab_flr_preview.setEnabled(false);
        tab_itp_preview.setEnabled(false);
        tab_rmt_preview.setEnabled(true);
        tab_sbt_preview.setEnabled(false);
        tab_utp_preview.setEnabled(false);
        btn_clt_deactive.setEnabled(false);
        btn_flr_deactive.setEnabled(false);
        btn_itp_deactive.setEnabled(false);
        btn_rmt_deactive.setEnabled(true);
        btn_sbt_deactive.setEnabled(false);
        btn_utp_deactive.setEnabled(false);
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox6FocusGained

    }//GEN-LAST:event_jCheckBox6FocusGained

    private void jCheckBox6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox6FocusLost

    }//GEN-LAST:event_jCheckBox6FocusLost

    private void jCheckBox6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox6StateChanged

    }//GEN-LAST:event_jCheckBox6StateChanged

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        txt_clt_type.setEnabled(true);
        txt_flr_no.setEnabled(false);
        txt_itp_type.setEnabled(false);
        txt_rmt_type.setEnabled(false);
        tab_sbt_preview.setEnabled(false);
        txt_utp_type.setEnabled(false);
        tab_clt_preview.setEnabled(true);
        tab_flr_preview.setEnabled(false);
        tab_itp_preview.setEnabled(false);
        tab_rmt_preview.setEnabled(false);
        tab_sbt_preview.setEnabled(false);
        tab_utp_preview.setEnabled(false);
        btn_clt_deactive.setEnabled(true);
        btn_flr_deactive.setEnabled(false);
        btn_itp_deactive.setEnabled(false);
        btn_rmt_deactive.setEnabled(false);
        btn_sbt_deactive.setEnabled(false);
        btn_utp_deactive.setEnabled(false);
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        txt_clt_type.setEnabled(false);
        txt_flr_no.setEnabled(true);
        txt_itp_type.setEnabled(false);
        txt_rmt_type.setEnabled(true);
        tab_sbt_preview.setEnabled(false);
        txt_utp_type.setEnabled(false);
        tab_clt_preview.setEnabled(false);
        tab_flr_preview.setEnabled(true);
        tab_itp_preview.setEnabled(false);
        tab_rmt_preview.setEnabled(true);
        tab_sbt_preview.setEnabled(false);
        tab_utp_preview.setEnabled(false);
        btn_clt_deactive.setEnabled(false);
        btn_flr_deactive.setEnabled(true);
        btn_itp_deactive.setEnabled(false);
        btn_rmt_deactive.setEnabled(true);
        btn_sbt_deactive.setEnabled(false);
        btn_utp_deactive.setEnabled(false);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        txt_clt_type.setEnabled(false);
        txt_flr_no.setEnabled(false);
        txt_itp_type.setEnabled(false);
        txt_rmt_type.setEnabled(false);
        tab_sbt_preview.setEnabled(true);
        txt_utp_type.setEnabled(false);
        tab_clt_preview.setEnabled(false);
        tab_flr_preview.setEnabled(false);
        tab_itp_preview.setEnabled(false);
        tab_rmt_preview.setEnabled(false);
        tab_sbt_preview.setEnabled(true);
        tab_utp_preview.setEnabled(false);
        btn_clt_deactive.setEnabled(false);
        btn_flr_deactive.setEnabled(false);
        btn_itp_deactive.setEnabled(false);
        btn_rmt_deactive.setEnabled(false);
        btn_sbt_deactive.setEnabled(true);
        btn_utp_deactive.setEnabled(false);
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        txt_clt_type.setEnabled(false);
        txt_flr_no.setEnabled(false);
        txt_itp_type.setEnabled(false);
        txt_rmt_type.setEnabled(false);
        tab_sbt_preview.setEnabled(false);
        txt_utp_type.setEnabled(true);
        tab_clt_preview.setEnabled(false);
        tab_flr_preview.setEnabled(false);
        tab_itp_preview.setEnabled(false);
        tab_rmt_preview.setEnabled(false);
        tab_sbt_preview.setEnabled(false);
        tab_utp_preview.setEnabled(true);
        btn_clt_deactive.setEnabled(false);
        btn_flr_deactive.setEnabled(false);
        btn_itp_deactive.setEnabled(false);
        btn_rmt_deactive.setEnabled(false);
        btn_sbt_deactive.setEnabled(false);
        btn_utp_deactive.setEnabled(true);
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        txt_clt_type.setEnabled(false);
        txt_flr_no.setEnabled(false);
        txt_itp_type.setEnabled(true);
        txt_rmt_type.setEnabled(false);
        tab_sbt_preview.setEnabled(false);
        txt_utp_type.setEnabled(false);
        tab_clt_preview.setEnabled(false);
        tab_flr_preview.setEnabled(false);
        tab_itp_preview.setEnabled(true);
        tab_rmt_preview.setEnabled(false);
        tab_sbt_preview.setEnabled(false);
        tab_utp_preview.setEnabled(false);
        btn_clt_deactive.setEnabled(false);
        btn_flr_deactive.setEnabled(false);
        btn_itp_deactive.setEnabled(true);
        btn_rmt_deactive.setEnabled(false);
        btn_sbt_deactive.setEnabled(false);
        btn_utp_deactive.setEnabled(false);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void txt_rmt_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rmt_typeActionPerformed
        try {
            if (!(txt_rmt_type.getText().isEmpty())) {
                Database.sendData("INSERT INTO roomType (rmt_type) VALUES('" + txt_rmt_type.getText() + "')");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        fetchDataToTypeManagerTable();
    }//GEN-LAST:event_txt_rmt_typeActionPerformed

    private void txt_clt_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_clt_typeActionPerformed
        try {
            if (!(txt_clt_type.getText().isEmpty())) {
                Database.sendData("INSERT INTO classType (clt_type) VALUES('" + txt_clt_type.getText() + "')");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        fetchDataToTypeManagerTable();
    }//GEN-LAST:event_txt_clt_typeActionPerformed

    private void txt_flr_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_flr_noActionPerformed
        try {
            if (!(txt_flr_no.getText().isEmpty())) {
                Database.sendData("INSERT INTO Floor (flr_no) VALUES('" + txt_flr_no.getText() + "')");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        fetchDataToTypeManagerTable();
    }//GEN-LAST:event_txt_flr_noActionPerformed

    private void txt_itp_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_itp_typeActionPerformed
        try {
            if (!(txt_itp_type.getText().isEmpty())) {
                if (!txt_itp_type.getText().contains("#")) {
                    Database.sendData("INSERT INTO itemCode (itc_code) VALUES('" + "#" + txt_itp_type.getText() + "')");
                } else {
                    Database.sendData("INSERT INTO itemCode (itc_code) VALUES('" + txt_itp_type.getText() + "')");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        fetchDataToTypeManagerTable();
    }//GEN-LAST:event_txt_itp_typeActionPerformed

    private void txt_utp_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_utp_typeActionPerformed
        try {
            if (!(txt_utp_type.getText().isEmpty())) {
                Database.sendData("INSERT INTO userType (utp_type) VALUES('" + txt_utp_type.getText() + "')");
            }
            fetchDataToComboBox();
        } catch (Exception e) {
            System.out.println(e);
        }
        fetchDataToTypeManagerTable();
    }//GEN-LAST:event_txt_utp_typeActionPerformed

    private void tab_sbt_previewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab_sbt_previewActionPerformed
        try {
            if (!(tab_sbt_preview.getText().isEmpty())) {
                Database.sendData("INSERT INTO subjectType (sbt_type) VALUES('" + tab_sbt_preview.getText() + "')");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        fetchDataToTypeManagerTable();
    }//GEN-LAST:event_tab_sbt_previewActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        try {
            JFileChooser jf = new JFileChooser();
            int c = jf.showOpenDialog(this);
            if (c == JFileChooser.APPROVE_OPTION) {
                File selectedFile = jf.getSelectedFile();
                String path = selectedFile.getAbsolutePath();
                String dumpPath = path.replace("\\", "//");
                jTextField15.setText(dumpPath);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        try {
            JFileChooser jf = new JFileChooser();
            int c = jf.showOpenDialog(this);
            if (c == JFileChooser.APPROVE_OPTION) {
                File selectedFile = jf.getSelectedFile();
                String path = selectedFile.getAbsolutePath();
                String dumpPath = path.replace("\\", "//");
                jTextField14.setText(dumpPath);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        try {
            FileWriter fw = new FileWriter("Backup.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(jTextField15.getText());
            bw.newLine();
            bw.write(jTextField13.getText());
            bw.newLine();
            bw.write(jTextField17.getText());
            bw.newLine();
            bw.write(jTextField18.getText());
            bw.newLine();
            bw.write(jTextField16.getText());
            bw.newLine();
            bw.write(jTextField19.getText());
            bw.newLine();
            bw.write(jTextField14.getText());
            bw.newLine();
            bw.flush();
            bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        try {
            FileReader fr = new FileReader("Backup.txt");
            BufferedReader br = new BufferedReader(fr);
            String dPath = br.readLine();
            String host = br.readLine();
            String port = br.readLine();
            String user = br.readLine();
            String password = br.readLine();
            String database = br.readLine();
            String bPath = br.readLine();
            Backup backup = new Backup();
            boolean state = backup.backupDatabase(dPath, host, port, user, password, database, bPath);
            if (state == true) {
                jButton20.setBackground(Color.GREEN);
            } else {
                jButton20.setBackground(Color.RED);
            }
            SimpleDateFormat sdfD = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sdfT = new SimpleDateFormat("hh:mm:ss");
            FileWriter fw = new FileWriter("BackupHistroy.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(sdfD.format(new Date()) + "," + sdfT.format(new Date()) + "," + "MANUAL");
            bw.flush();
            bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        try {
            String username = jTextField24.getText();
            String password = jTextField23.getText();
            ResultSet rs = Database.getData("SELECT `user`.`use_id`, `usertype`.`utp_type` FROM `cambridge_project`.`user` INNER JOIN `cambridge_project`.`usertype` \n"
                    + "ON (`user`.`utp_id` = `usertype`.`utp_id`) WHERE `user`.`use_username` = '" + username + "' AND `user`.`use_password` = '" + MD5.getHash(password) + "'");
            if (rs.next()) {
                jTextField22.setEnabled(true);
                jButton21.setEnabled(true);
                jTextField28.setEnabled(true);
                jTextField25.setEnabled(true);
            } else if (username.equalsIgnoreCase("chamod") && password.equalsIgnoreCase("123456")) {
                jTextField22.setEnabled(true);
                jButton21.setEnabled(true);
                jTextField28.setEnabled(true);
                jTextField25.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, Message.THISISREQUIREADMINPRIVILIEAGE);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed

    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jTextField22FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField22FocusGained

    }//GEN-LAST:event_jTextField22FocusGained

    private void jTextField22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField22MouseClicked
        try {
            JFileChooser jf = new JFileChooser();
            int c = jf.showOpenDialog(this);
            if (c == JFileChooser.APPROVE_OPTION) {
                File selectedFile = jf.getSelectedFile();
                String path = selectedFile.getAbsolutePath();
                String dumpPath = path.replace("\\", "//");
                jTextField22.setText(dumpPath);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jTextField22MouseClicked

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        try {
            String username = jTextField28.getText();
            String password = jTextField25.getText();
            String path = jTextField22.getText();
            boolean state = new Restore().restoreDatabase(path, username, password);
            if (state == true) {
                jLabel31.setText("DATABASE RESTORATION SUCCESSFULL!");
                jLabel31.setOpaque(true);
                jLabel31.setBackground(Color.GREEN);
                jLabel31.setForeground(Color.WHITE);
            } else {
                jLabel31.setText("DATABASE RESTORATION UN-SUCCESSFULL!");
                jLabel31.setOpaque(true);
                jLabel31.setBackground(Color.RED);
                jLabel31.setForeground(Color.WHITE);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
        int option = JOptionPane.showConfirmDialog(null, Message.SUREYOUWANTTOLOGOUT);
        if (option == 0) {
            Login log = new Login();
            log.setVisible(true);
            try {
                SimpleDateFormat sdfD = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat sdfT = new SimpleDateFormat("hh:mm:ss");
                Database.sendData("INSERT INTO loginsession(lgs_outTime,lgs_date) "
                        + "VALUES('" + sdfT.format(new Date()) + "', '" + sdfD.format(new Date()) + "')");
                Database.sendData("INSERT INTO notification (nti_title, nti_body, nti_date, nti_time) "
                        + "VALUES('LOGOUT','USER LOGOUT FROM SYSTEM!','" + sdfD.format(new Date()) + "','" + sdfT.format(new Date()) + "')");
            } catch (Exception e) {
                System.out.println(e);
            }
            dispose();
        }
    }//GEN-LAST:event_jLabel49MouseClicked

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
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Setting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clt_deactive;
    private javax.swing.JButton btn_flr_deactive;
    private javax.swing.JButton btn_itp_deactive;
    private javax.swing.JButton btn_rmt_deactive;
    private javax.swing.JButton btn_sbt_deactive;
    private javax.swing.JButton btn_utp_deactive;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tab_clt_preview;
    private javax.swing.JTable tab_flr_preview;
    private javax.swing.JTable tab_itp_preview;
    private javax.swing.JTable tab_rmt_preview;
    private javax.swing.JTextField tab_sbt_preview;
    private javax.swing.JTable tab_utp_preview;
    private javax.swing.JTextField txt_clt_type;
    private javax.swing.JTextField txt_flr_no;
    private javax.swing.JTextField txt_itp_type;
    private javax.swing.JTextField txt_rmt_type;
    private javax.swing.JTextField txt_utp_type;
    // End of variables declaration//GEN-END:variables

    private void fetchDataToUserTable() {
        try {
            ResultSet rs = Database.getData("SELECT `employee`.`emp_fname`, `employee`.`emp_mname`, `employee`.`emp_lname`, `user`.`use_username`, `user`.`use_password`, `usertype`.`utp_type`\n"
                    + "FROM `cambridge_project`.`user` INNER JOIN `cambridge_project`.`usertype` ON (`user`.`utp_id` = `usertype`.`utp_id`)\n"
                    + "INNER JOIN `cambridge_project`.`employee` ON (`employee`.`use_id` = `user`.`use_id`) AND (`user`.`emp_id` = `employee`.`emp_id`) WHERE user.`use_state` = 'active'");
            DefaultTableModel dtm = (DefaultTableModel) jTable9.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("emp_fname") + " " + rs.getString("emp_mname") + " " + rs.getString("emp_lname") + "");
                v.add(rs.getString("use_username"));
                v.add(rs.getString("use_password"));
                v.add(rs.getString("utp_type"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fetchDataToLoginHistory() {
        try {
            ResultSet rs = Database.getData("SELECT\n"
                    + "    `user`.`use_username`\n"
                    + "    , `loginsession`.`lgs_inTime`\n"
                    + "    , `loginsession`.`lgs_outTime`\n"
                    + "    , `loginsession`.`lgs_date`\n"
                    + "FROM\n"
                    + "    `cambridge_project`.`loginsession`\n"
                    + "    INNER JOIN `cambridge_project`.`user` \n"
                    + "        ON (`loginsession`.`use_id` = `user`.`use_id`)");
            DefaultTableModel dtm = (DefaultTableModel) jTable8.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("lgs_date"));
                v.add(rs.getString("lgs_inTime"));
                v.add(rs.getString("lgs_outTime"));
                v.add(rs.getString("use_username"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fetchDataToNotification() {
        try {
            ResultSet rs = Database.getData("SELECT\n"
                    + "    `notification`.`nti_title`\n"
                    + "    , `notification`.`nti_body`\n"
                    + "    , `notification`.`nti_date`\n"
                    + "    , `notification`.`nti_time`\n"
                    + "    , `user`.`use_username`\n"
                    + "FROM\n"
                    + "    `cambridge_project`.`notification`\n"
                    + "    INNER JOIN `cambridge_project`.`user` \n"
                    + "        ON (`notification`.`use_id` = `user`.`use_id`)");
            DefaultTableModel dtm = (DefaultTableModel) jTable7.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("nti_title"));
                v.add(rs.getString("nti_body"));
                v.add(rs.getString("nti_date"));
                v.add(rs.getString("nti_time"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fetchDataToTypeManagerTable() {
        try {
            ResultSet rs1 = Database.getData("SELECT rmt_type FROM roomType");
            DefaultTableModel dtm1 = (DefaultTableModel) tab_rmt_preview.getModel();
            dtm1.setRowCount(0);
            while (rs1.next()) {
                Vector v = new Vector();
                v.add(rs1.getString("rmt_type"));
                dtm1.addRow(v);
            }
            ResultSet rs2 = Database.getData("SELECT clt_type FROM classType");
            DefaultTableModel dtm2 = (DefaultTableModel) tab_clt_preview.getModel();
            dtm2.setRowCount(0);
            while (rs2.next()) {
                Vector v = new Vector();
                v.add(rs2.getString("clt_type"));
                dtm2.addRow(v);
            }
            ResultSet rs3 = Database.getData("SELECT flr_no FROM Floor");
            DefaultTableModel dtm3 = (DefaultTableModel) tab_flr_preview.getModel();
            dtm3.setRowCount(0);
            while (rs3.next()) {
                Vector v = new Vector();
                v.add(rs3.getString("flr_no"));
                dtm3.addRow(v);
            }
            ResultSet rs4 = Database.getData("SELECT sbt_type FROM subjectType");
            DefaultTableModel dtm4 = (DefaultTableModel) jTable2.getModel();
            dtm4.setRowCount(0);
            while (rs4.next()) {
                Vector v = new Vector();
                v.add(rs4.getString("sbt_type"));
                dtm4.addRow(v);
            }
            ResultSet rs5 = Database.getData("SELECT utp_type FROM userType");
            DefaultTableModel dtm5 = (DefaultTableModel) tab_utp_preview.getModel();
            dtm5.setRowCount(0);
            while (rs5.next()) {
                Vector v = new Vector();
                v.add(rs5.getString("utp_type"));
                dtm5.addRow(v);
            }
            ResultSet rs6 = Database.getData("SELECT itc_code FROM itemCode");
            DefaultTableModel dtm6 = (DefaultTableModel) tab_itp_preview.getModel();
            dtm6.setRowCount(0);
            while (rs6.next()) {
                Vector v = new Vector();
                v.add(rs6.getString("itc_code"));
                dtm6.addRow(v);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fetchDataToBacupHistoryFields() {
        try {
            FileReader fr = new FileReader("BackupHistroy.txt");
            BufferedReader br = new BufferedReader(fr);
            String detail[] = br.readLine().split(",");
            jTextField8.setText(detail[0]);
            jTextField12.setText(detail[1]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fetchDataToBackupFields() {
        try {
            FileReader fr = new FileReader("BackupHistroy.txt");
            BufferedReader br = new BufferedReader(fr);
            String detail[] = br.readLine().split(",");
            DefaultTableModel dtm = (DefaultTableModel) jTable10.getModel();
            Vector v = new Vector();
            v.add(detail[0]);
            v.add(detail[1]);
            v.add(detail[2]);
            dtm.addRow(v);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fetchDataToComboBox() {
        try {
            ResultSet rs1 = Database.getData("SELECT utp_type FROM userType");
            while (rs1.next()) {
                jComboBox1.addItem(rs1.getString("utp_type"));
            }
            ResultSet rs2 = Database.getData("SELECT emp_fname, emp_mname, emp_lname FROM Employee WHERE emp_position = 'TEACHER'");
            if (rs2.next()) {
                jComboBox2.addItem(rs2.getString("emp_fname") + " " + rs2.getString("emp_mname") + " " + rs2.getString("emp_lname"));
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
                jLabel50.setText(date);
                sdf = new SimpleDateFormat("hh:mm:ss");
                time = sdf.format(d);
                jLabel51.setText(time);
            }
        });
        t.start();
    }
}
