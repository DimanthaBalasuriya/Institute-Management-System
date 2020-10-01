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
import java.util.Map;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class InvoicePreview extends javax.swing.JFrame {

    int user;

    public InvoicePreview() {
        initComponents();
        setDateAndTime();
        previewTableValues();
        lableValues();
    }

    public InvoicePreview(String user) {
        this();
        this.user = Integer.parseInt(user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lab_tot_invoiceAvt = new javax.swing.JLabel();
        lab_tot_totOfInvoiceAvr = new javax.swing.JLabel();
        lab_tot_todayAvt = new javax.swing.JLabel();
        lab_tot_todayAmountAvt = new javax.swing.JLabel();
        lab_tot_dueAvt = new javax.swing.JLabel();
        lab_tot_paidCountAvt = new javax.swing.JLabel();
        lab_tot_totOfInvoiceText = new javax.swing.JLabel();
        lab_tot_invoicetext = new javax.swing.JLabel();
        lab_tot_todaytext = new javax.swing.JLabel();
        lab_tot_todayAmountText = new javax.swing.JLabel();
        lab_tot_dueText = new javax.swing.JLabel();
        lab_tot_paidCountText = new javax.swing.JLabel();
        lab_tot_invoiceAmount = new javax.swing.JLabel();
        lab_tot_paidCountAmount = new javax.swing.JLabel();
        lab_tot_todayAmount = new javax.swing.JLabel();
        lab_tot_todayAmountAmount = new javax.swing.JLabel();
        lab_tot_totOfInvoiceAmount = new javax.swing.JLabel();
        lab_tot_dueAmount = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel5.setText("Invoice Detail");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "INVOICE NO", "QUANTITY", "SUB TOTAL ", "DISCOUNT", "NET TOTAL", "ISSUE DATE", "ISSUE TIME", "PAY STATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
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
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 141, 1350, 560));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 10, 180, 70));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 70));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 180, 70));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 180, 70));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 180, 70));

        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 180, 70));

        lab_tot_invoiceAvt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_tot_invoiceAvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_bill_70px.png"))); // NOI18N
        jPanel4.add(lab_tot_invoiceAvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 70, 60));

        lab_tot_totOfInvoiceAvr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_tot_totOfInvoiceAvr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_total_sales_1_70px_3.png"))); // NOI18N
        jPanel4.add(lab_tot_totOfInvoiceAvr, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 15, 70, 60));

        lab_tot_todayAvt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_tot_todayAvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_Coins_70px.png"))); // NOI18N
        jPanel4.add(lab_tot_todayAvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 15, 70, 60));

        lab_tot_todayAmountAvt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_tot_todayAmountAvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_request_money_70px.png"))); // NOI18N
        jPanel4.add(lab_tot_todayAmountAvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 15, 70, 60));

        lab_tot_dueAvt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_tot_dueAvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_payment_history_70px.png"))); // NOI18N
        jPanel4.add(lab_tot_dueAvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 15, 70, 60));

        lab_tot_paidCountAvt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_tot_paidCountAvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_cash_in_hand_70px_1.png"))); // NOI18N
        jPanel4.add(lab_tot_paidCountAvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 15, 70, 60));

        lab_tot_totOfInvoiceText.setText("Total Amount");
        jPanel4.add(lab_tot_totOfInvoiceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 15, 80, 20));

        lab_tot_invoicetext.setText("Total Count");
        jPanel4.add(lab_tot_invoicetext, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 15, 80, 20));

        lab_tot_todaytext.setText("Total today");
        jPanel4.add(lab_tot_todaytext, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 15, 80, 20));

        lab_tot_todayAmountText.setText("Today Amount");
        jPanel4.add(lab_tot_todayAmountText, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 15, 85, 20));

        lab_tot_dueText.setText("Due Count");
        jPanel4.add(lab_tot_dueText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 15, 80, 20));

        lab_tot_paidCountText.setText("Paid Count");
        jPanel4.add(lab_tot_paidCountText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 15, 80, 20));

        lab_tot_invoiceAmount.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lab_tot_invoiceAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_tot_invoiceAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 50, 20));

        lab_tot_paidCountAmount.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lab_tot_paidCountAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_tot_paidCountAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 40, 50, 20));

        lab_tot_todayAmount.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lab_tot_todayAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_tot_todayAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 50, 20));

        lab_tot_todayAmountAmount.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lab_tot_todayAmountAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_tot_todayAmountAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 50, 20));

        lab_tot_totOfInvoiceAmount.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lab_tot_totOfInvoiceAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_tot_totOfInvoiceAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 50, 20));

        lab_tot_dueAmount.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lab_tot_dueAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_tot_dueAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 40, 50, 20));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1350, 10));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1178, 186, 180, 20));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_print_25px.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 90, 50, 50));
        jPanel4.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 210, 30));

        jButton1.setText("Search");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 70, 30));

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

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Date d = jDateChooser1.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (d == null) {
            try {
                String path = "D://MYPROJECT//CAMBRIDGE_NEW_VERSION_1_0//src//com//prog//cnv//sys//report//IssuedInvoiceList.jrxml";
                JasperReport jr = JasperCompileManager.compileReport(path);
                JasperPrint jp = JasperFillManager.fillReport(jr, null, Database.getConnection());
                ReportViewer rv = new ReportViewer(jp);
                rv.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "PRINTING ERROR!");
            }
        } else {
            try {
                String path = "D://MYPROJECT//CAMBRIDGE_NEW_VERSION_1_0//src//com//prog//cnv//sys//report//IssuedInvoiceListInSelectedDate.jrxml";
                JasperReport jr = JasperCompileManager.compileReport(path);
                Map<String, Object> m = new HashMap();
                m.put("date", sdf.format(d));
                JasperPrint jp = JasperFillManager.fillReport(jr, m, Database.getConnection());
                ReportViewer rv = new ReportViewer(jp);
                rv.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "PRINTING ERROR!");
            }
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        String invoiceId = dtm.getValueAt(selectedRow, 0).toString();
        ViewInvoice vin = new ViewInvoice(invoiceId);
        vin.setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Date d = jDateChooser1.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (d == null) {
            JOptionPane.showMessageDialog(null, "Please select date!");
            previewTableValues();
        } else {
            try {
                ResultSet rs = Database.getData("SELECT `invoice`.`inv_id`, `invoice`.`inv_discount`, `invoice`.`inv_isu_date`, `invoice`.`inv_isu_time`, `invoice`.`inv_ite_qty`, `invoice`.`inv_net_total`\n"
                        + ", `invoice`.`inv_sub_total`, `invoicepayment`.`inp_amount` FROM `cambridge_project`.`invoicepayment` INNER JOIN `cambridge_project`.`invoice` ON (`invoicepayment`.`inv_id` = `invoice`.`inv_id`) WHERE `invoice`.`inv_isu_date` = '" + sdf.format(d) + "'");
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("inv_id"));
                    v.add(rs.getString("inv_ite_qty"));
                    v.add(rs.getString("inv_sub_total"));
                    v.add(rs.getString("inv_discount"));
                    v.add(rs.getString("inv_net_total"));
                    v.add(rs.getString("inv_isu_date"));
                    v.add(rs.getString("inv_isu_time"));
                    double actualAmount = Double.parseDouble(rs.getString("inp_amount"));
                    double currentPayment = Double.parseDouble(rs.getString("inv_net_total"));
                    if (actualAmount == currentPayment) {
                        v.add("PAID");
                    } else if (actualAmount > currentPayment) {
                        v.add("DUE");
                    } else if (currentPayment == 0) {
                        v.add("NOT PAID");
                    }
                    dtm.addRow(v);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InvoicePreview.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoicePreview.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoicePreview.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoicePreview.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoicePreview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lab_tot_dueAmount;
    private javax.swing.JLabel lab_tot_dueAvt;
    private javax.swing.JLabel lab_tot_dueText;
    private javax.swing.JLabel lab_tot_invoiceAmount;
    private javax.swing.JLabel lab_tot_invoiceAvt;
    private javax.swing.JLabel lab_tot_invoicetext;
    private javax.swing.JLabel lab_tot_paidCountAmount;
    private javax.swing.JLabel lab_tot_paidCountAvt;
    private javax.swing.JLabel lab_tot_paidCountText;
    private javax.swing.JLabel lab_tot_todayAmount;
    private javax.swing.JLabel lab_tot_todayAmountAmount;
    private javax.swing.JLabel lab_tot_todayAmountAvt;
    private javax.swing.JLabel lab_tot_todayAmountText;
    private javax.swing.JLabel lab_tot_todayAvt;
    private javax.swing.JLabel lab_tot_todaytext;
    private javax.swing.JLabel lab_tot_totOfInvoiceAmount;
    private javax.swing.JLabel lab_tot_totOfInvoiceAvr;
    private javax.swing.JLabel lab_tot_totOfInvoiceText;
    // End of variables declaration//GEN-END:variables

    private void previewTableValues() {
        try {
            ResultSet rs = Database.getData("SELECT `invoice`.`inv_id`, `invoice`.`inv_discount`, `invoice`.`inv_isu_date`, `invoice`.`inv_isu_time`, `invoice`.`inv_ite_qty`, `invoice`.`inv_net_total`\n"
                    + ", `invoice`.`inv_sub_total`, `invoicepayment`.`inp_amount` FROM `cambridge_project`.`invoicepayment` INNER JOIN `cambridge_project`.`invoice` ON (`invoicepayment`.`inv_id` = `invoice`.`inv_id`)");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("inv_id"));
                v.add(rs.getString("inv_ite_qty"));
                v.add(rs.getString("inv_sub_total"));
                v.add(rs.getString("inv_discount"));
                v.add(rs.getString("inv_net_total"));
                v.add(rs.getString("inv_isu_date"));
                v.add(rs.getString("inv_isu_time"));
                double actualAmount = Double.parseDouble(rs.getString("inp_amount"));
                double currentPayment = Double.parseDouble(rs.getString("inv_net_total"));
                if (actualAmount == currentPayment) {
                    v.add("PAID");
                } else if (actualAmount > currentPayment) {
                    v.add("DUE");
                } else if (currentPayment == 0) {
                    v.add("NOT PAID");
                }
                dtm.addRow(v);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void lableValues() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ResultSet rs1 = Database.getData("SELECT COUNT(inv_id) AS totalInvoice FROM Invoice");
            if (rs1.next()) {
                lab_tot_totOfInvoiceAmount.setText(rs1.getInt("totalInvoice") + "");
            } else {
                lab_tot_totOfInvoiceAmount.setText(0 + "");
            }
            ResultSet rs2 = Database.getData("SELECT SUM(inv_net_total) AS netTotalInvoice FROM Invoice");
            if (rs2.next()) {
                lab_tot_invoiceAmount.setText(rs2.getDouble("netTotalInvoice") + "");
            } else {
                lab_tot_invoiceAmount.setText(0 + "");
            }
            ResultSet rs3 = Database.getData("SELECT COUNT(inv_id) AS totalInvoicToday FROM Invoice WHERE inv_isu_date = '" + sdf.format(new Date()) + "'");
            if (rs3.next()) {
                lab_tot_todayAmount.setText(rs3.getInt("totalInvoicToday") + "");
            } else {
                lab_tot_todayAmount.setText(0 + "");
            }
            ResultSet rs4 = Database.getData("SELECT SUM(inv_net_total) AS netTotalInvoiceToday FROM Invoice WHERE inv_isu_date = '" + sdf.format(new Date()) + "'");
            if (rs4.next()) {
                lab_tot_todayAmountAmount.setText(rs4.getDouble("netTotalInvoiceToday") + "");
            } else {
                lab_tot_todayAmountAmount.setText(0 + "");
            }
            //Due count
            ResultSet rs5 = Database.getData("SELECT COUNT(inv.`inv_id`) AS dueInvoiceCount FROM Invoice inv, invoicePayment ivp WHERE ivp.`inv_id` = inv.`inv_id` AND \n"
                    + "ivp.`inp_amount` < inv.`inv_net_total`");
            if (rs5.next()) {
                lab_tot_dueAmount.setText(rs5.getInt("dueInvoiceCount") + "");
            } else {
                lab_tot_dueAmount.setText(0 + "");
            }
            //Paid Count
            ResultSet rs6 = Database.getData("SELECT COUNT(inv.`inv_id`) AS dueInvoiceCount FROM Invoice inv, invoicePayment ivp WHERE ivp.`inv_id` = inv.`inv_id` AND \n"
                    + "ivp.`inp_amount` >= inv.`inv_net_total`");
            if (rs5.next()) {
                lab_tot_paidCountAmount.setText(rs6.getInt("dueInvoiceCount") + "");
            } else {
                lab_tot_paidCountAmount.setText(0 + "");
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
