/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cashier;


import Admin.ProductM;
import Config.dbConnector;
import Passwordsettings.AccountSettings;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author John William
 */
public class Createorder extends javax.swing.JFrame {

    /**
     * Creates new form createUserForm
     */
    public Createorder() {
        initComponents();
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
      LocalDate localDate = LocalDate.now();
        System.out.println(dtf.format(localDate));
        dte.setText(""+dtf.format(localDate));
    }
    
    
    private int getProductQuantity(String productName) {
    dbConnector dbc = new dbConnector();
    String query = "SELECT product_quantity FROM tbl_product WHERE product_name = '" + productName + "'";
    ResultSet rs = dbc.executeQuery(query);
    try {
        if (rs.next()) {
            return rs.getInt("product_quantity");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return 0;
}
    
    
    private boolean updateProductQuantity(String productName, int orderedQuantity) {
    dbConnector dbc = new dbConnector();
    String updateQuery = "UPDATE tbl_product SET product_quantity = product_quantity - " + orderedQuantity + " WHERE product_name = '" + productName + "'";
    return dbc.executeUpdate(updateQuery) > 0;
}
    
    
   public boolean isProductAvailable(String productName) {
    dbConnector dbc = new dbConnector();
    String query = "SELECT product_name FROM tbl_product WHERE product_name = ?";
    
    try (Connection conn = dbc.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(query)) {
        
        pstmt.setString(1, productName);
        try (ResultSet resultSet = pstmt.executeQuery()) {
            return resultSet.next();
        }
    } catch (SQLException ex) {
        System.err.println("Error checking product availability: " + ex.getMessage());
        return false;
    }
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
                    JOptionPane.showMessageDialog(null, "Order name is already used!");
                   
                    
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
        oid = new javax.swing.JTextField();
        ot = new javax.swing.JComboBox<>();
        on = new javax.swing.JTextField();
        oq = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        order = new javax.swing.JButton();
        opa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        op = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        dte = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        set = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(39, 105, 139));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(122, 141, 218));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(248, 246, 246), null));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel1.setText("Order name:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel2.setText("Order  type:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 70, -1));

        oid.setEnabled(false);
        jPanel3.add(oid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 200, 30));

        ot.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        ot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Meal", "Drinks", "Desserts" }));
        jPanel3.add(ot, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 200, 30));
        jPanel3.add(on, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 200, 30));
        jPanel3.add(oq, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 200, 30));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel6.setText("Order quantity:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel9.setText("Payment Amount:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        order.setBackground(new java.awt.Color(196, 160, 220));
        order.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        order.setText("Order");
        order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderMouseClicked(evt);
            }
        });
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });
        jPanel3.add(order, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 200, -1));
        jPanel3.add(opa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 200, 30));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel11.setText("Order Price:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));
        jPanel3.add(op, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 200, 30));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel12.setText("Order Date:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));
        jPanel3.add(dte, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 200, 30));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel13.setText("Order Id:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, 10));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 410, 360));

        jPanel4.setBackground(new java.awt.Color(122, 141, 218));

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel4.setText("Order Info");

        set.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-settings-35.png"))); // NOI18N
        set.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-tab-35.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 496, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(set)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(set, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-35.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, -1, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderActionPerformed
    
    
    private void orderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderMouseClicked
     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
     LocalDate localDate = LocalDate.now();
     System.out.println(dtf.format(localDate));

if (on.getText().isEmpty() || oq.getText().isEmpty() || op.getText().isEmpty() || opa.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "All fields are required!");
} else if (!isProductAvailable(on.getText())) {
    JOptionPane.showMessageDialog(null, "This product is not available in the product menu!");
} else {
    dbConnector dbc = new dbConnector();
    
    int orderedQuantity = Integer.parseInt(oq.getText());
    if (orderedQuantity <= 0) {
        JOptionPane.showMessageDialog(null, "Order quantity must be greater than zero!");
    } else {
        String productName = on.getText();
        int productQuantity = getProductQuantity(productName); 
        if (productQuantity <= 0) {
            JOptionPane.showMessageDialog(null, "Sorry, but " + productName + " is out of stock!");
        } else {
            double priceAmount = Double.parseDouble(op.getText());
            double quantityAmount = Double.parseDouble(oq.getText());
            double paymentAmount = Double.parseDouble(opa.getText());

            if (paymentAmount < priceAmount * quantityAmount) {
                JOptionPane.showMessageDialog(null, "Payment amount is not enough!");
                return;
            }

           
           

          if (dbc.insertData("INSERT INTO tbl_order (order_name, order_type, order_quantity, order_price, order_payamount, order_date) VALUES ('"
    + on.getText() + "', '" + ot.getSelectedItem() + "', " + oq.getText() + ", " + op.getText() + ", " + opa.getText() + ", '" + dte.getText() + "')")) {
                 
                if (updateProductQuantity(productName, orderedQuantity)) {
                    JOptionPane.showMessageDialog(null, "Order placed successfully!");
                    OrderM lgd = new OrderM();
                    lgd.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to update product quantity!");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Connection Error!");
            }
        }
    }
}
    }//GEN-LAST:event_orderMouseClicked

    private void setMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setMouseClicked
        AccountSettings as = new  AccountSettings();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_setMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        CashierM cm = new CashierM();
        cm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        ProductM pt = new ProductM();
        pt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(Createorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Createorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Createorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Createorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Createorder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    public javax.swing.JTextField dte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTextField oid;
    public javax.swing.JTextField on;
    public javax.swing.JTextField op;
    public javax.swing.JTextField opa;
    public javax.swing.JTextField oq;
    public javax.swing.JButton order;
    public javax.swing.JComboBox<String> ot;
    private javax.swing.JLabel set;
    // End of variables declaration//GEN-END:variables
}
