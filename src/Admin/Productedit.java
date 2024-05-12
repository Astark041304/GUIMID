/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Config.dbConnector;
import gymreg.LoginDashboard;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author John William
 */
public class Productedit extends javax.swing.JFrame {

    /**
     * Creates new form createUserForm
     */
    public Productedit() {
        initComponents();
    }

     public static String pname;
    
    public boolean duplicateCheck(){
        
        dbConnector dbc = new dbConnector();
         
        
        try{
           String query = "SELECT * FROM tbl_product WHERE product_name = '" + pn.getText() + "'";

            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                pname = resultSet.getString("product_name");
   
                if(pname.equals(resultSet)){
                    JOptionPane.showMessageDialog(null, " Product name is already used!");       
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
            String query = "SELECT * FROM tbl_product WHERE (product_name = '" +pn.getText()+ "')AND product_id!= '"+pid.getText()+"'";
            ResultSet resultSet = dbc.getData(query);
            
            
            if(resultSet.next()){ 
                pname = resultSet.getString("product_name");
   
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        pp = new javax.swing.JTextField();
        pt = new javax.swing.JComboBox<>();
        ps = new javax.swing.JComboBox<>();
        pn = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Editbg = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pq = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(31, 27, 27));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(94, 160, 194));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(204, 204, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel1.setText("product name:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel2.setText("product  type:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 80, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel4.setText("product status:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel5.setText("product price:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel3.setText("product Id:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, 10));

        pid.setEnabled(false);
        jPanel3.add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 200, 30));
        jPanel3.add(pp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 200, 30));

        pt.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        pt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Meal", "Drinks", "Desserts" }));
        jPanel3.add(pt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 200, 30));

        ps.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        ps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Not Available" }));
        jPanel3.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 200, 30));
        jPanel3.add(pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 200, 30));

        jSeparator2.setBackground(new java.awt.Color(130, 202, 255));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 255));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 410, 10));

        Editbg.setBackground(new java.awt.Color(215, 220, 224));
        Editbg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 208)));

        jLabel7.setBackground(new java.awt.Color(215, 220, 224));
        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel7.setText("Editing");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-edit-40.png"))); // NOI18N

        javax.swing.GroupLayout EditbgLayout = new javax.swing.GroupLayout(Editbg);
        Editbg.setLayout(EditbgLayout);
        EditbgLayout.setHorizontalGroup(
            EditbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditbgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(21, 21, 21))
        );
        EditbgLayout.setVerticalGroup(
            EditbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditbgLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(Editbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 50));
        jPanel3.add(pq, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 200, 30));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel6.setText("product quantity:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        add.setBackground(new java.awt.Color(130, 202, 255));
        add.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        add.setText("Add");
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
        jPanel3.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        cancel.setBackground(new java.awt.Color(130, 202, 255));
        cancel.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        cancel.setText("Cancel");
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
        jPanel3.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        update.setBackground(new java.awt.Color(130, 202, 255));
        update.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        update.setText("Update");
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel3.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        delete.setBackground(new java.awt.Color(130, 202, 255));
        delete.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 410, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
     
       if (pid.getText().isEmpty() || pn.getText().isEmpty() || pq.getText().isEmpty() || pp.getText().isEmpty()) {
       JOptionPane.showMessageDialog(null, "All fields are required!");   
       } else if (updateCheck()) {
   
        System.out.println("Duplicate exists");
        } else {
    
        dbConnector dbc = new dbConnector();
    
    
         String query = "UPDATE tbl_product SET product_name = '" + pn.getText() +
                   "', product_type = '" + pt.getSelectedItem() +
                   "', product_status = '" + ps.getSelectedItem() +
                   "', product_quantity = '" + pq.getText() +
                   "', product_price = '" + pp.getText() +
                   "' WHERE product_id = '" + pid.getText() + "'"; 
    
   
        if (dbc.executeUpdate(query) > 0) {
        JOptionPane.showMessageDialog(null, "Product updated successfully!");
       
          ProductTab adf = new ProductTab();
          adf.setVisible(true);
          this.dispose(); 
      } else {
        JOptionPane.showMessageDialog(null, "Failed to update product. Please try again.");
        }
     }
    }//GEN-LAST:event_updateActionPerformed
    
    
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
         if(pn.getText().isEmpty()|| pp.getText().isEmpty() || pq.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist!");
            
        }else{
            
             dbConnector dbc = new dbConnector();
       
      if (dbc.insertData("INSERT INTO tbl_product (product_name, product_type, product_status, product_quantity, product_price) VALUES('"
     + pn.getText() + "','"+pt.getSelectedItem()+"','"+ ps.getSelectedItem() + "','" 
     + pp.getText() + "','" + pq.getText()+ "')")){
          
        
          JOptionPane.showMessageDialog(null, "Inserted Successfully!");
          LoginDashboard lgd = new LoginDashboard();
          lgd.setVisible(true);
          this.dispose();
          
      }else{
          JOptionPane.showMessageDialog(null, "Connection Error!");
      }
            
        }                    
           
    }//GEN-LAST:event_addMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
       AdminForm adf = new  AdminForm();
       adf.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

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
            java.util.logging.Logger.getLogger(Productedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productedit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Editbg;
    public javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTextField pid;
    public javax.swing.JTextField pn;
    public javax.swing.JTextField pp;
    public javax.swing.JTextField pq;
    public javax.swing.JComboBox<String> ps;
    public javax.swing.JComboBox<String> pt;
    public javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
