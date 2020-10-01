package com.prog.cnv.sys.control.system.student.ClassManagement;

import com.prog.cnv.sys.control.system.control.Database;
import com.prog.cnv.sys.control.system.control.Message;
import com.prog.cnv.sys.control.system.control.Systemcontroller;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FANSOUL
 */
public class ClassRoomRegister extends javax.swing.JFrame {

    int user;

    public ClassRoomRegister() {
        initComponents();
        comboBoxValue();
    }

    public ClassRoomRegister(String user) {
        this();
        this.user = Integer.parseInt(user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txt_cro_roomno = new javax.swing.JTextField();
        cb_cro_floor = new javax.swing.JComboBox<>();
        cb_cro_rtype = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_cro_preview = new javax.swing.JTable();
        btn_cro_remove = new javax.swing.JButton();
        btn_cro_add = new javax.swing.JButton();
        btn_cro_save = new javax.swing.JButton();
        btn_cro_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(40, 40, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 30, 30));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Class Room");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 30));

        jPanel3.setBackground(new java.awt.Color(40, 40, 40));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 820, 10));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Class room manager", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Room type");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, 30));

        jLabel24.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Room no");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 30));

        jLabel27.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Floor");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, 30));

        txt_cro_roomno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cro_roomnoActionPerformed(evt);
            }
        });
        txt_cro_roomno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cro_roomnoKeyPressed(evt);
            }
        });
        jPanel4.add(txt_cro_roomno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 80, 30));

        cb_cro_floor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel4.add(cb_cro_floor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 110, 30));

        cb_cro_rtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel4.add(cb_cro_rtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 130, 30));

        tab_cro_preview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Floor", "Room type"
            }
        ));
        jScrollPane1.setViewportView(tab_cro_preview);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 800, 280));

        btn_cro_remove.setText("REMOVE");
        btn_cro_remove.setBorder(null);
        btn_cro_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cro_removeActionPerformed(evt);
            }
        });
        jPanel4.add(btn_cro_remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 100, 30));

        btn_cro_add.setText("ADD");
        btn_cro_add.setBorder(null);
        btn_cro_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cro_addActionPerformed(evt);
            }
        });
        jPanel4.add(btn_cro_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 80, 30));

        btn_cro_save.setText("SAVE");
        btn_cro_save.setBorder(null);
        btn_cro_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cro_saveActionPerformed(evt);
            }
        });
        jPanel4.add(btn_cro_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 100, 30));

        btn_cro_clear.setText("CLEAR");
        btn_cro_clear.setBorder(null);
        btn_cro_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cro_clearActionPerformed(evt);
            }
        });
        jPanel4.add(btn_cro_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 100, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 820, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btn_cro_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cro_addActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tab_cro_preview.getModel();
        Vector v = new Vector();
        v.add(txt_cro_roomno.getText());
        v.add(cb_cro_floor.getSelectedItem());
        v.add(cb_cro_rtype.getSelectedItem());
        dtm.addRow(v);
        txt_cro_roomno.setText(null);
        cb_cro_floor.setSelectedIndex(0);
        cb_cro_rtype.setSelectedIndex(0);
    }//GEN-LAST:event_btn_cro_addActionPerformed

    private void btn_cro_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cro_removeActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tab_cro_preview.getModel();
        dtm.removeRow(tab_cro_preview.getSelectedRow());
        JOptionPane.showMessageDialog(null, Message.SUCCESSFULLYREMOVEDATAFROMTABLE);
    }//GEN-LAST:event_btn_cro_removeActionPerformed

    private void btn_cro_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cro_clearActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tab_cro_preview.getModel();
        dtm.setRowCount(0);
        JOptionPane.showMessageDialog(null, Message.REFRESHTHETABLE);
    }//GEN-LAST:event_btn_cro_clearActionPerformed

    private void btn_cro_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cro_saveActionPerformed
        try {
            SimpleDateFormat sdfY = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat sdfT = new SimpleDateFormat("hh:mm:ss");
            DefaultTableModel dtm = (DefaultTableModel) tab_cro_preview.getModel();
            if (dtm.getRowCount() > 0) {
                for (int i = 0; i < dtm.getRowCount(); i++) {
                    Database.sendData("INSERT INTO ClassRoom (clr_no, flr_id, rmt_id, clr_reg_date, clr_reg_time) "
                            + "VALUES('" + dtm.getValueAt(i, 0) + "',(SELECT flr_id FROM Floor WHERE flr_no = '" + dtm.getValueAt(i, 1) + "'),(SELECT rmt_id FROM roomType WHERE rmt_type = '" + dtm.getValueAt(i, 2) + "'),'" + sdfY.format(new Date()) + "','" + sdfT.format(new Date()) + "')");
                }
                JOptionPane.showMessageDialog(null, Message.SUCCESSFULLDATAINSERT);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DATA INSERT CORRUPTION!");
        }
    }//GEN-LAST:event_btn_cro_saveActionPerformed

    private void txt_cro_roomnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cro_roomnoActionPerformed
        String text = txt_cro_roomno.getText();
        if (!(text.contains("A") || text.contains("B") || text.contains("C") || text.contains("D"))) {
            JOptionPane.showMessageDialog(null, "ENNTER VALID ROOM TAG! \n eg- 1A, 1B, 1C, 1D");
        } else {
            cb_cro_floor.grabFocus();
        }
    }//GEN-LAST:event_txt_cro_roomnoActionPerformed

    private void txt_cro_roomnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cro_roomnoKeyPressed
        
    }//GEN-LAST:event_txt_cro_roomnoKeyPressed

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
            java.util.logging.Logger.getLogger(ClassRoomRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassRoomRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassRoomRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassRoomRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassRoomRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cro_add;
    private javax.swing.JButton btn_cro_clear;
    private javax.swing.JButton btn_cro_remove;
    private javax.swing.JButton btn_cro_save;
    private javax.swing.JComboBox<String> cb_cro_floor;
    private javax.swing.JComboBox<String> cb_cro_rtype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tab_cro_preview;
    private javax.swing.JTextField txt_cro_roomno;
    // End of variables declaration//GEN-END:variables

    private void comboBoxValue() {
        try {
            ResultSet rs1 = Database.getData("SELECT DISTINCT flr_no FROM Floor");
            while (rs1.next()) {
                cb_cro_floor.addItem(rs1.getString("flr_no"));
            }
            ResultSet rs2 = Database.getData("SELECT DISTINCT rmt_type FROM roomType");
            while (rs2.next()) {
                cb_cro_rtype.addItem(rs2.getString("rmt_type"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
