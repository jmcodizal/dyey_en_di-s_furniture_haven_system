
package UI;

import UI.CustomerLogin;
import UI.CustomerAdminDashboard;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;
import DB.DBConnector;
import java.time.LocalDateTime;

public class CustomerSignupPanel extends javax.swing.JFrame {
Connection conn;
PreparedStatement pst;
ResultSet rst;



   
    public CustomerSignupPanel() {
        initComponents();
        DBConnector mycon = new DBConnector();
        conn = DBConnector.getCon();
        SaveButton.setEnabled(true);
        

    }
    public void ClearButton() {
        txtName.setText("");
        txtUsername.setText("");
        txtEmail.setText("");
        txtMobileNumber.setText("");
        txtPassword.setText("");
        txtConfirmPassword.setText("");
        ClearButton.setEnabled(true);
         
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsername = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtMobileNumber = new javax.swing.JTextField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        ClearButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        MobileNumberLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        ConfirmPasswordLabel = new javax.swing.JLabel();
        NameLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsername.setBackground(new java.awt.Color(255, 252, 248));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 350, 40));

        txtEmail.setBackground(new java.awt.Color(255, 242, 248));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 350, 40));

        txtMobileNumber.setBackground(new java.awt.Color(255, 242, 248));
        txtMobileNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileNumberActionPerformed(evt);
            }
        });
        getContentPane().add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 350, 40));

        txtConfirmPassword.setBackground(new java.awt.Color(255, 242, 248));
        getContentPane().add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 350, 40));

        txtPassword.setBackground(new java.awt.Color(255, 242, 248));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 350, 40));

        ClearButton.setBackground(new java.awt.Color(101, 101, 101));
        ClearButton.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        ClearButton.setForeground(new java.awt.Color(255, 255, 255));
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, 180, 50));

        ExitButton.setBackground(new java.awt.Color(180, 100, 100));
        ExitButton.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 520, 180, 50));

        SaveButton.setBackground(new java.awt.Color(101, 101, 101));
        SaveButton.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        SaveButton.setForeground(new java.awt.Color(255, 255, 255));
        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 180, 50));

        LoginButton.setBackground(new java.awt.Color(101, 101, 101));
        LoginButton.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, 180, 50));

        jLabel5.setFont(new java.awt.Font("Serif", 3, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("                   DYEY EN DI'S FURNITURE HAVEN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 870, 50));

        jLabel1.setFont(new java.awt.Font("Serif", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Customer Signup");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 210, 40));

        UsernameLabel.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsernameLabel.setText("Username");
        getContentPane().add(UsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 180, 30));

        EmailLabel.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel.setText("Email:");
        getContentPane().add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 180, 30));

        MobileNumberLabel.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        MobileNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        MobileNumberLabel.setText("Mobile Number:");
        getContentPane().add(MobileNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 180, 30));

        PasswordLabel.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("Password:");
        getContentPane().add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 180, 30));

        ConfirmPasswordLabel.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        ConfirmPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmPasswordLabel.setText("Confirm Password:");
        getContentPane().add(ConfirmPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 180, 30));

        NameLabel1.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        NameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel1.setText("Name:");
        getContentPane().add(NameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 180, 30));

        txtName.setBackground(new java.awt.Color(255, 252, 248));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 350, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtMobileNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobileNumberActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
       ClearButton();
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
       CustomerAdminDashboard obj = new CustomerAdminDashboard();
       obj.setVisible(true);
       dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
      String name = txtName.getText();
      String username = txtUsername.getText();
      String email = txtEmail.getText();
      String mobileNumber = txtMobileNumber.getText();
    
      String password = txtPassword.getText();
      String confirmPassword = txtConfirmPassword.getText();
       LocalDateTime now = LocalDateTime.now();
        Timestamp timestamp = Timestamp.valueOf(now);
      
      try{
            pst = conn.prepareCall("{CALL InsertCustomer(?, ?, ?, ?, ?, ?, ?)}");
            pst.setString(1, name);
            pst.setString(2, username);
            pst.setString(3, email);
            pst.setString(4, mobileNumber);
            pst.setString(5, password);
            pst.setString(6, confirmPassword);
            pst.setTimestamp(7, timestamp);

      
        int rowsInserted = pst.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Registration failed. Try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace(); 
    }

    }//GEN-LAST:event_SaveButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        CustomerLogin obj = new CustomerLogin();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerSignupPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerSignupPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerSignupPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerSignupPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerSignupPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton;
    private javax.swing.JLabel ConfirmPasswordLabel;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel MobileNumberLabel;
    private javax.swing.JLabel NameLabel1;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
