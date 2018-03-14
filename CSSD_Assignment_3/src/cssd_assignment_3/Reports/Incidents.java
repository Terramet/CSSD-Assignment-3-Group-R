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
public class Incidents extends Report{
    private int timesPoliceCalledOnRoute;
    private int noMinorAccidents;
    private int noSeriousAccidents;
    
    //it is possible to create one fo these reports but none of its fucntions are implemented because of time constraints
    public Incidents(String name, int type, Date sD, Date eD, LocalTime sT, LocalTime eT, Route route, Vehicle v) {
        super(name, type, sD, eD, sT, eT, route, v);
    }
    
    //Where does this come from?
    public String getAntiSocialDetails() {
        return null;
    }
    
    //Where does this come from?
    public String getAccidentDetails() {
        return null;
    }
    
    //Where does this come from?
    public String getDriverAccidentDetails() {
        return null;
    }
    
    //Ok seriously, we don't store driver details...
    public String getSpecificDriverAccidentHistory() {
        return null;
    }
}
