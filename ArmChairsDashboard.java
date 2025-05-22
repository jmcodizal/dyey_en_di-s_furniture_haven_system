
package UI;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DB.DBConnector;
import OrderingSystem.SessionManager;
import UI.UpholsteredFurniture;
import java.sql.Statement;
import javax.swing.JTextField;



public class ArmChairsDashboard extends javax.swing.JFrame {
Connection conn;
PreparedStatement pst;

   
    
    public ArmChairsDashboard() {
        initComponents();
        conn = DBConnector.getCon();
         loadAllProductStocks();
    }
    
    private void loadStockIntoField(String productName, JTextField stockField) {
    try {
        pst = conn.prepareStatement("SELECT Stock FROM products WHERE ProductName = ?");
        pst.setString(1, productName);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            int stock = rs.getInt("Stock");
            stockField.setText(String.valueOf(stock)); 
        } else {
            stockField.setText("N/A");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Failed to load stock: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
}
    private void loadAllProductStocks() {
    loadStockIntoField("Blue Squared Soft Arm Chairs", BSSS);     
    loadStockIntoField("Black Squared Arm Chairs", BSAS);
    loadStockIntoField("Brown Round Arm Chairs", BRAS);
    loadStockIntoField("Black Modern Soft Arm Chairs", BMSS);
}



   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BRAAC = new javax.swing.JButton();
        BRAPC = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        BSAPC = new javax.swing.JButton();
        BSAC = new javax.swing.JButton();
        BRAQ = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        BSAQ = new javax.swing.JTextField();
        BRAS = new javax.swing.JTextField();
        BSAS = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        BMSPC = new javax.swing.JButton();
        BSSPC = new javax.swing.JButton();
        BMSAC = new javax.swing.JButton();
        BSSAC = new javax.swing.JButton();
        BMSQ = new javax.swing.JTextField();
        BSSQ = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        BSSS = new javax.swing.JTextField();
        BMSS = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UpholsteredFurniture/ArmChair.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 230, 180));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UpholsteredFurniture/476373148_3996401190630850_8166946879319678696_n.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 230, 180));

        BRAAC.setBackground(new java.awt.Color(101, 101, 101));
        BRAAC.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        BRAAC.setForeground(new java.awt.Color(255, 255, 255));
        BRAAC.setText("Add to Cart");
        BRAAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRAACActionPerformed(evt);
            }
        });
        jPanel2.add(BRAAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 180, 50));

        BRAPC.setBackground(new java.awt.Color(101, 101, 101));
        BRAPC.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        BRAPC.setForeground(new java.awt.Color(255, 255, 255));
        BRAPC.setText("Proceed to Checkout");
        BRAPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRAPCActionPerformed(evt);
            }
        });
        jPanel2.add(BRAPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 180, 50));

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(230, 222, 210));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(60, 60, 60));
        jTextArea3.setRows(5);
        jTextArea3.setText("Black Squared Arm Chairs\nA wooden-framed armchair.\nPrice: P750.00\nMaterial: Wood\nColor: Black");
        jScrollPane3.setViewportView(jTextArea3);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 80, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Arm Chairs");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(230, 222, 210));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(60, 60, 60));
        jTextArea4.setRows(5);
        jTextArea4.setText("Brown Round Arm Chairs\nA lightweight armchair.\nPrice: P650.00\nMaterial: Metal\nColor: Brown");
        jScrollPane4.setViewportView(jTextArea4);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

        BSAPC.setBackground(new java.awt.Color(101, 101, 101));
        BSAPC.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        BSAPC.setForeground(new java.awt.Color(255, 255, 255));
        BSAPC.setText("Proceed to Checkout");
        BSAPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSAPCActionPerformed(evt);
            }
        });
        jPanel2.add(BSAPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 180, 50));

        BSAC.setBackground(new java.awt.Color(101, 101, 101));
        BSAC.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        BSAC.setForeground(new java.awt.Color(255, 255, 255));
        BSAC.setText("Add to Cart");
        BSAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSACActionPerformed(evt);
            }
        });
        jPanel2.add(BSAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 180, 50));

        BRAQ.setBackground(new java.awt.Color(230, 222, 210));
        BRAQ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BRAQ.setForeground(new java.awt.Color(60, 60, 60));
        jPanel2.add(BRAQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 50, 50));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Quantity");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 80, -1));

        BSAQ.setBackground(new java.awt.Color(230, 222, 210));
        BSAQ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BSAQ.setForeground(new java.awt.Color(60, 60, 60));
        BSAQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSAQActionPerformed(evt);
            }
        });
        jPanel2.add(BSAQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 50, 50));

        BRAS.setEditable(false);
        BRAS.setBackground(new java.awt.Color(230, 222, 210));
        BRAS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BRAS.setForeground(new java.awt.Color(60, 60, 60));
        BRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRASActionPerformed(evt);
            }
        });
        jPanel2.add(BRAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 50, 50));

        BSAS.setEditable(false);
        BSAS.setBackground(new java.awt.Color(230, 222, 210));
        BSAS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BSAS.setForeground(new java.awt.Color(60, 60, 60));
        BSAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSASActionPerformed(evt);
            }
        });
        jPanel2.add(BSAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 50, 50));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bf1.png"))); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 600));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 580, 600));

        jPanel5.setBackground(new java.awt.Color(255, 153, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Soft Arm Chairs");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UpholsteredFurniture/476346384_644897368221023_429551653452613906_n.jpg"))); // NOI18N
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 230, 180));
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(230, 222, 210));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(60, 60, 60));
        jTextArea2.setRows(5);
        jTextArea2.setText("Black Modern Soft Arm Chair\nA sleek, minimalist armchair.\nPrice: P950.00\nMaterial: Wood and Foam\nColor: Black");
        jScrollPane2.setViewportView(jTextArea2);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));

        jTextArea5.setEditable(false);
        jTextArea5.setBackground(new java.awt.Color(230, 222, 210));
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jTextArea5.setForeground(new java.awt.Color(60, 60, 60));
        jTextArea5.setRows(5);
        jTextArea5.setText("Blue Squared Soft Arm Chairs\nA cozy, upholstered armchair.\nPrice: P850.00\nMaterial: Wood\nColor: Blue");
        jScrollPane5.setViewportView(jTextArea5);

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        BMSPC.setBackground(new java.awt.Color(101, 101, 101));
        BMSPC.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        BMSPC.setForeground(new java.awt.Color(255, 255, 255));
        BMSPC.setText("Proceed to Checkout");
        BMSPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMSPCActionPerformed(evt);
            }
        });
        jPanel5.add(BMSPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 180, 50));

        BSSPC.setBackground(new java.awt.Color(101, 101, 101));
        BSSPC.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        BSSPC.setForeground(new java.awt.Color(255, 255, 255));
        BSSPC.setText("Proceed to Checkout");
        BSSPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSSPCActionPerformed(evt);
            }
        });
        jPanel5.add(BSSPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 180, 50));

        BMSAC.setBackground(new java.awt.Color(101, 101, 101));
        BMSAC.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        BMSAC.setForeground(new java.awt.Color(255, 255, 255));
        BMSAC.setText("Add to Cart");
        BMSAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMSACActionPerformed(evt);
            }
        });
        jPanel5.add(BMSAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 180, 50));

        BSSAC.setBackground(new java.awt.Color(101, 101, 101));
        BSSAC.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        BSSAC.setForeground(new java.awt.Color(255, 255, 255));
        BSSAC.setText("Add to Cart");
        BSSAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSSACActionPerformed(evt);
            }
        });
        jPanel5.add(BSSAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 180, 50));

        BMSQ.setBackground(new java.awt.Color(230, 222, 210));
        BMSQ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BMSQ.setForeground(new java.awt.Color(60, 60, 60));
        jPanel5.add(BMSQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 50, 50));

        BSSQ.setBackground(new java.awt.Color(230, 222, 210));
        BSSQ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BSSQ.setForeground(new java.awt.Color(60, 60, 60));
        jPanel5.add(BSSQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 50, 50));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantity");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 80, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Quantity");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 80, -1));

        btnExit.setBackground(new java.awt.Color(180, 100, 100));
        btnExit.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel5.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, -1, 50));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UpholsteredFurniture/2.jpg"))); // NOI18N
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 230, 180));

        BSSS.setEditable(false);
        BSSS.setBackground(new java.awt.Color(230, 222, 210));
        BSSS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BSSS.setForeground(new java.awt.Color(60, 60, 60));
        BSSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSSSActionPerformed(evt);
            }
        });
        jPanel5.add(BSSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 50, 50));

        BMSS.setEditable(false);
        BMSS.setBackground(new java.awt.Color(230, 222, 210));
        BMSS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BMSS.setForeground(new java.awt.Color(60, 60, 60));
        BMSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMSSActionPerformed(evt);
            }
        });
        jPanel5.add(BMSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 50, 50));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bf1.png"))); // NOI18N
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 600));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 580, 600));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg.jpg"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BRAACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRAACActionPerformed
        String ProductName = "Brown Round Arm Chairs";
        int price = 650;
        int Quantity;

      
    try {
        Quantity = Integer.parseInt(BRAQ.getText());
        
        int currentStock = 0;
        pst = conn.prepareStatement("SELECT Stock FROM products WHERE ProductName = ?");
        pst.setString(1, ProductName);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            currentStock = rs.getInt("Stock");
        }

        if (Quantity > currentStock) {
            JOptionPane.showMessageDialog(this, "Not enough stock available. Only " + currentStock + " left.", "Stock Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double TotalPrice = Quantity * price;
        int customerID = SessionManager.getCustomerID();

        
        pst = conn.prepareStatement("INSERT INTO addtocart (CustomerID, ProductName, Price, Quantity, TotalPrice) VALUES (?, ?, ?, ?, ?)");
        pst.setInt(1, customerID);
        pst.setString(2, ProductName);
        pst.setDouble(3, price);
        pst.setInt(4, Quantity);
        pst.setDouble(5, TotalPrice);
        int rowsInserted = pst.executeUpdate();

        
        int newStock = currentStock - Quantity;
        pst = conn.prepareStatement("UPDATE products SET Stock = ? WHERE ProductName = ?");
        pst.setInt(1, newStock);
        pst.setString(2, ProductName);
        pst.executeUpdate();

        
        BRAS.setText(String.valueOf(newStock));
        BRAQ.setText("");

        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Added to Cart!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a number.", "Input Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_BRAACActionPerformed

    private void BRAPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRAPCActionPerformed
        String ProductName = "Brown Round Arm Chairs";
int price = 650;
int Quantity;
String Status = "Pending";

try {
    Quantity = Integer.parseInt(BRAQ.getText());
    double TotalPrice = Quantity * price;

    
     int currentStock = 0;
    int productID = -1;

    
    pst = conn.prepareStatement("SELECT ProductID, Stock FROM products WHERE ProductName = ?");
    pst.setString(1, ProductName);
    ResultSet rs = pst.executeQuery();
    if (rs.next()) {
        productID = rs.getInt("ProductID");
        currentStock = rs.getInt("Stock");
    } else {
        JOptionPane.showMessageDialog(this, "Product not found in the database.");
        return;
    }

    if (Quantity > currentStock) {
        JOptionPane.showMessageDialog(this, "Not enough stock available. Only " + currentStock + " left.", "Stock Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String receiptMessage = "Product: " + ProductName +
                            "\nQuantity: " + Quantity +
                            "\nTotal Price: P" + TotalPrice +
                            "\n\nDo you confirm this order?";
    int confirm = JOptionPane.showConfirmDialog(this, receiptMessage, "Confirm Order", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(this, "Order Canceled.", "Canceled", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String deliveryAddress = JOptionPane.showInputDialog(this, "Enter Delivery Address:");
    if (deliveryAddress == null || deliveryAddress.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Delivery address is required.", "Missing Address", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String[] paymentOptions = { "Cash on Delivery", "Gcash" };
    String paymentMethod = (String) JOptionPane.showInputDialog(this, "Select Payment Method:", "Payment Method", JOptionPane.QUESTION_MESSAGE, null, paymentOptions, paymentOptions[0]);
    if (paymentMethod == null) return;

    double finalTotal = TotalPrice;
    double shippingFee = 0, change = 0, amountGiven = 0;
    String gcashName = "", gcashNumber = "";
    String paymentStatus = "Unpaid";

   if (paymentMethod.equals("Gcash")) {
    String[] gcashOptions = { "Pay Now", "Pay Later" };
    int gcashChoice = JOptionPane.showOptionDialog(this, "Choose GCash payment option:", "GCash Payment",
        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, gcashOptions, gcashOptions[0]);

        switch (gcashChoice) {
            case 0:
                gcashName = JOptionPane.showInputDialog(this, "Enter Gcash Name:");
                gcashNumber = JOptionPane.showInputDialog(this, "Enter Gcash Number:");
                if (gcashNumber == null || gcashNumber.length() != 11 || !gcashNumber.matches("\\d{11}")) {
                    JOptionPane.showMessageDialog(this, "Invalid GCash number. Please enter an 11-digit number.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    return;
                }       String amountStr = JOptionPane.showInputDialog(this, "Enter Amount to Pay:");
                if (gcashName == null || amountStr == null) return;
                amountGiven = Double.parseDouble(amountStr);
                if (amountGiven < TotalPrice) {
                    JOptionPane.showMessageDialog(this, "Amount is less than total price!", "Payment Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }       change = amountGiven - TotalPrice;
                JOptionPane.showMessageDialog(this,
                        "Please send P" + String.format("%.2f", amountGiven) +
                                " to the Admin's GCash Number: 09358968415\n" +
                                        "Then wait for admin verification.",
                        "Send Payment via GCash", JOptionPane.INFORMATION_MESSAGE);
                paymentStatus = "Unpaid";
                break;
            case 1:
                paymentStatus = "Unpaid";
                break;
            default:
                return;
        }
} else {
    shippingFee = 50;
    finalTotal += shippingFee;
    paymentStatus = "Unpaid";
}


    int customerID = SessionManager.getCustomerID();
    java.time.LocalDate today = java.time.LocalDate.now();
    java.sql.Date orderDateSQL = java.sql.Date.valueOf(today);

    
    int orderId = -1;
    pst = conn.prepareStatement(
        "INSERT INTO orders (CustomerID, ProductID, ProductName, Quantity, TotalPrice, PaymentMethod, DeliveryAddress, Status, OrderDate, IsPaid) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
        Statement.RETURN_GENERATED_KEYS
    );
    pst.setInt(1, customerID);
    pst.setInt(2, productID);  
    pst.setString(3, ProductName);
    pst.setInt(4, Quantity);
    pst.setDouble(5, finalTotal);
    pst.setString(6, paymentMethod);
    pst.setString(7, deliveryAddress);
    pst.setString(8, Status);
    pst.setDate(9, orderDateSQL);
    pst.setString(10, paymentStatus);
    pst.executeUpdate();

    ResultSet generatedKeys = pst.getGeneratedKeys();
    if (generatedKeys.next()) {
        orderId = generatedKeys.getInt(1);
    }

    
    if (paymentMethod.equals("Gcash") && paymentStatus.equals("Paid")) {
        pst = conn.prepareStatement("INSERT INTO gcash (OrderID, GCashName, GCashNumber, GCashAmount) VALUES (?, ?, ?, ?)");
        pst.setInt(1, orderId);
        pst.setString(2, gcashName);
        pst.setString(3, gcashNumber);
        pst.setDouble(4, amountGiven);
        pst.executeUpdate();
    }

   
    int newStock = currentStock - Quantity;
    pst = conn.prepareStatement("UPDATE products SET Stock = ? WHERE ProductID = ?");
    pst.setInt(1, newStock);
    pst.setInt(2, productID);  
    pst.executeUpdate();

    BRAQ.setText("");
    BRAS.setText(String.valueOf(newStock));

    java.time.LocalDate deliveryDate = today.plusDays(3);
    java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("MMMM dd, yyyy");
    String orderDateStr = today.format(formatter);
    String deliveryDateStr = deliveryDate.format(formatter);

    String receipt = "Product Name: " + ProductName +
                     "\nQuantity: " + Quantity +
                     "\nPayment Method: " + paymentMethod +
                     "\nTotal Product Price: P" + String.format("%.2f", TotalPrice);

    if (paymentMethod.equals("Gcash")) {
        if (paymentStatus.equals("Paid")) {
            receipt += "\nGcash Name: " + gcashName +
                       "\nGcash Number: " + gcashNumber +
                       "\nAmount Given: P" + amountGiven +
                       "\nChange: P" + change;
        } else {
            receipt += "\nPayment to be made via GCash upon confirmation.";
        }
    } else {
        receipt += "\nShipping Fee: P" + shippingFee;
    }

    receipt += "\nTotal: P" + finalTotal +
               "\nDelivery Address: " + deliveryAddress +
               "\nOrder Date: " + orderDateStr +
               "\nExpected Delivery Date: " + deliveryDateStr +
               "\nPayment Status: " + paymentStatus +
               "\n\nExpected delivery in 3 days.";

    JOptionPane.showMessageDialog(this, receipt, "Order Successful", JOptionPane.INFORMATION_MESSAGE);
    loadAllProductStocks();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Please enter a valid quantity.", "Input Error", JOptionPane.ERROR_MESSAGE);
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_BRAPCActionPerformed

    private void BMSPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMSPCActionPerformed
         String ProductName = "Black Modern Soft Arm Chairs";
        int price = 950;
        int Quantity;
        String Status = "Pending";
        
        try {
        Quantity = Integer.parseInt(BMSQ.getText());
        double TotalPrice = Quantity * price;

        
     int currentStock = 0;
    int productID = -1;

    
    pst = conn.prepareStatement("SELECT ProductID, Stock FROM products WHERE ProductName = ?");
    pst.setString(1, ProductName);
    ResultSet rs = pst.executeQuery();
    if (rs.next()) {
        productID = rs.getInt("ProductID");
        currentStock = rs.getInt("Stock");
    } else {
        JOptionPane.showMessageDialog(this, "Product not found in the database.");
        return;
    }

    if (Quantity > currentStock) {
        JOptionPane.showMessageDialog(this, "Not enough stock available. Only " + currentStock + " left.", "Stock Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String receiptMessage = "Product: " + ProductName +
                            "\nQuantity: " + Quantity +
                            "\nTotal Price: P" + TotalPrice +
                            "\n\nDo you confirm this order?";
    int confirm = JOptionPane.showConfirmDialog(this, receiptMessage, "Confirm Order", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(this, "Order Canceled.", "Canceled", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String deliveryAddress = JOptionPane.showInputDialog(this, "Enter Delivery Address:");
    if (deliveryAddress == null || deliveryAddress.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Delivery address is required.", "Missing Address", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String[] paymentOptions = { "Cash on Delivery", "Gcash" };
    String paymentMethod = (String) JOptionPane.showInputDialog(this, "Select Payment Method:", "Payment Method", JOptionPane.QUESTION_MESSAGE, null, paymentOptions, paymentOptions[0]);
    if (paymentMethod == null) return;

    double finalTotal = TotalPrice;
    double shippingFee = 0, change = 0, amountGiven = 0;
    String gcashName = "", gcashNumber = "";
    String paymentStatus = "Unpaid";

   if (paymentMethod.equals("Gcash")) {
    String[] gcashOptions = { "Pay Now", "Pay Later" };
    int gcashChoice = JOptionPane.showOptionDialog(this, "Choose GCash payment option:", "GCash Payment",
        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, gcashOptions, gcashOptions[0]);

            switch (gcashChoice) {
                case 0:
                    gcashName = JOptionPane.showInputDialog(this, "Enter Gcash Name:");
                    gcashNumber = JOptionPane.showInputDialog(this, "Enter Gcash Number:");
                    if (gcashNumber == null || gcashNumber.length() != 11 || !gcashNumber.matches("\\d{11}")) {
                        JOptionPane.showMessageDialog(this, "Invalid GCash number. Please enter an 11-digit number.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                        return;
                    }           String amountStr = JOptionPane.showInputDialog(this, "Enter Amount to Pay:");
                    if (gcashName == null || amountStr == null) return;
                    amountGiven = Double.parseDouble(amountStr);
                    if (amountGiven < TotalPrice) {
                        JOptionPane.showMessageDialog(this, "Amount is less than total price!", "Payment Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }           change = amountGiven - TotalPrice;
                    JOptionPane.showMessageDialog(this,
                            "Please send P" + String.format("%.2f", amountGiven) +
                                    " to the Admin's GCash Number: 09358968415\n" +
                                            "Then wait for admin verification.",
                            "Send Payment via GCash", JOptionPane.INFORMATION_MESSAGE);
                    paymentStatus = "Unpaid";
                    break;
                case 1:
                    paymentStatus = "Unpaid";
                    break;
                default:
                    return;
            }
} else {
    shippingFee = 50;
    finalTotal += shippingFee;
    paymentStatus = "Unpaid";
}


    int customerID = SessionManager.getCustomerID();
    java.time.LocalDate today = java.time.LocalDate.now();
    java.sql.Date orderDateSQL = java.sql.Date.valueOf(today);

    
    int orderId = -1;
    pst = conn.prepareStatement(
        "INSERT INTO orders (CustomerID, ProductID, ProductName, Quantity, TotalPrice, PaymentMethod, DeliveryAddress, Status, OrderDate, IsPaid) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
        Statement.RETURN_GENERATED_KEYS
    );
    pst.setInt(1, customerID);
    pst.setInt(2, productID);  
    pst.setString(3, ProductName);
    pst.setInt(4, Quantity);
    pst.setDouble(5, finalTotal);
    pst.setString(6, paymentMethod);
    pst.setString(7, deliveryAddress);
    pst.setString(8, Status);
    pst.setDate(9, orderDateSQL);
    pst.setString(10, paymentStatus);
    pst.executeUpdate();

    ResultSet generatedKeys = pst.getGeneratedKeys();
    if (generatedKeys.next()) {
        orderId = generatedKeys.getInt(1);
    }

    
    if (paymentMethod.equals("Gcash") && paymentStatus.equals("Paid")) {
        pst = conn.prepareStatement("INSERT INTO gcash (OrderID, GCashName, GCashNumber, GCashAmount) VALUES (?, ?, ?, ?)");
        pst.setInt(1, orderId);
        pst.setString(2, gcashName);
        pst.setString(3, gcashNumber);
        pst.setDouble(4, amountGiven);
        pst.executeUpdate();
    }

   
    int newStock = currentStock - Quantity;
    pst = conn.prepareStatement("UPDATE products SET Stock = ? WHERE ProductID = ?");
    pst.setInt(1, newStock);
    pst.setInt(2, productID);  
    pst.executeUpdate();

    BMSQ.setText("");
    BMSS.setText(String.valueOf(newStock));

    java.time.LocalDate deliveryDate = today.plusDays(3);
    java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("MMMM dd, yyyy");
    String orderDateStr = today.format(formatter);
    String deliveryDateStr = deliveryDate.format(formatter);

    String receipt = "Product Name: " + ProductName +
                     "\nQuantity: " + Quantity +
                     "\nPayment Method: " + paymentMethod +
                     "\nTotal Product Price: P" + String.format("%.2f", TotalPrice);

    if (paymentMethod.equals("Gcash")) {
        if (paymentStatus.equals("Paid")) {
            receipt += "\nGcash Name: " + gcashName +
                       "\nGcash Number: " + gcashNumber +
                       "\nAmount Given: P" + amountGiven +
                       "\nChange: P" + change;
        } else {
            receipt += "\nPayment to be made via GCash upon confirmation.";
        }
    } else {
        receipt += "\nShipping Fee: P" + shippingFee;
    }

    receipt += "\nTotal: P" + finalTotal +
               "\nDelivery Address: " + deliveryAddress +
               "\nOrder Date: " + orderDateStr +
               "\nExpected Delivery Date: " + deliveryDateStr +
               "\nPayment Status: " + paymentStatus +
               "\n\nExpected delivery in 3 days.";

    JOptionPane.showMessageDialog(this, receipt, "Order Successful", JOptionPane.INFORMATION_MESSAGE);
    loadAllProductStocks();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Please enter a valid quantity.", "Input Error", JOptionPane.ERROR_MESSAGE);
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_BMSPCActionPerformed

    private void BMSACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMSACActionPerformed
        String ProductName = "Black Modern Soft Arm Chairs";
        int price = 950;
        int Quantity;
        
        
        try {
        Quantity = Integer.parseInt(BMSQ.getText());
       
        int currentStock = 0;
        pst = conn.prepareStatement("SELECT Stock FROM products WHERE ProductName = ?");
        pst.setString(1, ProductName);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            currentStock = rs.getInt("Stock");
        }

        if (Quantity > currentStock) {
            JOptionPane.showMessageDialog(this, "Not enough stock available. Only " + currentStock + " left.", "Stock Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double TotalPrice = Quantity * price;
        int customerID = SessionManager.getCustomerID();

       
        pst = conn.prepareStatement("INSERT INTO addtocart (CustomerID, ProductName, Price, Quantity, TotalPrice) VALUES (?, ?, ?, ?, ?)");
        pst.setInt(1, customerID);
        pst.setString(2, ProductName);
        pst.setDouble(3, price);
        pst.setInt(4, Quantity);
        pst.setDouble(5, TotalPrice);
        int rowsInserted = pst.executeUpdate();

       
        int newStock = currentStock - Quantity;
        pst = conn.prepareStatement("UPDATE products SET Stock = ? WHERE ProductName = ?");
        pst.setInt(1, newStock);
        pst.setString(2, ProductName);
        pst.executeUpdate();

      
        BMSS.setText(String.valueOf(newStock));
        BMSQ.setText("");

        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Added to Cart!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a number.", "Input Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_BMSACActionPerformed

    private void BSAPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSAPCActionPerformed
         String ProductName = "Black Squared Arm Chairs";
        int price = 750;
        int Quantity;
         String Status = "Pending";
        
        try {
        Quantity = Integer.parseInt(BSAQ.getText());
        double TotalPrice = Quantity * price;

        
      
    int currentStock = 0;
    int productID = -1;

    
    pst = conn.prepareStatement("SELECT ProductID, Stock FROM products WHERE ProductName = ?");
    pst.setString(1, ProductName);
    ResultSet rs = pst.executeQuery();
    if (rs.next()) {
        productID = rs.getInt("ProductID");
        currentStock = rs.getInt("Stock");
    } else {
        JOptionPane.showMessageDialog(this, "Product not found in the database.");
        return;
    }

    if (Quantity > currentStock) {
        JOptionPane.showMessageDialog(this, "Not enough stock available. Only " + currentStock + " left.", "Stock Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String receiptMessage = "Product: " + ProductName +
                            "\nQuantity: " + Quantity +
                            "\nTotal Price: P" + TotalPrice +
                            "\n\nDo you confirm this order?";
    int confirm = JOptionPane.showConfirmDialog(this, receiptMessage, "Confirm Order", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(this, "Order Canceled.", "Canceled", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String deliveryAddress = JOptionPane.showInputDialog(this, "Enter Delivery Address:");
    if (deliveryAddress == null || deliveryAddress.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Delivery address is required.", "Missing Address", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String[] paymentOptions = { "Cash on Delivery", "Gcash" };
    String paymentMethod = (String) JOptionPane.showInputDialog(this, "Select Payment Method:", "Payment Method", JOptionPane.QUESTION_MESSAGE, null, paymentOptions, paymentOptions[0]);
    if (paymentMethod == null) return;

    double finalTotal = TotalPrice;
    double shippingFee = 0, change = 0, amountGiven = 0;
    String gcashName = "", gcashNumber = "";
    String paymentStatus = "Unpaid";

    if (paymentMethod.equals("Gcash")) {
    String[] gcashOptions = { "Pay Now", "Pay Later" };
    int gcashChoice = JOptionPane.showOptionDialog(this, "Choose GCash payment option:", "GCash Payment",
        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, gcashOptions, gcashOptions[0]);

            switch (gcashChoice) {
                case 0:
                    gcashName = JOptionPane.showInputDialog(this, "Enter Gcash Name:");
                    gcashNumber = JOptionPane.showInputDialog(this, "Enter Gcash Number:");
                    if (gcashNumber == null || gcashNumber.length() != 11 || !gcashNumber.matches("\\d{11}")) {
                        JOptionPane.showMessageDialog(this, "Invalid GCash number. Please enter an 11-digit number.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                        return;
                    }           String amountStr = JOptionPane.showInputDialog(this, "Enter Amount to Pay:");
                    if (gcashName == null || amountStr == null) return;
                    amountGiven = Double.parseDouble(amountStr);
                    if (amountGiven < TotalPrice) {
                        JOptionPane.showMessageDialog(this, "Amount is less than total price!", "Payment Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }           change = amountGiven - TotalPrice;
                    JOptionPane.showMessageDialog(this,
                            "Please send P" + String.format("%.2f", amountGiven) +
                                    " to the Admin's GCash Number: 09358968415\n" +
                                            "Then wait for admin verification.",
                            "Send Payment via GCash", JOptionPane.INFORMATION_MESSAGE);
                    paymentStatus = "Unpaid";
                    break;
                case 1:
                    paymentStatus = "Unpaid";
                    break;
                default:
                    return;
            }
} else {
    shippingFee = 50;
    finalTotal += shippingFee;
    paymentStatus = "Unpaid";
}

    int customerID = SessionManager.getCustomerID();
    java.time.LocalDate today = java.time.LocalDate.now();
    java.sql.Date orderDateSQL = java.sql.Date.valueOf(today);

    
    int orderId = -1;
    pst = conn.prepareStatement(
        "INSERT INTO orders (CustomerID, ProductID, ProductName, Quantity, TotalPrice, PaymentMethod, DeliveryAddress, Status, OrderDate, IsPaid) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
        Statement.RETURN_GENERATED_KEYS
    );
    pst.setInt(1, customerID);
    pst.setInt(2, productID);  
    pst.setString(3, ProductName);
    pst.setInt(4, Quantity);
    pst.setDouble(5, finalTotal);
    pst.setString(6, paymentMethod);
    pst.setString(7, deliveryAddress);
    pst.setString(8, Status);
    pst.setDate(9, orderDateSQL);
    pst.setString(10, paymentStatus);
    pst.executeUpdate();

    ResultSet generatedKeys = pst.getGeneratedKeys();
    if (generatedKeys.next()) {
        orderId = generatedKeys.getInt(1);
    }

    
    if (paymentMethod.equals("Gcash") && paymentStatus.equals("Paid")) {
        pst = conn.prepareStatement("INSERT INTO gcash (OrderID, GCashName, GCashNumber, GCashAmount) VALUES (?, ?, ?, ?)");
        pst.setInt(1, orderId);
        pst.setString(2, gcashName);
        pst.setString(3, gcashNumber);
        pst.setDouble(4, amountGiven);
        pst.executeUpdate();
    }

   
    int newStock = currentStock - Quantity;
    pst = conn.prepareStatement("UPDATE products SET Stock = ? WHERE ProductID = ?");
    pst.setInt(1, newStock);
    pst.setInt(2, productID);  
    pst.executeUpdate();

    BSAQ.setText("");
    BSAS.setText(String.valueOf(newStock));

    java.time.LocalDate deliveryDate = today.plusDays(3);
    java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("MMMM dd, yyyy");
    String orderDateStr = today.format(formatter);
    String deliveryDateStr = deliveryDate.format(formatter);

    String receipt = "Product Name: " + ProductName +
                     "\nQuantity: " + Quantity +
                     "\nPayment Method: " + paymentMethod +
                     "\nTotal Product Price: P" + String.format("%.2f", TotalPrice);

    if (paymentMethod.equals("Gcash")) {
        if (paymentStatus.equals("Paid")) {
            receipt += "\nGcash Name: " + gcashName +
                       "\nGcash Number: " + gcashNumber +
                       "\nAmount Given: P" + amountGiven +
                       "\nChange: P" + change;
        } else {
            receipt += "\nPayment to be made via GCash upon confirmation.";
        }
    } else {
        receipt += "\nShipping Fee: P" + shippingFee;
    }

    receipt += "\nTotal: P" + finalTotal +
               "\nDelivery Address: " + deliveryAddress +
               "\nOrder Date: " + orderDateStr +
               "\nExpected Delivery Date: " + deliveryDateStr +
               "\nPayment Status: " + paymentStatus +
               "\n\nExpected delivery in 3 days.";

    JOptionPane.showMessageDialog(this, receipt, "Order Successful", JOptionPane.INFORMATION_MESSAGE);
    loadAllProductStocks();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Please enter a valid quantity.", "Input Error", JOptionPane.ERROR_MESSAGE);
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_BSAPCActionPerformed

    private void BSSPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSSPCActionPerformed
         String ProductName = "Blue Squared Soft Arm Chairs";
    int price = 850;
    int Quantity;
    String Status = "Pending";

    try {
        Quantity = Integer.parseInt(BSSQ.getText());
        double TotalPrice = Quantity * price;

     int currentStock = 0;
    int productID = -1;

    
    pst = conn.prepareStatement("SELECT ProductID, Stock FROM products WHERE ProductName = ?");
    pst.setString(1, ProductName);
    ResultSet rs = pst.executeQuery();
    if (rs.next()) {
        productID = rs.getInt("ProductID");
        currentStock = rs.getInt("Stock");
    } else {
        JOptionPane.showMessageDialog(this, "Product not found in the database.");
        return;
    }

    if (Quantity > currentStock) {
        JOptionPane.showMessageDialog(this, "Not enough stock available. Only " + currentStock + " left.", "Stock Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String receiptMessage = "Product: " + ProductName +
                            "\nQuantity: " + Quantity +
                            "\nTotal Price: P" + TotalPrice +
                            "\n\nDo you confirm this order?";
    int confirm = JOptionPane.showConfirmDialog(this, receiptMessage, "Confirm Order", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(this, "Order Canceled.", "Canceled", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String deliveryAddress = JOptionPane.showInputDialog(this, "Enter Delivery Address:");
    if (deliveryAddress == null || deliveryAddress.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Delivery address is required.", "Missing Address", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String[] paymentOptions = { "Cash on Delivery", "Gcash" };
    String paymentMethod = (String) JOptionPane.showInputDialog(this, "Select Payment Method:", "Payment Method", JOptionPane.QUESTION_MESSAGE, null, paymentOptions, paymentOptions[0]);
    if (paymentMethod == null) return;

    double finalTotal = TotalPrice;
    double shippingFee = 0, change = 0, amountGiven = 0;
    String gcashName = "", gcashNumber = "";
    String paymentStatus = "Unpaid";

   if (paymentMethod.equals("Gcash")) {
    String[] gcashOptions = { "Pay Now", "Pay Later" };
    int gcashChoice = JOptionPane.showOptionDialog(this, "Choose GCash payment option:", "GCash Payment",
        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, gcashOptions, gcashOptions[0]);

            switch (gcashChoice) {
                case 0:
                    gcashName = JOptionPane.showInputDialog(this, "Enter Gcash Name:");
                    gcashNumber = JOptionPane.showInputDialog(this, "Enter Gcash Number:");
                    if (gcashNumber == null || gcashNumber.length() != 11 || !gcashNumber.matches("\\d{11}")) {
                        JOptionPane.showMessageDialog(this, "Invalid GCash number. Please enter an 11-digit number.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                        return;
                    }           String amountStr = JOptionPane.showInputDialog(this, "Enter Amount to Pay:");
                    if (gcashName == null || amountStr == null) return;
                    amountGiven = Double.parseDouble(amountStr);
                    if (amountGiven < TotalPrice) {
                        JOptionPane.showMessageDialog(this, "Amount is less than total price!", "Payment Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }           change = amountGiven - TotalPrice;
                    JOptionPane.showMessageDialog(this,
                            "Please send P" + String.format("%.2f", amountGiven) +
                                    " to the Admin's GCash Number: 09358968415\n" +
                                            "Then wait for admin verification.",
                            "Send Payment via GCash", JOptionPane.INFORMATION_MESSAGE);
                    paymentStatus = "Unpaid";
                    break;
                case 1:
                    paymentStatus = "Unpaid";
                    break;
                default:
                    return;
            }
} else {
    shippingFee = 50;
    finalTotal += shippingFee;
    paymentStatus = "Unpaid";
}

    int customerID = SessionManager.getCustomerID();
    java.time.LocalDate today = java.time.LocalDate.now();
    java.sql.Date orderDateSQL = java.sql.Date.valueOf(today);

    
    int orderId = -1;
    pst = conn.prepareStatement(
        "INSERT INTO orders (CustomerID, ProductID, ProductName, Quantity, TotalPrice, PaymentMethod, DeliveryAddress, Status, OrderDate, IsPaid) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
        Statement.RETURN_GENERATED_KEYS
    );
    pst.setInt(1, customerID);
    pst.setInt(2, productID);  
    pst.setString(3, ProductName);
    pst.setInt(4, Quantity);
    pst.setDouble(5, finalTotal);
    pst.setString(6, paymentMethod);
    pst.setString(7, deliveryAddress);
    pst.setString(8, Status);
    pst.setDate(9, orderDateSQL);
    pst.setString(10, paymentStatus);
    pst.executeUpdate();

    ResultSet generatedKeys = pst.getGeneratedKeys();
    if (generatedKeys.next()) {
        orderId = generatedKeys.getInt(1);
    }

    
    if (paymentMethod.equals("Gcash") && paymentStatus.equals("Paid")) {
        pst = conn.prepareStatement("INSERT INTO gcash (OrderID, GCashName, GCashNumber, GCashAmount) VALUES (?, ?, ?, ?)");
        pst.setInt(1, orderId);
        pst.setString(2, gcashName);
        pst.setString(3, gcashNumber);
        pst.setDouble(4, amountGiven);
        pst.executeUpdate();
    }

   
    int newStock = currentStock - Quantity;
    pst = conn.prepareStatement("UPDATE products SET Stock = ? WHERE ProductID = ?");
    pst.setInt(1, newStock);
    pst.setInt(2, productID);  
    pst.executeUpdate();

    BSSQ.setText("");
    BSSS.setText(String.valueOf(newStock));

    java.time.LocalDate deliveryDate = today.plusDays(3);
    java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("MMMM dd, yyyy");
    String orderDateStr = today.format(formatter);
    String deliveryDateStr = deliveryDate.format(formatter);

    String receipt = "Product Name: " + ProductName +
                     "\nQuantity: " + Quantity +
                     "\nPayment Method: " + paymentMethod +
                     "\nTotal Product Price: P" + String.format("%.2f", TotalPrice);

    if (paymentMethod.equals("Gcash")) {
        if (paymentStatus.equals("Paid")) {
            receipt += "\nGcash Name: " + gcashName +
                       "\nGcash Number: " + gcashNumber +
                       "\nAmount Given: P" + amountGiven +
                       "\nChange: P" + change;
        } else {
            receipt += "\nPayment to be made via GCash upon confirmation.";
        }
    } else {
        receipt += "\nShipping Fee: P" + shippingFee;
    }

    receipt += "\nTotal: P" + finalTotal +
               "\nDelivery Address: " + deliveryAddress +
               "\nOrder Date: " + orderDateStr +
               "\nExpected Delivery Date: " + deliveryDateStr +
               "\nPayment Status: " + paymentStatus +
               "\n\nExpected delivery in 3 days.";

    JOptionPane.showMessageDialog(this, receipt, "Order Successful", JOptionPane.INFORMATION_MESSAGE);
    loadAllProductStocks();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Please enter a valid quantity.", "Input Error", JOptionPane.ERROR_MESSAGE);
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_BSSPCActionPerformed

    private void BSACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSACActionPerformed
         String ProductName = "Black Squared Arm Chairs";
    int price = 750;
    int Quantity;
    

    try {
        Quantity = Integer.parseInt(BSAQ.getText());
        
        int currentStock = 0;
        pst = conn.prepareStatement("SELECT Stock FROM products WHERE ProductName = ?");
        pst.setString(1, ProductName);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            currentStock = rs.getInt("Stock");
        }

        if (Quantity > currentStock) {
            JOptionPane.showMessageDialog(this, "Not enough stock available. Only " + currentStock + " left.", "Stock Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double TotalPrice = Quantity * price;
        int customerID = SessionManager.getCustomerID();

       
        pst = conn.prepareStatement("INSERT INTO addtocart (CustomerID, ProductName, Price, Quantity, TotalPrice) VALUES (?, ?, ?, ?, ?)");
        pst.setInt(1, customerID);
        pst.setString(2, ProductName);
        pst.setDouble(3, price);
        pst.setInt(4, Quantity);
        pst.setDouble(5, TotalPrice);
        int rowsInserted = pst.executeUpdate();

       
        int newStock = currentStock - Quantity;
        pst = conn.prepareStatement("UPDATE products SET Stock = ? WHERE ProductName = ?");
        pst.setInt(1, newStock);
        pst.setString(2, ProductName);
        pst.executeUpdate();

       
        BSAS.setText(String.valueOf(newStock));
        BSAQ.setText("");

        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Added to Cart!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a number.", "Input Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_BSACActionPerformed

    private void BSSACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSSACActionPerformed
        String ProductName = "Blue Squared Soft Arm Chairs";
        int price = 850;
        int Quantity;
        
        
         try {
        Quantity = Integer.parseInt(BSSQ.getText());
     
        int currentStock = 0;
        pst = conn.prepareStatement("SELECT Stock FROM products WHERE ProductName = ?");
        pst.setString(1, ProductName);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            currentStock = rs.getInt("Stock");
        }

        if (Quantity > currentStock) {
            JOptionPane.showMessageDialog(this, "Not enough stock available. Only " + currentStock + " left.", "Stock Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double TotalPrice = Quantity * price;
        int customerID = SessionManager.getCustomerID();

       
        pst = conn.prepareStatement("INSERT INTO addtocart (CustomerID, ProductName, Price, Quantity, TotalPrice) VALUES (?, ?, ?, ?, ?)");
        pst.setInt(1, customerID);
        pst.setString(2, ProductName);
        pst.setDouble(3, price);
        pst.setInt(4, Quantity);
        pst.setDouble(5, TotalPrice);
        int rowsInserted = pst.executeUpdate();

        
        int newStock = currentStock - Quantity;
        pst = conn.prepareStatement("UPDATE products SET Stock = ? WHERE ProductName = ?");
        pst.setInt(1, newStock);
        pst.setString(2, ProductName);
        pst.executeUpdate();

       
        BSSS.setText(String.valueOf(newStock));
        BSSQ.setText("");

        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Added to Cart!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a number.", "Input Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_BSSACActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        UpholsteredFurniture obj = new UpholsteredFurniture();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void BSSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSSSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BSSSActionPerformed

    private void BMSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMSSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BMSSActionPerformed

    private void BRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BRASActionPerformed

    private void BSASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BSASActionPerformed

    private void BSAQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSAQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BSAQActionPerformed

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
            java.util.logging.Logger.getLogger(ArmChairsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArmChairsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArmChairsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArmChairsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArmChairsDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BMSAC;
    private javax.swing.JButton BMSPC;
    private javax.swing.JTextField BMSQ;
    private javax.swing.JTextField BMSS;
    private javax.swing.JButton BRAAC;
    private javax.swing.JButton BRAPC;
    private javax.swing.JTextField BRAQ;
    private javax.swing.JTextField BRAS;
    private javax.swing.JButton BSAC;
    private javax.swing.JButton BSAPC;
    private javax.swing.JTextField BSAQ;
    private javax.swing.JTextField BSAS;
    private javax.swing.JButton BSSAC;
    private javax.swing.JButton BSSPC;
    private javax.swing.JTextField BSSQ;
    private javax.swing.JTextField BSSS;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    // End of variables declaration//GEN-END:variables
}
