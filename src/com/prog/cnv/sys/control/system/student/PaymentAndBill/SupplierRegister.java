package com.prog.cnv.sys.control.system.student.PaymentAndBill;

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

public class SupplierRegister extends javax.swing.JFrame {

    int user;

    public SupplierRegister() {
        initComponents();
        setDateAndTime();
        fetchDataToLable();
        fetchDataToTable();
    }

    public SupplierRegister(String user) {
        this();
        this.user = Integer.parseInt(user);;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txt_sre_address = new javax.swing.JTextField();
        cb_sre_country = new javax.swing.JComboBox<>();
        txt_sre_email = new javax.swing.JTextField();
        txt_sre_conno = new javax.swing.JTextField();
        txt_sre_name = new javax.swing.JTextField();
        txt_sre_city = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txt_sre_web = new javax.swing.JTextField();
        txt_sre_faxno = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        btn_sre_add = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        txt_sre_street = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_sre_preview = new javax.swing.JTable();
        btn_sre_refresh = new javax.swing.JButton();
        btn_sre_update = new javax.swing.JButton();
        btn_sre_remove = new javax.swing.JButton();
        btn_sre_save = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
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
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

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

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 15, 110, 15));

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 110, 15));

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
        jLabel5.setText("Supplier register");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Name");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel29.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Contact no");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel31.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Email");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel36.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Country");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, -1, -1));

        jLabel33.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Address");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        txt_sre_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_addressActionPerformed(evt);
            }
        });
        jPanel5.add(txt_sre_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 160, 30));

        cb_sre_country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Sri Lanka", "India", "America" }));
        cb_sre_country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_sre_countryActionPerformed(evt);
            }
        });
        jPanel5.add(cb_sre_country, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, 130, 30));

        txt_sre_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_emailActionPerformed(evt);
            }
        });
        jPanel5.add(txt_sre_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 160, 30));

        txt_sre_conno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_connoActionPerformed(evt);
            }
        });
        txt_sre_conno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sre_connoKeyTyped(evt);
            }
        });
        jPanel5.add(txt_sre_conno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 160, 30));

        txt_sre_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_nameActionPerformed(evt);
            }
        });
        jPanel5.add(txt_sre_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 160, 30));

        txt_sre_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_cityActionPerformed(evt);
            }
        });
        jPanel5.add(txt_sre_city, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 160, 30));

        jLabel32.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Web");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        jLabel34.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("City");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        txt_sre_web.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_webActionPerformed(evt);
            }
        });
        jPanel5.add(txt_sre_web, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 160, 30));

        txt_sre_faxno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_faxnoActionPerformed(evt);
            }
        });
        txt_sre_faxno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sre_faxnoKeyTyped(evt);
            }
        });
        jPanel5.add(txt_sre_faxno, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 160, 30));

        jLabel30.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Fax no");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        btn_sre_add.setText("ADD");
        btn_sre_add.setBorder(null);
        btn_sre_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sre_addActionPerformed(evt);
            }
        });
        jPanel5.add(btn_sre_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 230, 80, 30));

        jLabel35.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Street");
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        txt_sre_street.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sre_streetActionPerformed(evt);
            }
        });
        jPanel5.add(txt_sre_street, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 160, 30));

        tab_sre_preview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Contact no", "Fax", "Email", "Web", "Address", "City", "Street", "Country"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tab_sre_preview);
        if (tab_sre_preview.getColumnModel().getColumnCount() > 0) {
            tab_sre_preview.getColumnModel().getColumn(0).setResizable(false);
            tab_sre_preview.getColumnModel().getColumn(1).setResizable(false);
            tab_sre_preview.getColumnModel().getColumn(2).setResizable(false);
            tab_sre_preview.getColumnModel().getColumn(3).setResizable(false);
            tab_sre_preview.getColumnModel().getColumn(4).setResizable(false);
            tab_sre_preview.getColumnModel().getColumn(5).setResizable(false);
            tab_sre_preview.getColumnModel().getColumn(6).setResizable(false);
            tab_sre_preview.getColumnModel().getColumn(7).setResizable(false);
            tab_sre_preview.getColumnModel().getColumn(8).setResizable(false);
        }

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 1070, 370));

        btn_sre_refresh.setText("REFRESH");
        btn_sre_refresh.setBorder(null);
        btn_sre_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sre_refreshActionPerformed(evt);
            }
        });
        jPanel5.add(btn_sre_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 660, 150, 40));

        btn_sre_update.setText("UPDATE");
        btn_sre_update.setBorder(null);
        btn_sre_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sre_updateActionPerformed(evt);
            }
        });
        jPanel5.add(btn_sre_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 660, 150, 40));

        btn_sre_remove.setText("REMOVE");
        btn_sre_remove.setBorder(null);
        btn_sre_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sre_removeActionPerformed(evt);
            }
        });
        jPanel5.add(btn_sre_remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 660, 150, 40));

        btn_sre_save.setText("SAVE");
        btn_sre_save.setBorder(null);
        btn_sre_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sre_saveActionPerformed(evt);
            }
        });
        jPanel5.add(btn_sre_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 660, 150, 40));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 100, 10, 600));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 1070, 10));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1350, 10));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_supplier_48px.png"))); // NOI18N
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 70));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_book_shelf_48px.png"))); // NOI18N
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 70, 70));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_note_48px.png"))); // NOI18N
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 70, 70));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_invoice_48px.png"))); // NOI18N
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 70, 70));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_School_Director_70px_1.png"))); // NOI18N
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 70, 70));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Student_Male_70px.png"))); // NOI18N
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, 70, 70));

        jLabel16.setText("GRN Count");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 110, 20));

        jLabel17.setText("Student Count");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 20, 110, 20));

        jLabel18.setText("Item Count");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 110, 20));

        jLabel19.setText("Invoice Count");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 110, 20));

        jLabel20.setText("Supplier Count");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 110, 20));

        jLabel21.setText("Teacher Count");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, 110, 20));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 50, 40, 20));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 50, 40, 20));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 40, 20));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 40, 20));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 40, 20));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 40, 20));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 200, 70));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 70));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 200, 70));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 200, 70));

        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 200, 70));

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, 200, 70));

        jLabel37.setText("Item Preview");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 410, -1, -1));

        jLabel38.setText("Supplier Preview");
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 100, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Web", "City", "Country"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 120, 260, 270));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Code", "Serial", "Quantity"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1103, 430, 260, 270));

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

    private void txt_sre_faxnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_faxnoActionPerformed
        txt_sre_email.grabFocus();
    }//GEN-LAST:event_txt_sre_faxnoActionPerformed

    private void txt_sre_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_nameActionPerformed
        txt_sre_conno.grabFocus();
    }//GEN-LAST:event_txt_sre_nameActionPerformed

    private void txt_sre_streetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_streetActionPerformed
        cb_sre_country.grabFocus();
    }//GEN-LAST:event_txt_sre_streetActionPerformed

    private void txt_sre_connoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_connoActionPerformed
        txt_sre_faxno.grabFocus();
    }//GEN-LAST:event_txt_sre_connoActionPerformed

    private void txt_sre_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_emailActionPerformed
        if (txt_sre_email.getText().contains("@") && txt_sre_email.getText().contains(".com")) {
            txt_sre_web.grabFocus();
        } else {
            JOptionPane.showMessageDialog(null, "INVALID EMAIL!");
        }
    }//GEN-LAST:event_txt_sre_emailActionPerformed

    private void txt_sre_webActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_webActionPerformed
        if (txt_sre_web.getText().contains("www.") && txt_sre_web.getText().contains(".com")) {
            txt_sre_web.grabFocus();
        } else {
            JOptionPane.showMessageDialog(null, "INVALID EMAIL!");
        }
    }//GEN-LAST:event_txt_sre_webActionPerformed

    private void txt_sre_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_addressActionPerformed
        txt_sre_city.grabFocus();
    }//GEN-LAST:event_txt_sre_addressActionPerformed

    private void txt_sre_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sre_cityActionPerformed
        txt_sre_street.grabFocus();
    }//GEN-LAST:event_txt_sre_cityActionPerformed

    private void btn_sre_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sre_refreshActionPerformed
        txt_sre_name.setText(null);
        txt_sre_conno.setText(null);
        txt_sre_faxno.setText(null);
        txt_sre_email.setText(null);
        txt_sre_web.setText(null);
        txt_sre_address.setText(null);
        txt_sre_city.setText(null);
        txt_sre_street.setText(null);
        cb_sre_country.setSelectedIndex(0);
        DefaultTableModel dtm = (DefaultTableModel) tab_sre_preview.getModel();
        dtm.setRowCount(0);
        fetchDataToLable();
        fetchDataToTable();
        JOptionPane.showMessageDialog(null, Message.FROMREFRESH);
    }//GEN-LAST:event_btn_sre_refreshActionPerformed

    private void btn_sre_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sre_addActionPerformed
        if (txt_sre_name.getText().isEmpty()
                || txt_sre_conno.getText().isEmpty()
                || txt_sre_faxno.getText().isEmpty()
                || txt_sre_email.getText().isEmpty()
                || txt_sre_web.getText().isEmpty()
                || txt_sre_address.getText().isEmpty()
                || txt_sre_city.getText().isEmpty()
                || txt_sre_street.getText().isEmpty()
                || cb_sre_country.getSelectedItem().equals("Select")) {
            JOptionPane.showMessageDialog(null, Message.PLEASEFILLFIELDS);
        } else {
            DefaultTableModel dtm = (DefaultTableModel) tab_sre_preview.getModel();
            Vector v = new Vector();
            v.add(txt_sre_name.getText());
            v.add(txt_sre_conno.getText());
            v.add(txt_sre_faxno.getText());
            v.add(txt_sre_email.getText());
            v.add(txt_sre_web.getText());
            v.add(txt_sre_address.getText());
            v.add(txt_sre_city.getText());
            v.add(txt_sre_street.getText());
            v.add(cb_sre_country.getSelectedItem());
            dtm.addRow(v);
        }
    }//GEN-LAST:event_btn_sre_addActionPerformed

    private void btn_sre_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sre_removeActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tab_sre_preview.getModel();
        if (tab_sre_preview.isRowSelected(tab_sre_preview.getSelectedRow())) {
            dtm.removeRow(tab_sre_preview.getSelectedRow());
            JOptionPane.showMessageDialog(null, Message.SUCCESSFULLYREMOVEDATAFROMTABLE);
        } else {
            JOptionPane.showMessageDialog(null, Message.NOSELECTEDROW);
        }
    }//GEN-LAST:event_btn_sre_removeActionPerformed

    private void btn_sre_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sre_saveActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) tab_sre_preview.getModel();
            if (dtm.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, Message.PLEASEADDITEMSTOTABLE);
            } else if (dtm.getRowCount() > 0) {
                SimpleDateFormat sdfD = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat sdfT = new SimpleDateFormat("hh:mm:ss");
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    Database.sendData("INSERT INTO Supplier (sup_name, sup_contact_no, sup_fax_no, sup_email, sup_web, "
                            + "sup_add_no, sup_add_city, sup_add_street, sup_add_country, sup_reg_date, sup_reg_time, use_id) "
                            + "VALUES('" + dtm.getValueAt(i, 0) + "','" + dtm.getValueAt(i, 1) + "','" + dtm.getValueAt(i, 2) + "','" + dtm.getValueAt(i, 3) + "','" + dtm.getValueAt(i, 4) + "'"
                            + ",'" + dtm.getValueAt(i, 5) + "','" + dtm.getValueAt(i, 6) + "','" + dtm.getValueAt(i, 7) + "','" + dtm.getValueAt(i, 8) + "','" + sdfD.format(new Date()) + "','" + sdfT.format(new Date()) + "', '" + user + "')");
                }
                fetchDataToLable();
                fetchDataToTable();
                JOptionPane.showMessageDialog(null, Message.SUCCESSFULLDATAINSERT);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_sre_saveActionPerformed

    private void btn_sre_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sre_updateActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tab_sre_preview.getModel();
        if (tab_sre_preview.isRowSelected(tab_sre_preview.getSelectedRow())) {

        } else {
            JOptionPane.showMessageDialog(null, Message.NOSELECTEDROW);
        }
    }//GEN-LAST:event_btn_sre_updateActionPerformed

    private void cb_sre_countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_sre_countryActionPerformed
        btn_sre_add.grabFocus();
    }//GEN-LAST:event_cb_sre_countryActionPerformed

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

    private void txt_sre_connoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sre_connoKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c))) {
            if (txt_sre_conno.getText().length() == 10) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_sre_connoKeyTyped

    private void txt_sre_faxnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sre_faxnoKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c))) {
            if (txt_sre_conno.getText().length() == 10) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_sre_faxnoKeyTyped

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
            java.util.logging.Logger.getLogger(SupplierRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplierRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplierRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplierRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupplierRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sre_add;
    private javax.swing.JButton btn_sre_refresh;
    private javax.swing.JButton btn_sre_remove;
    private javax.swing.JButton btn_sre_save;
    private javax.swing.JButton btn_sre_update;
    private javax.swing.JComboBox<String> cb_sre_country;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tab_sre_preview;
    private javax.swing.JTextField txt_sre_address;
    private javax.swing.JTextField txt_sre_city;
    private javax.swing.JTextField txt_sre_conno;
    private javax.swing.JTextField txt_sre_email;
    private javax.swing.JTextField txt_sre_faxno;
    private javax.swing.JTextField txt_sre_name;
    private javax.swing.JTextField txt_sre_street;
    private javax.swing.JTextField txt_sre_web;
    // End of variables declaration//GEN-END:variables

    private void fetchDataToLable() {
        try {
            ResultSet rs1 = Database.getData("SELECT COUNT(sup_id) AS supCount FROM Supplier");
            if (rs1.next()) {
                jLabel25.setText(rs1.getInt("supCount") + "");
            }
            ResultSet rs2 = Database.getData("SELECT COUNT(ite_id) AS iteCount FROM Item");
            if (rs2.next()) {
                jLabel27.setText(rs2.getInt("iteCount") + "");
            }
            ResultSet rs3 = Database.getData("SELECT COUNT(grn_id) AS grnCount FROM GRN");
            if (rs3.next()) {
                jLabel26.setText(rs3.getInt("grnCount") + "");
            }
            ResultSet rs4 = Database.getData("SELECT COUNT(inv_id) AS invCount FROM Invoice");
            if (rs4.next()) {
                jLabel24.setText(rs4.getInt("invCount") + "");
            }
            ResultSet rs5 = Database.getData("SELECT COUNT(emp_id) AS empCount FROM Employee WHERE emp_position = 'TEACHER'");
            if (rs5.next()) {
                jLabel23.setText(rs5.getInt("empCount") + "");
            }
            ResultSet rs6 = Database.getData("SELECT COUNT(std_id) AS stdCount FROM Student");
            if (rs6.next()) {
                jLabel22.setText(rs6.getInt("stdCount") + "");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fetchDataToTable() {
        try {
            ResultSet rs1 = Database.getData("SELECT sup_name, sup_web, sup_add_city, sup_add_country FROM Supplier");
            DefaultTableModel dtm1 = (DefaultTableModel) jTable1.getModel();
            dtm1.setRowCount(0);
            while (rs1.next()) {
                Vector v = new Vector();
                v.add(rs1.getString("sup_name"));
                v.add(rs1.getString("sup_web"));
                v.add(rs1.getString("sup_add_city"));
                v.add(rs1.getString("sup_add_country"));
                dtm1.addRow(v);
            }
            ResultSet rs2 = Database.getData("SELECT `item`.`ite_name`, `item`.`ite_serial`, `item`.`ite_quantity`, `itemcode`.`itc_code` FROM `cambridge_project`.`item`\n"
                    + "INNER JOIN `cambridge_project`.`itemcode` ON (`item`.`itc_id` = `itemcode`.`itc_id`);");
            DefaultTableModel dtm2 = (DefaultTableModel) jTable2.getModel();
            dtm2.setRowCount(0);
            while (rs2.next()) {
                Vector v = new Vector();
                v.add(rs2.getString("ite_name"));
                v.add(rs2.getString("itc_code"));
                v.add(rs2.getString("ite_serial"));
                v.add(rs2.getString("ite_quantity"));
                dtm2.addRow(v);
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
                jLabel39.setText(date);
                sdf = new SimpleDateFormat("hh:mm:ss");
                time = sdf.format(d);
                jLabel40.setText(time);
            }
        });
        t.start();
    }
}
