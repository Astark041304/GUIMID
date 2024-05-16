/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Config.Passwordhasher;
import Config.dbConnector;

import static gymreg.RegDashboard.email;
import static gymreg.RegDashboard.usname;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author John William
 */
public class createUserForm extends javax.swing.JFrame {

    /**
     * Creates new form createUserForm
     */
    public createUserForm() {
        initComponents();
    }

    
    
    public boolean duplicateCheck(){
        
        dbConnector dbc = new dbConnector();
        
        try{
            String query = "SELECT * FROM tbl_user  WHERE user_name = '" + usern.getText()+ "' OR user_email = '" +em.getText()+ "'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                email = resultSet.getString("user_email");
   
                if(email.equals(em.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already used!");
                    em.setText("");
                    
                }
                    
                usname = resultSet.getString("user_name");
                if(usname.equals(usern.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already used!");
                    usern.setText("");
                    
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
            String query = "SELECT * FROM tbl_user  WHERE (user_name = '" +usern.getText()+ "' OR user_email = '" +em.getText()+ "')AND user_id!= '"+uid.getText()+"'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){ 
                email = resultSet.getString("user_email");
   
                if(email.equals(em.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already used!");
                    em.setText("");
                    
                }
                    
                usname = resultSet.getString("user_name");
                if(usname.equals(usern.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already used!");
                    usern.setText("");
                    
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
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        usern = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        at = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        us = new javax.swing.JComboBox<>();
        fn = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        uid1 = new javax.swing.JTextField();
        Editbg = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(39, 105, 139));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(94, 160, 194));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jLabel1.setText("First name:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jLabel2.setText("Last name:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jLabel4.setText("Email:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jLabel5.setText("Username:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jLabel6.setText("Password:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jLabel3.setText("User Id:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, 10));

        uid.setEnabled(false);
        jPanel3.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 200, 30));
        jPanel3.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 200, 30));
        jPanel3.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 200, 30));
        jPanel3.add(usern, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 200, 30));
        jPanel3.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 200, 30));

        at.setFont(new java.awt.Font("Yu Gothic Medium", 0, 11)); // NOI18N
        at.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Cashier" }));
        jPanel3.add(at, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 187, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jLabel8.setText("Account Type:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 20));

        jLabel11.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jLabel11.setText("User Status:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        us.setFont(new java.awt.Font("Yu Gothic Medium", 0, 11)); // NOI18N
        us.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        jPanel3.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 187, -1));
        jPanel3.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 200, 30));

        jSeparator2.setBackground(new java.awt.Color(130, 202, 255));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 255));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 410, 10));

        uid1.setEnabled(false);
        jPanel3.add(uid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 200, 30));

        Editbg.setBackground(new java.awt.Color(215, 220, 224));
        Editbg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 208)));

        jLabel7.setBackground(new java.awt.Color(215, 220, 224));
        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel7.setText("Editing");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-edit-40.png"))); // NOI18N

        javax.swing.GroupLayout EditbgLayout = new javax.swing.GroupLayout(Editbg);
        Editbg.setLayout(EditbgLayout);
        EditbgLayout.setHorizontalGroup(
            EditbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditbgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(21, 21, 21))
        );
        EditbgLayout.setVerticalGroup(
            EditbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditbgLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(Editbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 50));

        jPanel2.setBackground(new java.awt.Color(39, 105, 139));

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

        update.setBackground(new java.awt.Color(130, 202, 255));
        update.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        update.setText("Update");
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(130, 202, 255));
        delete.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(add)
                .addGap(28, 28, 28)
                .addComponent(update)
                .addGap(26, 26, 26)
                .addComponent(delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(cancel)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(update)
                    .addComponent(delete)
                    .addComponent(cancel))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 390, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 410, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
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
          if (uid.getText().isEmpty() || fn.getText().isEmpty() || ln.getText().isEmpty() ||
              em.getText().isEmpty() || usern.getText().isEmpty() || pass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required!");   
          } else if (pass.getText().length() < 8) {
        JOptionPane.showMessageDialog(null, "Password should be 8 characters or more");
         pass.setText(""); 
        } else if (updateCheck()) {
       System.out.println("Duplicate Exist");
       } else {
    
      dbConnector dbc = new dbConnector();
       String query = "UPDATE tbl_user SET user_fname = '" + fn.getText() +
                   "', user_lname = '" + ln.getText() +
                   "', user_email = '" + em.getText() +
                   "', user_name = '" + usern.getText() +
                   "', user_pass = '" + pass.getText() +
                   "', acc_type = '" + at.getSelectedItem() +
                   "', acc_status = '" + us.getSelectedItem() +
                   "' WHERE user_id = '" + uid.getText() + "'";

    
    if (dbc.executeUpdate(query) > 0) {
        JOptionPane.showMessageDialog(null, "Users information updated successfully!");
        
        AdminForm adf = new AdminForm();
        adf.setVisible(true);
        this.dispose(); 
    } else {
        JOptionPane.showMessageDialog(null, "Failed to update Customer information. Please try again.");
    }

      
    }//GEN-LAST:event_updateActionPerformed
    }
    
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
         if(fn.getText().isEmpty()|| ln.getText().isEmpty() || em.getText().isEmpty()
                || usern.getText().isEmpty()|| pass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if(pass.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Characters password is 8 above!");
            pass.setText("");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist!");
            
        }else{
            try{
             dbConnector dbc = new dbConnector();
         String passw = Passwordhasher.hashPassword(pass.getText());
         
      if (dbc.insertData("INSERT INTO tbl_user (user_fname, user_lname, user_email, user_name, user_pass, acc_type, acc_status) VALUES('"
     + fn.getText() + "','"+ln.getText()+"','"+ em.getText() + "','" 
     + usern.getText() + "','" + passw + "','" + at.getSelectedItem() + "','"+us.getSelectedItem()+"')")){
          
        
          JOptionPane.showMessageDialog(null, "Inserted Successfully!");
          AdminForm af = new AdminForm();
          af.setVisible(true);
          this.dispose();
          
      }else{
          JOptionPane.showMessageDialog(null, "Connection Error!");
      }
            }catch(NoSuchAlgorithmException ex){
            System.out.println(""+ex);

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
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Editbg;
    public javax.swing.JButton add;
    public javax.swing.JComboBox<String> at;
    private javax.swing.JButton cancel;
    private javax.swing.JButton delete;
    public javax.swing.JTextField em;
    public javax.swing.JTextField fn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTextField ln;
    public javax.swing.JTextField pass;
    public javax.swing.JTextField uid;
    public javax.swing.JTextField uid1;
    public javax.swing.JButton update;
    public javax.swing.JComboBox<String> us;
    public javax.swing.JTextField usern;
    // End of variables declaration//GEN-END:variables
}
