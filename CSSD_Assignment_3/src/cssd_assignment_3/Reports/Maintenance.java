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
public class Maintenance {
    private int noOfBreakDowns;
    
    public Maintenance(int nOBD) {
        super();
        this.noOfBreakDowns = nOBD;
    }
    
    public double getHowMuchMaintenanceHasCost() {
        return -1;
    }
    
    public double getHowMuchBreakDownsHaveCost() {
        return -1;
    }
    
    // Vehicle's' so shouldn't this be a list of them?
    public String getMostExpensiveVehicles() {
        return null;
    }
    
    public String getCheapestVehicles() {
        return null;
    }
}
