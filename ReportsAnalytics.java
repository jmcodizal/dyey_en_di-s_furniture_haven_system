
package UI;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import DB.DBConnector;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.ChartPanel;
import java.awt.Font;

public class ReportsAnalytics extends javax.swing.JFrame {

Connection conn;
PreparedStatement pst;
ResultSet rst;
    /**
     * Creates new form ReportsAnalytics
     */
    public ReportsAnalytics() {
        initComponents();
        DBConnector mycon = new DBConnector();
        conn = DBConnector.getCon();
       
    }
    private void showChart(JFreeChart chart) {
    ChartPanel panel = new ChartPanel(chart);
    panel.setPreferredSize(new Dimension(800, 500));
    jPanel1.removeAll();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.add(panel, BorderLayout.CENTER);
    jPanel1.validate();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        HomeButton1 = new javax.swing.JButton();
        RevenuebyCategory = new javax.swing.JButton();
        RefundCancellation = new javax.swing.JButton();
        TotalRevenue = new javax.swing.JButton();
        AverageOrderValue = new javax.swing.JButton();
        TopSellingProducts = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        HomeButton1.setBackground(new java.awt.Color(180, 100, 100));
        HomeButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        HomeButton1.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton1.setText("EXIT");
        HomeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(HomeButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 180, 50));

        RevenuebyCategory.setBackground(new java.awt.Color(101, 101, 101));
        RevenuebyCategory.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        RevenuebyCategory.setForeground(new java.awt.Color(255, 255, 255));
        RevenuebyCategory.setText("Revenue Category");
        RevenuebyCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RevenuebyCategoryActionPerformed(evt);
            }
        });
        jPanel4.add(RevenuebyCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 180, 50));

        RefundCancellation.setBackground(new java.awt.Color(101, 101, 101));
        RefundCancellation.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        RefundCancellation.setForeground(new java.awt.Color(255, 255, 255));
        RefundCancellation.setText("Cancellation");
        RefundCancellation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefundCancellationActionPerformed(evt);
            }
        });
        jPanel4.add(RefundCancellation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 180, 50));

        TotalRevenue.setBackground(new java.awt.Color(101, 101, 101));
        TotalRevenue.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TotalRevenue.setForeground(new java.awt.Color(255, 255, 255));
        TotalRevenue.setText("Total Revenue");
        TotalRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalRevenueActionPerformed(evt);
            }
        });
        jPanel4.add(TotalRevenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 180, 50));

        AverageOrderValue.setBackground(new java.awt.Color(101, 101, 101));
        AverageOrderValue.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        AverageOrderValue.setForeground(new java.awt.Color(255, 255, 255));
        AverageOrderValue.setText("Average Value");
        AverageOrderValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AverageOrderValueActionPerformed(evt);
            }
        });
        jPanel4.add(AverageOrderValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 180, 50));

        TopSellingProducts.setBackground(new java.awt.Color(101, 101, 101));
        TopSellingProducts.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TopSellingProducts.setForeground(new java.awt.Color(255, 255, 255));
        TopSellingProducts.setText("Top Selling");
        TopSellingProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TopSellingProductsActionPerformed(evt);
            }
        });
        jPanel4.add(TopSellingProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 180, 50));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 700));

        jPanel1.setBackground(new java.awt.Color(140, 122, 107));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 1050, 540));

        jLabel2.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DYEY EN DI'S FURNITURE HAVEN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Reports Analytics");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1180, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButton1ActionPerformed
        AdminDashboard obj = new AdminDashboard();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_HomeButton1ActionPerformed

    private void RevenuebyCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RevenuebyCategoryActionPerformed
        String query = "SELECT c.CategoryName, SUM(o.Quantity * p.Price) AS revenue " +
                   "FROM orders o " +
                   "INNER JOIN products p ON o.ProductID = p.ProductID " +
                   "INNER JOIN productcategories c ON p.CategoryID = c.CategoryID " +
                   "GROUP BY c.CategoryName";

    var dataset = new org.jfree.data.category.DefaultCategoryDataset();

    try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
        while (rs.next()) {
            String category = rs.getString("CategoryName"); 
            double revenue = rs.getDouble("revenue");
            dataset.addValue(revenue, "Revenue", category);
        }

        JFreeChart chart = ChartFactory.createBarChart(
            "Revenue by Category", "Category", "Revenue", dataset);

        showChart(chart);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error generating category chart: " + e.getMessage());
    }
        
    }//GEN-LAST:event_RevenuebyCategoryActionPerformed

    private void RefundCancellationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefundCancellationActionPerformed
      String query = "SELECT ProductName, SUM(Quantity) AS total_quantity " +
                   "FROM orders " +
                   "WHERE Status IN ('Cancelled', 'Refunded') " +
                   "GROUP BY ProductName " +
                   "ORDER BY total_quantity DESC";

    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
        while (rs.next()) {
            String product = rs.getString("ProductName");
            int quantity = rs.getInt("total_quantity");  
            dataset.addValue(quantity, "Cancelled/Refunded Quantity", product);
        }

        JFreeChart chart = ChartFactory.createBarChart(
                "Most Cancelled/Refunded Products",
                "Product Name",
                "Total Cancelled/Refunded Quantity",
                dataset,
                PlotOrientation.HORIZONTAL,
                false, true, false
        );

       
        CategoryPlot plot = chart.getCategoryPlot();
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

       
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setItemLabelsVisible(true); 
        renderer.setItemLabelFont(new Font("SansSerif", Font.BOLD, 12));
        renderer.setDrawBarOutline(false);

       
        ChartPanel chartPanel = new ChartPanel(chart);
        jPanel1.removeAll();
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(chartPanel, java.awt.BorderLayout.CENTER);
        jPanel1.validate();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error generating chart: " + e.getMessage());
    }
    }//GEN-LAST:event_RefundCancellationActionPerformed

    private void TotalRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalRevenueActionPerformed
       String query = "SELECT SUM(TotalPrice) AS total FROM orders";

    try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
        if (rs.next()) {
            double totalRevenue = rs.getDouble("total");
            JOptionPane.showMessageDialog(this, "Total Revenue: ₱" + String.format("%,.2f", totalRevenue));
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error calculating revenue: " + e.getMessage());
    }
    }//GEN-LAST:event_TotalRevenueActionPerformed

    private void AverageOrderValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AverageOrderValueActionPerformed
       String query = "SELECT AVG(TotalPrice) AS avg_order FROM orders";

    try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
        if (rs.next()) {
            double avgOrder = rs.getDouble("avg_order");
            JOptionPane.showMessageDialog(this, "Average Order Value: ₱" + String.format("%,.2f", avgOrder));
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error calculating average: " + e.getMessage());
    }
    }//GEN-LAST:event_AverageOrderValueActionPerformed

    private void TopSellingProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TopSellingProductsActionPerformed
        try {
        String sql = "SELECT p.ProductName, SUM(o.Quantity) AS total_quantity " +
                     "FROM orders o INNER JOIN products p ON o.ProductName = p.ProductName " +
                     "GROUP BY p.ProductName ORDER BY total_quantity DESC LIMIT 10";
        pst = conn.prepareStatement(sql);
        rst = pst.executeQuery();

        org.jfree.data.category.DefaultCategoryDataset dataset = new org.jfree.data.category.DefaultCategoryDataset();
        while (rst.next()) {
            String name = rst.getString("ProductName");
            int qty = rst.getInt("total_quantity");
            dataset.addValue(qty, "Quantity Sold", name);
        }

        JFreeChart barChart = ChartFactory.createBarChart(
                "Top Selling Products",
                "Product Name",
                "Units Sold",
                dataset,
                org.jfree.chart.plot.PlotOrientation.HORIZONTAL,
                false, true, false
        );

        ChartPanel chartPanel = new ChartPanel(barChart);
        jPanel1.removeAll();
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(chartPanel, java.awt.BorderLayout.CENTER);
        jPanel1.validate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_TopSellingProductsActionPerformed

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
            java.util.logging.Logger.getLogger(ReportsAnalytics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportsAnalytics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportsAnalytics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportsAnalytics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportsAnalytics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AverageOrderValue;
    private javax.swing.JButton HomeButton1;
    private javax.swing.JButton RefundCancellation;
    private javax.swing.JButton RevenuebyCategory;
    private javax.swing.JButton TopSellingProducts;
    private javax.swing.JButton TotalRevenue;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
