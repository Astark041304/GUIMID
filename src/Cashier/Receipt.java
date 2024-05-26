/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cashier;

import Admin.*;
import Config.dbConnector;
import Passwordsettings.AccountSettings;
import gymreg.LoginDashboard;
import java.awt.print.PrinterException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author John William
 */
public class Receipt extends javax.swing.JFrame {

    /**
     * Creates new form createUserForm
     */
    public Receipt() {
        initComponents();
    }
    
    
    
    
    
    
    
    

     public static String pname;
    
    public boolean duplicateCheck(){
        
        dbConnector dbc = new dbConnector();
         
        
        try{
           String query = "SELECT * FROM tbl_order WHERE order_name = '" + on.getText() + "'";

            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                pname = resultSet.getString("order_name");
   
                if(pname.equals(resultSet)){
                    JOptionPane.showMessageDialog(null, " Order name is already used!");       
                }
                return true;
            }else{
                return false;
                
            }
            
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
        }
        
        
    }
        
    

    
     public boolean updateCheck(){
        
        dbConnector dbc = new dbConnector();
        
        try{
            String query = "SELECT * FROM tbl_order WHERE (order_name = '" +on.getText()+ "')AND order_id!= '"+oid.getText()+"'";
            ResultSet resultSet = dbc.getData(query);
            
            
            if(resultSet.next()){ 
                pname = resultSet.getString("order_name");
   
                if(pname.equals(resultSet)){
                    JOptionPane.showMessageDialog(null, "Product name is already used!");
                   
                    
                }
                return true;
            }else{
                return false;
                
            }
            
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
        }
        
        
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        oid = new javax.swing.JTextField();
        ot = new javax.swing.JComboBox<>();
        on = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        oq = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        rec = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        opa = new javax.swing.JTextField();
        dte = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        op = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Adname1 = new javax.swing.JLabel();
        set = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReceipt = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(184, 167, 95));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(151, 96, 9));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(204, 204, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel1.setText("Order name:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel2.setText("Order  type:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 80, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel3.setText("Order Id:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, 10));

        oid.setEnabled(false);
        jPanel3.add(oid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 200, 30));

        ot.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        ot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Meal", "Drinks", "Desserts" }));
        jPanel3.add(ot, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 200, 30));
        jPanel3.add(on, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 200, 30));

        jSeparator2.setBackground(new java.awt.Color(130, 202, 255));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 255));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 410, 10));
        jPanel3.add(oq, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 200, 30));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel6.setText("Order Price:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jPanel2.setBackground(new java.awt.Color(215, 220, 224));

        add.setBackground(new java.awt.Color(184, 167, 95));
        add.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
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

        delete.setBackground(new java.awt.Color(184, 167, 95));
        delete.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        delete.setText("Clear");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(184, 167, 95));
        cancel.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        cancel.setText("Exit");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        rec.setBackground(new java.awt.Color(184, 167, 95));
        rec.setText("Receipt");
        rec.setPreferredSize(new java.awt.Dimension(71, 23));
        rec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(rec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(delete)
                    .addComponent(cancel)
                    .addComponent(rec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 410, 40));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel9.setText("Order Date:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));
        jPanel3.add(opa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 200, 30));
        jPanel3.add(dte, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 200, 30));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel7.setText("Order quantity:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        jPanel3.add(op, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 200, 30));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel12.setText("Payment Amount:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 410, 340));

        jPanel5.setBackground(new java.awt.Color(184, 167, 95));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-35.png"))); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-home-35.png"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        Adname1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        Adname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Adname1.setText("Receipt Info");

        set.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-settings-35.png"))); // NOI18N
        set.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Adname1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 455, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(set)
                .addGap(19, 19, 19))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Adname1, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(set, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        jPanel4.setBackground(new java.awt.Color(184, 167, 95));

        txtReceipt.setColumns(20);
        txtReceipt.setRows(5);
        jScrollPane1.setViewportView(txtReceipt);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 310, 430));

        jLabel10.setBackground(new java.awt.Color(255, 204, 204));
        jLabel10.setForeground(new java.awt.Color(255, 204, 204));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Borcelle (4).png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 590));

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

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
             
        
        try {
            txtReceipt.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Receipt.class.getName()).log(Level.SEVERE, null, ex);
        }
   

    }//GEN-LAST:event_addActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed
    
    
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        txtReceipt.setText("");
        oid.setText("");
        on.setText("");
        ot.setSelectedItem("");
        oq.setText("");
        op.setText("");        
        opa.setText("");

        dte.setText("");
                            
        
    }//GEN-LAST:event_deleteActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        if (on.getText().isEmpty() || oq.getText().isEmpty() || opa.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "All fields are required!");
} else if (duplicateCheck()) {
    System.out.println("Duplicate Exist!");
} else {
    dbConnector dbc = new dbConnector();
    
    
    double priceAmount = Double.parseDouble(op.getText());
    
    
    double paymentAmount = Double.parseDouble(opa.getText());
    
     double quantityAmount = Double.parseDouble(oq.getText());
     
    double change = quantityAmount * priceAmount - paymentAmount;

    if (dbc.insertData("INSERT INTO tbl_order (order_name, order_type, order_quantity, order_payamount, order_date) VALUES('"
            + on.getText() + "','" + ot.getSelectedItem() + "','" + oq.getText() + "','" + opa.getText() + "','" + dte.getText() + "')")) {

        JOptionPane.showMessageDialog(null, "Inserted Successfully!");
        System.out.println("Balance: " + change); 
        LoginDashboard lgd = new LoginDashboard();
        lgd.setVisible(true);
        this.dispose();

    } else {
        JOptionPane.showMessageDialog(null, "Connection Error!");
    }
}
           
    }//GEN-LAST:event_addMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
       AdminForm adf = new  AdminForm();
       adf.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void setMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setMouseClicked
        AccountSettings as = new  AccountSettings();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_setMouseClicked

    private void recActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recActionPerformed
                double priceAmount = Double.parseDouble(op.getText());
                double paymentAmount = Double.parseDouble(opa.getText());
                double quantityAmount = Double.parseDouble(oq.getText());
              double change;
       

              if (paymentAmount < priceAmount * quantityAmount) {
               JOptionPane.showMessageDialog(null, "Payment amount is not enough!");
                  return;
                  } else {
                 
                 change =  quantityAmount * priceAmount - paymentAmount;
            }

                       change = Math.abs(change);

                     txtReceipt.setText("-----------------------------------------------------------------\n");
                     txtReceipt.setText(txtReceipt.getText() + "                               Order Receipt   \n");
                     txtReceipt.setText(txtReceipt.getText() + "-----------------------------------------------------------------\n"); 
                     txtReceipt.setText(txtReceipt.getText() + "Order Id: " + oid.getText() + "\n\n");
                     txtReceipt.setText(txtReceipt.getText() + "Order Name: " + on.getText() + "\n\n");
                     txtReceipt.setText(txtReceipt.getText() + "Order Type: " + ot.getSelectedItem() + "\n\n");
                     txtReceipt.setText(txtReceipt.getText() + "Order Quantity: " + oq.getText() + "\n\n");
                     txtReceipt.setText(txtReceipt.getText() + "Order price: " + op.getText() + "\n\n");
                     txtReceipt.setText(txtReceipt.getText() + "Order Payment Amount: " + opa.getText() + "\n\n");
                     txtReceipt.setText(txtReceipt.getText() + "Change: " + change + "\n\n");
                     txtReceipt.setText(txtReceipt.getText() + "Order Date: " + dte.getText() + "\n\n");
                   
    }//GEN-LAST:event_recActionPerformed

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
       OrderM od = new OrderM();
       od.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
       CashierM od = new CashierM();
       od.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel23MouseClicked

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
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Adname1;
    public javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JButton delete;
    public javax.swing.JTextField dte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTextField oid;
    public javax.swing.JTextField on;
    public javax.swing.JTextField op;
    public javax.swing.JTextField opa;
    public javax.swing.JTextField oq;
    public javax.swing.JComboBox<String> ot;
    private javax.swing.JButton rec;
    private javax.swing.JLabel set;
    private javax.swing.JTextArea txtReceipt;
    // End of variables declaration//GEN-END:variables
}
