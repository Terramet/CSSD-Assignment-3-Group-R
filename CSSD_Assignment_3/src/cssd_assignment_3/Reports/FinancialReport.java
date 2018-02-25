/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3.Reports;

/**
 *
 * @author Ascendant
 */
public class FinancialReport extends Report {
    private double routeProfitLoss;
    
    public FinancialReport(double rPL) {
        super();
        
        this.routeProfitLoss = rPL;
    }
    
    public double getProfitLoss() {
        return routeProfitLoss;
    }
}
