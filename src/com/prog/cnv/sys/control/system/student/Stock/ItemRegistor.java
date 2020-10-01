package com.prog.cnv.sys.control.system.student.Stock;

import com.prog.cnv.sys.control.system.control.Database;
import com.prog.cnv.sys.control.system.control.Message;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ItemRegistor extends javax.swing.JFrame {

    int user;

    public ItemRegistor() {
        initComponents();
        comboBoxValue();
    }

    public ItemRegistor(String user) {
        this();
        this.user = Integer.parseInt(user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txt_ite_scode = new javax.swing.JTextField();
        txt_ite_name = new javax.swing.JTextField();
        cb_ite_code = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_ite_preview = new javax.swing.JTable();
        btn_ite_refresh = new javax.swing.JButton();
        btn_ite_save = new javax.swing.JButton();
        btn_ite_remove = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 2, new java.awt.Color(40, 40, 40)));
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
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 30));

        jPanel3.setBackground(new java.awt.Color(40, 40, 40));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 720, 20));

        jLabel26.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Code");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        jLabel27.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Name");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel28.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Serial");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 40, -1));

        txt_ite_scode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ite_scodeActionPerformed(evt);
            }
        });
        jPanel1.add(txt_ite_scode, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 140, -1));
        jPanel1.add(txt_ite_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 170, -1));

        cb_ite_code.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel1.add(cb_ite_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 120, -1));

        tab_ite_preview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Code", "Serial"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tab_ite_preview);
        if (tab_ite_preview.getColumnModel().getColumnCount() > 0) {
            tab_ite_preview.getColumnModel().getColumn(0).setResizable(false);
            tab_ite_preview.getColumnModel().getColumn(1).setResizable(false);
            tab_ite_preview.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 700, 270));

        btn_ite_refresh.setText("REFRESH");
        btn_ite_refresh.setBorder(null);
        btn_ite_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ite_refreshActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ite_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 355, 90, 30));

        btn_ite_save.setText("SAVE");
        btn_ite_save.setBorder(null);
        btn_ite_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ite_saveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ite_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 355, 90, 30));

        btn_ite_remove.setText("REMOVE");
        btn_ite_remove.setBorder(null);
        btn_ite_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ite_removeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ite_remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 355, 90, 30));

        jButton1.setText("ITEM CODE");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 355, -1, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 700, 10));

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

    private void btn_ite_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ite_removeActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tab_ite_preview.getModel();
        if (tab_ite_preview.isRowSelected(tab_ite_preview.getSelectedRow())) {
            dtm.removeRow(tab_ite_preview.getSelectedRow());
            JOptionPane.showMessageDialog(null, Message.SUCCESSFULLYREMOVEDATAFROMTABLE);
        } else {
            JOptionPane.showMessageDialog(null, Message.PLEASEADDITEMSTOTABLE);
        }
    }//GEN-LAST:event_btn_ite_removeActionPerformed

    private void txt_ite_scodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ite_scodeActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tab_ite_preview.getModel();
        Vector v = new Vector();
        v.add(txt_ite_name.getText());
        v.add(cb_ite_code.getSelectedItem());
        v.add(txt_ite_scode.getText());
        dtm.addRow(v);
        txt_ite_name.setText(null);
        cb_ite_code.setSelectedIndex(0);
        txt_ite_scode.setText(null);
        txt_ite_name.grabFocus();
    }//GEN-LAST:event_txt_ite_scodeActionPerformed

    private void btn_ite_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ite_refreshActionPerformed
        cb_ite_code.setSelectedIndex(0);
        txt_ite_name.setText(null);
        txt_ite_scode.setText(null);
        DefaultTableModel dtm = (DefaultTableModel) tab_ite_preview.getModel();
        dtm.setRowCount(0);
        JOptionPane.showMessageDialog(null, Message.REFRESHTHETABLE);
    }//GEN-LAST:event_btn_ite_refreshActionPerformed

    private void btn_ite_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ite_saveActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) tab_ite_preview.getModel();
            if (!(dtm.getRowCount() == 0)) {
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    Database.sendData("INSERT INTO Item (ite_name, ite_serial, ite_unit_price, ite_buy_price, ite_quantity, itc_id, use_id) "
                            + "VALUES('" + dtm.getValueAt(i, 0) + "','" + dtm.getValueAt(i, 2) + "','" + 0 + "','" + 0 + "','" + 0 + "',(SELECT itc_id FROM itemCode WHERE itc_code = '" + dtm.getValueAt(i, 1) + "'), '" + user + "')");
                }
                JOptionPane.showMessageDialog(null, Message.SUCCESSFULLDATAINSERT);
            } else {
                JOptionPane.showMessageDialog(null, Message.PLEASEADDITEMSTOTABLE);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_ite_saveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ItemCode itc = new ItemCode();
        itc.setVisible(true);
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
            java.util.logging.Logger.getLogger(ItemRegistor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemRegistor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemRegistor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemRegistor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemRegistor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ite_refresh;
    private javax.swing.JButton btn_ite_remove;
    private javax.swing.JButton btn_ite_save;
    private javax.swing.JComboBox<String> cb_ite_code;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tab_ite_preview;
    private javax.swing.JTextField txt_ite_name;
    private javax.swing.JTextField txt_ite_scode;
    // End of variables declaration//GEN-END:variables

    private void comboBoxValue() {
        try {
            ResultSet rs = Database.getData("SELECT itc_code FROM itemCode");
            while (rs.next()) {
                cb_ite_code.addItem(rs.getString("itc_code"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
