
package UI;
import DB.DBConnector;
import java.awt.BorderLayout;
import java.awt.Font;
import java.sql.*;
import java.text.DecimalFormat;
import javax.swing.*;
import org.jfree.chart.*;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import UI.AdminDashboard;


public class ReportsAnalyticsDashboard extends javax.swing.JFrame {
Connection conn;
PreparedStatement pst;
ResultSet rst;
    /**
     * Creates new form ReportsAnalyticsDashboard
     */
    public ReportsAnalyticsDashboard() {
        initComponents();
         DBConnector mycon = new DBConnector();
        conn = DBConnector.getCon();
        generateCharts();
    }
     private void generateCharts() {
        try {
            // --- TOTAL REVENUE (Plain Text) ---
            String query = "SELECT SUM(TotalPrice) AS total FROM orders";
            pst = conn.prepareStatement(query);
            rst = pst.executeQuery();
            if (rst.next()) {
                double totalRevenue = rst.getDouble("total");
                TotalRevenue.removeAll();
                TotalRevenue.setLayout(new BorderLayout());
                JLabel label = new JLabel("Total Revenue: " + String.format("%,.2f", totalRevenue), SwingConstants.CENTER);
                label.setFont(new Font("SansSerif", Font.BOLD, 20));
                TotalRevenue.add(label, BorderLayout.CENTER);
                TotalRevenue.validate();
            }

            // --- AVERAGE ORDER VALUE (Plain Text) ---
            query = "SELECT AVG(TotalPrice) AS avg_order FROM orders";
            pst = conn.prepareStatement(query);
            rst = pst.executeQuery();
            if (rst.next()) {
                double avgOrder = rst.getDouble("avg_order");
                AverageValue.removeAll();
                AverageValue.setLayout(new BorderLayout());
                JLabel label = new JLabel("Average Value: " + String.format("%,.2f", avgOrder), SwingConstants.CENTER);
                label.setFont(new Font("SansSerif", Font.BOLD, 20));
                AverageValue.add(label, BorderLayout.CENTER);
                AverageValue.validate();
            }

            // --- TOP SELLING PRODUCTS ---
            query = "SELECT p.ProductName, SUM(o.Quantity) AS total_quantity " +
                    "FROM orders o INNER JOIN products p ON o.ProductName = p.ProductName " +
                    "GROUP BY p.ProductName ORDER BY total_quantity DESC LIMIT 10";
            pst = conn.prepareStatement(query);
            rst = pst.executeQuery();

            DefaultCategoryDataset topSellingDataset = new DefaultCategoryDataset();
            while (rst.next()) {
                String name = rst.getString("ProductName");
                int qty = rst.getInt("total_quantity");
                topSellingDataset.addValue(qty, "Quantity Sold", name);
            }

            JFreeChart topSellingChart = ChartFactory.createBarChart(
                    "Top Selling Products", "Product", "Units Sold", topSellingDataset,
                    PlotOrientation.HORIZONTAL, false, true, false);
            ChartPanel topPanel = new ChartPanel(topSellingChart);
            TopSelling.removeAll();
            TopSelling.setLayout(new BorderLayout());
            TopSelling.add(topPanel, BorderLayout.CENTER);
            TopSelling.validate();

            // --- REVENUE BY CATEGORY ---
            query = "SELECT c.CategoryName, SUM(o.Quantity * p.Price) AS revenue " +
                    "FROM orders o INNER JOIN products p ON o.ProductID = p.ProductID " +
                    "INNER JOIN productcategories c ON p.CategoryID = c.CategoryID " +
                    "GROUP BY c.CategoryName";
            pst = conn.prepareStatement(query);
            rst = pst.executeQuery();

            DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
            while (rst.next()) {
                String category = rst.getString("CategoryName");
                double revenue = rst.getDouble("revenue");
                categoryDataset.addValue(revenue, "Revenue", category);
            }

            JFreeChart categoryChart = ChartFactory.createBarChart("Revenue by Category", "Category", "Revenue", categoryDataset, PlotOrientation.HORIZONTAL, false, true, false);
            ChartPanel categoryPanelChart = new ChartPanel(categoryChart);
            RevenueCategory.removeAll();
            RevenueCategory.setLayout(new BorderLayout());
            RevenueCategory.add(categoryPanelChart, BorderLayout.CENTER);
            RevenueCategory.validate();

            // --- CANCELLED / REFUNDED PRODUCTS ---
            query = "SELECT ProductName, SUM(Quantity) AS total_quantity " +
                    "FROM orders WHERE Status IN ('Cancelled', 'Refunded') " +
                    "GROUP BY ProductName ORDER BY total_quantity DESC";
            pst = conn.prepareStatement(query);
            rst = pst.executeQuery();

            DefaultCategoryDataset cancelDataset = new DefaultCategoryDataset();
            while (rst.next()) {
                String product = rst.getString("ProductName");
                int quantity = rst.getInt("total_quantity");
                cancelDataset.addValue(quantity, "Cancelled/Refunded", product);
            }

            JFreeChart cancelChart = ChartFactory.createBarChart(
                    "Most Cancelled/Refunded Products", "Product", "Cancelled/Refunded Qty",
                    cancelDataset, PlotOrientation.HORIZONTAL, false, true, false);
         
            ChartPanel cancelPanelChart = new ChartPanel(cancelChart);
            Cancellation.removeAll();
            Cancellation.setLayout(new BorderLayout());
            Cancellation.add(cancelPanelChart, BorderLayout.CENTER);
            Cancellation.validate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error generating dashboard: " + e.getMessage());
            e.printStackTrace();
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

        TotalRevenue = new javax.swing.JPanel();
        AverageValue = new javax.swing.JPanel();
        TopSelling = new javax.swing.JPanel();
        RevenueCategory = new javax.swing.JPanel();
        Cancellation = new javax.swing.JPanel();
        HomeButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout TotalRevenueLayout = new javax.swing.GroupLayout(TotalRevenue);
        TotalRevenue.setLayout(TotalRevenueLayout);
        TotalRevenueLayout.setHorizontalGroup(
            TotalRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        TotalRevenueLayout.setVerticalGroup(
            TotalRevenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(TotalRevenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 440, -1));

        javax.swing.GroupLayout AverageValueLayout = new javax.swing.GroupLayout(AverageValue);
        AverageValue.setLayout(AverageValueLayout);
        AverageValueLayout.setHorizontalGroup(
            AverageValueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        AverageValueLayout.setVerticalGroup(
            AverageValueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(AverageValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 440, -1));

        javax.swing.GroupLayout TopSellingLayout = new javax.swing.GroupLayout(TopSelling);
        TopSelling.setLayout(TopSellingLayout);
        TopSellingLayout.setHorizontalGroup(
            TopSellingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        TopSellingLayout.setVerticalGroup(
            TopSellingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        getContentPane().add(TopSelling, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 630, 320));

        javax.swing.GroupLayout RevenueCategoryLayout = new javax.swing.GroupLayout(RevenueCategory);
        RevenueCategory.setLayout(RevenueCategoryLayout);
        RevenueCategoryLayout.setHorizontalGroup(
            RevenueCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        RevenueCategoryLayout.setVerticalGroup(
            RevenueCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        getContentPane().add(RevenueCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 770, 290));

        javax.swing.GroupLayout CancellationLayout = new javax.swing.GroupLayout(Cancellation);
        Cancellation.setLayout(CancellationLayout);
        CancellationLayout.setHorizontalGroup(
            CancellationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        CancellationLayout.setVerticalGroup(
            CancellationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        getContentPane().add(Cancellation, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 630, 320));

        HomeButton1.setBackground(new java.awt.Color(180, 100, 100));
        HomeButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        HomeButton1.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton1.setText("EXIT");
        HomeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(HomeButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 670, 180, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButton1ActionPerformed
        AdminDashboard obj = new AdminDashboard();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_HomeButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ReportsAnalyticsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportsAnalyticsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportsAnalyticsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportsAnalyticsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportsAnalyticsDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AverageValue;
    private javax.swing.JPanel Cancellation;
    private javax.swing.JButton HomeButton1;
    private javax.swing.JPanel RevenueCategory;
    private javax.swing.JPanel TopSelling;
    private javax.swing.JPanel TotalRevenue;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
