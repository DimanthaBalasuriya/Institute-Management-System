package com.prog.cnv.sys.control.system.student.PaymentAndBill;

import com.prog.cnv.sys.control.system.control.Database;
import com.prog.cnv.sys.control.system.control.Message;
import com.prog.cnv.sys.control.system.student.Login;
import com.prog.cnv.sys.control.system.student.ReportViewer;
import com.prog.cnv.sys.control.system.student.Stock.InventoryManager;
import com.prog.cnv.sys.control.system.student.Stock.ItemCode;
import com.prog.cnv.sys.control.system.student.Stock.ItemRegistor;
import com.prog.cnv.sys.control.system.student.Stock.SupplierList;
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
import net.sf.jasperreports.view.JasperViewer;

public class Grn extends javax.swing.JFrame {

    int user;

    public Grn() {
        initComponents();
        setDateAndTime();
        comboBoxValue();
        fetchDataToSidePanelTable();
        jList1.setVisible(false);
        jScrollPane4.setVisible(false);
    }

    public Grn(String user) {
        this();
        this.user = Integer.parseInt(user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        cb_grn_supplier = new javax.swing.JComboBox<>();
        txt_grn_sprice = new javax.swing.JTextField();
        txt_grn_quantity = new javax.swing.JTextField();
        txt_grn_bprice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_grn_preview = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txt_grn_tqty = new javax.swing.JTextField();
        txt_grn_tbp = new javax.swing.JTextField();
        btn_grn_refresh = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txt_grn_conno = new javax.swing.JTextField();
        txt_grn_email = new javax.swing.JTextField();
        txt_grn_country = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        cb_grn_po = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        txt_grn_date = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txt_grn_pono = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

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

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 15, 110, 15));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, 110, 15));

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
        jLabel5.setText("GRN");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jList1);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 180, 180));

        jLabel27.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Item");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel28.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Sell price");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 160, -1, -1));

        jLabel31.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Buy price");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, -1, -1));

        cb_grn_supplier.setFont(new java.awt.Font("Microsoft JhengHei", 0, 15)); // NOI18N
        cb_grn_supplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cb_grn_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_grn_supplierActionPerformed(evt);
            }
        });
        jPanel5.add(cb_grn_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 180, 30));

        txt_grn_sprice.setFont(new java.awt.Font("Microsoft JhengHei", 0, 15)); // NOI18N
        txt_grn_sprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_grn_spriceActionPerformed(evt);
            }
        });
        txt_grn_sprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_grn_spriceKeyTyped(evt);
            }
        });
        jPanel5.add(txt_grn_sprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 160, 160, 30));

        txt_grn_quantity.setFont(new java.awt.Font("Microsoft JhengHei", 0, 15)); // NOI18N
        txt_grn_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_grn_quantityActionPerformed(evt);
            }
        });
        txt_grn_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_grn_quantityKeyTyped(evt);
            }
        });
        jPanel5.add(txt_grn_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 180, 30));

        txt_grn_bprice.setFont(new java.awt.Font("Microsoft JhengHei", 0, 15)); // NOI18N
        txt_grn_bprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_grn_bpriceActionPerformed(evt);
            }
        });
        txt_grn_bprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_grn_bpriceKeyTyped(evt);
            }
        });
        jPanel5.add(txt_grn_bprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 180, 30));

        tab_grn_preview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity", "Buying price", "Selling price", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tab_grn_preview);
        if (tab_grn_preview.getColumnModel().getColumnCount() > 0) {
            tab_grn_preview.getColumnModel().getColumn(0).setResizable(false);
            tab_grn_preview.getColumnModel().getColumn(1).setResizable(false);
            tab_grn_preview.getColumnModel().getColumn(2).setResizable(false);
            tab_grn_preview.getColumnModel().getColumn(3).setResizable(false);
            tab_grn_preview.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 211, 1150, 430));

        jLabel32.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Quantity");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        jLabel33.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Total Quantity");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, -1, 50));

        jLabel34.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Total Buy price");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 650, -1, 50));

        txt_grn_tqty.setEditable(false);
        txt_grn_tqty.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        txt_grn_tqty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(txt_grn_tqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 650, 150, 50));

        txt_grn_tbp.setEditable(false);
        txt_grn_tbp.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        txt_grn_tbp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(txt_grn_tbp, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 650, 170, 50));

        btn_grn_refresh.setText("REFRESH");
        btn_grn_refresh.setBorder(null);
        btn_grn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grn_refreshActionPerformed(evt);
            }
        });
        jPanel5.add(btn_grn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 650, 130, 50));

        jButton2.setText("TOTAL");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 650, 130, 50));

        jLabel30.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Supplier");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel35.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Contact no");
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jLabel38.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Country");
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 80, -1, -1));

        jLabel39.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Email");
        jPanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, -1, -1));

        txt_grn_conno.setEditable(false);
        txt_grn_conno.setFont(new java.awt.Font("Microsoft JhengHei", 0, 15)); // NOI18N
        txt_grn_conno.setEnabled(false);
        jPanel5.add(txt_grn_conno, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 180, 30));

        txt_grn_email.setEditable(false);
        txt_grn_email.setFont(new java.awt.Font("Microsoft JhengHei", 0, 15)); // NOI18N
        txt_grn_email.setEnabled(false);
        jPanel5.add(txt_grn_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 180, 30));

        txt_grn_country.setEditable(false);
        txt_grn_country.setFont(new java.awt.Font("Microsoft JhengHei", 0, 15)); // NOI18N
        txt_grn_country.setEnabled(false);
        jPanel5.add(txt_grn_country, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 80, 160, 30));

        jLabel40.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("PO");
        jPanel5.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        cb_grn_po.setFont(new java.awt.Font("Microsoft JhengHei", 0, 15)); // NOI18N
        cb_grn_po.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cb_grn_po.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_grn_poActionPerformed(evt);
            }
        });
        jPanel5.add(cb_grn_po, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 180, 30));

        jLabel36.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Date");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, -1, -1));

        txt_grn_date.setEditable(false);
        txt_grn_date.setFont(new java.awt.Font("Microsoft JhengHei", 0, 15)); // NOI18N
        txt_grn_date.setEnabled(false);
        jPanel5.add(txt_grn_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 180, 30));

        jLabel37.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("PO No");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        txt_grn_pono.setEditable(false);
        txt_grn_pono.setFont(new java.awt.Font("Microsoft JhengHei", 0, 15)); // NOI18N
        txt_grn_pono.setEnabled(false);
        jPanel5.add(txt_grn_pono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 180, 30));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1150, 10));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 1150, 10));

        jButton1.setText("ITEM CODE");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 170, 50));

        jButton3.setText("ITEM");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 50));

        jButton5.setText("INVENTORY");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 170, 50));

        jButton6.setText("SUPPLIER");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 170, 50));

        jButton7.setText("GRN ");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 170, 50));

        jTextField1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 15)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel5.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 180, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1170, 710));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ITEM LIST");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity"
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

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 180, 330));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("GRN LIST");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 200, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 180, 300));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 10, 690));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 180, -1));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 200, 10));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 30, 200, 710));

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

    private void cb_grn_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_grn_supplierActionPerformed
        try {
            ResultSet rs1 = Database.getData("SELECT sup_contact_no, sup_email, sup_add_country FROM Supplier WHERE sup_name = '" + cb_grn_supplier.getSelectedItem() + "'");
            if (rs1.next()) {
                txt_grn_conno.setText(rs1.getString("sup_contact_no"));
                txt_grn_email.setText(rs1.getString("sup_email"));
                txt_grn_country.setText(rs1.getString("sup_add_country"));
            }
//            ResultSet rs2 = Database.getData("SELECT puo_no FROM purchaseOrder WHERE sup_id = (SELECT sup_id FROM purchaseOrder WHERE sup_name = '" + cb_grn_supplier.getSelectedItem() + "') AND puo_del_state = '1'");
//            while (rs2.next()) {
//                cb_grn_po.addItem(rs2.getString("puo_no"));
//            }
            jTextField1.grabFocus();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_cb_grn_supplierActionPerformed

    private void cb_grn_poActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_grn_poActionPerformed
        try {
            ResultSet rs = Database.getData("SELECT puo_no, puo_issue_date FROM purchaseOrder WHERE pou_no = '" + cb_grn_po.getSelectedItem() + "'");
            if (rs.next()) {
                txt_grn_pono.setText(rs.getString("puo_no"));
                txt_grn_date.setText(rs.getString("puo_issue_date"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_cb_grn_poActionPerformed

    private void txt_grn_spriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_grn_spriceActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tab_grn_preview.getModel();

        boolean isAlready = false;
        double price = Double.parseDouble(txt_grn_bprice.getText()) * Double.parseDouble(txt_grn_quantity.getText());
        if (dtm.getRowCount() == 0) {
            Vector v = new Vector();
            v.add(jTextField1.getText());
            v.add(txt_grn_quantity.getText());
            v.add(txt_grn_bprice.getText());
            v.add(txt_grn_sprice.getText());
            v.add(price);
            dtm.addRow(v);
        } else {
            for (int i = 0; i < dtm.getRowCount(); i++) {
                if (dtm.getValueAt(i, 0).toString().equals(jTextField1.getText())) {
                    isAlready = true;
                    int pQuantity = Integer.parseInt(dtm.getValueAt(i, 1).toString());
                    double pPrice = Double.parseDouble(dtm.getValueAt(i, 4).toString());
                    int nQuantity = pQuantity + Integer.parseInt(txt_grn_quantity.getText());
                    double nPrice = pPrice + price;
                    dtm.setValueAt(nQuantity, i, 1);
                    dtm.setValueAt(nPrice, i, 4);
                }
            }

            if (!isAlready) {
                Vector v = new Vector();
                v.add(jTextField1.getText());
                v.add(txt_grn_quantity.getText());
                v.add(txt_grn_bprice.getText());
                v.add(txt_grn_sprice.getText());
                v.add(price);
                dtm.addRow(v);
            }
        }

    }//GEN-LAST:event_txt_grn_spriceActionPerformed

    private void btn_grn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grn_refreshActionPerformed
        jTextField1.setText(null);
        cb_grn_po.setSelectedIndex(0);
        cb_grn_supplier.setSelectedIndex(0);
        txt_grn_bprice.setText(null);
        txt_grn_conno.setText(null);
        txt_grn_country.setText(null);
        txt_grn_date.setText(null);
        txt_grn_email.setText(null);
        txt_grn_pono.setText(null);
        txt_grn_quantity.setText(null);
        txt_grn_sprice.setText(null);
        txt_grn_tbp.setText(null);
        txt_grn_tqty.setText(null);
        DefaultTableModel dtm = (DefaultTableModel) tab_grn_preview.getModel();
        dtm.setRowCount(0);
    }//GEN-LAST:event_btn_grn_refreshActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            double bQty = 0;
            double btp = 0;
            SimpleDateFormat sdfD = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sdfT = new SimpleDateFormat("hh:mm");
            DefaultTableModel dtm = (DefaultTableModel) tab_grn_preview.getModel();
            for (int i = 0; i < dtm.getRowCount(); i++) {
                bQty += Double.parseDouble(dtm.getValueAt(i, 1).toString());
                btp += Double.parseDouble(dtm.getValueAt(i, 4).toString());
            }
            txt_grn_tqty.setText(bQty + "");
            txt_grn_tbp.setText(btp + "");
            Database.sendData("INSERT INTO GRN (grn_isu_date, grn_isu_time, grn_ite_qty, grn_total, sup_id, use_id) "
                    + "VALUES('" + sdfD.format(new Date()) + "','" + sdfT.format(new Date()) + "','" + bQty + "', '" + btp + "', (SELECT sup_id FROM Supplier WHERE sup_name = '" + cb_grn_supplier.getSelectedItem() + "'), '" + user + "')");
            double iQty = 0;
            int grnID = 0;
            ResultSet gr = Database.getData("SELECT grn_id FROM GRN WHERE grn_isu_date = '" + sdfD.format(new Date()) + "' AND grn_isu_time = '" + sdfT.format(new Date()) + "' AND sup_id = (SELECT sup_id FROM Supplier WHERE sup_name = '" + cb_grn_supplier.getSelectedItem() + "')");
            if (gr.next()) {
                grnID = Integer.parseInt(gr.getString("grn_id"));
            }
            for (int i = 0; i < dtm.getRowCount(); i++) {
                Database.sendData("INSERT INTO grnDetail(grn_id, ite_id, grd_ite_qty, grd_price, grd_bPrice, grd_sPrice) "
                        + "VALUES('" + grnID + "',(SELECT ite_id FROM Item WHERE ite_name = '" + dtm.getValueAt(i, 0) + "'),'" + dtm.getValueAt(i, 1) + "','" + dtm.getValueAt(i, 4) + "','" + dtm.getValueAt(i, 2) + "','" + dtm.getValueAt(i, 3) + "')");
                ResultSet rs1 = Database.getData("SELECT ite_quantity FROM Item WHERE ite_name = '" + dtm.getValueAt(i, 0) + "'");
                if (rs1.next()) {
                    iQty = Double.parseDouble(rs1.getString("ite_quantity")) + Double.parseDouble(dtm.getValueAt(i, 1).toString());
                }
                Database.sendData("UPDATE Item SET ite_quantity = '" + iQty + "', ite_unit_price = '" + Double.parseDouble(dtm.getValueAt(i, 3).toString()) + "', ite_buy_price = '" + Double.parseDouble(dtm.getValueAt(i, 2).toString()) + "' WHERE ite_name = '" + dtm.getValueAt(i, 0) + "'");
            }
            int option = JOptionPane.showConfirmDialog(null, Message.DOYOUNEEDBILL);
            if (option == 0) {
                executeBill(grnID);
            } else if (option == 1) {
                //Preview bill()
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        SupplierList spl = new SupplierList();
        spl.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        PreviewGrn pvg = new PreviewGrn();
        pvg.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        InventoryManager ivm = new InventoryManager();
        ivm.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ItemCode itc = new ItemCode();
        itc.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ItemRegistor itr = new ItemRegistor();
        itr.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        jList1.setVisible(true);
        jScrollPane4.setVisible(true);
        try {
            ResultSet rs = Database.getData("SELECT ite_name FROM Item WHERE ite_name LIKE '" + jTextField1.getText() + "%' ");
            Vector v = new Vector();
            while (rs.next()) {
                v.add(rs.getString("ite_name"));
            }
            jList1.setListData(v);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        jTextField1.setText(jList1.getSelectedValue());
        jList1.setVisible(false);
        jScrollPane4.setVisible(false);
    }//GEN-LAST:event_jList1MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        txt_grn_quantity.grabFocus();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txt_grn_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_grn_quantityActionPerformed
        txt_grn_bprice.grabFocus();
    }//GEN-LAST:event_txt_grn_quantityActionPerformed

    private void txt_grn_bpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_grn_bpriceActionPerformed
        txt_grn_sprice.grabFocus();
    }//GEN-LAST:event_txt_grn_bpriceActionPerformed

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

    private void txt_grn_quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_grn_quantityKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_grn_quantityKeyTyped

    private void txt_grn_bpriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_grn_bpriceKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_grn_bpriceKeyTyped

    private void txt_grn_spriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_grn_spriceKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_grn_spriceKeyTyped

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
            java.util.logging.Logger.getLogger(Grn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_grn_refresh;
    private javax.swing.JComboBox<String> cb_grn_po;
    private javax.swing.JComboBox<String> cb_grn_supplier;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tab_grn_preview;
    private javax.swing.JTextField txt_grn_bprice;
    private javax.swing.JTextField txt_grn_conno;
    private javax.swing.JTextField txt_grn_country;
    private javax.swing.JTextField txt_grn_date;
    private javax.swing.JTextField txt_grn_email;
    private javax.swing.JTextField txt_grn_pono;
    private javax.swing.JTextField txt_grn_quantity;
    private javax.swing.JTextField txt_grn_sprice;
    private javax.swing.JTextField txt_grn_tbp;
    private javax.swing.JTextField txt_grn_tqty;
    // End of variables declaration//GEN-END:variables

    private void comboBoxValue() {
        try {
            ResultSet rs1 = Database.getData("SELECT sup_name FROM Supplier WHERE sup_mem_state = '1'");
            while (rs1.next()) {
                cb_grn_supplier.addItem(rs1.getString("sup_name"));
            }
//            ResultSet rs2 = Database.getData("SELECT ite_name FROM Item WHERE ite_state = '1'");
//            while (rs2.next()) {
//                jTextField1.setText(rs2.getString("ite_name"));
//            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fetchDataToSidePanelTable() {
        try {
            ResultSet rs1 = Database.getData("SELECT ite_name, ite_quantity FROM Item WHERE ite_state = '1'");
            DefaultTableModel dtm1 = (DefaultTableModel) jTable1.getModel();
            dtm1.setRowCount(0);
            while (rs1.next()) {
                Vector v = new Vector();
                v.add(rs1.getString("ite_name"));
                v.add(rs1.getString("ite_quantity"));
                dtm1.addRow(v);
            }
            ResultSet rs2 = Database.getData("SELECT grn_isu_date, grn_isu_time, grn_total FROM GRN");
            DefaultTableModel dtm2 = (DefaultTableModel) jTable2.getModel();
            dtm2.setRowCount(0);
            while (rs2.next()) {
                Vector v = new Vector();
                v.add(rs2.getString("grn_isu_date"));
                v.add(rs2.getString("grn_isu_time"));
                v.add(rs2.getString("grn_total"));
                dtm2.addRow(v);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void executeBill(int grnID) {
        try {
            SimpleDateFormat sdfD = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sdfT = new SimpleDateFormat("hh-mm-ss");
            String username = "";
            ResultSet rs1 = Database.getData("SELECT use_username FROM User WHERE use_id = '" + user + "'");
            if (rs1.next()) {
                username = rs1.getString("use_username");
            }
            String path = "D://MYPROJECT//CAMBRIDGE_NEW_VERSION_1_0//src//com//prog//cnv//sys//report//GoodReceiveNote.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap<String, Object> m = new HashMap<>();
            m.put("grn", grnID + "");
            m.put("supplier", cb_grn_supplier.getSelectedItem().toString());
            m.put("creator", username);
            m.put("date", sdfD.format(new Date()));
            m.put("time", sdfT.format(new Date()));
            m.put("quantity", txt_grn_tqty.getText().toString());
            m.put("amount", txt_grn_tbp.getText().toString());
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
                jLabel41.setText(date);
                sdf = new SimpleDateFormat("hh:mm:ss");
                time = sdf.format(d);
                jLabel29.setText(time);
            }
        });
        t.start();
    }
}
