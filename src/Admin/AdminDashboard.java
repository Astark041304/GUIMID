/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Config.Session;
import gymreg.LoginDashboard;
import javax.swing.JOptionPane;

/**
 *
 * @author John William
 */
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboard() {
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Adname = new javax.swing.JLabel();
        Lname = new javax.swing.JLabel();
        uid = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        Em = new javax.swing.JLabel();
        Id = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(15, 8, 38));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(215, 220, 224));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-user-65.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        Adname.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        Adname.setText("Admin");
        jPanel2.add(Adname, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 17, 65, -1));

        Lname.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        Lname.setText("Admin");
        jPanel2.add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 53, 65, -1));

        uid.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        uid.setText("Id");
        jPanel2.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 40, -1));

        jSeparator1.setBackground(new java.awt.Color(130, 202, 255));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 180, -1));

        jButton3.setBackground(new java.awt.Color(130, 202, 255));
        jButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jButton3.setText("Logout");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(130, 202, 255));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 180, -1));

        Em.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        Em.setText("Email");
        jPanel2.add(Em, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, -1));

        Id.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        Id.setText("Uid:");
        jPanel2.add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 40, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 580));

        jPanel3.setBackground(new java.awt.Color(215, 220, 224));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jLabel3.setText("Tab");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(204, 204, 255)));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 87, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-users-75.png"))); // NOI18N
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 70));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setText("Users");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setText("Users");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 50, -1));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 130, 110));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(204, 204, 255)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 87, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-products-75.png"))); // NOI18N
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setText("Product");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 70, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 133, 111));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 430, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       Session sess = Session.getInstance();
       
           if(sess.getUid() == 0){
           JOptionPane.showMessageDialog(null,"No Account Login First!");
           LoginDashboard ld = new LoginDashboard();
           ld.setVisible(true);
           this.dispose();
           
       }else{
           Adname.setText(""+sess.getFname());
           Lname.setText(""+sess.getLname());
           uid.setText(""+sess.getUid());
           Em.setText(""+sess.getEmail());
           }
           
      
    }//GEN-LAST:event_formWindowActivated

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        AdminForm ufs = new AdminForm();
         ufs.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        JOptionPane.showMessageDialog(null,"Logout Success!");
        setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Adname;
    public javax.swing.JLabel Em;
    public javax.swing.JLabel Id;
    public javax.swing.JLabel Lname;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel uid;
    // End of variables declaration//GEN-END:variables
}
