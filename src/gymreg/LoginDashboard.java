/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymreg;

import Admin.AdminDashboard;
import Config.Passwordhasher;
import Config.Session;
import Config.dbConnector;
import User.UserDashboard;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author John William
 */
public class LoginDashboard extends javax.swing.JFrame {

    /**
     * Creates new form LoginDashboard
     */
    public LoginDashboard() {
        initComponents();
    }
    
    static String status;
    static String type;
    static String fname;
    static String lname;
    static String name;
     
    public static boolean loginAcc(String username, String password){
        dbConnector connector = new dbConnector();
        
        try{
            
           String query = "SELECT * FROM tbl_user WHERE user_name = '" + username + "' AND user_pass = '" + password + "'";
            ResultSet resultSet = connector.getData(query);
           if(resultSet.next()){
               
               String hashedPass = resultSet.getString("user_pass");
               String rehashedPass = Passwordhasher.hashPassword("password");
               
               System.out.println(""+hashedPass);
               System.out.println(""+rehashedPass);
               
                if(hashedPass.equals(rehashedPass)){    
               status = resultSet.getString("acc_status");
               type = resultSet.getString("acc_type");
               fname = resultSet.getString("user_fname");
               lname = resultSet.getString("user_lname");
               name = resultSet.getString("user_name");
               
                Session sess = Session.getInstance();
                sess.setUid(resultSet.getInt("user_id"));
                sess.setFname(resultSet.getString("user_fname"));
                sess.setLname(resultSet.getString("user_lname"));
                sess.setEmail(resultSet.getString("user_email"));
                sess.setUsername(resultSet.getString("user_name"));
                sess.setType(resultSet.getString("acc_type"));
                sess.setStatus(resultSet.getString("acc_status"));
                 return true;
                 
                
                
                }else{
                    return false;
                }
           }else{
               return false;
           }
            
        }catch (SQLException | NoSuchAlgorithmException ex) {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel1.setText("Username:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 171, -1));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 171, -1));

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setText("Login Form");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(540, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 70));

        Login.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 140, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed

            if(loginAcc(user.getText(), pass.getText())){
                if(!status.equals("Active")){
                    JOptionPane.showMessageDialog(null, "Account is In-Active, Contact the Admin!");
                }else{
                    JOptionPane.showMessageDialog(null, "Login Successfully!");
                    if(type.equals("Admin")){
                        AdminDashboard ads = new AdminDashboard();
                        ads.Adname.setText(""+name);
                        ads.setVisible(true);
                        this.dispose();
                    }else if(type.equals("User")){
                        UserDashboard usd = new UserDashboard();
                        usd.Usname.setText(""+name);
                        usd.setVisible(true);
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "No account type found, Contact the Admin!");
                        
                    }
                    
                }
            }else{
                JOptionPane.showMessageDialog(null, "Invalid Account!");
            }
       
        
    }//GEN-LAST:event_LoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     JOptionPane.showMessageDialog(null,"Exit Success!");
     setVisible(false);
     this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(LoginDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
