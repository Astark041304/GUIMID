/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin;

import Config.dbConnector;
import Passwordsettings.AccountSettings;
import java.awt.Color;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author John William
 */
public class Productreg extends javax.swing.JFrame {

    /** Creates new form RegDashboard */
    public Productreg() {
        initComponents();
    }
    
    Color navcolor = new Color(130,202,255);
    Color hovercolor = new Color(240,240,240);
    
    public static String pname;
    
    public boolean duplicateCheck(){
        
        dbConnector dbc = new dbConnector();
        
        try{
           String query = "SELECT * FROM tbl_product  WHERE product_name = '" + pn.getText() + "'";

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


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        pp = new javax.swing.JTextField();
        pq = new javax.swing.JTextField();
        ps = new javax.swing.JComboBox<>();
        pt = new javax.swing.JComboBox<>();
        pn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Adname1 = new javax.swing.JLabel();
        set = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(31, 27, 27));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(184, 167, 95));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(151, 96, 9));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 255, 255), new java.awt.Color(204, 204, 255)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(130, 202, 255));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 157, -1));
        jPanel10.add(pp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 157, -1));
        jPanel10.add(pq, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 155, -1));

        ps.setFont(new java.awt.Font("Yu Gothic Medium", 0, 11)); // NOI18N
        ps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Not available" }));
        jPanel10.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 155, -1));

        pt.setFont(new java.awt.Font("Yu Gothic Medium", 0, 11)); // NOI18N
        pt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Meal", "Drinks", "Desserts" }));
        jPanel10.add(pt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 155, -1));
        jPanel10.add(pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 155, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jLabel5.setText("Product price:");
        jPanel10.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jLabel7.setText("Product quantity:");
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jLabel4.setText("Product status:");
        jPanel10.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jLabel2.setText("Product type:");
        jPanel10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 80, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jLabel1.setText("Product name:");
        jPanel10.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 90, 20));

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 400, 290));

        jPanel4.setBackground(new java.awt.Color(184, 167, 95));

        Adname1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        Adname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Adname1.setText("Product Information");

        set.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-settings-35.png"))); // NOI18N
        set.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setMouseClicked(evt);
            }
        });

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-home-35.png"))); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-35.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Adname1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 389, Short.MAX_VALUE)
                .addComponent(home)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(set)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Adname1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(set, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        jLabel9.setBackground(new java.awt.Color(255, 204, 204));
        jLabel9.setForeground(new java.awt.Color(255, 204, 204));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Borcelle (4).png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 570));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      if (pn.getText().isEmpty() || pq.getText().isEmpty() || pp.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null, "All fields are required!");
      } else if (duplicateCheck()) {
    
       System.out.println("Duplicate exists");
       } else {
   
       dbConnector dbc = new dbConnector();
    
         String query = "INSERT INTO tbl_product(product_name, product_type, product_status, product_quantity, product_price) " +
         "VALUES('" + pn.getText() + "', '" + pt.getSelectedItem() + "','" + ps.getSelectedItem() + "', " +
         "'" + pq.getText() + "', '" + pp.getText() + "')";
  
         if (dbc.executeUpdate(query) > 0) {
        JOptionPane.showMessageDialog(null, "Product added successfully!");
       
        ProductTab adb = new ProductTab();
        adb.setVisible(true);
        this.dispose(); 
       } else {
        JOptionPane.showMessageDialog(null, "Failed to add product. Please try again.");
         }
      }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void setMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setMouseClicked
        AccountSettings as = new  AccountSettings();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_setMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        AdminDashboard as = new  AdminDashboard();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeMouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        AdminDashboard ad = new AdminDashboard();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

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
            java.util.logging.Logger.getLogger(Productreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productreg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Adname1;
    private javax.swing.JLabel home;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField pn;
    private javax.swing.JTextField pp;
    private javax.swing.JTextField pq;
    private javax.swing.JComboBox<String> ps;
    private javax.swing.JComboBox<String> pt;
    private javax.swing.JLabel set;
    // End of variables declaration//GEN-END:variables

}
