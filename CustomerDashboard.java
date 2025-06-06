
package UI;
import DB.DBConnector;
import OrderingSystem.SessionManager;
import UI.CustomerAdminDashboard;
import UI.Orders;
import UI.Cart;
import UI.UpholsteredFurniture;
import UI.BedsDashboard;
import UI.StorageDashboard;
import UI.TablesChairs;
import UI.OfficeFurniture;
import UI.Kitchen;
import UI.BathroomDashboard;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class CustomerDashboard extends javax.swing.JFrame {
Connection conn;
PreparedStatement pst;
ResultSet rst;
private int customerId;

    /**
     * Creates new form CustomerDashboard
     */
    public CustomerDashboard() {
        initComponents();
         DBConnector mycon = new DBConnector();
        conn = DBConnector.getCon();
        this.customerId = SessionManager.getCustomerID();
        
        
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
        OfficeFurnitureLabel = new javax.swing.JLabel();
        BathroomButton = new javax.swing.JButton();
        KitchenPictureLabel = new javax.swing.JLabel();
        BedsButton = new javax.swing.JButton();
        BedsPicture1 = new javax.swing.JLabel();
        StorageButton = new javax.swing.JButton();
        StorageLabel1 = new javax.swing.JLabel();
        OfficeFurnitureButton = new javax.swing.JButton();
        TablesChairsPictures1 = new javax.swing.JLabel();
        TablesChairsButton = new javax.swing.JButton();
        UpholsteredFuniturePictureLabel2 = new javax.swing.JLabel();
        UpholsteredButton1 = new javax.swing.JButton();
        KitchenPictureLabel1 = new javax.swing.JLabel();
        KitchenButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        HomeButton = new javax.swing.JButton();
        OrdersButton = new javax.swing.JButton();
        HistoryButton = new javax.swing.JButton();
        LogOutButton = new javax.swing.JButton();
        OrderTracking = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OfficeFurnitureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/OfficeFurniture/Desk.jpg"))); // NOI18N
        getContentPane().add(OfficeFurnitureLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 230, 180));

        BathroomButton.setBackground(new java.awt.Color(101, 101, 101));
        BathroomButton.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        BathroomButton.setForeground(new java.awt.Color(255, 255, 255));
        BathroomButton.setText("BATHROOM");
        BathroomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BathroomButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BathroomButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 600, 180, 50));

        KitchenPictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bathroom/Bathtub3.jpg"))); // NOI18N
        getContentPane().add(KitchenPictureLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 410, 230, 180));

        BedsButton.setBackground(new java.awt.Color(101, 101, 101));
        BedsButton.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        BedsButton.setForeground(new java.awt.Color(255, 255, 255));
        BedsButton.setText("BEDS");
        BedsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BedsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BedsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 180, 50));

        BedsPicture1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Beds/Single Bed.jpg"))); // NOI18N
        getContentPane().add(BedsPicture1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 230, 180));

        StorageButton.setBackground(new java.awt.Color(101, 101, 101));
        StorageButton.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        StorageButton.setForeground(new java.awt.Color(255, 255, 255));
        StorageButton.setText("STORAGE");
        StorageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StorageButtonActionPerformed(evt);
            }
        });
        getContentPane().add(StorageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 330, 180, 50));

        StorageLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Storage/Dresser.jpg"))); // NOI18N
        getContentPane().add(StorageLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, 230, 180));

        OfficeFurnitureButton.setBackground(new java.awt.Color(101, 101, 101));
        OfficeFurnitureButton.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        OfficeFurnitureButton.setForeground(new java.awt.Color(255, 255, 255));
        OfficeFurnitureButton.setText("OFFICE FURNITURE");
        OfficeFurnitureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OfficeFurnitureButtonActionPerformed(evt);
            }
        });
        getContentPane().add(OfficeFurnitureButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 600, 200, 50));

        TablesChairsPictures1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TablesChairs/Dining Tables (3).jpg"))); // NOI18N
        getContentPane().add(TablesChairsPictures1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 140, 230, 180));

        TablesChairsButton.setBackground(new java.awt.Color(101, 101, 101));
        TablesChairsButton.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        TablesChairsButton.setForeground(new java.awt.Color(255, 255, 255));
        TablesChairsButton.setText("TABLES AND CHAIRS");
        TablesChairsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablesChairsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(TablesChairsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 330, 210, 50));

        UpholsteredFuniturePictureLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UpholsteredFurniture/ArmChair.jpg"))); // NOI18N
        getContentPane().add(UpholsteredFuniturePictureLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 230, 180));

        UpholsteredButton1.setBackground(new java.awt.Color(101, 101, 101));
        UpholsteredButton1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        UpholsteredButton1.setForeground(new java.awt.Color(255, 255, 255));
        UpholsteredButton1.setText("UPHOLSTERED");
        UpholsteredButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpholsteredButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(UpholsteredButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 180, 50));

        KitchenPictureLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Kitchen/KitchenSets2.jpg"))); // NOI18N
        getContentPane().add(KitchenPictureLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 230, 180));

        KitchenButton1.setBackground(new java.awt.Color(101, 101, 101));
        KitchenButton1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        KitchenButton1.setForeground(new java.awt.Color(255, 255, 255));
        KitchenButton1.setText("KITCHEN");
        KitchenButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KitchenButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(KitchenButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 600, 180, 50));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DYEY EN DI'S FURNITURE HAVEN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FURNITURES CATALOG");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, -1, -1));

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

        HomeButton.setBackground(new java.awt.Color(101, 101, 101));
        HomeButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setText("Home");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        jPanel4.add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 180, 50));

        OrdersButton.setBackground(new java.awt.Color(101, 101, 101));
        OrdersButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        OrdersButton.setForeground(new java.awt.Color(255, 255, 255));
        OrdersButton.setText("Orders");
        OrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdersButtonActionPerformed(evt);
            }
        });
        jPanel4.add(OrdersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 180, 50));

        HistoryButton.setBackground(new java.awt.Color(101, 101, 101));
        HistoryButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        HistoryButton.setForeground(new java.awt.Color(255, 255, 255));
        HistoryButton.setText("Cart");
        HistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryButtonActionPerformed(evt);
            }
        });
        jPanel4.add(HistoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 180, 50));

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

        OrderTracking.setBackground(new java.awt.Color(101, 101, 101));
        OrderTracking.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        OrderTracking.setForeground(new java.awt.Color(255, 255, 255));
        OrderTracking.setText("Order Tracking");
        OrderTracking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderTrackingActionPerformed(evt);
            }
        });
        jPanel4.add(OrderTracking, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 180, 50));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 700));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1180, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OfficeFurnitureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OfficeFurnitureButtonActionPerformed
      OfficeFurniture obj = new OfficeFurniture();
      obj.setVisible(true);
      dispose();
    }//GEN-LAST:event_OfficeFurnitureButtonActionPerformed

    private void UpholsteredButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpholsteredButton1ActionPerformed
      UpholsteredFurniture obj = new UpholsteredFurniture();
      obj.setVisible(true);
      dispose();
    }//GEN-LAST:event_UpholsteredButton1ActionPerformed

    private void BedsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BedsButtonActionPerformed
      BedsDashboard obj = new BedsDashboard();
      obj.setVisible(true);
      dispose();
    }//GEN-LAST:event_BedsButtonActionPerformed

    private void StorageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StorageButtonActionPerformed
      StorageDashboard obj = new StorageDashboard();
      obj.setVisible(true);
      dispose();
    }//GEN-LAST:event_StorageButtonActionPerformed

    private void TablesChairsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablesChairsButtonActionPerformed
      TablesChairs obj = new TablesChairs();
      obj.setVisible(true);
      dispose();
    }//GEN-LAST:event_TablesChairsButtonActionPerformed

    private void KitchenButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KitchenButton1ActionPerformed
      Kitchen obj = new Kitchen();
      obj.setVisible(true);
      dispose();
    }//GEN-LAST:event_KitchenButton1ActionPerformed

    private void BathroomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BathroomButtonActionPerformed
      BathroomDashboard obj = new BathroomDashboard();
      obj.setVisible(true);
      dispose();
    }//GEN-LAST:event_BathroomButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        CustomerDashboard obj = new CustomerDashboard();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void OrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdersButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Note: You can only edit order information if the status is 'Pending'.");
    
        Orders obj = new Orders();
        obj.setVisible(true);
        dispose();
      
    }//GEN-LAST:event_OrdersButtonActionPerformed

    private void HistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryButtonActionPerformed
        Cart obj = new Cart();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_HistoryButtonActionPerformed

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
   LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formattedDateTime = now.format(formatter);

    System.out.println("Customer logged out at: " + formattedDateTime);

    try {
       
        String sql = "UPDATE customerlogin SET LogOut = ? WHERE CustomerID = ? AND LogOut IS NULL ORDER BY LogIn DESC LIMIT 1";
        PreparedStatement pst = conn.prepareStatement(sql);

        pst.setString(1, formattedDateTime);
        pst.setInt(2, SessionManager.getCustomerID());

        int rowsAffected = pst.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Logout time saved successfully!");
        } else {
            System.out.println("No active session found to update logout time.");
        }

        pst.close();

       
        String fetchUsernameSQL = "SELECT Username FROM customer WHERE CustomerID = ?";
        PreparedStatement fetchUsernamePst = conn.prepareStatement(fetchUsernameSQL);
        fetchUsernamePst.setInt(1, SessionManager.getCustomerID());
        ResultSet rsUsername = fetchUsernamePst.executeQuery();

        String username = "";
        if (rsUsername.next()) {
            username = rsUsername.getString("Username");
        }

        rsUsername.close();
        fetchUsernamePst.close();

       
        String sqlAudit = "INSERT INTO audit_logs (UserType, Username, ActionType, TableAffected, RecordID, ActionDetails) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmtAudit = conn.prepareStatement(sqlAudit);
        pstmtAudit.setString(1, "Customer");
        pstmtAudit.setString(2, username);  
        pstmtAudit.setString(3, "Logout");
        pstmtAudit.setString(4, "customer");
        pstmtAudit.setInt(5, SessionManager.getCustomerID());  
        pstmtAudit.setString(6, "Customer logged out successfully");

        pstmtAudit.executeUpdate();
        pstmtAudit.close();

         

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error while saving logout time or audit log.");
    }

  
    CustomerAdminDashboard obj = new CustomerAdminDashboard();
    obj.setVisible(true);
    dispose(); 
    }//GEN-LAST:event_LogOutButtonActionPerformed

    private void OrderTrackingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderTrackingActionPerformed
      OrderTracking obj = new OrderTracking();
      obj.setVisible(true);
      dispose();
    }//GEN-LAST:event_OrderTrackingActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BathroomButton;
    private javax.swing.JButton BedsButton;
    private javax.swing.JLabel BedsPicture1;
    private javax.swing.JButton HistoryButton;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton KitchenButton1;
    private javax.swing.JLabel KitchenPictureLabel;
    private javax.swing.JLabel KitchenPictureLabel1;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JButton OfficeFurnitureButton;
    private javax.swing.JLabel OfficeFurnitureLabel;
    private javax.swing.JButton OrderTracking;
    private javax.swing.JButton OrdersButton;
    private javax.swing.JButton StorageButton;
    private javax.swing.JLabel StorageLabel1;
    private javax.swing.JButton TablesChairsButton;
    private javax.swing.JLabel TablesChairsPictures1;
    private javax.swing.JButton UpholsteredButton1;
    private javax.swing.JLabel UpholsteredFuniturePictureLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
