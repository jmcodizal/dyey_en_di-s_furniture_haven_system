
package UI;
import DB.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.general.DefaultPieDataset;
import UI.AdminDashboard;

public class SalesDashboard extends javax.swing.JFrame {
Connection conn;
PreparedStatement pst;
ResultSet rst;
    /**
     * Creates new form SalesDashboard
     */
    public SalesDashboard() {
        initComponents();
        DBConnector mycon = new DBConnector();
        conn = DBConnector.getCon();
        generateCharts();
    }
   private void generateCharts() {
        try {
            // --- DAILY SALES CHART ---
            String sqlDay = "SELECT DATE(OrderDate) AS order_date, SUM(TotalPrice) AS total_sales " +
                            "FROM orders GROUP BY DATE(OrderDate) ORDER BY order_date";

            pst = conn.prepareStatement(sqlDay);
            rst = pst.executeQuery();

            DefaultCategoryDataset dayDataset = new DefaultCategoryDataset();
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat outputFormat = new SimpleDateFormat("MM-dd");

            while (rst.next()) {
                String orderDateStr = rst.getString("order_date");
                double totalSales = rst.getDouble("total_sales");

                java.util.Date parsedDate = inputFormat.parse(orderDateStr);
                String formattedDate = outputFormat.format(parsedDate);
                dayDataset.addValue(totalSales, "Sales", formattedDate);
            }

            JFreeChart dayChart = ChartFactory.createBarChart("Daily Sales", "Date", "Amount", dayDataset);
            CategoryPlot plot = dayChart.getCategoryPlot();
            CategoryAxis xAxis = plot.getDomainAxis();
            xAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
            xAxis.setMaximumCategoryLabelWidthRatio(10.0f);

            SalesPerDay.setLayout(new java.awt.BorderLayout());
            SalesPerDay.removeAll();
            SalesPerDay.add(new ChartPanel(dayChart), java.awt.BorderLayout.CENTER);
            SalesPerDay.validate();

            // --- WEEKLY SALES CHART ---
            String sqlRange = "SELECT MIN(OrderDate) as minDate, MAX(OrderDate) as maxDate FROM orders";
            pst = conn.prepareStatement(sqlRange);
            rst = pst.executeQuery();

            java.sql.Date minDate = null, maxDate = null;
            if (rst.next()) {
                minDate = rst.getDate("minDate");
                maxDate = rst.getDate("maxDate");
            }

            if (minDate != null && maxDate != null) {
                java.time.LocalDate start = minDate.toLocalDate();
                java.time.LocalDate end = maxDate.toLocalDate();

                DefaultCategoryDataset weekDataset = new DefaultCategoryDataset();

                while (!start.isAfter(end)) {
                    java.time.LocalDate weekEnd = start.plusDays(6);
                    if (weekEnd.isAfter(end)) {
                        weekEnd = end;
                    }

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd");
                    String label = formatter.format(start) + " - " + formatter.format(weekEnd);

                    sqlDay = "SELECT SUM(TotalPrice) AS total_sales FROM orders WHERE OrderDate BETWEEN ? AND ?";
                    pst = conn.prepareStatement(sqlDay);
                    pst.setDate(1, java.sql.Date.valueOf(start));
                    pst.setDate(2, java.sql.Date.valueOf(weekEnd));
                    rst = pst.executeQuery();

                    if (rst.next()) {
                        double totalSales = rst.getDouble("total_sales");
                        weekDataset.addValue(totalSales, "Sales", label);
                    }

                    start = weekEnd.plusDays(1);
                }

                JFreeChart weekChart = ChartFactory.createBarChart("Weekly Sales", "Week", "Amount", weekDataset);
                CategoryPlot weekPlot = weekChart.getCategoryPlot();
                CategoryAxis weekXAxis = weekPlot.getDomainAxis();
                weekXAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
                weekXAxis.setMaximumCategoryLabelWidthRatio(10.0f);

                SalesPerWeek.setLayout(new java.awt.BorderLayout());
                SalesPerWeek.removeAll();
                SalesPerWeek.add(new ChartPanel(weekChart), java.awt.BorderLayout.CENTER);
                SalesPerWeek.validate();
            }

            // --- MONTHLY SALES PIE CHART ---
            String sqlMonth = "SELECT YEAR(OrderDate) as year, MONTH(OrderDate) as month, SUM(TotalPrice) AS total_sales " +
                              "FROM orders GROUP BY year, month ORDER BY year, month";
            pst = conn.prepareStatement(sqlMonth);
            rst = pst.executeQuery();

            DefaultPieDataset monthDataset = new DefaultPieDataset();

            while (rst.next()) {
                int year = rst.getInt("year");
                int month = rst.getInt("month");
                double sales = rst.getDouble("total_sales");
                String label = getMonthName(month) + " " + year;
                monthDataset.setValue(label, sales);
            }

            JFreeChart monthChart = ChartFactory.createPieChart("Monthly Sales", monthDataset, true, true, false);
            SalesPerMonth.setLayout(new java.awt.BorderLayout());
            SalesPerMonth.removeAll();
            SalesPerMonth.add(new ChartPanel(monthChart), java.awt.BorderLayout.CENTER);
            SalesPerMonth.validate();

            // --- YEARLY SALES PIE CHART ---
            String sqlYear = "SELECT YEAR(OrderDate) as year, SUM(TotalPrice) AS total_sales " +
                             "FROM orders GROUP BY year ORDER BY year";
            pst = conn.prepareStatement(sqlYear);
            rst = pst.executeQuery();

            DefaultPieDataset yearDataset = new DefaultPieDataset();

            while (rst.next()) {
                int year = rst.getInt("year");
                double sales = rst.getDouble("total_sales");
                yearDataset.setValue(String.valueOf(year), sales);
            }

            JFreeChart yearChart = ChartFactory.createPieChart("Yearly Sales", yearDataset, true, true, false);
            SalesPerYear.setLayout(new java.awt.BorderLayout());
            SalesPerYear.removeAll();
            SalesPerYear.add(new ChartPanel(yearChart), java.awt.BorderLayout.CENTER);
            SalesPerYear.validate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error generating charts: " + e.getMessage());
            e.printStackTrace();
        }
    }

// Helper method
private String getMonthName(int month) {
    return java.time.Month.of(month).getDisplayName(java.time.format.TextStyle.FULL, java.util.Locale.ENGLISH);
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SalesPerDay = new javax.swing.JPanel();
        SalesPerMonth = new javax.swing.JPanel();
        SalesPerWeek = new javax.swing.JPanel();
        SalesPerYear = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        HomeButton1 = new javax.swing.JButton();
        ParticularDaybutton = new javax.swing.JButton();
        ParticularWeekbutton = new javax.swing.JButton();
        ParticularMonthbutton = new javax.swing.JButton();
        ParticularYearbutton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout SalesPerDayLayout = new javax.swing.GroupLayout(SalesPerDay);
        SalesPerDay.setLayout(SalesPerDayLayout);
        SalesPerDayLayout.setHorizontalGroup(
            SalesPerDayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        SalesPerDayLayout.setVerticalGroup(
            SalesPerDayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        getContentPane().add(SalesPerDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 630, 290));

        javax.swing.GroupLayout SalesPerMonthLayout = new javax.swing.GroupLayout(SalesPerMonth);
        SalesPerMonth.setLayout(SalesPerMonthLayout);
        SalesPerMonthLayout.setHorizontalGroup(
            SalesPerMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        SalesPerMonthLayout.setVerticalGroup(
            SalesPerMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        getContentPane().add(SalesPerMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 620, 290));

        javax.swing.GroupLayout SalesPerWeekLayout = new javax.swing.GroupLayout(SalesPerWeek);
        SalesPerWeek.setLayout(SalesPerWeekLayout);
        SalesPerWeekLayout.setHorizontalGroup(
            SalesPerWeekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        SalesPerWeekLayout.setVerticalGroup(
            SalesPerWeekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        getContentPane().add(SalesPerWeek, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 630, 290));

        javax.swing.GroupLayout SalesPerYearLayout = new javax.swing.GroupLayout(SalesPerYear);
        SalesPerYear.setLayout(SalesPerYearLayout);
        SalesPerYearLayout.setHorizontalGroup(
            SalesPerYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        SalesPerYearLayout.setVerticalGroup(
            SalesPerYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        getContentPane().add(SalesPerYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 620, 290));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, 20));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 340, -1, -1));

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

        ParticularDaybutton.setText("Particular Day");
        ParticularDaybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParticularDaybuttonActionPerformed(evt);
            }
        });
        getContentPane().add(ParticularDaybutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        ParticularWeekbutton.setText("Particular Week");
        ParticularWeekbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParticularWeekbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(ParticularWeekbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        ParticularMonthbutton.setText("Particular Month");
        ParticularMonthbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParticularMonthbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(ParticularMonthbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, -1, -1));

        ParticularYearbutton.setText("Particular Year");
        ParticularYearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParticularYearbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(ParticularYearbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 330, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButton1ActionPerformed
        AdminDashboard obj = new AdminDashboard();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_HomeButton1ActionPerformed

    private void ParticularDaybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParticularDaybuttonActionPerformed
        String inputDate = JOptionPane.showInputDialog(this, "Enter date (YYYY-MM-DD):");
    if (inputDate == null || inputDate.isEmpty()) return;

    String sql = "SELECT SUM(TotalPrice) AS total_sales FROM orders WHERE DATE(OrderDate) = ?";
    try {
        pst = conn.prepareStatement(sql);
        pst.setDate(1, java.sql.Date.valueOf(inputDate));
        rst = pst.executeQuery();

        if (rst.next() && rst.getDouble("total_sales") > 0) {
            double totalSales = rst.getDouble("total_sales");
            JOptionPane.showMessageDialog(this, "Total Sales on " + inputDate + ": ₱" + String.format("%,.2f", totalSales));
        } else {
            JOptionPane.showMessageDialog(this, "No sales data found for " + inputDate);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_ParticularDaybuttonActionPerformed

    private void ParticularWeekbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParticularWeekbuttonActionPerformed
       String startDateStr = JOptionPane.showInputDialog(this, "Enter start date of the week (YYYY-MM-DD):");
    String endDateStr = JOptionPane.showInputDialog(this, "Enter end date of the week (YYYY-MM-DD):");
    if (startDateStr == null || endDateStr == null || startDateStr.isEmpty() || endDateStr.isEmpty()) return;

    String sql = "SELECT SUM(TotalPrice) AS total_sales FROM orders WHERE OrderDate BETWEEN ? AND ?";
    try {
        pst = conn.prepareStatement(sql);
        pst.setDate(1, java.sql.Date.valueOf(startDateStr));
        pst.setDate(2, java.sql.Date.valueOf(endDateStr));
        rst = pst.executeQuery();

        if (rst.next() && rst.getDouble("total_sales") > 0) {
            double totalSales = rst.getDouble("total_sales");
            JOptionPane.showMessageDialog(this, "Total Sales from " + startDateStr + " to " + endDateStr + ": ₱" + String.format("%,.2f", totalSales));
        } else {
            JOptionPane.showMessageDialog(this, "No sales data found for the selected week.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_ParticularWeekbuttonActionPerformed

    private void ParticularMonthbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParticularMonthbuttonActionPerformed
         String inputYear = JOptionPane.showInputDialog(this, "Enter year (e.g., 2024):");
    String inputMonth = JOptionPane.showInputDialog(this, "Enter month (1-12):");

    if (inputYear == null || inputMonth == null || inputYear.isEmpty() || inputMonth.isEmpty()) return;

    String sql = "SELECT SUM(TotalPrice) AS total_sales FROM orders WHERE YEAR(OrderDate) = ? AND MONTH(OrderDate) = ?";
    try {
        pst = conn.prepareStatement(sql);
        pst.setInt(1, Integer.parseInt(inputYear));
        pst.setInt(2, Integer.parseInt(inputMonth));
        rst = pst.executeQuery();

        if (rst.next() && rst.getDouble("total_sales") > 0) {
            double totalSales = rst.getDouble("total_sales");
            JOptionPane.showMessageDialog(this, "Total Sales for " + getMonthName(Integer.parseInt(inputMonth)) + " " + inputYear + ": ₱" + String.format("%,.2f", totalSales));
        } else {
            JOptionPane.showMessageDialog(this, "No sales data found for that month.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_ParticularMonthbuttonActionPerformed

    private void ParticularYearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParticularYearbuttonActionPerformed
        String inputYear = JOptionPane.showInputDialog(this, "Enter year (e.g., 2024):");
    if (inputYear == null || inputYear.isEmpty()) return;

    String sql = "SELECT SUM(TotalPrice) AS total_sales FROM orders WHERE YEAR(OrderDate) = ?";
    try {
        pst = conn.prepareStatement(sql);
        pst.setInt(1, Integer.parseInt(inputYear));
        rst = pst.executeQuery();

        if (rst.next() && rst.getDouble("total_sales") > 0) {
            double totalSales = rst.getDouble("total_sales");
            JOptionPane.showMessageDialog(this, "Total Sales for " + inputYear + ": ₱" + String.format("%,.2f", totalSales));
        } else {
            JOptionPane.showMessageDialog(this, "No sales data found for that year.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_ParticularYearbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(SalesDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeButton1;
    private javax.swing.JButton ParticularDaybutton;
    private javax.swing.JButton ParticularMonthbutton;
    private javax.swing.JButton ParticularWeekbutton;
    private javax.swing.JButton ParticularYearbutton;
    private javax.swing.JPanel SalesPerDay;
    private javax.swing.JPanel SalesPerMonth;
    private javax.swing.JPanel SalesPerWeek;
    private javax.swing.JPanel SalesPerYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
