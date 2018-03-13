/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3.Reports;

import cssd_assignment_3.Route;
import cssd_assignment_3.Vehicle;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author Ascendant
 */
public class FinancialReport extends Report {
    private double routeProfitLoss;
    
    public FinancialReport(double rPL,String name, int type, Date sD, Date eD, LocalTime sT, LocalTime eT, Route route, Vehicle v) {
        super(name, type, sD, eD, sT, eT, route, v);     
        this.routeProfitLoss = rPL;
    }
    
    public double getProfitLoss() {
        return routeProfitLoss;
    }
}
