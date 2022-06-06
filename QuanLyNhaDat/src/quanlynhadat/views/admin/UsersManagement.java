/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhadat.views.admin;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import quanlynhadat.Controller.AccountController;
import quanlynhadat.Models.Account;

public class UsersManagement extends javax.swing.JFrame {

    /**
     * Creates new form UsersManagement
     */
    public UsersManagement() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUser = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtDisplayName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ NGƯỜI DÙNG");
        setPreferredSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý người dùng");

        tbUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ID", "Họ tên", "Tên người dùng", "Vai trò"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbUser.getTableHeader().setResizingAllowed(false);
        tbUser.getTableHeader().setReorderingAllowed(false);
        tbUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbUser);
        if (tbUser.getColumnModel().getColumnCount() > 0) {
            tbUser.getColumnModel().getColumn(0).setMinWidth(40);
            tbUser.getColumnModel().getColumn(0).setPreferredWidth(40);
            tbUser.getColumnModel().getColumn(0).setMaxWidth(30);
            tbUser.getColumnModel().getColumn(1).setMinWidth(50);
            tbUser.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbUser.getColumnModel().getColumn(1).setMaxWidth(40);
            tbUser.getColumnModel().getColumn(3).setMinWidth(150);
            tbUser.getColumnModel().getColumn(3).setPreferredWidth(150);
            tbUser.getColumnModel().getColumn(3).setMaxWidth(100);
            tbUser.getColumnModel().getColumn(4).setMinWidth(100);
            tbUser.getColumnModel().getColumn(4).setPreferredWidth(100);
            tbUser.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        jLabel2.setText("ID:");

        txtId.setEditable(false);
        txtId.setEnabled(false);

        jLabel3.setText("Tên đăng nhập:");

        jLabel4.setText("Họ tên:");

        btnExit.setText("Quay lại trang chủ Admin");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnAdd.setText("Thêm mới");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel6.setText("Mật khẩu:");

        jLabel9.setText("Tìm kiếm theo tên:");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDisplayName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDisplayName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEdit)
                            .addComponent(btnDelete))
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnExit)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        List<Account> accounts = List.copyOf(AccountController.getAllAccount());

        DefaultTableModel model = (DefaultTableModel) tbUser.getModel();
        int stt = 0;
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (account.getRole_id() != 1) {
                stt++;
                model.addRow(new Object[]{ stt, account.getId(), account.getFullname(), account.getUsername(), "Nhân viên"});
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
        AdminScreenMain adminScreenMain = new AdminScreenMain();
        adminScreenMain.setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
//        // TODO add your handling code here:
        this.dispose();
        AddUserFrame addUserFrame = new AddUserFrame();
        addUserFrame.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void tbUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUserMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel) tbUser.getModel();
        Vector<Object> accountVector = (Vector<Object>) tableModel.getDataVector().elementAt(tbUser.getSelectedRow());

        Account account = new Account();
        account.setId(Integer.parseInt(accountVector.get(1).toString()));
        account.setFullname(accountVector.get(2).toString());
        account.setUsername(accountVector.get(3).toString());
        account.setPassword(accountVector.get(4).toString());

        txtId.setText(account.getId() + "");
        txtDisplayName.setText(account.getFullname());
        txtUsername.setText(account.getUsername());
        txtPassword.setText(account.getPassword());
    }//GEN-LAST:event_tbUserMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
//        if (txtUsername.getText().trim().compareTo("") == 0) {
//            return;
//        }
//
//        Account account = new Account();
//        account.setId(Integer.parseInt(txtId.getText()));
//        account.setDisplayName(txtDisplayName.getText());
//        account.setUsername(txtUsername.getText());
//        account.setRole(cbRole.getSelectedItem().toString());
//
//        if (String.valueOf(txtPassword.getPassword()).trim().compareTo("") != 0) {
//            if (String.valueOf(txtPassword.getPassword()).length() < 8) {
//                JOptionPane.showConfirmDialog(null, "Mật khẩu phải có ít nhất 8 ký tự", "Lỗi thêm mới", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
//                return;
//            }
//
//            account.setPassword(String.valueOf(txtPassword.getPassword()));
//        }
//
//        if (!accountService.updateAccount(account)) {
//            JOptionPane.showConfirmDialog(null, "Sửa thông tin tài khoản thất bại", "Sửa tài khoản", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//        JOptionPane.showConfirmDialog(null, "Sửa thông tin tài khoản thành công", "Sửa tài khoản", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
//
//        DefaultTableModel model = (DefaultTableModel) tbUser.getModel();
//        model.setRowCount(0);
//        formWindowOpened(null);

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
//        if (txtUsername.getText().trim().compareTo("") == 0) {
//            return;
//        }
//
//        int responseConfirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn xóa không?", "Xóa tài khoản", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//        if (responseConfirm == JOptionPane.YES_OPTION) {
//            if (!accountService.deleteAccount(Integer.parseInt(txtId.getText()))) {
//                JOptionPane.showConfirmDialog(null, "Xóa tài khoản thất bại", "Xóa tài khoản", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
//                return;
//            }
//            JOptionPane.showConfirmDialog(null, "Xóa tài khoản thành công", "Xóa tài khoản", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
//            DefaultTableModel model = (DefaultTableModel) tbUser.getModel();
//            model.setRowCount(0);
//            formWindowOpened(null);
//        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
//        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//            if (txtSearch.getText().trim().compareTo("") == 0) {
//                DefaultTableModel model = (DefaultTableModel) tbUser.getModel();
//                model.setRowCount(0);
//
//                List<Account> accounts = accountService.getAllAccounts();
//
//                for (int i = 0; i < accounts.size(); i++) {
//                    Account account = accounts.get(i);
//                    model.addRow(new Object[]{i + 1, account.getAccountId(), account.getDisplayName(), account.getUsername(), account.getRole()});
//                }
//            } else {
//                DefaultTableModel model = (DefaultTableModel) tbUser.getModel();
//                model.setRowCount(0);
//
//                List<Account> accounts = accountService.getAccountsLikeUsername(txtSearch.getText());
//
//                for (int i = 0; i < accounts.size(); i++) {
//                    Account account = accounts.get(i);
//                    model.addRow(new Object[]{i + 1, account.getAccountId(), account.getDisplayName(), account.getUsername(), account.getRole()});
//                }
//            }
//        }
    }//GEN-LAST:event_txtSearchKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UsersManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsersManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsersManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsersManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsersManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbUser;
    private javax.swing.JTextField txtDisplayName;
    private javax.swing.JTextField txtId;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
