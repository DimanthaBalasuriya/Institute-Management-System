package com.prog.cnv.sys.control.system.student.Stock;

import com.prog.cnv.sys.control.system.control.Database;
import com.prog.cnv.sys.control.system.control.Message;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ItemCode extends javax.swing.JFrame {

    public ItemCode() {
        initComponents();
    }

    public ItemCode(String string) {
        this();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        txt_itr_code = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_itr_preview = new javax.swing.JTable();
        btn_itr_refresh = new javax.swing.JButton();
        btn_itr_delete = new javax.swing.JButton();
        btn_itr_save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(40, 40, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Item register");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

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
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 30));

        jPanel3.setBackground(new java.awt.Color(40, 40, 40));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 340, 20));

        jLabel27.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Code");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        txt_itr_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_itr_codeActionPerformed(evt);
            }
        });
        jPanel1.add(txt_itr_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 240, -1));

        tab_itr_preview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tab_itr_preview);
        if (tab_itr_preview.getColumnModel().getColumnCount() > 0) {
            tab_itr_preview.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 320, 160));

        btn_itr_refresh.setText("REFRESH");
        btn_itr_refresh.setBorder(null);
        btn_itr_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_itr_refreshActionPerformed(evt);
            }
        });
        jPanel1.add(btn_itr_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 90, 35));

        btn_itr_delete.setText("DELETE");
        btn_itr_delete.setBorder(null);
        btn_itr_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_itr_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_itr_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 90, 35));

        btn_itr_save.setText("SAVE");
        btn_itr_save.setBorder(null);
        btn_itr_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_itr_saveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_itr_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 90, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_itr_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_itr_deleteActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) tab_itr_preview.getModel();
            if (tab_itr_preview.isRowSelected(tab_itr_preview.getSelectedRow())) {
                Database.sendData("UPDATE itemCode SET itc_state = 'deactive' WHERE itc_code = '" + dtm.getValueAt(tab_itr_preview.getSelectedRow(), 0) + "'");
                refreshQuery();
            } else {
                JOptionPane.showMessageDialog(null, Message.NOSELECTEDROW);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_itr_deleteActionPerformed

    private void txt_itr_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_itr_codeActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tab_itr_preview.getModel();
        Vector v = new Vector();
        v.add(txt_itr_code.getText());
        dtm.addRow(v);
        txt_itr_code.setText(null);
    }//GEN-LAST:event_txt_itr_codeActionPerformed

    private void btn_itr_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_itr_refreshActionPerformed
        refreshQuery();
    }//GEN-LAST:event_btn_itr_refreshActionPerformed

    private void btn_itr_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_itr_saveActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) tab_itr_preview.getModel();
            if (tab_itr_preview.isRowSelected(tab_itr_preview.getSelectedRow())) {
                JOptionPane.showMessageDialog(null, Message.PLEASEADDITEMSTOTABLE);
            } else {
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    if (dtm.getValueAt(i, 0).toString().contains("#")) {
                        Database.sendData("INSERT INTO itemCode (itc_code) VALUES('" + dtm.getValueAt(i, 0) + "')");
                    } else {
                        Database.sendData("INSERT INTO itemCode (itc_code) VALUES('" + "#" + dtm.getValueAt(i, 0) + "')");
                    }
                }
                refreshQuery();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_itr_saveActionPerformed

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
            java.util.logging.Logger.getLogger(ItemCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemCode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_itr_delete;
    private javax.swing.JButton btn_itr_refresh;
    private javax.swing.JButton btn_itr_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tab_itr_preview;
    private javax.swing.JTextField txt_itr_code;
    // End of variables declaration//GEN-END:variables

    private void refreshQuery() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) tab_itr_preview.getModel();
            ResultSet rs = Database.getData("SELECT itc_code FROM itemCode WHERE itc_state = 'active'");
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("itc_code"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
