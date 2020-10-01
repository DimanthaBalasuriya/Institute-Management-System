package com.prog.cnv.sys.control.system.student.Teacher;

import com.prog.cnv.sys.control.system.control.Database;
import com.prog.cnv.sys.control.system.control.Message;
import com.prog.cnv.sys.control.system.student.ClassManagement.ClassSchedule;
import com.prog.cnv.sys.control.system.student.Login;
import com.prog.cnv.sys.control.system.student.StudentManagement.StudentList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TeacherRegistration extends javax.swing.JFrame {

    char tecGender = 'N';
    String fcard = "N";
    int user;

    public TeacherRegistration() {
        initComponents();
        setDateAndTime();
        fetchDataToSidePanelLable();
    }

    public TeacherRegistration(String user) {
        this();
        this.user = Integer.parseInt(user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txt_tre_address = new javax.swing.JTextField();
        txt_tre_nic = new javax.swing.JTextField();
        txt_tre_fname = new javax.swing.JTextField();
        txt_tre_lname = new javax.swing.JTextField();
        txt_tre_mname = new javax.swing.JTextField();
        txt_tre_email = new javax.swing.JTextField();
        txt_tre_rfid = new javax.swing.JTextField();
        txt_tre_mobile = new javax.swing.JTextField();
        txt_tre_home = new javax.swing.JTextField();
        txt_tre_street = new javax.swing.JTextField();
        txt_tre_city = new javax.swing.JTextField();
        jdc_tre_bday = new com.toedter.calendar.JDateChooser();
        jrb_tre_female = new javax.swing.JRadioButton();
        jrb_tre_male = new javax.swing.JRadioButton();
        cb_tre_ffcard = new javax.swing.JCheckBox();
        jLabel52 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btn_tre_schedule = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);

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

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 15, 110, 15));

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 110, 15));

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
        jLabel5.setText("Teacher register");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Teacher", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("NIC");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel25.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("First name");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jLabel26.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Last name");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, -1, -1));

        jLabel27.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Mid name");
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));

        jLabel28.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("DOB");
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel29.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Gender");
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        jLabel30.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Email");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, -1));

        jLabel31.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Mobile");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, -1, -1));

        jLabel32.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Home");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel34.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("City");
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, -1, -1));

        jLabel36.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("RFID");
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel38.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Address");
        jPanel6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jLabel39.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Street");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, -1, -1));

        txt_tre_address.setFont(new java.awt.Font("Microsoft JhengHei", 1, 16)); // NOI18N
        txt_tre_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tre_addressActionPerformed(evt);
            }
        });
        jPanel6.add(txt_tre_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 190, 30));

        txt_tre_nic.setFont(new java.awt.Font("Microsoft JhengHei", 1, 16)); // NOI18N
        txt_tre_nic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tre_nicActionPerformed(evt);
            }
        });
        txt_tre_nic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tre_nicKeyTyped(evt);
            }
        });
        jPanel6.add(txt_tre_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 190, 30));

        txt_tre_fname.setFont(new java.awt.Font("Microsoft JhengHei", 1, 16)); // NOI18N
        txt_tre_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tre_fnameActionPerformed(evt);
            }
        });
        jPanel6.add(txt_tre_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 190, 30));

        txt_tre_lname.setFont(new java.awt.Font("Microsoft JhengHei", 1, 16)); // NOI18N
        txt_tre_lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tre_lnameActionPerformed(evt);
            }
        });
        jPanel6.add(txt_tre_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, 190, 30));

        txt_tre_mname.setFont(new java.awt.Font("Microsoft JhengHei", 1, 16)); // NOI18N
        txt_tre_mname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tre_mnameActionPerformed(evt);
            }
        });
        jPanel6.add(txt_tre_mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 190, 30));

        txt_tre_email.setFont(new java.awt.Font("Microsoft JhengHei", 1, 16)); // NOI18N
        txt_tre_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tre_emailActionPerformed(evt);
            }
        });
        txt_tre_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tre_emailKeyTyped(evt);
            }
        });
        jPanel6.add(txt_tre_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 190, 30));

        txt_tre_rfid.setFont(new java.awt.Font("Microsoft JhengHei", 1, 16)); // NOI18N
        txt_tre_rfid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tre_rfidKeyTyped(evt);
            }
        });
        jPanel6.add(txt_tre_rfid, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 190, 30));

        txt_tre_mobile.setFont(new java.awt.Font("Microsoft JhengHei", 1, 16)); // NOI18N
        txt_tre_mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tre_mobileActionPerformed(evt);
            }
        });
        txt_tre_mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tre_mobileKeyTyped(evt);
            }
        });
        jPanel6.add(txt_tre_mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 70, 190, 30));

        txt_tre_home.setFont(new java.awt.Font("Microsoft JhengHei", 1, 16)); // NOI18N
        txt_tre_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tre_homeActionPerformed(evt);
            }
        });
        txt_tre_home.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tre_homeKeyTyped(evt);
            }
        });
        jPanel6.add(txt_tre_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 190, 30));

        txt_tre_street.setFont(new java.awt.Font("Microsoft JhengHei", 1, 16)); // NOI18N
        txt_tre_street.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tre_streetActionPerformed(evt);
            }
        });
        jPanel6.add(txt_tre_street, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 190, 30));

        txt_tre_city.setFont(new java.awt.Font("Microsoft JhengHei", 1, 16)); // NOI18N
        txt_tre_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tre_cityActionPerformed(evt);
            }
        });
        jPanel6.add(txt_tre_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 110, 190, 30));
        jPanel6.add(jdc_tre_bday, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 190, 30));

        buttonGroup1.add(jrb_tre_female);
        jrb_tre_female.setText("Female");
        jrb_tre_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_tre_femaleActionPerformed(evt);
            }
        });
        jPanel6.add(jrb_tre_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 80, -1));

        buttonGroup1.add(jrb_tre_male);
        jrb_tre_male.setText("Male");
        jrb_tre_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_tre_maleActionPerformed(evt);
            }
        });
        jPanel6.add(jrb_tre_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 70, -1));

        cb_tre_ffcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tre_ffcardActionPerformed(evt);
            }
        });
        jPanel6.add(cb_tre_ffcard, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, 20));

        jLabel52.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Free card");
        jPanel6.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, 20));

        jButton3.setText("ADD");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1087, 160, 100, 30));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 200));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Class schedule", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_tre_schedule.setText("REGISTER");
        btn_tre_schedule.setBorder(null);
        btn_tre_schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tre_scheduleActionPerformed(evt);
            }
        });
        jPanel7.add(btn_tre_schedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 460, 140, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIC", "FIRST NAME", "MID NAME", "LAST NAME", "DOB", "GENDER", "MOBILE", "HOME", "EMAIL", "ADDRES", "STREET", "CITY", "RFID", "FREE CARD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
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
            jTable1.getColumnModel().getColumn(8).setResizable(false);
            jTable1.getColumnModel().getColumn(9).setResizable(false);
            jTable1.getColumnModel().getColumn(10).setResizable(false);
            jTable1.getColumnModel().getColumn(11).setResizable(false);
            jTable1.getColumnModel().getColumn(12).setResizable(false);
            jTable1.getColumnModel().getColumn(13).setResizable(false);
        }

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 21, 1180, 430));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 1200, 510));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 140, 10));

        jButton1.setText("SUBJECT LIST");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 140, 50));

        jButton2.setText("TEACHER LIST");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 50));

        jButton4.setText("STUDENT LIST");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, 50));

        jButton6.setText("SCHEDULE");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 140, 50));

        jButton7.setText("SUBJECT");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 140, 50));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_abacus_70px.png"))); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 40, 40));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_class_70px.png"))); // NOI18N
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 40, 40));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_students_70px.png"))); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 40, 40));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_School_Director_70px_1.png"))); // NOI18N
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 40, 40));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("TEACHER");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 60, 20));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("STUDENT");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 60, 20));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("CLASS");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 60, 20));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("SUBJECT");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 640, 60, 20));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setToolTipText("");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 30, 20));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setToolTipText("");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 30, 20));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setToolTipText("");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 30, 20));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setToolTipText("");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 660, 30, 20));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 140, 60));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 140, 60));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 140, 60));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 140, 60));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1207, 8, 160, 700));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1370, 710));

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

    private void btn_tre_scheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tre_scheduleActionPerformed
//        String fcard = "deactive";
        try {
//            if (fcardAccept == true) {
//                fcard = "active";
//            }
//            Date d = jdc_tre_bday.getDate();
            SimpleDateFormat sdfD = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sdfT = new SimpleDateFormat("hh:mm:dd");
//            Database.sendData("INSERT INTO Employee(emp_nic, emp_fname, emp_mname, emp_lname, emp_dob, emp_gender, "
//                    + "emp_position, emp_add_no, emp_add_street, emp_add_city, emp_email, emp_mobile, "
//                    + "emp_home, emp_wState, emp_pRate, emp_rfid, emp_image, emp_tec_free_card_state, "
//                    + "emp_reg_date, emp_reg_time, use_id) "
//                    + "VALUES('" + txt_tre_nic.getText() + "','" + txt_tre_fname.getText() + "','" + txt_tre_mname.getText() + "','" + txt_tre_lname.getText() + "','" + sdf.format(d) + "',"
//                    + "'" + tecGender + "','TEACHER', '" + txt_tre_address.getText() + "', '" + txt_tre_street.getText() + "','" + txt_tre_city.getText() + "','" + txt_tre_email.getText() + "', '" + txt_tre_mobile.getText() + "',"
//                    + "'" + txt_tre_home.getText() + "','" + cb_tre_wtype.getSelectedItem() + "', '" + Double.parseDouble(txt_tre_salary.getText()) + "', '" + txt_tre_rfid.getText() + "','" + "img" + "',"
//                    + "'" + fcard + "','" + sdf.format(new Date()) + "', '" + sdfT.format(new Date()) + "','" + user + "')");
//            DefaultTableModel dtm = (DefaultTableModel) tab_tre_preview.getModel();
//            for (int i = 0; i < dtm.getRowCount(); i++) {
//                Database.sendData("INSERT INTO Class(cls_sTime, cls_eTime, cls_wType, cls_day, cls_fee, cls_aFee, "
//                        + "cls_grade, sub_id, clr_id, emp_id, clt_id, cls_reg_date, cls_reg_time, use_id, cls_end_date, cls_pmt_comi) "
//                        + "VALUES('" + dtm.getValueAt(i, 3) + "','" + dtm.getValueAt(i, 4) + "','" + dtm.getValueAt(i, 5) + "', '" + dtm.getValueAt(i, 6) + "', '" + dtm.getValueAt(i, 8) + "','" + dtm.getValueAt(i, 7) + "','" + dtm.getValueAt(i, 9) + "',"
//                        + "(SELECT sub_id FROM Subject WHERE sub_name = '" + dtm.getValueAt(i, 0) + "' AND sbt_id = (SELECT sbt_id FROM subjectType WHERE sbt_type = '" + dtm.getValueAt(i, 1) + "')),(SELECT clr_id FROM classRoom WHERE clr_no = '" + dtm.getValueAt(i, 10) + "' AND rmt_id = (SELECT rmt_id FROM roomType WHERE rmt_type = '" + dtm.getValueAt(i, 11) + "') AND flr_id = (SELECT flr_id FROM Floor WHERE flr_no = '" + dtm.getValueAt(i, 12) + "')),(SELECT emp_id FROM Employee WHERE emp_nic = '" + txt_tre_nic.getText() + "'),"
//                        + "(SELECT clt_id FROM classType WHERE clt_type = '" + dtm.getValueAt(i, 2) + "'),'" + sdf.format(new Date()) + "','" + sdfT.format(new Date()) + "','" + user + "', '" + dtm.getValueAt(i, 14) + "','" + Double.parseDouble(dtm.getValueAt(i, 15).toString()) + "')");
//            }
//            ResultSet ra1 = Database.getData("SELECT emp_id FROM Employee WHERE emp_fname = '" + txt_tre_fname.getText() + "' AND emp_mname = '" + txt_tre_mname.getText() + "' AND emp_lname = '" + txt_tre_lname.getText() + "' AND emp_nic = '" + txt_tre_nic.getText() + "' AND emp_position = 'TEACHER'");
//            if (ra1.next()) {//acc_id, acc_time, acc_date, acc_amount, acc_state, emp_id
//                int teacher = Integer.parseInt(ra1.getString("emp_id"));
//                SimpleDateFormat sdfTT = new SimpleDateFormat("hh:mm:ss");
//                SimpleDateFormat sdfDD = new SimpleDateFormat("yyyy-MM-dd");
//                Database.sendData("INSERT INTO Account(acc_time, acc_date, acc_amount, emp_id) "
//                        + "VALUES('" + sdfTT.format(new Date()) + "', '" + sdfDD.format(new Date()) + "', '" + 0 + "', '" + teacher + "')");
//            }
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            for (int i = 0; i < dtm.getRowCount(); i++) {
                Database.sendData("INSERT INTO Employee (emp_nic, emp_fname, emp_mname, emp_lname, emp_dob, emp_gender, emp_position, emp_add_no, emp_add_street, emp_add_city, emp_email, emp_mobile, emp_home, emp_rfid, emp_tec_free_card_state, emp_reg_date, emp_reg_time, use_id) "
                        + "VALUES('" + dtm.getValueAt(i, 0) + "', '" + dtm.getValueAt(i, 1) + "', '" + dtm.getValueAt(i, 2) + "', '" + dtm.getValueAt(i, 3) + "', '" + dtm.getValueAt(i, 4) + "', '" + dtm.getValueAt(i, 5) + "', 'TEACHER', '" + dtm.getValueAt(i, 9) + "','" + dtm.getValueAt(i, 10) + "', '" + dtm.getValueAt(i, 11) + "', '" + dtm.getValueAt(i, 8) + "', '" + dtm.getValueAt(i, 6) + "', '" + dtm.getValueAt(i, 7) + "', '" + dtm.getValueAt(i, 12) + "', '" + dtm.getValueAt(i, 13) + "', '" + sdfD.format(new Date()) + "', '" + sdfT.format(new Date()) + "', '1')");
                ResultSet rs1 = Database.getData("SELECT emp_id FROM Employee WHERE emp_nic = '" + dtm.getValueAt(i, 0) + "'");
                if (rs1.next()) {
                    int employee = rs1.getInt("emp_id");
                    Database.sendData("INSERT INTO Account (acc_time, acc_date, acc_amount, emp_id) "
                            + "VALUES('" + sdfT.format(new Date()) + "', '" + sdfD.format(new Date()) + "', '0','" + employee + "')");
                }
            }
            JOptionPane.showMessageDialog(null, Message.SUCCESSFULLDATAINSERT);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_tre_scheduleActionPerformed

    private void jrb_tre_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_tre_maleActionPerformed
        tecGender = 'M';
    }//GEN-LAST:event_jrb_tre_maleActionPerformed

    private void jrb_tre_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_tre_femaleActionPerformed
        tecGender = 'F';
    }//GEN-LAST:event_jrb_tre_femaleActionPerformed

    private void cb_tre_ffcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tre_ffcardActionPerformed
        fcard = "A";
    }//GEN-LAST:event_cb_tre_ffcardActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TeacherList tl = new TeacherList(user + "");
        tl.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        StudentList sl = new StudentList(user + "");
        sl.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SubjectList sl = new SubjectList(user + "");
        sl.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        RegisterSubject rs = new RegisterSubject(user + "");
        rs.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ClassSchedule csc = new ClassSchedule(user + "");
        csc.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txt_tre_nicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tre_nicActionPerformed
        txt_tre_fname.grabFocus();
    }//GEN-LAST:event_txt_tre_nicActionPerformed

    private void txt_tre_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tre_fnameActionPerformed
        txt_tre_lname.grabFocus();
    }//GEN-LAST:event_txt_tre_fnameActionPerformed

    private void txt_tre_lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tre_lnameActionPerformed
        jdc_tre_bday.grabFocus();
    }//GEN-LAST:event_txt_tre_lnameActionPerformed

    private void txt_tre_mnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tre_mnameActionPerformed
        txt_tre_lname.grabFocus();
    }//GEN-LAST:event_txt_tre_mnameActionPerformed

    private void txt_tre_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tre_emailActionPerformed
        if (txt_tre_email.getText().contains("@") && txt_tre_email.getText().contains(".com")) {
            txt_tre_mobile.grabFocus();
        } else {
            JOptionPane.showMessageDialog(null, "INVALID EMAIL!");
        }
    }//GEN-LAST:event_txt_tre_emailActionPerformed

    private void txt_tre_mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tre_mobileActionPerformed
        txt_tre_home.grabFocus();
    }//GEN-LAST:event_txt_tre_mobileActionPerformed

    private void txt_tre_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tre_homeActionPerformed
        txt_tre_address.grabFocus();
    }//GEN-LAST:event_txt_tre_homeActionPerformed

    private void txt_tre_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tre_addressActionPerformed
        txt_tre_street.grabFocus();
    }//GEN-LAST:event_txt_tre_addressActionPerformed

    private void txt_tre_streetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tre_streetActionPerformed
        txt_tre_city.grabFocus();
    }//GEN-LAST:event_txt_tre_streetActionPerformed

    private void txt_tre_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tre_cityActionPerformed

    }//GEN-LAST:event_txt_tre_cityActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = jdc_tre_bday.getDate();
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        Vector v = new Vector();
        v.add(txt_tre_nic.getText());
        v.add(txt_tre_fname.getText());
        v.add(txt_tre_mname.getText());
        v.add(txt_tre_lname.getText());
        v.add(sdf.format(d));
        v.add(tecGender);
        v.add(txt_tre_mobile.getText());
        v.add(txt_tre_home.getText());
        v.add(txt_tre_home.getText());
        v.add(txt_tre_address.getText());
        v.add(txt_tre_street.getText());
        v.add(txt_tre_city.getText());
        v.add(txt_tre_rfid.getText());
        v.add(fcard);
        dtm.addRow(v);
    }//GEN-LAST:event_jButton3ActionPerformed

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

    private void txt_tre_nicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tre_nicKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c))) {
            if (txt_tre_nic.getText().length() == 12) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_tre_nicKeyTyped

    private void txt_tre_mobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tre_mobileKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c))) {
            if (txt_tre_mobile.getText().length() == 10) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_tre_mobileKeyTyped

    private void txt_tre_homeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tre_homeKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c))) {
            if (txt_tre_home.getText().length() == 10) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_tre_homeKeyTyped

    private void txt_tre_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tre_emailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tre_emailKeyTyped

    private void txt_tre_rfidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tre_rfidKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_tre_rfidKeyTyped

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
            java.util.logging.Logger.getLogger(TeacherRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_tre_schedule;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cb_tre_ffcard;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jdc_tre_bday;
    private javax.swing.JRadioButton jrb_tre_female;
    private javax.swing.JRadioButton jrb_tre_male;
    private javax.swing.JTextField txt_tre_address;
    private javax.swing.JTextField txt_tre_city;
    private javax.swing.JTextField txt_tre_email;
    private javax.swing.JTextField txt_tre_fname;
    private javax.swing.JTextField txt_tre_home;
    private javax.swing.JTextField txt_tre_lname;
    private javax.swing.JTextField txt_tre_mname;
    private javax.swing.JTextField txt_tre_mobile;
    private javax.swing.JTextField txt_tre_nic;
    private javax.swing.JTextField txt_tre_rfid;
    private javax.swing.JTextField txt_tre_street;
    // End of variables declaration//GEN-END:variables

    private void fetchDataToSidePanelLable() {
        try {
            ResultSet rs1 = Database.getData("SELECT COUNT(emp_id) AS tecCount FROM Employee WHERE emp_position = 'TEACHER'");
            if (rs1.next()) {
                jLabel20.setText(rs1.getString("tecCount"));
            }
            ResultSet rs2 = Database.getData("SELECT COUNT(std_id) AS stdCount FROM Student");
            if (rs2.next()) {
                jLabel19.setText(rs2.getString("stdCount"));
            }
            ResultSet rs3 = Database.getData("SELECT COUNT(cls_id) AS clsCount FROM Class");
            if (rs3.next()) {
                jLabel21.setText(rs3.getString("clsCount"));
            }
            ResultSet rs4 = Database.getData("SELECT COUNT(sub_id) AS subCount FROM Subject");
            if (rs4.next()) {
                jLabel24.setText(rs4.getString("subCount"));
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
                jLabel33.setText(date);
                sdf = new SimpleDateFormat("hh:mm:ss");
                time = sdf.format(d);
                jLabel25.setText(time);
            }
        });
        t.start();
    }

}
