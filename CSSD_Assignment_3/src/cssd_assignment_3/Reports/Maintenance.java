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
public class Maintenance extends Report{
    private int noOfBreakDowns;
    
    //it is possible to create one fo these reports but none of its fucntions are implemented because of time constraints
    public Maintenance(int nOBD,String name, int type, Date sD, Date eD, LocalTime sT, LocalTime eT, Route route, Vehicle v) {
        super(name, type, sD, eD, sT, eT, route, v);
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
