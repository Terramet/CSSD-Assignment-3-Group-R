/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3.Reports;

import java.time.LocalTime;

/**
 *
 * @author Ascendant
 */
public class Capacity {
    private int daysVehicleAtCapacity;
    private int daysVehicleEmpty;
    
    public Capacity(int dVAC, int dVE) {
        super();
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
