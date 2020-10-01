package com.prog.cnv.sys.control.system.student.StudentManagement;

import com.prog.cnv.sys.control.system.control.Database;
import com.prog.cnv.sys.control.system.control.Message;
import static com.prog.cnv.sys.control.system.control.Message.*;
import com.prog.cnv.sys.control.system.control.UsualMethod;
import com.prog.cnv.sys.control.system.student.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CHAMOD DIYAMANTHA BALASURIYA
 */
public class StudentRegister extends javax.swing.JFrame {

    int user;
    String pmethod;

    public StudentRegister() {
        initComponents();
        setDateAndTime();
        comboBoxValue();
        fetchDataToSideTable();
        fetchDataToUpperLable();
    }

    public StudentRegister(String user) {
        this();
        this.user = Integer.parseInt(user);
        System.out.println(user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txt_sre_fname = new javax.swing.JTextField();
        jrb_sre_male = new javax.swing.JRadioButton();
        jrb_sre_female = new javax.swing.JRadioButton();
        cb_sre_bday = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_sre_school = new javax.swing.JTextField();
        cb_sre_language = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_sre_mobile = new javax.swing.JTextField();
        txt_sre_email = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_sre_address = new javax.swing.JTextField();
        txt_sre_rfid = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_sre_home = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_sre_city = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_sre_mname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_sre_lname = new javax.swing.JTextField();
        avatar = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_sre_street = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_sre_paddress = new javax.swing.JTextArea();
        txt_sre_office = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cb_sre_relation = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        txt_sre_occupation = new javax.swing.JTextField();
        txt_sre_pemail = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txt_sre_pmobile = new javax.swing.JTextField();
        txt_sre_name = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txt_sre_dmount = new javax.swing.JTextField();
        txt_sre_ntotal = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txt_sre_balance = new javax.swing.JTextField();
        txt_sre_tfee = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tab_sre_tch = new javax.swing.JTable();
        txt_sre_payment = new javax.swing.JTextField();
        txt_sre_ta = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tab_sre_cpr = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        cb_sre_tec = new javax.swing.JComboBox<>();
        cb_sre_subject = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jrb_sre_cash = new javax.swing.JRadioButton();
        jrb_sre_card = new javax.swing.JRadioButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel59 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
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

        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 15, 110, 15));

        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 110, 15));

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

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student Register");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.CardLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student detail", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Microsoft JhengHei", 1, 14))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("First name");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txt_sre_fname.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        txt_sre_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_fnameActionPerformed(evt);
            }
        });
        jPanel8.add(txt_sre_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 210, 40));

        jrb_sre_male.setBackground(new java.awt.Color(255, 255, 255));
        jrb_sre_male.setText("Male");
        jPanel8.add(jrb_sre_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jrb_sre_female.setBackground(new java.awt.Color(255, 255, 255));
        jrb_sre_female.setText("Female");
        jPanel8.add(jrb_sre_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));
        jPanel8.add(cb_sre_bday, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 210, 40));

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Gender");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Birthday");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("School");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, -1, -1));

        txt_sre_school.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        txt_sre_school.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_schoolActionPerformed(evt);
            }
        });
        jPanel8.add(txt_sre_school, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 200, 40));

        cb_sre_language.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Sinhala", "English", "Tamil" }));
        cb_sre_language.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_sre_languageActionPerformed(evt);
            }
        });
        jPanel8.add(cb_sre_language, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 210, 40));

        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Language");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Mobile");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        txt_sre_mobile.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        txt_sre_mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_mobileActionPerformed(evt);
            }
        });
        txt_sre_mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sre_mobileKeyTyped(evt);
            }
        });
        jPanel8.add(txt_sre_mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 210, 40));

        txt_sre_email.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        txt_sre_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_emailActionPerformed(evt);
            }
        });
        jPanel8.add(txt_sre_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 210, 40));

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Email");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Address");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        txt_sre_address.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        txt_sre_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_addressActionPerformed(evt);
            }
        });
        jPanel8.add(txt_sre_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 210, 40));

        txt_sre_rfid.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        txt_sre_rfid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_rfidActionPerformed(evt);
            }
        });
        txt_sre_rfid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sre_rfidKeyTyped(evt);
            }
        });
        jPanel8.add(txt_sre_rfid, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 210, 40));

        jLabel21.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("RFID");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Home");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, -1, -1));

        txt_sre_home.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        txt_sre_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_homeActionPerformed(evt);
            }
        });
        txt_sre_home.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sre_homeKeyTyped(evt);
            }
        });
        jPanel8.add(txt_sre_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 200, 40));

        jLabel17.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("City");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, -1, -1));

        txt_sre_city.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        txt_sre_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_cityActionPerformed(evt);
            }
        });
        jPanel8.add(txt_sre_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 200, 40));

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Mid name");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        txt_sre_mname.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        txt_sre_mname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_mnameActionPerformed(evt);
            }
        });
        jPanel8.add(txt_sre_mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 210, 40));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Last name");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        txt_sre_lname.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jPanel8.add(txt_sre_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 200, 40));

        avatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        avatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                avatarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                avatarMouseExited(evt);
            }
        });
        jPanel8.add(avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 130, 190));

        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Street");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txt_sre_street.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        txt_sre_street.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_streetActionPerformed(evt);
            }
        });
        jPanel8.add(txt_sre_street, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 210, 40));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1160, 310));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Guadian details", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Microsoft JhengHei Light", 1, 14))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_sre_paddress.setColumns(20);
        txt_sre_paddress.setRows(5);
        jScrollPane1.setViewportView(txt_sre_paddress);

        jPanel9.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 550, 110));

        txt_sre_office.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        txt_sre_office.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_officeActionPerformed(evt);
            }
        });
        txt_sre_office.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sre_officeKeyTyped(evt);
            }
        });
        jPanel9.add(txt_sre_office, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 200, 40));

        jLabel27.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Address");
        jPanel9.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel25.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Office");
        jPanel9.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jLabel23.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Relation");
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        cb_sre_relation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Mother", "Father", "Grand father", "Grand mother" }));
        cb_sre_relation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_sre_relationActionPerformed(evt);
            }
        });
        jPanel9.add(cb_sre_relation, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 200, 40));

        jLabel26.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Occupation");
        jPanel9.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, -1));

        txt_sre_occupation.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        txt_sre_occupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_occupationActionPerformed(evt);
            }
        });
        jPanel9.add(txt_sre_occupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, 200, 40));

        txt_sre_pemail.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        txt_sre_pemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_pemailActionPerformed(evt);
            }
        });
        jPanel9.add(txt_sre_pemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, 200, 40));

        jLabel24.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Email");
        jPanel9.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, -1, -1));

        jLabel28.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Mobile");
        jPanel9.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txt_sre_pmobile.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        txt_sre_pmobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_pmobileActionPerformed(evt);
            }
        });
        txt_sre_pmobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sre_pmobileKeyTyped(evt);
            }
        });
        jPanel9.add(txt_sre_pmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 200, 40));

        txt_sre_name.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        txt_sre_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_nameActionPerformed(evt);
            }
        });
        jPanel9.add(txt_sre_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 200, 40));

        jLabel22.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Name");
        jPanel9.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jButton2.setText("NEXT");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 210, 140, 40));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 1170, 260));

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_abacus_70px.png"))); // NOI18N
        jPanel7.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 100, 110));

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_School_Director_70px_1.png"))); // NOI18N
        jPanel7.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 100, 110));

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_class_70px.png"))); // NOI18N
        jPanel7.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 100, 110));

        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Student_Male_70px.png"))); // NOI18N
        jPanel7.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 110));

        jLabel51.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Class Count");
        jPanel7.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 120, 30));

        jLabel52.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Student Count");
        jPanel7.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 120, 30));

        jLabel53.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Subject Count");
        jPanel7.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, 120, 30));

        jLabel54.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Teacher Count");
        jPanel7.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 120, 30));

        jLabel55.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 40, 30));

        jLabel56.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 40, 30));

        jLabel57.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 60, 40, 30));

        jLabel58.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 40, 30));

        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 240, 110));

        jLabel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 110));

        jLabel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 240, 110));

        jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 240, 110));

        jPanel5.add(jPanel7, "card3");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("PREVIOUS");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 100, 30));

        txt_sre_dmount.setEditable(false);
        jPanel6.add(txt_sre_dmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 660, 170, 40));

        txt_sre_ntotal.setEditable(false);
        jPanel6.add(txt_sre_ntotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 570, 170, 40));

        jButton3.setText("BILL");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 660, 240, 40));

        jLabel37.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Due Amount");
        jPanel6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 660, -1, 40));

        jLabel29.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Total");
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 570, -1, 30));

        txt_sre_balance.setEditable(false);
        jPanel6.add(txt_sre_balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 660, 170, 40));

        txt_sre_tfee.setEditable(false);
        jPanel6.add(txt_sre_tfee, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, 170, 40));

        jLabel34.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Fee");
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, -1, 30));

        jLabel36.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Balance ");
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 660, -1, 40));

        tab_sre_tch.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tab_sre_tch);
        if (tab_sre_tch.getColumnModel().getColumnCount() > 0) {
            tab_sre_tch.getColumnModel().getColumn(0).setResizable(false);
            tab_sre_tch.getColumnModel().getColumn(1).setResizable(false);
            tab_sre_tch.getColumnModel().getColumn(2).setResizable(false);
            tab_sre_tch.getColumnModel().getColumn(3).setResizable(false);
            tab_sre_tch.getColumnModel().getColumn(4).setResizable(false);
            tab_sre_tch.getColumnModel().getColumn(5).setResizable(false);
            tab_sre_tch.getColumnModel().getColumn(6).setResizable(false);
            tab_sre_tch.getColumnModel().getColumn(7).setResizable(false);
            tab_sre_tch.getColumnModel().getColumn(8).setResizable(false);
            tab_sre_tch.getColumnModel().getColumn(9).setResizable(false);
        }

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 1150, 220));

        txt_sre_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_paymentActionPerformed(evt);
            }
        });
        txt_sre_payment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sre_paymentKeyTyped(evt);
            }
        });
        jPanel6.add(txt_sre_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 660, 180, 40));

        txt_sre_ta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_taActionPerformed(evt);
            }
        });
        txt_sre_ta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sre_taKeyTyped(evt);
            }
        });
        jPanel6.add(txt_sre_ta, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 570, 170, 40));

        jLabel35.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Amount");
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, 40));

        jLabel38.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Admission");
        jPanel6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, -1, 30));

        jLabel33.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Total class schedule");
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, 30));

        tab_sre_cpr.setModel(new javax.swing.table.DefaultTableModel(
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
        tab_sre_cpr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab_sre_cprMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tab_sre_cpr);
        if (tab_sre_cpr.getColumnModel().getColumnCount() > 0) {
            tab_sre_cpr.getColumnModel().getColumn(0).setResizable(false);
            tab_sre_cpr.getColumnModel().getColumn(1).setResizable(false);
            tab_sre_cpr.getColumnModel().getColumn(2).setResizable(false);
            tab_sre_cpr.getColumnModel().getColumn(3).setResizable(false);
            tab_sre_cpr.getColumnModel().getColumn(4).setResizable(false);
            tab_sre_cpr.getColumnModel().getColumn(5).setResizable(false);
            tab_sre_cpr.getColumnModel().getColumn(6).setResizable(false);
            tab_sre_cpr.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel6.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1150, 200));

        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel19.setText("Teacher");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, 30));

        jLabel30.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel30.setText("Class Preview");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 40));

        jLabel31.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel31.setText("Subject");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        cb_sre_tec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel6.add(cb_sre_tec, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 200, 30));

        cb_sre_subject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cb_sre_subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_sre_subjectActionPerformed(evt);
            }
        });
        jPanel6.add(cb_sre_subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 160, 30));

        jButton6.setText("FIND");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 70, 30));

        jButton7.setText("REMOVE");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 45, 80, 30));

        jLabel39.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Card Type");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 70, 30));

        buttonGroup1.add(jrb_sre_cash);
        jrb_sre_cash.setText("CASH");
        jrb_sre_cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_sre_cashActionPerformed(evt);
            }
        });
        jPanel6.add(jrb_sre_cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 620, -1, -1));

        buttonGroup1.add(jrb_sre_card);
        jrb_sre_card.setText("CARD");
        jrb_sre_card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_sre_cardActionPerformed(evt);
            }
        });
        jPanel6.add(jrb_sre_card, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, -1, -1));

        jLabel40.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Payment");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, -1, 40));

        jLabel41.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Ref No");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 620, -1, 30));

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 620, 170, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "VISA", "MASTER" }));
        jComboBox1.setEnabled(false);
        jPanel6.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, 170, 30));

        jLabel59.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Card No");
        jPanel6.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 620, -1, 30));

        jTextField3.setEditable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 620, 170, 30));

        jLabel60.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Method");
        jPanel6.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, -1, 30));

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
        jPanel6.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 290, 180, 40));

        jLabel61.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Amount");
        jPanel6.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 290, -1, 40));

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel6.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 180, 40));

        jPanel5.add(jPanel6, "card2");

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1170, 710));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 40, 10, 690));

        jLabel32.setText("CLASS LIST");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 360, -1, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject", "Teacher"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 390, 180, 340));

        jLabel42.setText("STUDENT LIST");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 30, -1, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "School"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 60, 180, 300));

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
        jPanel6.setVisible(false);
        jPanel7.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jPanel7.setVisible(false);
        jPanel6.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_sre_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_emailActionPerformed
        if (txt_sre_email.getText().contains("@") && txt_sre_email.getText().contains(".com")) {
            txt_sre_address.grabFocus();
        } else {
            JOptionPane.showMessageDialog(null, "INVALID EMAIL!");
        }
    }//GEN-LAST:event_txt_sre_emailActionPerformed

    private void avatarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avatarMouseEntered
        avatar.setText("Set image");
    }//GEN-LAST:event_avatarMouseEntered

    private void avatarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avatarMouseExited
        avatar.setText("");
    }//GEN-LAST:event_avatarMouseExited

    private void cb_sre_subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_sre_subjectActionPerformed
        try {
            ResultSet rs = Database.getData("SELECT `employee`.`emp_fname`, `employee`.`emp_mname`, `employee`.`emp_lname`\n"
                    + "FROM `cambridge_project`.`class` INNER JOIN `cambridge_project`.`employee` ON (`class`.`emp_id` = `employee`.`emp_id`)\n"
                    + "INNER JOIN `cambridge_project`.`subject` ON (`class`.`sub_id` = `subject`.`sub_id`) WHERE `subject`.`sub_name`= '" + cb_sre_subject.getSelectedItem() + "'");
            cb_sre_tec.removeAllItems();
            while (rs.next()) {
                cb_sre_tec.addItem(rs.getString("emp_fname") + " " + rs.getString("emp_mname") + " " + rs.getString("emp_lname"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_cb_sre_subjectActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            String tecName[] = cb_sre_tec.getSelectedItem().toString().split(" ");
            ResultSet rs = Database.getData("SELECT `employee`.`emp_fname`, `employee`.`emp_mname`, `employee`.`emp_lname`, `subject`.`sub_name`, `classtype`.`clt_type`\n"
                    + ", `day`.`day_name`, `classscheduleday`.`csd_start_time`, `classscheduleday`.`csd_end_time`, `class`.`cls_fee`, `class`.`cls_grade` FROM\n"
                    + "`cambridge_project`.`classscheduleday` INNER JOIN `cambridge_project`.`day` ON (`classscheduleday`.`day_id` = `day`.`day_id`)\n"
                    + "INNER JOIN `cambridge_project`.`class` ON (`classscheduleday`.`cls_id` = `class`.`cls_id`) INNER JOIN `cambridge_project`.`employee` \n"
                    + "ON (`class`.`emp_id` = `employee`.`emp_id`) INNER JOIN `cambridge_project`.`subject` ON (`class`.`sub_id` = `subject`.`sub_id`)\n"
                    + "INNER JOIN `cambridge_project`.`classtype` ON (`class`.`clt_id` = `classtype`.`clt_id`) WHERE `class`.`cls_state` = '1' AND \n"
                    + "`employee`.`emp_fname` = '" + tecName[0] + "' AND `employee`.`emp_mname` = '" + tecName[1] + "' AND `employee`.`emp_lname` = '" + tecName[2] + "' AND `subject`.`sub_name` = '" + cb_sre_subject.getSelectedItem() + "'");
            DefaultTableModel dtm = (DefaultTableModel) tab_sre_cpr.getModel();
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
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tab_sre_cpr.getModel();
        dtm.removeRow(tab_sre_cpr.getSelectedRow());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void tab_sre_cprMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_sre_cprMouseClicked

    }//GEN-LAST:event_tab_sre_cprMouseClicked

    private void txt_sre_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_paymentActionPerformed
        double payment = Double.parseDouble(txt_sre_payment.getText());
        double nett = Double.parseDouble(txt_sre_ntotal.getText());
        if (payment < nett) {
            txt_sre_dmount.setText((nett - payment) + "");
            txt_sre_balance.setText((0.00) + "");
        } else if (payment >= nett) {
            txt_sre_balance.setText((payment - nett) + "");
            txt_sre_dmount.setText((0.00) + "");
        }
    }//GEN-LAST:event_txt_sre_paymentActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.out.println(user);
        Date d = cb_sre_bday.getDate();
        SimpleDateFormat sdfD = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdfT = new SimpleDateFormat("hh:mm:ss");
        String gender = "";
        if (jrb_sre_female.isSelected()) {
            gender = "F";
        } else if (jrb_sre_male.isSelected()) {
            gender = "M";
        }
        try {
            Database.sendData("INSERT INTO Student(std_fname, std_mname, std_lname, std_dob, std_gender, "
                    + "std_school, std_email, std_mobile, std_home, std_add_no, std_add_street, std_add_city, "
                    + "std_language, std_rfid, std_image, std_par_name, std_par_relation, std_par_email, "
                    + "std_par_mobile, std_par_home, std_par_occupation, std_par_address, std_reg_date, "
                    + "std_reg_time, use_id, std_reg_payment_st) "
                    + "VALUES('" + txt_sre_fname.getText() + "','" + txt_sre_mname.getText() + "','" + txt_sre_lname.getText() + "','" + sdfD.format(d) + "','" + gender + "','" + txt_sre_school.getText() + "',"
                    + "'" + txt_sre_email.getText() + "','" + txt_sre_mobile.getText() + "','" + txt_sre_home.getText() + "','" + txt_sre_address.getText() + "','" + txt_sre_street.getText() + "','" + txt_sre_city.getText() + "',"
                    + "'" + cb_sre_language.getSelectedItem() + "','" + txt_sre_rfid.getText() + "','" + "Image" + "','" + txt_sre_name.getText() + "','" + cb_sre_relation.getSelectedItem() + "','" + txt_sre_pemail.getText() + "',"
                    + "'" + txt_sre_pmobile.getText() + "','" + txt_sre_office.getText() + "','" + txt_sre_occupation.getText() + "','" + txt_sre_paddress.getText() + "','" + sdfD.format(new Date()) + "','" + sdfT.format(new Date()) + "',"
                    + "'" + user + "', '1')");
            DefaultTableModel dtm = (DefaultTableModel) tab_sre_tch.getModel();
            int clas = 0;
            int std = 0;
            for (int i = 0; i < dtm.getRowCount(); i++) {
                String teacher[] = dtm.getValueAt(i, 1).toString().split(" ");
                String student[] = dtm.getValueAt(i, 0).toString().split(" ");
                ResultSet rs1 = Database.getData("SELECT `class`.`cls_id` FROM `cambridge_project`.`classscheduleday` INNER JOIN `cambridge_project`.`class` \n"
                        + "ON (`classscheduleday`.`cls_id` = `class`.`cls_id`) INNER JOIN `cambridge_project`.`day` ON (`classscheduleday`.`day_id` = `day`.`day_id`)\n"
                        + "INNER JOIN `cambridge_project`.`classtype` ON (`class`.`clt_id` = `classtype`.`clt_id`) INNER JOIN `cambridge_project`.`subject` \n"
                        + "ON (`class`.`sub_id` = `subject`.`sub_id`) INNER JOIN `cambridge_project`.`employee` ON (`class`.`emp_id` = `employee`.`emp_id`)  WHERE \n"
                        + "`class`.`cls_grade` = '" + dtm.getValueAt(i, 7) + "' AND `class`.`cls_fee` = '" + dtm.getValueAt(i, 8) + "' AND `class`.`emp_id` = (SELECT emp_id FROM Employee WHERE emp_fname = '" + teacher[0] + "' \n"
                        + "AND emp_mname = '" + teacher[1] + "' AND emp_lname = '" + teacher[2] + "') AND `class`.`clt_id` = (SELECT clt_id FROM classType WHERE clt_type = '" + dtm.getValueAt(i, 3) + "') \n"
                        + "AND `day`.`day_id` = (SELECT day_id FROM DAY WHERE day_name = '" + dtm.getValueAt(i, 4) + "') AND `classscheduleday`.`csd_start_time` = '" + dtm.getValueAt(i, 5) + "' \n"
                        + "AND `classscheduleday`.`csd_end_time` = '" + dtm.getValueAt(i, 6) + "'");
                if (rs1.next()) {
                    clas = rs1.getInt("cls_id");
                }
                ResultSet rs2 = Database.getData("SELECT std_id FROM Student WHERE std_fname = '" + student[0] + "' AND std_mname = '" + student[1] + "' AND std_lname = '" + student[2] + "' AND std_email = '" + txt_sre_email.getText() + "'");
                if (rs2.next()) {
                    std = rs2.getInt("std_id");
                }
                Database.sendData("INSERT INTO studentClass(cls_id, std_id, sdc_reg_date, sdc_reg_time) "
                        + "VALUES('" + clas + "', '" + std + "', '" + sdfD.format(new Date()) + "', '" + sdfT.format(new Date()) + "')");
            }
            //Generate student bill
            int bill = 0;
            Database.sendData("INSERT INTO Bill(bil_time, bil_date, bil_total, bil_discount, bil_nettotal) "
                    + "VALUES('" + sdfT.format(new Date()) + "', '" + sdfD.format(new Date()) + "', '" + Double.parseDouble(txt_sre_ntotal.getText()) + "', '" + 0 + "', '" + 0 + "')");
            ResultSet rs3 = Database.getData("SELECT bil_id FROM Bill WHERE bil_time = '" + sdfT.format(new Date()) + "' AND bil_date = '" + sdfD.format(new Date()) + "' AND bil_total = '" + Double.parseDouble(txt_sre_ntotal.getText()) + "'");
            if (rs3.next()) {
                bill = rs3.getInt("bil_id");
            }
            DefaultTableModel dtm1 = (DefaultTableModel) tab_sre_tch.getModel();
            for (int i = 0; i < dtm1.getRowCount(); i++) {
                int classID = 0;
                String teacher[] = dtm.getValueAt(i, 1).toString().split(" ");
                ResultSet rs1 = Database.getData("SELECT `class`.`cls_id` FROM `cambridge_project`.`classscheduleday` INNER JOIN `cambridge_project`.`class` \n"
                        + "ON (`classscheduleday`.`cls_id` = `class`.`cls_id`) INNER JOIN `cambridge_project`.`day` ON (`classscheduleday`.`day_id` = `day`.`day_id`)\n"
                        + "INNER JOIN `cambridge_project`.`classtype` ON (`class`.`clt_id` = `classtype`.`clt_id`) INNER JOIN `cambridge_project`.`subject` \n"
                        + "ON (`class`.`sub_id` = `subject`.`sub_id`) INNER JOIN `cambridge_project`.`employee` ON (`class`.`emp_id` = `employee`.`emp_id`)  WHERE \n"
                        + "`class`.`cls_grade` = '" + dtm.getValueAt(i, 7) + "' AND `class`.`cls_fee` = '" + dtm.getValueAt(i, 8) + "' AND `class`.`emp_id` = (SELECT emp_id FROM Employee WHERE emp_fname = '" + teacher[0] + "' \n"
                        + "AND emp_mname = '" + teacher[1] + "' AND emp_lname = '" + teacher[2] + "') AND `class`.`clt_id` = (SELECT clt_id FROM classType WHERE clt_type = '" + dtm.getValueAt(i, 3) + "') \n"
                        + "AND `day`.`day_id` = (SELECT day_id FROM DAY WHERE day_name = '" + dtm.getValueAt(i, 4) + "') AND `classscheduleday`.`csd_start_time` = '" + dtm.getValueAt(i, 5) + "' \n"
                        + "AND `classscheduleday`.`csd_end_time` = '" + dtm.getValueAt(i, 6) + "'");
                if (rs1.next()) {
                    classID = rs1.getInt("cls_id");
                }
                Database.sendData("INSERT INTO classPayment (clp_time, clp_date, clp_amount, clp_currentFee, bil_id, cls_id) "
                        + "VALUES('" + sdfT.format(new Date()) + "', '" + sdfD.format(new Date()) + "', '" + Double.parseDouble(dtm1.getValueAt(i, 9).toString()) + "','" + Double.parseDouble(dtm1.getValueAt(i, 8).toString()) + "','" + bill + "', '" + classID + "')");
            }
            Database.sendData("INSERT INTO billpayment (blp_time, blp_date, blp_payment, blp_balance, blp_due, blp_pmtmethod, blp_card, blp_card_no, blp_ref_no, std_id, bil_id) "
                    + "VALUES('" + sdfT.format(new Date()) + "', '" + sdfD.format(new Date()) + "', '" + Double.parseDouble(txt_sre_payment.getText()) + "', '" + Double.parseDouble(txt_sre_balance.getText()) + "', '" + Double.parseDouble(txt_sre_dmount.getText()) + "', '" + pmethod + "',"
                    + "'" + jComboBox1.getSelectedItem() + "', '" + jTextField3.getText() + "', '" + jTextField2.getText() + "', (SELECT std_id FROM Student WHERE std_fname = '" + txt_sre_fname.getText() + "' AND std_mname = '" + txt_sre_mname.getText() + "' AND std_lname = '" + txt_sre_lname.getText() + "' AND std_home = '" + txt_sre_home.getText() + "'), '" + bill + "')");
            JOptionPane.showMessageDialog(null, Message.SUCCESSFULLDATAINSERT);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jrb_sre_cardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_sre_cardActionPerformed
        jTextField2.setEditable(true);
        jComboBox1.setEnabled(true);
        jTextField3.setEditable(true);
        pmethod = "CARD";
    }//GEN-LAST:event_jrb_sre_cardActionPerformed

    private void jrb_sre_cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_sre_cashActionPerformed
        jTextField2.setEditable(false);
        jComboBox1.setEnabled(false);
        jTextField3.setEditable(false);
        pmethod = "CASH";
    }//GEN-LAST:event_jrb_sre_cashActionPerformed

    private void txt_sre_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_fnameActionPerformed
        txt_sre_mname.grabFocus();
    }//GEN-LAST:event_txt_sre_fnameActionPerformed

    private void txt_sre_mnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_mnameActionPerformed
        txt_sre_lname.grabFocus();
    }//GEN-LAST:event_txt_sre_mnameActionPerformed

    private void cb_sre_languageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_sre_languageActionPerformed
        txt_sre_mobile.grabFocus();
    }//GEN-LAST:event_cb_sre_languageActionPerformed

    private void txt_sre_schoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_schoolActionPerformed
        cb_sre_language.grabFocus();
    }//GEN-LAST:event_txt_sre_schoolActionPerformed

    private void txt_sre_mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_mobileActionPerformed
        txt_sre_home.grabFocus();
    }//GEN-LAST:event_txt_sre_mobileActionPerformed

    private void txt_sre_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_homeActionPerformed
        txt_sre_email.grabFocus();
    }//GEN-LAST:event_txt_sre_homeActionPerformed

    private void txt_sre_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_cityActionPerformed
        txt_sre_street.grabFocus();
    }//GEN-LAST:event_txt_sre_cityActionPerformed

    private void txt_sre_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_addressActionPerformed
        txt_sre_city.grabFocus();
    }//GEN-LAST:event_txt_sre_addressActionPerformed

    private void txt_sre_streetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_streetActionPerformed
        txt_sre_rfid.grabFocus();
    }//GEN-LAST:event_txt_sre_streetActionPerformed

    private void txt_sre_rfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_rfidActionPerformed
        txt_sre_name.grabFocus();
    }//GEN-LAST:event_txt_sre_rfidActionPerformed

    private void txt_sre_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_nameActionPerformed
        cb_sre_relation.grabFocus();
    }//GEN-LAST:event_txt_sre_nameActionPerformed

    private void cb_sre_relationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_sre_relationActionPerformed
        txt_sre_pmobile.grabFocus();
    }//GEN-LAST:event_cb_sre_relationActionPerformed

    private void txt_sre_pmobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_pmobileActionPerformed
        txt_sre_office.grabFocus();
    }//GEN-LAST:event_txt_sre_pmobileActionPerformed

    private void txt_sre_officeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_officeActionPerformed
        txt_sre_pemail.grabFocus();
    }//GEN-LAST:event_txt_sre_officeActionPerformed

    private void txt_sre_pemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_pemailActionPerformed
        if (txt_sre_email.getText().contains("@") && txt_sre_email.getText().contains(".com")) {
            txt_sre_occupation.grabFocus();
        } else {
            JOptionPane.showMessageDialog(null, "INVALID EMAIL!");
        }

    }//GEN-LAST:event_txt_sre_pemailActionPerformed

    private void txt_sre_occupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_occupationActionPerformed
        txt_sre_paddress.grabFocus();
    }//GEN-LAST:event_txt_sre_occupationActionPerformed

    private void txt_sre_taActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_taActionPerformed
        double admission = Double.parseDouble(txt_sre_ta.getText());
        double total = Double.parseDouble(txt_sre_tfee.getText());
        double nettotal = admission + total;
        txt_sre_ntotal.setText(nettotal + "");
    }//GEN-LAST:event_txt_sre_taActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        DefaultTableModel dtm1 = (DefaultTableModel) tab_sre_cpr.getModel();
        DefaultTableModel dtm2 = (DefaultTableModel) tab_sre_tch.getModel();
        Vector v = new Vector();
        v.add(txt_sre_fname.getText() + " " + txt_sre_mname.getText() + " " + txt_sre_lname.getText() + "");
        v.add(dtm1.getValueAt(tab_sre_cpr.getSelectedRow(), 0));
        v.add(dtm1.getValueAt(tab_sre_cpr.getSelectedRow(), 1));
        v.add(dtm1.getValueAt(tab_sre_cpr.getSelectedRow(), 2));
        v.add(dtm1.getValueAt(tab_sre_cpr.getSelectedRow(), 3));
        v.add(dtm1.getValueAt(tab_sre_cpr.getSelectedRow(), 4));
        v.add(dtm1.getValueAt(tab_sre_cpr.getSelectedRow(), 5));
        v.add(dtm1.getValueAt(tab_sre_cpr.getSelectedRow(), 7));
        v.add(dtm1.getValueAt(tab_sre_cpr.getSelectedRow(), 6));
        v.add(jTextField1.getText());
        dtm2.addRow(v);
        double totalFee = 0.0;
        double totalPayment = 0.0;
        for (int i = 0; i < dtm2.getRowCount(); i++) {
            totalFee += Double.parseDouble(dtm2.getValueAt(i, 8).toString());
            totalPayment += Double.parseDouble(dtm2.getValueAt(i, 9).toString());
        }
        txt_sre_tfee.setText(totalFee + "");
        jTextField4.setText(totalPayment + "");
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

    private void txt_sre_mobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sre_mobileKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c))) {
            if (txt_sre_mobile.getText().length() == 10) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_sre_mobileKeyTyped

    private void txt_sre_homeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sre_homeKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c))) {
            if (txt_sre_home.getText().length() == 10) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_sre_homeKeyTyped

    private void txt_sre_rfidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sre_rfidKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_sre_rfidKeyTyped

    private void txt_sre_pmobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sre_pmobileKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c))) {
            if (txt_sre_pmobile.getText().length() == 10) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_sre_pmobileKeyTyped

    private void txt_sre_officeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sre_officeKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c))) {
            if (txt_sre_office.getText().length() == 10) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_sre_officeKeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || (evt.getKeyChar() == '.')) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || (evt.getKeyChar() == '.')) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void txt_sre_paymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sre_paymentKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || (evt.getKeyChar() == '.')) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_sre_paymentKeyTyped

    private void txt_sre_taKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sre_taKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || (evt.getKeyChar() == '.')) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_sre_taKeyTyped

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
            java.util.logging.Logger.getLogger(StudentRegister.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegister.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegister.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegister.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avatar;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser cb_sre_bday;
    private javax.swing.JComboBox<String> cb_sre_language;
    private javax.swing.JComboBox<String> cb_sre_relation;
    private javax.swing.JComboBox<String> cb_sre_subject;
    private javax.swing.JComboBox<String> cb_sre_tec;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JRadioButton jrb_sre_card;
    private javax.swing.JRadioButton jrb_sre_cash;
    private javax.swing.JRadioButton jrb_sre_female;
    private javax.swing.JRadioButton jrb_sre_male;
    private javax.swing.JTable tab_sre_cpr;
    private javax.swing.JTable tab_sre_tch;
    private javax.swing.JTextField txt_sre_address;
    private javax.swing.JTextField txt_sre_balance;
    private javax.swing.JTextField txt_sre_city;
    private javax.swing.JTextField txt_sre_dmount;
    private javax.swing.JTextField txt_sre_email;
    private javax.swing.JTextField txt_sre_fname;
    private javax.swing.JTextField txt_sre_home;
    private javax.swing.JTextField txt_sre_lname;
    private javax.swing.JTextField txt_sre_mname;
    private javax.swing.JTextField txt_sre_mobile;
    private javax.swing.JTextField txt_sre_name;
    private javax.swing.JTextField txt_sre_ntotal;
    private javax.swing.JTextField txt_sre_occupation;
    private javax.swing.JTextField txt_sre_office;
    private javax.swing.JTextArea txt_sre_paddress;
    private javax.swing.JTextField txt_sre_payment;
    private javax.swing.JTextField txt_sre_pemail;
    private javax.swing.JTextField txt_sre_pmobile;
    private javax.swing.JTextField txt_sre_rfid;
    private javax.swing.JTextField txt_sre_school;
    private javax.swing.JTextField txt_sre_street;
    private javax.swing.JTextField txt_sre_ta;
    private javax.swing.JTextField txt_sre_tfee;
    // End of variables declaration//GEN-END:variables

    private void comboBoxValue() {
        try {
            ResultSet rs = Database.getData("SELECT DISTINCT sub_name FROM Subject WHERE sub_state = 1");
            while (rs.next()) {
                cb_sre_subject.addItem(rs.getString("sub_name"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, DATASEARCHFROMSEARCHFIEDL);
        }
    }

    private void fetchDataToSideTable() {
        try {
            ResultSet rs1 = Database.getData("SELECT std_fname, std_mname, std_lname, std_school FROM Student");
            DefaultTableModel dtm1 = (DefaultTableModel) jTable2.getModel();
            dtm1.setRowCount(0);
            while (rs1.next()) {
                Vector v = new Vector();
                v.add(rs1.getString("std_fname") + " " + rs1.getString("std_mname") + " " + rs1.getString("std_lname"));
                v.add(rs1.getString("std_school"));
                dtm1.addRow(v);
            }
            ResultSet rs2 = Database.getData("SELECT `employee`.`emp_fname`, `employee`.`emp_mname`, `employee`.`emp_lname`, `subject`.`sub_name`, `classtype`.`clt_type` FROM\n"
                    + "`cambridge_project`.`class` INNER JOIN `cambridge_project`.`classtype` ON (`class`.`clt_id` = `classtype`.`clt_id`)\n"
                    + "INNER JOIN `cambridge_project`.`subject` ON (`class`.`sub_id` = `subject`.`sub_id`) INNER JOIN `cambridge_project`.`employee` \n"
                    + "ON (`class`.`emp_id` = `employee`.`emp_id`)");
            DefaultTableModel dtm2 = (DefaultTableModel) jTable1.getModel();
            dtm2.setRowCount(0);
            while (rs2.next()) {
                Vector v = new Vector();
                v.add(rs2.getString("sub_name"));
                v.add(rs2.getString("emp_fname") + " " + rs2.getString("emp_mname") + " " + rs2.getString("emp_lname"));
                dtm2.addRow(v);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fetchDataToUpperLable() {
        try {
            ResultSet rs1 = Database.getData("SELECT COUNT(std_id) AS stdCount FROM Student");
            if (rs1.next()) {
                jLabel55.setText(rs1.getInt("stdCount") + "");
            }
            ResultSet rs2 = Database.getData("SELECT COUNT(cls_id) AS clsCount FROM Class");
            if (rs2.next()) {
                jLabel56.setText(rs2.getInt("clsCount") + "");
            }
            ResultSet rs3 = Database.getData("SELECT COUNT(emp_id) AS tecCount FROM Employee WHERE emp_position = 'TEACHER'");
            if (rs3.next()) {
                jLabel58.setText(rs3.getInt("tecCount") + "");
            }
            ResultSet rs4 = Database.getData("SELECT COUNT(sub_id) AS subCount FROM Subject");
            if (rs4.next()) {
                jLabel57.setText(rs4.getInt("subCount") + "");
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
                jLabel62.setText(date);
                sdf = new SimpleDateFormat("hh:mm:ss");
                time = sdf.format(d);
                jLabel63.setText(time);
            }
        });
        t.start();
    }
}
