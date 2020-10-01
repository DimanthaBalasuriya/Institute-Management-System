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
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class PreviewGrn extends javax.swing.JFrame {

    int user;

    public PreviewGrn() {
        initComponents();
        setDateAndTime();
        fetchDataToTable();
        fetchDataToLable();
    }

    public PreviewGrn(String user) {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lab_grn_invoiceAvt = new javax.swing.JLabel();
        lab_grn_totalItemAvt = new javax.swing.JLabel();
        lab_grn_supplierAvt = new javax.swing.JLabel();
        lab_grn_poAvt = new javax.swing.JLabel();
        lab_grn_totGrnAvt = new javax.swing.JLabel();
        lab_grn_grnCountAvt = new javax.swing.JLabel();
        lab_grn_grnCountText = new javax.swing.JLabel();
        lab_grn_totGrnText = new javax.swing.JLabel();
        lab_grn_poText = new javax.swing.JLabel();
        lab_grn_supplierText = new javax.swing.JLabel();
        lab_grn_totalItemText = new javax.swing.JLabel();
        lab_grn_invoiceText = new javax.swing.JLabel();
        lab_grn_grnCount = new javax.swing.JLabel();
        lab_grn_totalItemCount = new javax.swing.JLabel();
        lab_grn_totGrn = new javax.swing.JLabel();
        lab_grn_poCount = new javax.swing.JLabel();
        lab_grn_invoiceCount = new javax.swing.JLabel();
        lab_grn_supplierCount = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb_grn_scrit = new javax.swing.JComboBox<>();
        txt_grn_search = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
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
        jLabel5.setText("GRN Preview");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRN", "SUPPLIER", "QUANTITY", "PRICE", "ISSUE DATE", "ISSUE TIME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1350, 560));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 180, 70));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 70));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 180, 70));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, 180, 70));

        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 180, 70));

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 180, 70));

        lab_grn_invoiceAvt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_grn_invoiceAvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_invoice_48px.png"))); // NOI18N
        jPanel4.add(lab_grn_invoiceAvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1185, 15, 60, 60));

        lab_grn_totalItemAvt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_grn_totalItemAvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_supplier_48px.png"))); // NOI18N
        jPanel4.add(lab_grn_totalItemAvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(945, 15, 60, 60));

        lab_grn_supplierAvt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_grn_supplierAvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_supplier_48px.png"))); // NOI18N
        jPanel4.add(lab_grn_supplierAvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 15, 60, 60));

        lab_grn_poAvt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_grn_poAvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_shopping_cart_48px.png"))); // NOI18N
        jPanel4.add(lab_grn_poAvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 15, 60, 60));

        lab_grn_totGrnAvt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_grn_totGrnAvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_banknotes_48px.png"))); // NOI18N
        jPanel4.add(lab_grn_totGrnAvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 15, 60, 60));

        lab_grn_grnCountAvt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_grn_grnCountAvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_note_48px.png"))); // NOI18N
        jPanel4.add(lab_grn_grnCountAvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, 60, 60));

        lab_grn_grnCountText.setText("GRN Total");
        jPanel4.add(lab_grn_grnCountText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 90, 20));

        lab_grn_totGrnText.setText("GRN Amount");
        jPanel4.add(lab_grn_totGrnText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 90, 20));

        lab_grn_poText.setText("Purchase Order");
        jPanel4.add(lab_grn_poText, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 100, 20));

        lab_grn_supplierText.setText("Supplier Count");
        jPanel4.add(lab_grn_supplierText, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 90, 20));

        lab_grn_totalItemText.setText("Stock Item");
        jPanel4.add(lab_grn_totalItemText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, 90, 20));

        lab_grn_invoiceText.setText("Invoice Count");
        jPanel4.add(lab_grn_invoiceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 20, 90, 20));

        lab_grn_grnCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_grn_grnCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 40, 20));

        lab_grn_totalItemCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_grn_totalItemCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 50, 40, 20));

        lab_grn_totGrn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_grn_totGrn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 40, 20));

        lab_grn_poCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_grn_poCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 40, 20));

        lab_grn_invoiceCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_grn_invoiceCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 50, 40, 20));

        lab_grn_supplierCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_grn_supplierCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, 40, 20));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Filter by");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, 30));

        cb_grn_scrit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Supplier", "Date" }));
        jPanel4.add(cb_grn_scrit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 120, 30));

        txt_grn_search.setBackground(new java.awt.Color(255, 255, 255));
        txt_grn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_grn_searchActionPerformed(evt);
            }
        });
        jPanel4.add(txt_grn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 220, 30));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1350, 10));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_print_25px.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 90, 60, 50));

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

    private void txt_grn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_grn_searchActionPerformed
        //Select, Supplier, Date
        String criteria = cb_grn_scrit.getSelectedItem().toString();
        if (criteria.equalsIgnoreCase("Supplier")) {
            try {
                ResultSet rs = Database.getData("SELECT grn.grn_id, grn.`grn_isu_date`, grn.`grn_isu_time`, grn.`grn_ite_qty`, grn.`grn_total`, sup.`sup_name` FROM GRN grn, Supplier sup WHERE grn.`sup_id` = sup.`sup_id` AND sup.sup_id = '" + txt_grn_search.getText() + "' AND sup.sup_name = '" + txt_grn_search.getText() + "'");
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("grn_id"));
                    v.add(rs.getString("sup_name"));
                    v.add(rs.getString("grn_ite_qty"));
                    v.add(rs.getString("grn_total"));
                    v.add(rs.getString("grn_isu_date"));
                    v.add(rs.getString("grn_isu_time"));
                    dtm.addRow(v);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (criteria.equalsIgnoreCase("Date")) {
            try {
                ResultSet rs = Database.getData("SELECT grn.grn_id, grn.`grn_isu_date`, grn.`grn_isu_time`, grn.`grn_ite_qty`, grn.`grn_total`, sup.`sup_name` FROM GRN grn, Supplier sup WHERE grn.`sup_id` = sup.`sup_id` AND grn.grn_isu_date = '" + txt_grn_search.getText() + "'");
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("grn_id"));
                    v.add(rs.getString("sup_name"));
                    v.add(rs.getString("grn_ite_qty"));
                    v.add(rs.getString("grn_total"));
                    v.add(rs.getString("grn_isu_date"));
                    v.add(rs.getString("grn_isu_time"));
                    dtm.addRow(v);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_txt_grn_searchActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        ViewGrn vg = new ViewGrn(dtm.getValueAt(selectedRow, 0).toString());
        vg.setVisible(true);
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
        try {
            String path = "D://MYPROJECT//CAMBRIDGE_NEW_VERSION_1_0//src//com//prog//cnv//sys//report//IssuedGrnList.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, Database.getConnection());
            ReportViewer rv = new ReportViewer(jp);
            rv.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "PRINTING ERROR!");
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
            java.util.logging.Logger.getLogger(PreviewGrn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreviewGrn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreviewGrn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreviewGrn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PreviewGrn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_grn_scrit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lab_grn_grnCount;
    private javax.swing.JLabel lab_grn_grnCountAvt;
    private javax.swing.JLabel lab_grn_grnCountText;
    private javax.swing.JLabel lab_grn_invoiceAvt;
    private javax.swing.JLabel lab_grn_invoiceCount;
    private javax.swing.JLabel lab_grn_invoiceText;
    private javax.swing.JLabel lab_grn_poAvt;
    private javax.swing.JLabel lab_grn_poCount;
    private javax.swing.JLabel lab_grn_poText;
    private javax.swing.JLabel lab_grn_supplierAvt;
    private javax.swing.JLabel lab_grn_supplierCount;
    private javax.swing.JLabel lab_grn_supplierText;
    private javax.swing.JLabel lab_grn_totGrn;
    private javax.swing.JLabel lab_grn_totGrnAvt;
    private javax.swing.JLabel lab_grn_totGrnText;
    private javax.swing.JLabel lab_grn_totalItemAvt;
    private javax.swing.JLabel lab_grn_totalItemCount;
    private javax.swing.JLabel lab_grn_totalItemText;
    private javax.swing.JTextField txt_grn_search;
    // End of variables declaration//GEN-END:variables

    private void fetchDataToTable() {
        try {
            ResultSet rs = Database.getData("SELECT grn.grn_id, grn.`grn_isu_date`, grn.`grn_isu_time`, grn.`grn_ite_qty`, grn.`grn_total`, sup.`sup_name` FROM GRN grn, Supplier sup WHERE grn.`sup_id` = sup.`sup_id`");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            //dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("grn_id"));
                v.add(rs.getString("sup_name"));
                v.add(rs.getString("grn_ite_qty"));
                v.add(rs.getString("grn_total"));
                v.add(rs.getString("grn_isu_date"));
                v.add(rs.getString("grn_isu_time"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
//
//    lab_grn_grnCount;
//lab_grn_invoiceCount;
//lab_grn_poCount;
//lab_grn_supplierCount;
//lab_grn_totalItemCount

    private void fetchDataToLable() {
        try {
            ResultSet rs1 = Database.getData("SELECT COUNT(grn_id) AS grnCount FROM GRN");
            if (rs1.next()) {
                lab_grn_grnCount.setText(rs1.getInt("grnCount") + "");
            }
            ResultSet rs2 = Database.getData("SELECT SUM(grn_total) AS grnTotal FROM GRN");
            if (rs2.next()) {
                lab_grn_totGrn.setText(rs2.getInt("grnTotal") + "");
            }
            ResultSet rs3 = Database.getData("SELECT COUNT(sup_id) AS supCount FROM Supplier");
            if (rs3.next()) {
                lab_grn_supplierCount.setText(rs3.getInt("supCount") + "");
            }
            ResultSet rs4 = Database.getData("SELECT COUNT(ite_id) AS iteCount FROM Item");
            if (rs4.next()) {
                lab_grn_totalItemCount.setText(rs4.getInt("iteCount") + "");
            }
            ResultSet rs5 = Database.getData("SELECT COUNT(inv_id) AS invCount FROM Invoice");
            if (rs5.next()) {
                lab_grn_invoiceCount.setText(rs5.getInt("invCount") + "");
            }
//            ResultSet rs6 = Database.getData("SELECT COUNT(pur_id) AS purCount FROM PurchaseOrder");
//            if (rs6.next()) {
//                lab_grn_poCount.setText(rs6.getInt("purCounts") + "");
//            }
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
