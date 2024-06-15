/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Cashier.*;
import Config.dbConnector;
import Passwordsettings.AccountSettings;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author John William
 */
public class Reports extends javax.swing.JFrame {

    /**
     * Creates new form Resibo
     */
    public Reports() {
        initComponents();
displayData();
    }
    
    
      public void displayData(){
           try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT order_id, order_name, order_type, order_quantity, order_price, order_payamount, order_date FROM tbl_order");
            ReportsTable.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        
        }    
    
    }

    private void updateSalesReportUI(int totalProductQuantity, int totalOrderQuantity, double totalSales) {

        tpq.setText("Total Product Quantity: " + totalProductQuantity);
        toq.setText("Total Order Quantity: " + totalOrderQuantity);
        tps.setText("Total Sales: " + totalSales);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tpq = new javax.swing.JTextField();
        toq = new javax.swing.JTextField();
        tps = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReportsTable = new javax.swing.JTable();
        back = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Adname1 = new javax.swing.JLabel();
        set = new javax.swing.JLabel();
        home = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(39, 105, 139));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(122, 141, 218));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Total Product Quantity:");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Total Order Quantity:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Total Price Sales:");

        jButton1.setBackground(new java.awt.Color(196, 160, 220));
        jButton1.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jButton1.setText("Calculate Total");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(196, 160, 220));
        add.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        add.setText("Print");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tps)
                            .addComponent(toq)
                            .addComponent(tpq))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tpq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(toq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(add))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 370, 200));

        ReportsTable.setAutoCreateRowSorter(true);
        ReportsTable.setBackground(new java.awt.Color(51, 51, 51));
        ReportsTable.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(204, 204, 255)));
        ReportsTable.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        ReportsTable.setForeground(new java.awt.Color(255, 255, 255));
        ReportsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ReportsTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 620, 280));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-35.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, -1, 50));

        jPanel5.setBackground(new java.awt.Color(122, 141, 218));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Adname1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        Adname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Adname1.setText("Sales Report");
        jPanel5.add(Adname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, -1, 60));

        set.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-settings-35.png"))); // NOI18N
        set.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setMouseClicked(evt);
            }
        });
        jPanel5.add(set, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, -1, 60));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-home-35.png"))); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jPanel5.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, -1, 60));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setMouseClicked
        AccountSettings as = new AccountSettings();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_setMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        AdminDashboard ad = new AdminDashboard();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        CashierM cm = new CashierM();
        cm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked


    }//GEN-LAST:event_addMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed


    }//GEN-LAST:event_addActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            dbConnector dbc = new dbConnector();

            ResultSet rsProductQty = dbc.getData("SELECT SUM(product_quantity) AS total_product_quantity FROM tbl_product");
            int totalProductQuantity = 0;
            if (rsProductQty.next()) {
                totalProductQuantity = rsProductQty.getInt("total_product_quantity");
            }
            rsProductQty.close();

            ResultSet rsOrderQty = dbc.getData("SELECT SUM(order_quantity) AS total_order_quantity FROM tbl_order");
            int totalOrderQuantity = 0;
            if (rsOrderQty.next()) {
                totalOrderQuantity = rsOrderQty.getInt("total_order_quantity");
            }
            rsOrderQty.close();

            ResultSet rsTotalSales = dbc.getData("SELECT SUM(order_payamount) AS total_sales FROM tbl_order");
            double totalSales = 0.0;
            if (rsTotalSales.next()) {
                totalSales = rsTotalSales.getDouble("total_sales");
            }
            rsTotalSales.close();

            updateSalesReportUI(totalProductQuantity, totalOrderQuantity, totalSales);

        } catch (SQLException ex) {
            System.out.println("Errors: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ReportsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsTableMouseClicked

    }//GEN-LAST:event_ReportsTableMouseClicked

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
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Adname1;
    public javax.swing.JTable ReportsTable;
    public javax.swing.JButton add;
    private javax.swing.JLabel back;
    private javax.swing.JLabel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel set;
    private javax.swing.JTextField toq;
    private javax.swing.JTextField tpq;
    private javax.swing.JTextField tps;
    // End of variables declaration//GEN-END:variables
}
