/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Config.dbConnector;
import static gymreg.RegDashboard.email;
import static gymreg.RegDashboard.usname;
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
        Back = new javax.swing.JLabel();
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
        jPanel4 = new javax.swing.JPanel();
        cancel = new javax.swing.JButton();
        update = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        Editbg = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        uid1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(15, 8, 38));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(94, 160, 194));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(204, 204, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel1.setText("First name:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel2.setText("Last name:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 60, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel4.setText("Email:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel5.setText("Username:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel6.setText("Password:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        Back.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        Back.setText("Back");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        jPanel3.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel3.setText("User Id:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, 10));

        uid.setEnabled(false);
        jPanel3.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 200, 30));
        jPanel3.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 200, 30));
        jPanel3.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 200, 30));
        jPanel3.add(usern, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 200, 30));
        jPanel3.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 200, 30));

        at.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        at.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        jPanel3.add(at, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 187, -1));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel8.setText("Account Type:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, 20));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel11.setText("User Status:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        us.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        us.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        jPanel3.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 187, -1));
        jPanel3.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 200, 30));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 204, 255)));

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

        update.setBackground(new java.awt.Color(130, 202, 255));
        update.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        update.setText("Update");
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        refresh.setBackground(new java.awt.Color(130, 202, 255));
        refresh.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        refresh.setText("Refresh");
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
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

        clear.setBackground(new java.awt.Color(130, 202, 255));
        clear.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        clear.setText("Clear");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clear)
                    .addComponent(add))
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update)
                    .addComponent(cancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(refresh, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(update)
                    .addComponent(delete))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(refresh)
                    .addComponent(clear))
                .addContainerGap())
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 330, -1));

        jSeparator2.setBackground(new java.awt.Color(130, 202, 255));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 255));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 410, -1));

        Editbg.setBackground(new java.awt.Color(215, 220, 224));
        Editbg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 110, 208)));

        jLabel7.setBackground(new java.awt.Color(215, 220, 224));
        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel7.setText("Editing");

        javax.swing.GroupLayout EditbgLayout = new javax.swing.GroupLayout(Editbg);
        Editbg.setLayout(EditbgLayout);
        EditbgLayout.setHorizontalGroup(
            EditbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditbgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EditbgLayout.setVerticalGroup(
            EditbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditbgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(Editbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 60));

        uid1.setEnabled(false);
        jPanel3.add(uid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 200, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 410, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
       
    

    }//GEN-LAST:event_refreshActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       if(uid.getText() .isEmpty() ||fn.getText().isEmpty()||ln.getText().isEmpty()||em.getText().isEmpty()||usern.getText().isEmpty()||pass.getText().isEmpty()){
         JOptionPane.showMessageDialog(null, "All fields are required!");   
        }else if(pass.getText().length()<8){
         JOptionPane.showMessageDialog(null, "Password character should be 8 above");
         pass.setText("");
        }else if(updateCheck()){
        System.out.println("Duplicate Exist");
        }else{
            
        
          AdminForm adf = new AdminForm();
          adf.setVisible(true);
          this.dispose();
            
        
        
      dbConnector dbc = new dbConnector();
      dbc.updateData("UPDATE tbl_user SET user_fname ='"+fn.getText()+"', user_lname ='"+ln.getText()+"', user_email ='"+em.getText()+"', user_name ='"+usern.getText()+"', user_pass ='"+pass.getText()+"', acc_type ='"+at.getSelectedItem()+"', acc_status ='"+us.getSelectedItem()+"'"
              + "WHERE user_id ='"+uid.getText()+"'");
    }//GEN-LAST:event_updateActionPerformed
    }
    
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
         if(uid.getText().isEmpty() || fn.getText().isEmpty() || ln.getText().isEmpty() || em.getText().isEmpty() || usern.getText().isEmpty() || pass.getText().isEmpty()){
         JOptionPane.showMessageDialog(null, "All fields are required!");   
        }else if(pass.getText().length()<8){
         JOptionPane.showMessageDialog(null, "Password character should be 8 above");
         pass.setText("");
        }else if(duplicateCheck()){
        System.out.println("Duplicate Exist");
        }else{
        dbConnector dbc = new dbConnector();
        
        if(dbc.insertData("INSERT INTO tbl_user(user_fname, user_lname, user_email, user_name, user_pass, acc_type, acc_status)"
                + "VALUES('"+fn.getText()+"', '"+ln.getText()+"', '"+em.getText()+"', '"+usern.getText()+"', '"+pass.getText()+"', '"+at.getSelectedItem()+"', 'Pending')"))
               {
          JOptionPane.showMessageDialog(null, "Registration Success !"); 
          AdminForm adf = new AdminForm();
          adf.setVisible(true);
          this.dispose();
        }else{
          JOptionPane.showMessageDialog(null, "Connection Error!"); 
           }
      
    }                                        
           
    }//GEN-LAST:event_addMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clearMouseClicked

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
       AdminForm adf = new  AdminForm();
       adf.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        AdminForm af = new AdminForm();
        af.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackMouseClicked

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
    private javax.swing.JLabel Back;
    private javax.swing.JPanel Editbg;
    public javax.swing.JButton add;
    public javax.swing.JComboBox<String> at;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTextField ln;
    public javax.swing.JTextField pass;
    private javax.swing.JButton refresh;
    public javax.swing.JTextField uid;
    public javax.swing.JTextField uid1;
    public javax.swing.JButton update;
    public javax.swing.JComboBox<String> us;
    public javax.swing.JTextField usern;
    // End of variables declaration//GEN-END:variables
}
