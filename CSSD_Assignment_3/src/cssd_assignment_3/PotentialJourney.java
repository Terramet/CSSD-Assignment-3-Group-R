/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import java.util.Date;

public class PotentialJourney {
    
    public PotentialJourney(Route route, Location beginLoc, Location endLoc, Date startDate, Date endDate) {
        this.beginLoc = beginLoc;
        this.endLoc = endLoc;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public Location GetBeginLocation() {
        return beginLoc;
    }
    
    public Location GetEndLocation() {
        return endLoc;
    }
    
    public Date GetStartDate(){
        return startDate;
    }

    public Date GetEndDate(){
        return startDate;
    }
    
    public Route getRoute(){
        return route;
    }
 
    private Route route;
    private Location beginLoc;
    private Location endLoc;
    private Date startDate;
    private Date endDate;
}
