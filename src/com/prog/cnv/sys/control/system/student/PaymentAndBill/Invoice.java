package com.prog.cnv.sys.control.system.student.PaymentAndBill;

import com.prog.cnv.sys.control.system.control.Database;
import com.prog.cnv.sys.control.system.control.Message;
import com.prog.cnv.sys.control.system.control.Systemcontroller;
import com.prog.cnv.sys.control.system.student.Login;
import com.prog.cnv.sys.control.system.student.ReportViewer;
import com.prog.cnv.sys.control.system.student.Stock.InventoryManager;
import com.prog.cnv.sys.control.system.student.Stock.ItemCode;
import com.prog.cnv.sys.control.system.student.Stock.ItemRegistor;
import com.prog.cnv.sys.control.system.student.Stock.OutOFStockItem;
import com.prog.cnv.sys.control.system.student.Stock.ReorderPointItem;
import com.prog.cnv.sys.control.system.student.Stock.SupplierList;
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

public class Invoice extends javax.swing.JFrame {

    String invType = "";
    int memID = 0;
    String pType = "";
    int user;

    public Invoice() {
        initComponents();
        setDateAndTime();
        //comboBoxValue();
        jList1.setVisible(false);
        jScrollPane2.setVisible(false);
        fetchDataToUpperLable();
    }

    public Invoice(String userFlag) {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txt_inv_idcard = new javax.swing.JTextField();
        txt_inv_discount = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_inv_ntotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_inv_preview = new javax.swing.JTable();
        jLabel36 = new javax.swing.JLabel();
        txt_inv_quantity = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txt_inv_price = new javax.swing.JTextField();
        txt_inv_tot = new javax.swing.JTextField();
        txt_inv_totdis = new javax.swing.JTextField();
        txt_inv_qty = new javax.swing.JTextField();
        txt_inv_cno = new javax.swing.JTextField();
        txt_inv_due = new javax.swing.JTextField();
        txt_inv_payment = new javax.swing.JTextField();
        txt_inv_balance = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jrb_inv_cash = new javax.swing.JRadioButton();
        jrb_inv_male = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        txt_inv_refno = new javax.swing.JTextField();
        txt_inv_item = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
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
        jLabel5.setText("Invoice");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 210, 260));

        jLabel30.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("CONTACT");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 30));

        jLabel32.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("ITEM");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txt_inv_idcard.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        txt_inv_idcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inv_idcardActionPerformed(evt);
            }
        });
        txt_inv_idcard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_inv_idcardKeyTyped(evt);
            }
        });
        jPanel4.add(txt_inv_idcard, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 270, 30));

        txt_inv_discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inv_discountActionPerformed(evt);
            }
        });
        txt_inv_discount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_inv_discountKeyTyped(evt);
            }
        });
        jPanel4.add(txt_inv_discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, 50, 30));

        jLabel35.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("PRICE");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        jButton1.setText("ADD");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 130, 90, 30));

        txt_inv_ntotal.setEnabled(false);
        jPanel4.add(txt_inv_ntotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 570, 150, 40));

        tab_inv_preview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity", "Price", "Discount", "Total"
            }
        ));
        jScrollPane1.setViewportView(tab_inv_preview);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1160, 390));

        jLabel36.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("DISCOUNT");
        jPanel4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, -1, -1));

        txt_inv_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inv_quantityActionPerformed(evt);
            }
        });
        txt_inv_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_inv_quantityKeyTyped(evt);
            }
        });
        jPanel4.add(txt_inv_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 90, 30));

        jLabel34.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("QUANTITY");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        jLabel37.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("TOTAL");
        jPanel4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, -1, 40));

        jLabel38.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("DISCOUNT");
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 570, -1, 40));

        jLabel39.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("NET TOTAL");
        jPanel4.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 570, -1, 40));

        jLabel40.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("DUE");
        jPanel4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 660, -1, 40));

        jLabel41.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("PAYMENT");
        jPanel4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, -1, 40));

        jLabel42.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("BALANCE");
        jPanel4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 660, -1, 40));

        jLabel43.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("PAY OPTION");
        jPanel4.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, -1, -1));

        jLabel44.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("QUANTITY");
        jPanel4.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, 40));

        jLabel45.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("CARD");
        jPanel4.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 620, -1, -1));

        txt_inv_price.setEnabled(false);
        txt_inv_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inv_priceActionPerformed(evt);
            }
        });
        jPanel4.add(txt_inv_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 100, 30));

        txt_inv_tot.setEnabled(false);
        jPanel4.add(txt_inv_tot, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, 150, 40));

        txt_inv_totdis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inv_totdisActionPerformed(evt);
            }
        });
        txt_inv_totdis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_inv_totdisKeyTyped(evt);
            }
        });
        jPanel4.add(txt_inv_totdis, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 570, 150, 40));

        txt_inv_qty.setEnabled(false);
        jPanel4.add(txt_inv_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, 150, 40));

        txt_inv_cno.setEnabled(false);
        txt_inv_cno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inv_cnoActionPerformed(evt);
            }
        });
        jPanel4.add(txt_inv_cno, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 620, 150, 30));

        txt_inv_due.setEnabled(false);
        jPanel4.add(txt_inv_due, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 660, 150, 40));

        txt_inv_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inv_paymentActionPerformed(evt);
            }
        });
        txt_inv_payment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_inv_paymentKeyTyped(evt);
            }
        });
        jPanel4.add(txt_inv_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 660, 150, 40));

        txt_inv_balance.setEnabled(false);
        jPanel4.add(txt_inv_balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 660, 150, 40));

        jButton3.setText("ISSUE");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 660, 260, 40));

        jrb_inv_cash.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jrb_inv_cash);
        jrb_inv_cash.setText("CASH");
        jrb_inv_cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_inv_cashActionPerformed(evt);
            }
        });
        jPanel4.add(jrb_inv_cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 620, 70, 20));

        jrb_inv_male.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jrb_inv_male);
        jrb_inv_male.setText("CARD");
        jrb_inv_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_inv_maleActionPerformed(evt);
            }
        });
        jPanel4.add(jrb_inv_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 620, 70, 20));

        jLabel33.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("ID NO");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jTextField1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jTextField1.setEnabled(false);
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 45, 270, 30));

        jLabel46.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("REF NO");
        jPanel4.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 620, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Amex", "Master", "Visa" }));
        jComboBox1.setEnabled(false);
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, 150, 30));

        jLabel47.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("CARD NO");
        jPanel4.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 620, -1, -1));

        txt_inv_refno.setEnabled(false);
        jPanel4.add(txt_inv_refno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 620, 150, 30));

        txt_inv_item.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_inv_itemKeyReleased(evt);
            }
        });
        jPanel4.add(txt_inv_item, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 210, 30));

        jLabel48.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("NAME");
        jPanel4.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        jTextField2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jTextField2.setEnabled(false);
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 270, 30));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1160, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, 10, 700));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 10, 100));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_sigma_48px.png"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 100, 100));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Coins_70px.png"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 100, 100));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_bill_70px.png"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 100, 100));

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel9.setText("Today amount");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 130, 20));

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel10.setText("Today invoice");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 130, 20));

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel11.setText("Total Invoice");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, 130, 20));

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, 60, 30));

        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 50, 60, 30));

        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 60, 30));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 250, 100));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 250, 100));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 250, 100));

        jButton2.setText("ITEM CODE");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 180, 170, 60));

        jButton4.setText("INVOICES");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 170, 70));

        jButton5.setText("ITEM");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 100, 170, 60));

        jButton6.setText("INVENTORY");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 270, 170, 60));

        jButton7.setText("GRN");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 640, 170, 60));

        jButton8.setText("SUPPLIER LIST");
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 540, 170, 60));

        jButton9.setText("ROP");
        jButton9.setBorder(null);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 450, 170, 60));

        jButton10.setText("OOS");
        jButton10.setBorder(null);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 360, 170, 60));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1370, -1));

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

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 15, 110, 15));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 110, 15));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, 1370, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

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

    private void jrb_inv_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_inv_maleActionPerformed
        jComboBox1.setEnabled(true);
        txt_inv_cno.setEnabled(true);
        txt_inv_refno.setEnabled(true);
        pType = "CARD";
    }//GEN-LAST:event_jrb_inv_maleActionPerformed

    private void jrb_inv_cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_inv_cashActionPerformed
        jComboBox1.setEnabled(false);
        txt_inv_cno.setEnabled(false);
        txt_inv_refno.setEnabled(false);
        pType = "CASH";
    }//GEN-LAST:event_jrb_inv_cashActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            int currentInvoice = 0;
            SimpleDateFormat sdfD = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sdfT = new SimpleDateFormat("hh:mm:ss");
            Database.sendData("INSERT INTO Invoice (inv_isu_date, inv_isu_time,"
                    + "inv_sub_total, inv_discount, inv_ite_qty, inv_net_total, use_id) "
                    + "VALUES('" + sdfD.format(new Date()) + "', '" + sdfT.format(new Date()) + "', '" + Double.parseDouble(txt_inv_tot.getText()) + "',"
                    + "'" + Double.parseDouble(txt_inv_discount.getText()) + "', '" + Double.parseDouble(txt_inv_qty.getText()) + "', '" + Double.parseDouble(txt_inv_ntotal.getText()) + "', '" + user + "')");
            ResultSet rs1 = Database.getData("SELECT inv_id FROM Invoice WHERE inv_isu_date = '" + sdfD.format(new Date()) + "' AND inv_sub_total = '" + Double.parseDouble(txt_inv_tot.getText()) + "' AND inv_discount = '" + Double.parseDouble(txt_inv_discount.getText()) + "' AND inv_ite_qty = '" + Double.parseDouble(txt_inv_qty.getText()) + "' AND inv_net_total = '" + Double.parseDouble(txt_inv_ntotal.getText()) + "' AND use_id = '" + user + "'");
            if (rs1.next()) {
                currentInvoice = Integer.parseInt(rs1.getString("inv_id"));
                DefaultTableModel dtm1 = (DefaultTableModel) tab_inv_preview.getModel();
                for (int i = 0; i < dtm1.getRowCount(); i++) {
                    Database.sendData("INSERT INTO invoiceItem (ite_id, inv_id, ivi_qty, ivi_sub_total, ivi_discount, ivi_net_total) "
                            + "VALUES((SELECT ite_id FROM Item WHERE ite_name = '" + dtm1.getValueAt(i, 0) + "'), '" + currentInvoice + "', '" + Double.parseDouble(dtm1.getValueAt(i, 1).toString()) + "', '" + Double.parseDouble(dtm1.getValueAt(i, 2).toString()) + "',"
                            + "'" + Double.parseDouble(dtm1.getValueAt(i, 3).toString()) + "', '" + Double.parseDouble(dtm1.getValueAt(i, 4).toString()) + "')");
                    ResultSet rs2 = Database.getData("SELECT ite_id, ite_quantity FROM Item WHERE ite_id = (SELECT ite_id FROM Item WHERE ite_name = '" + dtm1.getValueAt(i, 0) + "')");
                    if (rs2.next()) {
                        double qty = rs2.getDouble("ite_quantity");
                        double newQty = qty - Double.parseDouble(dtm1.getValueAt(i, 1).toString());
                        Database.sendData("UPDATE item SET ite_quantity = '" + newQty + "' WHERE ite_id = '" + Integer.parseInt(rs2.getString("ite_id")) + "'");
                    }
                }
            }
            double ntot = Double.parseDouble(txt_inv_ntotal.getText());
            double paym = Double.parseDouble(txt_inv_payment.getText());
            int pmt = 0;
            if (ntot > paym) {
                pmt = 0;
            } else if (ntot <= paym) {
                pmt = 1;
            }
            if (invType.equals("S")) {
                int bill = 0;
                Database.sendData("INSERT INTO studentInvoice (sti_amount, sti_state, std_id, inv_id) "
                        + "VALUES('" + Double.parseDouble(txt_inv_ntotal.getText()) + "','" + pmt + "','" + memID + "','" + currentInvoice + "')");
                //Bill table ekata value add karanna
                Database.sendData("INSERT INTO Bill(bil_time, bil_date, bil_total, bil_discount, bil_nettotal) "
                        + "VALUES('" + sdfT.format(new Date()) + "', '" + sdfD.format(new Date()) + "', '" + Double.parseDouble(txt_inv_tot.getText()) + "', '" + Double.parseDouble(txt_inv_totdis.getText()) + "', '" + Double.parseDouble(txt_inv_ntotal.getText()) + "')");
                ResultSet rs2 = Database.getData("SELECT bil_id FROM Bill WHERE bil_date = '" + sdfD.format(new Date()) + "' AND bil_total = '" + Double.parseDouble(txt_inv_tot.getText()) + "' AND bil_discount = '" + Double.parseDouble(txt_inv_totdis.getText()) + "' AND bil_nettotal = '" + Double.parseDouble(txt_inv_ntotal.getText()) + "'");
                if (rs2.next()) {
                    bill = rs2.getInt("bil_id");
                }
                //Invoice payment ekata value add karanna
                Database.sendData("INSERT INTO invoicePayment(inp_time, inp_date, inp_amount, bil_id, inv_id) "
                        + "VALUES('" + sdfT.format(new Date()) + "', '" + sdfD.format(new Date()) + "', '" + Double.parseDouble(txt_inv_payment.getText()) + "', '" + bill + "', '" + currentInvoice + "')");
                //Bill payment walata value add karanna
                Database.sendData("INSERT INTO billpayment (blp_time, blp_date, blp_payment, blp_balance, blp_due, blp_pmtmethod, blp_card, blp_card_no, blp_ref_no, std_id, bil_id) "
                        + "VALUES('" + sdfT.format(new Date()) + "', '" + sdfD.format(new Date()) + "', '" + Double.parseDouble(txt_inv_payment.getText()) + "', '" + Double.parseDouble(txt_inv_balance.getText()) + "','" + Double.parseDouble(txt_inv_due.getText()) + "',"
                        + "'" + pType + "', '" + jComboBox1.getSelectedItem() + "', '" + txt_inv_cno.getText() + "', '" + txt_inv_refno.getText() + "', '" + memID + "', '" + bill + "')");
            } else if (invType.equals("E")) {
//                Database.sendData("INSERT INTO employeeinvoice (emi_amount, emi_state, emp_id, inv_id) "
//                        + "VALUES('" + Double.parseDouble(txt_inv_ntotal.getText()) + "','" + pmt + "','" + memID + "','" + currentInvoice + "')");
            }
            int option = JOptionPane.showConfirmDialog(null, Message.DOYOUNEEDBILL);
            if (option == 0) {
                printBill(currentInvoice);
                fetchDataToUpperLable();
            } else if (option == 1) {
                //Preview bill()
                fetchDataToUpperLable();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_inv_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inv_paymentActionPerformed
        double pay = Double.parseDouble(txt_inv_payment.getText());
        double ntot = Double.parseDouble(txt_inv_ntotal.getText());
        if (pay <= ntot) {
            double bal = Math.abs(pay - ntot);
            txt_inv_balance.setText(0 + "");
            txt_inv_due.setText(bal + "");
        } else if (pay >= ntot) {
            double bal = Math.abs(pay - ntot);
            txt_inv_balance.setText(bal + "");
            txt_inv_due.setText(0 + "");
        }
    }//GEN-LAST:event_txt_inv_paymentActionPerformed

    private void txt_inv_totdisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inv_totdisActionPerformed
        double dis = Double.parseDouble(txt_inv_totdis.getText());
        double tot = Double.parseDouble(txt_inv_tot.getText());
        double ntot = tot - ((tot * dis) / 100);
        txt_inv_ntotal.setText(ntot + "");
    }//GEN-LAST:event_txt_inv_totdisActionPerformed

    private void txt_inv_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inv_quantityActionPerformed
        try {
            ResultSet rs1 = Database.getData("SELECT ite_quantity FROM Item WHERE ite_name = '" + txt_inv_item.getText() + "'");
            if (rs1.next()) {
                double qty = Double.parseDouble(rs1.getString("ite_quantity"));
                double iqty = Double.parseDouble(txt_inv_quantity.getText());
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
            txt_inv_discount.grabFocus();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txt_inv_quantityActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tab_inv_preview.getModel();
        int quantity = Integer.parseInt(dtm.getValueAt(tab_inv_preview.getSelectedRow(), 1).toString());
        double total = Double.parseDouble(dtm.getValueAt(tab_inv_preview.getSelectedRow(), 4).toString());
        int tfqty = Integer.parseInt(txt_inv_qty.getText());
        double tftotal = Double.parseDouble(txt_inv_tot.getText());
        txt_inv_qty.setText((tfqty - quantity) + "");
        txt_inv_tot.setText((tftotal - total) + "");
        dtm.removeRow(tab_inv_preview.getSelectedRow());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_inv_discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inv_discountActionPerformed
        try {
            double price = 0;
            ResultSet rs1 = Database.getData("SELECT ite_unit_price FROM Item WHERE ite_name = '" + txt_inv_item.getText() + "'");
            if (rs1.next()) {
                price = Double.parseDouble(rs1.getString("ite_unit_price"));
            }
            int qty = Integer.parseInt(txt_inv_quantity.getText());
            double dis = Double.parseDouble(txt_inv_discount.getText());
            double totalPrice = qty * price;
            double discount = (totalPrice * dis) / 100;
            double disIncludePrice = totalPrice - discount;
            DefaultTableModel dtm = (DefaultTableModel) tab_inv_preview.getModel();
            boolean invo = false;
            if (dtm.getRowCount() == 0) {
                Vector v = new Vector();
                v.add(txt_inv_item.getText());
                v.add(txt_inv_quantity.getText());
                v.add(totalPrice);
                v.add(discount);
                v.add(disIncludePrice);
                dtm.addRow(v);
            } else {
                for (int j = 0; j < dtm.getRowCount(); j++) {
                    if (dtm.getValueAt(j, 0).toString().equals(txt_inv_item.getText())) {
                        invo = true;
                        int qunatityP = Integer.parseInt(dtm.getValueAt(j, 1).toString());
                        double totalP = Double.parseDouble(dtm.getValueAt(j, 2).toString());
                        double netTotalP = Double.parseDouble(dtm.getValueAt(j, 4).toString());
                        int newQuanity = qty + qunatityP;
                        double newTotal = totalPrice + totalP;
                        double newNetTotal = disIncludePrice + netTotalP;
                        dtm.setValueAt(newQuanity, j, 1);
                        dtm.setValueAt(newTotal, j, 2);
                        dtm.setValueAt(newNetTotal, j, 4);
                    }
                }

                if (!invo) {
                    Vector v = new Vector();
                    v.add(txt_inv_item.getText());
                    v.add(txt_inv_quantity.getText());
                    v.add(totalPrice);
                    v.add(discount);
                    v.add(disIncludePrice);
                    dtm.addRow(v);
                }
            }

            int totalQuantity = 0;
            double totalSubPrice = 0.0;
            for (int i = 0; i < dtm.getRowCount(); i++) {
                totalQuantity += Integer.parseInt(dtm.getValueAt(i, 1).toString());
                totalSubPrice += Double.parseDouble(dtm.getValueAt(i, 2).toString());
            }
            txt_inv_qty.setText(totalQuantity + "");
            txt_inv_tot.setText(totalSubPrice + "");

            txt_inv_item.setText("");
            txt_inv_price.setText("");
            txt_inv_quantity.setText("");
            txt_inv_discount.setText("");
            txt_inv_item.grabFocus();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txt_inv_discountActionPerformed

    private void txt_inv_idcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inv_idcardActionPerformed
        try {
            ResultSet rs1 = Database.getData("SELECT std_id, std_fname, std_mname, std_lname, std_mobile FROM Student WHERE std_rfid = '" + txt_inv_idcard.getText() + "'");
            if (rs1.next()) {
                invType = "S";
                memID = Integer.parseInt(rs1.getString("std_id"));
                jTextField1.setText(rs1.getString("std_fname") + " " + rs1.getString("std_mname") + " " + rs1.getString("std_lname"));
                jTextField2.setText(rs1.getString("std_mobile"));
            }
            ResultSet rs2 = Database.getData("SELECT emp_id, emp_fname, emp_mname, emp_lname, emp_mobile FROM Employee WHERE emp_nic = '" + txt_inv_idcard.getText() + "' OR emp_rfid = '" + txt_inv_idcard.getText() + "'");
            if (rs2.next()) {
                invType = "E";
                memID = Integer.parseInt(rs2.getString("emp_id"));
                jTextField1.setText(rs2.getString("emp_fname") + "" + rs2.getString("emp_mname") + "" + rs2.getString("emp_lname"));
                jTextField2.setText(rs2.getString("emp_mobile"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txt_inv_idcardActionPerformed

    private void txt_inv_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inv_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inv_priceActionPerformed

    private void txt_inv_cnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inv_cnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inv_cnoActionPerformed

    private void txt_inv_itemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_inv_itemKeyReleased
        jList1.setVisible(true);
        jScrollPane2.setVisible(true);
        try {
            ResultSet rs = Database.getData("SELECT ite_name FROM Item WHERE ite_name LIKE '" + txt_inv_item.getText() + "%' ");
            Vector v = new Vector();
            while (rs.next()) {
                v.add(rs.getString("ite_name"));
            }
            jList1.setListData(v);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txt_inv_itemKeyReleased

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        try {
            ResultSet rs1 = Database.getData("SELECT ite_unit_price FROM Item WHERE ite_name = '" + jList1.getSelectedValue() + "'");
            if (rs1.next()) {
                txt_inv_price.setText(rs1.getString("ite_unit_price"));
                txt_inv_item.setText(jList1.getSelectedValue());
                jList1.setVisible(false);
                jScrollPane2.setVisible(false);
            }
            txt_inv_quantity.grabFocus();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        InvoicePreview inp = new InvoicePreview(user + "");
        inp.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ItemRegistor ir = new ItemRegistor(user + "");
        ir.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ItemCode itc = new ItemCode(user + "");
        itc.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        InventoryManager ivm = new InventoryManager(user + "");
        ivm.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        OutOFStockItem oosi = new OutOFStockItem();
        oosi.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        ReorderPointItem rpi = new ReorderPointItem();
        rpi.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        SupplierList spl = new SupplierList(user + "");
        spl.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        PreviewGrn pgrn = new PreviewGrn(user + "");
        pgrn.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

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

    private void txt_inv_quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_inv_quantityKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_inv_quantityKeyTyped

    private void txt_inv_discountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_inv_discountKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || (evt.getKeyChar() == '.')) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_inv_discountKeyTyped

    private void txt_inv_idcardKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_inv_idcardKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_inv_idcardKeyTyped

    private void txt_inv_totdisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_inv_totdisKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || (evt.getKeyChar() == '.')) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_inv_totdisKeyTyped

    private void txt_inv_paymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_inv_paymentKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || (evt.getKeyChar() == '.')) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txt_inv_paymentKeyTyped

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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JRadioButton jrb_inv_cash;
    private javax.swing.JRadioButton jrb_inv_male;
    private javax.swing.JTable tab_inv_preview;
    private javax.swing.JTextField txt_inv_balance;
    private javax.swing.JTextField txt_inv_cno;
    private javax.swing.JTextField txt_inv_discount;
    private javax.swing.JTextField txt_inv_due;
    private javax.swing.JTextField txt_inv_idcard;
    private javax.swing.JTextField txt_inv_item;
    private javax.swing.JTextField txt_inv_ntotal;
    private javax.swing.JTextField txt_inv_payment;
    private javax.swing.JTextField txt_inv_price;
    private javax.swing.JTextField txt_inv_qty;
    private javax.swing.JTextField txt_inv_quantity;
    private javax.swing.JTextField txt_inv_refno;
    private javax.swing.JTextField txt_inv_tot;
    private javax.swing.JTextField txt_inv_totdis;
    // End of variables declaration//GEN-END:variables

    private void printBill(int currentInvoice) {
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
            m.put("student", jTextField1.getText().toString());
            m.put("paymenttype", pType);
            m.put("invoice", currentInvoice + "");
            m.put("date", sdfD.format(new Date()) + "");
            m.put("time", sdfT.format(new Date()) + "");
            m.put("total", txt_inv_tot.getText().toString());
            m.put("quantity", txt_inv_qty.getText().toString());
            m.put("discount", txt_inv_totdis.getText().toString());
            m.put("nettotal", txt_inv_ntotal.getText().toString());
            JasperPrint jp = JasperFillManager.fillReport(jr, m, Database.getConnection());
            ReportViewer rv = new ReportViewer(jp);
            rv.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "PRINTING ERROR!");
        }
    }

    private void fetchDataToUpperLable() {
        try {
            SimpleDateFormat sdfD = new SimpleDateFormat("yyyy-MM-dd");
            ResultSet rs1 = Database.getData("SELECT COUNT(inv_id) AS invoiceCount FROM Invoice WHERE `invoice`.`inv_isu_date` = '" + sdfD.format(new Date()) + "'");
            if (rs1.next()) {
                jLabel14.setText(rs1.getInt("invoiceCount") + "");
            }
            ResultSet rs2 = Database.getData("SELECT SUM(invoice.`inv_net_total`) AS todayTotal FROM Invoice WHERE `invoice`.`inv_isu_date` = '" + sdfD.format(new Date()) + "'");
            if (rs2.next()) {
                jLabel12.setText(rs2.getDouble("todayTotal") + "");
            }
            ResultSet rs3 = Database.getData("SELECT SUM(`invoice`.`inv_net_total`) AS invoiceAmount FROM invoice");
            if (rs3.next()) {
                jLabel13.setText(rs3.getDouble("invoiceAmount") + "");
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
                jLabel31.setText(date);
                sdf = new SimpleDateFormat("hh:mm:ss");
                time = sdf.format(d);
                jLabel29.setText(time);
            }
        });
        t.start();
    }
}
