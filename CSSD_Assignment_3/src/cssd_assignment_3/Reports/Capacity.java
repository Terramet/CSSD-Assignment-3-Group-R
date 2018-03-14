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
public class Capacity extends Report{
    private int daysVehicleAtCapacity;
    private int daysVehicleEmpty;
    
    //it is possible to create one fo these reports but none of its fucntions are implemented because of time constraints
    public Capacity(int dVAC, int dVE,String name, int type, Date sD, Date eD, LocalTime sT, LocalTime eT, Route route, Vehicle v) {
        super(name, type, sD, eD, sT, eT, route, v);
        this.daysVehicleAtCapacity = dVAC;
        this.daysVehicleEmpty = dVE;
    }
    
    public int getHowManyDaysVehicleAtCapacity(LocalTime time) {
        return daysVehicleAtCapacity;
    }
    
    public int getHowManyDaysVehicleEmpty(LocalTime time) {
        return daysVehicleEmpty;
    }
}
