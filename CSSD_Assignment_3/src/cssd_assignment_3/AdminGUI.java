/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

/**
 *
 * @author Ascendant
 */
public class AdminGUI extends javax.swing.JFrame {

    /**
     * Creates new form StationTerminalForm
     */
    public AdminGUI() {
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

        tabsHomePage = new javax.swing.JTabbedPane();
        pnlNews = new javax.swing.JPanel();
        pnlAccount = new javax.swing.JPanel();
        pnlReports = new javax.swing.JPanel();
        tabsReports = new javax.swing.JTabbedPane();
        pnlMaintenance = new javax.swing.JPanel();
        txtMainCosts = new javax.swing.JTextField();
        txtBreakCosts = new javax.swing.JTextField();
        txtExpensiveVehicles = new javax.swing.JTextField();
        txtCheapVehicles = new javax.swing.JTextField();
        btnPrintMaintenanceReport = new javax.swing.JButton();
        lblMaintenanceCosts = new javax.swing.JLabel();
        lblBreakdownCosts = new javax.swing.JLabel();
        lblMostExpensiveVehicles = new javax.swing.JLabel();
        lblCheapestVehicles = new javax.swing.JLabel();
        pnlCapacity = new javax.swing.JPanel();
        btnPrintCapacityReport = new javax.swing.JButton();
        lblOfTramsFull = new javax.swing.JLabel();
        txtTramsFull = new javax.swing.JTextField();
        txtTrainsFull = new javax.swing.JTextField();
        lblOfTrainsFull = new javax.swing.JLabel();
        lblOfBusesFull = new javax.swing.JLabel();
        txtBusesFull = new javax.swing.JTextField();
        pnlFinance = new javax.swing.JPanel();
        txtProfitLoss = new javax.swing.JTextField();
        lblProfitLoss = new javax.swing.JLabel();
        btnPrintFinanceReport = new javax.swing.JButton();
        pnlIncidents = new javax.swing.JPanel();
        btnPrintIncidentsReport = new javax.swing.JButton();
        lblUnsociableReports = new javax.swing.JLabel();
        txtUnsociableReports = new javax.swing.JTextField();
        lblIncidentReports = new javax.swing.JLabel();
        txtIncidentReports = new javax.swing.JTextField();
        lblDriversAccidentReports = new javax.swing.JLabel();
        txtDriversAccidentReports = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pnlFareEvasion = new javax.swing.JPanel();
        txtNumberOfEvadersCaught = new javax.swing.JTextField();
        txtRevenueRecovered = new javax.swing.JTextField();
        txtRevenueLost = new javax.swing.JTextField();
        lblRevenueLost = new javax.swing.JLabel();
        lblRevenueRecovered = new javax.swing.JLabel();
        lblOfBusesFull1 = new javax.swing.JLabel();
        btnPrintFareEvasionReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabsHomePage.setName(""); // NOI18N

        javax.swing.GroupLayout pnlNewsLayout = new javax.swing.GroupLayout(pnlNews);
        pnlNews.setLayout(pnlNewsLayout);
        pnlNewsLayout.setHorizontalGroup(
            pnlNewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        pnlNewsLayout.setVerticalGroup(
            pnlNewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        tabsHomePage.addTab("News", pnlNews);

        javax.swing.GroupLayout pnlAccountLayout = new javax.swing.GroupLayout(pnlAccount);
        pnlAccount.setLayout(pnlAccountLayout);
        pnlAccountLayout.setHorizontalGroup(
            pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        pnlAccountLayout.setVerticalGroup(
            pnlAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        tabsHomePage.addTab("Accounts", pnlAccount);

        txtMainCosts.setEditable(false);
        txtMainCosts.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMainCosts.setText("£");

        txtBreakCosts.setEditable(false);
        txtBreakCosts.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBreakCosts.setText("£");

        txtExpensiveVehicles.setEditable(false);
        txtExpensiveVehicles.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtExpensiveVehicles.setText("????????");

        txtCheapVehicles.setEditable(false);
        txtCheapVehicles.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCheapVehicles.setText("????????");

        btnPrintMaintenanceReport.setText("PRINT REPORT");

        lblMaintenanceCosts.setText("Maintenance Costs");

        lblBreakdownCosts.setText("Breakdown Costs");

        lblMostExpensiveVehicles.setText("Most Expensive Vehicles");

        lblCheapestVehicles.setText("Cheapest Vehicles");

        javax.swing.GroupLayout pnlMaintenanceLayout = new javax.swing.GroupLayout(pnlMaintenance);
        pnlMaintenance.setLayout(pnlMaintenanceLayout);
        pnlMaintenanceLayout.setHorizontalGroup(
            pnlMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMaintenanceLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(btnPrintMaintenanceReport, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMaintenanceLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(pnlMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMainCosts)
                    .addComponent(txtBreakCosts)
                    .addComponent(txtExpensiveVehicles)
                    .addComponent(txtCheapVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaintenanceCosts)
                    .addComponent(lblBreakdownCosts)
                    .addComponent(lblMostExpensiveVehicles)
                    .addComponent(lblCheapestVehicles))
                .addGap(55, 55, 55))
        );
        pnlMaintenanceLayout.setVerticalGroup(
            pnlMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMaintenanceLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(pnlMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMainCosts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaintenanceCosts))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBreakCosts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBreakdownCosts))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExpensiveVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMostExpensiveVehicles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCheapVehicles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCheapestVehicles))
                .addGap(18, 18, 18)
                .addComponent(btnPrintMaintenanceReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        tabsReports.addTab("Maintenance", pnlMaintenance);

        btnPrintCapacityReport.setText("PRINT REPORT");
        btnPrintCapacityReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintCapacityReportActionPerformed(evt);
            }
        });

        lblOfTramsFull.setText("of trams full");

        txtTramsFull.setEditable(false);
        txtTramsFull.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTramsFull.setText("%");

        txtTrainsFull.setEditable(false);
        txtTrainsFull.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTrainsFull.setText("%");

        lblOfTrainsFull.setText("of trains full");

        lblOfBusesFull.setText("of buses full");

        txtBusesFull.setEditable(false);
        txtBusesFull.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBusesFull.setText("%");

        javax.swing.GroupLayout pnlCapacityLayout = new javax.swing.GroupLayout(pnlCapacity);
        pnlCapacity.setLayout(pnlCapacityLayout);
        pnlCapacityLayout.setHorizontalGroup(
            pnlCapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapacityLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(btnPrintCapacityReport, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCapacityLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(pnlCapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBusesFull)
                    .addComponent(txtTrainsFull)
                    .addComponent(txtTramsFull, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlCapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOfBusesFull)
                    .addComponent(lblOfTrainsFull)
                    .addComponent(lblOfTramsFull))
                .addGap(104, 104, 104))
        );
        pnlCapacityLayout.setVerticalGroup(
            pnlCapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapacityLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(pnlCapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusesFull, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOfBusesFull))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTrainsFull, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOfTrainsFull))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCapacityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTramsFull, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOfTramsFull))
                .addGap(41, 41, 41)
                .addComponent(btnPrintCapacityReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        tabsReports.addTab("Capacity", pnlCapacity);

        txtProfitLoss.setEditable(false);
        txtProfitLoss.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProfitLoss.setText("£");

        lblProfitLoss.setText("Profit / Loss");

        btnPrintFinanceReport.setText("PRINT REPORT");

        javax.swing.GroupLayout pnlFinanceLayout = new javax.swing.GroupLayout(pnlFinance);
        pnlFinance.setLayout(pnlFinanceLayout);
        pnlFinanceLayout.setHorizontalGroup(
            pnlFinanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFinanceLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(txtProfitLoss, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblProfitLoss)
                .addGap(107, 107, 107))
            .addGroup(pnlFinanceLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(btnPrintFinanceReport, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFinanceLayout.setVerticalGroup(
            pnlFinanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFinanceLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(pnlFinanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProfitLoss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProfitLoss))
                .addGap(100, 100, 100)
                .addComponent(btnPrintFinanceReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        tabsReports.addTab("Finance", pnlFinance);

        btnPrintIncidentsReport.setText("PRINT REPORT");

        lblUnsociableReports.setText("Unsociable Reports");

        lblIncidentReports.setText("Incident Reports");

        lblDriversAccidentReports.setText("Drivers Accident Reports");

        jButton1.setText("Get drivers report");

        javax.swing.GroupLayout pnlIncidentsLayout = new javax.swing.GroupLayout(pnlIncidents);
        pnlIncidents.setLayout(pnlIncidentsLayout);
        pnlIncidentsLayout.setHorizontalGroup(
            pnlIncidentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIncidentsLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(pnlIncidentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlIncidentsLayout.createSequentialGroup()
                        .addComponent(txtDriversAccidentReports)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(pnlIncidentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDriversAccidentReports)
                        .addComponent(lblUnsociableReports)
                        .addComponent(txtUnsociableReports, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIncidentReports)
                        .addComponent(txtIncidentReports, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(pnlIncidentsLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(btnPrintIncidentsReport, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlIncidentsLayout.setVerticalGroup(
            pnlIncidentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIncidentsLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblUnsociableReports)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUnsociableReports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIncidentReports)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIncidentReports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDriversAccidentReports)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlIncidentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDriversAccidentReports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrintIncidentsReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        tabsReports.addTab("Incidents", pnlIncidents);

        txtNumberOfEvadersCaught.setEditable(false);
        txtNumberOfEvadersCaught.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumberOfEvadersCaught.setText("#");

        txtRevenueRecovered.setEditable(false);
        txtRevenueRecovered.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRevenueRecovered.setText("£");

        txtRevenueLost.setEditable(false);
        txtRevenueLost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRevenueLost.setText("£");

        lblRevenueLost.setText("Revenue Lost");

        lblRevenueRecovered.setText("Revenue Recovered");

        lblOfBusesFull1.setText("Number Of Evaders Caught");

        btnPrintFareEvasionReport.setText("PRINT REPORT");
        btnPrintFareEvasionReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintFareEvasionReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFareEvasionLayout = new javax.swing.GroupLayout(pnlFareEvasion);
        pnlFareEvasion.setLayout(pnlFareEvasionLayout);
        pnlFareEvasionLayout.setHorizontalGroup(
            pnlFareEvasionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFareEvasionLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(btnPrintFareEvasionReport, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFareEvasionLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(pnlFareEvasionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumberOfEvadersCaught)
                    .addComponent(txtRevenueRecovered)
                    .addComponent(txtRevenueLost, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFareEvasionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOfBusesFull1)
                    .addComponent(lblRevenueRecovered)
                    .addComponent(lblRevenueLost))
                .addGap(48, 48, 48))
        );
        pnlFareEvasionLayout.setVerticalGroup(
            pnlFareEvasionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFareEvasionLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(pnlFareEvasionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumberOfEvadersCaught, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOfBusesFull1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFareEvasionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRevenueRecovered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRevenueRecovered))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFareEvasionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRevenueLost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRevenueLost))
                .addGap(35, 35, 35)
                .addComponent(btnPrintFareEvasionReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        tabsReports.addTab("FareEvasion", pnlFareEvasion);

        javax.swing.GroupLayout pnlReportsLayout = new javax.swing.GroupLayout(pnlReports);
        pnlReports.setLayout(pnlReportsLayout);
        pnlReportsLayout.setHorizontalGroup(
            pnlReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabsReports, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );
        pnlReportsLayout.setVerticalGroup(
            pnlReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabsReports)
        );

        tabsHomePage.addTab("Reports", pnlReports);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabsHomePage)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabsHomePage)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintCapacityReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintCapacityReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintCapacityReportActionPerformed

    private void btnPrintFareEvasionReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintFareEvasionReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintFareEvasionReportActionPerformed

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
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrintCapacityReport;
    private javax.swing.JButton btnPrintFareEvasionReport;
    private javax.swing.JButton btnPrintFinanceReport;
    private javax.swing.JButton btnPrintIncidentsReport;
    private javax.swing.JButton btnPrintMaintenanceReport;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblBreakdownCosts;
    private javax.swing.JLabel lblCheapestVehicles;
    private javax.swing.JLabel lblDriversAccidentReports;
    private javax.swing.JLabel lblIncidentReports;
    private javax.swing.JLabel lblMaintenanceCosts;
    private javax.swing.JLabel lblMostExpensiveVehicles;
    private javax.swing.JLabel lblOfBusesFull;
    private javax.swing.JLabel lblOfBusesFull1;
    private javax.swing.JLabel lblOfTrainsFull;
    private javax.swing.JLabel lblOfTramsFull;
    private javax.swing.JLabel lblProfitLoss;
    private javax.swing.JLabel lblRevenueLost;
    private javax.swing.JLabel lblRevenueRecovered;
    private javax.swing.JLabel lblUnsociableReports;
    private javax.swing.JPanel pnlAccount;
    private javax.swing.JPanel pnlCapacity;
    private javax.swing.JPanel pnlFareEvasion;
    private javax.swing.JPanel pnlFinance;
    private javax.swing.JPanel pnlIncidents;
    private javax.swing.JPanel pnlMaintenance;
    private javax.swing.JPanel pnlNews;
    private javax.swing.JPanel pnlReports;
    private javax.swing.JTabbedPane tabsHomePage;
    private javax.swing.JTabbedPane tabsReports;
    private javax.swing.JTextField txtBreakCosts;
    private javax.swing.JTextField txtBusesFull;
    private javax.swing.JTextField txtCheapVehicles;
    private javax.swing.JTextField txtDriversAccidentReports;
    private javax.swing.JTextField txtExpensiveVehicles;
    private javax.swing.JTextField txtIncidentReports;
    private javax.swing.JTextField txtMainCosts;
    private javax.swing.JTextField txtNumberOfEvadersCaught;
    private javax.swing.JTextField txtProfitLoss;
    private javax.swing.JTextField txtRevenueLost;
    private javax.swing.JTextField txtRevenueRecovered;
    private javax.swing.JTextField txtTrainsFull;
    private javax.swing.JTextField txtTramsFull;
    private javax.swing.JTextField txtUnsociableReports;
    // End of variables declaration//GEN-END:variables
}
