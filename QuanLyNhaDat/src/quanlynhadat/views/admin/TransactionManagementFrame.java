package quanlynhadat.views.admin;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import quanlynhadat.Controller.AccountController;
import quanlynhadat.Controller.TransactionController;
import quanlynhadat.Models.Transaction;

public class TransactionManagementFrame extends javax.swing.JDialog {
    
    static List<Transaction> list = new ArrayList();
    DefaultTableModel model = new DefaultTableModel();
    int money = 0;
    
    public TransactionManagementFrame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) tableHachToan.getModel();
        show1();
        addYear();
    }

    //Hiển thị dữ liệu vào bảng
    private void show1() {
        cbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
        cbYear.setSelectedIndex(0);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        list = TransactionController.getAllTransaction();
        model.setRowCount(0);
        money = 0;
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
        for (int i = 0; i < list.size(); i++) {
            String type = "";
            if (list.get(i).getType() == 1) {
                type = "Giao dịch nhà";
            } else if (list.get(i).getType() == 2) {
                type = "Giao dịch đất";
            } else {
                type = "Không xác định";
            }
            String Employee = AccountController.getAccountByID(list.get(i).getId()).getFullname();
            model.addRow(new Object[]{i + 1, list.get(i).getT_id(), type, Employee, sdf.format(list.get(i).getT_date()), list.get(i).getMoney()});
            money += list.get(i).getMoney();
            txtSum.setText(String.valueOf(money));
        }
    }
    
    private void addYear(String year) {
        int dem = 0;
        for (int i = 0; i < cbYear.getItemCount(); i++) {
            if (!cbYear.getItemAt(i).equalsIgnoreCase(year)) {
                dem++;
            }
        }
        if (dem == cbYear.getItemCount()) {
            cbYear.addItem(year);
        }
    }

    //lấy ra các năm trong CSDL để thêm vào combobox Year
    private void addYear() {
//        cbYear.addItem(" ");
        list = TransactionController.getAllTransaction();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
        for (int i = 0; i < list.size(); i++) {
            addYear(sdf1.format(list.get(i).getT_date()));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableHachToan = new javax.swing.JTable();
        lblHoachToan = new javax.swing.JLabel();
        cbMonth = new javax.swing.JComboBox<>();
        cbYear = new javax.swing.JComboBox<>();
        txtSum = new javax.swing.JTextField();
        lblMonth = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BÁO CÁO DOANH THU");

        tableHachToan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableHachToan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã giao dịch", "Loại giao dịch", "Nhân viên", "Ngày giao dịch", "Số tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableHachToan.setEnabled(false);
        jScrollPane1.setViewportView(tableHachToan);
        if (tableHachToan.getColumnModel().getColumnCount() > 0) {
            tableHachToan.getColumnModel().getColumn(0).setMinWidth(50);
            tableHachToan.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableHachToan.getColumnModel().getColumn(0).setMaxWidth(50);
            tableHachToan.getColumnModel().getColumn(1).setMinWidth(100);
            tableHachToan.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableHachToan.getColumnModel().getColumn(1).setMaxWidth(100);
            tableHachToan.getColumnModel().getColumn(4).setMinWidth(120);
            tableHachToan.getColumnModel().getColumn(4).setPreferredWidth(120);
            tableHachToan.getColumnModel().getColumn(4).setMaxWidth(120);
            tableHachToan.getColumnModel().getColumn(5).setMinWidth(100);
            tableHachToan.getColumnModel().getColumn(5).setPreferredWidth(100);
            tableHachToan.getColumnModel().getColumn(5).setMaxWidth(100);
        }

        lblHoachToan.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lblHoachToan.setForeground(new java.awt.Color(51, 51, 255));
        lblHoachToan.setText("Báo cáo doanh thu");

        cbMonth.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cbMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HienThiDLTheoThang(evt);
            }
        });

        cbYear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HienThiDLTheoNam(evt);
            }
        });

        txtSum.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblMonth.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblMonth.setText("Tháng:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Năm:");

        jButton1.setText("Tất cả");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Tổng doanh thu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSum, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(lblMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblHoachToan)
                        .addGap(305, 305, 305))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(lblHoachToan, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMonth)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSum, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Hiển thị danh sách theo tháng ngày năm
    private void HienThiDLTheoThang(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HienThiDLTheoThang
        String month = (String) cbMonth.getSelectedItem();
        String year = (String) cbYear.getSelectedItem();
        System.out.println(cbMonth.getSelectedItem() + " - " + cbMonth.getItemCount());
        System.out.println("Month = " + month + ", Year = " + year);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        if (month.compareTo(" ") == 0) {
            list = TransactionController.getAllTransactionByYear(year);
        } else {
            list = TransactionController.getAllTransactionByMonthYear(year, month);
        }
        model.setRowCount(0);
        for (int i = 0; i < list.size(); i++) {
            String type = "";
            if (list.get(i).getType() == 1) {
                type = "Giao dịch nhà";
            } else if (list.get(i).getType() == 2) {
                type = "Giao dịch đất";
            } else {
                type = "Không xác định";
            }
            model.addRow(new Object[]{i + 1, list.get(i).getId(), list.get(i).getT_id(), type, sdf.format(list.get(i).getT_date()), list.get(i).getMoney()});
            money += list.get(i).getMoney();
            txtSum.setText(String.valueOf(money));
        }
    }//GEN-LAST:event_HienThiDLTheoThang

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        show1();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void HienThiDLTheoNam(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HienThiDLTheoNam
        String month = (String) cbMonth.getSelectedItem();
        String year = (String) cbYear.getSelectedItem();
        System.out.println("Month = " + month + ", Year = " + year);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        if (month.compareTo(" ") == 0) {
            list = TransactionController.getAllTransactionByYear(year);
        } else {
            list = TransactionController.getAllTransactionByMonthYear(year, month);
        }
        model.setRowCount(0);
        for (int i = 0; i < list.size(); i++) {
            String type = "";
            if (list.get(i).getType() == 1) {
                type = "Giao dịch nhà";
            } else if (list.get(i).getType() == 2) {
                type = "Giao dịch đất";
            } else {
                type = "Không xác định";
            }
            model.addRow(new Object[]{i + 1, list.get(i).getId(), list.get(i).getT_id(), type, sdf.format(list.get(i).getT_date()), list.get(i).getMoney()});
            money += list.get(i).getMoney();
            txtSum.setText(String.valueOf(money));
        }
    }//GEN-LAST:event_HienThiDLTheoNam
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TransactionManagementFrame dialog = new TransactionManagementFrame(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbMonth;
    private javax.swing.JComboBox<String> cbYear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHoachToan;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JTable tableHachToan;
    private javax.swing.JTextField txtSum;
    // End of variables declaration//GEN-END:variables
}
