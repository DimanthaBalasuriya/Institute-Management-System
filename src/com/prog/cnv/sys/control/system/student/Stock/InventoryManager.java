package com.prog.cnv.sys.control.system.student.Stock;

import com.prog.cnv.sys.control.system.control.Database;
import com.prog.cnv.sys.control.system.control.Message;
import com.prog.cnv.sys.control.system.control.Systemcontroller;
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

public class InventoryManager extends javax.swing.JFrame {

    int user;

    public InventoryManager() {
        initComponents();
        setDateAndTime();
        stockPreviewTable();
        lableCountAnalyze();
    }

    public InventoryManager(String user) {
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_iva_preview = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txt_ivm_search = new javax.swing.JTextField();
        lab_total_count = new javax.swing.JLabel();
        lab_prop_count = new javax.swing.JLabel();
        lab_total_text = new javax.swing.JLabel();
        lab_rop_count = new javax.swing.JLabel();
        lab_rop_text = new javax.swing.JLabel();
        lab_prop_text = new javax.swing.JLabel();
        lab_prop_avt = new javax.swing.JLabel();
        lab_rop_avt = new javax.swing.JLabel();
        lab_total_avt = new javax.swing.JLabel();
        lab_oos_text = new javax.swing.JLabel();
        lab_oos_count = new javax.swing.JLabel();
        lab_oos_avt = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
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
        jLabel5.setText("Inventory Analyzer");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 70, 30));

        tab_iva_preview.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        tab_iva_preview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Code", "Serial", "Type", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tab_iva_preview);
        if (tab_iva_preview.getColumnModel().getColumnCount() > 0) {
            tab_iva_preview.getColumnModel().getColumn(0).setResizable(false);
            tab_iva_preview.getColumnModel().getColumn(1).setResizable(false);
            tab_iva_preview.getColumnModel().getColumn(2).setResizable(false);
            tab_iva_preview.getColumnModel().getColumn(3).setResizable(false);
            tab_iva_preview.getColumnModel().getColumn(4).setResizable(false);
            tab_iva_preview.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1240, 650));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 10, 10, 690));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Current inventory");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, 30));

        txt_ivm_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ivm_searchActionPerformed(evt);
            }
        });
        txt_ivm_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ivm_searchKeyReleased(evt);
            }
        });
        jPanel4.add(txt_ivm_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 230, 30));

        lab_total_count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_total_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 110, 90, 20));

        lab_prop_count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_prop_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 670, 90, 20));

        lab_total_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_total_text.setText("Current Stock");
        jPanel4.add(lab_total_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 20, 90, 20));

        lab_rop_count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_rop_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 290, 90, 20));

        lab_rop_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_rop_text.setText("Current ROP");
        jPanel4.add(lab_rop_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 200, 90, 20));

        lab_prop_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_prop_text.setText("Pending ROP");
        jPanel4.add(lab_prop_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 580, 90, 20));

        lab_prop_avt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_prop_avt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_data_pending_48px.png"))); // NOI18N
        lab_prop_avt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(lab_prop_avt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 190, 90, 130));

        lab_rop_avt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_rop_avt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_move_by_trolley_48px_1.png"))); // NOI18N
        lab_rop_avt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(lab_rop_avt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 570, 90, 130));

        lab_total_avt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_total_avt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_stocks_48px.png"))); // NOI18N
        lab_total_avt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(lab_total_avt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 10, 90, 130));

        lab_oos_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_oos_text.setText("Out of Stock");
        jPanel4.add(lab_oos_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 390, 90, 20));

        lab_oos_count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lab_oos_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 480, 90, 20));

        lab_oos_avt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_oos_avt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_open_box_48px_1.png"))); // NOI18N
        lab_oos_avt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(lab_oos_avt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 380, 90, 130));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 690, 10));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prog/cnv/sys/control/system/icon/icons8_print_25px.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 50, 50));

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

    private void txt_ivm_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ivm_searchActionPerformed

    }//GEN-LAST:event_txt_ivm_searchActionPerformed

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
            String path = "D://MYPROJECT//CAMBRIDGE_NEW_VERSION_1_0//src//com//prog//cnv//sys//report//InventoryItemList.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, Database.getConnection());
            ReportViewer rv = new ReportViewer(jp);
            rv.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "PRINTING ERROR!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_ivm_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ivm_searchKeyReleased
        try {
            System.out.println(evt.getKeyCode());
            if (txt_ivm_search.getText().isEmpty() && (evt.getKeyCode() == 8)) {
                stockPreviewTable();
            } else {
                ResultSet rs = Database.getData("SELECT ite.ite_name, ite.ite_serial, ite.ite_type, ite.ite_unit_price, ite.ite_quantity, itc.itc_code FROM Item ite, itemCode itc WHERE ite.itc_id = itc.itc_id AND ite.ite_name LIKE '%" + txt_ivm_search.getText() + "%' OR ite.ite_serial LIKE '%" + txt_ivm_search.getText() + "%' OR ite.itc_id = (SELECT itc_id FROM itemCode WHERE itc_code LIKE '%" + txt_ivm_search.getText() + "%')");
                DefaultTableModel dtm = (DefaultTableModel) tab_iva_preview.getModel();
                dtm.setRowCount(0);
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("ite_name"));
                    v.add(rs.getString("itc_code"));
                    v.add(rs.getString("ite_serial"));
                    v.add(rs.getString("ite_type"));
                    v.add(rs.getString("ite_quantity"));
                    v.add(rs.getString("ite_unit_price"));
                    dtm.addRow(v);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txt_ivm_searchKeyReleased

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
            java.util.logging.Logger.getLogger(InventoryManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lab_oos_avt;
    private javax.swing.JLabel lab_oos_count;
    private javax.swing.JLabel lab_oos_text;
    private javax.swing.JLabel lab_prop_avt;
    private javax.swing.JLabel lab_prop_count;
    private javax.swing.JLabel lab_prop_text;
    private javax.swing.JLabel lab_rop_avt;
    private javax.swing.JLabel lab_rop_count;
    private javax.swing.JLabel lab_rop_text;
    private javax.swing.JLabel lab_total_avt;
    private javax.swing.JLabel lab_total_count;
    private javax.swing.JLabel lab_total_text;
    private javax.swing.JTable tab_iva_preview;
    private javax.swing.JTextField txt_ivm_search;
    // End of variables declaration//GEN-END:variables

    private void stockPreviewTable() {
        try {
            ResultSet rs = Database.getData("SELECT ite.ite_name, ite.ite_serial, ite.ite_type, ite.ite_unit_price, ite.ite_quantity, itc.itc_code FROM Item ite, itemCode itc WHERE ite.itc_id = itc.itc_id");
            DefaultTableModel dtm = (DefaultTableModel) tab_iva_preview.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("ite_name"));
                v.add(rs.getString("itc_code"));
                v.add(rs.getString("ite_serial"));
                v.add(rs.getString("ite_type"));
                v.add(rs.getString("ite_quantity"));
                v.add(rs.getString("ite_unit_price"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void lableCountAnalyze() {
        try {
            ResultSet rs1 = Database.getData("SELECT COUNT(ite_id) AS itemCount FROM Item");
            if (rs1.next()) {
                lab_total_count.setText(rs1.getInt("itemCount") + "");
            }
            ResultSet rs2 = Database.getData("SELECT COUNT(ite_id) AS cropCount FROM Item WHERE ite_quantity <= '" + Systemcontroller.rop + "' AND ite_quantity > '" + 0 + "' ");
            if (rs2.next()) {
                lab_rop_count.setText(rs2.getInt("cropCount") + "");
            }
            ResultSet rs3 = Database.getData("SELECT COUNT(ite_id) AS propCount FROM Item WHERE ite_quantity >= '" + Systemcontroller.rop + "' AND ite_quantity <= '" + (Systemcontroller.rop + 10) + "'");
            if (rs3.next()) {
                lab_prop_count.setText(rs3.getInt("propCount") + "");
            }
            ResultSet rs4 = Database.getData("SELECT COUNT(ite_id) AS oosCount FROM Item WHERE ite_quantity <= '" + Systemcontroller.rop + "' OR ite_quantity = '" + 0 + "'");
            if (rs4.next()) {
                lab_oos_count.setText(rs4.getInt("oosCount") + "");
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
