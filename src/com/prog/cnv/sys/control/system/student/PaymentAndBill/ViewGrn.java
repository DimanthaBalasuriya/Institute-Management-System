package com.prog.cnv.sys.control.system.student.PaymentAndBill;

import com.prog.cnv.sys.control.system.control.Database;
import com.prog.cnv.sys.control.system.student.ReportViewer;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class ViewGrn extends javax.swing.JFrame {

    private int grnID;

    public ViewGrn() {
        initComponents();
        txt_egp_date.setEnabled(false);
        txt_egp_grn.setEnabled(false);
        txt_egp_quantity.setEnabled(false);
        txt_egp_supp.setEnabled(false);
        txt_egp_time.setEnabled(false);
        txt_egp_total.setEnabled(false);
    }

    public ViewGrn(String flag1) {
        this();
        grnID = Integer.parseInt(flag1);
        fetchDataToTable(flag1);
        fetchDataToUpperFields(flag1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txt_egp_quantity = new javax.swing.JTextField();
        txt_egp_grn = new javax.swing.JTextField();
        txt_egp_date = new javax.swing.JTextField();
        txt_egp_supp = new javax.swing.JTextField();
        txt_egp_total = new javax.swing.JTextField();
        txt_egp_time = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(40, 40, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Expand Preview");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 30));

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
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 30));

        jPanel3.setBackground(new java.awt.Color(40, 40, 40));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1020, 20));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("GRN");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel27.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Supplier");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel28.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Date");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        jLabel29.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Time");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, -1, -1));

        jLabel30.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Total");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        jLabel31.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Quantity");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        txt_egp_quantity.setEditable(false);
        jPanel4.add(txt_egp_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 50, -1));

        txt_egp_grn.setEditable(false);
        jPanel4.add(txt_egp_grn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 50, -1));

        txt_egp_date.setEditable(false);
        jPanel4.add(txt_egp_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 110, -1));

        txt_egp_supp.setEditable(false);
        jPanel4.add(txt_egp_supp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 110, -1));

        txt_egp_total.setEditable(false);
        jPanel4.add(txt_egp_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 110, -1));

        txt_egp_time.setEditable(false);
        jPanel4.add(txt_egp_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 100, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM", "QUANTITY", "PRICE", "BUY", "SELL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1000, 360));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_print_25px.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 415, 60, 40));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1000, 10));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1020, 460));

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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String path = "D://MYPROJECT//CAMBRIDGE_NEW_VERSION_1_0//src//com//prog//cnv//sys//report//SelectedGrnItemList.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(path);
            HashMap<String, Object> m = new HashMap<>();
            m.put("grnid", grnID);
            JasperPrint jp = JasperFillManager.fillReport(jr, m, Database.getConnection());
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
            java.util.logging.Logger.getLogger(ViewGrn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewGrn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewGrn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewGrn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewGrn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_egp_date;
    private javax.swing.JTextField txt_egp_grn;
    private javax.swing.JTextField txt_egp_quantity;
    private javax.swing.JTextField txt_egp_supp;
    private javax.swing.JTextField txt_egp_time;
    private javax.swing.JTextField txt_egp_total;
    // End of variables declaration//GEN-END:variables

    private void fetchDataToTable(String flag1) {
        try {
            int grnID = Integer.parseInt(flag1);
            ResultSet rs = Database.getData("SELECT `item`.`ite_name`, `grndetail`.`grd_ite_qty`, `grndetail`.`grd_price`, `grndetail`.`grd_bPrice`, `grndetail`.`grd_sPrice`\n"
                    + "FROM `cambridge_project`.`grndetail` INNER JOIN `cambridge_project`.`grn` ON (`grndetail`.`grn_id` = `grn`.`grn_id`)\n"
                    + "INNER JOIN `cambridge_project`.`item` ON (`grndetail`.`ite_id` = `item`.`ite_id`) WHERE `grn`.`grn_id` = '" + grnID + "'");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("ite_name"));
                v.add(rs.getString("grd_ite_qty"));
                v.add(rs.getString("grd_price"));
                v.add(rs.getString("grd_bPrice"));
                v.add(rs.getString("grd_sPrice"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fetchDataToUpperFields(String flag1) {
        try {
            ResultSet rs1 = Database.getData("SELECT `grn`.`grn_id`, `grn`.`grn_ite_qty`, `supplier`.`sup_name`, `grn`.`grn_isu_date`, `grn`.`grn_isu_time`, `grn`.`grn_total` FROM\n"
                    + "`cambridge_project`.`grn` INNER JOIN `cambridge_project`.`supplier` ON (`grn`.`sup_id` = `supplier`.`sup_id`) WHERE `grn`.`grn_id` = '" + flag1 + "'");
            if (rs1.next()) {
                txt_egp_date.setText(rs1.getString("grn_isu_date"));
                txt_egp_grn.setText(rs1.getString("grn_id"));
                txt_egp_quantity.setText(rs1.getString("grn_ite_qty"));
                txt_egp_supp.setText(rs1.getString("sup_name"));
                txt_egp_time.setText(rs1.getString("grn_isu_time"));
                txt_egp_total.setText(rs1.getString("grn_total"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
