/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3.Reports;

import cssd_assignment_3.Route;
import cssd_assignment_3.Vehicle;
import java.time.LocalTime;
import java.util.*;

/**
 *
 * @author Ascendant
 */
public class Report {
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
    
    public boolean open() {
        return true;
    }
    
    public Report getRouteReport(int type, Route route, Date period) {
        return null;
    }
    
    public Report getRegionReport(int type, String region /*no idea what this is*/, Date period) {
        return null;
    }
}
