
package UI;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DB.DBConnector;
import OrderingSystem.SessionManager;
import UI.Kitchen;
import java.sql.Statement;
import javax.swing.JTextField;

/**
 *
 * @author jessa
 */
public class KitchenSet extends javax.swing.JFrame {
Connection conn;
PreparedStatement pst;
ResultSet rst;
    
    /**
     * Creates new form KitchenSet
     */
    public KitchenSet() {
        initComponents();
         DBConnector mycon = new DBConnector();
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
    loadStockIntoField("Kitchen Wooden Set", KWSS);  
    loadStockIntoField("Kitchen Modern Set", KMSS);    
    
   
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
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        KMSAC = new javax.swing.JButton();
        KMSPC = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        KWSPC = new javax.swing.JButton();
        KWSAC = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        KMSS = new javax.swing.JTextField();
        KWSS = new javax.swing.JTextField();
        ExitButton = new javax.swing.JButton();
        KWSQ = new javax.swing.JTextField();
        KMSQ = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Quantity");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, 80, -1));

        KMSAC.setBackground(new java.awt.Color(101, 101, 101));
        KMSAC.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        KMSAC.setForeground(new java.awt.Color(255, 255, 255));
        KMSAC.setText("Add to Cart");
        KMSAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KMSACActionPerformed(evt);
            }
        });
        jPanel4.add(KMSAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 520, 180, 50));

        KMSPC.setBackground(new java.awt.Color(101, 101, 101));
        KMSPC.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        KMSPC.setForeground(new java.awt.Color(255, 255, 255));
        KMSPC.setText("Proceed to Checkout");
        KMSPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KMSPCActionPerformed(evt);
            }
        });
        jPanel4.add(KMSPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 460, 180, 50));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Quantity");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 80, -1));

        KWSPC.setBackground(new java.awt.Color(101, 101, 101));
        KWSPC.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        KWSPC.setForeground(new java.awt.Color(255, 255, 255));
        KWSPC.setText("Proceed to Checkout");
        KWSPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KWSPCActionPerformed(evt);
            }
        });
        jPanel4.add(KWSPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 180, 50));

        KWSAC.setBackground(new java.awt.Color(101, 101, 101));
        KWSAC.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        KWSAC.setForeground(new java.awt.Color(255, 255, 255));
        KWSAC.setText("Add to Cart");
        KWSAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KWSACActionPerformed(evt);
            }
        });
        jPanel4.add(KWSAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 180, 50));

        jLabel13.setBackground(new java.awt.Color(255, 153, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jTextArea8.setEditable(false);
        jTextArea8.setBackground(new java.awt.Color(230, 222, 210));
        jTextArea8.setColumns(20);
        jTextArea8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jTextArea8.setForeground(new java.awt.Color(60, 60, 60));
        jTextArea8.setRows(5);
        jTextArea8.setText("Kitchen Modern Set\nModern Black Minimalist Kitchen Set\nPrice: P50000.00\nMaterial: Modern Materials\nColor: Black and White");
        jScrollPane8.setViewportView(jTextArea8);

        jPanel4.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, 250, -1));

        jTextArea9.setEditable(false);
        jTextArea9.setBackground(new java.awt.Color(230, 222, 210));
        jTextArea9.setColumns(20);
        jTextArea9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jTextArea9.setForeground(new java.awt.Color(60, 60, 60));
        jTextArea9.setRows(5);
        jTextArea9.setText("Kitchen Wooden Set\nWooden Minimalist Kitchen Set\nPrice: P25000.00\nMaterial: Wood\nColor: Brown");
        jScrollPane9.setViewportView(jTextArea9);

        jPanel4.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Kitchen/KitchenSets1.jpg"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 230, 180));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Kitchen/KitchenSets2.jpg"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 230, 180));

        jLabel16.setBackground(new java.awt.Color(255, 153, 0));
        jLabel16.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Kitchen Set");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        KMSS.setEditable(false);
        KMSS.setBackground(new java.awt.Color(230, 222, 210));
        KMSS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        KMSS.setForeground(new java.awt.Color(60, 60, 60));
        KMSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KMSSActionPerformed(evt);
            }
        });
        jPanel4.add(KMSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 400, 50, 50));

        KWSS.setEditable(false);
        KWSS.setBackground(new java.awt.Color(230, 222, 210));
        KWSS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        KWSS.setForeground(new java.awt.Color(60, 60, 60));
        KWSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KWSSActionPerformed(evt);
            }
        });
        jPanel4.add(KWSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 50, 50));

        ExitButton.setBackground(new java.awt.Color(180, 100, 100));
        ExitButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel4.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 570, -1, 50));

        KWSQ.setBackground(new java.awt.Color(230, 222, 210));
        KWSQ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        KWSQ.setForeground(new java.awt.Color(60, 60, 60));
        KWSQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KWSQActionPerformed(evt);
            }
        });
        jPanel4.add(KWSQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 50, 50));

        KMSQ.setBackground(new java.awt.Color(230, 222, 210));
        KMSQ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        KMSQ.setForeground(new java.awt.Color(60, 60, 60));
        KMSQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KMSQActionPerformed(evt);
            }
        });
        jPanel4.add(KMSQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 400, 50, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg.jpg"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 630));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 1300, 630));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KMSQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KMSQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KMSQActionPerformed

    private void KWSQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KWSQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KWSQActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        Kitchen obj = new Kitchen();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void KWSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KWSSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KWSSActionPerformed

    private void KMSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KMSSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KMSSActionPerformed

    private void KWSACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KWSACActionPerformed
        String ProductName = "Kitchen Wooden Set";
        int price = 25000;
        int Quantity;

        try {
            Quantity = Integer.parseInt(KWSQ.getText());

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

            KWSS.setText(String.valueOf(newStock));
            KWSQ.setText("");

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
    }//GEN-LAST:event_KWSACActionPerformed

    private void KWSPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KWSPCActionPerformed
        String ProductName = "Kitchen Wooden Set";
        int price = 25000;
        int Quantity;
        String Status = "Pending";
        try {
            Quantity = Integer.parseInt(KWSQ.getText());
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

    if (gcashChoice == 0) { 
        gcashName = JOptionPane.showInputDialog(this, "Enter Gcash Name:");
        gcashNumber = JOptionPane.showInputDialog(this, "Enter Gcash Number:");
        
      
        if (gcashNumber == null || gcashNumber.length() != 11 || !gcashNumber.matches("\\d{11}")) {
            JOptionPane.showMessageDialog(this, "Invalid GCash number. Please enter an 11-digit number.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String amountStr = JOptionPane.showInputDialog(this, "Enter Amount to Pay:");
        if (gcashName == null || amountStr == null) return;

        amountGiven = Double.parseDouble(amountStr);
        if (amountGiven < TotalPrice) {
            JOptionPane.showMessageDialog(this, "Amount is less than total price!", "Payment Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        change = amountGiven - TotalPrice;
        JOptionPane.showMessageDialog(this,
                "Please send P" + String.format("%.2f", amountGiven) +
                " to the Admin's GCash Number: 09358968415\n" +
                "Then wait for admin verification.",
                "Send Payment via GCash", JOptionPane.INFORMATION_MESSAGE);

        paymentStatus = "Unpaid";
    } else if (gcashChoice == 1) {
        paymentStatus = "Unpaid";
    } else {
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

    KWSQ.setText("");
    KWSS.setText(String.valueOf(newStock));

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
    }//GEN-LAST:event_KWSPCActionPerformed

    private void KMSPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KMSPCActionPerformed
        String ProductName = "Kitchen Modern Set";
        int price = 50000;
        int Quantity;
        String Status = "Pending";
        try {
            Quantity = Integer.parseInt(KMSQ.getText());
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

    if (gcashChoice == 0) { 
        gcashName = JOptionPane.showInputDialog(this, "Enter Gcash Name:");
        gcashNumber = JOptionPane.showInputDialog(this, "Enter Gcash Number:");
        
      
        if (gcashNumber == null || gcashNumber.length() != 11 || !gcashNumber.matches("\\d{11}")) {
            JOptionPane.showMessageDialog(this, "Invalid GCash number. Please enter an 11-digit number.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String amountStr = JOptionPane.showInputDialog(this, "Enter Amount to Pay:");
        if (gcashName == null || amountStr == null) return;

        amountGiven = Double.parseDouble(amountStr);
        if (amountGiven < TotalPrice) {
            JOptionPane.showMessageDialog(this, "Amount is less than total price!", "Payment Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        change = amountGiven - TotalPrice;
        JOptionPane.showMessageDialog(this,
                "Please send P" + String.format("%.2f", amountGiven) +
                " to the Admin's GCash Number: 09358968415\n" +
                "Then wait for admin verification.",
                "Send Payment via GCash", JOptionPane.INFORMATION_MESSAGE);

        paymentStatus = "Unpaid";
    } else if (gcashChoice == 1) {
        paymentStatus = "Unpaid";
    } else {
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

    KMSQ.setText("");
    KMSS.setText(String.valueOf(newStock));

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
    }//GEN-LAST:event_KMSPCActionPerformed

    private void KMSACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KMSACActionPerformed
        String ProductName = "Kitchen Modern Set";
        int price = 50000;
        int Quantity;

        try {
            Quantity = Integer.parseInt(KMSQ.getText());

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

            KMSS.setText(String.valueOf(newStock));
            KMSQ.setText("");

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
    }//GEN-LAST:event_KMSACActionPerformed

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
            java.util.logging.Logger.getLogger(KitchenSet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KitchenSet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KitchenSet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KitchenSet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KitchenSet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton KMSAC;
    private javax.swing.JButton KMSPC;
    private javax.swing.JTextField KMSQ;
    private javax.swing.JTextField KMSS;
    private javax.swing.JButton KWSAC;
    private javax.swing.JButton KWSPC;
    private javax.swing.JTextField KWSQ;
    private javax.swing.JTextField KWSS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    // End of variables declaration//GEN-END:variables
}
