
package UI;

import DB.DBConnector;
import OrderingSystem.SessionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import UI.OrderManagement;
import UI.ReportsAnalyticsDashboard;
import UI.InventoryManagement;
import UI.OrderTrackingAdmin;
import UI.CustomerAdminDashboard;
import UI.SalesDashboard;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class AdminDashboard extends javax.swing.JFrame {
Connection conn;
PreparedStatement pst;
ResultSet rst;

private String adminUsername;


    
    public AdminDashboard(String adminUsername) {
    initComponents();
    conn = DBConnector.getCon();
    this.adminUsername = adminUsername;
    loadAdminName();
}

    public AdminDashboard() {
        initComponents();
        conn = DBConnector.getCon();
        loadAdminName();
    }
    private void loadAdminName() {
    try {
        pst = conn.prepareStatement("SELECT Name FROM admin WHERE Username = ? OR Email = ?");
        pst.setString(1, adminUsername);
        pst.setString(2, adminUsername);
        rst = pst.executeQuery();

        if (rst.next()) {
           String name = rst.getString("Name");
            AdminNameTextField.setText(name);
            
        } else {
           
            AdminNameTextField.setText("");
            
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Failed to load admin name: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btnInventory = new javax.swing.JButton();
        btnReportsAnalytics = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AdminNameTextField = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        LogOutButton = new javax.swing.JButton();
        btnOrderManagement = new javax.swing.JButton();
        HomeButton2 = new javax.swing.JButton();
        HomeButton4 = new javax.swing.JButton();
        HomeButton3 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInventory.setBackground(new java.awt.Color(101, 101, 101));
        btnInventory.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        btnInventory.setForeground(new java.awt.Color(255, 255, 255));
        btnInventory.setText("Inventory");
        btnInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 180, 50));

        btnReportsAnalytics.setBackground(new java.awt.Color(101, 101, 101));
        btnReportsAnalytics.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        btnReportsAnalytics.setForeground(new java.awt.Color(255, 255, 255));
        btnReportsAnalytics.setText("Report Analytics");
        btnReportsAnalytics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsAnalyticsActionPerformed(evt);
            }
        });
        getContentPane().add(btnReportsAnalytics, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 180, 50));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome, ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 160, 40));

        jLabel1.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DYEY EN DI'S FURNITURE HAVEN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 800, 50));

        AdminNameTextField.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        AdminNameTextField.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(AdminNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 370, 40));

        jPanel4.setBackground(new java.awt.Color(140, 122, 107));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel15.setText("    HAVEN");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 110, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel16.setText("DYEY");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 60, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel17.setText("EN");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 40, 30, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel18.setText("DI'S");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 60, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel19.setText("FURNITURE");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 110, -1));

        LogOutButton.setBackground(new java.awt.Color(180, 100, 100));
        LogOutButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        LogOutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogOutButton.setText("Log Out");
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });
        jPanel4.add(LogOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 180, 50));

        btnOrderManagement.setBackground(new java.awt.Color(101, 101, 101));
        btnOrderManagement.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        btnOrderManagement.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderManagement.setText("Order Management");
        btnOrderManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderManagementActionPerformed(evt);
            }
        });
        jPanel4.add(btnOrderManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 180, 50));

        HomeButton2.setBackground(new java.awt.Color(101, 101, 101));
        HomeButton2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        HomeButton2.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton2.setText("Order Tracking");
        HomeButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(HomeButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 180, 50));

        HomeButton4.setBackground(new java.awt.Color(101, 101, 101));
        HomeButton4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        HomeButton4.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton4.setText("Sales");
        HomeButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(HomeButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 180, 50));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 700));

        HomeButton3.setBackground(new java.awt.Color(101, 101, 101));
        HomeButton3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        HomeButton3.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton3.setText("Order Tracking");
        HomeButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(HomeButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 180, 50));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1180, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderManagementActionPerformed
        OrderManagement obj = new OrderManagement();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnOrderManagementActionPerformed

    private void btnReportsAnalyticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsAnalyticsActionPerformed
        ReportsAnalyticsDashboard obj = new ReportsAnalyticsDashboard();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReportsAnalyticsActionPerformed

    private void btnInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryActionPerformed
        InventoryManagement obj = new InventoryManagement();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInventoryActionPerformed

    private void HomeButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButton2ActionPerformed
       OrderTrackingAdmin obj = new OrderTrackingAdmin();
       obj.setVisible(true);
       dispose();
    }//GEN-LAST:event_HomeButton2ActionPerformed

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
       LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formattedDateTime = now.format(formatter);

    System.out.println("Customer logged out at: " + formattedDateTime);

    try {
        

        String sql = "UPDATE adminlogin SET LogOut = ? WHERE AdminID = ? AND LogOut IS NULL ORDER BY LogIn DESC LIMIT 1";
           try (PreparedStatement Pst = conn.prepareStatement(sql)) {
               Pst.setString(1, formattedDateTime);
               Pst.setInt(2, SessionManager.getAdminID());
               
               int rowsAffected = Pst.executeUpdate();
               if (rowsAffected > 0) {
                   System.out.println("Logout time saved successfully!");
               } else {
                   System.out.println("No active session found to update logout time.");
               }  }

       
        String fetchUsernameSQL = "SELECT Username FROM admin WHERE AdminID = ?";
        String username;
           try (PreparedStatement fetchUsernamePst = conn.prepareStatement(fetchUsernameSQL)) {
               fetchUsernamePst.setInt(1, SessionManager.getAdminID());
            try (ResultSet rsUsername = fetchUsernamePst.executeQuery()) {
                username = "";
                if (rsUsername.next()) {
                    username = rsUsername.getString("Username");
                }
            }
           }

       
        String sqlAudit = "INSERT INTO audit_logs (UserType, Username, ActionType, TableAffected, RecordID, ActionDetails) VALUES (?, ?, ?, ?, ?, ?)";
           try (PreparedStatement pstmtAudit = conn.prepareStatement(sqlAudit)) {
               pstmtAudit.setString(1, "Admin");
               pstmtAudit.setString(2, username);
               pstmtAudit.setString(3, "Logout");
               pstmtAudit.setString(4, "admin");
               pstmtAudit.setInt(5, SessionManager.getAdminID());
               pstmtAudit.setString(6, "Admin logged out successfully");
               
               pstmtAudit.executeUpdate();
           }

        

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error while saving logout time or audit log.");
    }

   
    CustomerAdminDashboard obj = new CustomerAdminDashboard();
    obj.setVisible(true);
    dispose();
    }//GEN-LAST:event_LogOutButtonActionPerformed

    private void HomeButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButton3ActionPerformed
       
    }//GEN-LAST:event_HomeButton3ActionPerformed

    private void HomeButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButton4ActionPerformed
        SalesDashboard obj = new SalesDashboard();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_HomeButton4ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new AdminDashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminNameTextField;
    private javax.swing.JButton HomeButton2;
    private javax.swing.JButton HomeButton3;
    private javax.swing.JButton HomeButton4;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JButton btnInventory;
    private javax.swing.JButton btnOrderManagement;
    private javax.swing.JButton btnReportsAnalytics;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
