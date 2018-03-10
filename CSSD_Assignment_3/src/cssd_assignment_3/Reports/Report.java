/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3.Reports;

import cssd_assignment_3.Route;
import cssd_assignment_3.Vehicle;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.*;

/**
 *
 * @author Ascendant
 */
public class Report implements Serializable{
    /*
        Renamed timeStart and timeEnd to startTime and endTime for consistency
    */
    private String name;
    private int type;
    private Date startDate;
    private Date endDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private Route route;
    private Vehicle vehicle;
    
    public Report(String name, int type, Date sD, Date eD, LocalTime sT, LocalTime eT, Route route, Vehicle v)  {
        this.name = name;
        this.type = type;
        this.startDate = sD;
        this.endDate = eD;
        this.startTime = sT;
        this.endTime = eT;
        this.route = route;
        this.vehicle = v;
    }

    Report() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean open() {
        return true;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getType() {
        return this.type;
    }
    
    public Date getStartDate(){
        return this.startDate;
    }
    
    public Date getEndDate(){
        return this.endDate;
    }
    
    public Route getRoute(){
        return this.route;
    }
    
    public Vehicle getVehicle(){
        return this.vehicle;
    }
    
    public Report getRouteReport(int type, Route route, Date period) {
        return null;
    }
    
    public Report getRegionReport(int type, String region /*no idea what this is*/, Date period) {
        return null;
    }
}
